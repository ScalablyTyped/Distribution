package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalMap extends js.Object {
  var normalMap: IUniform = js.native
  var normalScale: IUniform = js.native
}

object NormalMap {
  @scala.inline
  def apply(normalMap: IUniform, normalScale: IUniform): NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap.asInstanceOf[js.Any], normalScale = normalScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalMap]
  }
  @scala.inline
  implicit class NormalMapOps[Self <: NormalMap] (val x: Self) extends AnyVal {
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
    def setNormalMap(value: IUniform): Self = this.set("normalMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalScale(value: IUniform): Self = this.set("normalScale", value.asInstanceOf[js.Any])
  }
  
}

