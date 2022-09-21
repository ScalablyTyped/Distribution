package typings.three

import typings.three.shaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import typings.three.threeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshGouraudMaterialMod {
  
  @JSImport("three/examples/jsm/materials/MeshGouraudMaterial", "MeshGouraudMaterial")
  @js.native
  open class MeshGouraudMaterial () extends ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
    
    def copy(source: MeshGouraudMaterial): this.type = js.native
    
    var isMeshGouraudMaterial: `true` = js.native
    
    @JSName("type")
    var type_MeshGouraudMaterial: typings.three.threeStrings.MeshGouraudMaterial = js.native
  }
}
