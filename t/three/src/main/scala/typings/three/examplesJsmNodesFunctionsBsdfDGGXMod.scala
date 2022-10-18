package typings.three

import org.scalablytyped.runtime.Shortcut
import typings.three.anon.Alpha
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesFunctionsBsdfDGGXMod extends Shortcut {
  
  // Microfacet Models for Refraction through Rough Surfaces - equation (33)
  // http://graphicrants.blogspot.com/2013/08/specular-brdf-reference.html
  // alpha is "roughness squared" in Disney’s reparameterization
  @JSImport("three/examples/jsm/nodes/functions/BSDF/D_GGX", JSImport.Default)
  @js.native
  val default: ShaderNode[Alpha, Node] = js.native
  
  type _To = ShaderNode[Alpha, Node]
  
  /* This means you don't have to write `default`, but can instead just say `examplesJsmNodesFunctionsBsdfDGGXMod.foo` */
  override def _to: ShaderNode[Alpha, Node] = default
}
