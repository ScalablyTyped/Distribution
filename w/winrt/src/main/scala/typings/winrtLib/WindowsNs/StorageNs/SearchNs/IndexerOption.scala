package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexerOption extends js.Object

@JSGlobal("Windows.Storage.Search.IndexerOption")
@js.native
object IndexerOption extends js.Object {
  @js.native
  sealed trait doNotUseIndexer
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexerOption
  
  @js.native
  sealed trait onlyUseIndexer
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexerOption
  
  @js.native
  sealed trait useIndexerWhenAvailable
    extends winrtLib.WindowsNs.StorageNs.SearchNs.IndexerOption
  
  /* 2 */ val doNotUseIndexer: doNotUseIndexer with scala.Double = js.native
  /* 1 */ val onlyUseIndexer: onlyUseIndexer with scala.Double = js.native
  /* 0 */ val useIndexerWhenAvailable: useIndexerWhenAvailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.IndexerOption with scala.Double] = js.native
}

