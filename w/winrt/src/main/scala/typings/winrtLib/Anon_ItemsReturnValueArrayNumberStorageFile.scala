package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumberStorageFile extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.StorageNs.StorageFile]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayNumberStorageFile {
  @scala.inline
  def apply(items: js.Array[winrtLib.WindowsNs.StorageNs.StorageFile], returnValue: scala.Double): Anon_ItemsReturnValueArrayNumberStorageFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumberStorageFile]
  }
}

