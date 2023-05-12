package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesDisplayViewportNodeMod.ViewportNodeScope
import typings.three.examplesJsmNodesDisplayViewportNodeMod.default
import typings.three.threeStrings.bottomLeft
import typings.three.threeStrings.bottomRight
import typings.three.threeStrings.coordinate
import typings.three.threeStrings.resolution
import typings.three.threeStrings.topLeft
import typings.three.threeStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode")
@js.native
open class ViewportNode protected () extends default {
  def this(scope: ViewportNodeScope) = this()
}
/* static members */
object ViewportNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode.BOTTOM_LEFT")
  @js.native
  def BOTTOM_LEFT: bottomLeft = js.native
  inline def BOTTOM_LEFT_=(x: bottomLeft): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode.BOTTOM_RIGHT")
  @js.native
  def BOTTOM_RIGHT: bottomRight = js.native
  inline def BOTTOM_RIGHT_=(x: bottomRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode.COORDINATE")
  @js.native
  def COORDINATE: coordinate = js.native
  inline def COORDINATE_=(x: coordinate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COORDINATE")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode.RESOLUTION")
  @js.native
  def RESOLUTION: resolution = js.native
  inline def RESOLUTION_=(x: resolution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESOLUTION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode.TOP_LEFT")
  @js.native
  def TOP_LEFT: topLeft = js.native
  inline def TOP_LEFT_=(x: topLeft): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ViewportNode.TOP_RIGHT")
  @js.native
  def TOP_RIGHT: topRight = js.native
  inline def TOP_RIGHT_=(x: topRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(x.asInstanceOf[js.Any])
}
