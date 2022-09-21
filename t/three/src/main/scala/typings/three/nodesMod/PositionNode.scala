package typings.three.nodesMod

import typings.three.positionNodeMod.PositionNodeScope
import typings.three.positionNodeMod.default
import typings.three.threeStrings.geometry
import typings.three.threeStrings.local
import typings.three.threeStrings.view
import typings.three.threeStrings.viewDirection
import typings.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "PositionNode")
@js.native
open class PositionNode () extends default {
  def this(scope: PositionNodeScope) = this()
}
/* static members */
object PositionNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.GEOMETRY")
  @js.native
  def GEOMETRY: geometry = js.native
  inline def GEOMETRY_=(x: geometry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.LOCAL")
  @js.native
  def LOCAL: local = js.native
  inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.VIEW")
  @js.native
  def VIEW: view = js.native
  inline def VIEW_=(x: view): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.VIEW_DIRECTION")
  @js.native
  def VIEW_DIRECTION: viewDirection = js.native
  inline def VIEW_DIRECTION_=(x: viewDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_DIRECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.WORLD")
  @js.native
  def WORLD: world = js.native
  inline def WORLD_=(x: world): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
}
