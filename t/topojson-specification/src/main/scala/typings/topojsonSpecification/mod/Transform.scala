package typings.topojsonSpecification.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  var scale: js.Tuple2[Double, Double] = js.native
  var translate: js.Tuple2[Double, Double] = js.native
}

object Transform {
  @scala.inline
  def apply(scale: js.Tuple2[Double, Double], translate: js.Tuple2[Double, Double]): Transform = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScale(value: js.Tuple2[Double, Double]): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslate(value: js.Tuple2[Double, Double]): Self = this.set("translate", value.asInstanceOf[js.Any])
  }
  
}

