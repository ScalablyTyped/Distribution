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
  
  val month: month with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val year: year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.DateStackOption with java.lang.String] = js.native
}

