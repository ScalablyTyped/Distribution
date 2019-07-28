package typings.xmldsigjs.xmldsigjsMod

import typings.std.AlgorithmIdentifier
import typings.std.RsaPssParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPSSSignParams extends RsaPssParams {
  var hash: AlgorithmIdentifier
}

object RsaPSSSignParams {
  @scala.inline
  def apply(hash: AlgorithmIdentifier, name: String, saltLength: Double): RsaPSSSignParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name, saltLength = saltLength)
  
    __obj.asInstanceOf[RsaPSSSignParams]
  }
}

