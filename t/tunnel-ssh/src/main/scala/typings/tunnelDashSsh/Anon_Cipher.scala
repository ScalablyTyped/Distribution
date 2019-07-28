package typings.tunnelDashSsh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cipher extends js.Object {
  var cipher: js.UndefOr[js.Array[String]] = js.undefined
  var compress: js.UndefOr[js.Array[String]] = js.undefined
  var hmac: js.UndefOr[js.Array[String]] = js.undefined
  var key: js.UndefOr[js.Array[String]] = js.undefined
  var serverHostKey: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Cipher {
  @scala.inline
  def apply(
    cipher: js.Array[String] = null,
    compress: js.Array[String] = null,
    hmac: js.Array[String] = null,
    key: js.Array[String] = null,
    serverHostKey: js.Array[String] = null
  ): Anon_Cipher = {
    val __obj = js.Dynamic.literal()
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (compress != null) __obj.updateDynamic("compress")(compress)
    if (hmac != null) __obj.updateDynamic("hmac")(hmac)
    if (key != null) __obj.updateDynamic("key")(key)
    if (serverHostKey != null) __obj.updateDynamic("serverHostKey")(serverHostKey)
    __obj.asInstanceOf[Anon_Cipher]
  }
}

