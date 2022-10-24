package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/LinearProgressBar/LinearProgressBarCore/LinearProgressBarCore", JSImport.Default)
  @js.native
  val default: FunctionComponent[LinearProgressBarProps] = js.native
  
  trait LinearProgressBarProps extends StObject {
    
    /** add aria-hidden to prefix/suffix */
    var `aria-hide-affixes`: js.UndefOr[Boolean] = js.undefined
    
    /** aria-label - Accessibility */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** A custom text for the progress bar indication. */
    var customSuffixIndicationText: js.UndefOr[String] = js.undefined
    
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
    
    /** onClick on the component */
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    /** Number of decimal points to keep when normalizing value */
    var precision: js.UndefOr[Double] = js.undefined
    
    /** A prefix node for the progress bar */
    var prefixIndication: js.UndefOr[ReactNode] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    /** when set to true, an indication of the progress state will be presented along side the progress bar */
    var showProgressIndication: js.UndefOr[Boolean] = js.undefined
    
    /** an indication icon (any react component) that will be presented when 'showProgressIndication' are set to true and 'value' is equal or bigger than 'max' */
    var successIcon: js.UndefOr[Element] = js.undefined
    
    /** represent the progress state in percentages (min || 0 - no progress, max || 100 - progress completed) */
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object LinearProgressBarProps {
    
    inline def apply(): LinearProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinearProgressBarProps]
    }
    
    extension [Self <: LinearProgressBarProps](x: Self) {
      
      inline def `setAria-hide-affixes`(value: Boolean): Self = StObject.set(x, "aria-hide-affixes", value.asInstanceOf[js.Any])
      
      inline def `setAria-hide-affixesUndefined`: Self = StObject.set(x, "aria-hide-affixes", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomSuffixIndicationText(value: String): Self = StObject.set(x, "customSuffixIndicationText", value.asInstanceOf[js.Any])
      
      inline def setCustomSuffixIndicationTextUndefined: Self = StObject.set(x, "customSuffixIndicationText", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorIcon(value: Element): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      inline def setErrorIconUndefined: Self = StObject.set(x, "errorIcon", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrefixIndication(value: ReactNode): Self = StObject.set(x, "prefixIndication", value.asInstanceOf[js.Any])
      
      inline def setPrefixIndicationUndefined: Self = StObject.set(x, "prefixIndication", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShowProgressIndication(value: Boolean): Self = StObject.set(x, "showProgressIndication", value.asInstanceOf[js.Any])
      
      inline def setShowProgressIndicationUndefined: Self = StObject.set(x, "showProgressIndication", js.undefined)
      
      inline def setSuccessIcon(value: Element): Self = StObject.set(x, "successIcon", value.asInstanceOf[js.Any])
      
      inline def setSuccessIconUndefined: Self = StObject.set(x, "successIcon", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FunctionComponent[LinearProgressBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesLinearProgressBarLinearProgressBarCoreLinearProgressBarCoreMod.foo` */
  override def _to: FunctionComponent[LinearProgressBarProps] = default
}
