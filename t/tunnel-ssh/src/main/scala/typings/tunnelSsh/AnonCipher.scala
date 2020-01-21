package typings.tunnelSsh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCipher extends js.Object {
  var cipher: js.UndefOr[js.Array[String]] = js.undefined
  var compress: js.UndefOr[js.Array[String]] = js.undefined
  var hmac: js.UndefOr[js.Array[String]] = js.undefined
  var key: js.UndefOr[js.Array[String]] = js.undefined
  var serverHostKey: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonCipher {
  @scala.inline
  def apply(
    cipher: js.Array[String] = null,
    compress: js.Array[String] = null,
    hmac: js.Array[String] = null,
    key: js.Array[String] = null,
    serverHostKey: js.Array[String] = null
  ): AnonCipher = {
    val __obj = js.Dynamic.literal()
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (hmac != null) __obj.updateDynamic("hmac")(hmac.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (serverHostKey != null) __obj.updateDynamic("serverHostKey")(serverHostKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCipher]
  }
}

