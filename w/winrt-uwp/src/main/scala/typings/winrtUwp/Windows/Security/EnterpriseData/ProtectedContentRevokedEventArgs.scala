package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection has been revoked. */
trait ProtectedContentRevokedEventArgs extends js.Object {
  /** Contains the enterprise identities for which content protection has been revoked. */
  var identities: IVectorView[String]
}

object ProtectedContentRevokedEventArgs {
  @scala.inline
  def apply(identities: IVectorView[String]): ProtectedContentRevokedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContentRevokedEventArgs]
  }
}

