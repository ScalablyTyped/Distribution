package typings.three.examplesJsmNodesNodesMod

import typings.three.threeStrings.fragment
import typings.three.threeStrings.vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeShaderStage {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeShaderStage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeShaderStage.FRAGMENT")
  @js.native
  def FRAGMENT: fragment = js.native
  inline def FRAGMENT_=(x: fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAGMENT")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeShaderStage.VERTEX")
  @js.native
  def VERTEX: vertex = js.native
  inline def VERTEX_=(x: vertex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX")(x.asInstanceOf[js.Any])
}
