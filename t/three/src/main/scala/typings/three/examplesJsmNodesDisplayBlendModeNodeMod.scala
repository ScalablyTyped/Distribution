package typings.three

import typings.three.anon.Base
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesDisplayBlendModeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/BlendModeNode", JSImport.Default)
  @js.native
  open class default protected () extends BlendModeNode {
    def this(blendMode: BlendMode, baseNode: Node, blendNode: Node) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/display/BlendModeNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "default.BURN")
    @js.native
    def BURN: "burn" = js.native
    inline def BURN_=(x: "burn"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BURN")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "default.DODGE")
    @js.native
    def DODGE: "dodge" = js.native
    inline def DODGE_=(x: "dodge"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DODGE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "default.OVERLAY")
    @js.native
    def OVERLAY: "overlay" = js.native
    inline def OVERLAY_=(x: "overlay"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVERLAY")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "default.SCREEN")
    @js.native
    def SCREEN: "screen" = js.native
    inline def SCREEN_=(x: "screen"): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "BurnNode")
  @js.native
  val BurnNode: ShaderNode[Base, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "DodgeNode")
  @js.native
  val DodgeNode: ShaderNode[Base, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "OverlayNode")
  @js.native
  val OverlayNode: ShaderNode[Base, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/display/BlendModeNode", "ScreenNode")
  @js.native
  val ScreenNode: ShaderNode[Base, Node] = js.native
  
  type BlendMode = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlendModeNode.BURN */ Any
  
  @js.native
  trait BlendModeNode
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var baseNode: Node = js.native
    
    var blendMode: BlendMode = js.native
    
    var blendNode: Node = js.native
    
    def construct(): Node = js.native
  }
}
