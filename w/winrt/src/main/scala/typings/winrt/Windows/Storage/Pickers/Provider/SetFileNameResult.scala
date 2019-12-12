package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed
import typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded
import typings.winrt.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetFileNameResult extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
@js.native
object SetFileNameResult extends js.Object {
  @js.native
  sealed trait notAllowed extends SetFileNameResult
  
  @js.native
  sealed trait succeeded extends SetFileNameResult
  
  @js.native
  sealed trait unavailable extends SetFileNameResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SetFileNameResult with Double] = js.native
  /* 1 */ @js.native
  object notAllowed extends TopLevel[notAllowed with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
  /* 2 */ @js.native
  object unavailable extends TopLevel[unavailable with Double]
  
}

