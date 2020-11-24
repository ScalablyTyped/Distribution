package typings.winjs.global.WinJS.UI

import typings.winjs.WinJS.Promise
import typings.winjs.WinJS.UI.IItem
import typings.winjs.WinJS.UI.IListDataSource
import typings.winjs.WinJS.UI.ISelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WinJS.UI.getItemsFromRanges")
@js.native
object getItemsFromRanges extends js.Object {
  
  /**
    * Retrieves the items in the specified index range.
    * @param dataSource The data source that contains the items to retrieve.
    * @param ranges An array of ISelectionRange objects that have firstIndex and lastIndex values.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def apply[U](dataSource: IListDataSource[U], ranges: js.Array[ISelectionRange]): Promise[IItem[U]] = js.native
}
