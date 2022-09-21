package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.anon.F0
import typings.three.nodesMod.Node
import typings.three.shaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brdfGGXMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/BSDF/BRDF_GGX", JSImport.Default)
  @js.native
  val default: ShaderNode[F0, Node] = js.native
  
  type _To = ShaderNode[F0, Node]
  
  /* This means you don't have to write `default`, but can instead just say `brdfGGXMod.foo` */
  override def _to: ShaderNode[F0, Node] = default
}
