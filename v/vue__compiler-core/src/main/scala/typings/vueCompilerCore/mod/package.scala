package typings.vueCompilerCore.mod

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
import typings.vueCompilerCore.mod.^
import typings.vueCompilerCore.vueCompilerCoreInts.`0`
import typings.vueCompilerCore.vueCompilerCoreStrings.component
import typings.vueCompilerCore.vueCompilerCoreStrings.directive
import typings.vueCompilerCore.vueCompilerCoreStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BASE_TRANSITION: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("BASE_TRANSITION").asInstanceOf[js.Symbol]

inline def CAMELIZE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CAMELIZE").asInstanceOf[js.Symbol]

inline def CAPITALIZE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CAPITALIZE").asInstanceOf[js.Symbol]

inline def CREATE_BLOCK: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_BLOCK").asInstanceOf[js.Symbol]

inline def CREATE_COMMENT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_COMMENT").asInstanceOf[js.Symbol]

inline def CREATE_ELEMENT_BLOCK: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_ELEMENT_BLOCK").asInstanceOf[js.Symbol]

inline def CREATE_ELEMENT_VNODE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_ELEMENT_VNODE").asInstanceOf[js.Symbol]

inline def CREATE_SLOTS: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_SLOTS").asInstanceOf[js.Symbol]

inline def CREATE_STATIC: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_STATIC").asInstanceOf[js.Symbol]

inline def CREATE_TEXT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_TEXT").asInstanceOf[js.Symbol]

inline def CREATE_VNODE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("CREATE_VNODE").asInstanceOf[js.Symbol]

inline def FRAGMENT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("FRAGMENT").asInstanceOf[js.Symbol]

inline def GUARD_REACTIVE_PROPS: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("GUARD_REACTIVE_PROPS").asInstanceOf[js.Symbol]

inline def IS_MEMO_SAME: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("IS_MEMO_SAME").asInstanceOf[js.Symbol]

inline def IS_REF: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("IS_REF").asInstanceOf[js.Symbol]

inline def KEEP_ALIVE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("KEEP_ALIVE").asInstanceOf[js.Symbol]

inline def MERGE_PROPS: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("MERGE_PROPS").asInstanceOf[js.Symbol]

inline def NORMALIZE_CLASS: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("NORMALIZE_CLASS").asInstanceOf[js.Symbol]

inline def NORMALIZE_PROPS: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("NORMALIZE_PROPS").asInstanceOf[js.Symbol]

inline def NORMALIZE_STYLE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("NORMALIZE_STYLE").asInstanceOf[js.Symbol]

inline def OPEN_BLOCK: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("OPEN_BLOCK").asInstanceOf[js.Symbol]

inline def POP_SCOPE_ID: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("POP_SCOPE_ID").asInstanceOf[js.Symbol]

inline def PUSH_SCOPE_ID: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("PUSH_SCOPE_ID").asInstanceOf[js.Symbol]

inline def RENDER_LIST: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("RENDER_LIST").asInstanceOf[js.Symbol]

inline def RENDER_SLOT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("RENDER_SLOT").asInstanceOf[js.Symbol]

inline def RESOLVE_COMPONENT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_COMPONENT").asInstanceOf[js.Symbol]

inline def RESOLVE_DIRECTIVE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_DIRECTIVE").asInstanceOf[js.Symbol]

inline def RESOLVE_DYNAMIC_COMPONENT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_DYNAMIC_COMPONENT").asInstanceOf[js.Symbol]

inline def RESOLVE_FILTER: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("RESOLVE_FILTER").asInstanceOf[js.Symbol]

inline def SET_BLOCK_TRACKING: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("SET_BLOCK_TRACKING").asInstanceOf[js.Symbol]

inline def SUSPENSE: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("SUSPENSE").asInstanceOf[js.Symbol]

inline def TELEPORT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("TELEPORT").asInstanceOf[js.Symbol]

inline def TO_DISPLAY_STRING: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("TO_DISPLAY_STRING").asInstanceOf[js.Symbol]

inline def TO_HANDLERS: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("TO_HANDLERS").asInstanceOf[js.Symbol]

inline def TO_HANDLER_KEY: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("TO_HANDLER_KEY").asInstanceOf[js.Symbol]

inline def UNREF: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("UNREF").asInstanceOf[js.Symbol]

inline def WITH_CTX: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("WITH_CTX").asInstanceOf[js.Symbol]

inline def WITH_DIRECTIVES: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("WITH_DIRECTIVES").asInstanceOf[js.Symbol]

inline def WITH_MEMO: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("WITH_MEMO").asInstanceOf[js.Symbol]

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

inline def createArrayExpression(elements: js.Array[String | Node2]): ArrayExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createArrayExpression")(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayExpression]
inline def createArrayExpression(elements: js.Array[String | Node2], loc: SourceLocation): ArrayExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createArrayExpression")(elements.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ArrayExpression]

inline def createAssignmentExpression(left: SimpleExpressionNode, right: JSChildNode): AssignmentExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createAssignmentExpression")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[AssignmentExpression]

