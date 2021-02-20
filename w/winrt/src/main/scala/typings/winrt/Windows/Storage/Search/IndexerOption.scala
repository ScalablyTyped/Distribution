package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexerOption extends StObject
@JSGlobal("Windows.Storage.Search.IndexerOption")
@js.native
object IndexerOption extends StObject {
  
  @js.native
  sealed trait doNotUseIndexer extends IndexerOption
  
  @js.native
  sealed trait onlyUseIndexer extends IndexerOption
  
  @js.native
  sealed trait useIndexerWhenAvailable extends IndexerOption
}
