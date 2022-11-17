package typings.three

import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.srcThreeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMaterialsMeshGouraudMaterialMod {
  
  @JSImport("three/examples/jsm/materials/MeshGouraudMaterial", "MeshGouraudMaterial")
  @js.native
  open class MeshGouraudMaterial () extends ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
    
    def copy(source: MeshGouraudMaterial): this.type = js.native
    
    var isMeshGouraudMaterial: true = js.native
    
    @JSName("type")
    var type_MeshGouraudMaterial: "MeshGouraudMaterial" = js.native
  }
}
