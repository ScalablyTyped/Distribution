package typings.typesettable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in typesettable.typesettable/build/src/writers/writer.IYAlign ]: number} */
@js.native
trait KinIYAlignnumber extends js.Object {
  var bottom: Double = js.native
  var center: Double = js.native
  var top: Double = js.native
}

object KinIYAlignnumber {
  @scala.inline
  def apply(bottom: Double, center: Double, top: Double): KinIYAlignnumber = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinIYAlignnumber]
  }
  @scala.inline
  implicit class KinIYAlignnumberOps[Self <: KinIYAlignnumber] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: Double): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

