package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarMod {
  
  @JSImport("wix-style-react/dist/es/src/CircularProgressBar", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CircularProgressBarProps, js.Object, js.Any]
  
  type CircularProgressBar = PureComponent[CircularProgressBarProps, js.Object, js.Any]
  
  trait CircularProgressBarProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errorLabel: js.UndefOr[String] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var showProgressIndication: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[CircularProgressBarSize] = js.undefined
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object CircularProgressBarProps {
    
    @scala.inline
    def apply(): CircularProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularProgressBarProps]
    }
    
    @scala.inline
    implicit class CircularProgressBarPropsMutableBuilder[Self <: CircularProgressBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLabel(value: String): Self = StObject.set(x, "errorLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLabelUndefined: Self = StObject.set(x, "errorLabel", js.undefined)
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      @scala.inline
      def setShowProgressIndication(value: Boolean): Self = StObject.set(x, "showProgressIndication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProgressIndicationUndefined: Self = StObject.set(x, "showProgressIndication", js.undefined)
      
      @scala.inline
      def setSize(value: CircularProgressBarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait CircularProgressBarSize extends StObject
  object CircularProgressBarSize {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
