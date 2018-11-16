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
  
  val fullyIndexed: fullyIndexed with java.lang.String = js.native
  val notIndexed: notIndexed with java.lang.String = js.native
  val partiallyIndexed: partiallyIndexed with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.IndexedState with java.lang.String] = js.native
}

