package typings.winrtUwp

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsStorageFile extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: StorageFile
  /** The number of items returned. */ var returnValue: Double
}

object AnonItemsStorageFile {
  @scala.inline
  def apply(items: StorageFile, returnValue: Double): AnonItemsStorageFile = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsStorageFile]
  }
}

