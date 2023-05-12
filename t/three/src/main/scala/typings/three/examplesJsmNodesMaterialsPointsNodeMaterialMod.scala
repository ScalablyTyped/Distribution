package typings.three

import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialsPointsNodeMaterialMod {
  
  @JSImport("three/examples/jsm/nodes/materials/PointsNodeMaterial", JSImport.Default)
  @js.native
  open class default () extends PointsNodeMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  trait PointsNodeMaterial
    extends typings.three.examplesJsmNodesMaterialsNodeMaterialMod.default {
    
    @JSName("alphaTestNode")
    var alphaTestNode_PointsNodeMaterial: Node | Null = js.native
    
    @JSName("colorNode")
    var colorNode_PointsNodeMaterial: Node | Null = js.native
    
    def copy(source: PointsNodeMaterial): this.type = js.native
    
    var isPointsNodeMateria: `true` = js.native
    
    var lightNode: Node | Null = js.native
    
    @JSName("opacityNode")
    var opacityNode_PointsNodeMaterial: Node | Null = js.native
    
    @JSName("positionNode")
    var positionNode_PointsNodeMaterial: Node | Null = js.native
    
    var sizeNode: Node | Null = js.native
  }
}
