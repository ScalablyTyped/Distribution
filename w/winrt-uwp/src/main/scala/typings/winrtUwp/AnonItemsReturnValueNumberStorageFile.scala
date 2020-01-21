package typings.winrtUwp

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueNumberStorageFile extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: StorageFile
  /** The number of items returned. */ var returnValue: Double
}

object AnonItemsReturnValueNumberStorageFile {
  @scala.inline
  def apply(items: StorageFile, returnValue: Double): AnonItemsReturnValueNumberStorageFile = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueNumberStorageFile]
  }
}

