package typings.winrtDashUwp.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexerOption extends js.Object

/** Specifies whether the query should use the system index of the file system when enumerating content in the folder being queried. The indexer can retrieve results faster but is not available in all file locations. */
@JSGlobal("Windows.Storage.Search.IndexerOption")
@js.native
object IndexerOption extends js.Object {
  /** Access the file system directly; don't use the system index. */
  @js.native
  sealed trait doNotUseIndexer extends IndexerOption
  
  /** Use only indexed content and ignore content that has not been indexed. */
  @js.native
  sealed trait onlyUseIndexer extends IndexerOption
  
  /** Use the system index for content that has been indexed and use the file system directly for content that has not been indexed. */
  @js.native
  sealed trait useIndexerWhenAvailable extends IndexerOption
  
  /* 2 */ val doNotUseIndexer: typings.winrtDashUwp.Windows.Storage.Search.IndexerOption.doNotUseIndexer with Double = js.native
  /* 1 */ val onlyUseIndexer: typings.winrtDashUwp.Windows.Storage.Search.IndexerOption.onlyUseIndexer with Double = js.native
  /* 0 */ val useIndexerWhenAvailable: typings.winrtDashUwp.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexerOption with Double] = js.native
}

