package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialIndex extends js.Object {
  var count: Double = js.native
  var materialIndex: js.UndefOr[Double] = js.native
  var start: Double = js.native
}

object MaterialIndex {
  @scala.inline
  def apply(count: Double, start: Double): MaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndex]
  }
  @scala.inline
  implicit class MaterialIndexOps[Self <: MaterialIndex] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterialIndex(value: Double): Self = this.set("materialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterialIndex: Self = this.set("materialIndex", js.undefined)
  }
  
}

