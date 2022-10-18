package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.anon.DiffuseColor
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFunctionsBsdfBrdfLambertMod extends Shortcut {
  
  @JSImport("three/examples/jsm/nodes/functions/BSDF/BRDF_Lambert", JSImport.Default)
  @js.native
  val default: ShaderNode[DiffuseColor, Node] = js.native
  
  type _To = ShaderNode[DiffuseColor, Node]
  
  /* This means you don't have to write `default`, but can instead just say `examplesJsmNodesFunctionsBsdfBrdfLambertMod.foo` */
  override def _to: ShaderNode[DiffuseColor, Node] = default
}
