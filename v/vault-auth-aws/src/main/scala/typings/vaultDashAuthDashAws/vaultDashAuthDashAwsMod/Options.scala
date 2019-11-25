package typings.vaultDashAuthDashAws.vaultDashAuthDashAwsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: String
  var cert: js.UndefOr[Buffer] = js.undefined
  var followAllRedirects: Boolean
  var url: String
}

object Options {
  @scala.inline
  def apply(body: String, followAllRedirects: Boolean, url: String, cert: Buffer = null): Options = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], followAllRedirects = followAllRedirects.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

