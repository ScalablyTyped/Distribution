package typings.three

import typings.three.anon.DiffuseColorNode
import typings.three.anon.OutgoingLightNode
import typings.three.threeBooleans.`true`
import typings.three.threeMod.Material
import typings.three.threeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/NodeMaterial", JSImport.Default)
  @js.native
  open class default () extends NodeMaterial
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/materials/NodeMaterial", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromMaterial(m: Material): NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMaterial")(m.asInstanceOf[js.Any]).asInstanceOf[NodeMaterial]
  }
  
  @js.native
  trait NodeMaterial extends ShaderMaterial {
    
    def build(builder: typings.three.nodeBuilderMod.default): Unit = js.native
    
    def generateDiffuseColor(builder: typings.three.nodeBuilderMod.default): Unit = js.native
    
    def generateLight(builder: typings.three.nodeBuilderMod.default, lights: DiffuseColorNode): Unit = js.native
    
    def generateOutput(builder: typings.three.nodeBuilderMod.default, lights: OutgoingLightNode): Unit = js.native
    
    def generatePosition(builder: typings.three.nodeBuilderMod.default): Unit = js.native
    
    var isNodeMaterial: `true` = js.native
    
    @JSName("lights")
    var lights_NodeMaterial: `true` = js.native
  }
}
