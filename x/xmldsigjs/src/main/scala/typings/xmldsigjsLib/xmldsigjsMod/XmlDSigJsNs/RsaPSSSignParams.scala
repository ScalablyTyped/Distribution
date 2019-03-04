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
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name, saltLength = saltLength)
  
    __obj.asInstanceOf[RsaPSSSignParams]
  }
}

