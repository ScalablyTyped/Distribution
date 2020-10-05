package typings.three.webGLCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLCapabilitiesParameters extends js.Object {
  var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native
  var precision: js.UndefOr[String] = js.native
}

object WebGLCapabilitiesParameters {
  @scala.inline
  def apply(): WebGLCapabilitiesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLCapabilitiesParameters]
  }
  @scala.inline
  implicit class WebGLCapabilitiesParametersOps[Self <: WebGLCapabilitiesParameters] (val x: Self) extends AnyVal {
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
    def setLogarithmicDepthBuffer(value: Boolean): Self = this.set("logarithmicDepthBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogarithmicDepthBuffer: Self = this.set("logarithmicDepthBuffer", js.undefined)
    @scala.inline
    def setPrecision(value: String): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
  }
  
}

