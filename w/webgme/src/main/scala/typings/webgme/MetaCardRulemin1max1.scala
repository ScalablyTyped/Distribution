package typings.webgme

import typings.webgme.GmeCommon.Path
import typings.webgme.webgmeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webgme.GmeCommon.MetaCardRule & {  min  :1,   max  :1} */
trait MetaCardRulemin1max1 extends js.Object {
  var items: js.Array[Path]
  var max: `1`
  var maxItems: js.Array[Double]
  var min: `1`
  var minItems: js.Array[Double]
}

object MetaCardRulemin1max1 {
  @scala.inline
  def apply(items: js.Array[Path], max: `1`, maxItems: js.Array[Double], min: `1`, minItems: js.Array[Double]): MetaCardRulemin1max1 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRulemin1max1]
  }
}

