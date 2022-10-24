package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircularProgressBarMod {
  
  @JSImport("wix-style-react/dist/types/CircularProgressBar", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CircularProgressBarProps, js.Object, Any]
  
  type CircularProgressBar = PureComponent[CircularProgressBarProps, js.Object, Any]
  
  trait CircularProgressBarProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errorLabel: js.UndefOr[String] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var showProgressIndication: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[CircularProgressBarSize] = js.undefined
    
    var skin: js.UndefOr[CircularProgressBarSkin] = js.undefined
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object CircularProgressBarProps {
    
    inline def apply(): CircularProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularProgressBarProps]
    }
    
    extension [Self <: CircularProgressBarProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorLabel(value: String): Self = StObject.set(x, "errorLabel", value.asInstanceOf[js.Any])
      
      inline def setErrorLabelUndefined: Self = StObject.set(x, "errorLabel", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setShowProgressIndication(value: Boolean): Self = StObject.set(x, "showProgressIndication", value.asInstanceOf[js.Any])
      
      inline def setShowProgressIndicationUndefined: Self = StObject.set(x, "showProgressIndication", js.undefined)
      
      inline def setSize(value: CircularProgressBarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: CircularProgressBarSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait CircularProgressBarSize extends StObject
  object CircularProgressBarSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.success
  */
  trait CircularProgressBarSkin extends StObject
  object CircularProgressBarSkin {
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
  }
}
