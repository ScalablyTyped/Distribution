package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaCardRule extends js.Object {
  var items: js.Array[Path]
  var maxItems: js.Array[Double]
  var minItems: js.Array[Double]
}

object MetaCardRule {
  @scala.inline
  def apply(items: js.Array[Path], maxItems: js.Array[Double], minItems: js.Array[Double]): MetaCardRule = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaCardRule]
  }
}

