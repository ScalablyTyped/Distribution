package typings.three.textGeometryMod

import typings.three.fontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextGeometryParameters extends js.Object {
  var bevelEnabled: js.UndefOr[Boolean] = js.native
  var bevelOffset: js.UndefOr[Double] = js.native
  var bevelSegments: js.UndefOr[Double] = js.native
  var bevelSize: js.UndefOr[Double] = js.native
  var bevelThickness: js.UndefOr[Double] = js.native
  var curveSegments: js.UndefOr[Double] = js.native
  var font: Font = js.native
  var height: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
}

object TextGeometryParameters {
  @scala.inline
  def apply(font: Font): TextGeometryParameters = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextGeometryParameters]
  }
  @scala.inline
  implicit class TextGeometryParametersOps[Self <: TextGeometryParameters] (val x: Self) extends AnyVal {
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setBevelEnabled(value: Boolean): Self = this.set("bevelEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelEnabled: Self = this.set("bevelEnabled", js.undefined)
    @scala.inline
    def setBevelOffset(value: Double): Self = this.set("bevelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelOffset: Self = this.set("bevelOffset", js.undefined)
    @scala.inline
    def setBevelSegments(value: Double): Self = this.set("bevelSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelSegments: Self = this.set("bevelSegments", js.undefined)
    @scala.inline
    def setBevelSize(value: Double): Self = this.set("bevelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelSize: Self = this.set("bevelSize", js.undefined)
    @scala.inline
    def setBevelThickness(value: Double): Self = this.set("bevelThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelThickness: Self = this.set("bevelThickness", js.undefined)
    @scala.inline
    def setCurveSegments(value: Double): Self = this.set("curveSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurveSegments: Self = this.set("curveSegments", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

