package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeerInformation extends js.Object {
  var displayName: String
}

object IPeerInformation {
  @scala.inline
  def apply(displayName: String): IPeerInformation = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPeerInformation]
  }
}

