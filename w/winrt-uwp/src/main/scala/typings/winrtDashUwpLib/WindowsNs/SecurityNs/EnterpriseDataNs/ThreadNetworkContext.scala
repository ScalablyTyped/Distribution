package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A protected network context for an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy. */
@JSGlobal("Windows.Security.EnterpriseData.ThreadNetworkContext")
@js.native
abstract class ThreadNetworkContext () extends js.Object {
  /** Closes the protected network context. The app must call Close after access to the protected resource is completed. */
  def close(): scala.Unit = js.native
}

