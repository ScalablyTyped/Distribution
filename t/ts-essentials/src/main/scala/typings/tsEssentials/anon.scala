package typings.tsEssentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TYPE[K] extends StObject {
    
    var __TYPE__ : K = js.native
  }
  object TYPE {
    
    @scala.inline
    def apply[K](__TYPE__ : K): TYPE[K] = {
      val __obj = js.Dynamic.literal(__TYPE__ = __TYPE__.asInstanceOf[js.Any])
      __obj.asInstanceOf[TYPE[K]]
    }
    
    @scala.inline
    implicit class TYPEMutableBuilder[Self <: TYPE[_], K] (val x: Self with TYPE[K]) extends AnyVal {
      
      @scala.inline
      def set__TYPE__(value: K): Self = StObject.set(x, "__TYPE__", value.asInstanceOf[js.Any])
    }
  }
}
