package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.anon.DotNL
import typings.three.nodesMod.Node
import typings.three.shaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vGGXSmithCorrelatedMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/BSDF/V_GGX_SmithCorrelated", JSImport.Default)
  @js.native
  val default: ShaderNode[DotNL, Node] = js.native
  
  type _To = ShaderNode[DotNL, Node]
  
  /* This means you don't have to write `default`, but can instead just say `vGGXSmithCorrelatedMod.foo` */
  override def _to: ShaderNode[DotNL, Node] = default
}
