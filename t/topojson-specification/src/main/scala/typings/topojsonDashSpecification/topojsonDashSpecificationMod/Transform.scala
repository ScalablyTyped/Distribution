package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var scale: js.Tuple2[Double, Double]
  var translate: js.Tuple2[Double, Double]
}

object Transform {
  @scala.inline
  def apply(scale: js.Tuple2[Double, Double], translate: js.Tuple2[Double, Double]): Transform = {
    val __obj = js.Dynamic.literal(scale = scale, translate = translate)
  
    __obj.asInstanceOf[Transform]
  }
}

