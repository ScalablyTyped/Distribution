package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when content protection is resumed. */
trait ProtectedAccessResumedEventArgs extends js.Object {
  /** Contains the enterprise identities for which content protection is being resumed. */
  var identities: IVectorView[String]
}

object ProtectedAccessResumedEventArgs {
  @scala.inline
  def apply(identities: IVectorView[String]): ProtectedAccessResumedEventArgs = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedAccessResumedEventArgs]
  }
}

