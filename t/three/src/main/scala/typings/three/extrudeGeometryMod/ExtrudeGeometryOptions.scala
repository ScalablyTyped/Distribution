package typings.three.extrudeGeometryMod

import typings.three.curveMod.Curve
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtrudeGeometryOptions extends js.Object {
  var UVGenerator: js.UndefOr[typings.three.extrudeGeometryMod.UVGenerator] = js.native
  var bevelEnabled: js.UndefOr[Boolean] = js.native
  var bevelOffset: js.UndefOr[Double] = js.native
  var bevelSegments: js.UndefOr[Double] = js.native
  var bevelSize: js.UndefOr[Double] = js.native
  var bevelThickness: js.UndefOr[Double] = js.native
  var curveSegments: js.UndefOr[Double] = js.native
  var depth: js.UndefOr[Double] = js.native
  var extrudePath: js.UndefOr[Curve[Vector3]] = js.native
  var steps: js.UndefOr[Double] = js.native
}

object ExtrudeGeometryOptions {
  @scala.inline
  def apply(): ExtrudeGeometryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudeGeometryOptions]
  }
  @scala.inline
  implicit class ExtrudeGeometryOptionsOps[Self <: ExtrudeGeometryOptions] (val x: Self) extends AnyVal {
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
    def setUVGenerator(value: UVGenerator): Self = this.set("UVGenerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUVGenerator: Self = this.set("UVGenerator", js.undefined)
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setExtrudePath(value: Curve[Vector3]): Self = this.set("extrudePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrudePath: Self = this.set("extrudePath", js.undefined)
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

