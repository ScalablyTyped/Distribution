package typings
package vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod

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
  sealed trait CheckBox
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /**
       * A select/combo control should be shown
       */
  @js.native
  sealed trait Combo
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /**
       * This input should not be shown in the UI
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /**
       * An password input box should be shown
       */
  @js.native
  sealed trait PasswordBox
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /**
       * Radio buttons should be shown
       */
  @js.native
  sealed trait RadioButtons
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /**
       * A multi-line text area should be shown
       */
  @js.native
  sealed trait TextArea
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /**
       * An input text box should be shown
       */
  @js.native
  sealed trait TextBox
    extends vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode
  
  /* 50 */ val CheckBox: CheckBox with scala.Double = js.native
  /* 30 */ val Combo: Combo with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 20 */ val PasswordBox: PasswordBox with scala.Double = js.native
  /* 40 */ val RadioButtons: RadioButtons with scala.Double = js.native
  /* 60 */ val TextArea: TextArea with scala.Double = js.native
  /* 10 */ val TextBox: TextBox with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputMode with scala.Double
  ] = js.native
}

