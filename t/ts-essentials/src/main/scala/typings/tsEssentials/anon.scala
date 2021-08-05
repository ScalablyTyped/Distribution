package typings.tsEssentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TYPE[K] extends StObject {
    
    var __TYPE__ : K
  }
  object TYPE {
    
    inline def apply[K](__TYPE__ : K): TYPE[K] = {
      val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
      __obj.asInstanceOf[TYPE[K]]
    }
    
    extension [Self <: TYPE[?], K](x: Self & TYPE[K]) {
      
      inline def set__TYPE__(value: K): Self = StObject.set(x, "__TYPE__", value.asInstanceOf[js.Any])
    }
  }
}
