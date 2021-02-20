package typings.urlToolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlwaysNormalize extends StObject {
    
    var alwaysNormalize: js.UndefOr[Boolean] = js.native
  }
  object AlwaysNormalize {
    
    @scala.inline
    def apply(): AlwaysNormalize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysNormalize]
    }
    
    @scala.inline
    implicit class AlwaysNormalizeMutableBuilder[Self <: AlwaysNormalize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysNormalize(value: Boolean): Self = StObject.set(x, "alwaysNormalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysNormalizeUndefined: Self = StObject.set(x, "alwaysNormalize", js.undefined)
    }
  }
}
