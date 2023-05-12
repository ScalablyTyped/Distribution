package typings.three

import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsLineBasicNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/LineBasicNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends LineBasicNodeMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait LineBasicNodeMaterial
    extends typings.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    def copy(source: LineBasicNodeMaterial): this.type = js.native
    
    var isLineBasicNodeMaterial: `true` = js.native
  }
}
