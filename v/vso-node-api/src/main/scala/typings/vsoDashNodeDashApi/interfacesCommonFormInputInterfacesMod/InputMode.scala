package typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod

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
  
  /* 50 */ val CheckBox: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.CheckBox with Double = js.native
  /* 30 */ val Combo: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.Combo with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.None with Double = js.native
  /* 20 */ val PasswordBox: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.PasswordBox with Double = js.native
  /* 40 */ val RadioButtons: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.RadioButtons with Double = js.native
  /* 60 */ val TextArea: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.TextArea with Double = js.native
  /* 10 */ val TextBox: typings.vsoDashNodeDashApi.interfacesCommonFormInputInterfacesMod.InputMode.TextBox with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputMode with Double] = js.native
}

