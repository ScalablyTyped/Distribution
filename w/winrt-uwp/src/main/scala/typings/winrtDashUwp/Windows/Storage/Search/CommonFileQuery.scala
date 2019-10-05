package typings.winrtDashUwp.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommonFileQuery extends js.Object

/** Specifies how to sort the files in the query results and determines whether the query is shallow or deep. Query results for deep queries include all files in all of the subfolders of the current folder, sorted according to the specified option. */
@JSGlobal("Windows.Storage.Search.CommonFileQuery")
@js.native
object CommonFileQuery extends js.Object {
  /** A shallow list of files in the current folder, similar to the list that File Explorer provides. */
  @js.native
  sealed trait defaultQuery extends CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.ItemDate . */
  @js.native
  sealed trait orderByDate extends CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by music properties. */
  @js.native
  sealed trait orderByMusicProperties extends CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.ItemNameDisplay . */
  @js.native
  sealed trait orderByName extends CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.Search.Rank followed by System.DateModified . */
  @js.native
  sealed trait orderBySearchRank extends CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.Title . */
  @js.native
  sealed trait orderByTitle extends CommonFileQuery
  
  /* 0 */ val defaultQuery: typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.defaultQuery with Double = js.native
  /* 5 */ val orderByDate: typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByDate with Double = js.native
  /* 3 */ val orderByMusicProperties: typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties with Double = js.native
  /* 1 */ val orderByName: typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByName with Double = js.native
  /* 4 */ val orderBySearchRank: typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderBySearchRank with Double = js.native
  /* 2 */ val orderByTitle: typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByTitle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommonFileQuery with Double] = js.native
}

