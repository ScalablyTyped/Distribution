package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexedState extends StObject
@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends StObject {
  
  @js.native
  sealed trait fullyIndexed extends IndexedState
  
  @js.native
  sealed trait notIndexed extends IndexedState
  
  @js.native
  sealed trait partiallyIndexed extends IndexedState
  
  @js.native
  sealed trait unknown extends IndexedState
}
