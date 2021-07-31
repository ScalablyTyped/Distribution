package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexedState extends StObject
@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends StObject {
  
  @js.native
  sealed trait fullyIndexed
    extends StObject
       with IndexedState
  
  @js.native
  sealed trait notIndexed
    extends StObject
       with IndexedState
  
  @js.native
  sealed trait partiallyIndexed
    extends StObject
       with IndexedState
  
  @js.native
  sealed trait unknown
    extends StObject
       with IndexedState
}
