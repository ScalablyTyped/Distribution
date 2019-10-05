package typings.winrtDashUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
@JSGlobal("Windows.Media.Protection.ComponentLoadFailedEventArgs")
@js.native
abstract class ComponentLoadFailedEventArgs () extends js.Object {
  /** Returns an indication of the completion of the event. */
  var completion: MediaProtectionServiceCompletion = js.native
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  var information: RevocationAndRenewalInformation = js.native
}

