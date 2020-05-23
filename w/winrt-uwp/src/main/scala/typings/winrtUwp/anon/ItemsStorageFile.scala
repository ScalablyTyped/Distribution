package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsStorageFile extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: StorageFile
  /** The number of items returned. */ var returnValue: Double
}

object ItemsStorageFile {
  @scala.inline
  def apply(items: StorageFile, returnValue: Double): ItemsStorageFile = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsStorageFile]
  }
}

