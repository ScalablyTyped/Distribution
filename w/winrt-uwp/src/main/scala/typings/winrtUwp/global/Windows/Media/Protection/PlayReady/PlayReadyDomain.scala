package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to metadata about a domain to which the current system is a member. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDomain")
@js.native
abstract class PlayReadyDomain ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyDomain {
  /** Gets the current domain account identifier property. */
  /* CompleteClass */
  override var accountId: String = js.native
  /** Gets the URL used to join the domain. */
  /* CompleteClass */
  override var domainJoinUrl: Uri = js.native
  /** Gets the current domain friendly name. */
  /* CompleteClass */
  override var friendlyName: String = js.native
  /** Gets the current domain revision number. */
  /* CompleteClass */
  override var revision: Double = js.native
  /** Gets the current domain service identifier property. */
  /* CompleteClass */
  override var serviceId: String = js.native
}

