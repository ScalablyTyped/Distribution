package typings.winjs.global.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the status of an IListDataSource.
  **/
@JSGlobal("WinJS.UI.DataSourceStatus")
@js.native
object DataSourceStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winjs.WinJS.UI.DataSourceStatus with Double] = js.native
  
  /* 2 */ val failure: typings.winjs.WinJS.UI.DataSourceStatus.failure with Double = js.native
  
  /* 0 */ val ready: typings.winjs.WinJS.UI.DataSourceStatus.ready with Double = js.native
  
  /* 1 */ val waiting: typings.winjs.WinJS.UI.DataSourceStatus.waiting with Double = js.native
}
