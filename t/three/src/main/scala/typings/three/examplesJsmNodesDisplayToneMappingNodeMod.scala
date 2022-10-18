package typings.three

import typings.three.srcConstantsMod.ToneMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayToneMappingNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/ToneMappingNode", JSImport.Default)
  @js.native
  open class default protected () extends ToneMappingNode {
    def this(toneMapping: ToneMapping) = this()
    def this(toneMapping: ToneMapping, exposureNode: typings.three.examplesJsmNodesCoreNodeMod.default) = this()
    def this(
      toneMapping: ToneMapping,
      exposureNode: Unit,
      colorNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
    def this(
      toneMapping: ToneMapping,
      exposureNode: typings.three.examplesJsmNodesCoreNodeMod.default,
      colorNode: typings.three.examplesJsmNodesCoreNodeMod.default
    ) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/display/ToneMappingNode", "LinearToneMappingNode")
  @js.native
  val LinearToneMappingNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
  
  @js.native
  trait ToneMappingNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var colorNode: typings.three.examplesJsmNodesCoreNodeMod.default | Null = js.native
    
    var exposureNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var toneMapping: ToneMapping = js.native
  }
}
