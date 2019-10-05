package typings.winrtDashUwp.Windows.Media.Protection

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about components that need to be revoked and renewed. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
@js.native
abstract class RevocationAndRenewalInformation () extends js.Object {
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  var items: IVector[RevocationAndRenewalItem] = js.native
}

