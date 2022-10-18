package typings.three

import typings.std.ArrayLike
import typings.three.anon.Call
import typings.three.examplesJsmNodesCoreCodeNodeMod.CodeNodeInclude
import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesCoreConstantsMod.NodeUserData
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.examplesJsmNodesCoreFunctionNodeMod.FunctionNodeArguments
import typings.three.examplesJsmNodesCoreNodeBuilderMod.NodeBuilderContext
import typings.three.examplesJsmNodesCoreNodeMod.default
import typings.three.examplesJsmNodesNodesMod.BufferNode
import typings.three.examplesJsmNodesNodesMod.BypassNode
import typings.three.examplesJsmNodesNodesMod.CameraNode
import typings.three.examplesJsmNodesNodesMod.CodeNode
import typings.three.examplesJsmNodesNodesMod.ComputeNode
import typings.three.examplesJsmNodesNodesMod.ContextNode
import typings.three.examplesJsmNodesNodesMod.ExpressionNode
import typings.three.examplesJsmNodesNodesMod.FrontFacingNode
import typings.three.examplesJsmNodesNodesMod.FunctionCallNode
import typings.three.examplesJsmNodesNodesMod.FunctionNode
import typings.three.examplesJsmNodesNodesMod.InstanceIndexNode
import typings.three.examplesJsmNodesNodesMod.MaterialNode
import typings.three.examplesJsmNodesNodesMod.MaterialReferenceNode
import typings.three.examplesJsmNodesNodesMod.MathNode
import typings.three.examplesJsmNodesNodesMod.ModelNode
import typings.three.examplesJsmNodesNodesMod.ModelViewProjectionNode
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesNodesMod.NodeBuilder
import typings.three.examplesJsmNodesNodesMod.NormalNode
import typings.three.examplesJsmNodesNodesMod.PointUVNode
import typings.three.examplesJsmNodesNodesMod.PositionNode
import typings.three.examplesJsmNodesNodesMod.PropertyNode
import typings.three.examplesJsmNodesNodesMod.ReferenceNode
import typings.three.examplesJsmNodesNodesMod.UVNode
import typings.three.examplesJsmNodesNodesMod.UserDataNode
import typings.three.examplesJsmNodesNodesMod.VarNode
import typings.three.examplesJsmNodesNodesMod.VaryNode
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
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesShadernodeShaderNodeBaseElementsMod {
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "EPSILON")
  @js.native
  val EPSILON: Swizzable[Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "INFINITY")
  @js.native
  val INFINITY: Swizzable[Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "ShaderNode")
  @js.native
  open class ShaderNode[T, R /* <: Node */] protected ()
    extends typings.three.examplesJsmNodesShadernodeShaderNodeMod.ShaderNode[T, R] {
    def this(jsFunc: js.Function2[/* inputs */ NodeObjects_[T], /* builder */ NodeBuilder, NodeRepresentation[Node]]) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "abs")
  @js.native
  val abs: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "acos")
  @js.native
  val acos: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "add")
  @js.native
  val add: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "alphaTest")
  @js.native
  val alphaTest: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "and")
  @js.native
  val and: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "asin")
  @js.native
  val asin: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "assign")
  @js.native
  val assign: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "atan")
  @js.native
  val atan: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "atan2")
  @js.native
  val atan2: Binary = js.native
  
  inline def attribute(attributeName: String, nodeType: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("attribute")(attributeName.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bitAnd")
  @js.native
  val bitAnd: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bitOr")
  @js.native
  val bitOr: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bitXor")
  @js.native
  val bitXor: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bmat3")
  @js.native
  val bmat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bmat4")
  @js.native
  val bmat4: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bool")
  @js.native
  val bool: ConvertType = js.native
  
  inline def buffer(value: ArrayLike[Double], nodeOrType: NodeOrType, count: Double): Swizzable[BufferNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(value.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BufferNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bvec2")
  @js.native
  val bvec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bvec3")
  @js.native
  val bvec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "bvec4")
  @js.native
  val bvec4: ConvertType = js.native
  
  inline def bypass(returnNode: NodeRepresentation[Node], callNode: NodeRepresentation[Node]): Swizzable[BypassNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("bypass")(returnNode.asInstanceOf[js.Any], callNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[BypassNode]]
  
  inline def call[P /* <: FunctionNodeArguments */](): Swizzable[FunctionCallNode[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")().asInstanceOf[Swizzable[FunctionCallNode[P]]]
  inline def call[P /* <: FunctionNodeArguments */](functionNode: Unit, parameters: ProxiedObject[P]): Swizzable[FunctionCallNode[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FunctionCallNode[P]]]
  inline def call[P /* <: FunctionNodeArguments */](functionNode: FunctionNode[P]): Swizzable[FunctionCallNode[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any]).asInstanceOf[Swizzable[FunctionCallNode[P]]]
  inline def call[P /* <: FunctionNodeArguments */](functionNode: FunctionNode[P], parameters: ProxiedObject[P]): Swizzable[FunctionCallNode[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(functionNode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Swizzable[FunctionCallNode[P]]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cameraNormalMatrix")
  @js.native
  val cameraNormalMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cameraPosition")
  @js.native
  val cameraPosition: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cameraProjectionMatrix")
  @js.native
  val cameraProjectionMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cameraViewMatrix")
  @js.native
  val cameraViewMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cameraWorldMatrix")
  @js.native
  val cameraWorldMatrix: Swizzable[CameraNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "ceil")
  @js.native
  val ceil: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "clamp")
  @js.native
  val clamp: Ternary = js.native
  
  inline def code(code: String): Swizzable[CodeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("code")(code.asInstanceOf[js.Any]).asInstanceOf[Swizzable[CodeNode]]
  inline def code(code: String, nodeType: NodeTypeOption): Swizzable[CodeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(code.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[CodeNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "color")
  @js.native
  val color: ConvertType = js.native
  
  inline def compute(node: NodeRepresentation[Node], count: Double, workgroupSize: js.Array[Double]): Swizzable[ComputeNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("compute")(node.asInstanceOf[js.Any], count.asInstanceOf[js.Any], workgroupSize.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ComputeNode]]
  
  inline def cond(
    condNode: NodeRepresentation[Node],
    ifNode: NodeRepresentation[Node],
    elseNode: NodeRepresentation[Node]
  ): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(condNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any], elseNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  inline def context(node: NodeRepresentation[Node], context: NodeBuilderContext): Swizzable[ContextNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("context")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ContextNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cos")
  @js.native
  val cos: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "cross")
  @js.native
  val cross: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "dFdx")
  @js.native
  val dFdx: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "dFdy")
  @js.native
  val dFdy: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "degrees")
  @js.native
  val degrees: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "diffuseColor")
  @js.native
  val diffuseColor: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "distance")
  @js.native
  val distance: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "div")
  @js.native
  val div: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "dot")
  @js.native
  val dot: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "dotNV")
  @js.native
  val dotNV: Swizzable[MathNode] = js.native
  
  inline def element(node: NodeRepresentation[Node], indexNode: NodeRepresentation[Node]): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(node.asInstanceOf[js.Any], indexNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "equal")
  @js.native
  val equal: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "exp")
  @js.native
  val exp: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "exp2")
  @js.native
  val exp2: Unary = js.native
  
  inline def expression(): Swizzable[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("expression")().asInstanceOf[Swizzable[ExpressionNode]]
  inline def expression(snipped: String): Swizzable[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ExpressionNode]]
  inline def expression(snipped: String, nodeType: NodeTypeOption): Swizzable[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ExpressionNode]]
  inline def expression(snipped: Unit, nodeType: NodeTypeOption): Swizzable[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(snipped.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ExpressionNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "faceDirection")
  @js.native
  val faceDirection: Swizzable[Node] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "faceforward")
  @js.native
  val faceforward: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "float")
  @js.native
  val float: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "floor")
  @js.native
  val floor: Unary = js.native
  
  inline def fn[P /* <: FunctionNodeArguments */](code: String): js.Function1[/* params */ Fn_[P], Swizzable[Node]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(code.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Fn_[P], Swizzable[Node]]]
  inline def fn[P /* <: FunctionNodeArguments */](code: String, includes: js.Array[CodeNodeInclude]): js.Function1[/* params */ Fn_[P], Swizzable[Node]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fn")(code.asInstanceOf[js.Any], includes.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Fn_[P], Swizzable[Node]]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "fract")
  @js.native
  val fract: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "frontFacing")
  @js.native
  val frontFacing: Swizzable[FrontFacingNode] = js.native
  
  inline def func[P /* <: FunctionNodeArguments */](code: String): Call[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(code.asInstanceOf[js.Any]).asInstanceOf[Call[P]]
  inline def func[P /* <: FunctionNodeArguments */](code: String, includes: js.Array[CodeNodeInclude]): Call[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(code.asInstanceOf[js.Any], includes.asInstanceOf[js.Any])).asInstanceOf[Call[P]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "greaterThan")
  @js.native
  val greaterThan: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "greaterThanEqual")
  @js.native
  val greaterThanEqual: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "imat3")
  @js.native
  val imat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "imat4")
  @js.native
  val imat4: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "instanceIndex")
  @js.native
  val instanceIndex: Swizzable[InstanceIndexNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "int")
  @js.native
  val int: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "inversesqrt")
  @js.native
  val inversesqrt: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "invert")
  @js.native
  val invert: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "ivec2")
  @js.native
  val ivec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "ivec3")
  @js.native
  val ivec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "ivec4")
  @js.native
  val ivec4: ConvertType = js.native
  
  inline def label(node: NodeRepresentation[Node]): Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VarNode]]
  inline def label(node: NodeRepresentation[Node], name: String): Swizzable[VarNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("label")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VarNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "length")
  @js.native
  val length: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "lessThan")
  @js.native
  val lessThan: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "lessThanEqual")
  @js.native
  val lessThanEqual: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "log")
  @js.native
  val log: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "log2")
  @js.native
  val log2: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "mat3")
  @js.native
  val mat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "mat4")
  @js.native
  val mat4: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialAlphaTest")
  @js.native
  val materialAlphaTest: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialColor")
  @js.native
  val materialColor: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialEmissive")
  @js.native
  val materialEmissive: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialMetalness")
  @js.native
  val materialMetalness: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialOpacity")
  @js.native
  val materialOpacity: Swizzable[MaterialNode] = js.native
  
  inline def materialReference(name: String, nodeOrType: NodeOrType, material: Material): Swizzable[MaterialReferenceNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("materialReference")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[Swizzable[MaterialReferenceNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialRotation")
  @js.native
  val materialRotation: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "materialRoughness")
  @js.native
  val materialRoughness: Swizzable[MaterialNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "max")
  @js.native
  val max: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "metalness")
  @js.native
  val metalness: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "min")
  @js.native
  val min: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "mix")
  @js.native
  val mix: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "mod")
  @js.native
  val mod: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "modelNormalMatrix")
  @js.native
  val modelNormalMatrix: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "modelPosition")
  @js.native
  val modelPosition: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "modelViewMatrix")
  @js.native
  val modelViewMatrix: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "modelViewPosition")
  @js.native
  val modelViewPosition: Swizzable[ModelNode] = js.native
  
  inline def modelViewProjection(): Swizzable[ModelViewProjectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelViewProjection")().asInstanceOf[Swizzable[ModelViewProjectionNode]]
  inline def modelViewProjection(position: NodeRepresentation[Node]): Swizzable[ModelViewProjectionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelViewProjection")(position.asInstanceOf[js.Any]).asInstanceOf[Swizzable[ModelViewProjectionNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "modelWorldMatrix")
  @js.native
  val modelWorldMatrix: Swizzable[ModelNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "mul")
  @js.native
  val mul: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "negate")
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
  inline def nodeObject[T /* <: Node & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in three.three/examples/jsm/nodes/core/constants.SwizzleOption | number ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.Node>} */ js.Any) */](obj: T): NodeObject_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[T]]
  
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
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "normalGeometry")
  @js.native
  val normalGeometry: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "normalLocal")
  @js.native
  val normalLocal: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "normalView")
  @js.native
  val normalView: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "normalWorld")
  @js.native
  val normalWorld: Swizzable[NormalNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "normalize")
  @js.native
  val normalize: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "or")
  @js.native
  val or: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "pointUV")
  @js.native
  val pointUV: Swizzable[PointUVNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "positionGeometry")
  @js.native
  val positionGeometry: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "positionLocal")
  @js.native
  val positionLocal: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "positionView")
  @js.native
  val positionView: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "positionViewDirection")
  @js.native
  val positionViewDirection: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "positionWorld")
  @js.native
  val positionWorld: Swizzable[PositionNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "pow")
  @js.native
  val pow: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "pow2")
  @js.native
  val pow2: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "pow3")
  @js.native
  val pow3: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "pow4")
  @js.native
  val pow4: Binary = js.native
  
  inline def property(name: String, nodeOrType: NodeTypeOption): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  inline def property(name: String, nodeOrType: default): Swizzable[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("property")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "radians")
  @js.native
  val radians: Unary = js.native
  
  inline def reference[T](name: String, nodeOrType: NodeOrType, `object`: T): Swizzable[ReferenceNode[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(name.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ReferenceNode[T]]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "reflect")
  @js.native
  val reflect: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "refract")
  @js.native
  val refract: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "remainder")
  @js.native
  val remainder: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "roughness")
  @js.native
  val roughness: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "round")
  @js.native
  val round: Unary = js.native
  
  inline def sampler(texture: typings.three.examplesJsmNodesAccessorsTextureNodeMod.default): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampler")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  inline def sampler(texture: Texture): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampler")(texture.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "saturate")
  @js.native
  val saturate: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "shiftLeft")
  @js.native
  val shiftLeft: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "shiftRight")
  @js.native
  val shiftRight: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "sign")
  @js.native
  val sign: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "sin")
  @js.native
  val sin: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "smoothstep")
  @js.native
  val smoothstep: Ternary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "specularColor")
  @js.native
  val specularColor: Swizzable[PropertyNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "sqrt")
  @js.native
  val sqrt: Unary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "step")
  @js.native
  val step: Binary = js.native
  
  inline def storage(value: ArrayLike[Double], nodeOrType: NodeOrType, count: Double): Swizzable[typings.three.examplesJsmNodesAccessorsStorageBufferNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("storage")(value.asInstanceOf[js.Any], nodeOrType.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsStorageBufferNodeMod.default]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "sub")
  @js.native
  val sub: Operator = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "tan")
  @js.native
  val tan: Unary = js.native
  
  inline def temp(node: NodeRepresentation[Node]): Swizzable[VarNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("temp")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VarNode]]
  inline def temp(node: NodeRepresentation[Node], name: String): Swizzable[VarNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("temp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VarNode]]
  
  inline def texture(value: Texture): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any]).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
  inline def texture(value: Texture, uvNode: Unit, levelNode: NodeRepresentation[Node]): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
  inline def texture(value: Texture, uvNode: NodeRepresentation[Node]): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
  inline def texture(value: Texture, uvNode: NodeRepresentation[Node], levelNode: NodeRepresentation[Node]): Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("texture")(value.asInstanceOf[js.Any], uvNode.asInstanceOf[js.Any], levelNode.asInstanceOf[js.Any])).asInstanceOf[Swizzable[typings.three.examplesJsmNodesAccessorsTextureNodeMod.default]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "transformDirection")
  @js.native
  val transformDirection: Binary = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "transformedNormalView")
  @js.native
  val transformedNormalView: Swizzable[VarNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "transformedNormalWorld")
  @js.native
  val transformedNormalWorld: Swizzable[MathNode] = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "uint")
  @js.native
  val uint: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "umat3")
  @js.native
  val umat3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "umat4")
  @js.native
  val umat4: ConvertType = js.native
  
  inline def uniform(nodeOrType: NodeValueOption): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  inline def uniform(nodeOrType: default): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  inline def uniform(nodeOrType: Swizzable[Node]): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(nodeOrType.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  inline def userData(name: String, inputType: NodeTypeOption): Swizzable[UserDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("userData")(name.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any])).asInstanceOf[Swizzable[UserDataNode]]
  inline def userData(name: String, inputType: NodeTypeOption, userData: NodeUserData): Swizzable[UserDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("userData")(name.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any], userData.asInstanceOf[js.Any])).asInstanceOf[Swizzable[UserDataNode]]
  
  inline def uv(): Swizzable[UVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uv")().asInstanceOf[Swizzable[UVNode]]
  inline def uv(index: Double): Swizzable[UVNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("uv")(index.asInstanceOf[js.Any]).asInstanceOf[Swizzable[UVNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "uvec2")
  @js.native
  val uvec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "uvec3")
  @js.native
  val uvec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "uvec4")
  @js.native
  val uvec4: ConvertType = js.native
  
  inline def vary(node: NodeRepresentation[Node]): Swizzable[VaryNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("vary")(node.asInstanceOf[js.Any]).asInstanceOf[Swizzable[VaryNode]]
  inline def vary(node: NodeRepresentation[Node], name: String): Swizzable[VaryNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("vary")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Swizzable[VaryNode]]
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "vec2")
  @js.native
  val vec2: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "vec3")
  @js.native
  val vec3: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "vec4")
  @js.native
  val vec4: ConvertType = js.native
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNodeBaseElements", "xor")
  @js.native
  val xor: Operator = js.native
  
  type Binary = js.Function2[
    /* a */ NodeRepresentation[Node], 
    /* b */ NodeRepresentation[Node], 
    Swizzable[MathNode]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    P extends [...std.Array<unknown>] ? three.three/examples/jsm/nodes/shadernode/ShaderNode.ProxiedTuple<P> : [three.three/examples/jsm/nodes/shadernode/ShaderNode.ProxiedObject<P>]
    }}}
    */
  @js.native
  trait Fn_[P /* <: FunctionNodeArguments */] extends StObject
  
  @js.native
  trait Operator extends StObject {
    
    def apply(a: NodeRepresentation[Node], b: NodeRepresentation[Node], others: NodeRepresentation[Node]*): Swizzable[Node] = js.native
  }
  
  type Ternary = js.Function3[
    /* a */ NodeRepresentation[Node], 
    /* b */ NodeRepresentation[Node], 
    /* c */ NodeRepresentation[Node], 
    Swizzable[MathNode]
  ]
  
  type Unary = js.Function1[/* a */ NodeRepresentation[Node], Swizzable[MathNode]]
}
