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
  
  val defaultQuery: defaultQuery with java.lang.String = js.native
  val orderByDate: orderByDate with java.lang.String = js.native
  val orderByMusicProperties: orderByMusicProperties with java.lang.String = js.native
  val orderByName: orderByName with java.lang.String = js.native
  val orderBySearchRank: orderBySearchRank with java.lang.String = js.native
  val orderByTitle: orderByTitle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery with java.lang.String
  ] = js.native
}

