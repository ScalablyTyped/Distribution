package typings.winrtUwp.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
