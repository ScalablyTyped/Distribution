package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputMode extends js.Object
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputMode")
@js.native
object InputMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputMode with Double] = js.native
  
  /**
    * Checkbox should be shown(for true/false values)
    */
  @js.native
  sealed trait CheckBox extends InputMode
  /* 50 */ @js.native
  object CheckBox extends TopLevel[CheckBox with Double]
  
  /**
    * A select/combo control should be shown
    */
  @js.native
  sealed trait Combo extends InputMode
  /* 30 */ @js.native
  object Combo extends TopLevel[Combo with Double]
  
  /**
    * This input should not be shown in the UI
    */
  @js.native
  sealed trait None extends InputMode
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * An password input box should be shown
    */
  @js.native
  sealed trait PasswordBox extends InputMode
  /* 20 */ @js.native
  object PasswordBox extends TopLevel[PasswordBox with Double]
  
  /**
    * Radio buttons should be shown
    */
  @js.native
  sealed trait RadioButtons extends InputMode
  /* 40 */ @js.native
  object RadioButtons extends TopLevel[RadioButtons with Double]
  
  /**
    * A multi-line text area should be shown
    */
  @js.native
  sealed trait TextArea extends InputMode
  /* 60 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
  
  /**
    * An input text box should be shown
    */
  @js.native
  sealed trait TextBox extends InputMode
  /* 10 */ @js.native
  object TextBox extends TopLevel[TextBox with Double]
}
