package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneCallHistoryEntryMedia extends js.Object

/** The type of media associated with a call. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia")
@js.native
object PhoneCallHistoryEntryMedia extends js.Object {
  /** The call contains audio media. */
  @js.native
  sealed trait audio extends PhoneCallHistoryEntryMedia
  
  /** The call contains video media. */
  @js.native
  sealed trait video extends PhoneCallHistoryEntryMedia
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneCallHistoryEntryMedia with Double] = js.native
  /* 0 */ @js.native
  object audio extends TopLevel[audio with Double]
  
  /* 1 */ @js.native
  object video extends TopLevel[video with Double]
  
}

