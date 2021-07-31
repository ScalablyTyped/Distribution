package typings.wixStyleReact

import typings.moment.mod.Moment
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.inputMod.InputStatus
import typings.wixStyleReact.wixStyleReactStrings.`100Percentsign`
import typings.wixStyleReact.wixStyleReactStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeInputMod {
  
  @JSImport("wix-style-react/dist/es/src/TimeInput", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[TimeInputProps, js.Object, js.Any]
  
  type TimeInput = PureComponent[TimeInputProps, js.Object, js.Any]
  
  trait TimeInputProps extends StObject {
    
    var customSuffix: js.UndefOr[ReactNode] = js.undefined
    
    var dashesWhenDisabled: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Moment] = js.undefined
    
    var disableAmPm: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hideStatusSuffix: js.UndefOr[Boolean] = js.undefined
    
    var minutesStep: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* time */ Moment, Unit]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var showSeconds: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var width: js.UndefOr[auto | `100Percentsign`] = js.undefined
  }
  object TimeInputProps {
    
    @scala.inline
    def apply(): TimeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeInputProps]
    }
    
    @scala.inline
    implicit class TimeInputPropsMutableBuilder[Self <: TimeInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomSuffix(value: ReactNode): Self = StObject.set(x, "customSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSuffixUndefined: Self = StObject.set(x, "customSuffix", js.undefined)
      
      @scala.inline
      def setDashesWhenDisabled(value: Boolean): Self = StObject.set(x, "dashesWhenDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashesWhenDisabledUndefined: Self = StObject.set(x, "dashesWhenDisabled", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Moment): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisableAmPm(value: Boolean): Self = StObject.set(x, "disableAmPm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAmPmUndefined: Self = StObject.set(x, "disableAmPm", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideStatusSuffix(value: Boolean): Self = StObject.set(x, "hideStatusSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideStatusSuffixUndefined: Self = StObject.set(x, "hideStatusSuffix", js.undefined)
      
      @scala.inline
      def setMinutesStep(value: Double): Self = StObject.set(x, "minutesStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesStepUndefined: Self = StObject.set(x, "minutesStep", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* time */ Moment => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
      
      @scala.inline
      def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: auto | `100Percentsign`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
