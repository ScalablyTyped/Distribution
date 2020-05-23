package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialIndex extends js.Object {
  var count: Double
  var materialIndex: js.UndefOr[Double] = js.undefined
  var start: Double
}

object MaterialIndex {
  @scala.inline
  def apply(count: Double, start: Double, materialIndex: js.UndefOr[Double] = js.undefined): MaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(materialIndex)) __obj.updateDynamic("materialIndex")(materialIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndex]
  }
}

