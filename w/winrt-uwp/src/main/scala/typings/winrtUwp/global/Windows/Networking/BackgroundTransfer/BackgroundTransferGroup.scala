package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
@js.native
abstract class BackgroundTransferGroup ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
@js.native
object BackgroundTransferGroup extends js.Object {
  /**
    * Creates a transfer group using the provided group name.
    * @param name The name of the group. If a group with the this name already exists, this method will return a reference to the existing group object.
    * @return The new BackgroundTransferGroup .
    */
  def createGroup(name: String): typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = js.native
}

