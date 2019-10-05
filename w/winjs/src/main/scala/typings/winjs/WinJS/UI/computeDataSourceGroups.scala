package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.computeDataSourceGroups")
@js.native
object computeDataSourceGroups extends js.Object {
  //#endregion Objects
  //#region Functions
  /**
    * Returns a new IListDataSource that adds group information to the items of another IListDataSource.
    * @param listDataSource The data source for the individual items to group.
    * @param groupKey A callback function that accepts a single argument: an item in the IListDataSource. The function is called for each item in the list and must return the group key for that item as a string.
    * @param groupData A callback function that accepts a single argument: an item in the IListDataSource. The function is called on one IListDataSource item for each group and must return an object that represents the header of that group.
    * @param options An object that can contain properties that specify additional options: groupCountEstimate, batchSize.
    * @returns An IListGroupDataSource that contains the items in the original data source and provides additional group information in the form of a "groups" property. The "groups" property returns another IListDataSource that enumerates the different groups in the list.
    **/
  def apply[T](listDataSource: IListDataSource[T], groupKey: js.Function, groupData: js.Function): IListGroupDataSource[T] = js.native
  def apply[T](listDataSource: IListDataSource[T], groupKey: js.Function, groupData: js.Function, options: js.Any): IListGroupDataSource[T] = js.native
}

