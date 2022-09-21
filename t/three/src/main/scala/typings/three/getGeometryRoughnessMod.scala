package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.nodesMod.Node
import typings.three.shaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGeometryRoughnessMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/material/getGeometryRoughness", JSImport.Default)
  @js.native
  val default: ShaderNode[js.Object, Node] = js.native
  
  type _To = ShaderNode[js.Object, Node]
  
  /* This means you don't have to write `default`, but can instead just say `getGeometryRoughnessMod.foo` */
  override def _to: ShaderNode[js.Object, Node] = default
}
