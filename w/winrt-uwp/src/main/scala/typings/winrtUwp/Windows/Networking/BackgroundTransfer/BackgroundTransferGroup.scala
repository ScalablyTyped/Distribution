package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
trait BackgroundTransferGroup extends js.Object {
  /** Gets the name of the group. */
  var name: String
  /** Gets or sets the property used to specify if transfers within this group run simultaneously or in serial. Possible values are defined by BackgroundTransferBehavior . */
  var transferBehavior: BackgroundTransferBehavior
}

object BackgroundTransferGroup {
  @scala.inline
  def apply(name: String, transferBehavior: BackgroundTransferBehavior): BackgroundTransferGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transferBehavior = transferBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTransferGroup]
  }
}

