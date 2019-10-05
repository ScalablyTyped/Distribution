package typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines properties for web account provider operations. */
trait IWebAccountProviderOperation extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
}

object IWebAccountProviderOperation {
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind): IWebAccountProviderOperation = {
    val __obj = js.Dynamic.literal(kind = kind)
  
    __obj.asInstanceOf[IWebAccountProviderOperation]
  }
}

