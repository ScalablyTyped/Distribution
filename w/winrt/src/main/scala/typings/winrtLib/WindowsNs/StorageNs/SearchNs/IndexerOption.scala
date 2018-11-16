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
  
  val doNotUseIndexer: doNotUseIndexer with java.lang.String = js.native
  val onlyUseIndexer: onlyUseIndexer with java.lang.String = js.native
  val useIndexerWhenAvailable: useIndexerWhenAvailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.IndexerOption with java.lang.String] = js.native
}

