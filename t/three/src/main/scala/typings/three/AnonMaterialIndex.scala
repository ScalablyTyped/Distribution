package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaterialIndex extends js.Object {
  var count: Double
  var materialIndex: js.UndefOr[Double] = js.undefined
  var start: Double
}

object AnonMaterialIndex {
  @scala.inline
  def apply(count: Double, start: Double, materialIndex: Int | Double = null): AnonMaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (materialIndex != null) __obj.updateDynamic("materialIndex")(materialIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaterialIndex]
  }
}

