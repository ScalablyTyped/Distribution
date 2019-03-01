package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileRemovedEventArgs extends js.Object {
  var id: java.lang.String
}

object IFileRemovedEventArgs {
  @scala.inline
  def apply(id: java.lang.String): IFileRemovedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IFileRemovedEventArgs]
  }
}

