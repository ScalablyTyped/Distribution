package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressBarCircularProgressBarMod {
  
  @JSImport("wix-ui-core/dist/src/components/circular-progress-bar/CircularProgressBar", "CircularProgressBar")
  @js.native
  val CircularProgressBar: FunctionComponent[CircularProgressBarProps] = js.native
  
  trait CircularProgressBarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** should be true if had failure during the progress */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** an indication icon (any react component) that will be presented when 'error' and 'showProgressIndication' are set to true */
    var errorIcon: js.UndefOr[Element] = js.undefined
    
    /** label to display when an error happens */
    var errorLabel: js.UndefOr[String] = js.undefined
    
    /** custom text to display. will replace the progress indication if provided */
    var label: js.UndefOr[String] = js.undefined
    
    /** when set to true, an indication of the progress state will be presented along side the progress bar */
    var showProgressIndication: js.UndefOr[Boolean] = js.undefined
    
    /** circle size in pixels */
    var size: js.UndefOr[Double | String] = js.undefined
    
    /** an indication icon (any react component) that will be presented when 'showProgressIndication' are set to true and 'value' is 100 */
    var successIcon: js.UndefOr[Element] = js.undefined
    
    /** represent the progress state in percentages (0 - no progress, 100 - progress completed) */
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
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIcon(value: Element): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
      
      @scala.inline
      def setErrorLabel(value: String): Self = StObject.set(x, "errorLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLabelUndefined: Self = StObject.set(x, "errorLabel", js.undefined)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setShowProgressIndication(value: Boolean): Self = StObject.set(x, "showProgressIndication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProgressIndicationUndefined: Self = StObject.set(x, "showProgressIndication", js.undefined)
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccessIcon(value: Element): Self = StObject.set(x, "successIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessIconUndefined: Self = StObject.set(x, "successIcon", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
