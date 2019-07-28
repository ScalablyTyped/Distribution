package typings.winrt.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedState extends js.Object

@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends js.Object {
  @js.native
  sealed trait fullyIndexed extends IndexedState
  
  @js.native
  sealed trait notIndexed extends IndexedState
  
  @js.native
  sealed trait partiallyIndexed extends IndexedState
  
  @js.native
  sealed trait unknown extends IndexedState
  
  /* 3 */ val fullyIndexed: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexedState.fullyIndexed with Double = js.native
  /* 1 */ val notIndexed: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexedState.notIndexed with Double = js.native
  /* 2 */ val partiallyIndexed: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexedState.partiallyIndexed with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexedState.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexedState with Double] = js.native
}

