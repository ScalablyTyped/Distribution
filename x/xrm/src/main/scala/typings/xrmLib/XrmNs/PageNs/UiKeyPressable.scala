package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for controls which methods provide immediate feedback or take actions as user types in a control.
  * Contains methods which can be used to perform data validations in a control even before the user commits (saves) the value in a form.
  * @deprecated Use {@link Xrm.Controls.UiKeyPressable} instead.
  */
trait UiKeyPressable
  extends xrmLib.XrmNs.ControlsNs.UiKeyPressable

object UiKeyPressable {
  @scala.inline
  def apply(
    addOnKeyPress: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    fireOnKeyPress: () => scala.Unit,
    removeOnKeyPress: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit
  ): UiKeyPressable = {
    val __obj = js.Dynamic.literal(addOnKeyPress = js.Any.fromFunction1(addOnKeyPress), fireOnKeyPress = js.Any.fromFunction0(fireOnKeyPress), removeOnKeyPress = js.Any.fromFunction1(removeOnKeyPress))
  
    __obj.asInstanceOf[UiKeyPressable]
  }
}

