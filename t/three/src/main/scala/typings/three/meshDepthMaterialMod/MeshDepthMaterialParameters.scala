package typings.three.meshDepthMaterialMod

import typings.three.constantsMod.DepthPackingStrategies
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshDepthMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  var depthPacking: js.UndefOr[DepthPackingStrategies] = js.native
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Texture | Null] = js.native
  var wireframe: js.UndefOr[Boolean] = js.native
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}

object MeshDepthMaterialParameters {
  @scala.inline
  def apply(): MeshDepthMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshDepthMaterialParameters]
  }
  @scala.inline
  implicit class MeshDepthMaterialParametersOps[Self <: MeshDepthMaterialParameters] (val x: Self) extends AnyVal {
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
    def setAlphaMap(value: Texture): Self = this.set("alphaMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaMap: Self = this.set("alphaMap", js.undefined)
    @scala.inline
    def setAlphaMapNull: Self = this.set("alphaMap", null)
    @scala.inline
    def setDepthPacking(value: DepthPackingStrategies): Self = this.set("depthPacking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthPacking: Self = this.set("depthPacking", js.undefined)
    @scala.inline
    def setDisplacementBias(value: Double): Self = this.set("displacementBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplacementBias: Self = this.set("displacementBias", js.undefined)
    @scala.inline
    def setDisplacementMap(value: Texture): Self = this.set("displacementMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplacementMap: Self = this.set("displacementMap", js.undefined)
    @scala.inline
    def setDisplacementMapNull: Self = this.set("displacementMap", null)
    @scala.inline
    def setDisplacementScale(value: Double): Self = this.set("displacementScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplacementScale: Self = this.set("displacementScale", js.undefined)
    @scala.inline
    def setMap(value: Texture): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    @scala.inline
    def setWireframe(value: Boolean): Self = this.set("wireframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWireframe: Self = this.set("wireframe", js.undefined)
    @scala.inline
    def setWireframeLinewidth(value: Double): Self = this.set("wireframeLinewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWireframeLinewidth: Self = this.set("wireframeLinewidth", js.undefined)
  }
  
}

