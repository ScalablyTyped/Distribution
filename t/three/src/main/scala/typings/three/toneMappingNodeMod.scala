package typings.three

import typings.three.srcConstantsMod.ToneMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toneMappingNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/ToneMappingNode", JSImport.Default)
  @js.native
  open class default protected () extends ToneMappingNode {
    def this(toneMapping: ToneMapping) = this()
    def this(toneMapping: ToneMapping, exposureNode: typings.three.nodeMod.default) = this()
    def this(toneMapping: ToneMapping, exposureNode: Unit, colorNode: typings.three.nodeMod.default) = this()
    def this(
      toneMapping: ToneMapping,
      exposureNode: typings.three.nodeMod.default,
      colorNode: typings.three.nodeMod.default
    ) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/display/ToneMappingNode", "LinearToneMappingNode")
  @js.native
  val LinearToneMappingNode: typings.three.nodeMod.default = js.native
  
  @js.native
  trait ToneMappingNode
    extends typings.three.tempNodeMod.default {
    
    var colorNode: typings.three.nodeMod.default | Null = js.native
    
    var exposureNode: typings.three.nodeMod.default = js.native
    
    var toneMapping: ToneMapping = js.native
  }
}
