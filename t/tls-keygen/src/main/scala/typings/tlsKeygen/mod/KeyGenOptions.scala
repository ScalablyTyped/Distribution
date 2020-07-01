package typings.tlsKeygen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyGenOptions extends js.Object {
  var cert: js.UndefOr[String] = js.undefined
  var commonName: js.UndefOr[String] = js.undefined
  var entrust: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var subjectAltName: js.UndefOr[js.Array[String]] = js.undefined
}

object KeyGenOptions {
  @scala.inline
  def apply(
    cert: String = null,
    commonName: String = null,
    entrust: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    subjectAltName: js.Array[String] = null
  ): KeyGenOptions = {
    val __obj = js.Dynamic.literal()
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (commonName != null) __obj.updateDynamic("commonName")(commonName.asInstanceOf[js.Any])
    if (!js.isUndefined(entrust)) __obj.updateDynamic("entrust")(entrust.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (subjectAltName != null) __obj.updateDynamic("subjectAltName")(subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGenOptions]
  }
}

