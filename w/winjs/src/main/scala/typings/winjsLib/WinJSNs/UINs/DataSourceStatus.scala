package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait failure
    extends winjsLib.WinJSNs.UINs.DataSourceStatus
  
  /**
    * The IListDataSource is ready.
    **/
  @js.native
  sealed trait ready
    extends winjsLib.WinJSNs.UINs.DataSourceStatus
  
  /**
    * The IListDataSource is still loading.
    **/
  @js.native
  sealed trait waiting
    extends winjsLib.WinJSNs.UINs.DataSourceStatus
  
  /* 2 */ val failure: failure with scala.Double = js.native
  /* 0 */ val ready: ready with scala.Double = js.native
  /* 1 */ val waiting: waiting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.DataSourceStatus with scala.Double] = js.native
}

