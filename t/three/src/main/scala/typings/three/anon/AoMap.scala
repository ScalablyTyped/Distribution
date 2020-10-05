package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AoMap extends js.Object {
  var aoMap: IUniform = js.native
  var aoMapIntensity: IUniform = js.native
}

object AoMap {
  @scala.inline
  def apply(aoMap: IUniform, aoMapIntensity: IUniform): AoMap = {
    val __obj = js.Dynamic.literal(aoMap = aoMap.asInstanceOf[js.Any], aoMapIntensity = aoMapIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AoMap]
  }
  @scala.inline
  implicit class AoMapOps[Self <: AoMap] (val x: Self) extends AnyVal {
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
    def setAoMap(value: IUniform): Self = this.set("aoMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setAoMapIntensity(value: IUniform): Self = this.set("aoMapIntensity", value.asInstanceOf[js.Any])
  }
  
}

