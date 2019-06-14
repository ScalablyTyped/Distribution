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
  
  /* 2 */ val month: month with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val year: year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.DateStackOption with scala.Double] = js.native
}

