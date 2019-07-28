package typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs

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
  sealed trait month extends DateStackOption
  
  /** The query options are not based on the date. */
  @js.native
  sealed trait none extends DateStackOption
  
  /** The content is grouped by year. */
  @js.native
  sealed trait year extends DateStackOption
  
  /* 2 */ val month: typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs.DateStackOption.month with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs.DateStackOption.none with Double = js.native
  /* 1 */ val year: typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs.DateStackOption.year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateStackOption with Double] = js.native
}

