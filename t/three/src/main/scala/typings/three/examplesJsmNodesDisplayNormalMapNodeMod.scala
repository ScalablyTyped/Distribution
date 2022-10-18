package typings.three

import typings.three.srcConstantsMod.NormalMapTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayNormalMapNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/NormalMapNode", JSImport.Default)
  @js.native
  open class default protected () extends NormalMapNode {
    def this(node: typings.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(
      node: typings.three.examplesJsmNodesCoreNodeMod.default,
      scaleNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @js.native
  trait NormalMapNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var node: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var normalMapType: NormalMapTypes = js.native
    
    var scaleNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
  }
}
