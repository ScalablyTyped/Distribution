package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait AbstractKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 125 */ val AbstractKeyword: typings.typescript.mod.SyntaxKind.AbstractKeyword with Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 75 */ val AmpersandAmpersandEqualsToken: typings.typescript.mod.SyntaxKind.AmpersandAmpersandEqualsToken with Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with LogicalOperator
  /* 55 */ val AmpersandAmpersandToken: typings.typescript.mod.SyntaxKind.AmpersandAmpersandToken with Double = js.native
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 72 */ val AmpersandEqualsToken: typings.typescript.mod.SyntaxKind.AmpersandEqualsToken with Double = js.native
  
  @js.native
  sealed trait AmpersandToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 50 */ val AmpersandToken: typings.typescript.mod.SyntaxKind.AmpersandToken with Double = js.native
  
  @js.native
  sealed trait AnyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 128 */ val AnyKeyword: typings.typescript.mod.SyntaxKind.AnyKeyword with Double = js.native
  
  @js.native
  sealed trait ArrayBindingPattern extends SyntaxKind
  /* 197 */ val ArrayBindingPattern: typings.typescript.mod.SyntaxKind.ArrayBindingPattern with Double = js.native
  
  @js.native
  sealed trait ArrayLiteralExpression extends SyntaxKind
  /* 199 */ val ArrayLiteralExpression: typings.typescript.mod.SyntaxKind.ArrayLiteralExpression with Double = js.native
  
  @js.native
  sealed trait ArrayType extends SyntaxKind
  /* 178 */ val ArrayType: typings.typescript.mod.SyntaxKind.ArrayType with Double = js.native
  
  @js.native
  sealed trait ArrowFunction extends SyntaxKind
  /* 209 */ val ArrowFunction: typings.typescript.mod.SyntaxKind.ArrowFunction with Double = js.native
  
  @js.native
  sealed trait AsExpression extends SyntaxKind
  /* 224 */ val AsExpression: typings.typescript.mod.SyntaxKind.AsExpression with Double = js.native
  
  @js.native
  sealed trait AsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 126 */ val AsKeyword: typings.typescript.mod.SyntaxKind.AsKeyword with Double = js.native
  
  @js.native
  sealed trait AssertsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 127 */ val AssertsKeyword: typings.typescript.mod.SyntaxKind.AssertsKeyword with Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 66 */ val AsteriskAsteriskEqualsToken: typings.typescript.mod.SyntaxKind.AsteriskAsteriskEqualsToken with Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 42 */ val AsteriskAsteriskToken: typings.typescript.mod.SyntaxKind.AsteriskAsteriskToken with Double = js.native
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 65 */ val AsteriskEqualsToken: typings.typescript.mod.SyntaxKind.AsteriskEqualsToken with Double = js.native
  
  @js.native
  sealed trait AsteriskToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
  /* 41 */ val AsteriskToken: typings.typescript.mod.SyntaxKind.AsteriskToken with Double = js.native
  
  @js.native
  sealed trait AsyncKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 129 */ val AsyncKeyword: typings.typescript.mod.SyntaxKind.AsyncKeyword with Double = js.native
  
  @js.native
  sealed trait AtToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 59 */ val AtToken: typings.typescript.mod.SyntaxKind.AtToken with Double = js.native
  
  @js.native
  sealed trait AwaitExpression extends SyntaxKind
  /* 213 */ val AwaitExpression: typings.typescript.mod.SyntaxKind.AwaitExpression with Double = js.native
  
  @js.native
  sealed trait AwaitKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 130 */ val AwaitKeyword: typings.typescript.mod.SyntaxKind.AwaitKeyword with Double = js.native
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 61 */ val BacktickToken: typings.typescript.mod.SyntaxKind.BacktickToken with Double = js.native
  
  @js.native
  sealed trait BarBarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 74 */ val BarBarEqualsToken: typings.typescript.mod.SyntaxKind.BarBarEqualsToken with Double = js.native
  
  @js.native
  sealed trait BarBarToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with LogicalOperator
  /* 56 */ val BarBarToken: typings.typescript.mod.SyntaxKind.BarBarToken with Double = js.native
  
  @js.native
  sealed trait BarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 73 */ val BarEqualsToken: typings.typescript.mod.SyntaxKind.BarEqualsToken with Double = js.native
  
  @js.native
  sealed trait BarToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 51 */ val BarToken: typings.typescript.mod.SyntaxKind.BarToken with Double = js.native
  
  @js.native
  sealed trait BigIntKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 155 */ val BigIntKeyword: typings.typescript.mod.SyntaxKind.BigIntKeyword with Double = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 9 */ val BigIntLiteral: typings.typescript.mod.SyntaxKind.BigIntLiteral with Double = js.native
  
  @js.native
  sealed trait BinaryExpression extends SyntaxKind
  /* 216 */ val BinaryExpression: typings.typescript.mod.SyntaxKind.BinaryExpression with Double = js.native
  
  @js.native
  sealed trait BindingElement extends SyntaxKind
  /* 198 */ val BindingElement: typings.typescript.mod.SyntaxKind.BindingElement with Double = js.native
  
  @js.native
  sealed trait Block extends SyntaxKind
  /* 230 */ val Block: typings.typescript.mod.SyntaxKind.Block with Double = js.native
  
  @js.native
  sealed trait BooleanKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 131 */ val BooleanKeyword: typings.typescript.mod.SyntaxKind.BooleanKeyword with Double = js.native
  
  @js.native
  sealed trait BreakKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 80 */ val BreakKeyword: typings.typescript.mod.SyntaxKind.BreakKeyword with Double = js.native
  
  @js.native
  sealed trait BreakStatement extends SyntaxKind
  /* 241 */ val BreakStatement: typings.typescript.mod.SyntaxKind.BreakStatement with Double = js.native
  
  @js.native
  sealed trait Bundle extends SyntaxKind
  /* 298 */ val Bundle: typings.typescript.mod.SyntaxKind.Bundle with Double = js.native
  
  @js.native
  sealed trait CallExpression extends SyntaxKind
  /* 203 */ val CallExpression: typings.typescript.mod.SyntaxKind.CallExpression with Double = js.native
  
  @js.native
  sealed trait CallSignature extends SyntaxKind
  /* 169 */ val CallSignature: typings.typescript.mod.SyntaxKind.CallSignature with Double = js.native
  
  @js.native
  sealed trait CaretEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 77 */ val CaretEqualsToken: typings.typescript.mod.SyntaxKind.CaretEqualsToken with Double = js.native
  
  @js.native
  sealed trait CaretToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 52 */ val CaretToken: typings.typescript.mod.SyntaxKind.CaretToken with Double = js.native
  
  @js.native
  sealed trait CaseBlock extends SyntaxKind
  /* 258 */ val CaseBlock: typings.typescript.mod.SyntaxKind.CaseBlock with Double = js.native
  
  @js.native
  sealed trait CaseClause extends SyntaxKind
  /* 284 */ val CaseClause: typings.typescript.mod.SyntaxKind.CaseClause with Double = js.native
  
  @js.native
  sealed trait CaseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 81 */ val CaseKeyword: typings.typescript.mod.SyntaxKind.CaseKeyword with Double = js.native
  
  @js.native
  sealed trait CatchClause extends SyntaxKind
  /* 287 */ val CatchClause: typings.typescript.mod.SyntaxKind.CatchClause with Double = js.native
  
  @js.native
  sealed trait CatchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 82 */ val CatchKeyword: typings.typescript.mod.SyntaxKind.CatchKeyword with Double = js.native
  
  @js.native
  sealed trait ClassDeclaration extends SyntaxKind
  /* 252 */ val ClassDeclaration: typings.typescript.mod.SyntaxKind.ClassDeclaration with Double = js.native
  
  @js.native
  sealed trait ClassExpression extends SyntaxKind
  /* 221 */ val ClassExpression: typings.typescript.mod.SyntaxKind.ClassExpression with Double = js.native
  
  @js.native
  sealed trait ClassKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 83 */ val ClassKeyword: typings.typescript.mod.SyntaxKind.ClassKeyword with Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 19 */ val CloseBraceToken: typings.typescript.mod.SyntaxKind.CloseBraceToken with Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 23 */ val CloseBracketToken: typings.typescript.mod.SyntaxKind.CloseBracketToken with Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 21 */ val CloseParenToken: typings.typescript.mod.SyntaxKind.CloseParenToken with Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 58 */ val ColonToken: typings.typescript.mod.SyntaxKind.ColonToken with Double = js.native
  
  @js.native
  sealed trait CommaListExpression extends SyntaxKind
  /* 337 */ val CommaListExpression: typings.typescript.mod.SyntaxKind.CommaListExpression with Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with _BinaryOperator
  /* 27 */ val CommaToken: typings.typescript.mod.SyntaxKind.CommaToken with Double = js.native
  
  @js.native
  sealed trait ComputedPropertyName extends SyntaxKind
  /* 158 */ val ComputedPropertyName: typings.typescript.mod.SyntaxKind.ComputedPropertyName with Double = js.native
  
  @js.native
  sealed trait ConditionalExpression extends SyntaxKind
  /* 217 */ val ConditionalExpression: typings.typescript.mod.SyntaxKind.ConditionalExpression with Double = js.native
  
  @js.native
  sealed trait ConditionalType extends SyntaxKind
  /* 184 */ val ConditionalType: typings.typescript.mod.SyntaxKind.ConditionalType with Double = js.native
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 7 */ val ConflictMarkerTrivia: typings.typescript.mod.SyntaxKind.ConflictMarkerTrivia with Double = js.native
  
  @js.native
  sealed trait ConstKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 84 */ val ConstKeyword: typings.typescript.mod.SyntaxKind.ConstKeyword with Double = js.native
  
  @js.native
  sealed trait ConstructSignature extends SyntaxKind
  /* 170 */ val ConstructSignature: typings.typescript.mod.SyntaxKind.ConstructSignature with Double = js.native
  
  @js.native
  sealed trait Constructor extends SyntaxKind
  /* 166 */ val Constructor: typings.typescript.mod.SyntaxKind.Constructor with Double = js.native
  
  @js.native
  sealed trait ConstructorKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 132 */ val ConstructorKeyword: typings.typescript.mod.SyntaxKind.ConstructorKeyword with Double = js.native
  
  @js.native
  sealed trait ConstructorType extends SyntaxKind
  /* 175 */ val ConstructorType: typings.typescript.mod.SyntaxKind.ConstructorType with Double = js.native
  
  @js.native
  sealed trait ContinueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 85 */ val ContinueKeyword: typings.typescript.mod.SyntaxKind.ContinueKeyword with Double = js.native
  
  @js.native
  sealed trait ContinueStatement extends SyntaxKind
  /* 240 */ val ContinueStatement: typings.typescript.mod.SyntaxKind.ContinueStatement with Double = js.native
  
  @js.native
  sealed trait Count extends SyntaxKind
  /* 341 */ val Count: typings.typescript.mod.SyntaxKind.Count with Double = js.native
  
  @js.native
  sealed trait DebuggerKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 86 */ val DebuggerKeyword: typings.typescript.mod.SyntaxKind.DebuggerKeyword with Double = js.native
  
  @js.native
  sealed trait DebuggerStatement extends SyntaxKind
  /* 248 */ val DebuggerStatement: typings.typescript.mod.SyntaxKind.DebuggerStatement with Double = js.native
  
  @js.native
  sealed trait DeclareKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 133 */ val DeclareKeyword: typings.typescript.mod.SyntaxKind.DeclareKeyword with Double = js.native
  
  @js.native
  sealed trait Decorator extends SyntaxKind
  /* 161 */ val Decorator: typings.typescript.mod.SyntaxKind.Decorator with Double = js.native
  
  @js.native
  sealed trait DefaultClause extends SyntaxKind
  /* 285 */ val DefaultClause: typings.typescript.mod.SyntaxKind.DefaultClause with Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 87 */ val DefaultKeyword: typings.typescript.mod.SyntaxKind.DefaultKeyword with Double = js.native
  
  @js.native
  sealed trait DeleteExpression extends SyntaxKind
  /* 210 */ val DeleteExpression: typings.typescript.mod.SyntaxKind.DeleteExpression with Double = js.native
  
  @js.native
  sealed trait DeleteKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 88 */ val DeleteKeyword: typings.typescript.mod.SyntaxKind.DeleteKeyword with Double = js.native
  
  @js.native
  sealed trait DoKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 89 */ val DoKeyword: typings.typescript.mod.SyntaxKind.DoKeyword with Double = js.native
  
  @js.native
  sealed trait DoStatement extends SyntaxKind
  /* 235 */ val DoStatement: typings.typescript.mod.SyntaxKind.DoStatement with Double = js.native
  
  @js.native
  sealed trait DotDotDotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 25 */ val DotDotDotToken: typings.typescript.mod.SyntaxKind.DotDotDotToken with Double = js.native
  
  @js.native
  sealed trait DotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 24 */ val DotToken: typings.typescript.mod.SyntaxKind.DotToken with Double = js.native
  
  @js.native
  sealed trait ElementAccessExpression extends SyntaxKind
  /* 202 */ val ElementAccessExpression: typings.typescript.mod.SyntaxKind.ElementAccessExpression with Double = js.native
  
  @js.native
  sealed trait ElseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 90 */ val ElseKeyword: typings.typescript.mod.SyntaxKind.ElseKeyword with Double = js.native
  
  @js.native
  sealed trait EmptyStatement extends SyntaxKind
  /* 231 */ val EmptyStatement: typings.typescript.mod.SyntaxKind.EmptyStatement with Double = js.native
  
  @js.native
  sealed trait EndOfDeclarationMarker extends SyntaxKind
  /* 339 */ val EndOfDeclarationMarker: typings.typescript.mod.SyntaxKind.EndOfDeclarationMarker with Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with TokenSyntaxKind
  /* 1 */ val EndOfFileToken: typings.typescript.mod.SyntaxKind.EndOfFileToken with Double = js.native
  
  @js.native
  sealed trait EnumDeclaration extends SyntaxKind
  /* 255 */ val EnumDeclaration: typings.typescript.mod.SyntaxKind.EnumDeclaration with Double = js.native
  
  @js.native
  sealed trait EnumKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 91 */ val EnumKeyword: typings.typescript.mod.SyntaxKind.EnumKeyword with Double = js.native
  
  @js.native
  sealed trait EnumMember extends SyntaxKind
  /* 291 */ val EnumMember: typings.typescript.mod.SyntaxKind.EnumMember with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 36 */ val EqualsEqualsEqualsToken: typings.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 34 */ val EqualsEqualsToken: typings.typescript.mod.SyntaxKind.EqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait EqualsGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 38 */ val EqualsGreaterThanToken: typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends AssignmentOperator
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 62 */ val EqualsToken: typings.typescript.mod.SyntaxKind.EqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 37 */ val ExclamationEqualsEqualsToken: typings.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 35 */ val ExclamationEqualsToken: typings.typescript.mod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  
  @js.native
  sealed trait ExclamationToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PrefixUnaryOperator
  /* 53 */ val ExclamationToken: typings.typescript.mod.SyntaxKind.ExclamationToken with Double = js.native
  
  @js.native
  sealed trait ExportAssignment extends SyntaxKind
  /* 266 */ val ExportAssignment: typings.typescript.mod.SyntaxKind.ExportAssignment with Double = js.native
  
  @js.native
  sealed trait ExportDeclaration extends SyntaxKind
  /* 267 */ val ExportDeclaration: typings.typescript.mod.SyntaxKind.ExportDeclaration with Double = js.native
  
  @js.native
  sealed trait ExportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 92 */ val ExportKeyword: typings.typescript.mod.SyntaxKind.ExportKeyword with Double = js.native
  
  @js.native
  sealed trait ExportSpecifier extends SyntaxKind
  /* 270 */ val ExportSpecifier: typings.typescript.mod.SyntaxKind.ExportSpecifier with Double = js.native
  
  @js.native
  sealed trait ExpressionStatement extends SyntaxKind
  /* 233 */ val ExpressionStatement: typings.typescript.mod.SyntaxKind.ExpressionStatement with Double = js.native
  
  @js.native
  sealed trait ExpressionWithTypeArguments extends SyntaxKind
  /* 223 */ val ExpressionWithTypeArguments: typings.typescript.mod.SyntaxKind.ExpressionWithTypeArguments with Double = js.native
  
  @js.native
  sealed trait ExtendsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 93 */ val ExtendsKeyword: typings.typescript.mod.SyntaxKind.ExtendsKeyword with Double = js.native
  
  @js.native
  sealed trait ExternalModuleReference extends SyntaxKind
  /* 272 */ val ExternalModuleReference: typings.typescript.mod.SyntaxKind.ExternalModuleReference with Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 94 */ val FalseKeyword: typings.typescript.mod.SyntaxKind.FalseKeyword with Double = js.native
  
  @js.native
  sealed trait FinallyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 95 */ val FinallyKeyword: typings.typescript.mod.SyntaxKind.FinallyKeyword with Double = js.native
  
  @js.native
  sealed trait FirstAssignment extends SyntaxKind
  /* 62 */ val FirstAssignment: typings.typescript.mod.SyntaxKind.FirstAssignment with Double = js.native
  
  @js.native
  sealed trait FirstBinaryOperator extends SyntaxKind
  /* 29 */ val FirstBinaryOperator: typings.typescript.mod.SyntaxKind.FirstBinaryOperator with Double = js.native
  
  @js.native
  sealed trait FirstCompoundAssignment extends SyntaxKind
  /* 63 */ val FirstCompoundAssignment: typings.typescript.mod.SyntaxKind.FirstCompoundAssignment with Double = js.native
  
  @js.native
  sealed trait FirstFutureReservedWord extends SyntaxKind
  /* 116 */ val FirstFutureReservedWord: typings.typescript.mod.SyntaxKind.FirstFutureReservedWord with Double = js.native
  
  @js.native
  sealed trait FirstJSDocNode extends SyntaxKind
  /* 301 */ val FirstJSDocNode: typings.typescript.mod.SyntaxKind.FirstJSDocNode with Double = js.native
  
  @js.native
  sealed trait FirstJSDocTagNode extends SyntaxKind
  /* 314 */ val FirstJSDocTagNode: typings.typescript.mod.SyntaxKind.FirstJSDocTagNode with Double = js.native
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 80 */ val FirstKeyword: typings.typescript.mod.SyntaxKind.FirstKeyword with Double = js.native
  
  @js.native
  sealed trait FirstLiteralToken extends SyntaxKind
  /* 8 */ val FirstLiteralToken: typings.typescript.mod.SyntaxKind.FirstLiteralToken with Double = js.native
  
  @js.native
  sealed trait FirstNode extends SyntaxKind
  /* 157 */ val FirstNode: typings.typescript.mod.SyntaxKind.FirstNode with Double = js.native
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 18 */ val FirstPunctuation: typings.typescript.mod.SyntaxKind.FirstPunctuation with Double = js.native
  
  @js.native
  sealed trait FirstReservedWord extends SyntaxKind
  /* 80 */ val FirstReservedWord: typings.typescript.mod.SyntaxKind.FirstReservedWord with Double = js.native
  
  @js.native
  sealed trait FirstStatement extends SyntaxKind
  /* 232 */ val FirstStatement: typings.typescript.mod.SyntaxKind.FirstStatement with Double = js.native
  
  @js.native
  sealed trait FirstTemplateToken extends SyntaxKind
  /* 14 */ val FirstTemplateToken: typings.typescript.mod.SyntaxKind.FirstTemplateToken with Double = js.native
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 0 */ val FirstToken: typings.typescript.mod.SyntaxKind.FirstToken with Double = js.native
  
  @js.native
  sealed trait FirstTriviaToken extends SyntaxKind
  /* 2 */ val FirstTriviaToken: typings.typescript.mod.SyntaxKind.FirstTriviaToken with Double = js.native
  
  @js.native
  sealed trait FirstTypeNode extends SyntaxKind
  /* 172 */ val FirstTypeNode: typings.typescript.mod.SyntaxKind.FirstTypeNode with Double = js.native
  
  @js.native
  sealed trait ForInStatement extends SyntaxKind
  /* 238 */ val ForInStatement: typings.typescript.mod.SyntaxKind.ForInStatement with Double = js.native
  
  @js.native
  sealed trait ForKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 96 */ val ForKeyword: typings.typescript.mod.SyntaxKind.ForKeyword with Double = js.native
  
  @js.native
  sealed trait ForOfStatement extends SyntaxKind
  /* 239 */ val ForOfStatement: typings.typescript.mod.SyntaxKind.ForOfStatement with Double = js.native
  
  @js.native
  sealed trait ForStatement extends SyntaxKind
  /* 237 */ val ForStatement: typings.typescript.mod.SyntaxKind.ForStatement with Double = js.native
  
  @js.native
  sealed trait FromKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 153 */ val FromKeyword: typings.typescript.mod.SyntaxKind.FromKeyword with Double = js.native
  
  @js.native
  sealed trait FunctionDeclaration extends SyntaxKind
  /* 251 */ val FunctionDeclaration: typings.typescript.mod.SyntaxKind.FunctionDeclaration with Double = js.native
  
  @js.native
  sealed trait FunctionExpression extends SyntaxKind
  /* 208 */ val FunctionExpression: typings.typescript.mod.SyntaxKind.FunctionExpression with Double = js.native
  
  @js.native
  sealed trait FunctionKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 97 */ val FunctionKeyword: typings.typescript.mod.SyntaxKind.FunctionKeyword with Double = js.native
  
  @js.native
  sealed trait FunctionType extends SyntaxKind
  /* 174 */ val FunctionType: typings.typescript.mod.SyntaxKind.FunctionType with Double = js.native
  
  @js.native
  sealed trait GetAccessor extends SyntaxKind
  /* 167 */ val GetAccessor: typings.typescript.mod.SyntaxKind.GetAccessor with Double = js.native
  
  @js.native
  sealed trait GetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 134 */ val GetKeyword: typings.typescript.mod.SyntaxKind.GetKeyword with Double = js.native
  
  @js.native
  sealed trait GlobalKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 154 */ val GlobalKeyword: typings.typescript.mod.SyntaxKind.GlobalKeyword with Double = js.native
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 33 */ val GreaterThanEqualsToken: typings.typescript.mod.SyntaxKind.GreaterThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 70 */ val GreaterThanGreaterThanEqualsToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 71 */ val GreaterThanGreaterThanGreaterThanEqualsToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 49 */ val GreaterThanGreaterThanGreaterThanToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 48 */ val GreaterThanGreaterThanToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken with Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with RelationalOperator
  /* 31 */ val GreaterThanToken: typings.typescript.mod.SyntaxKind.GreaterThanToken with Double = js.native
  
  @js.native
  sealed trait HeritageClause extends SyntaxKind
  /* 286 */ val HeritageClause: typings.typescript.mod.SyntaxKind.HeritageClause with Double = js.native
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 78 */ val Identifier: typings.typescript.mod.SyntaxKind.Identifier with Double = js.native
  
  @js.native
  sealed trait IfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 98 */ val IfKeyword: typings.typescript.mod.SyntaxKind.IfKeyword with Double = js.native
  
  @js.native
  sealed trait IfStatement extends SyntaxKind
  /* 234 */ val IfStatement: typings.typescript.mod.SyntaxKind.IfStatement with Double = js.native
  
  @js.native
  sealed trait ImplementsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 116 */ val ImplementsKeyword: typings.typescript.mod.SyntaxKind.ImplementsKeyword with Double = js.native
  
  @js.native
  sealed trait ImportClause extends SyntaxKind
  /* 262 */ val ImportClause: typings.typescript.mod.SyntaxKind.ImportClause with Double = js.native
  
  @js.native
  sealed trait ImportDeclaration extends SyntaxKind
  /* 261 */ val ImportDeclaration: typings.typescript.mod.SyntaxKind.ImportDeclaration with Double = js.native
  
  @js.native
  sealed trait ImportEqualsDeclaration extends SyntaxKind
  /* 260 */ val ImportEqualsDeclaration: typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration with Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 99 */ val ImportKeyword: typings.typescript.mod.SyntaxKind.ImportKeyword with Double = js.native
  
  @js.native
  sealed trait ImportSpecifier extends SyntaxKind
  /* 265 */ val ImportSpecifier: typings.typescript.mod.SyntaxKind.ImportSpecifier with Double = js.native
  
  @js.native
  sealed trait ImportType extends SyntaxKind
  /* 195 */ val ImportType: typings.typescript.mod.SyntaxKind.ImportType with Double = js.native
  
  @js.native
  sealed trait InKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 100 */ val InKeyword: typings.typescript.mod.SyntaxKind.InKeyword with Double = js.native
  
  @js.native
  sealed trait IndexSignature extends SyntaxKind
  /* 171 */ val IndexSignature: typings.typescript.mod.SyntaxKind.IndexSignature with Double = js.native
  
  @js.native
  sealed trait IndexedAccessType extends SyntaxKind
  /* 189 */ val IndexedAccessType: typings.typescript.mod.SyntaxKind.IndexedAccessType with Double = js.native
  
  @js.native
  sealed trait InferKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 135 */ val InferKeyword: typings.typescript.mod.SyntaxKind.InferKeyword with Double = js.native
  
  @js.native
  sealed trait InferType extends SyntaxKind
  /* 185 */ val InferType: typings.typescript.mod.SyntaxKind.InferType with Double = js.native
  
  @js.native
  sealed trait InputFiles extends SyntaxKind
  /* 300 */ val InputFiles: typings.typescript.mod.SyntaxKind.InputFiles with Double = js.native
  
  @js.native
  sealed trait InstanceOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 101 */ val InstanceOfKeyword: typings.typescript.mod.SyntaxKind.InstanceOfKeyword with Double = js.native
  
  @js.native
  sealed trait InterfaceDeclaration extends SyntaxKind
  /* 253 */ val InterfaceDeclaration: typings.typescript.mod.SyntaxKind.InterfaceDeclaration with Double = js.native
  
  @js.native
  sealed trait InterfaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 117 */ val InterfaceKeyword: typings.typescript.mod.SyntaxKind.InterfaceKeyword with Double = js.native
  
  @js.native
  sealed trait IntersectionType extends SyntaxKind
  /* 183 */ val IntersectionType: typings.typescript.mod.SyntaxKind.IntersectionType with Double = js.native
  
  @js.native
  sealed trait IntrinsicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 136 */ val IntrinsicKeyword: typings.typescript.mod.SyntaxKind.IntrinsicKeyword with Double = js.native
  
  @js.native
  sealed trait IsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 137 */ val IsKeyword: typings.typescript.mod.SyntaxKind.IsKeyword with Double = js.native
  
  @js.native
  sealed trait JSDocAllType extends SyntaxKind
  /* 303 */ val JSDocAllType: typings.typescript.mod.SyntaxKind.JSDocAllType with Double = js.native
  
  @js.native
  sealed trait JSDocAugmentsTag extends SyntaxKind
  /* 315 */ val JSDocAugmentsTag: typings.typescript.mod.SyntaxKind.JSDocAugmentsTag with Double = js.native
  
  @js.native
  sealed trait JSDocAuthorTag extends SyntaxKind
  /* 317 */ val JSDocAuthorTag: typings.typescript.mod.SyntaxKind.JSDocAuthorTag with Double = js.native
  
  @js.native
  sealed trait JSDocCallbackTag extends SyntaxKind
  /* 324 */ val JSDocCallbackTag: typings.typescript.mod.SyntaxKind.JSDocCallbackTag with Double = js.native
  
  @js.native
  sealed trait JSDocClassTag extends SyntaxKind
  /* 319 */ val JSDocClassTag: typings.typescript.mod.SyntaxKind.JSDocClassTag with Double = js.native
  
  @js.native
  sealed trait JSDocComment extends SyntaxKind
  /* 311 */ val JSDocComment: typings.typescript.mod.SyntaxKind.JSDocComment with Double = js.native
  
  @js.native
  sealed trait JSDocDeprecatedTag extends SyntaxKind
  /* 318 */ val JSDocDeprecatedTag: typings.typescript.mod.SyntaxKind.JSDocDeprecatedTag with Double = js.native
  
  @js.native
  sealed trait JSDocEnumTag extends SyntaxKind
  /* 325 */ val JSDocEnumTag: typings.typescript.mod.SyntaxKind.JSDocEnumTag with Double = js.native
  
  @js.native
  sealed trait JSDocFunctionType extends SyntaxKind
  /* 308 */ val JSDocFunctionType: typings.typescript.mod.SyntaxKind.JSDocFunctionType with Double = js.native
  
  @js.native
  sealed trait JSDocImplementsTag extends SyntaxKind
  /* 316 */ val JSDocImplementsTag: typings.typescript.mod.SyntaxKind.JSDocImplementsTag with Double = js.native
  
  @js.native
  sealed trait JSDocNameReference extends SyntaxKind
  /* 302 */ val JSDocNameReference: typings.typescript.mod.SyntaxKind.JSDocNameReference with Double = js.native
  
  @js.native
  sealed trait JSDocNamepathType extends SyntaxKind
  /* 310 */ val JSDocNamepathType: typings.typescript.mod.SyntaxKind.JSDocNamepathType with Double = js.native
  
  @js.native
  sealed trait JSDocNonNullableType extends SyntaxKind
  /* 306 */ val JSDocNonNullableType: typings.typescript.mod.SyntaxKind.JSDocNonNullableType with Double = js.native
  
  @js.native
  sealed trait JSDocNullableType extends SyntaxKind
  /* 305 */ val JSDocNullableType: typings.typescript.mod.SyntaxKind.JSDocNullableType with Double = js.native
  
  @js.native
  sealed trait JSDocOptionalType extends SyntaxKind
  /* 307 */ val JSDocOptionalType: typings.typescript.mod.SyntaxKind.JSDocOptionalType with Double = js.native
  
  @js.native
  sealed trait JSDocParameterTag extends SyntaxKind
  /* 326 */ val JSDocParameterTag: typings.typescript.mod.SyntaxKind.JSDocParameterTag with Double = js.native
  
  @js.native
  sealed trait JSDocPrivateTag extends SyntaxKind
  /* 321 */ val JSDocPrivateTag: typings.typescript.mod.SyntaxKind.JSDocPrivateTag with Double = js.native
  
  @js.native
  sealed trait JSDocPropertyTag extends SyntaxKind
  /* 333 */ val JSDocPropertyTag: typings.typescript.mod.SyntaxKind.JSDocPropertyTag with Double = js.native
  
  @js.native
  sealed trait JSDocProtectedTag extends SyntaxKind
  /* 322 */ val JSDocProtectedTag: typings.typescript.mod.SyntaxKind.JSDocProtectedTag with Double = js.native
  
  @js.native
  sealed trait JSDocPublicTag extends SyntaxKind
  /* 320 */ val JSDocPublicTag: typings.typescript.mod.SyntaxKind.JSDocPublicTag with Double = js.native
  
  @js.native
  sealed trait JSDocReadonlyTag extends SyntaxKind
  /* 323 */ val JSDocReadonlyTag: typings.typescript.mod.SyntaxKind.JSDocReadonlyTag with Double = js.native
  
  @js.native
  sealed trait JSDocReturnTag extends SyntaxKind
  /* 327 */ val JSDocReturnTag: typings.typescript.mod.SyntaxKind.JSDocReturnTag with Double = js.native
  
  @js.native
  sealed trait JSDocSeeTag extends SyntaxKind
  /* 332 */ val JSDocSeeTag: typings.typescript.mod.SyntaxKind.JSDocSeeTag with Double = js.native
  
  @js.native
  sealed trait JSDocSignature extends SyntaxKind
  /* 313 */ val JSDocSignature: typings.typescript.mod.SyntaxKind.JSDocSignature with Double = js.native
  
  @js.native
  sealed trait JSDocTag extends SyntaxKind
  /* 314 */ val JSDocTag: typings.typescript.mod.SyntaxKind.JSDocTag with Double = js.native
  
  @js.native
  sealed trait JSDocTemplateTag extends SyntaxKind
  /* 330 */ val JSDocTemplateTag: typings.typescript.mod.SyntaxKind.JSDocTemplateTag with Double = js.native
  
  @js.native
  sealed trait JSDocThisTag extends SyntaxKind
  /* 328 */ val JSDocThisTag: typings.typescript.mod.SyntaxKind.JSDocThisTag with Double = js.native
  
  @js.native
  sealed trait JSDocTypeExpression extends SyntaxKind
  /* 301 */ val JSDocTypeExpression: typings.typescript.mod.SyntaxKind.JSDocTypeExpression with Double = js.native
  
  @js.native
  sealed trait JSDocTypeLiteral extends SyntaxKind
  /* 312 */ val JSDocTypeLiteral: typings.typescript.mod.SyntaxKind.JSDocTypeLiteral with Double = js.native
  
  @js.native
  sealed trait JSDocTypeTag extends SyntaxKind
  /* 329 */ val JSDocTypeTag: typings.typescript.mod.SyntaxKind.JSDocTypeTag with Double = js.native
  
  @js.native
  sealed trait JSDocTypedefTag extends SyntaxKind
  /* 331 */ val JSDocTypedefTag: typings.typescript.mod.SyntaxKind.JSDocTypedefTag with Double = js.native
  
  @js.native
  sealed trait JSDocUnknownType extends SyntaxKind
  /* 304 */ val JSDocUnknownType: typings.typescript.mod.SyntaxKind.JSDocUnknownType with Double = js.native
  
  @js.native
  sealed trait JSDocVariadicType extends SyntaxKind
  /* 309 */ val JSDocVariadicType: typings.typescript.mod.SyntaxKind.JSDocVariadicType with Double = js.native
  
  @js.native
  sealed trait JsxAttribute extends SyntaxKind
  /* 280 */ val JsxAttribute: typings.typescript.mod.SyntaxKind.JsxAttribute with Double = js.native
  
  @js.native
  sealed trait JsxAttributes extends SyntaxKind
  /* 281 */ val JsxAttributes: typings.typescript.mod.SyntaxKind.JsxAttributes with Double = js.native
  
  @js.native
  sealed trait JsxClosingElement extends SyntaxKind
  /* 276 */ val JsxClosingElement: typings.typescript.mod.SyntaxKind.JsxClosingElement with Double = js.native
  
  @js.native
  sealed trait JsxClosingFragment extends SyntaxKind
  /* 279 */ val JsxClosingFragment: typings.typescript.mod.SyntaxKind.JsxClosingFragment with Double = js.native
  
  @js.native
  sealed trait JsxElement extends SyntaxKind
  /* 273 */ val JsxElement: typings.typescript.mod.SyntaxKind.JsxElement with Double = js.native
  
  @js.native
  sealed trait JsxExpression extends SyntaxKind
  /* 283 */ val JsxExpression: typings.typescript.mod.SyntaxKind.JsxExpression with Double = js.native
  
  @js.native
  sealed trait JsxFragment extends SyntaxKind
  /* 277 */ val JsxFragment: typings.typescript.mod.SyntaxKind.JsxFragment with Double = js.native
  
  @js.native
  sealed trait JsxOpeningElement extends SyntaxKind
  /* 275 */ val JsxOpeningElement: typings.typescript.mod.SyntaxKind.JsxOpeningElement with Double = js.native
  
  @js.native
  sealed trait JsxOpeningFragment extends SyntaxKind
  /* 278 */ val JsxOpeningFragment: typings.typescript.mod.SyntaxKind.JsxOpeningFragment with Double = js.native
  
  @js.native
  sealed trait JsxSelfClosingElement extends SyntaxKind
  /* 274 */ val JsxSelfClosingElement: typings.typescript.mod.SyntaxKind.JsxSelfClosingElement with Double = js.native
  
  @js.native
  sealed trait JsxSpreadAttribute extends SyntaxKind
  /* 282 */ val JsxSpreadAttribute: typings.typescript.mod.SyntaxKind.JsxSpreadAttribute with Double = js.native
  
  @js.native
  sealed trait JsxText
    extends LiteralSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 11 */ val JsxText: typings.typescript.mod.SyntaxKind.JsxText with Double = js.native
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends LiteralSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 12 */ val JsxTextAllWhiteSpaces: typings.typescript.mod.SyntaxKind.JsxTextAllWhiteSpaces with Double = js.native
  
  @js.native
  sealed trait KeyOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 138 */ val KeyOfKeyword: typings.typescript.mod.SyntaxKind.KeyOfKeyword with Double = js.native
  
  @js.native
  sealed trait LabeledStatement extends SyntaxKind
  /* 245 */ val LabeledStatement: typings.typescript.mod.SyntaxKind.LabeledStatement with Double = js.native
  
  @js.native
  sealed trait LastAssignment extends SyntaxKind
  /* 77 */ val LastAssignment: typings.typescript.mod.SyntaxKind.LastAssignment with Double = js.native
  
  @js.native
  sealed trait LastBinaryOperator extends SyntaxKind
  /* 77 */ val LastBinaryOperator: typings.typescript.mod.SyntaxKind.LastBinaryOperator with Double = js.native
  
  @js.native
  sealed trait LastCompoundAssignment extends SyntaxKind
  /* 77 */ val LastCompoundAssignment: typings.typescript.mod.SyntaxKind.LastCompoundAssignment with Double = js.native
  
  @js.native
  sealed trait LastFutureReservedWord extends SyntaxKind
  /* 124 */ val LastFutureReservedWord: typings.typescript.mod.SyntaxKind.LastFutureReservedWord with Double = js.native
  
  @js.native
  sealed trait LastJSDocNode extends SyntaxKind
  /* 333 */ val LastJSDocNode: typings.typescript.mod.SyntaxKind.LastJSDocNode with Double = js.native
  
  @js.native
  sealed trait LastJSDocTagNode extends SyntaxKind
  /* 333 */ val LastJSDocTagNode: typings.typescript.mod.SyntaxKind.LastJSDocTagNode with Double = js.native
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 156 */ val LastKeyword: typings.typescript.mod.SyntaxKind.LastKeyword with Double = js.native
  
  @js.native
  sealed trait LastLiteralToken extends SyntaxKind
  /* 14 */ val LastLiteralToken: typings.typescript.mod.SyntaxKind.LastLiteralToken with Double = js.native
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 77 */ val LastPunctuation: typings.typescript.mod.SyntaxKind.LastPunctuation with Double = js.native
  
  @js.native
  sealed trait LastReservedWord extends SyntaxKind
  /* 115 */ val LastReservedWord: typings.typescript.mod.SyntaxKind.LastReservedWord with Double = js.native
  
  @js.native
  sealed trait LastStatement extends SyntaxKind
  /* 248 */ val LastStatement: typings.typescript.mod.SyntaxKind.LastStatement with Double = js.native
  
  @js.native
  sealed trait LastTemplateToken extends SyntaxKind
  /* 17 */ val LastTemplateToken: typings.typescript.mod.SyntaxKind.LastTemplateToken with Double = js.native
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 156 */ val LastToken: typings.typescript.mod.SyntaxKind.LastToken with Double = js.native
  
  @js.native
  sealed trait LastTriviaToken extends SyntaxKind
  /* 7 */ val LastTriviaToken: typings.typescript.mod.SyntaxKind.LastTriviaToken with Double = js.native
  
  @js.native
  sealed trait LastTypeNode extends SyntaxKind
  /* 195 */ val LastTypeNode: typings.typescript.mod.SyntaxKind.LastTypeNode with Double = js.native
  
  @js.native
  sealed trait LessThanEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 32 */ val LessThanEqualsToken: typings.typescript.mod.SyntaxKind.LessThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 69 */ val LessThanLessThanEqualsToken: typings.typescript.mod.SyntaxKind.LessThanLessThanEqualsToken with Double = js.native
  
  @js.native
  sealed trait LessThanLessThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 47 */ val LessThanLessThanToken: typings.typescript.mod.SyntaxKind.LessThanLessThanToken with Double = js.native
  
  @js.native
  sealed trait LessThanSlashToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 30 */ val LessThanSlashToken: typings.typescript.mod.SyntaxKind.LessThanSlashToken with Double = js.native
  
  @js.native
  sealed trait LessThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with RelationalOperator
  /* 29 */ val LessThanToken: typings.typescript.mod.SyntaxKind.LessThanToken with Double = js.native
  
  @js.native
  sealed trait LetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 118 */ val LetKeyword: typings.typescript.mod.SyntaxKind.LetKeyword with Double = js.native
  
  @js.native
  sealed trait LiteralType extends SyntaxKind
  /* 191 */ val LiteralType: typings.typescript.mod.SyntaxKind.LiteralType with Double = js.native
  
  @js.native
  sealed trait MappedType extends SyntaxKind
  /* 190 */ val MappedType: typings.typescript.mod.SyntaxKind.MappedType with Double = js.native
  
  @js.native
  sealed trait MergeDeclarationMarker extends SyntaxKind
  /* 338 */ val MergeDeclarationMarker: typings.typescript.mod.SyntaxKind.MergeDeclarationMarker with Double = js.native
  
  @js.native
  sealed trait MetaProperty extends SyntaxKind
  /* 226 */ val MetaProperty: typings.typescript.mod.SyntaxKind.MetaProperty with Double = js.native
  
  @js.native
  sealed trait MethodDeclaration extends SyntaxKind
  /* 165 */ val MethodDeclaration: typings.typescript.mod.SyntaxKind.MethodDeclaration with Double = js.native
  
  @js.native
  sealed trait MethodSignature extends SyntaxKind
  /* 164 */ val MethodSignature: typings.typescript.mod.SyntaxKind.MethodSignature with Double = js.native
  
  @js.native
  sealed trait MinusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 64 */ val MinusEqualsToken: typings.typescript.mod.SyntaxKind.MinusEqualsToken with Double = js.native
  
  @js.native
  sealed trait MinusMinusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  /* 46 */ val MinusMinusToken: typings.typescript.mod.SyntaxKind.MinusMinusToken with Double = js.native
  
  @js.native
  sealed trait MinusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  /* 40 */ val MinusToken: typings.typescript.mod.SyntaxKind.MinusToken with Double = js.native
  
  @js.native
  sealed trait MissingDeclaration extends SyntaxKind
  /* 271 */ val MissingDeclaration: typings.typescript.mod.SyntaxKind.MissingDeclaration with Double = js.native
  
  @js.native
  sealed trait ModuleBlock extends SyntaxKind
  /* 257 */ val ModuleBlock: typings.typescript.mod.SyntaxKind.ModuleBlock with Double = js.native
  
  @js.native
  sealed trait ModuleDeclaration extends SyntaxKind
  /* 256 */ val ModuleDeclaration: typings.typescript.mod.SyntaxKind.ModuleDeclaration with Double = js.native
  
  @js.native
  sealed trait ModuleKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 139 */ val ModuleKeyword: typings.typescript.mod.SyntaxKind.ModuleKeyword with Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with CommentKind
  /* 3 */ val MultiLineCommentTrivia: typings.typescript.mod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait NamedExports extends SyntaxKind
  /* 268 */ val NamedExports: typings.typescript.mod.SyntaxKind.NamedExports with Double = js.native
  
  @js.native
  sealed trait NamedImports extends SyntaxKind
  /* 264 */ val NamedImports: typings.typescript.mod.SyntaxKind.NamedImports with Double = js.native
  
  @js.native
  sealed trait NamedTupleMember extends SyntaxKind
  /* 192 */ val NamedTupleMember: typings.typescript.mod.SyntaxKind.NamedTupleMember with Double = js.native
  
  @js.native
  sealed trait NamespaceExport extends SyntaxKind
  /* 269 */ val NamespaceExport: typings.typescript.mod.SyntaxKind.NamespaceExport with Double = js.native
  
  @js.native
  sealed trait NamespaceExportDeclaration extends SyntaxKind
  /* 259 */ val NamespaceExportDeclaration: typings.typescript.mod.SyntaxKind.NamespaceExportDeclaration with Double = js.native
  
  @js.native
  sealed trait NamespaceImport extends SyntaxKind
  /* 263 */ val NamespaceImport: typings.typescript.mod.SyntaxKind.NamespaceImport with Double = js.native
  
  @js.native
  sealed trait NamespaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 140 */ val NamespaceKeyword: typings.typescript.mod.SyntaxKind.NamespaceKeyword with Double = js.native
  
  @js.native
  sealed trait NeverKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 141 */ val NeverKeyword: typings.typescript.mod.SyntaxKind.NeverKeyword with Double = js.native
  
  @js.native
  sealed trait NewExpression extends SyntaxKind
  /* 204 */ val NewExpression: typings.typescript.mod.SyntaxKind.NewExpression with Double = js.native
  
  @js.native
  sealed trait NewKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 102 */ val NewKeyword: typings.typescript.mod.SyntaxKind.NewKeyword with Double = js.native
  
  @js.native
  sealed trait NewLineTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 4 */ val NewLineTrivia: typings.typescript.mod.SyntaxKind.NewLineTrivia with Double = js.native
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 14 */ val NoSubstitutionTemplateLiteral: typings.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral with Double = js.native
  
  @js.native
  sealed trait NonNullExpression extends SyntaxKind
  /* 225 */ val NonNullExpression: typings.typescript.mod.SyntaxKind.NonNullExpression with Double = js.native
  
  @js.native
  sealed trait NotEmittedStatement extends SyntaxKind
  /* 335 */ val NotEmittedStatement: typings.typescript.mod.SyntaxKind.NotEmittedStatement with Double = js.native
  
  @js.native
  sealed trait NullKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 103 */ val NullKeyword: typings.typescript.mod.SyntaxKind.NullKeyword with Double = js.native
  
  @js.native
  sealed trait NumberKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 144 */ val NumberKeyword: typings.typescript.mod.SyntaxKind.NumberKeyword with Double = js.native
  
  @js.native
  sealed trait NumericLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 8 */ val NumericLiteral: typings.typescript.mod.SyntaxKind.NumericLiteral with Double = js.native
  
  @js.native
  sealed trait ObjectBindingPattern extends SyntaxKind
  /* 196 */ val ObjectBindingPattern: typings.typescript.mod.SyntaxKind.ObjectBindingPattern with Double = js.native
  
  @js.native
  sealed trait ObjectKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 145 */ val ObjectKeyword: typings.typescript.mod.SyntaxKind.ObjectKeyword with Double = js.native
  
  @js.native
  sealed trait ObjectLiteralExpression extends SyntaxKind
  /* 200 */ val ObjectLiteralExpression: typings.typescript.mod.SyntaxKind.ObjectLiteralExpression with Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 156 */ val OfKeyword: typings.typescript.mod.SyntaxKind.OfKeyword with Double = js.native
  
  @js.native
  sealed trait OmittedExpression extends SyntaxKind
  /* 222 */ val OmittedExpression: typings.typescript.mod.SyntaxKind.OmittedExpression with Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  /* 18 */ val OpenBraceToken: typings.typescript.mod.SyntaxKind.OpenBraceToken with Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 22 */ val OpenBracketToken: typings.typescript.mod.SyntaxKind.OpenBracketToken with Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 20 */ val OpenParenToken: typings.typescript.mod.SyntaxKind.OpenParenToken with Double = js.native
  
  @js.native
  sealed trait OptionalType extends SyntaxKind
  /* 180 */ val OptionalType: typings.typescript.mod.SyntaxKind.OptionalType with Double = js.native
  
  @js.native
  sealed trait PackageKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 119 */ val PackageKeyword: typings.typescript.mod.SyntaxKind.PackageKeyword with Double = js.native
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 160 */ val Parameter: typings.typescript.mod.SyntaxKind.Parameter with Double = js.native
  
  @js.native
  sealed trait ParenthesizedExpression extends SyntaxKind
  /* 207 */ val ParenthesizedExpression: typings.typescript.mod.SyntaxKind.ParenthesizedExpression with Double = js.native
  
  @js.native
  sealed trait ParenthesizedType extends SyntaxKind
  /* 186 */ val ParenthesizedType: typings.typescript.mod.SyntaxKind.ParenthesizedType with Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpression extends SyntaxKind
  /* 336 */ val PartiallyEmittedExpression: typings.typescript.mod.SyntaxKind.PartiallyEmittedExpression with Double = js.native
  
  @js.native
  sealed trait PercentEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 68 */ val PercentEqualsToken: typings.typescript.mod.SyntaxKind.PercentEqualsToken with Double = js.native
  
  @js.native
  sealed trait PercentToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with MultiplicativeOperator
  /* 44 */ val PercentToken: typings.typescript.mod.SyntaxKind.PercentToken with Double = js.native
  
  @js.native
  sealed trait PlusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 63 */ val PlusEqualsToken: typings.typescript.mod.SyntaxKind.PlusEqualsToken with Double = js.native
  
  @js.native
  sealed trait PlusPlusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  /* 45 */ val PlusPlusToken: typings.typescript.mod.SyntaxKind.PlusPlusToken with Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  /* 39 */ val PlusToken: typings.typescript.mod.SyntaxKind.PlusToken with Double = js.native
  
  @js.native
  sealed trait PostfixUnaryExpression extends SyntaxKind
  /* 215 */ val PostfixUnaryExpression: typings.typescript.mod.SyntaxKind.PostfixUnaryExpression with Double = js.native
  
  @js.native
  sealed trait PrefixUnaryExpression extends SyntaxKind
  /* 214 */ val PrefixUnaryExpression: typings.typescript.mod.SyntaxKind.PrefixUnaryExpression with Double = js.native
  
  @js.native
  sealed trait PrivateIdentifier extends SyntaxKind
  /* 79 */ val PrivateIdentifier: typings.typescript.mod.SyntaxKind.PrivateIdentifier with Double = js.native
  
  @js.native
  sealed trait PrivateKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 120 */ val PrivateKeyword: typings.typescript.mod.SyntaxKind.PrivateKeyword with Double = js.native
  
  @js.native
  sealed trait PropertyAccessExpression extends SyntaxKind
  /* 201 */ val PropertyAccessExpression: typings.typescript.mod.SyntaxKind.PropertyAccessExpression with Double = js.native
  
  @js.native
  sealed trait PropertyAssignment extends SyntaxKind
  /* 288 */ val PropertyAssignment: typings.typescript.mod.SyntaxKind.PropertyAssignment with Double = js.native
  
  @js.native
  sealed trait PropertyDeclaration extends SyntaxKind
  /* 163 */ val PropertyDeclaration: typings.typescript.mod.SyntaxKind.PropertyDeclaration with Double = js.native
  
  @js.native
  sealed trait PropertySignature extends SyntaxKind
  /* 162 */ val PropertySignature: typings.typescript.mod.SyntaxKind.PropertySignature with Double = js.native
  
  @js.native
  sealed trait ProtectedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 121 */ val ProtectedKeyword: typings.typescript.mod.SyntaxKind.ProtectedKeyword with Double = js.native
  
  @js.native
  sealed trait PublicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 122 */ val PublicKeyword: typings.typescript.mod.SyntaxKind.PublicKeyword with Double = js.native
  
  @js.native
  sealed trait QualifiedName extends SyntaxKind
  /* 157 */ val QualifiedName: typings.typescript.mod.SyntaxKind.QualifiedName with Double = js.native
  
  @js.native
  sealed trait QuestionDotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 28 */ val QuestionDotToken: typings.typescript.mod.SyntaxKind.QuestionDotToken with Double = js.native
  
  @js.native
  sealed trait QuestionQuestionEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 76 */ val QuestionQuestionEqualsToken: typings.typescript.mod.SyntaxKind.QuestionQuestionEqualsToken with Double = js.native
  
  @js.native
  sealed trait QuestionQuestionToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with _AssignmentOperatorOrHigher
  /* 60 */ val QuestionQuestionToken: typings.typescript.mod.SyntaxKind.QuestionQuestionToken with Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 57 */ val QuestionToken: typings.typescript.mod.SyntaxKind.QuestionToken with Double = js.native
  
  @js.native
  sealed trait ReadonlyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 142 */ val ReadonlyKeyword: typings.typescript.mod.SyntaxKind.ReadonlyKeyword with Double = js.native
  
  @js.native
  sealed trait RegularExpressionLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 13 */ val RegularExpressionLiteral: typings.typescript.mod.SyntaxKind.RegularExpressionLiteral with Double = js.native
  
  @js.native
  sealed trait RequireKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 143 */ val RequireKeyword: typings.typescript.mod.SyntaxKind.RequireKeyword with Double = js.native
  
  @js.native
  sealed trait RestType extends SyntaxKind
  /* 181 */ val RestType: typings.typescript.mod.SyntaxKind.RestType with Double = js.native
  
  @js.native
  sealed trait ReturnKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 104 */ val ReturnKeyword: typings.typescript.mod.SyntaxKind.ReturnKeyword with Double = js.native
  
  @js.native
  sealed trait ReturnStatement extends SyntaxKind
  /* 242 */ val ReturnStatement: typings.typescript.mod.SyntaxKind.ReturnStatement with Double = js.native
  
  @js.native
  sealed trait SemicolonClassElement extends SyntaxKind
  /* 229 */ val SemicolonClassElement: typings.typescript.mod.SyntaxKind.SemicolonClassElement with Double = js.native
  
  @js.native
  sealed trait SemicolonToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 26 */ val SemicolonToken: typings.typescript.mod.SyntaxKind.SemicolonToken with Double = js.native
  
  @js.native
  sealed trait SetAccessor extends SyntaxKind
  /* 168 */ val SetAccessor: typings.typescript.mod.SyntaxKind.SetAccessor with Double = js.native
  
  @js.native
  sealed trait SetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 146 */ val SetKeyword: typings.typescript.mod.SyntaxKind.SetKeyword with Double = js.native
  
  @js.native
  sealed trait ShebangTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
  /* 6 */ val ShebangTrivia: typings.typescript.mod.SyntaxKind.ShebangTrivia with Double = js.native
  
  @js.native
  sealed trait ShorthandPropertyAssignment extends SyntaxKind
  /* 289 */ val ShorthandPropertyAssignment: typings.typescript.mod.SyntaxKind.ShorthandPropertyAssignment with Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with CommentKind
  /* 2 */ val SingleLineCommentTrivia: typings.typescript.mod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait SlashEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 67 */ val SlashEqualsToken: typings.typescript.mod.SyntaxKind.SlashEqualsToken with Double = js.native
  
  @js.native
  sealed trait SlashToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with MultiplicativeOperator
  /* 43 */ val SlashToken: typings.typescript.mod.SyntaxKind.SlashToken with Double = js.native
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 297 */ val SourceFile: typings.typescript.mod.SyntaxKind.SourceFile with Double = js.native
  
  @js.native
  sealed trait SpreadAssignment extends SyntaxKind
  /* 290 */ val SpreadAssignment: typings.typescript.mod.SyntaxKind.SpreadAssignment with Double = js.native
  
  @js.native
  sealed trait SpreadElement extends SyntaxKind
  /* 220 */ val SpreadElement: typings.typescript.mod.SyntaxKind.SpreadElement with Double = js.native
  
  @js.native
  sealed trait StaticKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 123 */ val StaticKeyword: typings.typescript.mod.SyntaxKind.StaticKeyword with Double = js.native
  
  @js.native
  sealed trait StringKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 147 */ val StringKeyword: typings.typescript.mod.SyntaxKind.StringKeyword with Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 10 */ val StringLiteral: typings.typescript.mod.SyntaxKind.StringLiteral with Double = js.native
  
  @js.native
  sealed trait SuperKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 105 */ val SuperKeyword: typings.typescript.mod.SyntaxKind.SuperKeyword with Double = js.native
  
  @js.native
  sealed trait SwitchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 106 */ val SwitchKeyword: typings.typescript.mod.SyntaxKind.SwitchKeyword with Double = js.native
  
  @js.native
  sealed trait SwitchStatement extends SyntaxKind
  /* 244 */ val SwitchStatement: typings.typescript.mod.SyntaxKind.SwitchStatement with Double = js.native
  
  @js.native
  sealed trait SymbolKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 148 */ val SymbolKeyword: typings.typescript.mod.SyntaxKind.SymbolKeyword with Double = js.native
  
  @js.native
  sealed trait SyntaxList extends SyntaxKind
  /* 334 */ val SyntaxList: typings.typescript.mod.SyntaxKind.SyntaxList with Double = js.native
  
  @js.native
  sealed trait SyntheticExpression extends SyntaxKind
  /* 227 */ val SyntheticExpression: typings.typescript.mod.SyntaxKind.SyntheticExpression with Double = js.native
  
  @js.native
  sealed trait SyntheticReferenceExpression extends SyntaxKind
  /* 340 */ val SyntheticReferenceExpression: typings.typescript.mod.SyntaxKind.SyntheticReferenceExpression with Double = js.native
  
  @js.native
  sealed trait TaggedTemplateExpression extends SyntaxKind
  /* 205 */ val TaggedTemplateExpression: typings.typescript.mod.SyntaxKind.TaggedTemplateExpression with Double = js.native
  
  @js.native
  sealed trait TemplateExpression extends SyntaxKind
  /* 218 */ val TemplateExpression: typings.typescript.mod.SyntaxKind.TemplateExpression with Double = js.native
  
  @js.native
  sealed trait TemplateHead
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 15 */ val TemplateHead: typings.typescript.mod.SyntaxKind.TemplateHead with Double = js.native
  
  @js.native
  sealed trait TemplateLiteralType extends SyntaxKind
  /* 193 */ val TemplateLiteralType: typings.typescript.mod.SyntaxKind.TemplateLiteralType with Double = js.native
  
  @js.native
  sealed trait TemplateLiteralTypeSpan extends SyntaxKind
  /* 194 */ val TemplateLiteralTypeSpan: typings.typescript.mod.SyntaxKind.TemplateLiteralTypeSpan with Double = js.native
  
  @js.native
  sealed trait TemplateMiddle
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 16 */ val TemplateMiddle: typings.typescript.mod.SyntaxKind.TemplateMiddle with Double = js.native
  
  @js.native
  sealed trait TemplateSpan extends SyntaxKind
  /* 228 */ val TemplateSpan: typings.typescript.mod.SyntaxKind.TemplateSpan with Double = js.native
  
  @js.native
  sealed trait TemplateTail
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 17 */ val TemplateTail: typings.typescript.mod.SyntaxKind.TemplateTail with Double = js.native
  
  @js.native
  sealed trait ThisKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 107 */ val ThisKeyword: typings.typescript.mod.SyntaxKind.ThisKeyword with Double = js.native
  
  @js.native
  sealed trait ThisType extends SyntaxKind
  /* 187 */ val ThisType: typings.typescript.mod.SyntaxKind.ThisType with Double = js.native
  
  @js.native
  sealed trait ThrowKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 108 */ val ThrowKeyword: typings.typescript.mod.SyntaxKind.ThrowKeyword with Double = js.native
  
  @js.native
  sealed trait ThrowStatement extends SyntaxKind
  /* 246 */ val ThrowStatement: typings.typescript.mod.SyntaxKind.ThrowStatement with Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PrefixUnaryOperator
  /* 54 */ val TildeToken: typings.typescript.mod.SyntaxKind.TildeToken with Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 109 */ val TrueKeyword: typings.typescript.mod.SyntaxKind.TrueKeyword with Double = js.native
  
  @js.native
  sealed trait TryKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 110 */ val TryKeyword: typings.typescript.mod.SyntaxKind.TryKeyword with Double = js.native
  
  @js.native
  sealed trait TryStatement extends SyntaxKind
  /* 247 */ val TryStatement: typings.typescript.mod.SyntaxKind.TryStatement with Double = js.native
  
  @js.native
  sealed trait TupleType extends SyntaxKind
  /* 179 */ val TupleType: typings.typescript.mod.SyntaxKind.TupleType with Double = js.native
  
  @js.native
  sealed trait TypeAliasDeclaration extends SyntaxKind
  /* 254 */ val TypeAliasDeclaration: typings.typescript.mod.SyntaxKind.TypeAliasDeclaration with Double = js.native
  
  @js.native
  sealed trait TypeAssertionExpression extends SyntaxKind
  /* 206 */ val TypeAssertionExpression: typings.typescript.mod.SyntaxKind.TypeAssertionExpression with Double = js.native
  
  @js.native
  sealed trait TypeKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 149 */ val TypeKeyword: typings.typescript.mod.SyntaxKind.TypeKeyword with Double = js.native
  
  @js.native
  sealed trait TypeLiteral extends SyntaxKind
  /* 177 */ val TypeLiteral: typings.typescript.mod.SyntaxKind.TypeLiteral with Double = js.native
  
  @js.native
  sealed trait TypeOfExpression extends SyntaxKind
  /* 211 */ val TypeOfExpression: typings.typescript.mod.SyntaxKind.TypeOfExpression with Double = js.native
  
  @js.native
  sealed trait TypeOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 111 */ val TypeOfKeyword: typings.typescript.mod.SyntaxKind.TypeOfKeyword with Double = js.native
  
  @js.native
  sealed trait TypeOperator extends SyntaxKind
  /* 188 */ val TypeOperator: typings.typescript.mod.SyntaxKind.TypeOperator with Double = js.native
  
  @js.native
  sealed trait TypeParameter extends SyntaxKind
  /* 159 */ val TypeParameter: typings.typescript.mod.SyntaxKind.TypeParameter with Double = js.native
  
  @js.native
  sealed trait TypePredicate extends SyntaxKind
  /* 172 */ val TypePredicate: typings.typescript.mod.SyntaxKind.TypePredicate with Double = js.native
  
  @js.native
  sealed trait TypeQuery extends SyntaxKind
  /* 176 */ val TypeQuery: typings.typescript.mod.SyntaxKind.TypeQuery with Double = js.native
  
  @js.native
  sealed trait TypeReference extends SyntaxKind
  /* 173 */ val TypeReference: typings.typescript.mod.SyntaxKind.TypeReference with Double = js.native
  
  @js.native
  sealed trait UndefinedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 150 */ val UndefinedKeyword: typings.typescript.mod.SyntaxKind.UndefinedKeyword with Double = js.native
  
  @js.native
  sealed trait UnionType extends SyntaxKind
  /* 182 */ val UnionType: typings.typescript.mod.SyntaxKind.UnionType with Double = js.native
  
  @js.native
  sealed trait UniqueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 151 */ val UniqueKeyword: typings.typescript.mod.SyntaxKind.UniqueKeyword with Double = js.native
  
  @js.native
  sealed trait Unknown
    extends SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 0 */ val Unknown: typings.typescript.mod.SyntaxKind.Unknown with Double = js.native
  
  @js.native
  sealed trait UnknownKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 152 */ val UnknownKeyword: typings.typescript.mod.SyntaxKind.UnknownKeyword with Double = js.native
  
  @js.native
  sealed trait UnparsedInternalText extends SyntaxKind
  /* 295 */ val UnparsedInternalText: typings.typescript.mod.SyntaxKind.UnparsedInternalText with Double = js.native
  
  @js.native
  sealed trait UnparsedPrepend extends SyntaxKind
  /* 293 */ val UnparsedPrepend: typings.typescript.mod.SyntaxKind.UnparsedPrepend with Double = js.native
  
  @js.native
  sealed trait UnparsedPrologue extends SyntaxKind
  /* 292 */ val UnparsedPrologue: typings.typescript.mod.SyntaxKind.UnparsedPrologue with Double = js.native
  
  @js.native
  sealed trait UnparsedSource extends SyntaxKind
  /* 299 */ val UnparsedSource: typings.typescript.mod.SyntaxKind.UnparsedSource with Double = js.native
  
  @js.native
  sealed trait UnparsedSyntheticReference extends SyntaxKind
  /* 296 */ val UnparsedSyntheticReference: typings.typescript.mod.SyntaxKind.UnparsedSyntheticReference with Double = js.native
  
  @js.native
  sealed trait UnparsedText extends SyntaxKind
  /* 294 */ val UnparsedText: typings.typescript.mod.SyntaxKind.UnparsedText with Double = js.native
  
  @js.native
  sealed trait VarKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 112 */ val VarKeyword: typings.typescript.mod.SyntaxKind.VarKeyword with Double = js.native
  
  @js.native
  sealed trait VariableDeclaration extends SyntaxKind
  /* 249 */ val VariableDeclaration: typings.typescript.mod.SyntaxKind.VariableDeclaration with Double = js.native
  
  @js.native
  sealed trait VariableDeclarationList extends SyntaxKind
  /* 250 */ val VariableDeclarationList: typings.typescript.mod.SyntaxKind.VariableDeclarationList with Double = js.native
  
  @js.native
  sealed trait VariableStatement extends SyntaxKind
  /* 232 */ val VariableStatement: typings.typescript.mod.SyntaxKind.VariableStatement with Double = js.native
  
  @js.native
  sealed trait VoidExpression extends SyntaxKind
  /* 212 */ val VoidExpression: typings.typescript.mod.SyntaxKind.VoidExpression with Double = js.native
  
  @js.native
  sealed trait VoidKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 113 */ val VoidKeyword: typings.typescript.mod.SyntaxKind.VoidKeyword with Double = js.native
  
  @js.native
  sealed trait WhileKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 114 */ val WhileKeyword: typings.typescript.mod.SyntaxKind.WhileKeyword with Double = js.native
  
  @js.native
  sealed trait WhileStatement extends SyntaxKind
  /* 236 */ val WhileStatement: typings.typescript.mod.SyntaxKind.WhileStatement with Double = js.native
  
  @js.native
  sealed trait WhitespaceTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 5 */ val WhitespaceTrivia: typings.typescript.mod.SyntaxKind.WhitespaceTrivia with Double = js.native
  
  @js.native
  sealed trait WithKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 115 */ val WithKeyword: typings.typescript.mod.SyntaxKind.WithKeyword with Double = js.native
  
  @js.native
  sealed trait WithStatement extends SyntaxKind
  /* 243 */ val WithStatement: typings.typescript.mod.SyntaxKind.WithStatement with Double = js.native
  
  @js.native
  sealed trait YieldExpression extends SyntaxKind
  /* 219 */ val YieldExpression: typings.typescript.mod.SyntaxKind.YieldExpression with Double = js.native
  
  @js.native
  sealed trait YieldKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 124 */ val YieldKeyword: typings.typescript.mod.SyntaxKind.YieldKeyword with Double = js.native
}
