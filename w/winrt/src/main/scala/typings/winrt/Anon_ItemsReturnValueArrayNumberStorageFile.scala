package typings.winrt

import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumberStorageFile extends js.Object {
  var items: js.Array[StorageFile]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayNumberStorageFile {
  @scala.inline
  def apply(items: js.Array[StorageFile], returnValue: Double): Anon_ItemsReturnValueArrayNumberStorageFile = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumberStorageFile]
  }
}

