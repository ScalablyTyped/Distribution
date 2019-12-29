package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamedFileFailureMode extends js.Object

@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends js.Object {
  @js.native
  sealed trait currentlyUnavailable extends StreamedFileFailureMode
  
  @js.native
  sealed trait failed extends StreamedFileFailureMode
  
  @js.native
  sealed trait incomplete extends StreamedFileFailureMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreamedFileFailureMode with Double] = js.native
  /* 1 */ @js.native
  object currentlyUnavailable extends TopLevel[currentlyUnavailable with Double]
  
  /* 0 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 2 */ @js.native
  object incomplete extends TopLevel[incomplete with Double]
  
}

