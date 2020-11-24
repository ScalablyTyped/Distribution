package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends js.Object
@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  
  @js.native
  sealed trait AbstractKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 125 */ @js.native
  object AbstractKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.AbstractKeyword with Double]
  
  @js.native
  sealed trait AmpersandAmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 75 */ @js.native
  object AmpersandAmpersandEqualsToken extends TopLevel[AmpersandAmpersandEqualsToken with Double]
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with LogicalOperator
  /* 55 */ @js.native
  object AmpersandAmpersandToken extends TopLevel[AmpersandAmpersandToken with Double]
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 72 */ @js.native
  object AmpersandEqualsToken extends TopLevel[AmpersandEqualsToken with Double]
  
  @js.native
  sealed trait AmpersandToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 50 */ @js.native
  object AmpersandToken extends TopLevel[AmpersandToken with Double]
  
  @js.native
  sealed trait AnyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 128 */ @js.native
  object AnyKeyword extends TopLevel[AnyKeyword with Double]
  
  @js.native
  sealed trait ArrayBindingPattern extends SyntaxKind
  /* 197 */ @js.native
  object ArrayBindingPattern
    extends TopLevel[typings.typescript.mod.SyntaxKind.ArrayBindingPattern with Double]
  
  @js.native
  sealed trait ArrayLiteralExpression extends SyntaxKind
  /* 199 */ @js.native
  object ArrayLiteralExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ArrayLiteralExpression with Double]
  
  @js.native
  sealed trait ArrayType extends SyntaxKind
  /* 178 */ @js.native
  object ArrayType extends TopLevel[ArrayType with Double]
  
  @js.native
  sealed trait ArrowFunction extends SyntaxKind
  /* 209 */ @js.native
  object ArrowFunction
    extends TopLevel[typings.typescript.mod.SyntaxKind.ArrowFunction with Double]
  
  @js.native
  sealed trait AsExpression extends SyntaxKind
  /* 224 */ @js.native
  object AsExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.AsExpression with Double]
  
  @js.native
  sealed trait AsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 126 */ @js.native
  object AsKeyword extends TopLevel[AsKeyword with Double]
  
  @js.native
  sealed trait AssertsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 127 */ @js.native
  object AssertsKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.AssertsKeyword with Double]
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 66 */ @js.native
  object AsteriskAsteriskEqualsToken extends TopLevel[AsteriskAsteriskEqualsToken with Double]
  
  @js.native
  sealed trait AsteriskAsteriskToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 42 */ @js.native
  object AsteriskAsteriskToken extends TopLevel[AsteriskAsteriskToken with Double]
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 65 */ @js.native
  object AsteriskEqualsToken extends TopLevel[AsteriskEqualsToken with Double]
  
  @js.native
  sealed trait AsteriskToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
  /* 41 */ @js.native
  object AsteriskToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.AsteriskToken with Double]
  
  @js.native
  sealed trait AsyncKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 129 */ @js.native
  object AsyncKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.AsyncKeyword with Double]
  
  @js.native
  sealed trait AtToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 59 */ @js.native
  object AtToken extends TopLevel[AtToken with Double]
  
  @js.native
  sealed trait AwaitExpression extends SyntaxKind
  /* 213 */ @js.native
  object AwaitExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.AwaitExpression with Double]
  
  @js.native
  sealed trait AwaitKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 130 */ @js.native
  object AwaitKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.AwaitKeyword with Double]
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 61 */ @js.native
  object BacktickToken extends TopLevel[BacktickToken with Double]
  
  @js.native
  sealed trait BarBarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 74 */ @js.native
  object BarBarEqualsToken extends TopLevel[BarBarEqualsToken with Double]
  
  @js.native
  sealed trait BarBarToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with LogicalOperator
  /* 56 */ @js.native
  object BarBarToken extends TopLevel[BarBarToken with Double]
  
  @js.native
  sealed trait BarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 73 */ @js.native
  object BarEqualsToken extends TopLevel[BarEqualsToken with Double]
  
  @js.native
  sealed trait BarToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 51 */ @js.native
  object BarToken extends TopLevel[BarToken with Double]
  
  @js.native
  sealed trait BigIntKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 155 */ @js.native
  object BigIntKeyword extends TopLevel[BigIntKeyword with Double]
  
  @js.native
  sealed trait BigIntLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 9 */ @js.native
  object BigIntLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.BigIntLiteral with Double]
  
  @js.native
  sealed trait BinaryExpression extends SyntaxKind
  /* 216 */ @js.native
  object BinaryExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.BinaryExpression with Double]
  
  @js.native
  sealed trait BindingElement extends SyntaxKind
  /* 198 */ @js.native
  object BindingElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.BindingElement with Double]
  
  @js.native
  sealed trait Block extends SyntaxKind
  /* 230 */ @js.native
  object Block
    extends TopLevel[typings.typescript.mod.SyntaxKind.Block with Double]
  
  @js.native
  sealed trait BooleanKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 131 */ @js.native
  object BooleanKeyword extends TopLevel[BooleanKeyword with Double]
  
  @js.native
  sealed trait BreakKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 80 */ @js.native
  object BreakKeyword extends TopLevel[BreakKeyword with Double]
  
  @js.native
  sealed trait BreakStatement extends SyntaxKind
  /* 241 */ @js.native
  object BreakStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.BreakStatement with Double]
  
  @js.native
  sealed trait Bundle extends SyntaxKind
  /* 298 */ @js.native
  object Bundle
    extends TopLevel[typings.typescript.mod.SyntaxKind.Bundle with Double]
  
  @js.native
  sealed trait CallExpression extends SyntaxKind
  /* 203 */ @js.native
  object CallExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.CallExpression with Double]
  
  @js.native
  sealed trait CallSignature extends SyntaxKind
  /* 169 */ @js.native
  object CallSignature extends TopLevel[CallSignature with Double]
  
  @js.native
  sealed trait CaretEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 77 */ @js.native
  object CaretEqualsToken extends TopLevel[CaretEqualsToken with Double]
  
  @js.native
  sealed trait CaretToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with BitwiseOperator
  /* 52 */ @js.native
  object CaretToken extends TopLevel[CaretToken with Double]
  
  @js.native
  sealed trait CaseBlock extends SyntaxKind
  /* 258 */ @js.native
  object CaseBlock
    extends TopLevel[typings.typescript.mod.SyntaxKind.CaseBlock with Double]
  
  @js.native
  sealed trait CaseClause extends SyntaxKind
  /* 284 */ @js.native
  object CaseClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.CaseClause with Double]
  
  @js.native
  sealed trait CaseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 81 */ @js.native
  object CaseKeyword extends TopLevel[CaseKeyword with Double]
  
  @js.native
  sealed trait CatchClause extends SyntaxKind
  /* 287 */ @js.native
  object CatchClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.CatchClause with Double]
  
  @js.native
  sealed trait CatchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 82 */ @js.native
  object CatchKeyword extends TopLevel[CatchKeyword with Double]
  
  @js.native
  sealed trait ClassDeclaration extends SyntaxKind
  /* 252 */ @js.native
  object ClassDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ClassDeclaration with Double]
  
  @js.native
  sealed trait ClassExpression extends SyntaxKind
  /* 221 */ @js.native
  object ClassExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ClassExpression with Double]
  
  @js.native
  sealed trait ClassKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 83 */ @js.native
  object ClassKeyword extends TopLevel[ClassKeyword with Double]
  
  @js.native
  sealed trait CloseBraceToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 19 */ @js.native
  object CloseBraceToken extends TopLevel[CloseBraceToken with Double]
  
  @js.native
  sealed trait CloseBracketToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 23 */ @js.native
  object CloseBracketToken extends TopLevel[CloseBracketToken with Double]
  
  @js.native
  sealed trait CloseParenToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 21 */ @js.native
  object CloseParenToken extends TopLevel[CloseParenToken with Double]
  
  @js.native
  sealed trait ColonToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 58 */ @js.native
  object ColonToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.ColonToken with Double]
  
  @js.native
  sealed trait CommaListExpression extends SyntaxKind
  /* 337 */ @js.native
  object CommaListExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.CommaListExpression with Double]
  
  @js.native
  sealed trait CommaToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with _BinaryOperator
  /* 27 */ @js.native
  object CommaToken extends TopLevel[CommaToken with Double]
  
  @js.native
  sealed trait ComputedPropertyName extends SyntaxKind
  /* 158 */ @js.native
  object ComputedPropertyName
    extends TopLevel[typings.typescript.mod.SyntaxKind.ComputedPropertyName with Double]
  
  @js.native
  sealed trait ConditionalExpression extends SyntaxKind
  /* 217 */ @js.native
  object ConditionalExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ConditionalExpression with Double]
  
  @js.native
  sealed trait ConditionalType extends SyntaxKind
  /* 184 */ @js.native
  object ConditionalType
    extends TopLevel[typings.typescript.mod.SyntaxKind.ConditionalType with Double]
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 7 */ @js.native
  object ConflictMarkerTrivia extends TopLevel[ConflictMarkerTrivia with Double]
  
  @js.native
  sealed trait ConstKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 84 */ @js.native
  object ConstKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.ConstKeyword with Double]
  
  @js.native
  sealed trait ConstructSignature extends SyntaxKind
  /* 170 */ @js.native
  object ConstructSignature extends TopLevel[ConstructSignature with Double]
  
  @js.native
  sealed trait Constructor extends SyntaxKind
  /* 166 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  @js.native
  sealed trait ConstructorKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 132 */ @js.native
  object ConstructorKeyword extends TopLevel[ConstructorKeyword with Double]
  
  @js.native
  sealed trait ConstructorType extends SyntaxKind
  /* 175 */ @js.native
  object ConstructorType extends TopLevel[ConstructorType with Double]
  
  @js.native
  sealed trait ContinueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 85 */ @js.native
  object ContinueKeyword extends TopLevel[ContinueKeyword with Double]
  
  @js.native
  sealed trait ContinueStatement extends SyntaxKind
  /* 240 */ @js.native
  object ContinueStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ContinueStatement with Double]
  
  @js.native
  sealed trait Count extends SyntaxKind
  /* 341 */ @js.native
  object Count extends TopLevel[Count with Double]
  
  @js.native
  sealed trait DebuggerKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 86 */ @js.native
  object DebuggerKeyword extends TopLevel[DebuggerKeyword with Double]
  
  @js.native
  sealed trait DebuggerStatement extends SyntaxKind
  /* 248 */ @js.native
  object DebuggerStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.DebuggerStatement with Double]
  
  @js.native
  sealed trait DeclareKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 133 */ @js.native
  object DeclareKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.DeclareKeyword with Double]
  
  @js.native
  sealed trait Decorator extends SyntaxKind
  /* 161 */ @js.native
  object Decorator
    extends TopLevel[typings.typescript.mod.SyntaxKind.Decorator with Double]
  
  @js.native
  sealed trait DefaultClause extends SyntaxKind
  /* 285 */ @js.native
  object DefaultClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.DefaultClause with Double]
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 87 */ @js.native
  object DefaultKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.DefaultKeyword with Double]
  
  @js.native
  sealed trait DeleteExpression extends SyntaxKind
  /* 210 */ @js.native
  object DeleteExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.DeleteExpression with Double]
  
  @js.native
  sealed trait DeleteKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 88 */ @js.native
  object DeleteKeyword extends TopLevel[DeleteKeyword with Double]
  
  @js.native
  sealed trait DoKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 89 */ @js.native
  object DoKeyword extends TopLevel[DoKeyword with Double]
  
  @js.native
  sealed trait DoStatement extends SyntaxKind
  /* 235 */ @js.native
  object DoStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.DoStatement with Double]
  
  @js.native
  sealed trait DotDotDotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 25 */ @js.native
  object DotDotDotToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.DotDotDotToken with Double]
  
  @js.native
  sealed trait DotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 24 */ @js.native
  object DotToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.DotToken with Double]
  
  @js.native
  sealed trait ElementAccessExpression extends SyntaxKind
  /* 202 */ @js.native
  object ElementAccessExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ElementAccessExpression with Double]
  
  @js.native
  sealed trait ElseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 90 */ @js.native
  object ElseKeyword extends TopLevel[ElseKeyword with Double]
  
  @js.native
  sealed trait EmptyStatement extends SyntaxKind
  /* 231 */ @js.native
  object EmptyStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.EmptyStatement with Double]
  
  @js.native
  sealed trait EndOfDeclarationMarker extends SyntaxKind
  /* 339 */ @js.native
  object EndOfDeclarationMarker extends TopLevel[EndOfDeclarationMarker with Double]
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with TokenSyntaxKind
  /* 1 */ @js.native
  object EndOfFileToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.EndOfFileToken with Double]
  
  @js.native
  sealed trait EnumDeclaration extends SyntaxKind
  /* 255 */ @js.native
  object EnumDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.EnumDeclaration with Double]
  
  @js.native
  sealed trait EnumKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 91 */ @js.native
  object EnumKeyword extends TopLevel[EnumKeyword with Double]
  
  @js.native
  sealed trait EnumMember extends SyntaxKind
  /* 291 */ @js.native
  object EnumMember
    extends TopLevel[typings.typescript.mod.SyntaxKind.EnumMember with Double]
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 36 */ @js.native
  object EqualsEqualsEqualsToken extends TopLevel[EqualsEqualsEqualsToken with Double]
  
  @js.native
  sealed trait EqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 34 */ @js.native
  object EqualsEqualsToken extends TopLevel[EqualsEqualsToken with Double]
  
  @js.native
  sealed trait EqualsGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 38 */ @js.native
  object EqualsGreaterThanToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken with Double]
  
  @js.native
  sealed trait EqualsToken
    extends AssignmentOperator
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 62 */ @js.native
  object EqualsToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.EqualsToken with Double]
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 37 */ @js.native
  object ExclamationEqualsEqualsToken extends TopLevel[ExclamationEqualsEqualsToken with Double]
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with EqualityOperator
  /* 35 */ @js.native
  object ExclamationEqualsToken extends TopLevel[ExclamationEqualsToken with Double]
  
  @js.native
  sealed trait ExclamationToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PrefixUnaryOperator
  /* 53 */ @js.native
  object ExclamationToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExclamationToken with Double]
  
  @js.native
  sealed trait ExportAssignment extends SyntaxKind
  /* 266 */ @js.native
  object ExportAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportAssignment with Double]
  
  @js.native
  sealed trait ExportDeclaration extends SyntaxKind
  /* 267 */ @js.native
  object ExportDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportDeclaration with Double]
  
  @js.native
  sealed trait ExportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 92 */ @js.native
  object ExportKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportKeyword with Double]
  
  @js.native
  sealed trait ExportSpecifier extends SyntaxKind
  /* 270 */ @js.native
  object ExportSpecifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportSpecifier with Double]
  
  @js.native
  sealed trait ExpressionStatement extends SyntaxKind
  /* 233 */ @js.native
  object ExpressionStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExpressionStatement with Double]
  
  @js.native
  sealed trait ExpressionWithTypeArguments extends SyntaxKind
  /* 223 */ @js.native
  object ExpressionWithTypeArguments
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExpressionWithTypeArguments with Double]
  
  @js.native
  sealed trait ExtendsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 93 */ @js.native
  object ExtendsKeyword extends TopLevel[ExtendsKeyword with Double]
  
  @js.native
  sealed trait ExternalModuleReference extends SyntaxKind
  /* 272 */ @js.native
  object ExternalModuleReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExternalModuleReference with Double]
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 94 */ @js.native
  object FalseKeyword extends TopLevel[FalseKeyword with Double]
  
  @js.native
  sealed trait FinallyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 95 */ @js.native
  object FinallyKeyword extends TopLevel[FinallyKeyword with Double]
  
  @js.native
  sealed trait FirstAssignment extends SyntaxKind
  /* 62 */ @js.native
  object FirstAssignment extends TopLevel[FirstAssignment with Double]
  
  @js.native
  sealed trait FirstBinaryOperator extends SyntaxKind
  /* 29 */ @js.native
  object FirstBinaryOperator extends TopLevel[FirstBinaryOperator with Double]
  
  @js.native
  sealed trait FirstCompoundAssignment extends SyntaxKind
  /* 63 */ @js.native
  object FirstCompoundAssignment extends TopLevel[FirstCompoundAssignment with Double]
  
  @js.native
  sealed trait FirstFutureReservedWord extends SyntaxKind
  /* 116 */ @js.native
  object FirstFutureReservedWord extends TopLevel[FirstFutureReservedWord with Double]
  
  @js.native
  sealed trait FirstJSDocNode extends SyntaxKind
  /* 301 */ @js.native
  object FirstJSDocNode extends TopLevel[FirstJSDocNode with Double]
  
  @js.native
  sealed trait FirstJSDocTagNode extends SyntaxKind
  /* 314 */ @js.native
  object FirstJSDocTagNode extends TopLevel[FirstJSDocTagNode with Double]
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  /* 80 */ @js.native
  object FirstKeyword extends TopLevel[FirstKeyword with Double]
  
  @js.native
  sealed trait FirstLiteralToken extends SyntaxKind
  /* 8 */ @js.native
  object FirstLiteralToken extends TopLevel[FirstLiteralToken with Double]
  
  @js.native
  sealed trait FirstNode extends SyntaxKind
  /* 157 */ @js.native
  object FirstNode extends TopLevel[FirstNode with Double]
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  /* 18 */ @js.native
  object FirstPunctuation extends TopLevel[FirstPunctuation with Double]
  
  @js.native
  sealed trait FirstReservedWord extends SyntaxKind
  /* 80 */ @js.native
  object FirstReservedWord extends TopLevel[FirstReservedWord with Double]
  
  @js.native
  sealed trait FirstStatement extends SyntaxKind
  /* 232 */ @js.native
  object FirstStatement extends TopLevel[FirstStatement with Double]
  
  @js.native
  sealed trait FirstTemplateToken extends SyntaxKind
  /* 14 */ @js.native
  object FirstTemplateToken extends TopLevel[FirstTemplateToken with Double]
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  /* 0 */ @js.native
  object FirstToken extends TopLevel[FirstToken with Double]
  
  @js.native
  sealed trait FirstTriviaToken extends SyntaxKind
  /* 2 */ @js.native
  object FirstTriviaToken extends TopLevel[FirstTriviaToken with Double]
  
  @js.native
  sealed trait FirstTypeNode extends SyntaxKind
  /* 172 */ @js.native
  object FirstTypeNode extends TopLevel[FirstTypeNode with Double]
  
  @js.native
  sealed trait ForInStatement extends SyntaxKind
  /* 238 */ @js.native
  object ForInStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ForInStatement with Double]
  
  @js.native
  sealed trait ForKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 96 */ @js.native
  object ForKeyword extends TopLevel[ForKeyword with Double]
  
  @js.native
  sealed trait ForOfStatement extends SyntaxKind
  /* 239 */ @js.native
  object ForOfStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ForOfStatement with Double]
  
  @js.native
  sealed trait ForStatement extends SyntaxKind
  /* 237 */ @js.native
  object ForStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ForStatement with Double]
  
  @js.native
  sealed trait FromKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 153 */ @js.native
  object FromKeyword extends TopLevel[FromKeyword with Double]
  
  @js.native
  sealed trait FunctionDeclaration extends SyntaxKind
  /* 251 */ @js.native
  object FunctionDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.FunctionDeclaration with Double]
  
  @js.native
  sealed trait FunctionExpression extends SyntaxKind
  /* 208 */ @js.native
  object FunctionExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.FunctionExpression with Double]
  
  @js.native
  sealed trait FunctionKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 97 */ @js.native
  object FunctionKeyword extends TopLevel[FunctionKeyword with Double]
  
  @js.native
  sealed trait FunctionType extends SyntaxKind
  /* 174 */ @js.native
  object FunctionType extends TopLevel[FunctionType with Double]
  
  @js.native
  sealed trait GetAccessor extends SyntaxKind
  /* 167 */ @js.native
  object GetAccessor extends TopLevel[GetAccessor with Double]
  
  @js.native
  sealed trait GetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 134 */ @js.native
  object GetKeyword extends TopLevel[GetKeyword with Double]
  
  @js.native
  sealed trait GlobalKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 154 */ @js.native
  object GlobalKeyword extends TopLevel[GlobalKeyword with Double]
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 33 */ @js.native
  object GreaterThanEqualsToken extends TopLevel[GreaterThanEqualsToken with Double]
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 70 */ @js.native
  object GreaterThanGreaterThanEqualsToken extends TopLevel[GreaterThanGreaterThanEqualsToken with Double]
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 71 */ @js.native
  object GreaterThanGreaterThanGreaterThanEqualsToken extends TopLevel[GreaterThanGreaterThanGreaterThanEqualsToken with Double]
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 49 */ @js.native
  object GreaterThanGreaterThanGreaterThanToken extends TopLevel[GreaterThanGreaterThanGreaterThanToken with Double]
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 48 */ @js.native
  object GreaterThanGreaterThanToken extends TopLevel[GreaterThanGreaterThanToken with Double]
  
  @js.native
  sealed trait GreaterThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with RelationalOperator
  /* 31 */ @js.native
  object GreaterThanToken extends TopLevel[GreaterThanToken with Double]
  
  @js.native
  sealed trait HeritageClause extends SyntaxKind
  /* 286 */ @js.native
  object HeritageClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.HeritageClause with Double]
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 78 */ @js.native
  object Identifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.Identifier with Double]
  
  @js.native
  sealed trait IfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 98 */ @js.native
  object IfKeyword extends TopLevel[IfKeyword with Double]
  
  @js.native
  sealed trait IfStatement extends SyntaxKind
  /* 234 */ @js.native
  object IfStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.IfStatement with Double]
  
  @js.native
  sealed trait ImplementsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 116 */ @js.native
  object ImplementsKeyword extends TopLevel[ImplementsKeyword with Double]
  
  @js.native
  sealed trait ImportClause extends SyntaxKind
  /* 262 */ @js.native
  object ImportClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportClause with Double]
  
  @js.native
  sealed trait ImportDeclaration extends SyntaxKind
  /* 261 */ @js.native
  object ImportDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportDeclaration with Double]
  
  @js.native
  sealed trait ImportEqualsDeclaration extends SyntaxKind
  /* 260 */ @js.native
  object ImportEqualsDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration with Double]
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 99 */ @js.native
  object ImportKeyword extends TopLevel[ImportKeyword with Double]
  
  @js.native
  sealed trait ImportSpecifier extends SyntaxKind
  /* 265 */ @js.native
  object ImportSpecifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportSpecifier with Double]
  
  @js.native
  sealed trait ImportType extends SyntaxKind
  /* 195 */ @js.native
  object ImportType extends TopLevel[ImportType with Double]
  
  @js.native
  sealed trait InKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 100 */ @js.native
  object InKeyword extends TopLevel[InKeyword with Double]
  
  @js.native
  sealed trait IndexSignature extends SyntaxKind
  /* 171 */ @js.native
  object IndexSignature extends TopLevel[IndexSignature with Double]
  
  @js.native
  sealed trait IndexedAccessType extends SyntaxKind
  /* 189 */ @js.native
  object IndexedAccessType
    extends TopLevel[typings.typescript.mod.SyntaxKind.IndexedAccessType with Double]
  
  @js.native
  sealed trait InferKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 135 */ @js.native
  object InferKeyword extends TopLevel[InferKeyword with Double]
  
  @js.native
  sealed trait InferType extends SyntaxKind
  /* 185 */ @js.native
  object InferType extends TopLevel[InferType with Double]
  
  @js.native
  sealed trait InputFiles extends SyntaxKind
  /* 300 */ @js.native
  object InputFiles
    extends TopLevel[typings.typescript.mod.SyntaxKind.InputFiles with Double]
  
  @js.native
  sealed trait InstanceOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 101 */ @js.native
  object InstanceOfKeyword extends TopLevel[InstanceOfKeyword with Double]
  
  @js.native
  sealed trait InterfaceDeclaration extends SyntaxKind
  /* 253 */ @js.native
  object InterfaceDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.InterfaceDeclaration with Double]
  
  @js.native
  sealed trait InterfaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 117 */ @js.native
  object InterfaceKeyword extends TopLevel[InterfaceKeyword with Double]
  
  @js.native
  sealed trait IntersectionType extends SyntaxKind
  /* 183 */ @js.native
  object IntersectionType
    extends TopLevel[typings.typescript.mod.SyntaxKind.IntersectionType with Double]
  
  @js.native
  sealed trait IntrinsicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 136 */ @js.native
  object IntrinsicKeyword extends TopLevel[IntrinsicKeyword with Double]
  
  @js.native
  sealed trait IsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 137 */ @js.native
  object IsKeyword extends TopLevel[IsKeyword with Double]
  
  @js.native
  sealed trait JSDocAllType extends SyntaxKind
  /* 303 */ @js.native
  object JSDocAllType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocAllType with Double]
  
  @js.native
  sealed trait JSDocAugmentsTag extends SyntaxKind
  /* 315 */ @js.native
  object JSDocAugmentsTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocAugmentsTag with Double]
  
  @js.native
  sealed trait JSDocAuthorTag extends SyntaxKind
  /* 317 */ @js.native
  object JSDocAuthorTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocAuthorTag with Double]
  
  @js.native
  sealed trait JSDocCallbackTag extends SyntaxKind
  /* 324 */ @js.native
  object JSDocCallbackTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocCallbackTag with Double]
  
  @js.native
  sealed trait JSDocClassTag extends SyntaxKind
  /* 319 */ @js.native
  object JSDocClassTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocClassTag with Double]
  
  @js.native
  sealed trait JSDocComment extends SyntaxKind
  /* 311 */ @js.native
  object JSDocComment extends TopLevel[JSDocComment with Double]
  
  @js.native
  sealed trait JSDocDeprecatedTag extends SyntaxKind
  /* 318 */ @js.native
  object JSDocDeprecatedTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocDeprecatedTag with Double]
  
  @js.native
  sealed trait JSDocEnumTag extends SyntaxKind
  /* 325 */ @js.native
  object JSDocEnumTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocEnumTag with Double]
  
  @js.native
  sealed trait JSDocFunctionType extends SyntaxKind
  /* 308 */ @js.native
  object JSDocFunctionType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocFunctionType with Double]
  
  @js.native
  sealed trait JSDocImplementsTag extends SyntaxKind
  /* 316 */ @js.native
  object JSDocImplementsTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocImplementsTag with Double]
  
  @js.native
  sealed trait JSDocNameReference extends SyntaxKind
  /* 302 */ @js.native
  object JSDocNameReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNameReference with Double]
  
  @js.native
  sealed trait JSDocNamepathType extends SyntaxKind
  /* 310 */ @js.native
  object JSDocNamepathType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNamepathType with Double]
  
  @js.native
  sealed trait JSDocNonNullableType extends SyntaxKind
  /* 306 */ @js.native
  object JSDocNonNullableType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNonNullableType with Double]
  
  @js.native
  sealed trait JSDocNullableType extends SyntaxKind
  /* 305 */ @js.native
  object JSDocNullableType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNullableType with Double]
  
  @js.native
  sealed trait JSDocOptionalType extends SyntaxKind
  /* 307 */ @js.native
  object JSDocOptionalType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocOptionalType with Double]
  
  @js.native
  sealed trait JSDocParameterTag extends SyntaxKind
  /* 326 */ @js.native
  object JSDocParameterTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocParameterTag with Double]
  
  @js.native
  sealed trait JSDocPrivateTag extends SyntaxKind
  /* 321 */ @js.native
  object JSDocPrivateTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocPrivateTag with Double]
  
  @js.native
  sealed trait JSDocPropertyTag extends SyntaxKind
  /* 333 */ @js.native
  object JSDocPropertyTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocPropertyTag with Double]
  
  @js.native
  sealed trait JSDocProtectedTag extends SyntaxKind
  /* 322 */ @js.native
  object JSDocProtectedTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocProtectedTag with Double]
  
  @js.native
  sealed trait JSDocPublicTag extends SyntaxKind
  /* 320 */ @js.native
  object JSDocPublicTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocPublicTag with Double]
  
  @js.native
  sealed trait JSDocReadonlyTag extends SyntaxKind
  /* 323 */ @js.native
  object JSDocReadonlyTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocReadonlyTag with Double]
  
  @js.native
  sealed trait JSDocReturnTag extends SyntaxKind
  /* 327 */ @js.native
  object JSDocReturnTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocReturnTag with Double]
  
  @js.native
  sealed trait JSDocSeeTag extends SyntaxKind
  /* 332 */ @js.native
  object JSDocSeeTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocSeeTag with Double]
  
  @js.native
  sealed trait JSDocSignature extends SyntaxKind
  /* 313 */ @js.native
  object JSDocSignature
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocSignature with Double]
  
  @js.native
  sealed trait JSDocTag extends SyntaxKind
  /* 314 */ @js.native
  object JSDocTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTag with Double]
  
  @js.native
  sealed trait JSDocTemplateTag extends SyntaxKind
  /* 330 */ @js.native
  object JSDocTemplateTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTemplateTag with Double]
  
  @js.native
  sealed trait JSDocThisTag extends SyntaxKind
  /* 328 */ @js.native
  object JSDocThisTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocThisTag with Double]
  
  @js.native
  sealed trait JSDocTypeExpression extends SyntaxKind
  /* 301 */ @js.native
  object JSDocTypeExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypeExpression with Double]
  
  @js.native
  sealed trait JSDocTypeLiteral extends SyntaxKind
  /* 312 */ @js.native
  object JSDocTypeLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypeLiteral with Double]
  
  @js.native
  sealed trait JSDocTypeTag extends SyntaxKind
  /* 329 */ @js.native
  object JSDocTypeTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypeTag with Double]
  
  @js.native
  sealed trait JSDocTypedefTag extends SyntaxKind
  /* 331 */ @js.native
  object JSDocTypedefTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypedefTag with Double]
  
  @js.native
  sealed trait JSDocUnknownType extends SyntaxKind
  /* 304 */ @js.native
  object JSDocUnknownType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocUnknownType with Double]
  
  @js.native
  sealed trait JSDocVariadicType extends SyntaxKind
  /* 309 */ @js.native
  object JSDocVariadicType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocVariadicType with Double]
  
  @js.native
  sealed trait JsxAttribute extends SyntaxKind
  /* 280 */ @js.native
  object JsxAttribute
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxAttribute with Double]
  
  @js.native
  sealed trait JsxAttributes extends SyntaxKind
  /* 281 */ @js.native
  object JsxAttributes
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxAttributes with Double]
  
  @js.native
  sealed trait JsxClosingElement extends SyntaxKind
  /* 276 */ @js.native
  object JsxClosingElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxClosingElement with Double]
  
  @js.native
  sealed trait JsxClosingFragment extends SyntaxKind
  /* 279 */ @js.native
  object JsxClosingFragment
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxClosingFragment with Double]
  
  @js.native
  sealed trait JsxElement extends SyntaxKind
  /* 273 */ @js.native
  object JsxElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxElement with Double]
  
  @js.native
  sealed trait JsxExpression extends SyntaxKind
  /* 283 */ @js.native
  object JsxExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxExpression with Double]
  
  @js.native
  sealed trait JsxFragment extends SyntaxKind
  /* 277 */ @js.native
  object JsxFragment
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxFragment with Double]
  
  @js.native
  sealed trait JsxOpeningElement extends SyntaxKind
  /* 275 */ @js.native
  object JsxOpeningElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxOpeningElement with Double]
  
  @js.native
  sealed trait JsxOpeningFragment extends SyntaxKind
  /* 278 */ @js.native
  object JsxOpeningFragment
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxOpeningFragment with Double]
  
  @js.native
  sealed trait JsxSelfClosingElement extends SyntaxKind
  /* 274 */ @js.native
  object JsxSelfClosingElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxSelfClosingElement with Double]
  
  @js.native
  sealed trait JsxSpreadAttribute extends SyntaxKind
  /* 282 */ @js.native
  object JsxSpreadAttribute
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxSpreadAttribute with Double]
  
  @js.native
  sealed trait JsxText
    extends LiteralSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 11 */ @js.native
  object JsxText
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxText with Double]
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends LiteralSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 12 */ @js.native
  object JsxTextAllWhiteSpaces extends TopLevel[JsxTextAllWhiteSpaces with Double]
  
  @js.native
  sealed trait KeyOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 138 */ @js.native
  object KeyOfKeyword extends TopLevel[KeyOfKeyword with Double]
  
  @js.native
  sealed trait LabeledStatement extends SyntaxKind
  /* 245 */ @js.native
  object LabeledStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.LabeledStatement with Double]
  
  @js.native
  sealed trait LastAssignment extends SyntaxKind
  /* 77 */ @js.native
  object LastAssignment extends TopLevel[LastAssignment with Double]
  
  @js.native
  sealed trait LastBinaryOperator extends SyntaxKind
  /* 77 */ @js.native
  object LastBinaryOperator extends TopLevel[LastBinaryOperator with Double]
  
  @js.native
  sealed trait LastCompoundAssignment extends SyntaxKind
  /* 77 */ @js.native
  object LastCompoundAssignment extends TopLevel[LastCompoundAssignment with Double]
  
  @js.native
  sealed trait LastFutureReservedWord extends SyntaxKind
  /* 124 */ @js.native
  object LastFutureReservedWord extends TopLevel[LastFutureReservedWord with Double]
  
  @js.native
  sealed trait LastJSDocNode extends SyntaxKind
  /* 333 */ @js.native
  object LastJSDocNode extends TopLevel[LastJSDocNode with Double]
  
  @js.native
  sealed trait LastJSDocTagNode extends SyntaxKind
  /* 333 */ @js.native
  object LastJSDocTagNode extends TopLevel[LastJSDocTagNode with Double]
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  /* 156 */ @js.native
  object LastKeyword extends TopLevel[LastKeyword with Double]
  
  @js.native
  sealed trait LastLiteralToken extends SyntaxKind
  /* 14 */ @js.native
  object LastLiteralToken extends TopLevel[LastLiteralToken with Double]
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  /* 77 */ @js.native
  object LastPunctuation extends TopLevel[LastPunctuation with Double]
  
  @js.native
  sealed trait LastReservedWord extends SyntaxKind
  /* 115 */ @js.native
  object LastReservedWord extends TopLevel[LastReservedWord with Double]
  
  @js.native
  sealed trait LastStatement extends SyntaxKind
  /* 248 */ @js.native
  object LastStatement extends TopLevel[LastStatement with Double]
  
  @js.native
  sealed trait LastTemplateToken extends SyntaxKind
  /* 17 */ @js.native
  object LastTemplateToken extends TopLevel[LastTemplateToken with Double]
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  /* 156 */ @js.native
  object LastToken extends TopLevel[LastToken with Double]
  
  @js.native
  sealed trait LastTriviaToken extends SyntaxKind
  /* 7 */ @js.native
  object LastTriviaToken extends TopLevel[LastTriviaToken with Double]
  
  @js.native
  sealed trait LastTypeNode extends SyntaxKind
  /* 195 */ @js.native
  object LastTypeNode extends TopLevel[LastTypeNode with Double]
  
  @js.native
  sealed trait LessThanEqualsToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with RelationalOperator
  /* 32 */ @js.native
  object LessThanEqualsToken extends TopLevel[LessThanEqualsToken with Double]
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 69 */ @js.native
  object LessThanLessThanEqualsToken extends TopLevel[LessThanLessThanEqualsToken with Double]
  
  @js.native
  sealed trait LessThanLessThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with ShiftOperator
  /* 47 */ @js.native
  object LessThanLessThanToken extends TopLevel[LessThanLessThanToken with Double]
  
  @js.native
  sealed trait LessThanSlashToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JsxTokenSyntaxKind
  /* 30 */ @js.native
  object LessThanSlashToken extends TopLevel[LessThanSlashToken with Double]
  
  @js.native
  sealed trait LessThanToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with RelationalOperator
  /* 29 */ @js.native
  object LessThanToken extends TopLevel[LessThanToken with Double]
  
  @js.native
  sealed trait LetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 118 */ @js.native
  object LetKeyword extends TopLevel[LetKeyword with Double]
  
  @js.native
  sealed trait LiteralType extends SyntaxKind
  /* 191 */ @js.native
  object LiteralType
    extends TopLevel[typings.typescript.mod.SyntaxKind.LiteralType with Double]
  
  @js.native
  sealed trait MappedType extends SyntaxKind
  /* 190 */ @js.native
  object MappedType extends TopLevel[MappedType with Double]
  
  @js.native
  sealed trait MergeDeclarationMarker extends SyntaxKind
  /* 338 */ @js.native
  object MergeDeclarationMarker extends TopLevel[MergeDeclarationMarker with Double]
  
  @js.native
  sealed trait MetaProperty extends SyntaxKind
  /* 226 */ @js.native
  object MetaProperty
    extends TopLevel[typings.typescript.mod.SyntaxKind.MetaProperty with Double]
  
  @js.native
  sealed trait MethodDeclaration extends SyntaxKind
  /* 165 */ @js.native
  object MethodDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.MethodDeclaration with Double]
  
  @js.native
  sealed trait MethodSignature extends SyntaxKind
  /* 164 */ @js.native
  object MethodSignature
    extends TopLevel[typings.typescript.mod.SyntaxKind.MethodSignature with Double]
  
  @js.native
  sealed trait MinusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 64 */ @js.native
  object MinusEqualsToken extends TopLevel[MinusEqualsToken with Double]
  
  @js.native
  sealed trait MinusMinusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  /* 46 */ @js.native
  object MinusMinusToken extends TopLevel[MinusMinusToken with Double]
  
  @js.native
  sealed trait MinusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  /* 40 */ @js.native
  object MinusToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.MinusToken with Double]
  
  @js.native
  sealed trait MissingDeclaration extends SyntaxKind
  /* 271 */ @js.native
  object MissingDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.MissingDeclaration with Double]
  
  @js.native
  sealed trait ModuleBlock extends SyntaxKind
  /* 257 */ @js.native
  object ModuleBlock
    extends TopLevel[typings.typescript.mod.SyntaxKind.ModuleBlock with Double]
  
  @js.native
  sealed trait ModuleDeclaration extends SyntaxKind
  /* 256 */ @js.native
  object ModuleDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ModuleDeclaration with Double]
  
  @js.native
  sealed trait ModuleKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 139 */ @js.native
  object ModuleKeyword extends TopLevel[ModuleKeyword with Double]
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with CommentKind
  /* 3 */ @js.native
  object MultiLineCommentTrivia extends TopLevel[MultiLineCommentTrivia with Double]
  
  @js.native
  sealed trait NamedExports extends SyntaxKind
  /* 268 */ @js.native
  object NamedExports
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamedExports with Double]
  
  @js.native
  sealed trait NamedImports extends SyntaxKind
  /* 264 */ @js.native
  object NamedImports
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamedImports with Double]
  
  @js.native
  sealed trait NamedTupleMember extends SyntaxKind
  /* 192 */ @js.native
  object NamedTupleMember
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamedTupleMember with Double]
  
  @js.native
  sealed trait NamespaceExport extends SyntaxKind
  /* 269 */ @js.native
  object NamespaceExport
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamespaceExport with Double]
  
  @js.native
  sealed trait NamespaceExportDeclaration extends SyntaxKind
  /* 259 */ @js.native
  object NamespaceExportDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamespaceExportDeclaration with Double]
  
  @js.native
  sealed trait NamespaceImport extends SyntaxKind
  /* 263 */ @js.native
  object NamespaceImport
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamespaceImport with Double]
  
  @js.native
  sealed trait NamespaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 140 */ @js.native
  object NamespaceKeyword extends TopLevel[NamespaceKeyword with Double]
  
  @js.native
  sealed trait NeverKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 141 */ @js.native
  object NeverKeyword extends TopLevel[NeverKeyword with Double]
  
  @js.native
  sealed trait NewExpression extends SyntaxKind
  /* 204 */ @js.native
  object NewExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.NewExpression with Double]
  
  @js.native
  sealed trait NewKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 102 */ @js.native
  object NewKeyword extends TopLevel[NewKeyword with Double]
  
  @js.native
  sealed trait NewLineTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 4 */ @js.native
  object NewLineTrivia extends TopLevel[NewLineTrivia with Double]
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 14 */ @js.native
  object NoSubstitutionTemplateLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral with Double]
  
  @js.native
  sealed trait NonNullExpression extends SyntaxKind
  /* 225 */ @js.native
  object NonNullExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.NonNullExpression with Double]
  
  @js.native
  sealed trait NotEmittedStatement extends SyntaxKind
  /* 335 */ @js.native
  object NotEmittedStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.NotEmittedStatement with Double]
  
  @js.native
  sealed trait NullKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 103 */ @js.native
  object NullKeyword extends TopLevel[NullKeyword with Double]
  
  @js.native
  sealed trait NumberKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 144 */ @js.native
  object NumberKeyword extends TopLevel[NumberKeyword with Double]
  
  @js.native
  sealed trait NumericLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 8 */ @js.native
  object NumericLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.NumericLiteral with Double]
  
  @js.native
  sealed trait ObjectBindingPattern extends SyntaxKind
  /* 196 */ @js.native
  object ObjectBindingPattern
    extends TopLevel[typings.typescript.mod.SyntaxKind.ObjectBindingPattern with Double]
  
  @js.native
  sealed trait ObjectKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 145 */ @js.native
  object ObjectKeyword extends TopLevel[ObjectKeyword with Double]
  
  @js.native
  sealed trait ObjectLiteralExpression extends SyntaxKind
  /* 200 */ @js.native
  object ObjectLiteralExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ObjectLiteralExpression with Double]
  
  @js.native
  sealed trait OfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 156 */ @js.native
  object OfKeyword extends TopLevel[OfKeyword with Double]
  
  @js.native
  sealed trait OmittedExpression extends SyntaxKind
  /* 222 */ @js.native
  object OmittedExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.OmittedExpression with Double]
  
  @js.native
  sealed trait OpenBraceToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  /* 18 */ @js.native
  object OpenBraceToken extends TopLevel[OpenBraceToken with Double]
  
  @js.native
  sealed trait OpenBracketToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 22 */ @js.native
  object OpenBracketToken extends TopLevel[OpenBracketToken with Double]
  
  @js.native
  sealed trait OpenParenToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 20 */ @js.native
  object OpenParenToken extends TopLevel[OpenParenToken with Double]
  
  @js.native
  sealed trait OptionalType extends SyntaxKind
  /* 180 */ @js.native
  object OptionalType extends TopLevel[OptionalType with Double]
  
  @js.native
  sealed trait PackageKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 119 */ @js.native
  object PackageKeyword extends TopLevel[PackageKeyword with Double]
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  /* 160 */ @js.native
  object Parameter extends TopLevel[Parameter with Double]
  
  @js.native
  sealed trait ParenthesizedExpression extends SyntaxKind
  /* 207 */ @js.native
  object ParenthesizedExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ParenthesizedExpression with Double]
  
  @js.native
  sealed trait ParenthesizedType extends SyntaxKind
  /* 186 */ @js.native
  object ParenthesizedType extends TopLevel[ParenthesizedType with Double]
  
  @js.native
  sealed trait PartiallyEmittedExpression extends SyntaxKind
  /* 336 */ @js.native
  object PartiallyEmittedExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PartiallyEmittedExpression with Double]
  
  @js.native
  sealed trait PercentEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 68 */ @js.native
  object PercentEqualsToken extends TopLevel[PercentEqualsToken with Double]
  
  @js.native
  sealed trait PercentToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with MultiplicativeOperator
  /* 44 */ @js.native
  object PercentToken extends TopLevel[PercentToken with Double]
  
  @js.native
  sealed trait PlusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 63 */ @js.native
  object PlusEqualsToken extends TopLevel[PlusEqualsToken with Double]
  
  @js.native
  sealed trait PlusPlusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  /* 45 */ @js.native
  object PlusPlusToken extends TopLevel[PlusPlusToken with Double]
  
  @js.native
  sealed trait PlusToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  /* 39 */ @js.native
  object PlusToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.PlusToken with Double]
  
  @js.native
  sealed trait PostfixUnaryExpression extends SyntaxKind
  /* 215 */ @js.native
  object PostfixUnaryExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PostfixUnaryExpression with Double]
  
  @js.native
  sealed trait PrefixUnaryExpression extends SyntaxKind
  /* 214 */ @js.native
  object PrefixUnaryExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PrefixUnaryExpression with Double]
  
  @js.native
  sealed trait PrivateIdentifier extends SyntaxKind
  /* 79 */ @js.native
  object PrivateIdentifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.PrivateIdentifier with Double]
  
  @js.native
  sealed trait PrivateKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 120 */ @js.native
  object PrivateKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.PrivateKeyword with Double]
  
  @js.native
  sealed trait PropertyAccessExpression extends SyntaxKind
  /* 201 */ @js.native
  object PropertyAccessExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertyAccessExpression with Double]
  
  @js.native
  sealed trait PropertyAssignment extends SyntaxKind
  /* 288 */ @js.native
  object PropertyAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertyAssignment with Double]
  
  @js.native
  sealed trait PropertyDeclaration extends SyntaxKind
  /* 163 */ @js.native
  object PropertyDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertyDeclaration with Double]
  
  @js.native
  sealed trait PropertySignature extends SyntaxKind
  /* 162 */ @js.native
  object PropertySignature
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertySignature with Double]
  
  @js.native
  sealed trait ProtectedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 121 */ @js.native
  object ProtectedKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.ProtectedKeyword with Double]
  
  @js.native
  sealed trait PublicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 122 */ @js.native
  object PublicKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.PublicKeyword with Double]
  
  @js.native
  sealed trait QualifiedName extends SyntaxKind
  /* 157 */ @js.native
  object QualifiedName
    extends TopLevel[typings.typescript.mod.SyntaxKind.QualifiedName with Double]
  
  @js.native
  sealed trait QuestionDotToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 28 */ @js.native
  object QuestionDotToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.QuestionDotToken with Double]
  
  @js.native
  sealed trait QuestionQuestionEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with LogicalOrCoalescingAssignmentOperator
  /* 76 */ @js.native
  object QuestionQuestionEqualsToken extends TopLevel[QuestionQuestionEqualsToken with Double]
  
  @js.native
  sealed trait QuestionQuestionToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with _AssignmentOperatorOrHigher
  /* 60 */ @js.native
  object QuestionQuestionToken extends TopLevel[QuestionQuestionToken with Double]
  
  @js.native
  sealed trait QuestionToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 57 */ @js.native
  object QuestionToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.QuestionToken with Double]
  
  @js.native
  sealed trait ReadonlyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 142 */ @js.native
  object ReadonlyKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.ReadonlyKeyword with Double]
  
  @js.native
  sealed trait RegularExpressionLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 13 */ @js.native
  object RegularExpressionLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.RegularExpressionLiteral with Double]
  
  @js.native
  sealed trait RequireKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 143 */ @js.native
  object RequireKeyword extends TopLevel[RequireKeyword with Double]
  
  @js.native
  sealed trait RestType extends SyntaxKind
  /* 181 */ @js.native
  object RestType extends TopLevel[RestType with Double]
  
  @js.native
  sealed trait ReturnKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 104 */ @js.native
  object ReturnKeyword extends TopLevel[ReturnKeyword with Double]
  
  @js.native
  sealed trait ReturnStatement extends SyntaxKind
  /* 242 */ @js.native
  object ReturnStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ReturnStatement with Double]
  
  @js.native
  sealed trait SemicolonClassElement extends SyntaxKind
  /* 229 */ @js.native
  object SemicolonClassElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.SemicolonClassElement with Double]
  
  @js.native
  sealed trait SemicolonToken
    extends PunctuationSyntaxKind
       with SyntaxKind
  /* 26 */ @js.native
  object SemicolonToken extends TopLevel[SemicolonToken with Double]
  
  @js.native
  sealed trait SetAccessor extends SyntaxKind
  /* 168 */ @js.native
  object SetAccessor extends TopLevel[SetAccessor with Double]
  
  @js.native
  sealed trait SetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 146 */ @js.native
  object SetKeyword extends TopLevel[SetKeyword with Double]
  
  @js.native
  sealed trait ShebangTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
  /* 6 */ @js.native
  object ShebangTrivia extends TopLevel[ShebangTrivia with Double]
  
  @js.native
  sealed trait ShorthandPropertyAssignment extends SyntaxKind
  /* 289 */ @js.native
  object ShorthandPropertyAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.ShorthandPropertyAssignment with Double]
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with CommentKind
  /* 2 */ @js.native
  object SingleLineCommentTrivia extends TopLevel[SingleLineCommentTrivia with Double]
  
  @js.native
  sealed trait SlashEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 67 */ @js.native
  object SlashEqualsToken extends TopLevel[SlashEqualsToken with Double]
  
  @js.native
  sealed trait SlashToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with MultiplicativeOperator
  /* 43 */ @js.native
  object SlashToken extends TopLevel[SlashToken with Double]
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  /* 297 */ @js.native
  object SourceFile
    extends TopLevel[typings.typescript.mod.SyntaxKind.SourceFile with Double]
  
  @js.native
  sealed trait SpreadAssignment extends SyntaxKind
  /* 290 */ @js.native
  object SpreadAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.SpreadAssignment with Double]
  
  @js.native
  sealed trait SpreadElement extends SyntaxKind
  /* 220 */ @js.native
  object SpreadElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.SpreadElement with Double]
  
  @js.native
  sealed trait StaticKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with ModifierSyntaxKind
  /* 123 */ @js.native
  object StaticKeyword
    extends TopLevel[typings.typescript.mod.SyntaxKind.StaticKeyword with Double]
  
  @js.native
  sealed trait StringKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 147 */ @js.native
  object StringKeyword extends TopLevel[StringKeyword with Double]
  
  @js.native
  sealed trait StringLiteral
    extends LiteralSyntaxKind
       with SyntaxKind
  /* 10 */ @js.native
  object StringLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.StringLiteral with Double]
  
  @js.native
  sealed trait SuperKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 105 */ @js.native
  object SuperKeyword extends TopLevel[SuperKeyword with Double]
  
  @js.native
  sealed trait SwitchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 106 */ @js.native
  object SwitchKeyword extends TopLevel[SwitchKeyword with Double]
  
  @js.native
  sealed trait SwitchStatement extends SyntaxKind
  /* 244 */ @js.native
  object SwitchStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.SwitchStatement with Double]
  
  @js.native
  sealed trait SymbolKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 148 */ @js.native
  object SymbolKeyword extends TopLevel[SymbolKeyword with Double]
  
  @js.native
  sealed trait SyntaxList extends SyntaxKind
  /* 334 */ @js.native
  object SyntaxList
    extends TopLevel[typings.typescript.mod.SyntaxKind.SyntaxList with Double]
  
  @js.native
  sealed trait SyntheticExpression extends SyntaxKind
  /* 227 */ @js.native
  object SyntheticExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.SyntheticExpression with Double]
  
  @js.native
  sealed trait SyntheticReferenceExpression extends SyntaxKind
  /* 340 */ @js.native
  object SyntheticReferenceExpression extends TopLevel[SyntheticReferenceExpression with Double]
  
  @js.native
  sealed trait TaggedTemplateExpression extends SyntaxKind
  /* 205 */ @js.native
  object TaggedTemplateExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.TaggedTemplateExpression with Double]
  
  @js.native
  sealed trait TemplateExpression extends SyntaxKind
  /* 218 */ @js.native
  object TemplateExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateExpression with Double]
  
  @js.native
  sealed trait TemplateHead
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 15 */ @js.native
  object TemplateHead
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateHead with Double]
  
  @js.native
  sealed trait TemplateLiteralType extends SyntaxKind
  /* 193 */ @js.native
  object TemplateLiteralType
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateLiteralType with Double]
  
  @js.native
  sealed trait TemplateLiteralTypeSpan extends SyntaxKind
  /* 194 */ @js.native
  object TemplateLiteralTypeSpan
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateLiteralTypeSpan with Double]
  
  @js.native
  sealed trait TemplateMiddle
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 16 */ @js.native
  object TemplateMiddle
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateMiddle with Double]
  
  @js.native
  sealed trait TemplateSpan extends SyntaxKind
  /* 228 */ @js.native
  object TemplateSpan
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateSpan with Double]
  
  @js.native
  sealed trait TemplateTail
    extends PseudoLiteralSyntaxKind
       with SyntaxKind
  /* 17 */ @js.native
  object TemplateTail
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateTail with Double]
  
  @js.native
  sealed trait ThisKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 107 */ @js.native
  object ThisKeyword extends TopLevel[ThisKeyword with Double]
  
  @js.native
  sealed trait ThisType extends SyntaxKind
  /* 187 */ @js.native
  object ThisType extends TopLevel[ThisType with Double]
  
  @js.native
  sealed trait ThrowKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 108 */ @js.native
  object ThrowKeyword extends TopLevel[ThrowKeyword with Double]
  
  @js.native
  sealed trait ThrowStatement extends SyntaxKind
  /* 246 */ @js.native
  object ThrowStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ThrowStatement with Double]
  
  @js.native
  sealed trait TildeToken
    extends PunctuationSyntaxKind
       with SyntaxKind
       with PrefixUnaryOperator
  /* 54 */ @js.native
  object TildeToken extends TopLevel[TildeToken with Double]
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 109 */ @js.native
  object TrueKeyword extends TopLevel[TrueKeyword with Double]
  
  @js.native
  sealed trait TryKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 110 */ @js.native
  object TryKeyword extends TopLevel[TryKeyword with Double]
  
  @js.native
  sealed trait TryStatement extends SyntaxKind
  /* 247 */ @js.native
  object TryStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.TryStatement with Double]
  
  @js.native
  sealed trait TupleType extends SyntaxKind
  /* 179 */ @js.native
  object TupleType
    extends TopLevel[typings.typescript.mod.SyntaxKind.TupleType with Double]
  
  @js.native
  sealed trait TypeAliasDeclaration extends SyntaxKind
  /* 254 */ @js.native
  object TypeAliasDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeAliasDeclaration with Double]
  
  @js.native
  sealed trait TypeAssertionExpression extends SyntaxKind
  /* 206 */ @js.native
  object TypeAssertionExpression extends TopLevel[TypeAssertionExpression with Double]
  
  @js.native
  sealed trait TypeKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 149 */ @js.native
  object TypeKeyword extends TopLevel[TypeKeyword with Double]
  
  @js.native
  sealed trait TypeLiteral extends SyntaxKind
  /* 177 */ @js.native
  object TypeLiteral extends TopLevel[TypeLiteral with Double]
  
  @js.native
  sealed trait TypeOfExpression extends SyntaxKind
  /* 211 */ @js.native
  object TypeOfExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeOfExpression with Double]
  
  @js.native
  sealed trait TypeOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 111 */ @js.native
  object TypeOfKeyword extends TopLevel[TypeOfKeyword with Double]
  
  @js.native
  sealed trait TypeOperator extends SyntaxKind
  /* 188 */ @js.native
  object TypeOperator extends TopLevel[TypeOperator with Double]
  
  @js.native
  sealed trait TypeParameter extends SyntaxKind
  /* 159 */ @js.native
  object TypeParameter
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeParameter with Double]
  
  @js.native
  sealed trait TypePredicate extends SyntaxKind
  /* 172 */ @js.native
  object TypePredicate
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypePredicate with Double]
  
  @js.native
  sealed trait TypeQuery extends SyntaxKind
  /* 176 */ @js.native
  object TypeQuery extends TopLevel[TypeQuery with Double]
  
  @js.native
  sealed trait TypeReference extends SyntaxKind
  /* 173 */ @js.native
  object TypeReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeReference with Double]
  
  @js.native
  sealed trait UndefinedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 150 */ @js.native
  object UndefinedKeyword extends TopLevel[UndefinedKeyword with Double]
  
  @js.native
  sealed trait UnionType extends SyntaxKind
  /* 182 */ @js.native
  object UnionType
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnionType with Double]
  
  @js.native
  sealed trait UniqueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 151 */ @js.native
  object UniqueKeyword extends TopLevel[UniqueKeyword with Double]
  
  @js.native
  sealed trait Unknown
    extends SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  @js.native
  sealed trait UnknownKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 152 */ @js.native
  object UnknownKeyword extends TopLevel[UnknownKeyword with Double]
  
  @js.native
  sealed trait UnparsedInternalText extends SyntaxKind
  /* 295 */ @js.native
  object UnparsedInternalText extends TopLevel[UnparsedInternalText with Double]
  
  @js.native
  sealed trait UnparsedPrepend extends SyntaxKind
  /* 293 */ @js.native
  object UnparsedPrepend
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedPrepend with Double]
  
  @js.native
  sealed trait UnparsedPrologue extends SyntaxKind
  /* 292 */ @js.native
  object UnparsedPrologue
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedPrologue with Double]
  
  @js.native
  sealed trait UnparsedSource extends SyntaxKind
  /* 299 */ @js.native
  object UnparsedSource
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedSource with Double]
  
  @js.native
  sealed trait UnparsedSyntheticReference extends SyntaxKind
  /* 296 */ @js.native
  object UnparsedSyntheticReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedSyntheticReference with Double]
  
  @js.native
  sealed trait UnparsedText extends SyntaxKind
  /* 294 */ @js.native
  object UnparsedText extends TopLevel[UnparsedText with Double]
  
  @js.native
  sealed trait VarKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 112 */ @js.native
  object VarKeyword extends TopLevel[VarKeyword with Double]
  
  @js.native
  sealed trait VariableDeclaration extends SyntaxKind
  /* 249 */ @js.native
  object VariableDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.VariableDeclaration with Double]
  
  @js.native
  sealed trait VariableDeclarationList extends SyntaxKind
  /* 250 */ @js.native
  object VariableDeclarationList
    extends TopLevel[typings.typescript.mod.SyntaxKind.VariableDeclarationList with Double]
  
  @js.native
  sealed trait VariableStatement extends SyntaxKind
  /* 232 */ @js.native
  object VariableStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.VariableStatement with Double]
  
  @js.native
  sealed trait VoidExpression extends SyntaxKind
  /* 212 */ @js.native
  object VoidExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.VoidExpression with Double]
  
  @js.native
  sealed trait VoidKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with KeywordTypeSyntaxKind
  /* 113 */ @js.native
  object VoidKeyword extends TopLevel[VoidKeyword with Double]
  
  @js.native
  sealed trait WhileKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 114 */ @js.native
  object WhileKeyword extends TopLevel[WhileKeyword with Double]
  
  @js.native
  sealed trait WhileStatement extends SyntaxKind
  /* 236 */ @js.native
  object WhileStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.WhileStatement with Double]
  
  @js.native
  sealed trait WhitespaceTrivia
    extends TriviaSyntaxKind
       with SyntaxKind
       with JSDocSyntaxKind
  /* 5 */ @js.native
  object WhitespaceTrivia extends TopLevel[WhitespaceTrivia with Double]
  
  @js.native
  sealed trait WithKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 115 */ @js.native
  object WithKeyword extends TopLevel[WithKeyword with Double]
  
  @js.native
  sealed trait WithStatement extends SyntaxKind
  /* 243 */ @js.native
  object WithStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.WithStatement with Double]
  
  @js.native
  sealed trait YieldExpression extends SyntaxKind
  /* 219 */ @js.native
  object YieldExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.YieldExpression with Double]
  
  @js.native
  sealed trait YieldKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  /* 124 */ @js.native
  object YieldKeyword extends TopLevel[YieldKeyword with Double]
}
