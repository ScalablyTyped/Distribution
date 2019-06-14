package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateStackOption extends js.Object

@JSGlobal("Windows.Storage.Search.DateStackOption")
@js.native
object DateStackOption extends js.Object {
  @js.native
  sealed trait month
    extends winrtLib.WindowsNs.StorageNs.SearchNs.DateStackOption
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.SearchNs.DateStackOption
  
  @js.native
  sealed trait year
    extends winrtLib.WindowsNs.StorageNs.SearchNs.DateStackOption
  
  /* 2 */ val month: month with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val year: year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.DateStackOption with scala.Double] = js.native
}

