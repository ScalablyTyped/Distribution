package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesDisplayBlendModeNodeMod.BlendMode
import typings.three.examplesJsmNodesDisplayBlendModeNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "BlendModeNode")
@js.native
open class BlendModeNode protected () extends default {
  def this(blendMode: BlendMode, baseNode: Node, blendNode: Node) = this()
}
/* static members */
object BlendModeNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "BlendModeNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "BlendModeNode.BURN")
  @js.native
  def BURN: typings.three.threeStrings.burn = js.native
  inline def BURN_=(x: typings.three.threeStrings.burn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BURN")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "BlendModeNode.DODGE")
  @js.native
  def DODGE: typings.three.threeStrings.dodge = js.native
  inline def DODGE_=(x: typings.three.threeStrings.dodge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DODGE")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "BlendModeNode.OVERLAY")
  @js.native
  def OVERLAY: typings.three.threeStrings.overlay = js.native
  inline def OVERLAY_=(x: typings.three.threeStrings.overlay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OVERLAY")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "BlendModeNode.SCREEN")
  @js.native
  def SCREEN: typings.three.threeStrings.screen = js.native
  inline def SCREEN_=(x: typings.three.threeStrings.screen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN")(x.asInstanceOf[js.Any])
}
