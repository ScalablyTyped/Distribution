package typings.three.meshMatcapMaterialMod

import typings.three.colorMod.Color
import typings.three.constantsMod.NormalMapTypes
import typings.three.materialMod.MaterialParameters
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMatcapMaterialParameters extends MaterialParameters {
  
  var alphaMap: js.UndefOr[Texture | Null] = js.native
  
  var bumpMap: js.UndefOr[Texture | Null] = js.native
  
  var bumpScale: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[Color | String | Double] = js.native
  
  var displacementBias: js.UndefOr[Double] = js.native
  
  var displacementMap: js.UndefOr[Texture | Null] = js.native
  
  var displacementScale: js.UndefOr[Double] = js.native
  
  var map: js.UndefOr[Texture | Null] = js.native
  
  var matcap: js.UndefOr[Texture | Null] = js.native
  
  var morphNormals: js.UndefOr[Boolean] = js.native
  
  var morphTargets: js.UndefOr[Boolean] = js.native
  
  var normalMap: js.UndefOr[Texture | Null] = js.native
  
  var normalMapType: js.UndefOr[NormalMapTypes] = js.native
  
  var normalScale: js.UndefOr[Vector2] = js.native
  
  var skinning: js.UndefOr[Boolean] = js.native
}
object MeshMatcapMaterialParameters {
  
  @scala.inline
  def apply(): MeshMatcapMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMatcapMaterialParameters]
  }
  
  @scala.inline
  implicit class MeshMatcapMaterialParametersOps[Self <: MeshMatcapMaterialParameters] (val x: Self) extends AnyVal {
    
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
    def setMap(value: Texture): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    
    @scala.inline
    def setMatcap(value: Texture): Self = this.set("matcap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatcap: Self = this.set("matcap", js.undefined)
    
    @scala.inline
    def setMatcapNull: Self = this.set("matcap", null)
    
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
    def setSkinning(value: Boolean): Self = this.set("skinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinning: Self = this.set("skinning", js.undefined)
  }
}
