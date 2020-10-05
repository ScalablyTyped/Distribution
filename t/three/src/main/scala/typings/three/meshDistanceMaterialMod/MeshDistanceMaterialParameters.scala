package typings.three.meshDistanceMaterialMod

import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshDistanceMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var farDistance: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Texture | Null] = js.native
  var nearDistance: js.UndefOr[Double] = js.native
  var referencePosition: js.UndefOr[Vector3] = js.native
}

object MeshDistanceMaterialParameters {
  @scala.inline
  def apply(): MeshDistanceMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshDistanceMaterialParameters]
  }
  @scala.inline
  implicit class MeshDistanceMaterialParametersOps[Self <: MeshDistanceMaterialParameters] (val x: Self) extends AnyVal {
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
    def setFarDistance(value: Double): Self = this.set("farDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFarDistance: Self = this.set("farDistance", js.undefined)
    @scala.inline
    def setMap(value: Texture): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    @scala.inline
    def setNearDistance(value: Double): Self = this.set("nearDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNearDistance: Self = this.set("nearDistance", js.undefined)
    @scala.inline
    def setReferencePosition(value: Vector3): Self = this.set("referencePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferencePosition: Self = this.set("referencePosition", js.undefined)
  }
  
}

