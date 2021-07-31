package typings.whatwgMimetype

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowParameters extends StObject {
    
    var allowParameters: js.UndefOr[Boolean] = js.undefined
  }
  object AllowParameters {
    
    @scala.inline
    def apply(): AllowParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowParameters]
    }
    
    @scala.inline
    implicit class AllowParametersMutableBuilder[Self <: AllowParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowParameters(value: Boolean): Self = StObject.set(x, "allowParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowParametersUndefined: Self = StObject.set(x, "allowParameters", js.undefined)
    }
  }
}
