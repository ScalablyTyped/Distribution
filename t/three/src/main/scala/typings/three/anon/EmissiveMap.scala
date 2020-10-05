package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmissiveMap extends js.Object {
  var emissiveMap: IUniform = js.native
}

object EmissiveMap {
  @scala.inline
  def apply(emissiveMap: IUniform): EmissiveMap = {
    val __obj = js.Dynamic.literal(emissiveMap = emissiveMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmissiveMap]
  }
  @scala.inline
  implicit class EmissiveMapOps[Self <: EmissiveMap] (val x: Self) extends AnyVal {
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
    def setEmissiveMap(value: IUniform): Self = this.set("emissiveMap", value.asInstanceOf[js.Any])
  }
  
}

