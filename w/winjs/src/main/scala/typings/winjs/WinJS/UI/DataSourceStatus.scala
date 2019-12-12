package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import typings.winjs.WinJS.UI.DataSourceStatus.failure
import typings.winjs.WinJS.UI.DataSourceStatus.ready
import typings.winjs.WinJS.UI.DataSourceStatus.waiting
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceStatus with Double] = js.native
  /* 2 */ @js.native
  object failure extends TopLevel[failure with Double]
  
  /* 0 */ @js.native
  object ready extends TopLevel[ready with Double]
  
  /* 1 */ @js.native
  object waiting extends TopLevel[waiting with Double]
  
}

