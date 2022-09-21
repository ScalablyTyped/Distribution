package typings.three.nodesMod

import typings.three.threeStrings.fragment
import typings.three.threeStrings.vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeShaderStage {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeShaderStage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeShaderStage.Fragment")
  @js.native
  def Fragment: fragment = js.native
  inline def Fragment_=(x: fragment): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeShaderStage.Vertex")
  @js.native
  def Vertex: vertex = js.native
  inline def Vertex_=(x: vertex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertex")(x.asInstanceOf[js.Any])
}
