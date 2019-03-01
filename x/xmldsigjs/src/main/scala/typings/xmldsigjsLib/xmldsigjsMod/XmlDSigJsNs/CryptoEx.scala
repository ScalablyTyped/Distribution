package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoEx
  extends stdLib.Crypto {
  var name: java.lang.String
}

object CryptoEx {
  @scala.inline
  def apply(getRandomValues: js.Function1[js.Any, js.Any], name: java.lang.String, subtle: stdLib.SubtleCrypto): CryptoEx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRandomValues")(getRandomValues)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("subtle")(subtle)
    __obj.asInstanceOf[CryptoEx]
  }
}

