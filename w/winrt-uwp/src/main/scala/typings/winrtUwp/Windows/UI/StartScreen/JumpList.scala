package typings.winrtUwp.Windows.UI.StartScreen

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for selecting the type of system-managed jump list that is used by an app, adding custom task entry points to an app's jump list, and adding custom groups to an app's jump list. A jump list consists of an optional system-provided list of items, as well as optional app-provided items. Not all device families support jump lists. */
@js.native
trait JumpList extends js.Object {
  /** Gets the list of JumpListItem 's for the jump list. Items is of type IVector(JumpListItem) . */
  var items: IVector[JumpListItem] = js.native
  /** Gets or sets the current type of the system managed jump list group. */
  var systemGroupKind: JumpListSystemGroupKind = js.native
  /**
    * Asynchronously saves changes to the jump list and its items.
    * @return Returns an IAsyncAction object that is used to control the asynchronous operation. If the system does not support jump lists, the SaveAsync method has no effect and future calls to LoadCurrentAsync will produce an empty jump list. An app can check for this case using the IsSupported method.
    */
  def saveAsync(): IPromiseWithIAsyncAction = js.native
}

object JumpList {
  @scala.inline
  def apply(
    items: IVector[JumpListItem],
    saveAsync: () => IPromiseWithIAsyncAction,
    systemGroupKind: JumpListSystemGroupKind
  ): JumpList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], saveAsync = js.Any.fromFunction0(saveAsync), systemGroupKind = systemGroupKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpList]
  }
  @scala.inline
  implicit class JumpListOps[Self <: JumpList] (val x: Self) extends AnyVal {
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
    def setItems(value: IVector[JumpListItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("saveAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setSystemGroupKind(value: JumpListSystemGroupKind): Self = this.set("systemGroupKind", value.asInstanceOf[js.Any])
  }
  
}

