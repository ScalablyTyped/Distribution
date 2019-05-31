package typings
package stripeLib.stripeMod.sourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceRetrieveOptions extends js.Object {
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
}

object ISourceRetrieveOptions {
  @scala.inline
  def apply(client_secret: java.lang.String = null): ISourceRetrieveOptions = {
    val __obj = js.Dynamic.literal()
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    __obj.asInstanceOf[ISourceRetrieveOptions]
  }
}

