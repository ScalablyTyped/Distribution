package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountMaterialIndex extends js.Object {
  var count: Double
  var materialIndex: js.UndefOr[Double] = js.undefined
  var start: Double
}

object Anon_CountMaterialIndex {
  @scala.inline
  def apply(count: Double, start: Double, materialIndex: Int | Double = null): Anon_CountMaterialIndex = {
    val __obj = js.Dynamic.literal(count = count, start = start)
    if (materialIndex != null) __obj.updateDynamic("materialIndex")(materialIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountMaterialIndex]
  }
}

