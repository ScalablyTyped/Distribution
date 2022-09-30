package typings.swcCore

import typings.swcCore.typesMod.Accessibility
import typings.swcCore.typesMod.Argument
import typings.swcCore.typesMod.ArrayExpression
import typings.swcCore.typesMod.ArrayPattern
import typings.swcCore.typesMod.ArrowFunctionExpression
import typings.swcCore.typesMod.AssignmentExpression
import typings.swcCore.typesMod.AssignmentPattern
import typings.swcCore.typesMod.AssignmentPatternProperty
import typings.swcCore.typesMod.AssignmentProperty
import typings.swcCore.typesMod.AwaitExpression
import typings.swcCore.typesMod.BigIntLiteral
import typings.swcCore.typesMod.BinaryExpression
import typings.swcCore.typesMod.BlockStatement
import typings.swcCore.typesMod.BooleanLiteral
import typings.swcCore.typesMod.BreakStatement
import typings.swcCore.typesMod.CallExpression
import typings.swcCore.typesMod.CatchClause
import typings.swcCore.typesMod.Class
import typings.swcCore.typesMod.ClassDeclaration
import typings.swcCore.typesMod.ClassExpression
import typings.swcCore.typesMod.ClassMember
import typings.swcCore.typesMod.ClassMethod
import typings.swcCore.typesMod.ClassProperty
import typings.swcCore.typesMod.ComputedPropName
import typings.swcCore.typesMod.ConditionalExpression
import typings.swcCore.typesMod.Constructor
import typings.swcCore.typesMod.ContinueStatement
import typings.swcCore.typesMod.DebuggerStatement
import typings.swcCore.typesMod.Declaration
import typings.swcCore.typesMod.Decorator
import typings.swcCore.typesMod.DefaultDecl
import typings.swcCore.typesMod.DoWhileStatement
import typings.swcCore.typesMod.EmptyStatement
import typings.swcCore.typesMod.ExportAllDeclaration
import typings.swcCore.typesMod.ExportDeclaration
import typings.swcCore.typesMod.ExportDefaultDeclaration
import typings.swcCore.typesMod.ExportDefaultExpression
import typings.swcCore.typesMod.ExportDefaultSpecifier
import typings.swcCore.typesMod.ExportNamedDeclaration
import typings.swcCore.typesMod.ExportNamespaceSpecifier
import typings.swcCore.typesMod.ExportSpecifier
import typings.swcCore.typesMod.ExprOrSpread
import typings.swcCore.typesMod.Expression
import typings.swcCore.typesMod.ExpressionStatement
import typings.swcCore.typesMod.Fn
import typings.swcCore.typesMod.ForInStatement
import typings.swcCore.typesMod.ForOfStatement
import typings.swcCore.typesMod.ForStatement
import typings.swcCore.typesMod.FunctionDeclaration
import typings.swcCore.typesMod.FunctionExpression
import typings.swcCore.typesMod.GetterProperty
import typings.swcCore.typesMod.Identifier
import typings.swcCore.typesMod.IfStatement
import typings.swcCore.typesMod.Import
import typings.swcCore.typesMod.ImportDeclaration
import typings.swcCore.typesMod.ImportDefaultSpecifier
import typings.swcCore.typesMod.ImportNamespaceSpecifier
import typings.swcCore.typesMod.ImportSpecifier
import typings.swcCore.typesMod.JSXAttrValue
import typings.swcCore.typesMod.JSXAttribute
import typings.swcCore.typesMod.JSXAttributeName
import typings.swcCore.typesMod.JSXAttributeOrSpread
import typings.swcCore.typesMod.JSXClosingElement
import typings.swcCore.typesMod.JSXClosingFragment
import typings.swcCore.typesMod.JSXElement
import typings.swcCore.typesMod.JSXElementChild
import typings.swcCore.typesMod.JSXElementName
import typings.swcCore.typesMod.JSXEmptyExpression
import typings.swcCore.typesMod.JSXExpressionContainer
import typings.swcCore.typesMod.JSXFragment
import typings.swcCore.typesMod.JSXMemberExpression
import typings.swcCore.typesMod.JSXNamespacedName
import typings.swcCore.typesMod.JSXObject
import typings.swcCore.typesMod.JSXOpeningElement
import typings.swcCore.typesMod.JSXOpeningFragment
import typings.swcCore.typesMod.JSXSpreadChild
import typings.swcCore.typesMod.JSXText
import typings.swcCore.typesMod.KeyValuePatternProperty
import typings.swcCore.typesMod.KeyValueProperty
import typings.swcCore.typesMod.LabeledStatement
import typings.swcCore.typesMod.MemberExpression
import typings.swcCore.typesMod.MetaProperty
import typings.swcCore.typesMod.MethodProperty
import typings.swcCore.typesMod.Module
import typings.swcCore.typesMod.ModuleDeclaration
import typings.swcCore.typesMod.ModuleExportName
import typings.swcCore.typesMod.ModuleItem
import typings.swcCore.typesMod.NamedExportSpecifier
import typings.swcCore.typesMod.NamedImportSpecifier
import typings.swcCore.typesMod.NewExpression
import typings.swcCore.typesMod.NullLiteral
import typings.swcCore.typesMod.NumericLiteral
import typings.swcCore.typesMod.ObjectExpression
import typings.swcCore.typesMod.ObjectPattern
import typings.swcCore.typesMod.ObjectPatternProperty
import typings.swcCore.typesMod.OptionalChainingCall
import typings.swcCore.typesMod.OptionalChainingExpression
import typings.swcCore.typesMod.Param
import typings.swcCore.typesMod.ParenthesisExpression
import typings.swcCore.typesMod.Pattern
import typings.swcCore.typesMod.PrivateMethod
import typings.swcCore.typesMod.PrivateName
import typings.swcCore.typesMod.PrivateProperty
import typings.swcCore.typesMod.Program
import typings.swcCore.typesMod.Property
import typings.swcCore.typesMod.PropertyName
import typings.swcCore.typesMod.RegExpLiteral
import typings.swcCore.typesMod.RestElement
import typings.swcCore.typesMod.ReturnStatement
import typings.swcCore.typesMod.Script
import typings.swcCore.typesMod.SequenceExpression
import typings.swcCore.typesMod.SetterProperty
import typings.swcCore.typesMod.SpreadElement
import typings.swcCore.typesMod.Statement
import typings.swcCore.typesMod.StaticBlock
import typings.swcCore.typesMod.StringLiteral
import typings.swcCore.typesMod.Super
import typings.swcCore.typesMod.SuperPropExpression
import typings.swcCore.typesMod.SwitchCase
import typings.swcCore.typesMod.SwitchStatement
import typings.swcCore.typesMod.TaggedTemplateExpression
import typings.swcCore.typesMod.TemplateLiteral
import typings.swcCore.typesMod.ThisExpression
import typings.swcCore.typesMod.ThrowStatement
import typings.swcCore.typesMod.TryStatement
import typings.swcCore.typesMod.TsAsExpression
import typings.swcCore.typesMod.TsCallSignatureDeclaration
import typings.swcCore.typesMod.TsConstAssertion
import typings.swcCore.typesMod.TsConstructSignatureDeclaration
import typings.swcCore.typesMod.TsEntityName
import typings.swcCore.typesMod.TsEnumDeclaration
import typings.swcCore.typesMod.TsEnumMember
import typings.swcCore.typesMod.TsEnumMemberId
import typings.swcCore.typesMod.TsExportAssignment
import typings.swcCore.typesMod.TsExpressionWithTypeArguments
import typings.swcCore.typesMod.TsExternalModuleReference
import typings.swcCore.typesMod.TsFnParameter
import typings.swcCore.typesMod.TsGetterSignature
import typings.swcCore.typesMod.TsImportEqualsDeclaration
import typings.swcCore.typesMod.TsIndexSignature
import typings.swcCore.typesMod.TsInstantiation
import typings.swcCore.typesMod.TsInterfaceBody
import typings.swcCore.typesMod.TsInterfaceDeclaration
import typings.swcCore.typesMod.TsMethodSignature
import typings.swcCore.typesMod.TsModuleBlock
import typings.swcCore.typesMod.TsModuleDeclaration
import typings.swcCore.typesMod.TsModuleName
import typings.swcCore.typesMod.TsModuleReference
import typings.swcCore.typesMod.TsNamespaceBody
import typings.swcCore.typesMod.TsNamespaceDeclaration
import typings.swcCore.typesMod.TsNamespaceExportDeclaration
import typings.swcCore.typesMod.TsNonNullExpression
import typings.swcCore.typesMod.TsParameterProperty
import typings.swcCore.typesMod.TsParameterPropertyParameter
import typings.swcCore.typesMod.TsPropertySignature
import typings.swcCore.typesMod.TsQualifiedName
import typings.swcCore.typesMod.TsSetterSignature
import typings.swcCore.typesMod.TsType
import typings.swcCore.typesMod.TsTypeAliasDeclaration
import typings.swcCore.typesMod.TsTypeAnnotation
import typings.swcCore.typesMod.TsTypeAssertion
import typings.swcCore.typesMod.TsTypeElement
import typings.swcCore.typesMod.TsTypeParameter
import typings.swcCore.typesMod.TsTypeParameterDeclaration
import typings.swcCore.typesMod.TsTypeParameterInstantiation
import typings.swcCore.typesMod.UnaryExpression
import typings.swcCore.typesMod.UpdateExpression
import typings.swcCore.typesMod.VariableDeclaration
import typings.swcCore.typesMod.VariableDeclarator
import typings.swcCore.typesMod.WhileStatement
import typings.swcCore.typesMod.WithStatement
import typings.swcCore.typesMod.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @JSImport("@swc/core/Visitor", JSImport.Default)
  @js.native
  open class default () extends Visitor
  
  @JSImport("@swc/core/Visitor", "Visitor")
  @js.native
  open class Visitor () extends StObject {
    
    def visitAccessibility(): js.UndefOr[Accessibility] = js.native
    def visitAccessibility(n: Accessibility): js.UndefOr[Accessibility] = js.native
    
    def visitArgument(n: Argument): Argument = js.native
    
    def visitArguments(nodes: js.Array[Argument]): js.Array[Argument] = js.native
    
    def visitArrayElement(): js.UndefOr[ExprOrSpread] = js.native
    def visitArrayElement(e: ExprOrSpread): js.UndefOr[ExprOrSpread] = js.native
    
    def visitArrayExpression(e: ArrayExpression): Expression = js.native
    
    def visitArrayPattern(n: ArrayPattern): Pattern = js.native
    
    def visitArrayPatternElement(): js.UndefOr[Pattern] = js.native
    def visitArrayPatternElement(n: Pattern): js.UndefOr[Pattern] = js.native
    
    def visitArrayPatternElements(nodes: js.Array[js.UndefOr[Pattern]]): js.Array[js.UndefOr[Pattern]] = js.native
    
    def visitArrowBody(body: BlockStatement): BlockStatement | Expression = js.native
    def visitArrowBody(body: Expression): BlockStatement | Expression = js.native
    
    def visitArrowFunctionExpression(e: ArrowFunctionExpression): Expression = js.native
    
    def visitAssignmentExpression(n: AssignmentExpression): Expression = js.native
    
    def visitAssignmentPattern(n: AssignmentPattern): Pattern = js.native
    
    def visitAssignmentPatternProperty(n: AssignmentPatternProperty): ObjectPatternProperty = js.native
    
    def visitAssignmentProperty(n: AssignmentProperty): Property | SpreadElement = js.native
    
    def visitAwaitExpression(n: AwaitExpression): Expression = js.native
    
    def visitBigIntLiteral(n: BigIntLiteral): BigIntLiteral = js.native
    
    def visitBinaryExpression(n: BinaryExpression): Expression = js.native
    
    def visitBindingIdentifier(i: Identifier): Identifier = js.native
    
    def visitBlockStatement(block: BlockStatement): BlockStatement = js.native
    
    def visitBooleanLiteral(n: BooleanLiteral): BooleanLiteral = js.native
    
    def visitBreakStatement(stmt: BreakStatement): Statement = js.native
    
    def visitCallExpression(n: CallExpression): Expression = js.native
    
    def visitCallee(n: Expression): Expression | Super | Import = js.native
    def visitCallee(n: Import): Expression | Super | Import = js.native
    def visitCallee(n: Super): Expression | Super | Import = js.native
    
    def visitCatchClause(): js.UndefOr[CatchClause] = js.native
    def visitCatchClause(handler: CatchClause): js.UndefOr[CatchClause] = js.native
    
    def visitClass[T /* <: Class */](n: T): T = js.native
    
    def visitClassBody(members: js.Array[ClassMember]): js.Array[ClassMember] = js.native
    
    def visitClassDeclaration(decl: ClassDeclaration): Declaration = js.native
    
    def visitClassExpression(n: ClassExpression): ClassExpression = js.native
    
    def visitClassMember(member: ClassMember): ClassMember = js.native
    
    def visitClassMethod(n: ClassMethod): ClassMember = js.native
    
    def visitClassProperty(n: ClassProperty): ClassMember = js.native
    
    def visitComputedPropertyKey(n: ComputedPropName): ComputedPropName = js.native
    
    def visitConditionalExpression(n: ConditionalExpression): Expression = js.native
    
    def visitConstructor(n: Constructor): ClassMember = js.native
    
    def visitConstructorParameter(n: Param): Param | TsParameterProperty = js.native
    def visitConstructorParameter(n: TsParameterProperty): Param | TsParameterProperty = js.native
    
    def visitConstructorParameters(nodes: js.Array[Param | TsParameterProperty]): js.Array[Param | TsParameterProperty] = js.native
    
    def visitContinueStatement(stmt: ContinueStatement): Statement = js.native
    
    def visitDebuggerStatement(stmt: DebuggerStatement): Statement = js.native
    
    def visitDeclaration(decl: Declaration): Declaration = js.native
    
    def visitDecorator(n: Decorator): Decorator = js.native
    
    def visitDecorators(): js.UndefOr[js.Array[Decorator]] = js.native
    def visitDecorators(nodes: js.Array[Decorator]): js.UndefOr[js.Array[Decorator]] = js.native
    
    def visitDefaultDeclaration(n: DefaultDecl): DefaultDecl = js.native
    
    def visitDoWhileStatement(stmt: DoWhileStatement): Statement = js.native
    
    def visitEmptyStatement(stmt: EmptyStatement): EmptyStatement = js.native
    
    def visitExportAllDeclaration(n: ExportAllDeclaration): ModuleDeclaration = js.native
    
    def visitExportDeclaration(n: ExportDeclaration): ModuleDeclaration = js.native
    
    def visitExportDefaultDeclaration(n: ExportDefaultDeclaration): ModuleDeclaration = js.native
    
    def visitExportDefaultExpression(n: ExportDefaultExpression): ModuleDeclaration = js.native
    
    def visitExportDefaultSpecifier(n: ExportDefaultSpecifier): ExportSpecifier = js.native
    
    def visitExportNamedDeclaration(n: ExportNamedDeclaration): ModuleDeclaration = js.native
    
    def visitExportNamespaceSpecifier(n: ExportNamespaceSpecifier): ExportSpecifier = js.native
    
    def visitExportSpecifier(n: ExportSpecifier): ExportSpecifier = js.native
    
    def visitExportSpecifiers(nodes: js.Array[ExportSpecifier]): js.Array[ExportSpecifier] = js.native
    
    def visitExprOrSpread(e: ExprOrSpread): ExprOrSpread = js.native
    
    def visitExprOrSpreads(nodes: js.Array[ExprOrSpread]): js.Array[ExprOrSpread] = js.native
    
    def visitExpression(n: Expression): Expression = js.native
    
    def visitExpressionStatement(stmt: ExpressionStatement): Statement = js.native
    
    def visitForInStatement(stmt: ForInStatement): Statement = js.native
    
    def visitForOfStatement(stmt: ForOfStatement): Statement = js.native
    
    def visitForStatement(stmt: ForStatement): Statement = js.native
    
    def visitFunction[T /* <: Fn */](n: T): T = js.native
    
    def visitFunctionDeclaration(decl: FunctionDeclaration): Declaration = js.native
    
    def visitFunctionExpression(n: FunctionExpression): FunctionExpression = js.native
    
    def visitGetterProperty(n: GetterProperty): Property | SpreadElement = js.native
    
    def visitIdentifier(n: Identifier): Identifier = js.native
    
    def visitIdentifierReference(i: Identifier): Identifier = js.native
    
    def visitIfStatement(stmt: IfStatement): Statement = js.native
    
    def visitImportDeclaration(n: ImportDeclaration): ImportDeclaration = js.native
    
    def visitImportDefaultSpecifier(node: ImportDefaultSpecifier): ImportSpecifier = js.native
    
    def visitImportNamespaceSpecifier(node: ImportNamespaceSpecifier): ImportNamespaceSpecifier = js.native
    
    def visitImportSpecifier(node: ImportSpecifier): ImportSpecifier = js.native
    
    def visitImportSpecifiers(nodes: js.Array[ImportSpecifier]): js.Array[ImportSpecifier] = js.native
    
    def visitJSXAttribute(n: JSXAttribute): JSXAttributeOrSpread = js.native
    
    def visitJSXAttributeName(n: JSXAttributeName): JSXAttributeName = js.native
    
    def visitJSXAttributeOrSpread(n: JSXAttributeOrSpread): JSXAttributeOrSpread = js.native
    
    def visitJSXAttributeOrSpreads(nodes: js.Array[JSXAttributeOrSpread]): js.Array[JSXAttributeOrSpread] = js.native
    
    def visitJSXAttributeValue(): js.UndefOr[JSXAttrValue] = js.native
    def visitJSXAttributeValue(n: JSXAttrValue): js.UndefOr[JSXAttrValue] = js.native
    
    def visitJSXAttributes(): js.UndefOr[js.Array[JSXAttributeOrSpread]] = js.native
    def visitJSXAttributes(attrs: js.Array[JSXAttributeOrSpread]): js.UndefOr[js.Array[JSXAttributeOrSpread]] = js.native
    
    def visitJSXClosingElement(): js.UndefOr[JSXClosingElement] = js.native
    def visitJSXClosingElement(n: JSXClosingElement): js.UndefOr[JSXClosingElement] = js.native
    
    def visitJSXClosingFragment(n: JSXClosingFragment): JSXClosingFragment = js.native
    
    def visitJSXElement(n: JSXElement): JSXElement = js.native
    
    def visitJSXElementChild(n: JSXElementChild): JSXElementChild = js.native
    
    def visitJSXElementChildren(nodes: js.Array[JSXElementChild]): js.Array[JSXElementChild] = js.native
    
    def visitJSXElementName(n: JSXElementName): JSXElementName = js.native
    
    def visitJSXEmptyExpression(n: JSXEmptyExpression): Expression = js.native
    
    def visitJSXExpressionContainer(n: JSXExpressionContainer): JSXExpressionContainer = js.native
    
    def visitJSXFragment(n: JSXFragment): JSXFragment = js.native
    
    def visitJSXMemberExpression(n: JSXMemberExpression): JSXMemberExpression = js.native
    
    def visitJSXNamespacedName(n: JSXNamespacedName): JSXNamespacedName = js.native
    
    def visitJSXObject(n: JSXObject): JSXObject = js.native
    
    def visitJSXOpeningElement(n: JSXOpeningElement): JSXOpeningElement = js.native
    
    def visitJSXOpeningFragment(n: JSXOpeningFragment): JSXOpeningFragment = js.native
    
    def visitJSXSpreadChild(n: JSXSpreadChild): JSXElementChild = js.native
    
    def visitJSXText(n: JSXText): JSXText = js.native
    
    def visitKeyValuePatternProperty(n: KeyValuePatternProperty): ObjectPatternProperty = js.native
    
    def visitKeyValueProperty(n: KeyValueProperty): Property | SpreadElement = js.native
    
    def visitLabelIdentifier(label: Identifier): Identifier = js.native
    
    def visitLabeledStatement(stmt: LabeledStatement): Statement = js.native
    
    def visitMemberExpression(n: MemberExpression): MemberExpression = js.native
    
    def visitMemberExpressionOrOptionalChainingCall(n: MemberExpression): MemberExpression | OptionalChainingCall = js.native
    def visitMemberExpressionOrOptionalChainingCall(n: OptionalChainingCall): MemberExpression | OptionalChainingCall = js.native
    
    def visitMetaProperty(n: MetaProperty): Expression = js.native
    
    def visitMethodProperty(n: MethodProperty): Property | SpreadElement = js.native
    
    def visitModule(m: Module): Module = js.native
    
    def visitModuleDeclaration(n: ModuleDeclaration): ModuleDeclaration = js.native
    
    def visitModuleExportName(n: ModuleExportName): ModuleExportName = js.native
    
    def visitModuleItem(n: ModuleItem): ModuleItem = js.native
    
    def visitModuleItems(items: js.Array[ModuleItem]): js.Array[ModuleItem] = js.native
    
    def visitNamedExportSpecifier(n: NamedExportSpecifier): ExportSpecifier = js.native
    
    def visitNamedImportSpecifier(node: NamedImportSpecifier): NamedImportSpecifier = js.native
    
    def visitNewExpression(n: NewExpression): Expression = js.native
    
    def visitNullLiteral(n: NullLiteral): NullLiteral = js.native
    
    def visitNumericLiteral(n: NumericLiteral): NumericLiteral = js.native
    
    def visitObjectExpression(n: ObjectExpression): Expression = js.native
    
    def visitObjectPattern(n: ObjectPattern): Pattern = js.native
    
    def visitObjectPatternProperties(nodes: js.Array[ObjectPatternProperty]): js.Array[ObjectPatternProperty] = js.native
    
    def visitObjectPatternProperty(n: ObjectPatternProperty): ObjectPatternProperty = js.native
    
    def visitObjectProperties(nodes: js.Array[Property | SpreadElement]): js.Array[Property | SpreadElement] = js.native
    
    def visitObjectProperty(n: Property): Property | SpreadElement = js.native
    def visitObjectProperty(n: SpreadElement): Property | SpreadElement = js.native
    
    def visitOptionalChainingCall(n: OptionalChainingCall): OptionalChainingCall = js.native
    
    def visitOptionalChainingExpression(n: OptionalChainingExpression): Expression = js.native
    
    def visitOptionalExpression(): js.UndefOr[Expression] = js.native
    def visitOptionalExpression(e: Expression): js.UndefOr[Expression] = js.native
    
    def visitOptionalStatement(): js.UndefOr[Statement] = js.native
    def visitOptionalStatement(stmt: Statement): js.UndefOr[Statement] = js.native
    
    def visitOptionalStringLiteral(): js.UndefOr[StringLiteral] = js.native
    def visitOptionalStringLiteral(n: StringLiteral): js.UndefOr[StringLiteral] = js.native
    
    def visitParameter(n: Param): Param = js.native
    
    def visitParameters(n: js.Array[Param]): js.Array[Param] = js.native
    
    def visitParenthesisExpression(n: ParenthesisExpression): Expression = js.native
    
    def visitPattern(n: Pattern): Pattern = js.native
    
    def visitPatternOrExpression(n: Expression): Pattern | Expression = js.native
    def visitPatternOrExpression(n: Pattern): Pattern | Expression = js.native
    
    def visitPatterns(nodes: js.Array[Pattern]): js.Array[Pattern] = js.native
    
    def visitPrivateMethod(n: PrivateMethod): ClassMember = js.native
    
    def visitPrivateName(n: PrivateName): PrivateName = js.native
    
    def visitPrivateProperty(n: PrivateProperty): ClassMember = js.native
    
    def visitProgram(n: Program): Program = js.native
    
    def visitProperty(n: Property): Property | SpreadElement = js.native
    
    def visitPropertyName(key: PropertyName): PropertyName = js.native
    
    def visitRegExpLiteral(n: RegExpLiteral): Expression = js.native
    
    def visitRestElement(n: RestElement): RestElement = js.native
    
    def visitReturnStatement(stmt: ReturnStatement): Statement = js.native
    
    def visitScript(m: Script): Script = js.native
    
    def visitSequenceExpression(n: SequenceExpression): Expression = js.native
    
    def visitSetterProperty(n: SetterProperty): Property | SpreadElement = js.native
    
    def visitSpreadElement(e: SpreadElement): SpreadElement = js.native
    
    def visitStatement(stmt: Statement): Statement = js.native
    
    def visitStatements(stmts: js.Array[Statement]): js.Array[Statement] = js.native
    
    def visitStaticBlock(n: StaticBlock): StaticBlock = js.native
    
    def visitStringLiteral(n: StringLiteral): StringLiteral = js.native
    
    def visitSuperPropExpression(n: SuperPropExpression): Expression = js.native
    
    def visitSwitchCase(c: SwitchCase): SwitchCase = js.native
    
    def visitSwitchCases(cases: js.Array[SwitchCase]): js.Array[SwitchCase] = js.native
    
    def visitSwitchStatement(stmt: SwitchStatement): Statement = js.native
    
    def visitTaggedTemplateExpression(n: TaggedTemplateExpression): Expression = js.native
    
    def visitTemplateLiteral(n: TemplateLiteral): Expression = js.native
    
    def visitThisExpression(n: ThisExpression): Expression = js.native
    
    def visitThrowStatement(stmt: ThrowStatement): Statement = js.native
    
    def visitTryStatement(stmt: TryStatement): Statement = js.native
    
    def visitTsAsExpression(n: TsAsExpression): Expression = js.native
    
    def visitTsCallSignatureDeclaration(n: TsCallSignatureDeclaration): TsCallSignatureDeclaration = js.native
    
    def visitTsConstAssertion(n: TsConstAssertion): Expression = js.native
    
    def visitTsConstructSignatureDeclaration(n: TsConstructSignatureDeclaration): TsConstructSignatureDeclaration = js.native
    
    def visitTsEntityName(n: TsEntityName): TsEntityName = js.native
    
    def visitTsEnumDeclaration(n: TsEnumDeclaration): Declaration = js.native
    
    def visitTsEnumMember(n: TsEnumMember): TsEnumMember = js.native
    
    def visitTsEnumMemberId(n: TsEnumMemberId): TsEnumMemberId = js.native
    
    def visitTsEnumMembers(nodes: js.Array[TsEnumMember]): js.Array[TsEnumMember] = js.native
    
    def visitTsExportAssignment(n: TsExportAssignment): TsExportAssignment = js.native
    
    def visitTsExpressionWithTypeArguments(n: TsExpressionWithTypeArguments): TsExpressionWithTypeArguments = js.native
    
    def visitTsExpressionsWithTypeArguments(nodes: js.Array[TsExpressionWithTypeArguments]): js.Array[TsExpressionWithTypeArguments] = js.native
    
    def visitTsExternalModuleReference(n: TsExternalModuleReference): TsExternalModuleReference = js.native
    
    def visitTsFnParameter(n: TsFnParameter): TsFnParameter = js.native
    
    def visitTsFnParameters(params: js.Array[TsFnParameter]): js.Array[TsFnParameter] = js.native
    
    def visitTsGetterSignature(n: TsGetterSignature): TsGetterSignature = js.native
    
    def visitTsImportEqualsDeclaration(n: TsImportEqualsDeclaration): ModuleDeclaration = js.native
    
    def visitTsIndexSignature(n: TsIndexSignature): TsIndexSignature = js.native
    
    def visitTsInstantiation(n: TsInstantiation): TsInstantiation = js.native
    
    def visitTsInterfaceBody(n: TsInterfaceBody): TsInterfaceBody = js.native
    
    def visitTsInterfaceDeclaration(n: TsInterfaceDeclaration): TsInterfaceDeclaration = js.native
    
    def visitTsMethodSignature(n: TsMethodSignature): TsMethodSignature = js.native
    
    def visitTsModuleBlock(n: TsModuleBlock): TsModuleBlock | TsNamespaceDeclaration = js.native
    
    def visitTsModuleDeclaration(n: TsModuleDeclaration): Declaration = js.native
    
    def visitTsModuleName(n: TsModuleName): TsModuleName = js.native
    
    def visitTsModuleReference(n: TsModuleReference): TsModuleReference = js.native
    
    def visitTsNamespaceBody(n: TsNamespaceBody): js.UndefOr[TsNamespaceBody] = js.native
    
    def visitTsNamespaceDeclaration(n: TsNamespaceDeclaration): TsModuleBlock | TsNamespaceDeclaration = js.native
    
    def visitTsNamespaceExportDeclaration(n: TsNamespaceExportDeclaration): ModuleDeclaration = js.native
    
    def visitTsNonNullExpression(n: TsNonNullExpression): Expression = js.native
    
    def visitTsParameterProperty(n: TsParameterProperty): TsParameterProperty | Param = js.native
    
    def visitTsParameterPropertyParameter(n: TsParameterPropertyParameter): TsParameterPropertyParameter = js.native
    
    def visitTsPropertySignature(n: TsPropertySignature): TsPropertySignature = js.native
    
    def visitTsQualifiedName(n: TsQualifiedName): TsQualifiedName = js.native
    
    def visitTsSetterSignature(n: TsSetterSignature): TsSetterSignature = js.native
    
    def visitTsType(n: TsType): TsType = js.native
    
    def visitTsTypeAliasDeclaration(n: TsTypeAliasDeclaration): Declaration = js.native
    
    def visitTsTypeAnnotation(): js.UndefOr[TsTypeAnnotation] = js.native
    def visitTsTypeAnnotation(a: TsTypeAnnotation): js.UndefOr[TsTypeAnnotation] = js.native
    
    def visitTsTypeArguments(): js.UndefOr[TsTypeParameterInstantiation] = js.native
    def visitTsTypeArguments(n: TsTypeParameterInstantiation): js.UndefOr[TsTypeParameterInstantiation] = js.native
    
    def visitTsTypeAssertion(n: TsTypeAssertion): Expression = js.native
    
    def visitTsTypeElement(n: TsTypeElement): TsTypeElement = js.native
    
    def visitTsTypeElements(nodes: js.Array[TsTypeElement]): js.Array[TsTypeElement] = js.native
    
    def visitTsTypeParameter(n: TsTypeParameter): TsTypeParameter = js.native
    
    def visitTsTypeParameterDeclaration(): js.UndefOr[TsTypeParameterDeclaration] = js.native
    def visitTsTypeParameterDeclaration(n: TsTypeParameterDeclaration): js.UndefOr[TsTypeParameterDeclaration] = js.native
    
    def visitTsTypeParameterInstantiation(): js.UndefOr[TsTypeParameterInstantiation] = js.native
    def visitTsTypeParameterInstantiation(n: TsTypeParameterInstantiation): js.UndefOr[TsTypeParameterInstantiation] = js.native
    
    def visitTsTypeParameters(nodes: js.Array[TsTypeParameter]): js.Array[TsTypeParameter] = js.native
    
    def visitTsTypes(nodes: js.Array[TsType]): js.Array[TsType] = js.native
    
    def visitUnaryExpression(n: UnaryExpression): Expression = js.native
    
    def visitUpdateExpression(n: UpdateExpression): Expression = js.native
    
    def visitVariableDeclaration(n: VariableDeclaration): VariableDeclaration = js.native
    
    def visitVariableDeclarator(n: VariableDeclarator): VariableDeclarator = js.native
    
    def visitVariableDeclarators(nodes: js.Array[VariableDeclarator]): js.Array[VariableDeclarator] = js.native
    
    def visitWhileStatement(stmt: WhileStatement): Statement = js.native
    
    def visitWithStatement(stmt: WithStatement): Statement = js.native
    
    def visitYieldExpression(n: YieldExpression): Expression = js.native
  }
}
