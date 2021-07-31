package typings.wixUiCore

import typings.wixUiCore.anon.OnBlur
import typings.wixUiCore.radioButtonRadioButtonMod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreRadioButtonMod {
  
  @JSImport("wix-ui-core/radio-button", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends typings.wixUiCore.radioButtonMod.RadioButton {
    def this(props: RadioButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonProps, context: js.Any) = this()
  }
  /* static members */
  object RadioButton {
    
    @JSImport("wix-ui-core/radio-button", "RadioButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/radio-button", "RadioButton.bypassDefaultPropsTypecheck")
    @js.native
    def bypassDefaultPropsTypecheck: js.Any = js.native
    @scala.inline
    def bypassDefaultPropsTypecheck_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassDefaultPropsTypecheck")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/radio-button", "RadioButton.defaultProps")
    @js.native
    def defaultProps: OnBlur = js.native
    @scala.inline
    def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/radio-button", "RadioButton.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
