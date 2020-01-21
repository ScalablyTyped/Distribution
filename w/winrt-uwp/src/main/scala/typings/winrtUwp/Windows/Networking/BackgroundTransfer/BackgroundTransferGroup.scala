package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
@js.native
abstract class BackgroundTransferGroup () extends js.Object {
  /** Gets the name of the group. */
  var name: String = js.native
  /** Gets or sets the property used to specify if transfers within this group run simultaneously or in serial. Possible values are defined by BackgroundTransferBehavior . */
  var transferBehavior: BackgroundTransferBehavior = js.native
}

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
@js.native
object BackgroundTransferGroup extends js.Object {
  /**
    * Creates a transfer group using the provided group name.
    * @param name The name of the group. If a group with the this name already exists, this method will return a reference to the existing group object.
    * @return The new BackgroundTransferGroup .
    */
  def createGroup(name: String): BackgroundTransferGroup = js.native
}

