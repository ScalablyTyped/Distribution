package typings.winrtUwp.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexedState extends StObject
/** Indicates whether a StorageFolder is included in the system index. */
@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends StObject {
  
  /** The folder contains indexed content. */
  @js.native
  sealed trait fullyIndexed
    extends StObject
       with IndexedState
  
  /** The folder is not indexed. */
  @js.native
  sealed trait notIndexed
    extends StObject
       with IndexedState
  
  /** Some folders in the library are indexed, but not all of them. This value is relevant only for libraries. */
  @js.native
  sealed trait partiallyIndexed
    extends StObject
       with IndexedState
  
  /** The indexed state is not known. */
  @js.native
  sealed trait unknown
    extends StObject
       with IndexedState
}
