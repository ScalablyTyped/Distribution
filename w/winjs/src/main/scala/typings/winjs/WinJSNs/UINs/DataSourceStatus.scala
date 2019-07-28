package typings.winjs.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataSourceStatus extends js.Object

/**
  * Describes the status of an IListDataSource.
  **/
@JSGlobal("WinJS.UI.DataSourceStatus")
@js.native
object DataSourceStatus extends js.Object {
  /**
    * The IListDataSource failed to load.
    **/
  @js.native
  sealed trait failure extends DataSourceStatus
  
  /**
    * The IListDataSource is ready.
    **/
  @js.native
  sealed trait ready extends DataSourceStatus
  
  /**
    * The IListDataSource is still loading.
    **/
  @js.native
  sealed trait waiting extends DataSourceStatus
  
  /* 2 */ val failure: typings.winjs.WinJSNs.UINs.DataSourceStatus.failure with Double = js.native
  /* 0 */ val ready: typings.winjs.WinJSNs.UINs.DataSourceStatus.ready with Double = js.native
  /* 1 */ val waiting: typings.winjs.WinJSNs.UINs.DataSourceStatus.waiting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceStatus with Double] = js.native
}

