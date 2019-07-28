package typings.winrtDashUwp.WindowsNs.UINs.StartScreenNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for selecting the type of system-managed jump list that is used by an app, adding custom task entry points to an app's jump list, and adding custom groups to an app's jump list. A jump list consists of an optional system-provided list of items, as well as optional app-provided items. Not all device families support jump lists. */
@JSGlobal("Windows.UI.StartScreen.JumpList")
@js.native
abstract class JumpList () extends js.Object {
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

/* static members */
@JSGlobal("Windows.UI.StartScreen.JumpList")
@js.native
object JumpList extends js.Object {
  /**
    * Gets a value that indicates whether the system supports jump lists.
    * @return A boolean value that is True if jump lists are supported. Otherwise, False.
    */
  def isSupported(): Boolean = js.native
  /**
    * Asynchronously retrieves the current jump list and its items.
    * @return When this method completes successfully, it returns the current JumpList . If the system does not support jump lists, this method returns an empty jump list and the SaveAsync method has no effect. Apps can check for this case using the isSupported method.
    */
  def loadCurrentAsync(): IPromiseWithIAsyncOperation[JumpList] = js.native
}

