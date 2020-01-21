package typings.winrtUwp.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedState extends js.Object

/** Indicates whether a StorageFolder is included in the system index. */
@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends js.Object {
  /** The folder contains indexed content. */
  @js.native
  sealed trait fullyIndexed extends IndexedState
  
  /** The folder is not indexed. */
  @js.native
  sealed trait notIndexed extends IndexedState
  
  /** Some folders in the library are indexed, but not all of them. This value is relevant only for libraries. */
  @js.native
  sealed trait partiallyIndexed extends IndexedState
  
  /** The indexed state is not known. */
  @js.native
  sealed trait unknown extends IndexedState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexedState with Double] = js.native
  /* 3 */ @js.native
  object fullyIndexed extends TopLevel[fullyIndexed with Double]
  
  /* 1 */ @js.native
  object notIndexed extends TopLevel[notIndexed with Double]
  
  /* 2 */ @js.native
  object partiallyIndexed extends TopLevel[partiallyIndexed with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

