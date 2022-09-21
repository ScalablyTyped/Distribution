package typings.three.nodesMod

import typings.three.constantsMod.NodeTypeOption
import typings.three.nodeMod.default
import typings.three.shaderNodeMod.NodeOrType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "Node")
@js.native
abstract class Node ()
  extends default
     with NodeOrType {
  def this(nodeType: NodeTypeOption) = this()
}
