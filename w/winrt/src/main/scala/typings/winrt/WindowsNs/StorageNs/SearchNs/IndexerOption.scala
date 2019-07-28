package typings.winrt.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexerOption extends js.Object

@JSGlobal("Windows.Storage.Search.IndexerOption")
@js.native
object IndexerOption extends js.Object {
  @js.native
  sealed trait doNotUseIndexer extends IndexerOption
  
  @js.native
  sealed trait onlyUseIndexer extends IndexerOption
  
  @js.native
  sealed trait useIndexerWhenAvailable extends IndexerOption
  
  /* 2 */ val doNotUseIndexer: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexerOption.doNotUseIndexer with Double = js.native
  /* 1 */ val onlyUseIndexer: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexerOption.onlyUseIndexer with Double = js.native
  /* 0 */ val useIndexerWhenAvailable: typings.winrt.WindowsNs.StorageNs.SearchNs.IndexerOption.useIndexerWhenAvailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexerOption with Double] = js.native
}

