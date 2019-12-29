package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

