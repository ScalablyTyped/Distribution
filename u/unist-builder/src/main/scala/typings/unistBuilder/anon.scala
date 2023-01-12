package typings.unistBuilder

import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[T /* <: String */, C /* <: js.Array[Node[Data]] */] extends StObject {
    
    var children: C
    
    var `type`: T
  }
  object Children {
    
    inline def apply[T /* <: String */, C /* <: js.Array[Node[Data]] */](children: C, `type`: T): Children[T, C] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children[T, C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children[?, ?], T /* <: String */, C /* <: js.Array[Node[Data]] */] (val x: Self & (Children[T, C])) extends AnyVal {
      
      inline def setChildren(value: C): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type[T /* <: String */] extends StObject {
    
    var `type`: T
    
    var value: String
  }
  object Type {
    
    inline def apply[T /* <: String */](`type`: T, value: String): Type[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type[?], T /* <: String */] (val x: Self & Type[T]) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeT[T /* <: String */] extends StObject {
    
    var `type`: T
  }
  object TypeT {
    
    inline def apply[T /* <: String */](`type`: T): TypeT[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeT[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeT[?], T /* <: String */] (val x: Self & TypeT[T]) extends AnyVal {
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
