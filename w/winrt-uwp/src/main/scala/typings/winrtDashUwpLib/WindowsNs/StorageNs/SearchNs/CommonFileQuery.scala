package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

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
  sealed trait defaultQuery
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.ItemDate . */
  @js.native
  sealed trait orderByDate
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by music properties. */
  @js.native
  sealed trait orderByMusicProperties
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.ItemNameDisplay . */
  @js.native
  sealed trait orderByName
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.Search.Rank followed by System.DateModified . */
  @js.native
  sealed trait orderBySearchRank
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /** A deep, flat list of files in a folder and its subfolders, sorted by System.Title . */
  @js.native
  sealed trait orderByTitle
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /* 0 */ val defaultQuery: defaultQuery with scala.Double = js.native
  /* 5 */ val orderByDate: orderByDate with scala.Double = js.native
  /* 3 */ val orderByMusicProperties: orderByMusicProperties with scala.Double = js.native
  /* 1 */ val orderByName: orderByName with scala.Double = js.native
  /* 4 */ val orderBySearchRank: orderBySearchRank with scala.Double = js.native
  /* 2 */ val orderByTitle: orderByTitle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery with scala.Double] = js.native
}

