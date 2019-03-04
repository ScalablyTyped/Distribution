package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var scale: js.Tuple2[scala.Double, scala.Double]
  var translate: js.Tuple2[scala.Double, scala.Double]
}

object Transform {
  @scala.inline
  def apply(scale: js.Tuple2[scala.Double, scala.Double], translate: js.Tuple2[scala.Double, scala.Double]): Transform = {
    val __obj = js.Dynamic.literal(scale = scale, translate = translate)
  
    __obj.asInstanceOf[Transform]
  }
}

