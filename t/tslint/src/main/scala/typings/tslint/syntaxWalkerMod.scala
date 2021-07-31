package typings.tslint

import typings.typescript.mod.AccessorDeclaration
import typings.typescript.mod.ArrayLiteralExpression
import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.BinaryExpression
import typings.typescript.mod.BindingElement
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.Block
import typings.typescript.mod.BreakOrContinueStatement
import typings.typescript.mod.CallExpression
import typings.typescript.mod.CaseClause
import typings.typescript.mod.CatchClause
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.ClassExpression
import typings.typescript.mod.ConditionalExpression
import typings.typescript.mod.ConstructSignatureDeclaration
import typings.typescript.mod.ConstructorDeclaration
import typings.typescript.mod.DefaultClause
import typings.typescript.mod.DoStatement
import typings.typescript.mod.ElementAccessExpression
import typings.typescript.mod.EnumDeclaration
import typings.typescript.mod.EnumMember
import typings.typescript.mod.ExportAssignment
import typings.typescript.mod.ExpressionStatement
import typings.typescript.mod.ForInStatement
import typings.typescript.mod.ForOfStatement
import typings.typescript.mod.ForStatement
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.FunctionOrConstructorTypeNode
import typings.typescript.mod.Identifier
import typings.typescript.mod.IfStatement
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.ImportEqualsDeclaration
import typings.typescript.mod.IndexSignatureDeclaration
import typings.typescript.mod.InterfaceDeclaration
import typings.typescript.mod.JsxAttribute
import typings.typescript.mod.JsxElement
import typings.typescript.mod.JsxExpression
import typings.typescript.mod.JsxSelfClosingElement
import typings.typescript.mod.JsxSpreadAttribute
import typings.typescript.mod.LabeledStatement
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.NamedImports
import typings.typescript.mod.NamespaceImport
import typings.typescript.mod.NewExpression
import typings.typescript.mod.Node
import typings.typescript.mod.NonNullExpression
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PostfixUnaryExpression
import typings.typescript.mod.PrefixUnaryExpression
import typings.typescript.mod.PropertyAccessExpression
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.PropertyDeclaration
import typings.typescript.mod.ReturnStatement
import typings.typescript.mod.SignatureDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.SwitchStatement
import typings.typescript.mod.TemplateExpression
import typings.typescript.mod.ThrowStatement
import typings.typescript.mod.TryStatement
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.TypeAliasDeclaration
import typings.typescript.mod.TypeAssertion
import typings.typescript.mod.TypeLiteralNode
import typings.typescript.mod.TypeReferenceNode
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import typings.typescript.mod.VariableStatement
import typings.typescript.mod.WhileStatement
import typings.typescript.mod.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxWalkerMod {
  
  @JSImport("tslint/lib/language/walker/syntaxWalker", "SyntaxWalker")
  @js.native
  class SyntaxWalker () extends StObject {
    
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
