package typings.winrt

import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueArrayNumberStorageFile extends js.Object {
  var items: js.Array[StorageFile]
  var returnValue: Double
}

object AnonItemsReturnValueArrayNumberStorageFile {
  @scala.inline
  def apply(items: js.Array[StorageFile], returnValue: Double): AnonItemsReturnValueArrayNumberStorageFile = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueArrayNumberStorageFile]
  }
}

