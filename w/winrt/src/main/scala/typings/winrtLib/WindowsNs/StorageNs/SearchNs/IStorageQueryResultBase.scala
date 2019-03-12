package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageQueryResultBase extends js.Object {
  var folder: winrtLib.WindowsNs.StorageNs.StorageFolder
  var oncontentschanged: js.Any
  var onoptionschanged: js.Any
  def applyNewQueryOptions(newQueryOptions: QueryOptions): scala.Unit
  def findStartIndexAsync(value: js.Any): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double]
  def getCurrentQueryOptions(): QueryOptions
  def getItemCountAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double]
}

object IStorageQueryResultBase {
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => scala.Unit,
    findStartIndexAsync: js.Any => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double],
    folder: winrtLib.WindowsNs.StorageNs.StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double],
    oncontentschanged: js.Any,
    onoptionschanged: js.Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder, getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync), oncontentschanged = oncontentschanged, onoptionschanged = onoptionschanged)
  
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
}

