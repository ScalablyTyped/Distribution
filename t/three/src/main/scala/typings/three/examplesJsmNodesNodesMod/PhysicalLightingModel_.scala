package typings.three.examplesJsmNodesNodesMod

import typings.three.anon.AmbientOcclusion
import typings.three.anon.IblIrradiance
import typings.three.anon.Irradiance
import typings.three.anon.LightColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhysicalLightingModel_ {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.ambientOcclusion")
  @js.native
  def ambientOcclusion: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[AmbientOcclusion, Node] = js.native
  inline def ambientOcclusion_=(
    x: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[AmbientOcclusion, Node]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ambientOcclusion")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.direct")
  @js.native
  def direct: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[LightColor, Node] = js.native
  inline def direct_=(x: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[LightColor, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direct")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.indirectDiffuse")
  @js.native
  def indirectDiffuse: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Irradiance, Node] = js.native
  inline def indirectDiffuse_=(x: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Irradiance, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectDiffuse")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PhysicalLightingModel.indirectSpecular")
  @js.native
  def indirectSpecular: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[IblIrradiance, Node] = js.native
  inline def indirectSpecular_=(x: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[IblIrradiance, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectSpecular")(x.asInstanceOf[js.Any])
}
