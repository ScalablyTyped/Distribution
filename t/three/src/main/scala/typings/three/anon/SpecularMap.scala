package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecularMap extends js.Object {
  var specularMap: IUniform = js.native
}

object SpecularMap {
  @scala.inline
  def apply(specularMap: IUniform): SpecularMap = {
    val __obj = js.Dynamic.literal(specularMap = specularMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecularMap]
  }
  @scala.inline
  implicit class SpecularMapOps[Self <: SpecularMap] (val x: Self) extends AnyVal {
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
    def setSpecularMap(value: IUniform): Self = this.set("specularMap", value.asInstanceOf[js.Any])
  }
  
}

