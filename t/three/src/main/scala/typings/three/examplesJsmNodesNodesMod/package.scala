package typings.three.examplesJsmNodesNodesMod

import typings.std.ArrayLike
import typings.three.anon.Alpha
import typings.three.anon.Call
import typings.three.anon.CutoffDistance
import typings.three.anon.DiffuseColor
import typings.three.anon.DotNL
import typings.three.anon.DotVH
import typings.three.anon.F0
import typings.three.anon.Roughness
import typings.three.examplesJsmNodesCoreCodeNodeMod.CodeNodeInclude
import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesCoreConstantsMod.NodeUserData
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.examplesJsmNodesCoreFunctionNodeMod.FunctionNodeArguments
import typings.three.examplesJsmNodesCoreNodeBuilderMod.NodeBuilderContext
import typings.three.examplesJsmNodesCoreNodeMod.default
import typings.three.examplesJsmNodesGeometryRangeNodeMod.RangeModeBound
import typings.three.examplesJsmNodesLightingLightingContextNodeMod.LightingModelNode
import typings.three.examplesJsmNodesNodesMod.^
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Binary
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Fn_
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Operator
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Ternary
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Unary
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.ConstructedNode
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.ConvertType
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.GetConstructors
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.GetConstructorsByScope
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.GetPossibleScopes
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeArray_
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeObjectOption
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeObject_
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeObjects_
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeOrType
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.NodeRepresentation
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.ProxiedObject
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.ProxiedTuple
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.RemoveHeadAndTail
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.RemoveTail
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.Swizzable
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.ToneMapping
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.CubeTexture
import typings.three.srcThreeMod.InstancedMesh
import typings.three.srcThreeMod.Light
import typings.three.srcThreeMod.SkinnedMesh
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BRDFLambert: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[DiffuseColor, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("BRDF_Lambert").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[DiffuseColor, Node]]

inline def BRDF_GGX: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[F0, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("BRDF_GGX").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[F0, Node]]

// Analytical approximation of the DFG LUT, one half of the
// split-sum approximation used in indirect specular lighting.
// via 'environmentBRDF' from "Physically Based Shading on Mobile"
// https://www.unrealengine.com/blog/physically-based-shading-on-mobile
inline def DFGApprox: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Roughness, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("DFGApprox").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Roughness, Node]]

// Microfacet Models for Refraction through Rough Surfaces - equation (33)
// http://graphicrants.blogspot.com/2013/08/specular-brdf-reference.html
// alpha is "roughness squared" in Disney’s reparameterization
inline def D_GGX: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[Alpha, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("D_GGX").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[Alpha, Node]]

