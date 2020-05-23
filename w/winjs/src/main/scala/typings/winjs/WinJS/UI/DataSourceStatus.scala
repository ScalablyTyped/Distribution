package typings.winjs.WinJS.UI

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
  
}

