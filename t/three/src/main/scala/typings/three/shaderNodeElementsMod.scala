package typings.three

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayLike
import typings.three.anon.Alpha
import typings.three.anon.AmbientOcclusion
import typings.three.anon.Call
import typings.three.anon.CutoffDistance
import typings.three.anon.DiffuseColor
import typings.three.anon.DotNL
import typings.three.anon.DotVH
import typings.three.anon.F0
import typings.three.anon.IblIrradiance
import typings.three.anon.Irradiance
import typings.three.anon.LightColor
import typings.three.anon.Roughness
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.codeNodeMod.CodeNodeInclude
import typings.three.constantsMod.NodeTypeOption
import typings.three.constantsMod.NodeUserData
import typings.three.constantsMod.NodeValueOption
import typings.three.functionNodeMod.FunctionNodeArguments
import typings.three.lightingContextNodeMod.LightingModelNode
import typings.three.materialMod.Material
import typings.three.nodeBuilderMod.NodeBuilderContext
import typings.three.nodeMod.default
import typings.three.nodesMod.BufferNode
import typings.three.nodesMod.BypassNode
import typings.three.nodesMod.CameraNode
import typings.three.nodesMod.CheckerNode
import typings.three.nodesMod.CodeNode
import typings.three.nodesMod.ColorAdjustmentNode
import typings.three.nodesMod.ColorSpaceNode
import typings.three.nodesMod.ComputeNode
import typings.three.nodesMod.ContextNode
import typings.three.nodesMod.CubeTextureNode
import typings.three.nodesMod.ExpressionNode
import typings.three.nodesMod.FogNode
import typings.three.nodesMod.FogRangeNode
import typings.three.nodesMod.FrontFacingNode
import typings.three.nodesMod.FunctionCallNode
import typings.three.nodesMod.FunctionNode
import typings.three.nodesMod.InstanceIndexNode
import typings.three.nodesMod.InstanceNode
import typings.three.nodesMod.LightsNode
import typings.three.nodesMod.MatcapUVNode
import typings.three.nodesMod.MaterialNode
import typings.three.nodesMod.MaterialReferenceNode
import typings.three.nodesMod.MathNode
import typings.three.nodesMod.MaxMipLevelNode
import typings.three.nodesMod.ModelNode
import typings.three.nodesMod.ModelViewProjectionNode
import typings.three.nodesMod.Node
import typings.three.nodesMod.NodeBuilder
import typings.three.nodesMod.NormalMapNode
import typings.three.nodesMod.NormalNode
import typings.three.nodesMod.OscNode
import typings.three.nodesMod.PointUVNode
import typings.three.nodesMod.PositionNode
import typings.three.nodesMod.PropertyNode
import typings.three.nodesMod.ReferenceNode
import typings.three.nodesMod.ReflectVectorNode
import typings.three.nodesMod.RotateUVNode
import typings.three.nodesMod.SkinningNode
import typings.three.nodesMod.SpriteSheetUVNode
import typings.three.nodesMod.TimerNode
import typings.three.nodesMod.ToneMappingNode
import typings.three.nodesMod.UVNode
import typings.three.nodesMod.UserDataNode
import typings.three.nodesMod.VarNode
import typings.three.nodesMod.VaryNode
import typings.three.rangeNodeMod.RangeModeBound
import typings.three.shaderNodeBaseElementsMod.Binary
import typings.three.shaderNodeBaseElementsMod.Fn_
import typings.three.shaderNodeBaseElementsMod.Operator
import typings.three.shaderNodeBaseElementsMod.Ternary
import typings.three.shaderNodeBaseElementsMod.Unary
import typings.three.shaderNodeMod.ConstructedNode
import typings.three.shaderNodeMod.ConvertType
import typings.three.shaderNodeMod.GetConstructors
import typings.three.shaderNodeMod.GetConstructorsByScope
import typings.three.shaderNodeMod.GetPossibleScopes
import typings.three.shaderNodeMod.NodeArray_
import typings.three.shaderNodeMod.NodeObjectOption
import typings.three.shaderNodeMod.NodeObject_
import typings.three.shaderNodeMod.NodeObjects_
import typings.three.shaderNodeMod.NodeOrType
import typings.three.shaderNodeMod.NodeRepresentation
import typings.three.shaderNodeMod.ProxiedObject
import typings.three.shaderNodeMod.ProxiedTuple
import typings.three.shaderNodeMod.RemoveHeadAndTail
import typings.three.shaderNodeMod.RemoveTail
import typings.three.shaderNodeMod.Swizzable
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.ToneMapping
import typings.three.threeMod.CubeTexture
import typings.three.threeMod.InstancedMesh
import typings.three.threeMod.Light
import typings.three.threeMod.SkinnedMesh
import typings.three.threeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderNodeElementsMod {
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "BRDF_Lambert")
  @js.native
  val BRDFLambert: typings.three.shaderNodeBaseElementsMod.ShaderNode[DiffuseColor, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "BRDF_GGX")
  @js.native
  val BRDF_GGX: typings.three.shaderNodeBaseElementsMod.ShaderNode[F0, Node] = js.native
  
  // Analytical approximation of the DFG LUT, one half of the
  // split-sum approximation used in indirect specular lighting.
  // via 'environmentBRDF' from "Physically Based Shading on Mobile"
  // https://www.unrealengine.com/blog/physically-based-shading-on-mobile
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "DFGApprox")
  @js.native
  val DFGApprox: ShaderNode[Roughness, Node] = js.native
  
  // Microfacet Models for Refraction through Rough Surfaces - equation (33)
  // http://graphicrants.blogspot.com/2013/08/specular-brdf-reference.html
  // alpha is "roughness squared" in Disney’s reparameterization
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "D_GGX")
  @js.native
  val D_GGX: typings.three.shaderNodeBaseElementsMod.ShaderNode[Alpha, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "EPSILON")
  @js.native
  val EPSILON: Swizzable[Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "F_Schlick")
  @js.native
  val FSchlick: typings.three.shaderNodeBaseElementsMod.ShaderNode[DotVH, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "INFINITY")
  @js.native
  val INFINITY: Swizzable[Node] = js.native
  
  object PhysicalLightingModel {
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "PhysicalLightingModel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "PhysicalLightingModel.ambientOcclusion")
    @js.native
    def ambientOcclusion: ShaderNode[AmbientOcclusion, Node] = js.native
    inline def ambientOcclusion_=(x: ShaderNode[AmbientOcclusion, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ambientOcclusion")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "PhysicalLightingModel.direct")
    @js.native
    def direct: ShaderNode[LightColor, Node] = js.native
    inline def direct_=(x: ShaderNode[LightColor, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direct")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "PhysicalLightingModel.indirectDiffuse")
    @js.native
    def indirectDiffuse: ShaderNode[Irradiance, Node] = js.native
    inline def indirectDiffuse_=(x: ShaderNode[Irradiance, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectDiffuse")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "PhysicalLightingModel.indirectSpecular")
    @js.native
    def indirectSpecular: ShaderNode[IblIrradiance, Node] = js.native
    inline def indirectSpecular_=(x: ShaderNode[IblIrradiance, Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectSpecular")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "ShaderNode")
  @js.native
  open class ShaderNode[T, R /* <: Node */] protected ()
    extends typings.three.shaderNodeBaseElementsMod.ShaderNode[T, R] {
    def this(jsFunc: js.Function2[/* inputs */ NodeObjects_[T], /* builder */ NodeBuilder, NodeRepresentation[Node]]) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "V_GGX_SmithCorrelated")
  @js.native
  val VGGXSmithCorrelated: typings.three.shaderNodeBaseElementsMod.ShaderNode[DotNL, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "abs")
  @js.native
  val abs: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "acos")
  @js.native
  val acos: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "add")
  @js.native
  val add: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "alphaTest")
  @js.native
  val alphaTest: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "and")
  @js.native
  val and: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "asin")
  @js.native
  val asin: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "assign")
  @js.native
  val assign: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "atan")
  @js.native
  val atan: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "atan2")
  @js.native
  val atan2: Binary = js.native
  
  inline def attribute(attributeName: String, nodeType: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(attributeName.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bitAnd")
  @js.native
  val bitAnd: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bitOr")
  @js.native
  val bitOr: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bitXor")
  @js.native
  val bitXor: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bmat3")
  @js.native
  val bmat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bmat4")
  @js.native
  val bmat4: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bool")
  @js.native
  val bool: ConvertType = js.native
  
  inline def buffer(value: ArrayLike[Double], nodeOrType: NodeOrType, count: Double): Swizzable[BufferNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(value.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BufferNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bvec2")
  @js.native
  val bvec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bvec3")
  @js.native
  val bvec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "bvec4")
  @js.native
  val bvec4: ConvertType = js.native
  
  inline def bypass(returnNode: NodeRepresentation[Node], callNode: NodeRepresentation[Node]): Swizzable[BypassNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("bypass")(returnNode.asInstanceOf[js.Any], callNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BypassNode]]
  
  inline def call[P /* <: FunctionNodeArguments */](): Swizzable[FunctionCallNode[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")().asInstanceOf[Swizzable[FunctionCallNode[P]]]
  inline def call[P /* <: FunctionNodeArguments */](functionNode: Unit, parameters: ProxiedObject[P]): Swizzable[FunctionCallNode[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FunctionCallNode[P]]]
  inline def call[P /* <: FunctionNodeArguments */](functionNode: FunctionNode[P]): Swizzable[FunctionCallNode[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[FunctionCallNode[P]]]
  inline def call[P /* <: FunctionNodeArguments */](functionNode: FunctionNode[P], parameters: ProxiedObject[P]): Swizzable[FunctionCallNode[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FunctionCallNode[P]]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cameraNormalMatrix")
  @js.native
  val cameraNormalMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cameraPosition")
  @js.native
  val cameraPosition: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cameraProjectionMatrix")
  @js.native
  val cameraProjectionMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cameraViewMatrix")
  @js.native
  val cameraViewMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cameraWorldMatrix")
  @js.native
  val cameraWorldMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "ceil")
  @js.native
  val ceil: Unary = js.native
  
  inline def checker(): Swizzable[CheckerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("checker")().asInstanceOf[Swizzable[CheckerNode]]
  inline def checker(uvNode: NodeRepresentation[Node]): Swizzable[CheckerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("checker")(uvNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CheckerNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "clamp")
  @js.native
  val clamp: Ternary = js.native
  
  inline def code(code: String): Swizzable[CodeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(code.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CodeNode]]
  inline def code(code: String, nodeType: NodeTypeOption): Swizzable[CodeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(code.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CodeNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "color")
  @js.native
  val color: ConvertType = js.native
  
  inline def colorSpace(node: NodeRepresentation[Node], encoding: TextureEncoding): Swizzable[ColorSpaceNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorSpace")(node.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorSpaceNode]]
  
  inline def compute(node: NodeRepresentation[Node], count: Double, workgroupSize: js.Array[Double]): Swizzable[ComputeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(node.asInstanceOf[js.Any], count.asInstanceOf[js.Any], workgroupSize.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ComputeNode]]
  
  inline def cond(
    condNode: NodeRepresentation[Node],
    ifNode: NodeRepresentation[Node],
    elseNode: NodeRepresentation[Node]
  ): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(condNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any], elseNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  inline def context(node: NodeRepresentation[Node], context: NodeBuilderContext): Swizzable[ContextNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("context")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ContextNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cos")
  @js.native
  val cos: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "cross")
  @js.native
  val cross: Binary = js.native
  
  inline def cubeTexture(value: CubeTexture): Swizzable[CubeTextureNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CubeTextureNode]]
  inline def cubeTexture(value: CubeTexture, uvNode: Unit, levelNode: NodeRepresentation[Node]): Swizzable[CubeTextureNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CubeTextureNode]]
  inline def cubeTexture(value: CubeTexture, uvNode: NodeRepresentation[Node]): Swizzable[CubeTextureNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CubeTextureNode]]
  inline def cubeTexture(value: CubeTexture, uvNode: NodeRepresentation[Node], levelNode: NodeRepresentation[Node]): Swizzable[CubeTextureNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CubeTextureNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "dFdx")
  @js.native
  val dFdx: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "dFdy")
  @js.native
  val dFdy: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "degrees")
  @js.native
  val degrees: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "diffuseColor")
  @js.native
  val diffuseColor: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "distance")
  @js.native
  val distance: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "div")
  @js.native
  val div: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "dot")
  @js.native
  val dot: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "dotNV")
  @js.native
  val dotNV: Swizzable[MathNode] = js.native
  
  inline def element(node: NodeRepresentation[Node], indexNode: NodeRepresentation[Node]): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(node.asInstanceOf[js.Any], indexNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "equal")
  @js.native
  val equal: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "exp")
  @js.native
  val exp: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "exp2")
  @js.native
  val exp2: Unary = js.native
  
  inline def expression(): Swizzable[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("expression")().asInstanceOf[Swizzable[ExpressionNode]]
  inline def expression(snipped: String): Swizzable[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ExpressionNode]]
  inline def expression(snipped: String, nodeType: NodeTypeOption): Swizzable[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ExpressionNode]]
  inline def expression(snipped: Unit, nodeType: NodeTypeOption): Swizzable[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ExpressionNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "faceDirection")
  @js.native
  val faceDirection: Swizzable[Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "faceforward")
  @js.native
  val faceforward: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "float")
  @js.native
  val float: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "floor")
  @js.native
  val floor: Unary = js.native
  
  inline def fn[P /* <: FunctionNodeArguments */](code: String): js.Function1[/* params */ Fn_[P], Swizzable[Node]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(code.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Fn_[P], Swizzable[Node]]]
  inline def fn[P /* <: FunctionNodeArguments */](code: String, includes: js.Array[CodeNodeInclude]): js.Function1[/* params */ Fn_[P], Swizzable[Node]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fn")(code.asInstanceOf[js.Any], includes.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Fn_[P], Swizzable[Node]]]
  
  inline def fog(colorNode: NodeRepresentation[Node], factorNode: NodeRepresentation[Node]): Swizzable[FogNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("fog")(colorNode.asInstanceOf[js.Any], factorNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FogNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "fract")
  @js.native
  val fract: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "frontFacing")
  @js.native
  val frontFacing: Swizzable[FrontFacingNode] = js.native
  
  inline def func[P /* <: FunctionNodeArguments */](code: String): Call[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(code.asInstanceOf[js.Any]).asInstanceOf[Call[P]]
  inline def func[P /* <: FunctionNodeArguments */](code: String, includes: js.Array[CodeNodeInclude]): Call[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(code.asInstanceOf[js.Any], includes.asInstanceOf[js.Any])).asInstanceOf[Call[P]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "getDistanceAttenuation")
  @js.native
  val getDistanceAttenuation: typings.three.shaderNodeBaseElementsMod.ShaderNode[CutoffDistance, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "getGeometryRoughness")
  @js.native
  val getGeometryRoughness: typings.three.shaderNodeBaseElementsMod.ShaderNode[js.Object, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "getRoughness")
  @js.native
  val getRoughness: ShaderNode[Roughness, Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "greaterThan")
  @js.native
  val greaterThan: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "greaterThanEqual")
  @js.native
  val greaterThanEqual: Operator = js.native
  
  inline def hue(colorNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("hue")(colorNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ColorAdjustmentNode]]
  inline def hue(colorNode: NodeRepresentation[Node], adjustmentNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hue")(colorNode.asInstanceOf[js.Any], adjustmentNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorAdjustmentNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "imat3")
  @js.native
  val imat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "imat4")
  @js.native
  val imat4: ConvertType = js.native
  
  inline def instance(instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]): Swizzable[InstanceNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(instanceMesh.asInstanceOf[js.Any]).asInstanceOf[Swizzable[InstanceNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "instanceIndex")
  @js.native
  val instanceIndex: Swizzable[InstanceIndexNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "int")
  @js.native
  val int: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "inversesqrt")
  @js.native
  val inversesqrt: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "invert")
  @js.native
  val invert: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "ivec2")
  @js.native
  val ivec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "ivec3")
  @js.native
  val ivec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "ivec4")
  @js.native
  val ivec4: ConvertType = js.native
  
  inline def label(node: NodeRepresentation[Node]): Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VarNode]]
  inline def label(node: NodeRepresentation[Node], name: String): Swizzable[VarNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("label")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VarNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "length")
  @js.native
  val length: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "lessThan")
  @js.native
  val lessThan: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "lessThanEqual")
  @js.native
  val lessThanEqual: Operator = js.native
  
  inline def lightingContext(node: default): Swizzable[typings.three.lightingContextNodeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("lightingContext")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[typings.three.lightingContextNodeMod.default]]
  inline def lightingContext(node: default, lightingModelNode: LightingModelNode): Swizzable[typings.three.lightingContextNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("lightingContext")(node.asInstanceOf[js.Any], lightingModelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.lightingContextNodeMod.default]]
  
  inline def lights(lights: js.Array[Light]): Swizzable[LightsNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lights")(lights.asInstanceOf[js.Any]).asInstanceOf[Swizzable[LightsNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "log")
  @js.native
  val log: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "log2")
  @js.native
  val log2: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "mat3")
  @js.native
  val mat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "mat4")
  @js.native
  val mat4: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "matcapUV")
  @js.native
  val matcapUV: Swizzable[MatcapUVNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialAlphaTest")
  @js.native
  val materialAlphaTest: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialColor")
  @js.native
  val materialColor: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialEmissive")
  @js.native
  val materialEmissive: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialMetalness")
  @js.native
  val materialMetalness: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialOpacity")
  @js.native
  val materialOpacity: Swizzable[MaterialNode] = js.native
  
  inline def materialReference(name: String, nodeOrType: NodeOrType, material: typings.three.threeMod.Material): Swizzable[MaterialReferenceNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("materialReference")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[Swizzable[MaterialReferenceNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialRotation")
  @js.native
  val materialRotation: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "materialRoughness")
  @js.native
  val materialRoughness: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "max")
  @js.native
  val max: Binary = js.native
  
  inline def maxMipLevel(texture: Texture): Swizzable[MaxMipLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("maxMipLevel")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[MaxMipLevelNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "metalness")
  @js.native
  val metalness: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "min")
  @js.native
  val min: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "mix")
  @js.native
  val mix: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "mod")
  @js.native
  val mod: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "modelNormalMatrix")
  @js.native
  val modelNormalMatrix: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "modelPosition")
  @js.native
  val modelPosition: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "modelViewMatrix")
  @js.native
  val modelViewMatrix: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "modelViewPosition")
  @js.native
  val modelViewPosition: Swizzable[ModelNode] = js.native
  
  inline def modelViewProjection(): Swizzable[ModelViewProjectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelViewProjection")().asInstanceOf[Swizzable[ModelViewProjectionNode]]
  inline def modelViewProjection(position: NodeRepresentation[Node]): Swizzable[ModelViewProjectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelViewProjection")(position.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ModelViewProjectionNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "modelWorldMatrix")
  @js.native
  val modelWorldMatrix: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "mul")
  @js.native
  val mul: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "negate")
  @js.native
  val negate: Unary = js.native
  
  inline def nodeArray[T /* <: js.Array[NodeObjectOption] */](obj: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): NodeArray_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeArray_[T]]
  
  inline def nodeImmutable[T](
    nodeClass: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ProxiedTuple<GetConstructors<T>> is not an array type */ params: ProxiedTuple[GetConstructors[T]]
  ): Swizzable[ConstructedNode[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeImmutable")(nodeClass.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ConstructedNode[T]]]
  
  inline def nodeObject(obj: String): NodeObject_[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[String]]
  inline def nodeObject(obj: Boolean): NodeObject_[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Boolean]]
  inline def nodeObject(obj: Double): NodeObject_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Double]]
  inline def nodeObject(obj: Node): NodeObject_[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Node]]
  inline def nodeObject[T /* <: Node & typings.three.threeStrings.nodeObject & TopLevel[Any] */](obj: T): NodeObject_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[T]]
  
  inline def nodeObjects[T](obj: T): NodeObjects_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObjects")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObjects_[T]]
  
  inline def nodeProxy[T](nodeClass: T): js.Function1[/* params */ ProxiedTuple[GetConstructors[T]], Swizzable[ConstructedNode[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ ProxiedTuple[GetConstructors[T]], Swizzable[ConstructedNode[T]]]]
  inline def nodeProxy[T, S /* <: GetPossibleScopes[T] */](nodeClass: T, scope: S): js.Function1[
    /* params */ ProxiedTuple[RemoveTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* params */ ProxiedTuple[RemoveTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ]]
  inline def nodeProxy[T, S /* <: GetPossibleScopes[T] */](nodeClass: T, scope: S, factor: NodeObjectOption): js.Function1[
    /* params */ ProxiedTuple[RemoveHeadAndTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* params */ ProxiedTuple[RemoveHeadAndTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "normalGeometry")
  @js.native
  val normalGeometry: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "normalLocal")
  @js.native
  val normalLocal: Swizzable[NormalNode] = js.native
  
  inline def normalMap(node: default): Swizzable[NormalMapNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalMap")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[NormalMapNode]]
  inline def normalMap(node: default, scaleNode: default): Swizzable[NormalMapNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalMap")(node.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[NormalMapNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "normalView")
  @js.native
  val normalView: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "normalWorld")
  @js.native
  val normalWorld: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "normalize")
  @js.native
  val normalize: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "or")
  @js.native
  val or: Operator = js.native
  
  inline def oscSawtooth(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSawtooth")().asInstanceOf[Swizzable[OscNode]]
  inline def oscSawtooth(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSawtooth")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]
  
  inline def oscSine(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSine")().asInstanceOf[Swizzable[OscNode]]
  inline def oscSine(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSine")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]
  
  inline def oscSquare(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSquare")().asInstanceOf[Swizzable[OscNode]]
  inline def oscSquare(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSquare")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]
  
  inline def oscTriangle(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscTriangle")().asInstanceOf[Swizzable[OscNode]]
  inline def oscTriangle(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscTriangle")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "pointUV")
  @js.native
  val pointUV: Swizzable[PointUVNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "positionGeometry")
  @js.native
  val positionGeometry: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "positionLocal")
  @js.native
  val positionLocal: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "positionView")
  @js.native
  val positionView: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "positionViewDirection")
  @js.native
  val positionViewDirection: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "positionWorld")
  @js.native
  val positionWorld: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "pow")
  @js.native
  val pow: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "pow2")
  @js.native
  val pow2: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "pow3")
  @js.native
  val pow3: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "pow4")
  @js.native
  val pow4: Binary = js.native
  
  inline def property(name: String, nodeOrType: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  inline def property(name: String, nodeOrType: default): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "radians")
  @js.native
  val radians: Unary = js.native
  
  inline def range(min: RangeModeBound, max: RangeModeBound): Swizzable[typings.three.rangeNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.rangeNodeMod.default]]
  
  inline def rangeFog(colorNode: default, nearNode: default, farNode: default): Swizzable[FogRangeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeFog")(colorNode.asInstanceOf[js.Any], nearNode.asInstanceOf[js.Any], farNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FogRangeNode]]
  
  inline def reference[T](name: String, nodeOrType: NodeOrType, `object`: T): Swizzable[ReferenceNode[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ReferenceNode[T]]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "reflect")
  @js.native
  val reflect: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "reflectVector")
  @js.native
  val reflectVector: Swizzable[ReflectVectorNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "refract")
  @js.native
  val refract: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "remainder")
  @js.native
  val remainder: Operator = js.native
  
  inline def rotateUV(uvNode: default, rotationNode: default): Swizzable[RotateUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateUV")(uvNode.asInstanceOf[js.Any], rotationNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[RotateUVNode]]
  inline def rotateUV(uvNode: default, rotationNode: default, centerNode: default): Swizzable[RotateUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateUV")(uvNode.asInstanceOf[js.Any], rotationNode.asInstanceOf[js.Any], centerNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[RotateUVNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "roughness")
  @js.native
  val roughness: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "round")
  @js.native
  val round: Unary = js.native
  
  inline def sampler(texture: typings.three.textureNodeMod.default): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampler")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  inline def sampler(texture: Texture): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampler")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "saturate")
  @js.native
  val saturate: Unary = js.native
  
  inline def saturation(colorNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("saturation")(colorNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ColorAdjustmentNode]]
  inline def saturation(colorNode: NodeRepresentation[Node], adjustmentNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("saturation")(colorNode.asInstanceOf[js.Any], adjustmentNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorAdjustmentNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "shiftLeft")
  @js.native
  val shiftLeft: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "shiftRight")
  @js.native
  val shiftRight: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "sign")
  @js.native
  val sign: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "sin")
  @js.native
  val sin: Unary = js.native
  
  inline def skinning(skinnedMesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): Swizzable[SkinningNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("skinning")(skinnedMesh.asInstanceOf[js.Any]).asInstanceOf[Swizzable[SkinningNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "smoothstep")
  @js.native
  val smoothstep: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "specularColor")
  @js.native
  val specularColor: Swizzable[PropertyNode] = js.native
  
  inline def spritesheetUV(countNode: NodeRepresentation[Node]): Swizzable[SpriteSheetUVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[SpriteSheetUVNode]]
  inline def spritesheetUV(countNode: NodeRepresentation[Node], uvNode: Unit, frameNode: NodeRepresentation[Node]): Swizzable[SpriteSheetUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], frameNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[SpriteSheetUVNode]]
  inline def spritesheetUV(countNode: NodeRepresentation[Node], uvNode: NodeRepresentation[Node]): Swizzable[SpriteSheetUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[SpriteSheetUVNode]]
  inline def spritesheetUV(
    countNode: NodeRepresentation[Node],
    uvNode: NodeRepresentation[Node],
    frameNode: NodeRepresentation[Node]
  ): Swizzable[SpriteSheetUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], frameNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[SpriteSheetUVNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "sqrt")
  @js.native
  val sqrt: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "step")
  @js.native
  val step: Binary = js.native
  
  inline def storage(value: ArrayLike[Double], nodeOrType: NodeOrType, count: Double): Swizzable[typings.three.storageBufferNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("storage")(value.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.storageBufferNodeMod.default]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "sub")
  @js.native
  val sub: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "tan")
  @js.native
  val tan: Unary = js.native
  
  inline def temp(node: NodeRepresentation[Node]): Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("temp")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VarNode]]
  inline def temp(node: NodeRepresentation[Node], name: String): Swizzable[VarNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("temp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VarNode]]
  
  inline def texture(value: Texture): Swizzable[typings.three.textureNodeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any]).asInstanceOf[Swizzable[typings.three.textureNodeMod.default]]
  inline def texture(value: Texture, uvNode: Unit, levelNode: NodeRepresentation[Node]): Swizzable[typings.three.textureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.textureNodeMod.default]]
  inline def texture(value: Texture, uvNode: NodeRepresentation[Node]): Swizzable[typings.three.textureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.textureNodeMod.default]]
  inline def texture(value: Texture, uvNode: NodeRepresentation[Node], levelNode: NodeRepresentation[Node]): Swizzable[typings.three.textureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.textureNodeMod.default]]
  
  inline def timerDelta(timeScale: Double): Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("timerDelta")(timeScale.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TimerNode]]
  inline def timerDelta(timeScale: Double, value: Double): Swizzable[TimerNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("timerDelta")(timeScale.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TimerNode]]
  
  inline def timerGlobal(timeScale: Double): Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("timerGlobal")(timeScale.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TimerNode]]
  inline def timerGlobal(timeScale: Double, value: Double): Swizzable[TimerNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("timerGlobal")(timeScale.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TimerNode]]
  
  inline def timerLocal(timeScale: Double): Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("timerLocal")(timeScale.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TimerNode]]
  inline def timerLocal(timeScale: Double, value: Double): Swizzable[TimerNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("timerLocal")(timeScale.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TimerNode]]
  
  inline def toneMapping(mapping: ToneMapping, exposure: NodeRepresentation[Node], color: NodeRepresentation[Node]): Swizzable[ToneMappingNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("toneMapping")(mapping.asInstanceOf[js.Any], exposure.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ToneMappingNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "transformDirection")
  @js.native
  val transformDirection: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "transformedNormalView")
  @js.native
  val transformedNormalView: Swizzable[VarNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "transformedNormalWorld")
  @js.native
  val transformedNormalWorld: Swizzable[MathNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "uint")
  @js.native
  val uint: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "umat3")
  @js.native
  val umat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "umat4")
  @js.native
  val umat4: ConvertType = js.native
  
  inline def uniform(nodeOrType: NodeValueOption): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  inline def uniform(nodeOrType: default): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  inline def uniform(nodeOrType: Swizzable[Node]): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  inline def userData(name: String, inputType: NodeTypeOption): Swizzable[UserDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("userData")(name.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[UserDataNode]]
  inline def userData(name: String, inputType: NodeTypeOption, userData: NodeUserData): Swizzable[UserDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("userData")(name.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Swizzable[UserDataNode]]
  
  inline def uv(): Swizzable[UVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uv")().asInstanceOf[Swizzable[UVNode]]
  inline def uv(index: Double): Swizzable[UVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uv")(index.asInstanceOf[js.Any]).asInstanceOf[Swizzable[UVNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "uvec2")
  @js.native
  val uvec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "uvec3")
  @js.native
  val uvec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "uvec4")
  @js.native
  val uvec4: ConvertType = js.native
  
  inline def vary(node: NodeRepresentation[Node]): Swizzable[VaryNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("vary")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VaryNode]]
  inline def vary(node: NodeRepresentation[Node], name: String): Swizzable[VaryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("vary")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VaryNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "vec2")
  @js.native
  val vec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "vec3")
  @js.native
  val vec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "vec4")
  @js.native
  val vec4: ConvertType = js.native
  
  inline def vibrance(colorNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrance")(colorNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ColorAdjustmentNode]]
  inline def vibrance(colorNode: NodeRepresentation[Node], adjustmentNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("vibrance")(colorNode.asInstanceOf[js.Any], adjustmentNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorAdjustmentNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeElements", "xor")
  @js.native
  val xor: Operator = js.native
}
