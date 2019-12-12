package typings.winrtDashUwp.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.defaultQuery
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByDate
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByName
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderBySearchRank
import typings.winrtDashUwp.Windows.Storage.Search.CommonFileQuery.orderByTitle
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommonFileQuery with Double] = js.native
  /* 0 */ @js.native
  object defaultQuery extends TopLevel[defaultQuery with Double]
  
  /* 5 */ @js.native
  object orderByDate extends TopLevel[orderByDate with Double]
  
  /* 3 */ @js.native
  object orderByMusicProperties extends TopLevel[orderByMusicProperties with Double]
  
  /* 1 */ @js.native
  object orderByName extends TopLevel[orderByName with Double]
  
  /* 4 */ @js.native
  object orderBySearchRank extends TopLevel[orderBySearchRank with Double]
  
  /* 2 */ @js.native
  object orderByTitle extends TopLevel[orderByTitle with Double]
  
}

