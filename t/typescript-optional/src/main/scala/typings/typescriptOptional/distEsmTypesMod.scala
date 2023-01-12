package typings.typescriptOptional

import typings.typescriptOptional.typescriptOptionalStrings.empty
import typings.typescriptOptional.typescriptOptionalStrings.present
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTypesMod {
  
  trait Cases[T, U] extends StObject {
    
    def empty(): U
    
    def present(value: T): U
  }
  object Cases {
    
    inline def apply[T, U](empty: () => U, present: T => U): Cases[T, U] = {
      val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), present = js.Any.fromFunction1(present))
      __obj.asInstanceOf[Cases[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cases[?, ?], T, U] (val x: Self & (Cases[T, U])) extends AnyVal {
      
      inline def setEmpty(value: () => U): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setPresent(value: T => U): Self = StObject.set(x, "present", js.Any.fromFunction1(value))
    }
  }
  
  trait Empty[T]
    extends StObject
       with Option[T] {
    
    var kind: empty
  }
  object Empty {
    
    inline def apply[T](): Empty[T] = {
      val __obj = js.Dynamic.literal(kind = "empty")
      __obj.asInstanceOf[Empty[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Empty[?], T] (val x: Self & Empty[T]) extends AnyVal {
      
      inline def setKind(value: empty): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptOptional.distEsmTypesMod.Present[T]
    - typings.typescriptOptional.distEsmTypesMod.Empty[T]
  */
  trait Option[T] extends StObject
  object Option {
    
    inline def Empty[T](): typings.typescriptOptional.distEsmTypesMod.Empty[T] = {
      val __obj = js.Dynamic.literal(kind = "empty")
      __obj.asInstanceOf[typings.typescriptOptional.distEsmTypesMod.Empty[T]]
    }
    
    inline def Present[T](value: T): typings.typescriptOptional.distEsmTypesMod.Present[T] = {
      val __obj = js.Dynamic.literal(kind = "present", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typescriptOptional.distEsmTypesMod.Present[T]]
    }
  }
  
  trait Present[T]
    extends StObject
       with Option[T] {
    
    var kind: present
    
    var value: T
  }
  object Present {
    
    inline def apply[T](value: T): Present[T] = {
      val __obj = js.Dynamic.literal(kind = "present", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Present[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Present[?], T] (val x: Self & Present[T]) extends AnyVal {
      
      inline def setKind(value: present): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
