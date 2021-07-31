package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SyntaxKind extends StObject
@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind & Double] = js.native
  
  @js.native
  sealed trait AbstractKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 125 */ val AbstractKeyword: typings.typescript.mod.SyntaxKind.AbstractKeyword & Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with LogicalOrCoalescingAssignmentOperator
  /* 75 */ val AmpersandAmpersandEqualsToken: typings.typescript.mod.SyntaxKind.AmpersandAmpersandEqualsToken & Double = js.native
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends StObject
       with SyntaxKind
       with LogicalOperator
       with PunctuationSyntaxKind
  /* 55 */ val AmpersandAmpersandToken: typings.typescript.mod.SyntaxKind.AmpersandAmpersandToken & Double = js.native
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 72 */ val AmpersandEqualsToken: typings.typescript.mod.SyntaxKind.AmpersandEqualsToken & Double = js.native
  
  @js.native
  sealed trait AmpersandToken
    extends StObject
       with SyntaxKind
       with BitwiseOperator
       with PunctuationSyntaxKind
  /* 50 */ val AmpersandToken: typings.typescript.mod.SyntaxKind.AmpersandToken & Double = js.native
  
  @js.native
  sealed trait AnyKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 128 */ val AnyKeyword: typings.typescript.mod.SyntaxKind.AnyKeyword & Double = js.native
  
  @js.native
  sealed trait ArrayBindingPattern
    extends StObject
       with SyntaxKind
  /* 197 */ val ArrayBindingPattern: typings.typescript.mod.SyntaxKind.ArrayBindingPattern & Double = js.native
  
  @js.native
  sealed trait ArrayLiteralExpression
    extends StObject
       with SyntaxKind
  /* 199 */ val ArrayLiteralExpression: typings.typescript.mod.SyntaxKind.ArrayLiteralExpression & Double = js.native
  
  @js.native
  sealed trait ArrayType
    extends StObject
       with SyntaxKind
  /* 178 */ val ArrayType: typings.typescript.mod.SyntaxKind.ArrayType & Double = js.native
  
  @js.native
  sealed trait ArrowFunction
    extends StObject
       with SyntaxKind
  /* 209 */ val ArrowFunction: typings.typescript.mod.SyntaxKind.ArrowFunction & Double = js.native
  
  @js.native
  sealed trait AsExpression
    extends StObject
       with SyntaxKind
  /* 224 */ val AsExpression: typings.typescript.mod.SyntaxKind.AsExpression & Double = js.native
  
  @js.native
  sealed trait AsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 126 */ val AsKeyword: typings.typescript.mod.SyntaxKind.AsKeyword & Double = js.native
  
  @js.native
  sealed trait AssertsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 127 */ val AssertsKeyword: typings.typescript.mod.SyntaxKind.AssertsKeyword & Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 66 */ val AsteriskAsteriskEqualsToken: typings.typescript.mod.SyntaxKind.AsteriskAsteriskEqualsToken & Double = js.native
  
  @js.native
  sealed trait AsteriskAsteriskToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 42 */ val AsteriskAsteriskToken: typings.typescript.mod.SyntaxKind.AsteriskAsteriskToken & Double = js.native
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 65 */ val AsteriskEqualsToken: typings.typescript.mod.SyntaxKind.AsteriskEqualsToken & Double = js.native
  
  @js.native
  sealed trait AsteriskToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
       with PunctuationSyntaxKind
  /* 41 */ val AsteriskToken: typings.typescript.mod.SyntaxKind.AsteriskToken & Double = js.native
  
  @js.native
  sealed trait AsyncKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 129 */ val AsyncKeyword: typings.typescript.mod.SyntaxKind.AsyncKeyword & Double = js.native
  
  @js.native
  sealed trait AtToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 59 */ val AtToken: typings.typescript.mod.SyntaxKind.AtToken & Double = js.native
  
  @js.native
  sealed trait AwaitExpression
    extends StObject
       with SyntaxKind
  /* 213 */ val AwaitExpression: typings.typescript.mod.SyntaxKind.AwaitExpression & Double = js.native
  
  @js.native
  sealed trait AwaitKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 130 */ val AwaitKeyword: typings.typescript.mod.SyntaxKind.AwaitKeyword & Double = js.native
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 61 */ val BacktickToken: typings.typescript.mod.SyntaxKind.BacktickToken & Double = js.native
  
  @js.native
  sealed trait BarBarEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with LogicalOrCoalescingAssignmentOperator
  /* 74 */ val BarBarEqualsToken: typings.typescript.mod.SyntaxKind.BarBarEqualsToken & Double = js.native
  
  @js.native
  sealed trait BarBarToken
    extends StObject
       with SyntaxKind
       with LogicalOperator
       with PunctuationSyntaxKind
  /* 56 */ val BarBarToken: typings.typescript.mod.SyntaxKind.BarBarToken & Double = js.native
  
  @js.native
  sealed trait BarEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 73 */ val BarEqualsToken: typings.typescript.mod.SyntaxKind.BarEqualsToken & Double = js.native
  
  @js.native
  sealed trait BarToken
    extends StObject
       with SyntaxKind
       with BitwiseOperator
       with PunctuationSyntaxKind
  /* 51 */ val BarToken: typings.typescript.mod.SyntaxKind.BarToken & Double = js.native
  
  @js.native
  sealed trait BigIntKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 155 */ val BigIntKeyword: typings.typescript.mod.SyntaxKind.BigIntKeyword & Double = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 9 */ val BigIntLiteral: typings.typescript.mod.SyntaxKind.BigIntLiteral & Double = js.native
  
  @js.native
  sealed trait BinaryExpression
    extends StObject
       with SyntaxKind
  /* 216 */ val BinaryExpression: typings.typescript.mod.SyntaxKind.BinaryExpression & Double = js.native
  
  @js.native
  sealed trait BindingElement
    extends StObject
       with SyntaxKind
  /* 198 */ val BindingElement: typings.typescript.mod.SyntaxKind.BindingElement & Double = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with SyntaxKind
  /* 230 */ val Block: typings.typescript.mod.SyntaxKind.Block & Double = js.native
  
  @js.native
  sealed trait BooleanKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 131 */ val BooleanKeyword: typings.typescript.mod.SyntaxKind.BooleanKeyword & Double = js.native
  
  @js.native
  sealed trait BreakKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 80 */ val BreakKeyword: typings.typescript.mod.SyntaxKind.BreakKeyword & Double = js.native
  
  @js.native
  sealed trait BreakStatement
    extends StObject
       with SyntaxKind
  /* 241 */ val BreakStatement: typings.typescript.mod.SyntaxKind.BreakStatement & Double = js.native
  
  @js.native
  sealed trait Bundle
    extends StObject
       with SyntaxKind
  /* 298 */ val Bundle: typings.typescript.mod.SyntaxKind.Bundle & Double = js.native
  
  @js.native
  sealed trait CallExpression
    extends StObject
       with SyntaxKind
  /* 203 */ val CallExpression: typings.typescript.mod.SyntaxKind.CallExpression & Double = js.native
  
  @js.native
  sealed trait CallSignature
    extends StObject
       with SyntaxKind
  /* 169 */ val CallSignature: typings.typescript.mod.SyntaxKind.CallSignature & Double = js.native
  
  @js.native
  sealed trait CaretEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 77 */ val CaretEqualsToken: typings.typescript.mod.SyntaxKind.CaretEqualsToken & Double = js.native
  
  @js.native
  sealed trait CaretToken
    extends StObject
       with SyntaxKind
       with BitwiseOperator
       with PunctuationSyntaxKind
  /* 52 */ val CaretToken: typings.typescript.mod.SyntaxKind.CaretToken & Double = js.native
  
  @js.native
  sealed trait CaseBlock
    extends StObject
       with SyntaxKind
  /* 258 */ val CaseBlock: typings.typescript.mod.SyntaxKind.CaseBlock & Double = js.native
  
  @js.native
  sealed trait CaseClause
    extends StObject
       with SyntaxKind
  /* 284 */ val CaseClause: typings.typescript.mod.SyntaxKind.CaseClause & Double = js.native
  
  @js.native
  sealed trait CaseKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 81 */ val CaseKeyword: typings.typescript.mod.SyntaxKind.CaseKeyword & Double = js.native
  
  @js.native
  sealed trait CatchClause
    extends StObject
       with SyntaxKind
  /* 287 */ val CatchClause: typings.typescript.mod.SyntaxKind.CatchClause & Double = js.native
  
  @js.native
  sealed trait CatchKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 82 */ val CatchKeyword: typings.typescript.mod.SyntaxKind.CatchKeyword & Double = js.native
  
  @js.native
  sealed trait ClassDeclaration
    extends StObject
       with SyntaxKind
  /* 252 */ val ClassDeclaration: typings.typescript.mod.SyntaxKind.ClassDeclaration & Double = js.native
  
  @js.native
  sealed trait ClassExpression
    extends StObject
       with SyntaxKind
  /* 221 */ val ClassExpression: typings.typescript.mod.SyntaxKind.ClassExpression & Double = js.native
  
  @js.native
  sealed trait ClassKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 83 */ val ClassKeyword: typings.typescript.mod.SyntaxKind.ClassKeyword & Double = js.native
  
  @js.native
  sealed trait CloseBraceToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 19 */ val CloseBraceToken: typings.typescript.mod.SyntaxKind.CloseBraceToken & Double = js.native
  
  @js.native
  sealed trait CloseBracketToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 23 */ val CloseBracketToken: typings.typescript.mod.SyntaxKind.CloseBracketToken & Double = js.native
  
  @js.native
  sealed trait CloseParenToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 21 */ val CloseParenToken: typings.typescript.mod.SyntaxKind.CloseParenToken & Double = js.native
  
  @js.native
  sealed trait ColonToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 58 */ val ColonToken: typings.typescript.mod.SyntaxKind.ColonToken & Double = js.native
  
  @js.native
  sealed trait CommaListExpression
    extends StObject
       with SyntaxKind
  /* 337 */ val CommaListExpression: typings.typescript.mod.SyntaxKind.CommaListExpression & Double = js.native
  
  @js.native
  sealed trait CommaToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
       with _BinaryOperator
  /* 27 */ val CommaToken: typings.typescript.mod.SyntaxKind.CommaToken & Double = js.native
  
  @js.native
  sealed trait ComputedPropertyName
    extends StObject
       with SyntaxKind
  /* 158 */ val ComputedPropertyName: typings.typescript.mod.SyntaxKind.ComputedPropertyName & Double = js.native
  
  @js.native
  sealed trait ConditionalExpression
    extends StObject
       with SyntaxKind
  /* 217 */ val ConditionalExpression: typings.typescript.mod.SyntaxKind.ConditionalExpression & Double = js.native
  
  @js.native
  sealed trait ConditionalType
    extends StObject
       with SyntaxKind
  /* 184 */ val ConditionalType: typings.typescript.mod.SyntaxKind.ConditionalType & Double = js.native
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with TriviaSyntaxKind
  /* 7 */ val ConflictMarkerTrivia: typings.typescript.mod.SyntaxKind.ConflictMarkerTrivia & Double = js.native
  
  @js.native
  sealed trait ConstKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 84 */ val ConstKeyword: typings.typescript.mod.SyntaxKind.ConstKeyword & Double = js.native
  
  @js.native
  sealed trait ConstructSignature
    extends StObject
       with SyntaxKind
  /* 170 */ val ConstructSignature: typings.typescript.mod.SyntaxKind.ConstructSignature & Double = js.native
  
  @js.native
  sealed trait Constructor
    extends StObject
       with SyntaxKind
  /* 166 */ val Constructor: typings.typescript.mod.SyntaxKind.Constructor & Double = js.native
  
  @js.native
  sealed trait ConstructorKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 132 */ val ConstructorKeyword: typings.typescript.mod.SyntaxKind.ConstructorKeyword & Double = js.native
  
  @js.native
  sealed trait ConstructorType
    extends StObject
       with SyntaxKind
  /* 175 */ val ConstructorType: typings.typescript.mod.SyntaxKind.ConstructorType & Double = js.native
  
  @js.native
  sealed trait ContinueKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 85 */ val ContinueKeyword: typings.typescript.mod.SyntaxKind.ContinueKeyword & Double = js.native
  
  @js.native
  sealed trait ContinueStatement
    extends StObject
       with SyntaxKind
  /* 240 */ val ContinueStatement: typings.typescript.mod.SyntaxKind.ContinueStatement & Double = js.native
  
  @js.native
  sealed trait Count
    extends StObject
       with SyntaxKind
  /* 341 */ val Count: typings.typescript.mod.SyntaxKind.Count & Double = js.native
  
  @js.native
  sealed trait DebuggerKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 86 */ val DebuggerKeyword: typings.typescript.mod.SyntaxKind.DebuggerKeyword & Double = js.native
  
  @js.native
  sealed trait DebuggerStatement
    extends StObject
       with SyntaxKind
  /* 248 */ val DebuggerStatement: typings.typescript.mod.SyntaxKind.DebuggerStatement & Double = js.native
  
  @js.native
  sealed trait DeclareKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 133 */ val DeclareKeyword: typings.typescript.mod.SyntaxKind.DeclareKeyword & Double = js.native
  
  @js.native
  sealed trait Decorator
    extends StObject
       with SyntaxKind
  /* 161 */ val Decorator: typings.typescript.mod.SyntaxKind.Decorator & Double = js.native
  
  @js.native
  sealed trait DefaultClause
    extends StObject
       with SyntaxKind
  /* 285 */ val DefaultClause: typings.typescript.mod.SyntaxKind.DefaultClause & Double = js.native
  
  @js.native
  sealed trait DefaultKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 87 */ val DefaultKeyword: typings.typescript.mod.SyntaxKind.DefaultKeyword & Double = js.native
  
  @js.native
  sealed trait DeleteExpression
    extends StObject
       with SyntaxKind
  /* 210 */ val DeleteExpression: typings.typescript.mod.SyntaxKind.DeleteExpression & Double = js.native
  
  @js.native
  sealed trait DeleteKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 88 */ val DeleteKeyword: typings.typescript.mod.SyntaxKind.DeleteKeyword & Double = js.native
  
  @js.native
  sealed trait DoKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 89 */ val DoKeyword: typings.typescript.mod.SyntaxKind.DoKeyword & Double = js.native
  
  @js.native
  sealed trait DoStatement
    extends StObject
       with SyntaxKind
  /* 235 */ val DoStatement: typings.typescript.mod.SyntaxKind.DoStatement & Double = js.native
  
  @js.native
  sealed trait DotDotDotToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 25 */ val DotDotDotToken: typings.typescript.mod.SyntaxKind.DotDotDotToken & Double = js.native
  
  @js.native
  sealed trait DotToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 24 */ val DotToken: typings.typescript.mod.SyntaxKind.DotToken & Double = js.native
  
  @js.native
  sealed trait ElementAccessExpression
    extends StObject
       with SyntaxKind
  /* 202 */ val ElementAccessExpression: typings.typescript.mod.SyntaxKind.ElementAccessExpression & Double = js.native
  
  @js.native
  sealed trait ElseKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 90 */ val ElseKeyword: typings.typescript.mod.SyntaxKind.ElseKeyword & Double = js.native
  
  @js.native
  sealed trait EmptyStatement
    extends StObject
       with SyntaxKind
  /* 231 */ val EmptyStatement: typings.typescript.mod.SyntaxKind.EmptyStatement & Double = js.native
  
  @js.native
  sealed trait EndOfDeclarationMarker
    extends StObject
       with SyntaxKind
  /* 339 */ val EndOfDeclarationMarker: typings.typescript.mod.SyntaxKind.EndOfDeclarationMarker & Double = js.native
  
  @js.native
  sealed trait EndOfFileToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with TokenSyntaxKind
  /* 1 */ val EndOfFileToken: typings.typescript.mod.SyntaxKind.EndOfFileToken & Double = js.native
  
  @js.native
  sealed trait EnumDeclaration
    extends StObject
       with SyntaxKind
  /* 255 */ val EnumDeclaration: typings.typescript.mod.SyntaxKind.EnumDeclaration & Double = js.native
  
  @js.native
  sealed trait EnumKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 91 */ val EnumKeyword: typings.typescript.mod.SyntaxKind.EnumKeyword & Double = js.native
  
  @js.native
  sealed trait EnumMember
    extends StObject
       with SyntaxKind
  /* 291 */ val EnumMember: typings.typescript.mod.SyntaxKind.EnumMember & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 36 */ val EqualsEqualsEqualsToken: typings.typescript.mod.SyntaxKind.EqualsEqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 34 */ val EqualsEqualsToken: typings.typescript.mod.SyntaxKind.EqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait EqualsGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 38 */ val EqualsGreaterThanToken: typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait EqualsToken
    extends StObject
       with SyntaxKind
       with AssignmentOperator
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 62 */ val EqualsToken: typings.typescript.mod.SyntaxKind.EqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 37 */ val ExclamationEqualsEqualsToken: typings.typescript.mod.SyntaxKind.ExclamationEqualsEqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends StObject
       with SyntaxKind
       with EqualityOperator
       with PunctuationSyntaxKind
  /* 35 */ val ExclamationEqualsToken: typings.typescript.mod.SyntaxKind.ExclamationEqualsToken & Double = js.native
  
  @js.native
  sealed trait ExclamationToken
    extends StObject
       with SyntaxKind
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 53 */ val ExclamationToken: typings.typescript.mod.SyntaxKind.ExclamationToken & Double = js.native
  
  @js.native
  sealed trait ExportAssignment
    extends StObject
       with SyntaxKind
  /* 266 */ val ExportAssignment: typings.typescript.mod.SyntaxKind.ExportAssignment & Double = js.native
  
  @js.native
  sealed trait ExportDeclaration
    extends StObject
       with SyntaxKind
  /* 267 */ val ExportDeclaration: typings.typescript.mod.SyntaxKind.ExportDeclaration & Double = js.native
  
  @js.native
  sealed trait ExportKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 92 */ val ExportKeyword: typings.typescript.mod.SyntaxKind.ExportKeyword & Double = js.native
  
  @js.native
  sealed trait ExportSpecifier
    extends StObject
       with SyntaxKind
  /* 270 */ val ExportSpecifier: typings.typescript.mod.SyntaxKind.ExportSpecifier & Double = js.native
  
  @js.native
  sealed trait ExpressionStatement
    extends StObject
       with SyntaxKind
  /* 233 */ val ExpressionStatement: typings.typescript.mod.SyntaxKind.ExpressionStatement & Double = js.native
  
  @js.native
  sealed trait ExpressionWithTypeArguments
    extends StObject
       with SyntaxKind
  /* 223 */ val ExpressionWithTypeArguments: typings.typescript.mod.SyntaxKind.ExpressionWithTypeArguments & Double = js.native
  
  @js.native
  sealed trait ExtendsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 93 */ val ExtendsKeyword: typings.typescript.mod.SyntaxKind.ExtendsKeyword & Double = js.native
  
  @js.native
  sealed trait ExternalModuleReference
    extends StObject
       with SyntaxKind
  /* 272 */ val ExternalModuleReference: typings.typescript.mod.SyntaxKind.ExternalModuleReference & Double = js.native
  
  @js.native
  sealed trait FalseKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 94 */ val FalseKeyword: typings.typescript.mod.SyntaxKind.FalseKeyword & Double = js.native
  
  @js.native
  sealed trait FinallyKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 95 */ val FinallyKeyword: typings.typescript.mod.SyntaxKind.FinallyKeyword & Double = js.native
  
  @js.native
  sealed trait FirstAssignment
    extends StObject
       with SyntaxKind
  /* 62 */ val FirstAssignment: typings.typescript.mod.SyntaxKind.FirstAssignment & Double = js.native
  
  @js.native
  sealed trait FirstBinaryOperator
    extends StObject
       with SyntaxKind
  /* 29 */ val FirstBinaryOperator: typings.typescript.mod.SyntaxKind.FirstBinaryOperator & Double = js.native
  
  @js.native
  sealed trait FirstCompoundAssignment
    extends StObject
       with SyntaxKind
  /* 63 */ val FirstCompoundAssignment: typings.typescript.mod.SyntaxKind.FirstCompoundAssignment & Double = js.native
  
  @js.native
  sealed trait FirstFutureReservedWord
    extends StObject
       with SyntaxKind
  /* 116 */ val FirstFutureReservedWord: typings.typescript.mod.SyntaxKind.FirstFutureReservedWord & Double = js.native
  
  @js.native
  sealed trait FirstJSDocNode
    extends StObject
       with SyntaxKind
  /* 301 */ val FirstJSDocNode: typings.typescript.mod.SyntaxKind.FirstJSDocNode & Double = js.native
  
  @js.native
  sealed trait FirstJSDocTagNode
    extends StObject
       with SyntaxKind
  /* 314 */ val FirstJSDocTagNode: typings.typescript.mod.SyntaxKind.FirstJSDocTagNode & Double = js.native
  
  @js.native
  sealed trait FirstKeyword
    extends StObject
       with SyntaxKind
  /* 80 */ val FirstKeyword: typings.typescript.mod.SyntaxKind.FirstKeyword & Double = js.native
  
  @js.native
  sealed trait FirstLiteralToken
    extends StObject
       with SyntaxKind
  /* 8 */ val FirstLiteralToken: typings.typescript.mod.SyntaxKind.FirstLiteralToken & Double = js.native
  
  @js.native
  sealed trait FirstNode
    extends StObject
       with SyntaxKind
  /* 157 */ val FirstNode: typings.typescript.mod.SyntaxKind.FirstNode & Double = js.native
  
  @js.native
  sealed trait FirstPunctuation
    extends StObject
       with SyntaxKind
  /* 18 */ val FirstPunctuation: typings.typescript.mod.SyntaxKind.FirstPunctuation & Double = js.native
  
  @js.native
  sealed trait FirstReservedWord
    extends StObject
       with SyntaxKind
  /* 80 */ val FirstReservedWord: typings.typescript.mod.SyntaxKind.FirstReservedWord & Double = js.native
  
  @js.native
  sealed trait FirstStatement
    extends StObject
       with SyntaxKind
  /* 232 */ val FirstStatement: typings.typescript.mod.SyntaxKind.FirstStatement & Double = js.native
  
  @js.native
  sealed trait FirstTemplateToken
    extends StObject
       with SyntaxKind
  /* 14 */ val FirstTemplateToken: typings.typescript.mod.SyntaxKind.FirstTemplateToken & Double = js.native
  
  @js.native
  sealed trait FirstToken
    extends StObject
       with SyntaxKind
  /* 0 */ val FirstToken: typings.typescript.mod.SyntaxKind.FirstToken & Double = js.native
  
  @js.native
  sealed trait FirstTriviaToken
    extends StObject
       with SyntaxKind
  /* 2 */ val FirstTriviaToken: typings.typescript.mod.SyntaxKind.FirstTriviaToken & Double = js.native
  
  @js.native
  sealed trait FirstTypeNode
    extends StObject
       with SyntaxKind
  /* 172 */ val FirstTypeNode: typings.typescript.mod.SyntaxKind.FirstTypeNode & Double = js.native
  
  @js.native
  sealed trait ForInStatement
    extends StObject
       with SyntaxKind
  /* 238 */ val ForInStatement: typings.typescript.mod.SyntaxKind.ForInStatement & Double = js.native
  
  @js.native
  sealed trait ForKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 96 */ val ForKeyword: typings.typescript.mod.SyntaxKind.ForKeyword & Double = js.native
  
  @js.native
  sealed trait ForOfStatement
    extends StObject
       with SyntaxKind
  /* 239 */ val ForOfStatement: typings.typescript.mod.SyntaxKind.ForOfStatement & Double = js.native
  
  @js.native
  sealed trait ForStatement
    extends StObject
       with SyntaxKind
  /* 237 */ val ForStatement: typings.typescript.mod.SyntaxKind.ForStatement & Double = js.native
  
  @js.native
  sealed trait FromKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 153 */ val FromKeyword: typings.typescript.mod.SyntaxKind.FromKeyword & Double = js.native
  
  @js.native
  sealed trait FunctionDeclaration
    extends StObject
       with SyntaxKind
  /* 251 */ val FunctionDeclaration: typings.typescript.mod.SyntaxKind.FunctionDeclaration & Double = js.native
  
  @js.native
  sealed trait FunctionExpression
    extends StObject
       with SyntaxKind
  /* 208 */ val FunctionExpression: typings.typescript.mod.SyntaxKind.FunctionExpression & Double = js.native
  
  @js.native
  sealed trait FunctionKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 97 */ val FunctionKeyword: typings.typescript.mod.SyntaxKind.FunctionKeyword & Double = js.native
  
  @js.native
  sealed trait FunctionType
    extends StObject
       with SyntaxKind
  /* 174 */ val FunctionType: typings.typescript.mod.SyntaxKind.FunctionType & Double = js.native
  
  @js.native
  sealed trait GetAccessor
    extends StObject
       with SyntaxKind
  /* 167 */ val GetAccessor: typings.typescript.mod.SyntaxKind.GetAccessor & Double = js.native
  
  @js.native
  sealed trait GetKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 134 */ val GetKeyword: typings.typescript.mod.SyntaxKind.GetKeyword & Double = js.native
  
  @js.native
  sealed trait GlobalKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 154 */ val GlobalKeyword: typings.typescript.mod.SyntaxKind.GlobalKeyword & Double = js.native
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 33 */ val GreaterThanEqualsToken: typings.typescript.mod.SyntaxKind.GreaterThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 70 */ val GreaterThanGreaterThanEqualsToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 71 */ val GreaterThanGreaterThanGreaterThanEqualsToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with ShiftOperator
  /* 49 */ val GreaterThanGreaterThanGreaterThanToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with ShiftOperator
  /* 48 */ val GreaterThanGreaterThanToken: typings.typescript.mod.SyntaxKind.GreaterThanGreaterThanToken & Double = js.native
  
  @js.native
  sealed trait GreaterThanToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 31 */ val GreaterThanToken: typings.typescript.mod.SyntaxKind.GreaterThanToken & Double = js.native
  
  @js.native
  sealed trait HeritageClause
    extends StObject
       with SyntaxKind
  /* 286 */ val HeritageClause: typings.typescript.mod.SyntaxKind.HeritageClause & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 78 */ val Identifier: typings.typescript.mod.SyntaxKind.Identifier & Double = js.native
  
  @js.native
  sealed trait IfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 98 */ val IfKeyword: typings.typescript.mod.SyntaxKind.IfKeyword & Double = js.native
  
  @js.native
  sealed trait IfStatement
    extends StObject
       with SyntaxKind
  /* 234 */ val IfStatement: typings.typescript.mod.SyntaxKind.IfStatement & Double = js.native
  
  @js.native
  sealed trait ImplementsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 116 */ val ImplementsKeyword: typings.typescript.mod.SyntaxKind.ImplementsKeyword & Double = js.native
  
  @js.native
  sealed trait ImportClause
    extends StObject
       with SyntaxKind
  /* 262 */ val ImportClause: typings.typescript.mod.SyntaxKind.ImportClause & Double = js.native
  
  @js.native
  sealed trait ImportDeclaration
    extends StObject
       with SyntaxKind
  /* 261 */ val ImportDeclaration: typings.typescript.mod.SyntaxKind.ImportDeclaration & Double = js.native
  
  @js.native
  sealed trait ImportEqualsDeclaration
    extends StObject
       with SyntaxKind
  /* 260 */ val ImportEqualsDeclaration: typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration & Double = js.native
  
  @js.native
  sealed trait ImportKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 99 */ val ImportKeyword: typings.typescript.mod.SyntaxKind.ImportKeyword & Double = js.native
  
  @js.native
  sealed trait ImportSpecifier
    extends StObject
       with SyntaxKind
  /* 265 */ val ImportSpecifier: typings.typescript.mod.SyntaxKind.ImportSpecifier & Double = js.native
  
  @js.native
  sealed trait ImportType
    extends StObject
       with SyntaxKind
  /* 195 */ val ImportType: typings.typescript.mod.SyntaxKind.ImportType & Double = js.native
  
  @js.native
  sealed trait InKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with RelationalOperator
  /* 100 */ val InKeyword: typings.typescript.mod.SyntaxKind.InKeyword & Double = js.native
  
  @js.native
  sealed trait IndexSignature
    extends StObject
       with SyntaxKind
  /* 171 */ val IndexSignature: typings.typescript.mod.SyntaxKind.IndexSignature & Double = js.native
  
  @js.native
  sealed trait IndexedAccessType
    extends StObject
       with SyntaxKind
  /* 189 */ val IndexedAccessType: typings.typescript.mod.SyntaxKind.IndexedAccessType & Double = js.native
  
  @js.native
  sealed trait InferKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 135 */ val InferKeyword: typings.typescript.mod.SyntaxKind.InferKeyword & Double = js.native
  
  @js.native
  sealed trait InferType
    extends StObject
       with SyntaxKind
  /* 185 */ val InferType: typings.typescript.mod.SyntaxKind.InferType & Double = js.native
  
  @js.native
  sealed trait InputFiles
    extends StObject
       with SyntaxKind
  /* 300 */ val InputFiles: typings.typescript.mod.SyntaxKind.InputFiles & Double = js.native
  
  @js.native
  sealed trait InstanceOfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with RelationalOperator
  /* 101 */ val InstanceOfKeyword: typings.typescript.mod.SyntaxKind.InstanceOfKeyword & Double = js.native
  
  @js.native
  sealed trait InterfaceDeclaration
    extends StObject
       with SyntaxKind
  /* 253 */ val InterfaceDeclaration: typings.typescript.mod.SyntaxKind.InterfaceDeclaration & Double = js.native
  
  @js.native
  sealed trait InterfaceKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 117 */ val InterfaceKeyword: typings.typescript.mod.SyntaxKind.InterfaceKeyword & Double = js.native
  
  @js.native
  sealed trait IntersectionType
    extends StObject
       with SyntaxKind
  /* 183 */ val IntersectionType: typings.typescript.mod.SyntaxKind.IntersectionType & Double = js.native
  
  @js.native
  sealed trait IntrinsicKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 136 */ val IntrinsicKeyword: typings.typescript.mod.SyntaxKind.IntrinsicKeyword & Double = js.native
  
  @js.native
  sealed trait IsKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 137 */ val IsKeyword: typings.typescript.mod.SyntaxKind.IsKeyword & Double = js.native
  
  @js.native
  sealed trait JSDocAllType
    extends StObject
       with SyntaxKind
  /* 303 */ val JSDocAllType: typings.typescript.mod.SyntaxKind.JSDocAllType & Double = js.native
  
  @js.native
  sealed trait JSDocAugmentsTag
    extends StObject
       with SyntaxKind
  /* 315 */ val JSDocAugmentsTag: typings.typescript.mod.SyntaxKind.JSDocAugmentsTag & Double = js.native
  
  @js.native
  sealed trait JSDocAuthorTag
    extends StObject
       with SyntaxKind
  /* 317 */ val JSDocAuthorTag: typings.typescript.mod.SyntaxKind.JSDocAuthorTag & Double = js.native
  
  @js.native
  sealed trait JSDocCallbackTag
    extends StObject
       with SyntaxKind
  /* 324 */ val JSDocCallbackTag: typings.typescript.mod.SyntaxKind.JSDocCallbackTag & Double = js.native
  
  @js.native
  sealed trait JSDocClassTag
    extends StObject
       with SyntaxKind
  /* 319 */ val JSDocClassTag: typings.typescript.mod.SyntaxKind.JSDocClassTag & Double = js.native
  
  @js.native
  sealed trait JSDocComment
    extends StObject
       with SyntaxKind
  /* 311 */ val JSDocComment: typings.typescript.mod.SyntaxKind.JSDocComment & Double = js.native
  
  @js.native
  sealed trait JSDocDeprecatedTag
    extends StObject
       with SyntaxKind
  /* 318 */ val JSDocDeprecatedTag: typings.typescript.mod.SyntaxKind.JSDocDeprecatedTag & Double = js.native
  
  @js.native
  sealed trait JSDocEnumTag
    extends StObject
       with SyntaxKind
  /* 325 */ val JSDocEnumTag: typings.typescript.mod.SyntaxKind.JSDocEnumTag & Double = js.native
  
  @js.native
  sealed trait JSDocFunctionType
    extends StObject
       with SyntaxKind
  /* 308 */ val JSDocFunctionType: typings.typescript.mod.SyntaxKind.JSDocFunctionType & Double = js.native
  
  @js.native
  sealed trait JSDocImplementsTag
    extends StObject
       with SyntaxKind
  /* 316 */ val JSDocImplementsTag: typings.typescript.mod.SyntaxKind.JSDocImplementsTag & Double = js.native
  
  @js.native
  sealed trait JSDocNameReference
    extends StObject
       with SyntaxKind
  /* 302 */ val JSDocNameReference: typings.typescript.mod.SyntaxKind.JSDocNameReference & Double = js.native
  
  @js.native
  sealed trait JSDocNamepathType
    extends StObject
       with SyntaxKind
  /* 310 */ val JSDocNamepathType: typings.typescript.mod.SyntaxKind.JSDocNamepathType & Double = js.native
  
  @js.native
  sealed trait JSDocNonNullableType
    extends StObject
       with SyntaxKind
  /* 306 */ val JSDocNonNullableType: typings.typescript.mod.SyntaxKind.JSDocNonNullableType & Double = js.native
  
  @js.native
  sealed trait JSDocNullableType
    extends StObject
       with SyntaxKind
  /* 305 */ val JSDocNullableType: typings.typescript.mod.SyntaxKind.JSDocNullableType & Double = js.native
  
  @js.native
  sealed trait JSDocOptionalType
    extends StObject
       with SyntaxKind
  /* 307 */ val JSDocOptionalType: typings.typescript.mod.SyntaxKind.JSDocOptionalType & Double = js.native
  
  @js.native
  sealed trait JSDocParameterTag
    extends StObject
       with SyntaxKind
  /* 326 */ val JSDocParameterTag: typings.typescript.mod.SyntaxKind.JSDocParameterTag & Double = js.native
  
  @js.native
  sealed trait JSDocPrivateTag
    extends StObject
       with SyntaxKind
  /* 321 */ val JSDocPrivateTag: typings.typescript.mod.SyntaxKind.JSDocPrivateTag & Double = js.native
  
  @js.native
  sealed trait JSDocPropertyTag
    extends StObject
       with SyntaxKind
  /* 333 */ val JSDocPropertyTag: typings.typescript.mod.SyntaxKind.JSDocPropertyTag & Double = js.native
  
  @js.native
  sealed trait JSDocProtectedTag
    extends StObject
       with SyntaxKind
  /* 322 */ val JSDocProtectedTag: typings.typescript.mod.SyntaxKind.JSDocProtectedTag & Double = js.native
  
  @js.native
  sealed trait JSDocPublicTag
    extends StObject
       with SyntaxKind
  /* 320 */ val JSDocPublicTag: typings.typescript.mod.SyntaxKind.JSDocPublicTag & Double = js.native
  
  @js.native
  sealed trait JSDocReadonlyTag
    extends StObject
       with SyntaxKind
  /* 323 */ val JSDocReadonlyTag: typings.typescript.mod.SyntaxKind.JSDocReadonlyTag & Double = js.native
  
  @js.native
  sealed trait JSDocReturnTag
    extends StObject
       with SyntaxKind
  /* 327 */ val JSDocReturnTag: typings.typescript.mod.SyntaxKind.JSDocReturnTag & Double = js.native
  
  @js.native
  sealed trait JSDocSeeTag
    extends StObject
       with SyntaxKind
  /* 332 */ val JSDocSeeTag: typings.typescript.mod.SyntaxKind.JSDocSeeTag & Double = js.native
  
  @js.native
  sealed trait JSDocSignature
    extends StObject
       with SyntaxKind
  /* 313 */ val JSDocSignature: typings.typescript.mod.SyntaxKind.JSDocSignature & Double = js.native
  
  @js.native
  sealed trait JSDocTag
    extends StObject
       with SyntaxKind
  /* 314 */ val JSDocTag: typings.typescript.mod.SyntaxKind.JSDocTag & Double = js.native
  
  @js.native
  sealed trait JSDocTemplateTag
    extends StObject
       with SyntaxKind
  /* 330 */ val JSDocTemplateTag: typings.typescript.mod.SyntaxKind.JSDocTemplateTag & Double = js.native
  
  @js.native
  sealed trait JSDocThisTag
    extends StObject
       with SyntaxKind
  /* 328 */ val JSDocThisTag: typings.typescript.mod.SyntaxKind.JSDocThisTag & Double = js.native
  
  @js.native
  sealed trait JSDocTypeExpression
    extends StObject
       with SyntaxKind
  /* 301 */ val JSDocTypeExpression: typings.typescript.mod.SyntaxKind.JSDocTypeExpression & Double = js.native
  
  @js.native
  sealed trait JSDocTypeLiteral
    extends StObject
       with SyntaxKind
  /* 312 */ val JSDocTypeLiteral: typings.typescript.mod.SyntaxKind.JSDocTypeLiteral & Double = js.native
  
  @js.native
  sealed trait JSDocTypeTag
    extends StObject
       with SyntaxKind
  /* 329 */ val JSDocTypeTag: typings.typescript.mod.SyntaxKind.JSDocTypeTag & Double = js.native
  
  @js.native
  sealed trait JSDocTypedefTag
    extends StObject
       with SyntaxKind
  /* 331 */ val JSDocTypedefTag: typings.typescript.mod.SyntaxKind.JSDocTypedefTag & Double = js.native
  
  @js.native
  sealed trait JSDocUnknownType
    extends StObject
       with SyntaxKind
  /* 304 */ val JSDocUnknownType: typings.typescript.mod.SyntaxKind.JSDocUnknownType & Double = js.native
  
  @js.native
  sealed trait JSDocVariadicType
    extends StObject
       with SyntaxKind
  /* 309 */ val JSDocVariadicType: typings.typescript.mod.SyntaxKind.JSDocVariadicType & Double = js.native
  
  @js.native
  sealed trait JsxAttribute
    extends StObject
       with SyntaxKind
  /* 280 */ val JsxAttribute: typings.typescript.mod.SyntaxKind.JsxAttribute & Double = js.native
  
  @js.native
  sealed trait JsxAttributes
    extends StObject
       with SyntaxKind
  /* 281 */ val JsxAttributes: typings.typescript.mod.SyntaxKind.JsxAttributes & Double = js.native
  
  @js.native
  sealed trait JsxClosingElement
    extends StObject
       with SyntaxKind
  /* 276 */ val JsxClosingElement: typings.typescript.mod.SyntaxKind.JsxClosingElement & Double = js.native
  
  @js.native
  sealed trait JsxClosingFragment
    extends StObject
       with SyntaxKind
  /* 279 */ val JsxClosingFragment: typings.typescript.mod.SyntaxKind.JsxClosingFragment & Double = js.native
  
  @js.native
  sealed trait JsxElement
    extends StObject
       with SyntaxKind
  /* 273 */ val JsxElement: typings.typescript.mod.SyntaxKind.JsxElement & Double = js.native
  
  @js.native
  sealed trait JsxExpression
    extends StObject
       with SyntaxKind
  /* 283 */ val JsxExpression: typings.typescript.mod.SyntaxKind.JsxExpression & Double = js.native
  
  @js.native
  sealed trait JsxFragment
    extends StObject
       with SyntaxKind
  /* 277 */ val JsxFragment: typings.typescript.mod.SyntaxKind.JsxFragment & Double = js.native
  
  @js.native
  sealed trait JsxOpeningElement
    extends StObject
       with SyntaxKind
  /* 275 */ val JsxOpeningElement: typings.typescript.mod.SyntaxKind.JsxOpeningElement & Double = js.native
  
  @js.native
  sealed trait JsxOpeningFragment
    extends StObject
       with SyntaxKind
  /* 278 */ val JsxOpeningFragment: typings.typescript.mod.SyntaxKind.JsxOpeningFragment & Double = js.native
  
  @js.native
  sealed trait JsxSelfClosingElement
    extends StObject
       with SyntaxKind
  /* 274 */ val JsxSelfClosingElement: typings.typescript.mod.SyntaxKind.JsxSelfClosingElement & Double = js.native
  
  @js.native
  sealed trait JsxSpreadAttribute
    extends StObject
       with SyntaxKind
  /* 282 */ val JsxSpreadAttribute: typings.typescript.mod.SyntaxKind.JsxSpreadAttribute & Double = js.native
  
  @js.native
  sealed trait JsxText
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with LiteralSyntaxKind
  /* 11 */ val JsxText: typings.typescript.mod.SyntaxKind.JsxText & Double = js.native
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with LiteralSyntaxKind
  /* 12 */ val JsxTextAllWhiteSpaces: typings.typescript.mod.SyntaxKind.JsxTextAllWhiteSpaces & Double = js.native
  
  @js.native
  sealed trait KeyOfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 138 */ val KeyOfKeyword: typings.typescript.mod.SyntaxKind.KeyOfKeyword & Double = js.native
  
  @js.native
  sealed trait LabeledStatement
    extends StObject
       with SyntaxKind
  /* 245 */ val LabeledStatement: typings.typescript.mod.SyntaxKind.LabeledStatement & Double = js.native
  
  @js.native
  sealed trait LastAssignment
    extends StObject
       with SyntaxKind
  /* 77 */ val LastAssignment: typings.typescript.mod.SyntaxKind.LastAssignment & Double = js.native
  
  @js.native
  sealed trait LastBinaryOperator
    extends StObject
       with SyntaxKind
  /* 77 */ val LastBinaryOperator: typings.typescript.mod.SyntaxKind.LastBinaryOperator & Double = js.native
  
  @js.native
  sealed trait LastCompoundAssignment
    extends StObject
       with SyntaxKind
  /* 77 */ val LastCompoundAssignment: typings.typescript.mod.SyntaxKind.LastCompoundAssignment & Double = js.native
  
  @js.native
  sealed trait LastFutureReservedWord
    extends StObject
       with SyntaxKind
  /* 124 */ val LastFutureReservedWord: typings.typescript.mod.SyntaxKind.LastFutureReservedWord & Double = js.native
  
  @js.native
  sealed trait LastJSDocNode
    extends StObject
       with SyntaxKind
  /* 333 */ val LastJSDocNode: typings.typescript.mod.SyntaxKind.LastJSDocNode & Double = js.native
  
  @js.native
  sealed trait LastJSDocTagNode
    extends StObject
       with SyntaxKind
  /* 333 */ val LastJSDocTagNode: typings.typescript.mod.SyntaxKind.LastJSDocTagNode & Double = js.native
  
  @js.native
  sealed trait LastKeyword
    extends StObject
       with SyntaxKind
  /* 156 */ val LastKeyword: typings.typescript.mod.SyntaxKind.LastKeyword & Double = js.native
  
  @js.native
  sealed trait LastLiteralToken
    extends StObject
       with SyntaxKind
  /* 14 */ val LastLiteralToken: typings.typescript.mod.SyntaxKind.LastLiteralToken & Double = js.native
  
  @js.native
  sealed trait LastPunctuation
    extends StObject
       with SyntaxKind
  /* 77 */ val LastPunctuation: typings.typescript.mod.SyntaxKind.LastPunctuation & Double = js.native
  
  @js.native
  sealed trait LastReservedWord
    extends StObject
       with SyntaxKind
  /* 115 */ val LastReservedWord: typings.typescript.mod.SyntaxKind.LastReservedWord & Double = js.native
  
  @js.native
  sealed trait LastStatement
    extends StObject
       with SyntaxKind
  /* 248 */ val LastStatement: typings.typescript.mod.SyntaxKind.LastStatement & Double = js.native
  
  @js.native
  sealed trait LastTemplateToken
    extends StObject
       with SyntaxKind
  /* 17 */ val LastTemplateToken: typings.typescript.mod.SyntaxKind.LastTemplateToken & Double = js.native
  
  @js.native
  sealed trait LastToken
    extends StObject
       with SyntaxKind
  /* 156 */ val LastToken: typings.typescript.mod.SyntaxKind.LastToken & Double = js.native
  
  @js.native
  sealed trait LastTriviaToken
    extends StObject
       with SyntaxKind
  /* 7 */ val LastTriviaToken: typings.typescript.mod.SyntaxKind.LastTriviaToken & Double = js.native
  
  @js.native
  sealed trait LastTypeNode
    extends StObject
       with SyntaxKind
  /* 195 */ val LastTypeNode: typings.typescript.mod.SyntaxKind.LastTypeNode & Double = js.native
  
  @js.native
  sealed trait LessThanEqualsToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 32 */ val LessThanEqualsToken: typings.typescript.mod.SyntaxKind.LessThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 69 */ val LessThanLessThanEqualsToken: typings.typescript.mod.SyntaxKind.LessThanLessThanEqualsToken & Double = js.native
  
  @js.native
  sealed trait LessThanLessThanToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with ShiftOperator
  /* 47 */ val LessThanLessThanToken: typings.typescript.mod.SyntaxKind.LessThanLessThanToken & Double = js.native
  
  @js.native
  sealed trait LessThanSlashToken
    extends StObject
       with SyntaxKind
       with JsxTokenSyntaxKind
       with PunctuationSyntaxKind
  /* 30 */ val LessThanSlashToken: typings.typescript.mod.SyntaxKind.LessThanSlashToken & Double = js.native
  
  @js.native
  sealed trait LessThanToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with PunctuationSyntaxKind
       with RelationalOperator
  /* 29 */ val LessThanToken: typings.typescript.mod.SyntaxKind.LessThanToken & Double = js.native
  
  @js.native
  sealed trait LetKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 118 */ val LetKeyword: typings.typescript.mod.SyntaxKind.LetKeyword & Double = js.native
  
  @js.native
  sealed trait LiteralType
    extends StObject
       with SyntaxKind
  /* 191 */ val LiteralType: typings.typescript.mod.SyntaxKind.LiteralType & Double = js.native
  
  @js.native
  sealed trait MappedType
    extends StObject
       with SyntaxKind
  /* 190 */ val MappedType: typings.typescript.mod.SyntaxKind.MappedType & Double = js.native
  
  @js.native
  sealed trait MergeDeclarationMarker
    extends StObject
       with SyntaxKind
  /* 338 */ val MergeDeclarationMarker: typings.typescript.mod.SyntaxKind.MergeDeclarationMarker & Double = js.native
  
  @js.native
  sealed trait MetaProperty
    extends StObject
       with SyntaxKind
  /* 226 */ val MetaProperty: typings.typescript.mod.SyntaxKind.MetaProperty & Double = js.native
  
  @js.native
  sealed trait MethodDeclaration
    extends StObject
       with SyntaxKind
  /* 165 */ val MethodDeclaration: typings.typescript.mod.SyntaxKind.MethodDeclaration & Double = js.native
  
  @js.native
  sealed trait MethodSignature
    extends StObject
       with SyntaxKind
  /* 164 */ val MethodSignature: typings.typescript.mod.SyntaxKind.MethodSignature & Double = js.native
  
  @js.native
  sealed trait MinusEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 64 */ val MinusEqualsToken: typings.typescript.mod.SyntaxKind.MinusEqualsToken & Double = js.native
  
  @js.native
  sealed trait MinusMinusToken
    extends StObject
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 46 */ val MinusMinusToken: typings.typescript.mod.SyntaxKind.MinusMinusToken & Double = js.native
  
  @js.native
  sealed trait MinusToken
    extends StObject
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 40 */ val MinusToken: typings.typescript.mod.SyntaxKind.MinusToken & Double = js.native
  
  @js.native
  sealed trait MissingDeclaration
    extends StObject
       with SyntaxKind
  /* 271 */ val MissingDeclaration: typings.typescript.mod.SyntaxKind.MissingDeclaration & Double = js.native
  
  @js.native
  sealed trait ModuleBlock
    extends StObject
       with SyntaxKind
  /* 257 */ val ModuleBlock: typings.typescript.mod.SyntaxKind.ModuleBlock & Double = js.native
  
  @js.native
  sealed trait ModuleDeclaration
    extends StObject
       with SyntaxKind
  /* 256 */ val ModuleDeclaration: typings.typescript.mod.SyntaxKind.ModuleDeclaration & Double = js.native
  
  @js.native
  sealed trait ModuleKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 139 */ val ModuleKeyword: typings.typescript.mod.SyntaxKind.ModuleKeyword & Double = js.native
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentKind
       with TriviaSyntaxKind
  /* 3 */ val MultiLineCommentTrivia: typings.typescript.mod.SyntaxKind.MultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait NamedExports
    extends StObject
       with SyntaxKind
  /* 268 */ val NamedExports: typings.typescript.mod.SyntaxKind.NamedExports & Double = js.native
  
  @js.native
  sealed trait NamedImports
    extends StObject
       with SyntaxKind
  /* 264 */ val NamedImports: typings.typescript.mod.SyntaxKind.NamedImports & Double = js.native
  
  @js.native
  sealed trait NamedTupleMember
    extends StObject
       with SyntaxKind
  /* 192 */ val NamedTupleMember: typings.typescript.mod.SyntaxKind.NamedTupleMember & Double = js.native
  
  @js.native
  sealed trait NamespaceExport
    extends StObject
       with SyntaxKind
  /* 269 */ val NamespaceExport: typings.typescript.mod.SyntaxKind.NamespaceExport & Double = js.native
  
  @js.native
  sealed trait NamespaceExportDeclaration
    extends StObject
       with SyntaxKind
  /* 259 */ val NamespaceExportDeclaration: typings.typescript.mod.SyntaxKind.NamespaceExportDeclaration & Double = js.native
  
  @js.native
  sealed trait NamespaceImport
    extends StObject
       with SyntaxKind
  /* 263 */ val NamespaceImport: typings.typescript.mod.SyntaxKind.NamespaceImport & Double = js.native
  
  @js.native
  sealed trait NamespaceKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 140 */ val NamespaceKeyword: typings.typescript.mod.SyntaxKind.NamespaceKeyword & Double = js.native
  
  @js.native
  sealed trait NeverKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 141 */ val NeverKeyword: typings.typescript.mod.SyntaxKind.NeverKeyword & Double = js.native
  
  @js.native
  sealed trait NewExpression
    extends StObject
       with SyntaxKind
  /* 204 */ val NewExpression: typings.typescript.mod.SyntaxKind.NewExpression & Double = js.native
  
  @js.native
  sealed trait NewKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 102 */ val NewKeyword: typings.typescript.mod.SyntaxKind.NewKeyword & Double = js.native
  
  @js.native
  sealed trait NewLineTrivia
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TriviaSyntaxKind
  /* 4 */ val NewLineTrivia: typings.typescript.mod.SyntaxKind.NewLineTrivia & Double = js.native
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 14 */ val NoSubstitutionTemplateLiteral: typings.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral & Double = js.native
  
  @js.native
  sealed trait NonNullExpression
    extends StObject
       with SyntaxKind
  /* 225 */ val NonNullExpression: typings.typescript.mod.SyntaxKind.NonNullExpression & Double = js.native
  
  @js.native
  sealed trait NotEmittedStatement
    extends StObject
       with SyntaxKind
  /* 335 */ val NotEmittedStatement: typings.typescript.mod.SyntaxKind.NotEmittedStatement & Double = js.native
  
  @js.native
  sealed trait NullKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 103 */ val NullKeyword: typings.typescript.mod.SyntaxKind.NullKeyword & Double = js.native
  
  @js.native
  sealed trait NumberKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 144 */ val NumberKeyword: typings.typescript.mod.SyntaxKind.NumberKeyword & Double = js.native
  
  @js.native
  sealed trait NumericLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 8 */ val NumericLiteral: typings.typescript.mod.SyntaxKind.NumericLiteral & Double = js.native
  
  @js.native
  sealed trait ObjectBindingPattern
    extends StObject
       with SyntaxKind
  /* 196 */ val ObjectBindingPattern: typings.typescript.mod.SyntaxKind.ObjectBindingPattern & Double = js.native
  
  @js.native
  sealed trait ObjectKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 145 */ val ObjectKeyword: typings.typescript.mod.SyntaxKind.ObjectKeyword & Double = js.native
  
  @js.native
  sealed trait ObjectLiteralExpression
    extends StObject
       with SyntaxKind
  /* 200 */ val ObjectLiteralExpression: typings.typescript.mod.SyntaxKind.ObjectLiteralExpression & Double = js.native
  
  @js.native
  sealed trait OfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 156 */ val OfKeyword: typings.typescript.mod.SyntaxKind.OfKeyword & Double = js.native
  
  @js.native
  sealed trait OmittedExpression
    extends StObject
       with SyntaxKind
  /* 222 */ val OmittedExpression: typings.typescript.mod.SyntaxKind.OmittedExpression & Double = js.native
  
  @js.native
  sealed trait OpenBraceToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with PunctuationSyntaxKind
  /* 18 */ val OpenBraceToken: typings.typescript.mod.SyntaxKind.OpenBraceToken & Double = js.native
  
  @js.native
  sealed trait OpenBracketToken
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with PunctuationSyntaxKind
  /* 22 */ val OpenBracketToken: typings.typescript.mod.SyntaxKind.OpenBracketToken & Double = js.native
  
  @js.native
  sealed trait OpenParenToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 20 */ val OpenParenToken: typings.typescript.mod.SyntaxKind.OpenParenToken & Double = js.native
  
  @js.native
  sealed trait OptionalType
    extends StObject
       with SyntaxKind
  /* 180 */ val OptionalType: typings.typescript.mod.SyntaxKind.OptionalType & Double = js.native
  
  @js.native
  sealed trait PackageKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 119 */ val PackageKeyword: typings.typescript.mod.SyntaxKind.PackageKeyword & Double = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with SyntaxKind
  /* 160 */ val Parameter: typings.typescript.mod.SyntaxKind.Parameter & Double = js.native
  
  @js.native
  sealed trait ParenthesizedExpression
    extends StObject
       with SyntaxKind
  /* 207 */ val ParenthesizedExpression: typings.typescript.mod.SyntaxKind.ParenthesizedExpression & Double = js.native
  
  @js.native
  sealed trait ParenthesizedType
    extends StObject
       with SyntaxKind
  /* 186 */ val ParenthesizedType: typings.typescript.mod.SyntaxKind.ParenthesizedType & Double = js.native
  
  @js.native
  sealed trait PartiallyEmittedExpression
    extends StObject
       with SyntaxKind
  /* 336 */ val PartiallyEmittedExpression: typings.typescript.mod.SyntaxKind.PartiallyEmittedExpression & Double = js.native
  
  @js.native
  sealed trait PercentEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 68 */ val PercentEqualsToken: typings.typescript.mod.SyntaxKind.PercentEqualsToken & Double = js.native
  
  @js.native
  sealed trait PercentToken
    extends StObject
       with SyntaxKind
       with MultiplicativeOperator
       with PunctuationSyntaxKind
  /* 44 */ val PercentToken: typings.typescript.mod.SyntaxKind.PercentToken & Double = js.native
  
  @js.native
  sealed trait PlusEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 63 */ val PlusEqualsToken: typings.typescript.mod.SyntaxKind.PlusEqualsToken & Double = js.native
  
  @js.native
  sealed trait PlusPlusToken
    extends StObject
       with SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 45 */ val PlusPlusToken: typings.typescript.mod.SyntaxKind.PlusPlusToken & Double = js.native
  
  @js.native
  sealed trait PlusToken
    extends StObject
       with SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 39 */ val PlusToken: typings.typescript.mod.SyntaxKind.PlusToken & Double = js.native
  
  @js.native
  sealed trait PostfixUnaryExpression
    extends StObject
       with SyntaxKind
  /* 215 */ val PostfixUnaryExpression: typings.typescript.mod.SyntaxKind.PostfixUnaryExpression & Double = js.native
  
  @js.native
  sealed trait PrefixUnaryExpression
    extends StObject
       with SyntaxKind
  /* 214 */ val PrefixUnaryExpression: typings.typescript.mod.SyntaxKind.PrefixUnaryExpression & Double = js.native
  
  @js.native
  sealed trait PrivateIdentifier
    extends StObject
       with SyntaxKind
  /* 79 */ val PrivateIdentifier: typings.typescript.mod.SyntaxKind.PrivateIdentifier & Double = js.native
  
  @js.native
  sealed trait PrivateKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 120 */ val PrivateKeyword: typings.typescript.mod.SyntaxKind.PrivateKeyword & Double = js.native
  
  @js.native
  sealed trait PropertyAccessExpression
    extends StObject
       with SyntaxKind
  /* 201 */ val PropertyAccessExpression: typings.typescript.mod.SyntaxKind.PropertyAccessExpression & Double = js.native
  
  @js.native
  sealed trait PropertyAssignment
    extends StObject
       with SyntaxKind
  /* 288 */ val PropertyAssignment: typings.typescript.mod.SyntaxKind.PropertyAssignment & Double = js.native
  
  @js.native
  sealed trait PropertyDeclaration
    extends StObject
       with SyntaxKind
  /* 163 */ val PropertyDeclaration: typings.typescript.mod.SyntaxKind.PropertyDeclaration & Double = js.native
  
  @js.native
  sealed trait PropertySignature
    extends StObject
       with SyntaxKind
  /* 162 */ val PropertySignature: typings.typescript.mod.SyntaxKind.PropertySignature & Double = js.native
  
  @js.native
  sealed trait ProtectedKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 121 */ val ProtectedKeyword: typings.typescript.mod.SyntaxKind.ProtectedKeyword & Double = js.native
  
  @js.native
  sealed trait PublicKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 122 */ val PublicKeyword: typings.typescript.mod.SyntaxKind.PublicKeyword & Double = js.native
  
  @js.native
  sealed trait QualifiedName
    extends StObject
       with SyntaxKind
  /* 157 */ val QualifiedName: typings.typescript.mod.SyntaxKind.QualifiedName & Double = js.native
  
  @js.native
  sealed trait QuestionDotToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 28 */ val QuestionDotToken: typings.typescript.mod.SyntaxKind.QuestionDotToken & Double = js.native
  
  @js.native
  sealed trait QuestionQuestionEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with LogicalOrCoalescingAssignmentOperator
  /* 76 */ val QuestionQuestionEqualsToken: typings.typescript.mod.SyntaxKind.QuestionQuestionEqualsToken & Double = js.native
  
  @js.native
  sealed trait QuestionQuestionToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
       with _AssignmentOperatorOrHigher
  /* 60 */ val QuestionQuestionToken: typings.typescript.mod.SyntaxKind.QuestionQuestionToken & Double = js.native
  
  @js.native
  sealed trait QuestionToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 57 */ val QuestionToken: typings.typescript.mod.SyntaxKind.QuestionToken & Double = js.native
  
  @js.native
  sealed trait ReadonlyKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 142 */ val ReadonlyKeyword: typings.typescript.mod.SyntaxKind.ReadonlyKeyword & Double = js.native
  
  @js.native
  sealed trait RegularExpressionLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 13 */ val RegularExpressionLiteral: typings.typescript.mod.SyntaxKind.RegularExpressionLiteral & Double = js.native
  
  @js.native
  sealed trait RequireKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 143 */ val RequireKeyword: typings.typescript.mod.SyntaxKind.RequireKeyword & Double = js.native
  
  @js.native
  sealed trait RestType
    extends StObject
       with SyntaxKind
  /* 181 */ val RestType: typings.typescript.mod.SyntaxKind.RestType & Double = js.native
  
  @js.native
  sealed trait ReturnKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 104 */ val ReturnKeyword: typings.typescript.mod.SyntaxKind.ReturnKeyword & Double = js.native
  
  @js.native
  sealed trait ReturnStatement
    extends StObject
       with SyntaxKind
  /* 242 */ val ReturnStatement: typings.typescript.mod.SyntaxKind.ReturnStatement & Double = js.native
  
  @js.native
  sealed trait SemicolonClassElement
    extends StObject
       with SyntaxKind
  /* 229 */ val SemicolonClassElement: typings.typescript.mod.SyntaxKind.SemicolonClassElement & Double = js.native
  
  @js.native
  sealed trait SemicolonToken
    extends StObject
       with SyntaxKind
       with PunctuationSyntaxKind
  /* 26 */ val SemicolonToken: typings.typescript.mod.SyntaxKind.SemicolonToken & Double = js.native
  
  @js.native
  sealed trait SetAccessor
    extends StObject
       with SyntaxKind
  /* 168 */ val SetAccessor: typings.typescript.mod.SyntaxKind.SetAccessor & Double = js.native
  
  @js.native
  sealed trait SetKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 146 */ val SetKeyword: typings.typescript.mod.SyntaxKind.SetKeyword & Double = js.native
  
  @js.native
  sealed trait ShebangTrivia
    extends StObject
       with SyntaxKind
       with TriviaSyntaxKind
  /* 6 */ val ShebangTrivia: typings.typescript.mod.SyntaxKind.ShebangTrivia & Double = js.native
  
  @js.native
  sealed trait ShorthandPropertyAssignment
    extends StObject
       with SyntaxKind
  /* 289 */ val ShorthandPropertyAssignment: typings.typescript.mod.SyntaxKind.ShorthandPropertyAssignment & Double = js.native
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends StObject
       with SyntaxKind
       with CommentKind
       with TriviaSyntaxKind
  /* 2 */ val SingleLineCommentTrivia: typings.typescript.mod.SyntaxKind.SingleLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait SlashEqualsToken
    extends StObject
       with SyntaxKind
       with CompoundAssignmentOperator
       with PunctuationSyntaxKind
  /* 67 */ val SlashEqualsToken: typings.typescript.mod.SyntaxKind.SlashEqualsToken & Double = js.native
  
  @js.native
  sealed trait SlashToken
    extends StObject
       with SyntaxKind
       with MultiplicativeOperator
       with PunctuationSyntaxKind
  /* 43 */ val SlashToken: typings.typescript.mod.SyntaxKind.SlashToken & Double = js.native
  
  @js.native
  sealed trait SourceFile
    extends StObject
       with SyntaxKind
  /* 297 */ val SourceFile: typings.typescript.mod.SyntaxKind.SourceFile & Double = js.native
  
  @js.native
  sealed trait SpreadAssignment
    extends StObject
       with SyntaxKind
  /* 290 */ val SpreadAssignment: typings.typescript.mod.SyntaxKind.SpreadAssignment & Double = js.native
  
  @js.native
  sealed trait SpreadElement
    extends StObject
       with SyntaxKind
  /* 220 */ val SpreadElement: typings.typescript.mod.SyntaxKind.SpreadElement & Double = js.native
  
  @js.native
  sealed trait StaticKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with ModifierSyntaxKind
  /* 123 */ val StaticKeyword: typings.typescript.mod.SyntaxKind.StaticKeyword & Double = js.native
  
  @js.native
  sealed trait StringKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 147 */ val StringKeyword: typings.typescript.mod.SyntaxKind.StringKeyword & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with SyntaxKind
       with LiteralSyntaxKind
  /* 10 */ val StringLiteral: typings.typescript.mod.SyntaxKind.StringLiteral & Double = js.native
  
  @js.native
  sealed trait SuperKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 105 */ val SuperKeyword: typings.typescript.mod.SyntaxKind.SuperKeyword & Double = js.native
  
  @js.native
  sealed trait SwitchKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 106 */ val SwitchKeyword: typings.typescript.mod.SyntaxKind.SwitchKeyword & Double = js.native
  
  @js.native
  sealed trait SwitchStatement
    extends StObject
       with SyntaxKind
  /* 244 */ val SwitchStatement: typings.typescript.mod.SyntaxKind.SwitchStatement & Double = js.native
  
  @js.native
  sealed trait SymbolKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 148 */ val SymbolKeyword: typings.typescript.mod.SyntaxKind.SymbolKeyword & Double = js.native
  
  @js.native
  sealed trait SyntaxList
    extends StObject
       with SyntaxKind
  /* 334 */ val SyntaxList: typings.typescript.mod.SyntaxKind.SyntaxList & Double = js.native
  
  @js.native
  sealed trait SyntheticExpression
    extends StObject
       with SyntaxKind
  /* 227 */ val SyntheticExpression: typings.typescript.mod.SyntaxKind.SyntheticExpression & Double = js.native
  
  @js.native
  sealed trait SyntheticReferenceExpression
    extends StObject
       with SyntaxKind
  /* 340 */ val SyntheticReferenceExpression: typings.typescript.mod.SyntaxKind.SyntheticReferenceExpression & Double = js.native
  
  @js.native
  sealed trait TaggedTemplateExpression
    extends StObject
       with SyntaxKind
  /* 205 */ val TaggedTemplateExpression: typings.typescript.mod.SyntaxKind.TaggedTemplateExpression & Double = js.native
  
  @js.native
  sealed trait TemplateExpression
    extends StObject
       with SyntaxKind
  /* 218 */ val TemplateExpression: typings.typescript.mod.SyntaxKind.TemplateExpression & Double = js.native
  
  @js.native
  sealed trait TemplateHead
    extends StObject
       with SyntaxKind
       with PseudoLiteralSyntaxKind
  /* 15 */ val TemplateHead: typings.typescript.mod.SyntaxKind.TemplateHead & Double = js.native
  
  @js.native
  sealed trait TemplateLiteralType
    extends StObject
       with SyntaxKind
  /* 193 */ val TemplateLiteralType: typings.typescript.mod.SyntaxKind.TemplateLiteralType & Double = js.native
  
  @js.native
  sealed trait TemplateLiteralTypeSpan
    extends StObject
       with SyntaxKind
  /* 194 */ val TemplateLiteralTypeSpan: typings.typescript.mod.SyntaxKind.TemplateLiteralTypeSpan & Double = js.native
  
  @js.native
  sealed trait TemplateMiddle
    extends StObject
       with SyntaxKind
       with PseudoLiteralSyntaxKind
  /* 16 */ val TemplateMiddle: typings.typescript.mod.SyntaxKind.TemplateMiddle & Double = js.native
  
  @js.native
  sealed trait TemplateSpan
    extends StObject
       with SyntaxKind
  /* 228 */ val TemplateSpan: typings.typescript.mod.SyntaxKind.TemplateSpan & Double = js.native
  
  @js.native
  sealed trait TemplateTail
    extends StObject
       with SyntaxKind
       with PseudoLiteralSyntaxKind
  /* 17 */ val TemplateTail: typings.typescript.mod.SyntaxKind.TemplateTail & Double = js.native
  
  @js.native
  sealed trait ThisKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 107 */ val ThisKeyword: typings.typescript.mod.SyntaxKind.ThisKeyword & Double = js.native
  
  @js.native
  sealed trait ThisType
    extends StObject
       with SyntaxKind
  /* 187 */ val ThisType: typings.typescript.mod.SyntaxKind.ThisType & Double = js.native
  
  @js.native
  sealed trait ThrowKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 108 */ val ThrowKeyword: typings.typescript.mod.SyntaxKind.ThrowKeyword & Double = js.native
  
  @js.native
  sealed trait ThrowStatement
    extends StObject
       with SyntaxKind
  /* 246 */ val ThrowStatement: typings.typescript.mod.SyntaxKind.ThrowStatement & Double = js.native
  
  @js.native
  sealed trait TildeToken
    extends StObject
       with SyntaxKind
       with PrefixUnaryOperator
       with PunctuationSyntaxKind
  /* 54 */ val TildeToken: typings.typescript.mod.SyntaxKind.TildeToken & Double = js.native
  
  @js.native
  sealed trait TrueKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 109 */ val TrueKeyword: typings.typescript.mod.SyntaxKind.TrueKeyword & Double = js.native
  
  @js.native
  sealed trait TryKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 110 */ val TryKeyword: typings.typescript.mod.SyntaxKind.TryKeyword & Double = js.native
  
  @js.native
  sealed trait TryStatement
    extends StObject
       with SyntaxKind
  /* 247 */ val TryStatement: typings.typescript.mod.SyntaxKind.TryStatement & Double = js.native
  
  @js.native
  sealed trait TupleType
    extends StObject
       with SyntaxKind
  /* 179 */ val TupleType: typings.typescript.mod.SyntaxKind.TupleType & Double = js.native
  
  @js.native
  sealed trait TypeAliasDeclaration
    extends StObject
       with SyntaxKind
  /* 254 */ val TypeAliasDeclaration: typings.typescript.mod.SyntaxKind.TypeAliasDeclaration & Double = js.native
  
  @js.native
  sealed trait TypeAssertionExpression
    extends StObject
       with SyntaxKind
  /* 206 */ val TypeAssertionExpression: typings.typescript.mod.SyntaxKind.TypeAssertionExpression & Double = js.native
  
  @js.native
  sealed trait TypeKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 149 */ val TypeKeyword: typings.typescript.mod.SyntaxKind.TypeKeyword & Double = js.native
  
  @js.native
  sealed trait TypeLiteral
    extends StObject
       with SyntaxKind
  /* 177 */ val TypeLiteral: typings.typescript.mod.SyntaxKind.TypeLiteral & Double = js.native
  
  @js.native
  sealed trait TypeOfExpression
    extends StObject
       with SyntaxKind
  /* 211 */ val TypeOfExpression: typings.typescript.mod.SyntaxKind.TypeOfExpression & Double = js.native
  
  @js.native
  sealed trait TypeOfKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 111 */ val TypeOfKeyword: typings.typescript.mod.SyntaxKind.TypeOfKeyword & Double = js.native
  
  @js.native
  sealed trait TypeOperator
    extends StObject
       with SyntaxKind
  /* 188 */ val TypeOperator: typings.typescript.mod.SyntaxKind.TypeOperator & Double = js.native
  
  @js.native
  sealed trait TypeParameter
    extends StObject
       with SyntaxKind
  /* 159 */ val TypeParameter: typings.typescript.mod.SyntaxKind.TypeParameter & Double = js.native
  
  @js.native
  sealed trait TypePredicate
    extends StObject
       with SyntaxKind
  /* 172 */ val TypePredicate: typings.typescript.mod.SyntaxKind.TypePredicate & Double = js.native
  
  @js.native
  sealed trait TypeQuery
    extends StObject
       with SyntaxKind
  /* 176 */ val TypeQuery: typings.typescript.mod.SyntaxKind.TypeQuery & Double = js.native
  
  @js.native
  sealed trait TypeReference
    extends StObject
       with SyntaxKind
  /* 173 */ val TypeReference: typings.typescript.mod.SyntaxKind.TypeReference & Double = js.native
  
  @js.native
  sealed trait UndefinedKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 150 */ val UndefinedKeyword: typings.typescript.mod.SyntaxKind.UndefinedKeyword & Double = js.native
  
  @js.native
  sealed trait UnionType
    extends StObject
       with SyntaxKind
  /* 182 */ val UnionType: typings.typescript.mod.SyntaxKind.UnionType & Double = js.native
  
  @js.native
  sealed trait UniqueKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 151 */ val UniqueKeyword: typings.typescript.mod.SyntaxKind.UniqueKeyword & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TokenSyntaxKind
  /* 0 */ val Unknown: typings.typescript.mod.SyntaxKind.Unknown & Double = js.native
  
  @js.native
  sealed trait UnknownKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 152 */ val UnknownKeyword: typings.typescript.mod.SyntaxKind.UnknownKeyword & Double = js.native
  
  @js.native
  sealed trait UnparsedInternalText
    extends StObject
       with SyntaxKind
  /* 295 */ val UnparsedInternalText: typings.typescript.mod.SyntaxKind.UnparsedInternalText & Double = js.native
  
  @js.native
  sealed trait UnparsedPrepend
    extends StObject
       with SyntaxKind
  /* 293 */ val UnparsedPrepend: typings.typescript.mod.SyntaxKind.UnparsedPrepend & Double = js.native
  
  @js.native
  sealed trait UnparsedPrologue
    extends StObject
       with SyntaxKind
  /* 292 */ val UnparsedPrologue: typings.typescript.mod.SyntaxKind.UnparsedPrologue & Double = js.native
  
  @js.native
  sealed trait UnparsedSource
    extends StObject
       with SyntaxKind
  /* 299 */ val UnparsedSource: typings.typescript.mod.SyntaxKind.UnparsedSource & Double = js.native
  
  @js.native
  sealed trait UnparsedSyntheticReference
    extends StObject
       with SyntaxKind
  /* 296 */ val UnparsedSyntheticReference: typings.typescript.mod.SyntaxKind.UnparsedSyntheticReference & Double = js.native
  
  @js.native
  sealed trait UnparsedText
    extends StObject
       with SyntaxKind
  /* 294 */ val UnparsedText: typings.typescript.mod.SyntaxKind.UnparsedText & Double = js.native
  
  @js.native
  sealed trait VarKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 112 */ val VarKeyword: typings.typescript.mod.SyntaxKind.VarKeyword & Double = js.native
  
  @js.native
  sealed trait VariableDeclaration
    extends StObject
       with SyntaxKind
  /* 249 */ val VariableDeclaration: typings.typescript.mod.SyntaxKind.VariableDeclaration & Double = js.native
  
  @js.native
  sealed trait VariableDeclarationList
    extends StObject
       with SyntaxKind
  /* 250 */ val VariableDeclarationList: typings.typescript.mod.SyntaxKind.VariableDeclarationList & Double = js.native
  
  @js.native
  sealed trait VariableStatement
    extends StObject
       with SyntaxKind
  /* 232 */ val VariableStatement: typings.typescript.mod.SyntaxKind.VariableStatement & Double = js.native
  
  @js.native
  sealed trait VoidExpression
    extends StObject
       with SyntaxKind
  /* 212 */ val VoidExpression: typings.typescript.mod.SyntaxKind.VoidExpression & Double = js.native
  
  @js.native
  sealed trait VoidKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
       with KeywordTypeSyntaxKind
  /* 113 */ val VoidKeyword: typings.typescript.mod.SyntaxKind.VoidKeyword & Double = js.native
  
  @js.native
  sealed trait WhileKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 114 */ val WhileKeyword: typings.typescript.mod.SyntaxKind.WhileKeyword & Double = js.native
  
  @js.native
  sealed trait WhileStatement
    extends StObject
       with SyntaxKind
  /* 236 */ val WhileStatement: typings.typescript.mod.SyntaxKind.WhileStatement & Double = js.native
  
  @js.native
  sealed trait WhitespaceTrivia
    extends StObject
       with SyntaxKind
       with JSDocSyntaxKind
       with TriviaSyntaxKind
  /* 5 */ val WhitespaceTrivia: typings.typescript.mod.SyntaxKind.WhitespaceTrivia & Double = js.native
  
  @js.native
  sealed trait WithKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 115 */ val WithKeyword: typings.typescript.mod.SyntaxKind.WithKeyword & Double = js.native
  
  @js.native
  sealed trait WithStatement
    extends StObject
       with SyntaxKind
  /* 243 */ val WithStatement: typings.typescript.mod.SyntaxKind.WithStatement & Double = js.native
  
  @js.native
  sealed trait YieldExpression
    extends StObject
       with SyntaxKind
  /* 219 */ val YieldExpression: typings.typescript.mod.SyntaxKind.YieldExpression & Double = js.native
  
  @js.native
  sealed trait YieldKeyword
    extends StObject
       with SyntaxKind
       with KeywordSyntaxKind
  /* 124 */ val YieldKeyword: typings.typescript.mod.SyntaxKind.YieldKeyword & Double = js.native
}
