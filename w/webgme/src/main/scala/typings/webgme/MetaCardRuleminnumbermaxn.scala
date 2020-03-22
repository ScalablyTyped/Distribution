package typings.webgme

import typings.webgme.GmeCommon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined webgme.GmeCommon.MetaCardRule & {  min  :number,   max  :number} */
trait MetaCardRuleminnumbermaxn extends js.Object {
  var items: js.Array[Path]
  var max: Double
  var maxItems: js.Array[Double]
  var min: Double
  var minItems: js.Array[Double]
}

object MetaCardRuleminnumbermaxn {
  @scala.inline
  def apply(
    items: js.Array[Path],
    max: Double,
    maxItems: js.Array[Double],
    min: Double,
    minItems: js.Array[Double]
  ): MetaCardRuleminnumbermaxn = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaCardRuleminnumbermaxn]
  }
}

