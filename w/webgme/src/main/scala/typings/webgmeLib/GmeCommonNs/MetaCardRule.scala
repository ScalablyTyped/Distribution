package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaCardRule extends js.Object {
  var items: js.Array[Path]
  var maxItems: js.Array[scala.Double]
  var minItems: js.Array[scala.Double]
}

object MetaCardRule {
  @scala.inline
  def apply(items: js.Array[Path], maxItems: js.Array[scala.Double], minItems: js.Array[scala.Double]): MetaCardRule = {
    val __obj = js.Dynamic.literal(items = items, maxItems = maxItems, minItems = minItems)
  
    __obj.asInstanceOf[MetaCardRule]
  }
}

