package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A protected network context for an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy. */
trait ThreadNetworkContext extends js.Object {
  /** Closes the protected network context. The app must call Close after access to the protected resource is completed. */
  def close(): Unit
}

object ThreadNetworkContext {
  @scala.inline
  def apply(close: () => Unit): ThreadNetworkContext = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[ThreadNetworkContext]
  }
}

