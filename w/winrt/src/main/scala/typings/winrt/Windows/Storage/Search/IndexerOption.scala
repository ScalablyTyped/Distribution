package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexerOption with Double] = js.native
  /* 2 */ @js.native
  object doNotUseIndexer extends TopLevel[doNotUseIndexer with Double]
  
  /* 1 */ @js.native
  object onlyUseIndexer extends TopLevel[onlyUseIndexer with Double]
  
  /* 0 */ @js.native
  object useIndexerWhenAvailable extends TopLevel[useIndexerWhenAvailable with Double]
  
}

