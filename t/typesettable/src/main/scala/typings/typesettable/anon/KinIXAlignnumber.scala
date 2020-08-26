package typings.typesettable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in typesettable.typesettable/build/src/writers/writer.IXAlign ]: number} */
@js.native
trait KinIXAlignnumber extends js.Object {
  var center: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
}

object KinIXAlignnumber {
  @scala.inline
  def apply(center: Double, left: Double, right: Double): KinIXAlignnumber = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinIXAlignnumber]
  }
  @scala.inline
  implicit class KinIXAlignnumberOps[Self <: KinIXAlignnumber] (val x: Self) extends AnyVal {
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
    def setCenter(value: Double): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

