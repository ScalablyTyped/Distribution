package typings.typescriptOptional

import typings.typescriptOptional.typescriptOptionalStrings.empty
import typings.typescriptOptional.typescriptOptionalStrings.present
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Cases[T, U] extends StObject {
    
    def empty(): U = js.native
    
    def present(value: T): U = js.native
  }
  object Cases {
    
    @scala.inline
    def apply[T, U](empty: () => U, present: T => U): Cases[T, U] = {
      val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), present = js.Any.fromFunction1(present))
      __obj.asInstanceOf[Cases[T, U]]
    }
    
    @scala.inline
    implicit class CasesMutableBuilder[Self <: Cases[_, _], T, U] (val x: Self with (Cases[T, U])) extends AnyVal {
      
      @scala.inline
      def setEmpty(value: () => U): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPresent(value: T => U): Self = StObject.set(x, "present", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Empty[T] extends Option[T] {
    
    var kind: empty = js.native
  }
  object Empty {
    
    @scala.inline
    def apply[T](kind: empty): Empty[T] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty[T]]
    }
    
    @scala.inline
    implicit class EmptyMutableBuilder[Self <: Empty[_], T] (val x: Self with Empty[T]) extends AnyVal {
      
      @scala.inline
      def setKind(value: empty): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptOptional.typesMod.Present[T]
    - typings.typescriptOptional.typesMod.Empty[T]
  */
  trait Option[T] extends StObject
  object Option {
    
    @scala.inline
    def Empty[T](kind: empty): typings.typescriptOptional.typesMod.Empty[T] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typescriptOptional.typesMod.Empty[T]]
    }
    
    @scala.inline
    def Present[T](kind: present, value: T): typings.typescriptOptional.typesMod.Present[T] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typescriptOptional.typesMod.Present[T]]
    }
  }
  
  @js.native
  trait Present[T] extends Option[T] {
    
    var kind: present = js.native
    
    var value: T = js.native
  }
  object Present {
    
    @scala.inline
    def apply[T](kind: present, value: T): Present[T] = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Present[T]]
    }
    
    @scala.inline
    implicit class PresentMutableBuilder[Self <: Present[_], T] (val x: Self with Present[T]) extends AnyVal {
      
      @scala.inline
      def setKind(value: present): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
