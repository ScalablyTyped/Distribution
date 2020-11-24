package typings.three.shaderMaterialMod

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Derivatives
import typings.three.constantsMod.GLSLVersion
import typings.three.materialMod.MaterialParameters
import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderMaterialParameters extends MaterialParameters {
  
  var clipping: js.UndefOr[Boolean] = js.native
  
  var extensions: js.UndefOr[Derivatives] = js.native
  
  var fragmentShader: js.UndefOr[String] = js.native
  
  var glslVersion: js.UndefOr[GLSLVersion] = js.native
  
  var lights: js.UndefOr[Boolean] = js.native
  
  var linewidth: js.UndefOr[Double] = js.native
  
  var morphNormals: js.UndefOr[Boolean] = js.native
  
  var morphTargets: js.UndefOr[Boolean] = js.native
  
  var skinning: js.UndefOr[Boolean] = js.native
  
  var uniforms: js.UndefOr[StringDictionary[IUniform]] = js.native
  
  var vertexShader: js.UndefOr[String] = js.native
  
  var wireframe: js.UndefOr[Boolean] = js.native
  
  var wireframeLinewidth: js.UndefOr[Double] = js.native
}
object ShaderMaterialParameters {
  
  @scala.inline
  def apply(): ShaderMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaderMaterialParameters]
  }
  
  @scala.inline
  implicit class ShaderMaterialParametersOps[Self <: ShaderMaterialParameters] (val x: Self) extends AnyVal {
    
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
    def setClipping(value: Boolean): Self = this.set("clipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipping: Self = this.set("clipping", js.undefined)
    
    @scala.inline
    def setExtensions(value: Derivatives): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFragmentShader(value: String): Self = this.set("fragmentShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentShader: Self = this.set("fragmentShader", js.undefined)
    
    @scala.inline
    def setGlslVersion(value: GLSLVersion): Self = this.set("glslVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlslVersion: Self = this.set("glslVersion", js.undefined)
    
    @scala.inline
    def setLights(value: Boolean): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLights: Self = this.set("lights", js.undefined)
    
    @scala.inline
    def setLinewidth(value: Double): Self = this.set("linewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinewidth: Self = this.set("linewidth", js.undefined)
    
    @scala.inline
    def setMorphNormals(value: Boolean): Self = this.set("morphNormals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMorphNormals: Self = this.set("morphNormals", js.undefined)
    
    @scala.inline
    def setMorphTargets(value: Boolean): Self = this.set("morphTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMorphTargets: Self = this.set("morphTargets", js.undefined)
    
    @scala.inline
    def setSkinning(value: Boolean): Self = this.set("skinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkinning: Self = this.set("skinning", js.undefined)
    
    @scala.inline
    def setUniforms(value: StringDictionary[IUniform]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
    
    @scala.inline
    def setVertexShader(value: String): Self = this.set("vertexShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexShader: Self = this.set("vertexShader", js.undefined)
    
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
