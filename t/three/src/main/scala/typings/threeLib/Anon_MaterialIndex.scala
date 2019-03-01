package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaterialIndex extends js.Object {
  var materialIndex: scala.Double
  var start: scala.Double
}

object Anon_MaterialIndex {
  @scala.inline
  def apply(materialIndex: scala.Double, start: scala.Double): Anon_MaterialIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("materialIndex")(materialIndex)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_MaterialIndex]
  }
}

