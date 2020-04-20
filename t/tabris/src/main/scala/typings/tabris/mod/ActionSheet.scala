package typings.tabris.mod

import typings.tabris.AnonChildrenFlatten
import typings.tabris.AnonImage
import typings.tabris.OmitActionSheetset
import typings.tabris.tabrisStrings.actions
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ActionSheet")
@js.native
class ActionSheet () extends Popup {
  def this(properties: Properties[ActionSheet, OmitActionSheetset]) = this()
  /**
    * An array of objects describing the actions to be displayed. The entries may be instances of
    * `ActionSheetItem` *or plain objects* with some or all of the same properties.
    */
  var actions: js.Array[AnonImage] = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_ActionSheet: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildrenFlatten = js.native
  /**
    * A descriptive message for the available actions.
    */
  var message: String = js.native
  /**
    * Fired when the [*actions*](#actions) property has changed.
    */
  var onActionsChanged: ChangeListeners[this.type, actions] = js.native
  /**
    * Fired when the action sheet was closed.
    */
  var onClose: Listeners[ActionSheetCloseEvent[this.type]] = js.native
  /**
    * Fired when the [*message*](#message) property has changed.
    */
  var onMessageChanged: ChangeListeners[this.type, message] = js.native
  /**
    * Fired when an action was selected. Note: on iOS, tapping outside of an ActionSheet will also fire a
    * `select` event. Its parameter will be an index of a button with type `cancel`. This happens despite
    * the fact that no button has been pressed.
    */
  var onSelect: Listeners[ActionSheetSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*title*](#title) property has changed.
    */
  var onTitleChanged: ChangeListeners[this.type, title] = js.native
  /**
    * The title of the action sheet.
    */
  var title: String = js.native
}

/* static members */
@JSImport("tabris", "ActionSheet")
@js.native
object ActionSheet extends js.Object {
  /**
    * Makes the given action sheet visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual ActionSheet.
    * @param actionSheet The action sheet to open
    */
  def open(actionSheet: ActionSheet): ActionSheet = js.native
}

