package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines properties for web account provider operations. */
@js.native
trait IWebAccountProviderOperation extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
}

object IWebAccountProviderOperation {
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind): IWebAccountProviderOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebAccountProviderOperation]
  }
  @scala.inline
  implicit class IWebAccountProviderOperationOps[Self <: IWebAccountProviderOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

