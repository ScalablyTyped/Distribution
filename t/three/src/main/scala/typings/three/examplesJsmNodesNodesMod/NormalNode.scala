package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesAccessorsNormalNodeMod.NormalNodeScope
import typings.three.examplesJsmNodesAccessorsNormalNodeMod.default
import typings.three.threeStrings.geometry
import typings.three.threeStrings.local
import typings.three.threeStrings.view
import typings.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "NormalNode")
@js.native
open class NormalNode () extends default {
  def this(scope: NormalNodeScope) = this()
}
/* static members */
object NormalNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NormalNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NormalNode.GEOMETRY")
  @js.native
  def GEOMETRY: geometry = js.native
  inline def GEOMETRY_=(x: geometry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NormalNode.LOCAL")
  @js.native
  def LOCAL: local = js.native
  inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NormalNode.VIEW")
  @js.native
  def VIEW: view = js.native
  inline def VIEW_=(x: view): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NormalNode.WORLD")
  @js.native
  def WORLD: world = js.native
  inline def WORLD_=(x: world): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
}
