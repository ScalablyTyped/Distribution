package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.anon.Roughness
import typings.three.nodesMod.Node
import typings.three.shaderNodeElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRoughnessMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/material/getRoughness", JSImport.Default)
  @js.native
  val default: ShaderNode[Roughness, Node] = js.native
  
  type _To = ShaderNode[Roughness, Node]
  
  /* This means you don't have to write `default`, but can instead just say `getRoughnessMod.foo` */
  override def _to: ShaderNode[Roughness, Node] = default
}
