package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountMaterialIndex extends js.Object {
  var count: Double
  var materialIndex: js.UndefOr[Double] = js.undefined
  var start: Double
}

object AnonCountMaterialIndex {
  @scala.inline
  def apply(count: Double, start: Double, materialIndex: Int | Double = null): AnonCountMaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (materialIndex != null) __obj.updateDynamic("materialIndex")(materialIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountMaterialIndex]
  }
}

