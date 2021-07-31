package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLinearProgressBarLinearProgressBarMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/linear-progress-bar/LinearProgressBar", "LinearProgressBar")
  @js.native
  val LinearProgressBar: FunctionComponent[LinearProgressBarProps] = js.native
  
  trait LinearProgressBarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Applied as data-hook HTML attribute that can be used to create driver in testing */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** should be true if had failure during the progress */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** an indication icon (any react component) that will be presented when 'error' and 'showProgressIndication' are set to true */
    var errorIcon: js.UndefOr[Element] = js.undefined
    
    /** maximum value for progress bar, default value: 100 */
    var max: js.UndefOr[Double] = js.undefined
    
    /** minimum value for progress bar, default value: 0 */
    var min: js.UndefOr[Double] = js.undefined
    
    /** Number of decimal points to keep when normalizing value */
    var precision: js.UndefOr[Double] = js.undefined
    
    /** when set to true, an indication of the progress state will be presented along side the progress bar */
    var showProgressIndication: js.UndefOr[Boolean] = js.undefined
    
    /** an indication icon (any react component) that will be presented when 'showProgressIndication' are set to true and 'value' is equal or bigger than 'max' */
    var successIcon: js.UndefOr[Element] = js.undefined
    
    /** represent the progress state in percentages (min || 0 - no progress, max || 100 - progress completed) */
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object LinearProgressBarProps {
    
    @scala.inline
    def apply(): LinearProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinearProgressBarProps]
    }
    
    @scala.inline
    implicit class LinearProgressBarPropsMutableBuilder[Self <: LinearProgressBarProps] (val x: Self) extends AnyVal {
      
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
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setShowProgressIndication(value: Boolean): Self = StObject.set(x, "showProgressIndication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProgressIndicationUndefined: Self = StObject.set(x, "showProgressIndication", js.undefined)
      
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
