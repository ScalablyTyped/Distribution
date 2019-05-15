package typings
package tunnelDashSshLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cipher extends js.Object {
  var cipher: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var compress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hmac: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var serverHostKey: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Cipher {
  @scala.inline
  def apply(
    cipher: js.Array[java.lang.String] = null,
    compress: js.Array[java.lang.String] = null,
    hmac: js.Array[java.lang.String] = null,
    key: js.Array[java.lang.String] = null,
    serverHostKey: js.Array[java.lang.String] = null
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

