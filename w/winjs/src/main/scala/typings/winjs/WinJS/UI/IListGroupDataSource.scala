package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A special data source for VirtualizedDataSource.computeDataSourceGroups
  **/
@js.native
trait IListGroupDataSource[T] extends IListDataSource[T] {
  var groups: IListDataSource[T] = js.native
}

