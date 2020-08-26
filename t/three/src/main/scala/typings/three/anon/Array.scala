package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var array: js.Array[Double] = js.native
  var itemSize: Double = js.native
  var normalized: Boolean = js.native
  var `type`: String = js.native
}

object Array {
  @scala.inline
  def apply(array: js.Array[Double], itemSize: Double, normalized: Boolean, `type`: String): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
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
    def setArrayVarargs(value: Double*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[Double]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemSize(value: Double): Self = this.set("itemSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalized(value: Boolean): Self = this.set("normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

