package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedState extends js.Object

@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends js.Object {
  @js.native
  sealed trait fullyIndexed
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  @js.native
  sealed trait notIndexed
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  @js.native
  sealed trait partiallyIndexed
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  /* 3 */ val fullyIndexed: fullyIndexed with scala.Double = js.native
  /* 1 */ val notIndexed: notIndexed with scala.Double = js.native
  /* 2 */ val partiallyIndexed: partiallyIndexed with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.IndexedState with scala.Double] = js.native
}

