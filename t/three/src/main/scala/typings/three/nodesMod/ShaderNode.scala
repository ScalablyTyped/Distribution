package typings.three.nodesMod

import typings.three.shaderNodeMod.NodeObjects_
import typings.three.shaderNodeMod.NodeRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "ShaderNode")
@js.native
open class ShaderNode[T, R /* <: Node */] protected ()
  extends typings.three.shaderNodeElementsMod.ShaderNode[T, R] {
  def this(jsFunc: js.Function2[/* inputs */ NodeObjects_[T], /* builder */ NodeBuilder, NodeRepresentation[Node]]) = this()
}
