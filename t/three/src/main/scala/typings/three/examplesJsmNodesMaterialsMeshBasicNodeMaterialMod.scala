package typings.three

import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsMeshBasicNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/MeshBasicNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends MeshBasicNodeMaterial {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait MeshBasicNodeMaterial
    extends typings.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    def copy(source: MeshBasicNodeMaterial): this.type = js.native
    
    var isMeshBasicNodeMaterial: `true` = js.native
  }
}
