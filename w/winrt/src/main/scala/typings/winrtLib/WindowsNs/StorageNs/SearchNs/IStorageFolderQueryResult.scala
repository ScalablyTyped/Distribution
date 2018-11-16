package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolderQueryResult extends IStorageQueryResultBase {
  def getFoldersAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFolder]
  ] = js.native
  def getFoldersAsync(startIndex: scala.Double, maxNumberOfItems: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFolder]
  ] = js.native
}

