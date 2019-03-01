package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountMaterialIndex extends js.Object {
  var count: scala.Double
  var materialIndex: js.UndefOr[scala.Double] = js.undefined
  var start: scala.Double
}

object Anon_CountMaterialIndex {
  @scala.inline
  def apply(count: scala.Double, start: scala.Double, materialIndex: scala.Int | scala.Double = null): Anon_CountMaterialIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("start")(start)
    if (materialIndex != null) __obj.updateDynamic("materialIndex")(materialIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CountMaterialIndex]
  }
}

