package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  /** public x509 certificate file path to use for SSL */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  /** private key file path to use for SSL */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object ListenOptions {
  @scala.inline
  def apply(cert: java.lang.String = null, key: java.lang.String = null): ListenOptions = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[ListenOptions]
  }
}

