package typings.winrt.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
