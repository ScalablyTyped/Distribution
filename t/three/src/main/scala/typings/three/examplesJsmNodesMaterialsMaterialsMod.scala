package typings.three

import typings.three.examplesJsmNodesMaterialsLineBasicNodeMaterialMod.default
import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.srcThreeMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsMaterialsMod {
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "LineBasicNodeMaterial")
  @js.native
  open class LineBasicNodeMaterial () extends default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "MeshBasicNodeMaterial")
  @js.native
  open class MeshBasicNodeMaterial ()
    extends typings.three.examplesJsmNodesMaterialsMeshBasicNodeMaterialMod.default {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "MeshPhysicalNodeMaterial")
  @js.native
  open class MeshPhysicalNodeMaterial protected ()
    extends typings.three.examplesJsmNodesMaterialsMeshPhysicalNodeMaterialMod.default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "MeshStandardNodeMaterial")
  @js.native
  open class MeshStandardNodeMaterial ()
    extends typings.three.examplesJsmNodesMaterialsMeshStandardNodeMaterialMod.default {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "NodeMaterial")
  @js.native
  open class NodeMaterial ()
    extends typings.three.examplesJsmNodesMaterialsNodeMaterialMod.default
  /* static members */
  object NodeMaterial {
    
    @JSImport("three/examples/jsm/nodes/materials/Materials", "NodeMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromMaterial(m: Material): typings.three.examplesJsmNodesMaterialsNodeMaterialMod.NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMaterial")(m.asInstanceOf[js.Any]).asInstanceOf[typings.three.examplesJsmNodesMaterialsNodeMaterialMod.NodeMaterial]
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "PointsNodeMaterial")
  @js.native
  open class PointsNodeMaterial ()
    extends typings.three.examplesJsmNodesMaterialsPointsNodeMaterialMod.default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "SpriteNodeMaterial")
  @js.native
  open class SpriteNodeMaterial ()
    extends typings.three.examplesJsmNodesMaterialsSpriteNodeMaterialMod.default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
}