inline def EPSILON: Swizzable[Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("EPSILON").asInstanceOf[Swizzable[Node]]

inline def FSchlick: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[DotVH, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("F_Schlick").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[DotVH, Node]]

inline def INFINITY: Swizzable[Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("INFINITY").asInstanceOf[Swizzable[Node]]

inline def TBNViewMatrix: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("TBNViewMatrix").asInstanceOf[Swizzable[MathNode]]

inline def VGGXSmithCorrelated: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[DotNL, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("V_GGX_SmithCorrelated").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[DotNL, Node]]

inline def abs: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("abs").asInstanceOf[Unary]

inline def acos: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("acos").asInstanceOf[Unary]

inline def add: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("add").asInstanceOf[Operator]

inline def alphaTest: Swizzable[PropertyNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("alphaTest").asInstanceOf[Swizzable[PropertyNode]]

inline def and: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("and").asInstanceOf[Operator]

inline def asin: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("asin").asInstanceOf[Unary]

inline def assign: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("assign").asInstanceOf[Operator]

inline def atan: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("atan").asInstanceOf[Unary]

inline def atan2: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("atan2").asInstanceOf[Binary]

inline def attribute(attributeName: String, nodeType: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(attributeName.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]

inline def bitAnd: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("bitAnd").asInstanceOf[Operator]

inline def bitOr: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("bitOr").asInstanceOf[Operator]

inline def bitXor: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("bitXor").asInstanceOf[Operator]

inline def bitangentGeometry: Swizzable[BitangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("bitangentGeometry").asInstanceOf[Swizzable[BitangentNode]]

inline def bitangentLocal: Swizzable[BitangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("bitangentLocal").asInstanceOf[Swizzable[BitangentNode]]

inline def bitangentView: Swizzable[BitangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("bitangentView").asInstanceOf[Swizzable[BitangentNode]]

inline def bitangentWorld: Swizzable[BitangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("bitangentWorld").asInstanceOf[Swizzable[BitangentNode]]

inline def bmat3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("bmat3").asInstanceOf[ConvertType]

inline def bmat4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("bmat4").asInstanceOf[ConvertType]

inline def bool: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("bool").asInstanceOf[ConvertType]

inline def buffer(value: ArrayLike[Double], nodeOrType: NodeOrType, count: Double): Swizzable[BufferNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(value.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BufferNode]]

inline def burn(baseNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("burn")(baseNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[BlendModeNode]]
inline def burn(baseNode: NodeRepresentation[Node], blendNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("burn")(baseNode.asInstanceOf[js.Any], blendNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BlendModeNode]]

inline def bvec2: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("bvec2").asInstanceOf[ConvertType]

inline def bvec3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("bvec3").asInstanceOf[ConvertType]

inline def bvec4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("bvec4").asInstanceOf[ConvertType]

inline def bypass(returnNode: NodeRepresentation[Node], callNode: NodeRepresentation[Node]): Swizzable[BypassNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("bypass")(returnNode.asInstanceOf[js.Any], callNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BypassNode]]

inline def call[P /* <: FunctionNodeArguments */](): Swizzable[FunctionCallNode[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")().asInstanceOf[Swizzable[FunctionCallNode[P]]]
inline def call[P /* <: FunctionNodeArguments */](functionNode: Unit, parameters: ProxiedObject[P]): Swizzable[FunctionCallNode[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FunctionCallNode[P]]]
inline def call[P /* <: FunctionNodeArguments */](functionNode: FunctionNode[P]): Swizzable[FunctionCallNode[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[FunctionCallNode[P]]]
inline def call[P /* <: FunctionNodeArguments */](functionNode: FunctionNode[P], parameters: ProxiedObject[P]): Swizzable[FunctionCallNode[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FunctionCallNode[P]]]

inline def cameraNormalMatrix: Swizzable[CameraNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("cameraNormalMatrix").asInstanceOf[Swizzable[CameraNode]]

inline def cameraPosition: Swizzable[CameraNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("cameraPosition").asInstanceOf[Swizzable[CameraNode]]

inline def cameraProjectionMatrix: Swizzable[CameraNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("cameraProjectionMatrix").asInstanceOf[Swizzable[CameraNode]]

inline def cameraViewMatrix: Swizzable[CameraNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("cameraViewMatrix").asInstanceOf[Swizzable[CameraNode]]

inline def cameraWorldMatrix: Swizzable[CameraNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("cameraWorldMatrix").asInstanceOf[Swizzable[CameraNode]]

inline def ceil: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("ceil").asInstanceOf[Unary]

inline def checker(): Swizzable[CheckerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("checker")().asInstanceOf[Swizzable[CheckerNode]]
inline def checker(uvNode: NodeRepresentation[Node]): Swizzable[CheckerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("checker")(uvNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CheckerNode]]

inline def clamp: Ternary = ^.asInstanceOf[js.Dynamic].selectDynamic("clamp").asInstanceOf[Ternary]

inline def code(code: String): Swizzable[CodeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(code.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CodeNode]]
inline def code(code: String, nodeType: NodeTypeOption): Swizzable[CodeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(code.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CodeNode]]

inline def color: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("color").asInstanceOf[ConvertType]

inline def colorSpace(node: NodeRepresentation[Node], encoding: TextureEncoding): Swizzable[ColorSpaceNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorSpace")(node.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorSpaceNode]]

inline def compute(node: NodeRepresentation[Node], count: Double, workgroupSize: js.Array[Double]): Swizzable[ComputeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(node.asInstanceOf[js.Any], count.asInstanceOf[js.Any], workgroupSize.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ComputeNode]]

inline def cond(
  condNode: NodeRepresentation[Node],
  ifNode: NodeRepresentation[Node],
  elseNode: NodeRepresentation[Node]
): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(condNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any], elseNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]

inline def context(node: NodeRepresentation[Node], context: NodeBuilderContext): Swizzable[ContextNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("context")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ContextNode]]

inline def convert(node: NodeRepresentation[Node], types: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(node.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]

inline def cos: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("cos").asInstanceOf[Unary]

inline def cross: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("cross").asInstanceOf[Binary]

inline def cubeTexture(value: CubeTexture): Swizzable[CubeTextureNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CubeTextureNode]]
inline def cubeTexture(value: CubeTexture, uvNode: Unit, levelNode: NodeRepresentation[Node]): Swizzable[CubeTextureNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CubeTextureNode]]
inline def cubeTexture(value: CubeTexture, uvNode: NodeRepresentation[Node]): Swizzable[CubeTextureNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CubeTextureNode]]
inline def cubeTexture(value: CubeTexture, uvNode: NodeRepresentation[Node], levelNode: NodeRepresentation[Node]): Swizzable[CubeTextureNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubeTexture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CubeTextureNode]]

inline def dFdx: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("dFdx").asInstanceOf[Unary]

inline def dFdy: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("dFdy").asInstanceOf[Unary]

inline def degrees: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("degrees").asInstanceOf[Unary]

inline def difference: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("difference").asInstanceOf[Binary]

inline def diffuseColor: Swizzable[PropertyNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("diffuseColor").asInstanceOf[Swizzable[PropertyNode]]

inline def distance: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("distance").asInstanceOf[Binary]

inline def div: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("div").asInstanceOf[Operator]

inline def dodge(baseNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("dodge")(baseNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[BlendModeNode]]
inline def dodge(baseNode: NodeRepresentation[Node], blendNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("dodge")(baseNode.asInstanceOf[js.Any], blendNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BlendModeNode]]

inline def dot: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("dot").asInstanceOf[Binary]

inline def dotNV: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("dotNV").asInstanceOf[Swizzable[MathNode]]

inline def element(node: NodeRepresentation[Node], indexNode: NodeRepresentation[Node]): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(node.asInstanceOf[js.Any], indexNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]

inline def equal: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("equal").asInstanceOf[Operator]

inline def equirectUV: Swizzable[EquirectUVNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("equirectUV").asInstanceOf[Swizzable[EquirectUVNode]]

inline def exp: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("exp").asInstanceOf[Unary]

inline def exp2: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("exp2").asInstanceOf[Unary]

inline def expression(): Swizzable[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("expression")().asInstanceOf[Swizzable[ExpressionNode]]
inline def expression(snipped: String): Swizzable[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ExpressionNode]]
inline def expression(snipped: String, nodeType: NodeTypeOption): Swizzable[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ExpressionNode]]
inline def expression(snipped: Unit, nodeType: NodeTypeOption): Swizzable[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ExpressionNode]]

inline def faceDirection: Swizzable[Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("faceDirection").asInstanceOf[Swizzable[Node]]

inline def faceforward: Ternary = ^.asInstanceOf[js.Dynamic].selectDynamic("faceforward").asInstanceOf[Ternary]

inline def float: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("float").asInstanceOf[ConvertType]

inline def floor: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("floor").asInstanceOf[Unary]

inline def fn[P /* <: FunctionNodeArguments */](code: String): js.Function1[/* params */ Fn_[P], Swizzable[Node]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(code.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Fn_[P], Swizzable[Node]]]
inline def fn[P /* <: FunctionNodeArguments */](code: String, includes: js.Array[CodeNodeInclude]): js.Function1[/* params */ Fn_[P], Swizzable[Node]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fn")(code.asInstanceOf[js.Any], includes.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Fn_[P], Swizzable[Node]]]

inline def fog(colorNode: NodeRepresentation[Node], factorNode: NodeRepresentation[Node]): Swizzable[FogNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("fog")(colorNode.asInstanceOf[js.Any], factorNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FogNode]]

inline def fract: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("fract").asInstanceOf[Unary]

inline def frameId: Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("frameId").asInstanceOf[Swizzable[TimerNode]]

inline def frontFacing: Swizzable[FrontFacingNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("frontFacing").asInstanceOf[Swizzable[FrontFacingNode]]

inline def func[P /* <: FunctionNodeArguments */](code: String): Call[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(code.asInstanceOf[js.Any]).asInstanceOf[Call[P]]
inline def func[P /* <: FunctionNodeArguments */](code: String, includes: js.Array[CodeNodeInclude]): Call[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(code.asInstanceOf[js.Any], includes.asInstanceOf[js.Any])).asInstanceOf[Call[P]]

inline def getDistanceAttenuation: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[CutoffDistance, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("getDistanceAttenuation").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[CutoffDistance, Node]]

inline def getGeometryRoughness: typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[js.Object, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("getGeometryRoughness").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.ShaderNode[js.Object, Node]]

inline def getRoughness: typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Roughness, Node] = ^.asInstanceOf[js.Dynamic].selectDynamic("getRoughness").asInstanceOf[typings.three.examplesJsmNodesShadernodeShaderNodeElementsMod.ShaderNode[Roughness, Node]]

inline def greaterThan: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("greaterThan").asInstanceOf[Operator]

inline def greaterThanEqual: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("greaterThanEqual").asInstanceOf[Operator]

inline def hue(colorNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("hue")(colorNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ColorAdjustmentNode]]
inline def hue(colorNode: NodeRepresentation[Node], adjustmentNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hue")(colorNode.asInstanceOf[js.Any], adjustmentNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorAdjustmentNode]]

inline def imat3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("imat3").asInstanceOf[ConvertType]

inline def imat4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("imat4").asInstanceOf[ConvertType]

inline def instance(instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]): Swizzable[InstanceNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(instanceMesh.asInstanceOf[js.Any]).asInstanceOf[Swizzable[InstanceNode]]

inline def instanceIndex: Swizzable[InstanceIndexNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("instanceIndex").asInstanceOf[Swizzable[InstanceIndexNode]]

inline def int: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("int").asInstanceOf[ConvertType]

inline def inversesqrt: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("inversesqrt").asInstanceOf[Unary]

inline def invert: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("invert").asInstanceOf[Unary]

inline def ivec2: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("ivec2").asInstanceOf[ConvertType]

inline def ivec3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("ivec3").asInstanceOf[ConvertType]

inline def ivec4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("ivec4").asInstanceOf[ConvertType]

inline def label(node: NodeRepresentation[Node]): Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VarNode]]
inline def label(node: NodeRepresentation[Node], name: String): Swizzable[VarNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("label")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VarNode]]

inline def length: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("length").asInstanceOf[Unary]

inline def lessThan: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("lessThan").asInstanceOf[Operator]

inline def lessThanEqual: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("lessThanEqual").asInstanceOf[Operator]

inline def lightingContext(node: default): Swizzable[typings.three.examplesJsmNodesLightingLightingContextNodeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("lightingContext")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[typings.three.examplesJsmNodesLightingLightingContextNodeMod.default]]
inline def lightingContext(node: default, lightingModelNode: LightingModelNode): Swizzable[typings.three.examplesJsmNodesLightingLightingContextNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("lightingContext")(node.asInstanceOf[js.Any], lightingModelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesLightingLightingContextNodeMod.default]]

inline def lights(lights: js.Array[Light]): Swizzable[LightsNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("lights")(lights.asInstanceOf[js.Any]).asInstanceOf[Swizzable[LightsNode]]

inline def log: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[Unary]

inline def log2: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("log2").asInstanceOf[Unary]

inline def lumaCoeffs: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("lumaCoeffs").asInstanceOf[Swizzable[MathNode]]

inline def luminance: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("luminance").asInstanceOf[Binary]

inline def mat3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("mat3").asInstanceOf[ConvertType]

inline def mat4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("mat4").asInstanceOf[ConvertType]

inline def matcapUV: Swizzable[MatcapUVNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("matcapUV").asInstanceOf[Swizzable[MatcapUVNode]]

inline def materialAlphaTest: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialAlphaTest").asInstanceOf[Swizzable[MaterialNode]]

inline def materialColor: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialColor").asInstanceOf[Swizzable[MaterialNode]]

inline def materialEmissive: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialEmissive").asInstanceOf[Swizzable[MaterialNode]]

inline def materialMetalness: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialMetalness").asInstanceOf[Swizzable[MaterialNode]]

inline def materialOpacity: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialOpacity").asInstanceOf[Swizzable[MaterialNode]]

inline def materialReference(name: String, nodeOrType: NodeOrType, material: typings.three.srcThreeMod.Material): Swizzable[MaterialReferenceNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("materialReference")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[Swizzable[MaterialReferenceNode]]

inline def materialRotation: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialRotation").asInstanceOf[Swizzable[MaterialNode]]

inline def materialRoughness: Swizzable[MaterialNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("materialRoughness").asInstanceOf[Swizzable[MaterialNode]]

inline def max: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("max").asInstanceOf[Binary]

inline def maxMipLevel(texture: Texture): Swizzable[MaxMipLevelNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("maxMipLevel")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[MaxMipLevelNode]]

inline def metalness: Swizzable[PropertyNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("metalness").asInstanceOf[Swizzable[PropertyNode]]

inline def min: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("min").asInstanceOf[Binary]

inline def mix: Ternary = ^.asInstanceOf[js.Dynamic].selectDynamic("mix").asInstanceOf[Ternary]

inline def mod: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("mod").asInstanceOf[Binary]

inline def modelNormalMatrix: Swizzable[ModelNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("modelNormalMatrix").asInstanceOf[Swizzable[ModelNode]]

inline def modelPosition: Swizzable[ModelNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("modelPosition").asInstanceOf[Swizzable[ModelNode]]

inline def modelViewMatrix: Swizzable[ModelNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("modelViewMatrix").asInstanceOf[Swizzable[ModelNode]]

inline def modelViewPosition: Swizzable[ModelNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("modelViewPosition").asInstanceOf[Swizzable[ModelNode]]

inline def modelViewProjection(): Swizzable[ModelViewProjectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelViewProjection")().asInstanceOf[Swizzable[ModelViewProjectionNode]]
inline def modelViewProjection(position: NodeRepresentation[Node]): Swizzable[ModelViewProjectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelViewProjection")(position.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ModelViewProjectionNode]]

inline def modelWorldMatrix: Swizzable[ModelNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("modelWorldMatrix").asInstanceOf[Swizzable[ModelNode]]

inline def mul: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("mul").asInstanceOf[Operator]

inline def negate: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("negate").asInstanceOf[Unary]

inline def nodeArray[T /* <: js.Array[NodeObjectOption] */](obj: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): NodeArray_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeArray_[T]]

inline def nodeImmutable[T](
  nodeClass: T,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ProxiedTuple<GetConstructors<T>> is not an array type */ params: ProxiedTuple[GetConstructors[T]]
): Swizzable[ConstructedNode[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeImmutable")(nodeClass.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ConstructedNode[T]]]

inline def nodeObject(obj: String): NodeObject_[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[String]]
inline def nodeObject(obj: Boolean): NodeObject_[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Boolean]]
inline def nodeObject(obj: Double): NodeObject_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Double]]
inline def nodeObject(obj: Node): NodeObject_[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Node]]
inline def nodeObject[T /* <: Node & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in three.three/examples/jsm/nodes/core/constants.SwizzleOption | number ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.Node>} */ js.Any) */](obj: T): NodeObject_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[T]]

inline def nodeObjects[T](obj: T): NodeObjects_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObjects")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObjects_[T]]

inline def nodeProxy[T](nodeClass: T): js.Function1[/* params */ ProxiedTuple[GetConstructors[T]], Swizzable[ConstructedNode[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ ProxiedTuple[GetConstructors[T]], Swizzable[ConstructedNode[T]]]]
inline def nodeProxy[T, S /* <: GetPossibleScopes[T] */](nodeClass: T, scope: S): js.Function1[
/* params */ ProxiedTuple[RemoveTail[GetConstructorsByScope[T, S]]], 
Swizzable[ConstructedNode[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* params */ ProxiedTuple[RemoveTail[GetConstructorsByScope[T, S]]], 
Swizzable[ConstructedNode[T]]]]
inline def nodeProxy[T, S /* <: GetPossibleScopes[T] */](nodeClass: T, scope: S, factor: NodeObjectOption): js.Function1[
/* params */ ProxiedTuple[RemoveHeadAndTail[GetConstructorsByScope[T, S]]], 
Swizzable[ConstructedNode[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* params */ ProxiedTuple[RemoveHeadAndTail[GetConstructorsByScope[T, S]]], 
Swizzable[ConstructedNode[T]]]]

inline def normalGeometry: Swizzable[NormalNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("normalGeometry").asInstanceOf[Swizzable[NormalNode]]

inline def normalLocal: Swizzable[NormalNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("normalLocal").asInstanceOf[Swizzable[NormalNode]]

inline def normalMap(node: default): Swizzable[NormalMapNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalMap")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[NormalMapNode]]
inline def normalMap(node: default, scaleNode: default): Swizzable[NormalMapNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalMap")(node.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[NormalMapNode]]

inline def normalView: Swizzable[NormalNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("normalView").asInstanceOf[Swizzable[NormalNode]]

inline def normalWorld: Swizzable[NormalNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("normalWorld").asInstanceOf[Swizzable[NormalNode]]

inline def normalize: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("normalize").asInstanceOf[Unary]

inline def or: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("or").asInstanceOf[Operator]

inline def oscSawtooth(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSawtooth")().asInstanceOf[Swizzable[OscNode]]
inline def oscSawtooth(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSawtooth")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]

inline def oscSine(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSine")().asInstanceOf[Swizzable[OscNode]]
inline def oscSine(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSine")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]

inline def oscSquare(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSquare")().asInstanceOf[Swizzable[OscNode]]
inline def oscSquare(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscSquare")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]

inline def oscTriangle(): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscTriangle")().asInstanceOf[Swizzable[OscNode]]
inline def oscTriangle(timeNode: NodeRepresentation[Node]): Swizzable[OscNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("oscTriangle")(timeNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[OscNode]]

inline def overlay(baseNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("overlay")(baseNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[BlendModeNode]]
inline def overlay(baseNode: NodeRepresentation[Node], blendNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("overlay")(baseNode.asInstanceOf[js.Any], blendNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BlendModeNode]]

inline def pointUV: Swizzable[PointUVNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("pointUV").asInstanceOf[Swizzable[PointUVNode]]

inline def positionGeometry: Swizzable[PositionNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("positionGeometry").asInstanceOf[Swizzable[PositionNode]]

inline def positionLocal: Swizzable[PositionNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("positionLocal").asInstanceOf[Swizzable[PositionNode]]

inline def positionView: Swizzable[PositionNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("positionView").asInstanceOf[Swizzable[PositionNode]]

inline def positionViewDirection: Swizzable[PositionNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("positionViewDirection").asInstanceOf[Swizzable[PositionNode]]

inline def positionWorld: Swizzable[PositionNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("positionWorld").asInstanceOf[Swizzable[PositionNode]]

inline def positionWorldDirection: Swizzable[PositionNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("positionWorldDirection").asInstanceOf[Swizzable[PositionNode]]

inline def posterize(sourceNode: NodeRepresentation[Node], stepsNode: NodeRepresentation[Node]): Swizzable[PosterizeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(sourceNode.asInstanceOf[js.Any], stepsNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[PosterizeNode]]

inline def pow: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("pow").asInstanceOf[Binary]

inline def pow2: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("pow2").asInstanceOf[Binary]

inline def pow3: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("pow3").asInstanceOf[Binary]

inline def pow4: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("pow4").asInstanceOf[Binary]

inline def property(name: String, nodeOrType: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
inline def property(name: String, nodeOrType: default): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]

inline def radians: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("radians").asInstanceOf[Unary]

inline def range(min: RangeModeBound, max: RangeModeBound): Swizzable[typings.three.examplesJsmNodesGeometryRangeNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesGeometryRangeNodeMod.default]]

inline def rangeFog(colorNode: default, nearNode: default, farNode: default): Swizzable[FogRangeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeFog")(colorNode.asInstanceOf[js.Any], nearNode.asInstanceOf[js.Any], farNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FogRangeNode]]

inline def reciprocal: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("reciprocal").asInstanceOf[Unary]

inline def reference[T](name: String, nodeOrType: NodeOrType, `object`: T): Swizzable[ReferenceNode[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ReferenceNode[T]]]

inline def reflect: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("reflect").asInstanceOf[Binary]

inline def reflectVector: Swizzable[ReflectVectorNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("reflectVector").asInstanceOf[Swizzable[ReflectVectorNode]]

inline def refract: Ternary = ^.asInstanceOf[js.Dynamic].selectDynamic("refract").asInstanceOf[Ternary]

inline def remainder: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("remainder").asInstanceOf[Operator]

inline def remap(node: default, inLowNode: default): Swizzable[RemapNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("remap")(node.asInstanceOf[js.Any], inLowNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[RemapNode]]

inline def remapClamp(node: default, inLowNode: default): Swizzable[RemapNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("remapClamp")(node.asInstanceOf[js.Any], inLowNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[RemapNode]]

inline def rotateUV(uvNode: default, rotationNode: default): Swizzable[RotateUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateUV")(uvNode.asInstanceOf[js.Any], rotationNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[RotateUVNode]]
inline def rotateUV(uvNode: default, rotationNode: default, centerNode: default): Swizzable[RotateUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateUV")(uvNode.asInstanceOf[js.Any], rotationNode.asInstanceOf[js.Any], centerNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[RotateUVNode]]

inline def roughness: Swizzable[PropertyNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("roughness").asInstanceOf[Swizzable[PropertyNode]]

inline def round: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("round").asInstanceOf[Unary]

inline def sampler(texture: typings.three.examplesJsmNodesAccessorsTextureNodeMod.default): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampler")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
inline def sampler(texture: Texture): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampler")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]

inline def saturation(colorNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("saturation")(colorNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ColorAdjustmentNode]]
inline def saturation(colorNode: NodeRepresentation[Node], adjustmentNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("saturation")(colorNode.asInstanceOf[js.Any], adjustmentNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorAdjustmentNode]]

inline def screen(baseNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("screen")(baseNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[BlendModeNode]]
inline def screen(baseNode: NodeRepresentation[Node], blendNode: NodeRepresentation[Node]): Swizzable[BlendModeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("screen")(baseNode.asInstanceOf[js.Any], blendNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BlendModeNode]]

inline def shiftLeft: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("shiftLeft").asInstanceOf[Operator]

inline def shiftRight: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("shiftRight").asInstanceOf[Operator]

inline def sign: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("sign").asInstanceOf[Unary]

inline def sin: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("sin").asInstanceOf[Unary]

inline def skinning(skinnedMesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): Swizzable[SkinningNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("skinning")(skinnedMesh.asInstanceOf[js.Any]).asInstanceOf[Swizzable[SkinningNode]]

inline def smoothstep: Ternary = ^.asInstanceOf[js.Dynamic].selectDynamic("smoothstep").asInstanceOf[Ternary]

inline def specularColor: Swizzable[PropertyNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("specularColor").asInstanceOf[Swizzable[PropertyNode]]

inline def spritesheetUV(countNode: NodeRepresentation[Node]): Swizzable[SpriteSheetUVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[SpriteSheetUVNode]]
inline def spritesheetUV(countNode: NodeRepresentation[Node], uvNode: Unit, frameNode: NodeRepresentation[Node]): Swizzable[SpriteSheetUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], frameNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[SpriteSheetUVNode]]
inline def spritesheetUV(countNode: NodeRepresentation[Node], uvNode: NodeRepresentation[Node]): Swizzable[SpriteSheetUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[SpriteSheetUVNode]]
inline def spritesheetUV(
  countNode: NodeRepresentation[Node],
  uvNode: NodeRepresentation[Node],
  frameNode: NodeRepresentation[Node]
): Swizzable[SpriteSheetUVNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("spritesheetUV")(countNode.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], frameNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[SpriteSheetUVNode]]

inline def sqrt: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("sqrt").asInstanceOf[Unary]

inline def step: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("step").asInstanceOf[Binary]

inline def storage(value: ArrayLike[Double], nodeOrType: NodeOrType, count: Double): Swizzable[typings.three.examplesJsmNodesAccessorsStorageBufferNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("storage")(value.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsStorageBufferNodeMod.default]]

inline def sub: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("sub").asInstanceOf[Operator]

inline def tan: Unary = ^.asInstanceOf[js.Dynamic].selectDynamic("tan").asInstanceOf[Unary]

inline def tangentGeometry: Swizzable[TangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("tangentGeometry").asInstanceOf[Swizzable[TangentNode]]

inline def tangentLocal: Swizzable[TangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("tangentLocal").asInstanceOf[Swizzable[TangentNode]]

inline def tangentView: Swizzable[TangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("tangentView").asInstanceOf[Swizzable[TangentNode]]

inline def tangentWorld: Swizzable[TangentNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("tangentWorld").asInstanceOf[Swizzable[TangentNode]]

inline def temp(node: NodeRepresentation[Node]): Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("temp")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VarNode]]
inline def temp(node: NodeRepresentation[Node], name: String): Swizzable[VarNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("temp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VarNode]]

inline def texture(value: Texture): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any]).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
inline def texture(value: Texture, uvNode: Unit, levelNode: NodeRepresentation[Node]): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
inline def texture(value: Texture, uvNode: NodeRepresentation[Node]): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
inline def texture(value: Texture, uvNode: NodeRepresentation[Node], levelNode: NodeRepresentation[Node]): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]

inline def timerDelta(timeScale: Double): Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("timerDelta")(timeScale.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TimerNode]]
inline def timerDelta(timeScale: Double, value: Double): Swizzable[TimerNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("timerDelta")(timeScale.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TimerNode]]

inline def timerGlobal(timeScale: Double): Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("timerGlobal")(timeScale.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TimerNode]]
inline def timerGlobal(timeScale: Double, value: Double): Swizzable[TimerNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("timerGlobal")(timeScale.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TimerNode]]

inline def timerLocal(timeScale: Double): Swizzable[TimerNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("timerLocal")(timeScale.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TimerNode]]
inline def timerLocal(timeScale: Double, value: Double): Swizzable[TimerNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("timerLocal")(timeScale.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TimerNode]]

inline def toneMapping(mapping: ToneMapping, exposure: NodeRepresentation[Node], color: NodeRepresentation[Node]): Swizzable[ToneMappingNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("toneMapping")(mapping.asInstanceOf[js.Any], exposure.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ToneMappingNode]]

inline def transformDirection: Binary = ^.asInstanceOf[js.Dynamic].selectDynamic("transformDirection").asInstanceOf[Binary]

inline def transformedBitangentView: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("transformedBitangentView").asInstanceOf[Swizzable[MathNode]]

inline def transformedBitangentWorld: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("transformedBitangentWorld").asInstanceOf[Swizzable[MathNode]]

inline def transformedNormalView: Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("transformedNormalView").asInstanceOf[Swizzable[VarNode]]

inline def transformedTangentView: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("transformedTangentView").asInstanceOf[Swizzable[MathNode]]

inline def transformedTangentWorld: Swizzable[MathNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("transformedTangentWorld").asInstanceOf[Swizzable[MathNode]]

inline def triplanarTexture(texture: NodeRepresentation[Node], params: NodeRepresentation[Node]*): Swizzable[TriplanarTexturesNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTexture")(scala.List(texture.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Swizzable[TriplanarTexturesNode]]

inline def triplanarTextures(textureXNode: NodeRepresentation[Node]): Swizzable[TriplanarTexturesNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: Unit,
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node],
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(textureXNode: NodeRepresentation[Node], textureYNode: Unit, textureZNode: NodeRepresentation[Node]): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: Unit,
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node],
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: Unit,
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(textureXNode: NodeRepresentation[Node], textureYNode: NodeRepresentation[Node]): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: Unit,
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node],
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: Unit,
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: Unit,
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: Unit,
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node],
  positionNode: Unit,
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]
inline def triplanarTextures(
  textureXNode: NodeRepresentation[Node],
  textureYNode: NodeRepresentation[Node],
  textureZNode: NodeRepresentation[Node],
  scaleNode: NodeRepresentation[Node],
  positionNode: NodeRepresentation[Node],
  normalNode: NodeRepresentation[Node]
): Swizzable[TriplanarTexturesNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("triplanarTextures")(textureXNode.asInstanceOf[js.Any], textureYNode.asInstanceOf[js.Any], textureZNode.asInstanceOf[js.Any], scaleNode.asInstanceOf[js.Any], positionNode.asInstanceOf[js.Any], normalNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[TriplanarTexturesNode]]

inline def uint: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("uint").asInstanceOf[ConvertType]

inline def umat3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("umat3").asInstanceOf[ConvertType]

inline def umat4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("umat4").asInstanceOf[ConvertType]

inline def uniform(nodeOrType: NodeValueOption): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
inline def uniform(nodeOrType: default): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
inline def uniform(nodeOrType: Swizzable[Node]): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]

inline def userData(name: String, inputType: NodeTypeOption): Swizzable[UserDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("userData")(name.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[UserDataNode]]
inline def userData(name: String, inputType: NodeTypeOption, userData: NodeUserData): Swizzable[UserDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("userData")(name.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Swizzable[UserDataNode]]

inline def uv(): Swizzable[UVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uv")().asInstanceOf[Swizzable[UVNode]]
inline def uv(index: Double): Swizzable[UVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uv")(index.asInstanceOf[js.Any]).asInstanceOf[Swizzable[UVNode]]

inline def uvec2: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("uvec2").asInstanceOf[ConvertType]

inline def uvec3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("uvec3").asInstanceOf[ConvertType]

inline def uvec4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("uvec4").asInstanceOf[ConvertType]

inline def vary(node: NodeRepresentation[Node]): Swizzable[VaryNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("vary")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VaryNode]]
inline def vary(node: NodeRepresentation[Node], name: String): Swizzable[VaryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("vary")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VaryNode]]

inline def vec2: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("vec2").asInstanceOf[ConvertType]

inline def vec3: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("vec3").asInstanceOf[ConvertType]

inline def vec4: ConvertType = ^.asInstanceOf[js.Dynamic].selectDynamic("vec4").asInstanceOf[ConvertType]

inline def vibrance(colorNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrance")(colorNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ColorAdjustmentNode]]
inline def vibrance(colorNode: NodeRepresentation[Node], adjustmentNode: NodeRepresentation[Node]): Swizzable[ColorAdjustmentNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("vibrance")(colorNode.asInstanceOf[js.Any], adjustmentNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ColorAdjustmentNode]]

inline def xor: Operator = ^.asInstanceOf[js.Dynamic].selectDynamic("xor").asInstanceOf[Operator]
