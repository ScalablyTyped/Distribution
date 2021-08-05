package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.wixStyleReactStrings.standard
import typings.wixStyleReact.wixStyleReactStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressBarMod {
  
  @JSImport("wix-style-react/dist/es/src/LinearProgressBar", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[LinearProgressBarProps, js.Object, js.Any]
  
  type LinearProgressBar = PureComponent[LinearProgressBarProps, js.Object, js.Any]
  
  trait LinearProgressBarProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var showProgressIndication: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[standard | success] = js.undefined
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object LinearProgressBarProps {
    
    inline def apply(): LinearProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinearProgressBarProps]
    }
    
    extension [Self <: LinearProgressBarProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setShowProgressIndication(value: Boolean): Self = StObject.set(x, "showProgressIndication", value.asInstanceOf[js.Any])
      
      inline def setShowProgressIndicationUndefined: Self = StObject.set(x, "showProgressIndication", js.undefined)
      
      inline def setSkin(value: standard | success): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
