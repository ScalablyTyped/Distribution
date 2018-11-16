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

