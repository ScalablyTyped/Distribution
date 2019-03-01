package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassificationInfo extends js.Object {
  var classification: TokenClass
  var length: scala.Double
}

object ClassificationInfo {
  @scala.inline
  def apply(classification: TokenClass, length: scala.Double): ClassificationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classification")(classification)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[ClassificationInfo]
  }
}

