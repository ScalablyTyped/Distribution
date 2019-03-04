package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberStorageFile extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile
  /** The number of items returned. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumberStorageFile {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile, returnValue: scala.Double): Anon_ItemsReturnValueNumberStorageFile = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberStorageFile]
  }
}

