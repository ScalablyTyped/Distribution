package typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an add account operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation")
@js.native
abstract class WebAccountProviderAddAccountOperation () extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
}

