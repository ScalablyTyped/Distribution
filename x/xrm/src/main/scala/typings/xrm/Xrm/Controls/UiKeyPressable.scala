package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Events.ContextSensitiveHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for controls which methods provide immediate feedback or take actions as user types in a control.
  * Contains methods which can be used to perform data validations in a control even before the user commits (saves) the value in a form.
  */
@js.native
trait UiKeyPressable extends js.Object {
  /**
    * Use this to add a function as an event handler for the keypress event so that the function is called when you type a character in the specific text or number field.
    * For a sample JavaScript code that uses the addOnKeyPress method to configure the auto-completion experience, see Sample: Auto-complete in CRM controls.
    * @deprecated Deprecated in v9.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * @param handler The function reference.
    */
  def addOnKeyPress(handler: ContextSensitiveHandler): Unit = js.native
  /**
    * Use this to manually fire an event handler that you created for a specific text or number field to be executed on the keypress event.
    */
  def fireOnKeyPress(): Unit = js.native
  /**
    * Use this to remove an event handler for a text or number field that you added using addOnKeyPress.
    * @deprecated Deprecated in v9.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    * Remarks:  If an anonymous function is set using addOnKeyPress, it can’t be removed using this method.
    * @param handler The function reference.
    */
  def removeOnKeyPress(handler: ContextSensitiveHandler): Unit = js.native
}

object UiKeyPressable {
  @scala.inline
  def apply(
    addOnKeyPress: ContextSensitiveHandler => Unit,
    fireOnKeyPress: () => Unit,
    removeOnKeyPress: ContextSensitiveHandler => Unit
  ): UiKeyPressable = {
    val __obj = js.Dynamic.literal(addOnKeyPress = js.Any.fromFunction1(addOnKeyPress), fireOnKeyPress = js.Any.fromFunction0(fireOnKeyPress), removeOnKeyPress = js.Any.fromFunction1(removeOnKeyPress))
    __obj.asInstanceOf[UiKeyPressable]
  }
  @scala.inline
  implicit class UiKeyPressableOps[Self <: UiKeyPressable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddOnKeyPress(value: ContextSensitiveHandler => Unit): Self = this.set("addOnKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def setFireOnKeyPress(value: () => Unit): Self = this.set("fireOnKeyPress", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveOnKeyPress(value: ContextSensitiveHandler => Unit): Self = this.set("removeOnKeyPress", js.Any.fromFunction1(value))
  }
  
}

