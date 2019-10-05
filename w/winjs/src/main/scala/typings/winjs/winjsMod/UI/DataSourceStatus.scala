package typings.winjs.winjsMod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the status of an IListDataSource.
  **/
@JSImport("winjs", "UI.DataSourceStatus")
@js.native
object DataSourceStatus extends js.Object {
  /* 2 */ val failure: typings.winjs.WinJS.UI.DataSourceStatus.failure with Double = js.native
  /* 0 */ val ready: typings.winjs.WinJS.UI.DataSourceStatus.ready with Double = js.native
  /* 1 */ val waiting: typings.winjs.WinJS.UI.DataSourceStatus.waiting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winjs.WinJS.UI.DataSourceStatus with Double] = js.native
}

