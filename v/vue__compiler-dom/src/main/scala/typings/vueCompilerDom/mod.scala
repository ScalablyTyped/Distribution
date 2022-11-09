package typings.vueCompilerDom

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.babelTypes.mod.BlockStatement_
import typings.babelTypes.mod.Function
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.Program_
import typings.std.Record
import typings.vueCompilerCore.anon.CodegenOptionsonContextCr
import typings.vueCompilerCore.anon.Directives
import typings.vueCompilerCore.anon.HasDynamicSlots
import typings.vueCompilerCore.mod.ArrayExpression
import typings.vueCompilerCore.mod.AssignmentExpression
import typings.vueCompilerCore.mod.AttributeNode
import typings.vueCompilerCore.mod.BlockCodegenNode
import typings.vueCompilerCore.mod.BlockStatement
import typings.vueCompilerCore.mod.CacheExpression
import typings.vueCompilerCore.mod.CallExpression
import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerDeprecationTypes
import typings.vueCompilerCore.mod.CompilerError
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerCore.mod.ComponentNode
import typings.vueCompilerCore.mod.CompoundExpressionNode
import typings.vueCompilerCore.mod.ConditionalExpression
import typings.vueCompilerCore.mod.ConstantTypes
import typings.vueCompilerCore.mod.DirectiveArguments
import typings.vueCompilerCore.mod.DirectiveNode
import typings.vueCompilerCore.mod.DirectiveTransform
import typings.vueCompilerCore.mod.ElementNode
import typings.vueCompilerCore.mod.ExpressionNode
import typings.vueCompilerCore.mod.ForNode
import typings.vueCompilerCore.mod.ForParseResult
import typings.vueCompilerCore.mod.ForRenderListExpression
import typings.vueCompilerCore.mod.FunctionExpression
import typings.vueCompilerCore.mod.IfBranchNode
import typings.vueCompilerCore.mod.IfNode
import typings.vueCompilerCore.mod.IfStatement
import typings.vueCompilerCore.mod.InferCodegenNodeType
import typings.vueCompilerCore.mod.InferCompilerError
import typings.vueCompilerCore.mod.InterpolationNode
import typings.vueCompilerCore.mod.JSChildNode
import typings.vueCompilerCore.mod.MemoExpression
import typings.vueCompilerCore.mod.Node2
import typings.vueCompilerCore.mod.NodeTransform
import typings.vueCompilerCore.mod.ObjectExpression
import typings.vueCompilerCore.mod.ParserContext
import typings.vueCompilerCore.mod.ParserOptions
import typings.vueCompilerCore.mod.Position
import typings.vueCompilerCore.mod.Property
import typings.vueCompilerCore.mod.PropsExpression
import typings.vueCompilerCore.mod.RenderSlotCall
import typings.vueCompilerCore.mod.ReturnStatement
import typings.vueCompilerCore.mod.RootNode
import typings.vueCompilerCore.mod.SSRCodegenNode
import typings.vueCompilerCore.mod.SequenceExpression
import typings.vueCompilerCore.mod.SimpleExpressionNode
import typings.vueCompilerCore.mod.SlotFnBuilder
import typings.vueCompilerCore.mod.SlotOutletNode
import typings.vueCompilerCore.mod.SlotOutletProcessResult
import typings.vueCompilerCore.mod.SlotsExpression
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerCore.mod.StructuralDirectiveTransform
import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueCompilerCore.mod.TemplateLiteral
import typings.vueCompilerCore.mod.TemplateTextChildNode
import typings.vueCompilerCore.mod.TextNode
import typings.vueCompilerCore.mod.TransformContext
import typings.vueCompilerCore.mod.TransformOptions
import typings.vueCompilerCore.mod.TransformPreset
import typings.vueCompilerCore.mod.VNodeCall
import typings.vueCompilerDom.vueCompilerDomInts.`50`
import typings.vueCompilerDom.vueCompilerDomInts.`51`
import typings.vueCompilerDom.vueCompilerDomInts.`52`
import typings.vueCompilerDom.vueCompilerDomInts.`53`
import typings.vueCompilerDom.vueCompilerDomInts.`54`
import typings.vueCompilerDom.vueCompilerDomInts.`55`
import typings.vueCompilerDom.vueCompilerDomInts.`56`
import typings.vueCompilerDom.vueCompilerDomInts.`57`
import typings.vueCompilerDom.vueCompilerDomInts.`58`
import typings.vueCompilerDom.vueCompilerDomInts.`59`
import typings.vueCompilerDom.vueCompilerDomInts.`60`
import typings.vueCompilerDom.vueCompilerDomInts.`61`
import typings.vueCompilerDom.vueCompilerDomStrings.component
import typings.vueCompilerDom.vueCompilerDomStrings.directive
import typings.vueCompilerDom.vueCompilerDomStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/compiler-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/compiler-dom", "BASE_TRANSITION")
  @js.native
  val BASE_TRANSITION: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CAMELIZE")
  @js.native
  val CAMELIZE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CAPITALIZE")
  @js.native
  val CAPITALIZE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_BLOCK")
  @js.native
  val CREATE_BLOCK: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_COMMENT")
  @js.native
  val CREATE_COMMENT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_ELEMENT_BLOCK")
  @js.native
  val CREATE_ELEMENT_BLOCK: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_ELEMENT_VNODE")
  @js.native
  val CREATE_ELEMENT_VNODE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_SLOTS")
  @js.native
  val CREATE_SLOTS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_STATIC")
  @js.native
  val CREATE_STATIC: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_TEXT")
  @js.native
  val CREATE_TEXT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "CREATE_VNODE")
  @js.native
  val CREATE_VNODE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "DOMDirectiveTransforms")
  @js.native
  val DOMDirectiveTransforms: Record[String, DirectiveTransform] = js.native
  
  @JSImport("@vue/compiler-dom", "DOMNodeTransforms")
  @js.native
  val DOMNodeTransforms: js.Array[NodeTransform] = js.native
  
  @JSImport("@vue/compiler-dom", "FRAGMENT")
  @js.native
  val FRAGMENT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "GUARD_REACTIVE_PROPS")
  @js.native
  val GUARD_REACTIVE_PROPS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "IS_MEMO_SAME")
  @js.native
  val IS_MEMO_SAME: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "IS_REF")
  @js.native
  val IS_REF: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "KEEP_ALIVE")
  @js.native
  val KEEP_ALIVE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "MERGE_PROPS")
  @js.native
  val MERGE_PROPS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "NORMALIZE_CLASS")
  @js.native
  val NORMALIZE_CLASS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "NORMALIZE_PROPS")
  @js.native
  val NORMALIZE_PROPS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "NORMALIZE_STYLE")
  @js.native
  val NORMALIZE_STYLE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "OPEN_BLOCK")
  @js.native
  val OPEN_BLOCK: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "POP_SCOPE_ID")
  @js.native
  val POP_SCOPE_ID: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "PUSH_SCOPE_ID")
  @js.native
  val PUSH_SCOPE_ID: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "RENDER_LIST")
  @js.native
  val RENDER_LIST: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "RENDER_SLOT")
  @js.native
  val RENDER_SLOT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "RESOLVE_COMPONENT")
  @js.native
  val RESOLVE_COMPONENT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "RESOLVE_DIRECTIVE")
  @js.native
  val RESOLVE_DIRECTIVE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "RESOLVE_DYNAMIC_COMPONENT")
  @js.native
  val RESOLVE_DYNAMIC_COMPONENT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "RESOLVE_FILTER")
  @js.native
  val RESOLVE_FILTER: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "SET_BLOCK_TRACKING")
  @js.native
  val SET_BLOCK_TRACKING: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "SUSPENSE")
  @js.native
  val SUSPENSE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "TELEPORT")
  @js.native
  val TELEPORT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "TO_DISPLAY_STRING")
  @js.native
  val TO_DISPLAY_STRING: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "TO_HANDLERS")
  @js.native
  val TO_HANDLERS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "TO_HANDLER_KEY")
  @js.native
  val TO_HANDLER_KEY: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "TRANSITION")
  @js.native
  val TRANSITION: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "TRANSITION_GROUP")
  @js.native
  val TRANSITION_GROUP: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "UNREF")
  @js.native
  val UNREF: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_MODEL_CHECKBOX")
  @js.native
  val V_MODEL_CHECKBOX: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_MODEL_DYNAMIC")
  @js.native
  val V_MODEL_DYNAMIC: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_MODEL_RADIO")
  @js.native
  val V_MODEL_RADIO: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_MODEL_SELECT")
  @js.native
  val V_MODEL_SELECT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_MODEL_TEXT")
  @js.native
  val V_MODEL_TEXT: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_ON_WITH_KEYS")
  @js.native
  val V_ON_WITH_KEYS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_ON_WITH_MODIFIERS")
  @js.native
  val V_ON_WITH_MODIFIERS: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "V_SHOW")
  @js.native
  val V_SHOW: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "WITH_CTX")
  @js.native
  val WITH_CTX: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "WITH_DIRECTIVES")
  @js.native
  val WITH_DIRECTIVES: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "WITH_MEMO")
  @js.native
  val WITH_MEMO: js.Symbol = js.native
  
  inline def advancePositionWithClone(pos: Position, source: String): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithClone")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Position]
  inline def advancePositionWithClone(pos: Position, source: String, numberOfCharacters: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithClone")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any], numberOfCharacters.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  inline def advancePositionWithMutation(pos: Position, source: String): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithMutation")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Position]
  inline def advancePositionWithMutation(pos: Position, source: String, numberOfCharacters: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("advancePositionWithMutation")(pos.asInstanceOf[js.Any], source.asInstanceOf[js.Any], numberOfCharacters.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  inline def assert(condition: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(condition: Boolean, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def baseCompile(template: String): CodegenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any]).asInstanceOf[CodegenResult]
  inline def baseCompile(template: String, options: CompilerOptions): CodegenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodegenResult]
  inline def baseCompile(template: RootNode): CodegenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any]).asInstanceOf[CodegenResult]
  inline def baseCompile(template: RootNode, options: CompilerOptions): CodegenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("baseCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodegenResult]
  
  inline def baseParse(content: String): RootNode = ^.asInstanceOf[js.Dynamic].applyDynamic("baseParse")(content.asInstanceOf[js.Any]).asInstanceOf[RootNode]
  inline def baseParse(content: String, options: ParserOptions): RootNode = (^.asInstanceOf[js.Dynamic].applyDynamic("baseParse")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RootNode]
  
  inline def buildDirectiveArgs(dir: DirectiveNode, context: TransformContext): ArrayExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDirectiveArgs")(dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ArrayExpression]
  
  inline def buildProps(
    node: ElementNode,
    context: TransformContext,
    props: js.Array[DirectiveNode | AttributeNode],
    isComponent: Boolean,
    isDynamicComponent: Boolean
  ): Directives = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any], isDynamicComponent.asInstanceOf[js.Any])).asInstanceOf[Directives]
  inline def buildProps(
    node: ElementNode,
    context: TransformContext,
    props: js.Array[DirectiveNode | AttributeNode],
    isComponent: Boolean,
    isDynamicComponent: Boolean,
    ssr: Boolean
  ): Directives = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any], isDynamicComponent.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[Directives]
  inline def buildProps(
    node: ElementNode,
    context: TransformContext,
    props: Unit,
    isComponent: Boolean,
    isDynamicComponent: Boolean
  ): Directives = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any], isDynamicComponent.asInstanceOf[js.Any])).asInstanceOf[Directives]
  inline def buildProps(
    node: ElementNode,
    context: TransformContext,
    props: Unit,
    isComponent: Boolean,
    isDynamicComponent: Boolean,
    ssr: Boolean
  ): Directives = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProps")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any], isDynamicComponent.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[Directives]
  
  inline def buildSlots(node: ElementNode, context: TransformContext): HasDynamicSlots = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSlots")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[HasDynamicSlots]
  inline def buildSlots(node: ElementNode, context: TransformContext, buildSlotFn: SlotFnBuilder): HasDynamicSlots = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSlots")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], buildSlotFn.asInstanceOf[js.Any])).asInstanceOf[HasDynamicSlots]
  
  inline def checkCompatEnabled(key: CompilerDeprecationTypes, context: ParserContext, loc: Null, args: Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCompatEnabled")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  inline def checkCompatEnabled(key: CompilerDeprecationTypes, context: ParserContext, loc: SourceLocation, args: Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCompatEnabled")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  inline def checkCompatEnabled(key: CompilerDeprecationTypes, context: TransformContext, loc: Null, args: Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCompatEnabled")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  inline def checkCompatEnabled(key: CompilerDeprecationTypes, context: TransformContext, loc: SourceLocation, args: Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCompatEnabled")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  
  inline def compile(template: String): CodegenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[CodegenResult]
  inline def compile(template: String, options: CompilerOptions): CodegenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodegenResult]
  
  inline def createArrayExpression(elements: js.Array[String | Node2]): ArrayExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createArrayExpression")(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayExpression]
  inline def createArrayExpression(elements: js.Array[String | Node2], loc: SourceLocation): ArrayExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createArrayExpression")(elements.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ArrayExpression]
  
  inline def createAssignmentExpression(left: SimpleExpressionNode, right: JSChildNode): AssignmentExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createAssignmentExpression")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentExpression]
  
  inline def createBlockStatement(body: js.Array[JSChildNode | IfStatement]): BlockStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockStatement")(body.asInstanceOf[js.Any]).asInstanceOf[BlockStatement]
  
  inline def createCacheExpression(index: Double, value: JSChildNode): CacheExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheExpression")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[CacheExpression]
  inline def createCacheExpression(index: Double, value: JSChildNode, isVNode: Boolean): CacheExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheExpression")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any], isVNode.asInstanceOf[js.Any])).asInstanceOf[CacheExpression]
  
  inline def createCallExpression(callee: String): InferCodegenNodeType[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any]).asInstanceOf[InferCodegenNodeType[String]]
  inline def createCallExpression(
    callee: String,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[String]]
  inline def createCallExpression(
    callee: String,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[String]]
  inline def createCallExpression(callee: String, args: Unit, loc: SourceLocation): InferCodegenNodeType[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[String]]
  inline def createCallExpression(callee: js.Symbol): InferCodegenNodeType[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any]).asInstanceOf[InferCodegenNodeType[js.Symbol]]
  inline def createCallExpression(
    callee: js.Symbol,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[js.Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[js.Symbol]]
  inline def createCallExpression(
    callee: js.Symbol,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[js.Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[js.Symbol]]
  inline def createCallExpression(callee: js.Symbol, args: Unit, loc: SourceLocation): InferCodegenNodeType[js.Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[js.Symbol]]
  
  inline def createCompilerError[T /* <: Double */](code: T): InferCompilerError[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any]).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: Unit, messages: NumberDictionary[String]): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: Unit, messages: NumberDictionary[String], additionalMessage: String): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: Unit, messages: Unit, additionalMessage: String): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation, messages: NumberDictionary[String]): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation, messages: NumberDictionary[String], additionalMessage: String): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  inline def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation, messages: Unit, additionalMessage: String): InferCompilerError[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], additionalMessage.asInstanceOf[js.Any])).asInstanceOf[InferCompilerError[T]]
  
  inline def createCompoundExpression(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ]
  ): CompoundExpressionNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompoundExpression")(children.asInstanceOf[js.Any]).asInstanceOf[CompoundExpressionNode]
  inline def createCompoundExpression(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): CompoundExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompoundExpression")(children.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[CompoundExpressionNode]
  
  inline def createConditionalExpression(test: JSChildNode, consequent: JSChildNode, alternate: JSChildNode): ConditionalExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createConditionalExpression")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[ConditionalExpression]
  inline def createConditionalExpression(test: JSChildNode, consequent: JSChildNode, alternate: JSChildNode, newline: Boolean): ConditionalExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createConditionalExpression")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any], newline.asInstanceOf[js.Any])).asInstanceOf[ConditionalExpression]
  
  inline def createDOMCompilerError(code: DOMErrorCodes): DOMCompilerError = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMCompilerError")(code.asInstanceOf[js.Any]).asInstanceOf[DOMCompilerError]
  inline def createDOMCompilerError(code: DOMErrorCodes, loc: SourceLocation): DOMCompilerError = (^.asInstanceOf[js.Dynamic].applyDynamic("createDOMCompilerError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[DOMCompilerError]
  
  inline def createForLoopParams(param0: ForParseResult): js.Array[ExpressionNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForLoopParams")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ExpressionNode]]
  inline def createForLoopParams(param0: ForParseResult, memoArgs: js.Array[ExpressionNode]): js.Array[ExpressionNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForLoopParams")(param0.asInstanceOf[js.Any], memoArgs.asInstanceOf[js.Any])).asInstanceOf[js.Array[ExpressionNode]]
  
  inline def createFunctionExpression(
    params: js.UndefOr[ExpressionNode | String | (js.Array[ExpressionNode | String])],
    returns: js.UndefOr[TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode],
    newline: js.UndefOr[Boolean],
    isSlot: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): FunctionExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createFunctionExpression")(params.asInstanceOf[js.Any], returns.asInstanceOf[js.Any], newline.asInstanceOf[js.Any], isSlot.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[FunctionExpression]
  
  inline def createIfStatement(test: ExpressionNode, consequent: BlockStatement): IfStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any])).asInstanceOf[IfStatement]
  inline def createIfStatement(test: ExpressionNode, consequent: BlockStatement, alternate: BlockStatement): IfStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[IfStatement]
  inline def createIfStatement(test: ExpressionNode, consequent: BlockStatement, alternate: IfStatement): IfStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[IfStatement]
  inline def createIfStatement(test: ExpressionNode, consequent: BlockStatement, alternate: ReturnStatement): IfStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[IfStatement]
  
  inline def createInterpolation(content: String, loc: SourceLocation): InterpolationNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterpolation")(content.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InterpolationNode]
  inline def createInterpolation(content: ExpressionNode, loc: SourceLocation): InterpolationNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterpolation")(content.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InterpolationNode]
  
  inline def createObjectExpression(properties: js.Array[Property]): ObjectExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectExpression")(properties.asInstanceOf[js.Any]).asInstanceOf[ObjectExpression]
  inline def createObjectExpression(properties: js.Array[Property], loc: SourceLocation): ObjectExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectExpression")(properties.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ObjectExpression]
  
  inline def createObjectProperty(key: String, value: JSChildNode): Property = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Property]
  inline def createObjectProperty(key: ExpressionNode, value: JSChildNode): Property = (^.asInstanceOf[js.Dynamic].applyDynamic("createObjectProperty")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Property]
  
  inline def createReturnStatement(returns: js.Array[TemplateChildNode]): ReturnStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("createReturnStatement")(returns.asInstanceOf[js.Any]).asInstanceOf[ReturnStatement]
  inline def createReturnStatement(returns: JSChildNode): ReturnStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("createReturnStatement")(returns.asInstanceOf[js.Any]).asInstanceOf[ReturnStatement]
  inline def createReturnStatement(returns: TemplateChildNode): ReturnStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("createReturnStatement")(returns.asInstanceOf[js.Any]).asInstanceOf[ReturnStatement]
  
  inline def createRoot(children: js.Array[TemplateChildNode]): RootNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(children.asInstanceOf[js.Any]).asInstanceOf[RootNode]
  inline def createRoot(children: js.Array[TemplateChildNode], loc: SourceLocation): RootNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(children.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[RootNode]
  
  inline def createSequenceExpression(expressions: js.Array[JSChildNode]): SequenceExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequenceExpression")(expressions.asInstanceOf[js.Any]).asInstanceOf[SequenceExpression]
  
  inline def createSimpleExpression(content: String): SimpleExpressionNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any]).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Boolean): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Boolean, loc: Unit, constType: ConstantTypes): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], constType.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Boolean, loc: SourceLocation): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Boolean, loc: SourceLocation, constType: ConstantTypes): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], constType.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Unit, loc: Unit, constType: ConstantTypes): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], constType.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Unit, loc: SourceLocation): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  inline def createSimpleExpression(content: String, isStatic: Unit, loc: SourceLocation, constType: ConstantTypes): SimpleExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleExpression")(content.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], constType.asInstanceOf[js.Any])).asInstanceOf[SimpleExpressionNode]
  
  inline def createStructuralDirectiveTransform(name: String, fn: StructuralDirectiveTransform): NodeTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("createStructuralDirectiveTransform")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[NodeTransform]
  inline def createStructuralDirectiveTransform(name: js.RegExp, fn: StructuralDirectiveTransform): NodeTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("createStructuralDirectiveTransform")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[NodeTransform]
  
  inline def createTemplateLiteral(elements: js.Array[String | JSChildNode]): TemplateLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createTemplateLiteral")(elements.asInstanceOf[js.Any]).asInstanceOf[TemplateLiteral]
  
  inline def createTransformContext(root: RootNode, param1: TransformOptions): TransformContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransformContext")(root.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[TransformContext]
  
  inline def createVNodeCall(
    context: TransformContext | Null,
    tag: String | js.Symbol | CallExpression,
    props: js.UndefOr[PropsExpression],
    children: js.UndefOr[
      js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression | SimpleExpressionNode
    ],
    patchFlag: js.UndefOr[String],
    dynamicProps: js.UndefOr[String | SimpleExpressionNode],
    directives: js.UndefOr[DirectiveArguments],
    isBlock: js.UndefOr[Boolean],
    disableTracking: js.UndefOr[Boolean],
    isComponent: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): VNodeCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createVNodeCall")(context.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], isBlock.asInstanceOf[js.Any], disableTracking.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[VNodeCall]
  
  inline def extractIdentifiers(param: Node): js.Array[Identifier_] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractIdentifiers")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier_]]
  inline def extractIdentifiers(param: Node, nodes: js.Array[Identifier_]): js.Array[Identifier_] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractIdentifiers")(param.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Identifier_]]
  
  inline def findDir(node: ElementNode, name: String): js.UndefOr[DirectiveNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DirectiveNode]]
  inline def findDir(node: ElementNode, name: String, allowEmpty: Boolean): js.UndefOr[DirectiveNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DirectiveNode]]
  inline def findDir(node: ElementNode, name: js.RegExp): js.UndefOr[DirectiveNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DirectiveNode]]
  inline def findDir(node: ElementNode, name: js.RegExp, allowEmpty: Boolean): js.UndefOr[DirectiveNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDir")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DirectiveNode]]
  
  inline def findProp(node: ElementNode, name: String): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  inline def findProp(node: ElementNode, name: String, dynamicOnly: Boolean): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  inline def findProp(node: ElementNode, name: String, dynamicOnly: Boolean, allowEmpty: Boolean): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  inline def findProp(node: ElementNode, name: String, dynamicOnly: Unit, allowEmpty: Boolean): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ]]
  
  inline def generate(ast: RootNode): CodegenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[CodegenResult]
  inline def generate(ast: RootNode, options: CodegenOptionsonContextCr): CodegenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodegenResult]
  
  inline def generateCodeFrame(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getBaseTransformPreset(): TransformPreset = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseTransformPreset")().asInstanceOf[TransformPreset]
  inline def getBaseTransformPreset(prefixIdentifiers: Boolean): TransformPreset = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseTransformPreset")(prefixIdentifiers.asInstanceOf[js.Any]).asInstanceOf[TransformPreset]
  
  inline def getConstantType(node: SimpleExpressionNode, context: TransformContext): ConstantTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstantType")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ConstantTypes]
  inline def getConstantType(node: TemplateChildNode, context: TransformContext): ConstantTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstantType")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ConstantTypes]
  
  inline def getInnerRange(loc: SourceLocation, offset: Double, length: Double): SourceLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerRange")(loc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SourceLocation]
  
  inline def getMemoedVNodeCall(node: BlockCodegenNode): VNodeCall | RenderSlotCall = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoedVNodeCall")(node.asInstanceOf[js.Any]).asInstanceOf[VNodeCall | RenderSlotCall]
  inline def getMemoedVNodeCall(node: MemoExpression): VNodeCall | RenderSlotCall = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoedVNodeCall")(node.asInstanceOf[js.Any]).asInstanceOf[VNodeCall | RenderSlotCall]
  
  inline def getVNodeBlockHelper(ssr: Boolean, isComponent: Boolean): js.Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getVNodeBlockHelper")(ssr.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any])).asInstanceOf[js.Symbol]
  
  inline def getVNodeHelper(ssr: Boolean, isComponent: Boolean): js.Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getVNodeHelper")(ssr.asInstanceOf[js.Any], isComponent.asInstanceOf[js.Any])).asInstanceOf[js.Symbol]
  
  inline def hasDynamicKeyVBind(node: ElementNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDynamicKeyVBind")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasScopeRef(node: Unit, ids: StringDictionary[js.UndefOr[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasScopeRef(node: ExpressionNode, ids: StringDictionary[js.UndefOr[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasScopeRef(node: IfBranchNode, ids: StringDictionary[js.UndefOr[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasScopeRef(node: TemplateChildNode, ids: StringDictionary[js.UndefOr[Double]]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasScopeRef")(node.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@vue/compiler-dom", "helperNameMap")
  @js.native
  val helperNameMap: Record[js.Symbol, String] = js.native
  
  inline def injectProp(node: RenderSlotCall, prop: Property, context: TransformContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectProp")(node.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectProp(node: VNodeCall, prop: Property, context: TransformContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectProp")(node.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isBuiltInType(tag: String, expected: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInType")(tag.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCoreComponent(tag: String): js.Symbol | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoreComponent")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | Unit]
  
  inline def isFunctionType(node: Node): /* is @babel/types.@babel/types.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.Function */ Boolean]
  
  inline def isInDestructureAssignment(parent: Node, parentStack: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDestructureAssignment")(parent.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMemberExpression(path: String, context: TransformContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpression")(path.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMemberExpressionBrowser(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpressionBrowser")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMemberExpressionNode(path: String, context: TransformContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemberExpressionNode")(path.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isReferencedIdentifier(id: Identifier_, parent: Null, parentStack: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferencedIdentifier")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isReferencedIdentifier(id: Identifier_, parent: Node, parentStack: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReferencedIdentifier")(id.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSimpleIdentifier(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSlotOutlet(node: RootNode): /* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotOutlet")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ Boolean]
  inline def isSlotOutlet(node: TemplateChildNode): /* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotOutlet")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ Boolean]
  
  inline def isStaticArgOf(arg: Unit, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticArgOf")(arg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isStaticArgOf(arg: ExpressionNode, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticArgOf")(arg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStaticExp(p: JSChildNode): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticExp")(p.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean]
  
  inline def isStaticProperty(node: Node): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]
  
  inline def isStaticPropertyKey(node: Node, parent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStaticPropertyKey")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTemplateNode(node: RootNode): /* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ Boolean]
  inline def isTemplateNode(node: TemplateChildNode): /* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ Boolean]
  
  inline def isText(node: TemplateChildNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVSlot_0(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVSlot")(p.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean]
  
  @JSImport("@vue/compiler-dom", "locStub")
  @js.native
  val locStub: SourceLocation = js.native
  
  inline def makeBlock(node: VNodeCall, param1: TransformContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBlock")(node.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@vue/compiler-dom", "noopDirectiveTransform")
  @js.native
  val noopDirectiveTransform: DirectiveTransform = js.native
  
  inline def parse(template: String): RootNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any]).asInstanceOf[RootNode]
  inline def parse(template: String, options: ParserOptions): RootNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RootNode]
  
  @JSImport("@vue/compiler-dom", "parserOptions")
  @js.native
  val parserOptions: ParserOptions = js.native
  
  inline def processExpression(node: SimpleExpressionNode, context: TransformContext): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(node: SimpleExpressionNode, context: TransformContext, asParams: Boolean): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(node: SimpleExpressionNode, context: TransformContext, asParams: Boolean, asRawStatements: Boolean): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(
    node: SimpleExpressionNode,
    context: TransformContext,
    asParams: Boolean,
    asRawStatements: Boolean,
    localVars: Record[String, Double]
  ): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any], localVars.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(
    node: SimpleExpressionNode,
    context: TransformContext,
    asParams: Boolean,
    asRawStatements: Unit,
    localVars: Record[String, Double]
  ): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any], localVars.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(node: SimpleExpressionNode, context: TransformContext, asParams: Unit, asRawStatements: Boolean): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(
    node: SimpleExpressionNode,
    context: TransformContext,
    asParams: Unit,
    asRawStatements: Boolean,
    localVars: Record[String, Double]
  ): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any], localVars.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  inline def processExpression(
    node: SimpleExpressionNode,
    context: TransformContext,
    asParams: Unit,
    asRawStatements: Unit,
    localVars: Record[String, Double]
  ): ExpressionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("processExpression")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], asParams.asInstanceOf[js.Any], asRawStatements.asInstanceOf[js.Any], localVars.asInstanceOf[js.Any])).asInstanceOf[ExpressionNode]
  
  inline def processFor(node: ElementNode, dir: DirectiveNode, context: TransformContext): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("processFor")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  inline def processFor(
    node: ElementNode,
    dir: DirectiveNode,
    context: TransformContext,
    processCodegen: js.Function1[/* forNode */ ForNode, js.UndefOr[js.Function0[Unit]]]
  ): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("processFor")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any], processCodegen.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  
  inline def processIf(node: ElementNode, dir: DirectiveNode, context: TransformContext): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("processIf")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  inline def processIf(
    node: ElementNode,
    dir: DirectiveNode,
    context: TransformContext,
    processCodegen: js.Function3[
      /* node */ IfNode, 
      /* branch */ IfBranchNode, 
      /* isRoot */ Boolean, 
      js.UndefOr[js.Function0[Unit]]
    ]
  ): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("processIf")(node.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], context.asInstanceOf[js.Any], processCodegen.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  
  inline def processSlotOutlet(node: SlotOutletNode, context: TransformContext): SlotOutletProcessResult = (^.asInstanceOf[js.Dynamic].applyDynamic("processSlotOutlet")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[SlotOutletProcessResult]
  
  inline def registerRuntimeHelpers(helpers: Record[js.Symbol, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRuntimeHelpers")(helpers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resolveComponentType(node: ComponentNode, context: TransformContext): String | js.Symbol | CallExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponentType")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String | js.Symbol | CallExpression]
  inline def resolveComponentType(node: ComponentNode, context: TransformContext, ssr: Boolean): String | js.Symbol | CallExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponentType")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any], ssr.asInstanceOf[js.Any])).asInstanceOf[String | js.Symbol | CallExpression]
  
  inline def stringifyExpression(exp: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyExpression")(exp.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyExpression(exp: ExpressionNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyExpression")(exp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toValidAssetId(name: String, `type`: component | directive | filter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toValidAssetId")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@vue/compiler-dom", "trackSlotScopes")
  @js.native
  val trackSlotScopes: NodeTransform = js.native
  
  @JSImport("@vue/compiler-dom", "trackVForSlotScopes")
  @js.native
  val trackVForSlotScopes: NodeTransform = js.native
  
  inline def transform(root: RootNode, options: TransformOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@vue/compiler-dom", "transformBind")
  @js.native
  val transformBind: DirectiveTransform = js.native
  
  @JSImport("@vue/compiler-dom", "transformElement")
  @js.native
  val transformElement: NodeTransform = js.native
  
  @JSImport("@vue/compiler-dom", "transformExpression")
  @js.native
  val transformExpression: NodeTransform = js.native
  
  @JSImport("@vue/compiler-dom", "transformModel")
  @js.native
  val transformModel: DirectiveTransform = js.native
  
  @JSImport("@vue/compiler-dom", "transformOn")
  @js.native
  val transformOn: DirectiveTransform = js.native
  
  @JSImport("@vue/compiler-dom", "transformStyle")
  @js.native
  val transformStyle: NodeTransform = js.native
  
  inline def traverseNode(node: RootNode, context: TransformContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseNode(node: TemplateChildNode, context: TransformContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseNode")(node.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkBlockDeclarations(block: BlockStatement_, onIdent: js.Function1[/* node */ Identifier_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkBlockDeclarations")(block.asInstanceOf[js.Any], onIdent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkBlockDeclarations(block: Program_, onIdent: js.Function1[/* node */ Identifier_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkBlockDeclarations")(block.asInstanceOf[js.Any], onIdent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkFunctionParams(node: Function, onIdent: js.Function1[/* id */ Identifier_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkFunctionParams")(node.asInstanceOf[js.Any], onIdent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Boolean,
    parentStack: js.Array[Node]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Boolean,
    parentStack: js.Array[Node],
    knownIds: Record[String, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Boolean,
    parentStack: Unit,
    knownIds: Record[String, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Unit,
    parentStack: js.Array[Node]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Unit,
    parentStack: js.Array[Node],
    knownIds: Record[String, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walkIdentifiers(
    root: Node,
    onIdentifier: js.Function5[
      /* node */ Identifier_, 
      /* parent */ Node, 
      /* parentStack */ js.Array[Node], 
      /* isReference */ Boolean, 
      /* isLocal */ Boolean, 
      Unit
    ],
    includeAll: Unit,
    parentStack: Unit,
    knownIds: Record[String, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warnDeprecation(key: CompilerDeprecationTypes, context: ParserContext, loc: Null, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecation")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def warnDeprecation(key: CompilerDeprecationTypes, context: ParserContext, loc: SourceLocation, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecation")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def warnDeprecation(key: CompilerDeprecationTypes, context: TransformContext, loc: Null, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecation")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def warnDeprecation(key: CompilerDeprecationTypes, context: TransformContext, loc: SourceLocation, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecation")((scala.List(key.asInstanceOf[js.Any], context.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  trait DOMCompilerError
    extends StObject
       with CompilerError {
    
    @JSName("code")
    var code_DOMCompilerError: DOMErrorCodes
  }
  object DOMCompilerError {
    
    inline def apply(code: DOMErrorCodes, message: String, name: String): DOMCompilerError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMCompilerError]
    }
    
    extension [Self <: DOMCompilerError](x: Self) {
      
      inline def setCode(value: DOMErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueCompilerDom.vueCompilerDomInts.`50`
    - typings.vueCompilerDom.vueCompilerDomInts.`51`
    - typings.vueCompilerDom.vueCompilerDomInts.`52`
    - typings.vueCompilerDom.vueCompilerDomInts.`53`
    - typings.vueCompilerDom.vueCompilerDomInts.`54`
    - typings.vueCompilerDom.vueCompilerDomInts.`55`
    - typings.vueCompilerDom.vueCompilerDomInts.`56`
    - typings.vueCompilerDom.vueCompilerDomInts.`57`
    - typings.vueCompilerDom.vueCompilerDomInts.`58`
    - typings.vueCompilerDom.vueCompilerDomInts.`59`
    - typings.vueCompilerDom.vueCompilerDomInts.`60`
    - typings.vueCompilerDom.vueCompilerDomInts.`61`
  */
  trait DOMErrorCodes extends StObject
  object DOMErrorCodes {
    
    inline def X_IGNORED_SIDE_EFFECT_TAG: `60` = 60.asInstanceOf[`60`]
    
    inline def X_TRANSITION_INVALID_CHILDREN: `59` = 59.asInstanceOf[`59`]
    
    inline def X_V_HTML_NO_EXPRESSION: `50` = 50.asInstanceOf[`50`]
    
    inline def X_V_HTML_WITH_CHILDREN: `51` = 51.asInstanceOf[`51`]
    
    inline def X_V_MODEL_ARG_ON_ELEMENT: `55` = 55.asInstanceOf[`55`]
    
    inline def X_V_MODEL_ON_FILE_INPUT_ELEMENT: `56` = 56.asInstanceOf[`56`]
    
    inline def X_V_MODEL_ON_INVALID_ELEMENT: `54` = 54.asInstanceOf[`54`]
    
    inline def X_V_MODEL_UNNECESSARY_VALUE: `57` = 57.asInstanceOf[`57`]
    
    inline def X_V_SHOW_NO_EXPRESSION: `58` = 58.asInstanceOf[`58`]
    
    inline def X_V_TEXT_NO_EXPRESSION: `52` = 52.asInstanceOf[`52`]
    
    inline def X_V_TEXT_WITH_CHILDREN: `53` = 53.asInstanceOf[`53`]
    
    inline def __EXTEND_POINT__ : `61` = 61.asInstanceOf[`61`]
  }
}
