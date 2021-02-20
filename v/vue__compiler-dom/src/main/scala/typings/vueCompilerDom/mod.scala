package typings.vueCompilerDom

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.std.RegExp
import typings.vueCompilerCore.anon.CodegenOptionsonContextCr
import typings.vueCompilerCore.anon.Directives
import typings.vueCompilerCore.anon.HasDynamicSlots
import typings.vueCompilerCore.mod.ArrayExpression
import typings.vueCompilerCore.mod.AssignmentExpression
import typings.vueCompilerCore.mod.AttributeNode
import typings.vueCompilerCore.mod.BlockStatement
import typings.vueCompilerCore.mod.CacheExpression
import typings.vueCompilerCore.mod.CallExpression
import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerError
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerCore.mod.ComponentNode
import typings.vueCompilerCore.mod.CompoundExpressionNode
import typings.vueCompilerCore.mod.ConditionalExpression
import typings.vueCompilerCore.mod.CoreCompilerError
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
import typings.vueCompilerCore.mod.InterpolationNode
import typings.vueCompilerCore.mod.JSChildNode
import typings.vueCompilerCore.mod.NodeTransform
import typings.vueCompilerCore.mod.ObjectExpression
import typings.vueCompilerCore.mod.ParserOptions
import typings.vueCompilerCore.mod.Position2
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
import typings.vueCompilerDom.vueCompilerDomNumbers.`49`
import typings.vueCompilerDom.vueCompilerDomNumbers.`50`
import typings.vueCompilerDom.vueCompilerDomNumbers.`51`
import typings.vueCompilerDom.vueCompilerDomNumbers.`52`
import typings.vueCompilerDom.vueCompilerDomNumbers.`53`
import typings.vueCompilerDom.vueCompilerDomNumbers.`54`
import typings.vueCompilerDom.vueCompilerDomNumbers.`55`
import typings.vueCompilerDom.vueCompilerDomNumbers.`56`
import typings.vueCompilerDom.vueCompilerDomNumbers.`57`
import typings.vueCompilerDom.vueCompilerDomNumbers.`58`
import typings.vueCompilerDom.vueCompilerDomNumbers.`59`
import typings.vueCompilerDom.vueCompilerDomNumbers.`60`
import typings.vueCompilerDom.vueCompilerDomStrings.component
import typings.vueCompilerDom.vueCompilerDomStrings.directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("@vue/compiler-dom", "KEEP_ALIVE")
  @js.native
  val KEEP_ALIVE: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "MERGE_PROPS")
  @js.native
  val MERGE_PROPS: js.Symbol = js.native
  
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
  
  @JSImport("@vue/compiler-dom", "WITH_SCOPE_ID")
  @js.native
  val WITH_SCOPE_ID: js.Symbol = js.native
  
  @JSImport("@vue/compiler-dom", "advancePositionWithClone")
  @js.native
  def advancePositionWithClone(pos: Position2, source: String): Position2 = js.native
  @JSImport("@vue/compiler-dom", "advancePositionWithClone")
  @js.native
  def advancePositionWithClone(pos: Position2, source: String, numberOfCharacters: Double): Position2 = js.native
  
  @JSImport("@vue/compiler-dom", "advancePositionWithMutation")
  @js.native
  def advancePositionWithMutation(pos: Position2, source: String): Position2 = js.native
  @JSImport("@vue/compiler-dom", "advancePositionWithMutation")
  @js.native
  def advancePositionWithMutation(pos: Position2, source: String, numberOfCharacters: Double): Position2 = js.native
  
  @JSImport("@vue/compiler-dom", "assert")
  @js.native
  def assert(condition: Boolean): Unit = js.native
  @JSImport("@vue/compiler-dom", "assert")
  @js.native
  def assert(condition: Boolean, msg: String): Unit = js.native
  
  @JSImport("@vue/compiler-dom", "baseCompile")
  @js.native
  def baseCompile(template: String): CodegenResult = js.native
  @JSImport("@vue/compiler-dom", "baseCompile")
  @js.native
  def baseCompile(template: String, options: CompilerOptions): CodegenResult = js.native
  @JSImport("@vue/compiler-dom", "baseCompile")
  @js.native
  def baseCompile(template: RootNode): CodegenResult = js.native
  @JSImport("@vue/compiler-dom", "baseCompile")
  @js.native
  def baseCompile(template: RootNode, options: CompilerOptions): CodegenResult = js.native
  
  @JSImport("@vue/compiler-dom", "baseParse")
  @js.native
  def baseParse(content: String): RootNode = js.native
  @JSImport("@vue/compiler-dom", "baseParse")
  @js.native
  def baseParse(content: String, options: ParserOptions): RootNode = js.native
  
  @JSImport("@vue/compiler-dom", "buildProps")
  @js.native
  def buildProps(node: ElementNode, context: TransformContext): Directives = js.native
  @JSImport("@vue/compiler-dom", "buildProps")
  @js.native
  def buildProps(node: ElementNode, context: TransformContext, props: js.UndefOr[scala.Nothing], ssr: Boolean): Directives = js.native
  @JSImport("@vue/compiler-dom", "buildProps")
  @js.native
  def buildProps(node: ElementNode, context: TransformContext, props: js.Array[AttributeNode | DirectiveNode]): Directives = js.native
  @JSImport("@vue/compiler-dom", "buildProps")
  @js.native
  def buildProps(
    node: ElementNode,
    context: TransformContext,
    props: js.Array[AttributeNode | DirectiveNode],
    ssr: Boolean
  ): Directives = js.native
  
  @JSImport("@vue/compiler-dom", "buildSlots")
  @js.native
  def buildSlots(node: ElementNode, context: TransformContext): HasDynamicSlots = js.native
  @JSImport("@vue/compiler-dom", "buildSlots")
  @js.native
  def buildSlots(node: ElementNode, context: TransformContext, buildSlotFn: SlotFnBuilder): HasDynamicSlots = js.native
  
  @JSImport("@vue/compiler-dom", "compile")
  @js.native
  def compile(template: String): CodegenResult = js.native
  @JSImport("@vue/compiler-dom", "compile")
  @js.native
  def compile(template: String, options: CompilerOptions): CodegenResult = js.native
  
  @JSImport("@vue/compiler-dom", "createArrayExpression")
  @js.native
  def createArrayExpression(elements: js.Array[String | JSChildNode]): ArrayExpression = js.native
  @JSImport("@vue/compiler-dom", "createArrayExpression")
  @js.native
  def createArrayExpression(elements: js.Array[String | JSChildNode], loc: SourceLocation): ArrayExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createAssignmentExpression")
  @js.native
  def createAssignmentExpression(left: SimpleExpressionNode, right: JSChildNode): AssignmentExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createBlockStatement")
  @js.native
  def createBlockStatement(body: js.Array[JSChildNode | IfStatement]): BlockStatement = js.native
  
  @JSImport("@vue/compiler-dom", "createCacheExpression")
  @js.native
  def createCacheExpression(index: Double, value: JSChildNode): CacheExpression = js.native
  @JSImport("@vue/compiler-dom", "createCacheExpression")
  @js.native
  def createCacheExpression(index: Double, value: JSChildNode, isVNode: Boolean): CacheExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(callee: String): InferCodegenNodeType[String] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(callee: String, args: js.UndefOr[scala.Nothing], loc: SourceLocation): InferCodegenNodeType[String] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(
    callee: String,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[String] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(
    callee: String,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[String] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(callee: js.Symbol): InferCodegenNodeType[js.Symbol] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(callee: js.Symbol, args: js.UndefOr[scala.Nothing], loc: SourceLocation): InferCodegenNodeType[js.Symbol] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(
    callee: js.Symbol,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ]
  ): InferCodegenNodeType[js.Symbol] = js.native
  @JSImport("@vue/compiler-dom", "createCallExpression")
  @js.native
  def createCallExpression(
    callee: js.Symbol,
    args: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    loc: SourceLocation
  ): InferCodegenNodeType[js.Symbol] = js.native
  
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](code: T): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: js.UndefOr[scala.Nothing],
    additionalMessage: String
  ): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](code: T, loc: js.UndefOr[scala.Nothing], messages: NumberDictionary[String]): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: NumberDictionary[String],
    additionalMessage: String
  ): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation, messages: js.UndefOr[scala.Nothing], additionalMessage: String): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation, messages: NumberDictionary[String]): CompilerError | CoreCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createCompilerError")
  @js.native
  def createCompilerError[T /* <: Double */](code: T, loc: SourceLocation, messages: NumberDictionary[String], additionalMessage: String): CompilerError | CoreCompilerError = js.native
  
  @JSImport("@vue/compiler-dom", "createCompoundExpression")
  @js.native
  def createCompoundExpression(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ]
  ): CompoundExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "createCompoundExpression")
  @js.native
  def createCompoundExpression(
    children: js.Array[
      SimpleExpressionNode | CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): CompoundExpressionNode = js.native
  
  @JSImport("@vue/compiler-dom", "createConditionalExpression")
  @js.native
  def createConditionalExpression(test: JSChildNode, consequent: JSChildNode, alternate: JSChildNode): ConditionalExpression = js.native
  @JSImport("@vue/compiler-dom", "createConditionalExpression")
  @js.native
  def createConditionalExpression(test: JSChildNode, consequent: JSChildNode, alternate: JSChildNode, newline: Boolean): ConditionalExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createDOMCompilerError")
  @js.native
  def createDOMCompilerError(code: DOMErrorCodes): DOMCompilerError = js.native
  @JSImport("@vue/compiler-dom", "createDOMCompilerError")
  @js.native
  def createDOMCompilerError(code: DOMErrorCodes, loc: SourceLocation): DOMCompilerError = js.native
  
  @JSImport("@vue/compiler-dom", "createForLoopParams")
  @js.native
  def createForLoopParams(hasValueKeyIndex: ForParseResult): js.Array[ExpressionNode] = js.native
  
  @JSImport("@vue/compiler-dom", "createFunctionExpression")
  @js.native
  def createFunctionExpression(
    params: js.UndefOr[ExpressionNode | String | (js.Array[ExpressionNode | String])],
    returns: js.UndefOr[TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode],
    newline: js.UndefOr[Boolean],
    isSlot: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): FunctionExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createIfStatement")
  @js.native
  def createIfStatement(test: ExpressionNode, consequent: BlockStatement): IfStatement = js.native
  @JSImport("@vue/compiler-dom", "createIfStatement")
  @js.native
  def createIfStatement(test: ExpressionNode, consequent: BlockStatement, alternate: BlockStatement): IfStatement = js.native
  @JSImport("@vue/compiler-dom", "createIfStatement")
  @js.native
  def createIfStatement(test: ExpressionNode, consequent: BlockStatement, alternate: IfStatement): IfStatement = js.native
  @JSImport("@vue/compiler-dom", "createIfStatement")
  @js.native
  def createIfStatement(test: ExpressionNode, consequent: BlockStatement, alternate: ReturnStatement): IfStatement = js.native
  
  @JSImport("@vue/compiler-dom", "createInterpolation")
  @js.native
  def createInterpolation(content: String, loc: SourceLocation): InterpolationNode = js.native
  @JSImport("@vue/compiler-dom", "createInterpolation")
  @js.native
  def createInterpolation(content: ExpressionNode, loc: SourceLocation): InterpolationNode = js.native
  
  @JSImport("@vue/compiler-dom", "createObjectExpression")
  @js.native
  def createObjectExpression(properties: js.Array[Property]): ObjectExpression = js.native
  @JSImport("@vue/compiler-dom", "createObjectExpression")
  @js.native
  def createObjectExpression(properties: js.Array[Property], loc: SourceLocation): ObjectExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createObjectProperty")
  @js.native
  def createObjectProperty(key: String, value: JSChildNode): Property = js.native
  @JSImport("@vue/compiler-dom", "createObjectProperty")
  @js.native
  def createObjectProperty(key: ExpressionNode, value: JSChildNode): Property = js.native
  
  @JSImport("@vue/compiler-dom", "createReturnStatement")
  @js.native
  def createReturnStatement(returns: js.Array[TemplateChildNode]): ReturnStatement = js.native
  @JSImport("@vue/compiler-dom", "createReturnStatement")
  @js.native
  def createReturnStatement(returns: JSChildNode): ReturnStatement = js.native
  @JSImport("@vue/compiler-dom", "createReturnStatement")
  @js.native
  def createReturnStatement(returns: TemplateChildNode): ReturnStatement = js.native
  
  @JSImport("@vue/compiler-dom", "createRoot")
  @js.native
  def createRoot(children: js.Array[TemplateChildNode]): RootNode = js.native
  @JSImport("@vue/compiler-dom", "createRoot")
  @js.native
  def createRoot(children: js.Array[TemplateChildNode], loc: SourceLocation): RootNode = js.native
  
  @JSImport("@vue/compiler-dom", "createSequenceExpression")
  @js.native
  def createSequenceExpression(expressions: js.Array[JSChildNode]): SequenceExpression = js.native
  
  @JSImport("@vue/compiler-dom", "createSimpleExpression")
  @js.native
  def createSimpleExpression(content: String, isStatic: Boolean): SimpleExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "createSimpleExpression")
  @js.native
  def createSimpleExpression(content: String, isStatic: Boolean, loc: js.UndefOr[scala.Nothing], isConstant: Boolean): SimpleExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "createSimpleExpression")
  @js.native
  def createSimpleExpression(content: String, isStatic: Boolean, loc: SourceLocation): SimpleExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "createSimpleExpression")
  @js.native
  def createSimpleExpression(content: String, isStatic: Boolean, loc: SourceLocation, isConstant: Boolean): SimpleExpressionNode = js.native
  
  @JSImport("@vue/compiler-dom", "createStructuralDirectiveTransform")
  @js.native
  def createStructuralDirectiveTransform(name: String, fn: StructuralDirectiveTransform): NodeTransform = js.native
  @JSImport("@vue/compiler-dom", "createStructuralDirectiveTransform")
  @js.native
  def createStructuralDirectiveTransform(name: RegExp, fn: StructuralDirectiveTransform): NodeTransform = js.native
  
  @JSImport("@vue/compiler-dom", "createTemplateLiteral")
  @js.native
  def createTemplateLiteral(elements: js.Array[String | JSChildNode]): TemplateLiteral = js.native
  
  @JSImport("@vue/compiler-dom", "createTransformContext")
  @js.native
  def createTransformContext(
    root: RootNode,
    hasPrefixIdentifiersHoistStaticCacheHandlersNodeTransformsDirectiveTransformsTransformHoistIsBuiltInComponentIsCustomElementExpressionPluginsScopeIdSsrSsrCssVarsBindingMetadataOnError: TransformOptions
  ): TransformContext = js.native
  
  @JSImport("@vue/compiler-dom", "createVNodeCall")
  @js.native
  def createVNodeCall(
    context: TransformContext | Null,
    tag: String | js.Symbol | CallExpression,
    props: js.UndefOr[PropsExpression],
    children: js.UndefOr[
      js.Array[TemplateChildNode] | TemplateTextChildNode | SlotsExpression | ForRenderListExpression
    ],
    patchFlag: js.UndefOr[String],
    dynamicProps: js.UndefOr[String],
    directives: js.UndefOr[DirectiveArguments],
    isBlock: js.UndefOr[Boolean],
    disableTracking: js.UndefOr[Boolean],
    loc: js.UndefOr[SourceLocation]
  ): VNodeCall = js.native
  
  @JSImport("@vue/compiler-dom", "findDir")
  @js.native
  def findDir(node: ElementNode, name: String): js.UndefOr[DirectiveNode] = js.native
  @JSImport("@vue/compiler-dom", "findDir")
  @js.native
  def findDir(node: ElementNode, name: String, allowEmpty: Boolean): js.UndefOr[DirectiveNode] = js.native
  @JSImport("@vue/compiler-dom", "findDir")
  @js.native
  def findDir(node: ElementNode, name: RegExp): js.UndefOr[DirectiveNode] = js.native
  @JSImport("@vue/compiler-dom", "findDir")
  @js.native
  def findDir(node: ElementNode, name: RegExp, allowEmpty: Boolean): js.UndefOr[DirectiveNode] = js.native
  
  @JSImport("@vue/compiler-dom", "findProp")
  @js.native
  def findProp(node: ElementNode, name: String): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = js.native
  @JSImport("@vue/compiler-dom", "findProp")
  @js.native
  def findProp(node: ElementNode, name: String, dynamicOnly: js.UndefOr[scala.Nothing], allowEmpty: Boolean): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = js.native
  @JSImport("@vue/compiler-dom", "findProp")
  @js.native
  def findProp(node: ElementNode, name: String, dynamicOnly: Boolean): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = js.native
  @JSImport("@vue/compiler-dom", "findProp")
  @js.native
  def findProp(node: ElementNode, name: String, dynamicOnly: Boolean, allowEmpty: Boolean): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ] = js.native
  
  @JSImport("@vue/compiler-dom", "generate")
  @js.native
  def generate(ast: RootNode): CodegenResult = js.native
  @JSImport("@vue/compiler-dom", "generate")
  @js.native
  def generate(ast: RootNode, options: CodegenOptionsonContextCr): CodegenResult = js.native
  
  @JSImport("@vue/compiler-dom", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String): String = js.native
  @JSImport("@vue/compiler-dom", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  @JSImport("@vue/compiler-dom", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String, start: Double): String = js.native
  @JSImport("@vue/compiler-dom", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String, start: Double, end: Double): String = js.native
  
  @JSImport("@vue/compiler-dom", "getBaseTransformPreset")
  @js.native
  def getBaseTransformPreset(): TransformPreset = js.native
  @JSImport("@vue/compiler-dom", "getBaseTransformPreset")
  @js.native
  def getBaseTransformPreset(prefixIdentifiers: Boolean): TransformPreset = js.native
  
  @JSImport("@vue/compiler-dom", "getInnerRange")
  @js.native
  def getInnerRange(loc: SourceLocation, offset: Double): SourceLocation = js.native
  @JSImport("@vue/compiler-dom", "getInnerRange")
  @js.native
  def getInnerRange(loc: SourceLocation, offset: Double, length: Double): SourceLocation = js.native
  
  @JSImport("@vue/compiler-dom", "hasDynamicKeyVBind")
  @js.native
  def hasDynamicKeyVBind(node: ElementNode): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "hasScopeRef")
  @js.native
  def hasScopeRef(node: js.UndefOr[scala.Nothing], ids: StringDictionary[js.UndefOr[Double]]): Boolean = js.native
  @JSImport("@vue/compiler-dom", "hasScopeRef")
  @js.native
  def hasScopeRef(node: ExpressionNode, ids: StringDictionary[js.UndefOr[Double]]): Boolean = js.native
  @JSImport("@vue/compiler-dom", "hasScopeRef")
  @js.native
  def hasScopeRef(node: IfBranchNode, ids: StringDictionary[js.UndefOr[Double]]): Boolean = js.native
  @JSImport("@vue/compiler-dom", "hasScopeRef")
  @js.native
  def hasScopeRef(node: TemplateChildNode, ids: StringDictionary[js.UndefOr[Double]]): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "helperNameMap")
  @js.native
  val helperNameMap: js.Any = js.native
  
  @JSImport("@vue/compiler-dom", "injectProp")
  @js.native
  def injectProp(node: RenderSlotCall, prop: Property, context: TransformContext): Unit = js.native
  @JSImport("@vue/compiler-dom", "injectProp")
  @js.native
  def injectProp(node: VNodeCall, prop: Property, context: TransformContext): Unit = js.native
  
  @JSImport("@vue/compiler-dom", "isBindKey")
  @js.native
  def isBindKey(arg: js.UndefOr[scala.Nothing], name: String): Boolean = js.native
  @JSImport("@vue/compiler-dom", "isBindKey")
  @js.native
  def isBindKey(arg: ExpressionNode, name: String): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isBuiltInType")
  @js.native
  def isBuiltInType(tag: String, expected: String): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isCoreComponent")
  @js.native
  def isCoreComponent(tag: String): js.Symbol | Unit = js.native
  
  @JSImport("@vue/compiler-dom", "isMemberExpression")
  @js.native
  def isMemberExpression(path: String): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isSimpleIdentifier")
  @js.native
  def isSimpleIdentifier(name: String): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isSlotOutlet")
  @js.native
  def isSlotOutlet(node: RootNode): /* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ Boolean = js.native
  @JSImport("@vue/compiler-dom", "isSlotOutlet")
  @js.native
  def isSlotOutlet(node: TemplateChildNode): /* is @vue/compiler-core.@vue/compiler-core.SlotOutletNode */ Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isStaticExp")
  @js.native
  def isStaticExp(p: JSChildNode): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isTemplateNode")
  @js.native
  def isTemplateNode(node: RootNode): /* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ Boolean = js.native
  @JSImport("@vue/compiler-dom", "isTemplateNode")
  @js.native
  def isTemplateNode(node: TemplateChildNode): /* is @vue/compiler-core.@vue/compiler-core.TemplateNode */ Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isText")
  @js.native
  def isText(node: TemplateChildNode): Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "isVSlot")
  @js.native
  def isVSlot_0(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any
  ): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean = js.native
  
  @JSImport("@vue/compiler-dom", "locStub")
  @js.native
  val locStub: SourceLocation = js.native
  
  @JSImport("@vue/compiler-dom", "noopDirectiveTransform")
  @js.native
  val noopDirectiveTransform: DirectiveTransform = js.native
  
  @JSImport("@vue/compiler-dom", "parse")
  @js.native
  def parse(template: String): RootNode = js.native
  @JSImport("@vue/compiler-dom", "parse")
  @js.native
  def parse(template: String, options: ParserOptions): RootNode = js.native
  
  @JSImport("@vue/compiler-dom", "parserOptions")
  @js.native
  val parserOptions: ParserOptions = js.native
  
  @JSImport("@vue/compiler-dom", "processExpression")
  @js.native
  def processExpression(node: SimpleExpressionNode, context: TransformContext): ExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "processExpression")
  @js.native
  def processExpression(
    node: SimpleExpressionNode,
    context: TransformContext,
    asParams: js.UndefOr[scala.Nothing],
    asRawStatements: Boolean
  ): ExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "processExpression")
  @js.native
  def processExpression(node: SimpleExpressionNode, context: TransformContext, asParams: Boolean): ExpressionNode = js.native
  @JSImport("@vue/compiler-dom", "processExpression")
  @js.native
  def processExpression(node: SimpleExpressionNode, context: TransformContext, asParams: Boolean, asRawStatements: Boolean): ExpressionNode = js.native
  
  @JSImport("@vue/compiler-dom", "processFor")
  @js.native
  def processFor(node: ElementNode, dir: DirectiveNode, context: TransformContext): js.UndefOr[js.Function0[Unit]] = js.native
  @JSImport("@vue/compiler-dom", "processFor")
  @js.native
  def processFor(
    node: ElementNode,
    dir: DirectiveNode,
    context: TransformContext,
    processCodegen: js.Function1[/* forNode */ ForNode, js.UndefOr[js.Function0[Unit]]]
  ): js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSImport("@vue/compiler-dom", "processIf")
  @js.native
  def processIf(node: ElementNode, dir: DirectiveNode, context: TransformContext): js.UndefOr[js.Function0[Unit]] = js.native
  @JSImport("@vue/compiler-dom", "processIf")
  @js.native
  def processIf(
    node: ElementNode,
    dir: DirectiveNode,
    context: TransformContext,
    processCodegen: js.Function3[
      /* node */ IfNode, 
      /* branch */ IfBranchNode, 
      /* isRoot */ Boolean, 
      js.UndefOr[js.Function0[Unit]]
    ]
  ): js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSImport("@vue/compiler-dom", "processSlotOutlet")
  @js.native
  def processSlotOutlet(node: SlotOutletNode, context: TransformContext): SlotOutletProcessResult = js.native
  
  @JSImport("@vue/compiler-dom", "registerRuntimeHelpers")
  @js.native
  def registerRuntimeHelpers(helpers: js.Any): Unit = js.native
  
  @JSImport("@vue/compiler-dom", "resolveComponentType")
  @js.native
  def resolveComponentType(node: ComponentNode, context: TransformContext): String | js.Symbol | CallExpression = js.native
  @JSImport("@vue/compiler-dom", "resolveComponentType")
  @js.native
  def resolveComponentType(node: ComponentNode, context: TransformContext, ssr: Boolean): String | js.Symbol | CallExpression = js.native
  
  @JSImport("@vue/compiler-dom", "toValidAssetId")
  @js.native
  def toValidAssetId_component(name: String, `type`: component): String = js.native
  @JSImport("@vue/compiler-dom", "toValidAssetId")
  @js.native
  def toValidAssetId_directive(name: String, `type`: directive): String = js.native
  
  @JSImport("@vue/compiler-dom", "trackSlotScopes")
  @js.native
  val trackSlotScopes: NodeTransform = js.native
  
  @JSImport("@vue/compiler-dom", "trackVForSlotScopes")
  @js.native
  val trackVForSlotScopes: NodeTransform = js.native
  
  @JSImport("@vue/compiler-dom", "transform")
  @js.native
  def transform(root: RootNode, options: TransformOptions): Unit = js.native
  
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
  
  @JSImport("@vue/compiler-dom", "traverseNode")
  @js.native
  def traverseNode(node: RootNode, context: TransformContext): Unit = js.native
  @JSImport("@vue/compiler-dom", "traverseNode")
  @js.native
  def traverseNode(node: TemplateChildNode, context: TransformContext): Unit = js.native
  
  @js.native
  trait DOMCompilerError extends CompilerError {
    
    @JSName("code")
    var code_DOMCompilerError: DOMErrorCodes = js.native
  }
  object DOMCompilerError {
    
    @scala.inline
    def apply(code: DOMErrorCodes, message: String, name: String): DOMCompilerError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMCompilerError]
    }
    
    @scala.inline
    implicit class DOMCompilerErrorMutableBuilder[Self <: DOMCompilerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: DOMErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueCompilerDom.vueCompilerDomNumbers.`49`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`50`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`51`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`52`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`53`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`54`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`55`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`56`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`57`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`58`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`59`
    - typings.vueCompilerDom.vueCompilerDomNumbers.`60`
  */
  trait DOMErrorCodes extends StObject
  object DOMErrorCodes {
    
    @scala.inline
    def X_IGNORED_SIDE_EFFECT_TAG: `59` = 59.asInstanceOf[`59`]
    
    @scala.inline
    def X_TRANSITION_INVALID_CHILDREN: `58` = 58.asInstanceOf[`58`]
    
    @scala.inline
    def X_V_HTML_NO_EXPRESSION: `49` = 49.asInstanceOf[`49`]
    
    @scala.inline
    def X_V_HTML_WITH_CHILDREN: `50` = 50.asInstanceOf[`50`]
    
    @scala.inline
    def X_V_MODEL_ARG_ON_ELEMENT: `54` = 54.asInstanceOf[`54`]
    
    @scala.inline
    def X_V_MODEL_ON_FILE_INPUT_ELEMENT: `55` = 55.asInstanceOf[`55`]
    
    @scala.inline
    def X_V_MODEL_ON_INVALID_ELEMENT: `53` = 53.asInstanceOf[`53`]
    
    @scala.inline
    def X_V_MODEL_UNNECESSARY_VALUE: `56` = 56.asInstanceOf[`56`]
    
    @scala.inline
    def X_V_SHOW_NO_EXPRESSION: `57` = 57.asInstanceOf[`57`]
    
    @scala.inline
    def X_V_TEXT_NO_EXPRESSION: `51` = 51.asInstanceOf[`51`]
    
    @scala.inline
    def X_V_TEXT_WITH_CHILDREN: `52` = 52.asInstanceOf[`52`]
    
    @scala.inline
    def __EXTEND_POINT__ : `60` = 60.asInstanceOf[`60`]
  }
}
