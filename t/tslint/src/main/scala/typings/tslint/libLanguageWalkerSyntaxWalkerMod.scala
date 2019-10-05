package typings.tslint

import typings.typescript.typescriptMod.AccessorDeclaration
import typings.typescript.typescriptMod.ArrayLiteralExpression
import typings.typescript.typescriptMod.ArrayTypeNode
import typings.typescript.typescriptMod.ArrowFunction
import typings.typescript.typescriptMod.BinaryExpression
import typings.typescript.typescriptMod.BindingElement
import typings.typescript.typescriptMod.BindingPattern
import typings.typescript.typescriptMod.Block
import typings.typescript.typescriptMod.BreakOrContinueStatement
import typings.typescript.typescriptMod.CallExpression
import typings.typescript.typescriptMod.CaseClause
import typings.typescript.typescriptMod.CatchClause
import typings.typescript.typescriptMod.ClassDeclaration
import typings.typescript.typescriptMod.ClassExpression
import typings.typescript.typescriptMod.ConditionalExpression
import typings.typescript.typescriptMod.ConstructSignatureDeclaration
import typings.typescript.typescriptMod.ConstructorDeclaration
import typings.typescript.typescriptMod.DefaultClause
import typings.typescript.typescriptMod.DoStatement
import typings.typescript.typescriptMod.ElementAccessExpression
import typings.typescript.typescriptMod.EnumDeclaration
import typings.typescript.typescriptMod.EnumMember
import typings.typescript.typescriptMod.ExportAssignment
import typings.typescript.typescriptMod.ExpressionStatement
import typings.typescript.typescriptMod.ForInStatement
import typings.typescript.typescriptMod.ForOfStatement
import typings.typescript.typescriptMod.ForStatement
import typings.typescript.typescriptMod.FunctionDeclaration
import typings.typescript.typescriptMod.FunctionExpression
import typings.typescript.typescriptMod.FunctionOrConstructorTypeNode
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.IfStatement
import typings.typescript.typescriptMod.ImportDeclaration
import typings.typescript.typescriptMod.ImportEqualsDeclaration
import typings.typescript.typescriptMod.IndexSignatureDeclaration
import typings.typescript.typescriptMod.InterfaceDeclaration
import typings.typescript.typescriptMod.JsxAttribute
import typings.typescript.typescriptMod.JsxElement
import typings.typescript.typescriptMod.JsxExpression
import typings.typescript.typescriptMod.JsxSelfClosingElement
import typings.typescript.typescriptMod.JsxSpreadAttribute
import typings.typescript.typescriptMod.LabeledStatement
import typings.typescript.typescriptMod.MethodDeclaration
import typings.typescript.typescriptMod.ModuleDeclaration
import typings.typescript.typescriptMod.NamedImports
import typings.typescript.typescriptMod.NamespaceImport
import typings.typescript.typescriptMod.NewExpression
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NonNullExpression
import typings.typescript.typescriptMod.NumericLiteral
import typings.typescript.typescriptMod.ObjectLiteralExpression
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.PostfixUnaryExpression
import typings.typescript.typescriptMod.PrefixUnaryExpression
import typings.typescript.typescriptMod.PropertyAccessExpression
import typings.typescript.typescriptMod.PropertyAssignment
import typings.typescript.typescriptMod.PropertyDeclaration
import typings.typescript.typescriptMod.ReturnStatement
import typings.typescript.typescriptMod.SignatureDeclaration
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.Statement
import typings.typescript.typescriptMod.StringLiteral
import typings.typescript.typescriptMod.SwitchStatement
import typings.typescript.typescriptMod.TemplateExpression
import typings.typescript.typescriptMod.ThrowStatement
import typings.typescript.typescriptMod.TryStatement
import typings.typescript.typescriptMod.TupleTypeNode
import typings.typescript.typescriptMod.TypeAliasDeclaration
import typings.typescript.typescriptMod.TypeAssertion
import typings.typescript.typescriptMod.TypeLiteralNode
import typings.typescript.typescriptMod.TypeReferenceNode
import typings.typescript.typescriptMod.VariableDeclaration
import typings.typescript.typescriptMod.VariableDeclarationList
import typings.typescript.typescriptMod.VariableStatement
import typings.typescript.typescriptMod.WhileStatement
import typings.typescript.typescriptMod.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/syntaxWalker", JSImport.Namespace)
@js.native
object libLanguageWalkerSyntaxWalkerMod extends js.Object {
  @js.native
  class SyntaxWalker () extends js.Object {
    /* protected */ def visitAnyKeyword(node: Node): Unit = js.native
    /* protected */ def visitArrayLiteralExpression(node: ArrayLiteralExpression): Unit = js.native
    /* protected */ def visitArrayType(node: ArrayTypeNode): Unit = js.native
    /* protected */ def visitArrowFunction(node: ArrowFunction): Unit = js.native
    /* protected */ def visitBinaryExpression(node: BinaryExpression): Unit = js.native
    /* protected */ def visitBindingElement(node: BindingElement): Unit = js.native
    /* protected */ def visitBindingPattern(node: BindingPattern): Unit = js.native
    /* protected */ def visitBlock(node: Block): Unit = js.native
    /* protected */ def visitBreakStatement(node: BreakOrContinueStatement): Unit = js.native
    /* protected */ def visitCallExpression(node: CallExpression): Unit = js.native
    /* protected */ def visitCallSignature(node: SignatureDeclaration): Unit = js.native
    /* protected */ def visitCaseClause(node: CaseClause): Unit = js.native
    /* protected */ def visitCatchClause(node: CatchClause): Unit = js.native
    /* protected */ def visitClassDeclaration(node: ClassDeclaration): Unit = js.native
    /* protected */ def visitClassExpression(node: ClassExpression): Unit = js.native
    /* protected */ def visitConditionalExpression(node: ConditionalExpression): Unit = js.native
    /* protected */ def visitConstructSignature(node: ConstructSignatureDeclaration): Unit = js.native
    /* protected */ def visitConstructorDeclaration(node: ConstructorDeclaration): Unit = js.native
    /* protected */ def visitConstructorType(node: FunctionOrConstructorTypeNode): Unit = js.native
    /* protected */ def visitContinueStatement(node: BreakOrContinueStatement): Unit = js.native
    /* protected */ def visitDebuggerStatement(node: Statement): Unit = js.native
    /* protected */ def visitDefaultClause(node: DefaultClause): Unit = js.native
    /* protected */ def visitDoStatement(node: DoStatement): Unit = js.native
    /* protected */ def visitElementAccessExpression(node: ElementAccessExpression): Unit = js.native
    /* protected */ def visitEndOfFileToken(node: Node): Unit = js.native
    /* protected */ def visitEnumDeclaration(node: EnumDeclaration): Unit = js.native
    /* protected */ def visitEnumMember(node: EnumMember): Unit = js.native
    /* protected */ def visitExportAssignment(node: ExportAssignment): Unit = js.native
    /* protected */ def visitExpressionStatement(node: ExpressionStatement): Unit = js.native
    /* protected */ def visitForInStatement(node: ForInStatement): Unit = js.native
    /* protected */ def visitForOfStatement(node: ForOfStatement): Unit = js.native
    /* protected */ def visitForStatement(node: ForStatement): Unit = js.native
    /* protected */ def visitFunctionDeclaration(node: FunctionDeclaration): Unit = js.native
    /* protected */ def visitFunctionExpression(node: FunctionExpression): Unit = js.native
    /* protected */ def visitFunctionType(node: FunctionOrConstructorTypeNode): Unit = js.native
    /* protected */ def visitGetAccessor(node: AccessorDeclaration): Unit = js.native
    /* protected */ def visitIdentifier(node: Identifier): Unit = js.native
    /* protected */ def visitIfStatement(node: IfStatement): Unit = js.native
    /* protected */ def visitImportDeclaration(node: ImportDeclaration): Unit = js.native
    /* protected */ def visitImportEqualsDeclaration(node: ImportEqualsDeclaration): Unit = js.native
    /* protected */ def visitIndexSignatureDeclaration(node: IndexSignatureDeclaration): Unit = js.native
    /* protected */ def visitInterfaceDeclaration(node: InterfaceDeclaration): Unit = js.native
    /* protected */ def visitJsxAttribute(node: JsxAttribute): Unit = js.native
    /* protected */ def visitJsxElement(node: JsxElement): Unit = js.native
    /* protected */ def visitJsxExpression(node: JsxExpression): Unit = js.native
    /* protected */ def visitJsxSelfClosingElement(node: JsxSelfClosingElement): Unit = js.native
    /* protected */ def visitJsxSpreadAttribute(node: JsxSpreadAttribute): Unit = js.native
    /* protected */ def visitLabeledStatement(node: LabeledStatement): Unit = js.native
    /* protected */ def visitMethodDeclaration(node: MethodDeclaration): Unit = js.native
    /* protected */ def visitMethodSignature(node: SignatureDeclaration): Unit = js.native
    /* protected */ def visitModuleDeclaration(node: ModuleDeclaration): Unit = js.native
    /* protected */ def visitNamedImports(node: NamedImports): Unit = js.native
    /* protected */ def visitNamespaceImport(node: NamespaceImport): Unit = js.native
    /* protected */ def visitNewExpression(node: NewExpression): Unit = js.native
    /* protected */ def visitNode(node: Node): Unit = js.native
    /* protected */ def visitNonNullExpression(node: NonNullExpression): Unit = js.native
    /* protected */ def visitNumericLiteral(node: NumericLiteral): Unit = js.native
    /* protected */ def visitObjectLiteralExpression(node: ObjectLiteralExpression): Unit = js.native
    /* protected */ def visitParameterDeclaration(node: ParameterDeclaration): Unit = js.native
    /* protected */ def visitPostfixUnaryExpression(node: PostfixUnaryExpression): Unit = js.native
    /* protected */ def visitPrefixUnaryExpression(node: PrefixUnaryExpression): Unit = js.native
    /* protected */ def visitPropertyAccessExpression(node: PropertyAccessExpression): Unit = js.native
    /* protected */ def visitPropertyAssignment(node: PropertyAssignment): Unit = js.native
    /* protected */ def visitPropertyDeclaration(node: PropertyDeclaration): Unit = js.native
    /* protected */ def visitPropertySignature(node: Node): Unit = js.native
    /* protected */ def visitRegularExpressionLiteral(node: Node): Unit = js.native
    /* protected */ def visitReturnStatement(node: ReturnStatement): Unit = js.native
    /* protected */ def visitSetAccessor(node: AccessorDeclaration): Unit = js.native
    /* protected */ def visitSourceFile(node: SourceFile): Unit = js.native
    /* protected */ def visitStringLiteral(node: StringLiteral): Unit = js.native
    /* protected */ def visitSwitchStatement(node: SwitchStatement): Unit = js.native
    /* protected */ def visitTemplateExpression(node: TemplateExpression): Unit = js.native
    /* protected */ def visitThrowStatement(node: ThrowStatement): Unit = js.native
    /* protected */ def visitTryStatement(node: TryStatement): Unit = js.native
    /* protected */ def visitTupleType(node: TupleTypeNode): Unit = js.native
    /* protected */ def visitTypeAliasDeclaration(node: TypeAliasDeclaration): Unit = js.native
    /* protected */ def visitTypeAssertionExpression(node: TypeAssertion): Unit = js.native
    /* protected */ def visitTypeLiteral(node: TypeLiteralNode): Unit = js.native
    /* protected */ def visitTypeReference(node: TypeReferenceNode): Unit = js.native
    /* protected */ def visitVariableDeclaration(node: VariableDeclaration): Unit = js.native
    /* protected */ def visitVariableDeclarationList(node: VariableDeclarationList): Unit = js.native
    /* protected */ def visitVariableStatement(node: VariableStatement): Unit = js.native
    /* protected */ def visitWhileStatement(node: WhileStatement): Unit = js.native
    /* protected */ def visitWithStatement(node: WithStatement): Unit = js.native
    def walk(node: Node): Unit = js.native
    /* protected */ def walkChildren(node: Node): Unit = js.native
  }
  
}

