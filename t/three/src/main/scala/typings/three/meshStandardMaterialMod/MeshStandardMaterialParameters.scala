package typings.three.meshStandardMaterialMod

import typings.three.colorMod.Color
import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshStandardMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  var aoMap: js.UndefOr[Texture | Null] = js.native
  var aoMapIntensity: js.UndefOr[Double] = js.native
  var bumpMap: js.UndefOr[Texture | Null] = js.native
  var bumpScale: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Color | String | Double] = js.native
  var displacementBias: js.UndefOr[Double] = js.native
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  var displacementScale: js.UndefOr[Double] = js.native
  var emissive: js.UndefOr[Color | String | Double] = js.native
  var emissiveIntensity: js.UndefOr[Double] = js.native
  var emissiveMap: js.UndefOr[Texture | Null] = js.native
  var envMap: js.UndefOr[Texture | Null] = js.native
  var envMapIntensity: js.UndefOr[Double] = js.native
  var lightMap: js.UndefOr[Texture | Null] = js.native
  var lightMapIntensity: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Texture | Null] = js.native
  var metalness: js.UndefOr[Double] = js.native
  var metalnessMap: js.UndefOr[Texture | Null] = js.native
  var morphNormals: js.UndefOr[Boolean] = js.native
  var morphTargets: js.UndefOr[Boolean] = js.native
  var normalMap: js.UndefOr[Texture | Null] = js.native
  var normalMapType: js.UndefOr[NormalMapTypes] = js.native
  var normalScale: js.UndefOr[Vector2] = js.native
  var refractionRatio: js.UndefOr[Double] = js.native
  var roughness: js.UndefOr[Double] = js.native
  var roughnessMap: js.UndefOr[Texture | Null] = js.native
  var skinning: js.UndefOr[Boolean] = js.native
  var vertexTangents: js.UndefOr[Boolean] = js.native
  var wireframe: js.UndefOr[Boolean] = js.native
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}

object MeshStandardMaterialParameters {
  @scala.inline
  def apply(): MeshStandardMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshStandardMaterialParameters]
  }
  @scala.inline
  implicit class MeshStandardMaterialParametersOps[Self <: MeshStandardMaterialParameters] (val x: Self) extends AnyVal {
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
    def setAoMap(value: Texture): Self = this.set("aoMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAoMap: Self = this.set("aoMap", js.undefined)
    @scala.inline
    def setAoMapNull: Self = this.set("aoMap", null)
    @scala.inline
    def setAoMapIntensity(value: Double): Self = this.set("aoMapIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAoMapIntensity: Self = this.set("aoMapIntensity", js.undefined)
    @scala.inline
    def setBumpMap(value: Texture): Self = this.set("bumpMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBumpMap: Self = this.set("bumpMap", js.undefined)
    @scala.inline
    def setBumpMapNull: Self = this.set("bumpMap", null)
    @scala.inline
    def setBumpScale(value: Double): Self = this.set("bumpScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBumpScale: Self = this.set("bumpScale", js.undefined)
    @scala.inline
    def setColor(value: Color | String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
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
    def setEmissive(value: Color | String | Double): Self = this.set("emissive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmissive: Self = this.set("emissive", js.undefined)
    @scala.inline
    def setEmissiveIntensity(value: Double): Self = this.set("emissiveIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmissiveIntensity: Self = this.set("emissiveIntensity", js.undefined)
    @scala.inline
    def setEmissiveMap(value: Texture): Self = this.set("emissiveMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmissiveMap: Self = this.set("emissiveMap", js.undefined)
    @scala.inline
    def setEmissiveMapNull: Self = this.set("emissiveMap", null)
    @scala.inline
    def setEnvMap(value: Texture): Self = this.set("envMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvMap: Self = this.set("envMap", js.undefined)
    @scala.inline
    def setEnvMapNull: Self = this.set("envMap", null)
    @scala.inline
    def setEnvMapIntensity(value: Double): Self = this.set("envMapIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvMapIntensity: Self = this.set("envMapIntensity", js.undefined)
    @scala.inline
    def setLightMap(value: Texture): Self = this.set("lightMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightMap: Self = this.set("lightMap", js.undefined)
    @scala.inline
    def setLightMapNull: Self = this.set("lightMap", null)
    @scala.inline
    def setLightMapIntensity(value: Double): Self = this.set("lightMapIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightMapIntensity: Self = this.set("lightMapIntensity", js.undefined)
    @scala.inline
    def setMap(value: Texture): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    @scala.inline
    def setMetalness(value: Double): Self = this.set("metalness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetalness: Self = this.set("metalness", js.undefined)
    @scala.inline
    def setMetalnessMap(value: Texture): Self = this.set("metalnessMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetalnessMap: Self = this.set("metalnessMap", js.undefined)
    @scala.inline
    def setMetalnessMapNull: Self = this.set("metalnessMap", null)
    @scala.inline
    def setMorphNormals(value: Boolean): Self = this.set("morphNormals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMorphNormals: Self = this.set("morphNormals", js.undefined)
    @scala.inline
    def setMorphTargets(value: Boolean): Self = this.set("morphTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMorphTargets: Self = this.set("morphTargets", js.undefined)
    @scala.inline
    def setNormalMap(value: Texture): Self = this.set("normalMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalMap: Self = this.set("normalMap", js.undefined)
    @scala.inline
    def setNormalMapNull: Self = this.set("normalMap", null)
    @scala.inline
    def setNormalMapType(value: NormalMapTypes): Self = this.set("normalMapType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalMapType: Self = this.set("normalMapType", js.undefined)
    @scala.inline
    def setNormalScale(value: Vector2): Self = this.set("normalScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalScale: Self = this.set("normalScale", js.undefined)
    @scala.inline
    def setRefractionRatio(value: Double): Self = this.set("refractionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefractionRatio: Self = this.set("refractionRatio", js.undefined)
    @scala.inline
    def setRoughness(value: Double): Self = this.set("roughness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoughness: Self = this.set("roughness", js.undefined)
    @scala.inline
    def setRoughnessMap(value: Texture): Self = this.set("roughnessMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoughnessMap: Self = this.set("roughnessMap", js.undefined)
    @scala.inline
    def setRoughnessMapNull: Self = this.set("roughnessMap", null)
    @scala.inline
    def setSkinning(value: Boolean): Self = this.set("skinning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkinning: Self = this.set("skinning", js.undefined)
    @scala.inline
    def setVertexTangents(value: Boolean): Self = this.set("vertexTangents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexTangents: Self = this.set("vertexTangents", js.undefined)
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

