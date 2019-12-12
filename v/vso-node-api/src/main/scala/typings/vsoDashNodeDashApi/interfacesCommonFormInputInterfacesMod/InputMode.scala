package typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.CheckBox
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.Combo
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.None
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.PasswordBox
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.RadioButtons
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.TextArea
import typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.TextBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputMode extends js.Object

@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputMode")
@js.native
object InputMode extends js.Object {
  /**
    * Checkbox should be shown(for true/false values)
    */
  @js.native
  sealed trait CheckBox extends InputMode
  
  /**
    * A select/combo control should be shown
    */
  @js.native
  sealed trait Combo extends InputMode
  
  /**
    * This input should not be shown in the UI
    */
  @js.native
  sealed trait None extends InputMode
  
  /**
    * An password input box should be shown
    */
  @js.native
  sealed trait PasswordBox extends InputMode
  
  /**
    * Radio buttons should be shown
    */
  @js.native
  sealed trait RadioButtons extends InputMode
  
  /**
    * A multi-line text area should be shown
    */
  @js.native
  sealed trait TextArea extends InputMode
  
  /**
    * An input text box should be shown
    */
  @js.native
  sealed trait TextBox extends InputMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputMode with Double] = js.native
  /* 50 */ @js.native
  object CheckBox extends TopLevel[CheckBox with Double]
  
  /* 30 */ @js.native
  object Combo extends TopLevel[Combo with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 20 */ @js.native
  object PasswordBox extends TopLevel[PasswordBox with Double]
  
  /* 40 */ @js.native
  object RadioButtons extends TopLevel[RadioButtons with Double]
  
  /* 60 */ @js.native
  object TextArea extends TopLevel[TextArea with Double]
  
  /* 10 */ @js.native
  object TextBox extends TopLevel[TextBox with Double]
  
}

