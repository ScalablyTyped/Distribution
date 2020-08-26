package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BumpMap extends js.Object {
  var bumpMap: IUniform = js.native
  var bumpScale: IUniform = js.native
}

object BumpMap {
  @scala.inline
  def apply(bumpMap: IUniform, bumpScale: IUniform): BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpMap]
  }
  @scala.inline
  implicit class BumpMapOps[Self <: BumpMap] (val x: Self) extends AnyVal {
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
    def setBumpMap(value: IUniform): Self = this.set("bumpMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setBumpScale(value: IUniform): Self = this.set("bumpScale", value.asInstanceOf[js.Any])
  }
  
}

