package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateStackOption extends js.Object

/** Indicates the unit of time used to group files into folders if a CommonFolderQuery based on date is used to create a QueryOptions object. */
@JSGlobal("Windows.Storage.Search.DateStackOption")
@js.native
object DateStackOption extends js.Object {
  /** The content is grouped by month. */
  @js.native
  sealed trait month
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.DateStackOption
  
  /** The query options are not based on the date. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.DateStackOption
  
  /** The content is grouped by year. */
  @js.native
  sealed trait year
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.DateStackOption
  
  val month: month with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val year: year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.DateStackOption with java.lang.String
  ] = js.native
}

