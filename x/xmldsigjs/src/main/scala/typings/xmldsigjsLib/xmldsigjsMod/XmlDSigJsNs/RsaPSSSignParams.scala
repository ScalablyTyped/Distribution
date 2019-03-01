package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPSSSignParams
  extends stdLib.RsaPssParams {
  var hash: stdLib.AlgorithmIdentifier
}

object RsaPSSSignParams {
  @scala.inline
  def apply(hash: stdLib.AlgorithmIdentifier, name: java.lang.String, saltLength: scala.Double): RsaPSSSignParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("saltLength")(saltLength)
    __obj.asInstanceOf[RsaPSSSignParams]
  }
}

