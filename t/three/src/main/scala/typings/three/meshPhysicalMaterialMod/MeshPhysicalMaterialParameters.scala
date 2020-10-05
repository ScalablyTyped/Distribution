package typings.three.meshPhysicalMaterialMod

import typings.three.colorMod.Color
import typings.three.meshStandardMaterialMod.MeshStandardMaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshPhysicalMaterialParameters extends MeshStandardMaterialParameters {
  var clearcoat: js.UndefOr[Double] = js.native
  var clearcoatMap: Texture | Null = js.native
  var clearcoatNormalMap: js.UndefOr[Texture | Null] = js.native
  var clearcoatNormalScale: js.UndefOr[Vector2] = js.native
  var clearcoatRoughness: js.UndefOr[Double] = js.native
  var clearcoatRoughnessMap: Texture | Null = js.native
  var reflectivity: js.UndefOr[Double] = js.native
  var sheen: js.UndefOr[Color] = js.native
  var transmission: js.UndefOr[Double] = js.native
  var transmissionMap: js.UndefOr[Texture | Null] = js.native
}

object MeshPhysicalMaterialParameters {
  @scala.inline
  def apply(): MeshPhysicalMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshPhysicalMaterialParameters]
  }
  @scala.inline
  implicit class MeshPhysicalMaterialParametersOps[Self <: MeshPhysicalMaterialParameters] (val x: Self) extends AnyVal {
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
    def setClearcoat(value: Double): Self = this.set("clearcoat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearcoat: Self = this.set("clearcoat", js.undefined)
    @scala.inline
    def setClearcoatMap(value: Texture): Self = this.set("clearcoatMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearcoatMapNull: Self = this.set("clearcoatMap", null)
    @scala.inline
    def setClearcoatNormalMap(value: Texture): Self = this.set("clearcoatNormalMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearcoatNormalMap: Self = this.set("clearcoatNormalMap", js.undefined)
    @scala.inline
    def setClearcoatNormalMapNull: Self = this.set("clearcoatNormalMap", null)
    @scala.inline
    def setClearcoatNormalScale(value: Vector2): Self = this.set("clearcoatNormalScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearcoatNormalScale: Self = this.set("clearcoatNormalScale", js.undefined)
    @scala.inline
    def setClearcoatRoughness(value: Double): Self = this.set("clearcoatRoughness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearcoatRoughness: Self = this.set("clearcoatRoughness", js.undefined)
    @scala.inline
    def setClearcoatRoughnessMap(value: Texture): Self = this.set("clearcoatRoughnessMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearcoatRoughnessMapNull: Self = this.set("clearcoatRoughnessMap", null)
    @scala.inline
    def setReflectivity(value: Double): Self = this.set("reflectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReflectivity: Self = this.set("reflectivity", js.undefined)
    @scala.inline
    def setSheen(value: Color): Self = this.set("sheen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheen: Self = this.set("sheen", js.undefined)
    @scala.inline
    def setTransmission(value: Double): Self = this.set("transmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransmission: Self = this.set("transmission", js.undefined)
    @scala.inline
    def setTransmissionMap(value: Texture): Self = this.set("transmissionMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransmissionMap: Self = this.set("transmissionMap", js.undefined)
    @scala.inline
    def setTransmissionMapNull: Self = this.set("transmissionMap", null)
  }
  
}

