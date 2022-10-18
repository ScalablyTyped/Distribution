package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.anon.DotVH
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFunctionsBsdfFSchlickMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/BSDF/F_Schlick", JSImport.Default)
  @js.native
  val default: ShaderNode[DotVH, Node] = js.native
  
  type _To = ShaderNode[DotVH, Node]
  
  /* This means you don't have to write `default`, but can instead just say `examplesJsmNodesFunctionsBsdfFSchlickMod.foo` */
  override def _to: ShaderNode[DotVH, Node] = default
}
