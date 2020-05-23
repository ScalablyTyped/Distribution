package typings.winrtUwp.global.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
@JSGlobal("Windows.Media.Protection.ComponentLoadFailedEventArgs")
@js.native
abstract class ComponentLoadFailedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Protection.ComponentLoadFailedEventArgs {
  /** Returns an indication of the completion of the event. */
  /* CompleteClass */
  override var completion: typings.winrtUwp.Windows.Media.Protection.MediaProtectionServiceCompletion = js.native
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  /* CompleteClass */
  override var information: typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation = js.native
}

