package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  /** public x509 certificate file path to use for SSL */
  var cert: js.UndefOr[String] = js.undefined
  /** private key file path to use for SSL */
  var key: js.UndefOr[String] = js.undefined
}

object ListenOptions {
  @scala.inline
  def apply(cert: String = null, key: String = null): ListenOptions = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenOptions]
  }
}

