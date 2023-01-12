package typings.twoJs

import typings.twoJs.mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Left extends StObject {
    
    var left: Vector
    
    var right: Vector
  }
  object Left {
    
    inline def apply(left: Vector, right: Vector): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Vector): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Vector): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
