package typings.three

import typings.three.lineBasicNodeMaterialMod.default
import typings.three.shaderMaterialMod.ShaderMaterialParameters
import typings.three.threeMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsMod {
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "LineBasicNodeMaterial")
  @js.native
  open class LineBasicNodeMaterial () extends default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "MeshBasicNodeMaterial")
  @js.native
  open class MeshBasicNodeMaterial ()
    extends typings.three.meshBasicNodeMaterialMod.default {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "MeshPhysicalNodeMaterial")
  @js.native
  open class MeshPhysicalNodeMaterial protected ()
    extends typings.three.meshPhysicalNodeMaterialMod.default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "MeshStandardNodeMaterial")
  @js.native
  open class MeshStandardNodeMaterial ()
    extends typings.three.meshStandardNodeMaterialMod.default {
    def this(paramters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "NodeMaterial")
  @js.native
  open class NodeMaterial ()
    extends typings.three.nodeMaterialMod.default
  /* static members */
  object NodeMaterial {
    
    @JSImport("three/examples/jsm/nodes/materials/Materials", "NodeMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromMaterial(m: Material): typings.three.nodeMaterialMod.NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMaterial")(m.asInstanceOf[js.Any]).asInstanceOf[typings.three.nodeMaterialMod.NodeMaterial]
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "PointsNodeMaterial")
  @js.native
  open class PointsNodeMaterial ()
    extends typings.three.pointsNodeMaterialMod.default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/materials/Materials", "SpriteNodeMaterial")
  @js.native
  open class SpriteNodeMaterial ()
    extends typings.three.spriteNodeMaterialMod.default {
    def this(parameters: ShaderMaterialParameters) = this()
  }
}