inline def createBlockStatement(body: js.Array[JSChildNode | IfStatement]): BlockStatement = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockStatement")(body.asInstanceOf[js.Any]).asInstanceOf[BlockStatement]

inline def createCacheExpression(index: Double, value: JSChildNode): CacheExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheExpression")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[CacheExpression]
inline def createCacheExpression(index: Double, value: JSChildNode, isVNode: Boolean): CacheExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("createCacheExpression")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any], isVNode.asInstanceOf[js.Any])).asInstanceOf[CacheExpression]

inline def createCallExpression[T /* <: String | js.Symbol */](callee: T): InferCodegenNodeType[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any]).asInstanceOf[InferCodegenNodeType[T]]
inline def createCallExpression[T /* <: String | js.Symbol */](
  callee: T,
  args: js.Array[
  String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
]
): InferCodegenNodeType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[T]]
inline def createCallExpression[T /* <: String | js.Symbol */](
  callee: T,
  args: js.Array[
  String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
],
  loc: SourceLocation
): InferCodegenNodeType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[T]]
inline def createCallExpression[T /* <: String | js.Symbol */](callee: T, args: Unit, loc: SourceLocation): InferCodegenNodeType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallExpression")(callee.asInstanceOf[js.Any], args.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[InferCodegenNodeType[T]]

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
inline def createIfStatement(
  test: ExpressionNode,
  consequent: BlockStatement,
  alternate: js.UndefOr[IfStatement | BlockStatement | ReturnStatement]
): IfStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("createIfStatement")(test.asInstanceOf[js.Any], consequent.asInstanceOf[js.Any], alternate.asInstanceOf[js.Any])).asInstanceOf[IfStatement]

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
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any]]
inline def findProp(node: ElementNode, name: String, dynamicOnly: Boolean): js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any]]
inline def findProp(node: ElementNode, name: String, dynamicOnly: Boolean, allowEmpty: Boolean): js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any]]
inline def findProp(node: ElementNode, name: String, dynamicOnly: Unit, allowEmpty: Boolean): js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findProp")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dynamicOnly.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode> | std.Array<@vue/compiler-core.@vue/compiler-core.AttributeNode | @vue/compiler-core.@vue/compiler-core.DirectiveNode>[0] */ js.Any]]

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

inline def helperNameMap: Record[js.Symbol, String] = ^.asInstanceOf[js.Dynamic].selectDynamic("helperNameMap").asInstanceOf[Record[js.Symbol, String]]

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

inline def locStub: SourceLocation = ^.asInstanceOf[js.Dynamic].selectDynamic("locStub").asInstanceOf[SourceLocation]

inline def makeBlock(node: VNodeCall, param1: TransformContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBlock")(node.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def noopDirectiveTransform: DirectiveTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("noopDirectiveTransform").asInstanceOf[DirectiveTransform]

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

inline def trackSlotScopes: NodeTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("trackSlotScopes").asInstanceOf[NodeTransform]

inline def trackVForSlotScopes: NodeTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("trackVForSlotScopes").asInstanceOf[NodeTransform]

inline def transform(root: RootNode, options: TransformOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def transformBind: DirectiveTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("transformBind").asInstanceOf[DirectiveTransform]

inline def transformElement: NodeTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("transformElement").asInstanceOf[NodeTransform]

inline def transformExpression: NodeTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("transformExpression").asInstanceOf[NodeTransform]

inline def transformModel: DirectiveTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("transformModel").asInstanceOf[DirectiveTransform]

inline def transformOn: DirectiveTransform = ^.asInstanceOf[js.Dynamic].selectDynamic("transformOn").asInstanceOf[DirectiveTransform]

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

type DirectiveTransform = js.Function4[
/* dir */ DirectiveNode, 
/* node */ ElementNode, 
/* context */ TransformContext, 
/* augmentor */ js.UndefOr[js.Function1[/* ret */ DirectiveTransformResult, DirectiveTransformResult]], 
DirectiveTransformResult]

type HoistTransform = js.Function3[
/* children */ js.Array[TemplateChildNode], 
/* context */ TransformContext, 
/* parent */ ParentNode2, 
Unit]

type Namespace = Double

type Namespaces = `0`

type NodeTransform = js.Function2[
/* node */ RootNode | TemplateChildNode, 
/* context */ TransformContext, 
Unit | js.Function0[Unit] | js.Array[js.Function0[Unit]]]

type SlotFnBuilder = js.Function3[
/* slotProps */ js.UndefOr[ExpressionNode], 
/* slotChildren */ js.Array[TemplateChildNode], 
/* loc */ SourceLocation, 
FunctionExpression]

type StructuralDirectiveTransform = js.Function3[
/* node */ ElementNode, 
/* dir */ DirectiveNode, 
/* context */ TransformContext, 
Unit | js.Function0[Unit]]

type TransformPreset = js.Tuple2[js.Array[NodeTransform], Record[String, DirectiveTransform]]
