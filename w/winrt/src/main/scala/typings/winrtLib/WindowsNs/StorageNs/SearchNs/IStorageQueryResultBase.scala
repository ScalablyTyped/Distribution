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
    applyNewQueryOptions: js.Function1[QueryOptions, scala.Unit],
    findStartIndexAsync: js.Function1[js.Any, winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double]],
    folder: winrtLib.WindowsNs.StorageNs.StorageFolder,
    getCurrentQueryOptions: js.Function0[QueryOptions],
    getItemCountAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double]],
    oncontentschanged: js.Any,
    onoptionschanged: js.Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyNewQueryOptions")(applyNewQueryOptions)
    __obj.updateDynamic("findStartIndexAsync")(findStartIndexAsync)
    __obj.updateDynamic("folder")(folder)
    __obj.updateDynamic("getCurrentQueryOptions")(getCurrentQueryOptions)
    __obj.updateDynamic("getItemCountAsync")(getItemCountAsync)
    __obj.updateDynamic("oncontentschanged")(oncontentschanged)
    __obj.updateDynamic("onoptionschanged")(onoptionschanged)
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
}

