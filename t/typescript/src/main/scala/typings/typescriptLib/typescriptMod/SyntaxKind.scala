package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyntaxKind extends js.Object

@JSImport("typescript", "SyntaxKind")
@js.native
object SyntaxKind extends js.Object {
  @js.native
  sealed trait AbstractKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AmpersandToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AnyKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ArrayBindingPattern
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ArrayLiteralExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ArrayType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ArrowFunction
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsteriskAsteriskToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsteriskToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AsyncKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AtToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AwaitExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait AwaitKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BarBarToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BarEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BarToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BigIntKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BigIntLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BinaryExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BindingElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Block
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BooleanKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BreakKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait BreakStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Bundle
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CallExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CallSignature
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CaretEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CaretToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CaseBlock
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CaseClause
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CaseKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CatchClause
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CatchKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ClassDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ClassExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ClassKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CloseBraceToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CloseBracketToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CloseParenToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ColonToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CommaListExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait CommaToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ComputedPropertyName
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConditionalExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConditionalType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConstKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConstructSignature
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Constructor
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConstructorKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ConstructorType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ContinueKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ContinueStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Count
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DebuggerKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DebuggerStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DeclareKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Decorator
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DefaultClause
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DefaultKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DeleteExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DeleteKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DoKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DoStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DotDotDotToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait DotToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ElementAccessExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ElseKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EmptyStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EndOfDeclarationMarker
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EndOfFileToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EnumDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EnumKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EnumMember
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EqualsEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EqualsGreaterThanToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait EqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExclamationToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExportAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExportDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExportKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExportSpecifier
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExpressionStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExpressionWithTypeArguments
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExtendsKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ExternalModuleReference
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FalseKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FinallyKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstBinaryOperator
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstCompoundAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstFutureReservedWord
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstJSDocNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstJSDocTagNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstLiteralToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstPunctuation
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstReservedWord
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstTemplateToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstTriviaToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FirstTypeNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ForInStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ForKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ForOfStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ForStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FromKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FunctionDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FunctionExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FunctionKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait FunctionType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GetAccessor
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GetKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GlobalKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait GreaterThanToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait HeritageClause
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Identifier
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait IfKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait IfStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImplementsKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImportClause
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImportDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImportEqualsDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImportKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImportSpecifier
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ImportType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait IndexSignature
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait IndexedAccessType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InferKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InferType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InputFiles
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InstanceOfKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InterfaceDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait InterfaceKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait IntersectionType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait IsKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocAllType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocAugmentsTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocCallbackTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocClassTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocComment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocEnumTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocFunctionType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocNonNullableType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocNullableType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocOptionalType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocParameterTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocPropertyTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocReturnTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocSignature
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocTemplateTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocThisTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocTypeExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocTypeLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocTypeTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocTypedefTag
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocUnknownType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JSDocVariadicType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxAttribute
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxAttributes
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxClosingElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxClosingFragment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxFragment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxOpeningElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxOpeningFragment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxSelfClosingElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxSpreadAttribute
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxText
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait KeyOfKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LabeledStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastBinaryOperator
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastCompoundAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastFutureReservedWord
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastJSDocNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastJSDocTagNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastLiteralToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastPunctuation
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastReservedWord
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastTemplateToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastTriviaToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LastTypeNode
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LessThanEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LessThanLessThanToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LessThanSlashToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LessThanToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LetKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait LiteralType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MappedType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MergeDeclarationMarker
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MetaProperty
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MethodDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MethodSignature
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MinusEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MinusMinusToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MinusToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MissingDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ModuleBlock
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ModuleDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ModuleKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NamedExports
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NamedImports
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NamespaceExportDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NamespaceImport
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NamespaceKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NeverKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NewExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NewKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NewLineTrivia
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NonNullExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NotEmittedStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NullKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NumberKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait NumericLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ObjectBindingPattern
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ObjectKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ObjectLiteralExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait OfKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait OmittedExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait OpenBraceToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait OpenBracketToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait OpenParenToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait OptionalType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PackageKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Parameter
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ParenthesizedExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ParenthesizedType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PartiallyEmittedExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PercentEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PercentToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PlusEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PlusPlusToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PlusToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PostfixUnaryExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PrefixUnaryExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PrivateKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PropertyAccessExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PropertyAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PropertyDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PropertySignature
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ProtectedKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait PublicKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait QualifiedName
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait QuestionToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ReadonlyKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait RegularExpressionLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait RequireKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait RestType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ReturnKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ReturnStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SemicolonClassElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SemicolonToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SetAccessor
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SetKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ShebangTrivia
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ShorthandPropertyAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SlashEqualsToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SlashToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SourceFile
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SpreadAssignment
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SpreadElement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait StaticKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait StringKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait StringLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SuperKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SwitchKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SwitchStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SymbolKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SyntaxList
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait SyntheticExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TaggedTemplateExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TemplateExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TemplateHead
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TemplateMiddle
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TemplateSpan
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TemplateTail
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ThisKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ThisType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ThrowKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait ThrowStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TildeToken
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TrueKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TryKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TryStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TupleType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeAliasDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeAssertionExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeLiteral
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeOfExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeOfKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeOperator
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeParameter
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypePredicate
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeQuery
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait TypeReference
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UndefinedKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnionType
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UniqueKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait Unknown
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnknownKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnparsedInternalText
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnparsedPrepend
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnparsedPrologue
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnparsedSource
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnparsedSyntheticReference
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait UnparsedText
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait VarKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait VariableDeclaration
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait VariableDeclarationList
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait VariableStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait VoidExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait VoidKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait WhileKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait WhileStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait WhitespaceTrivia
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait WithKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait WithStatement
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait YieldExpression
    extends typescriptLib.typescriptMod.SyntaxKind
  
  @js.native
  sealed trait YieldKeyword
    extends typescriptLib.typescriptMod.SyntaxKind
  
  /* 119 */ val AbstractKeyword: AbstractKeyword with scala.Double = js.native
  /* 54 */ val AmpersandAmpersandToken: AmpersandAmpersandToken with scala.Double = js.native
  /* 70 */ val AmpersandEqualsToken: AmpersandEqualsToken with scala.Double = js.native
  /* 49 */ val AmpersandToken: AmpersandToken with scala.Double = js.native
  /* 121 */ val AnyKeyword: AnyKeyword with scala.Double = js.native
  /* 186 */ val ArrayBindingPattern: ArrayBindingPattern with scala.Double = js.native
  /* 188 */ val ArrayLiteralExpression: ArrayLiteralExpression with scala.Double = js.native
  /* 170 */ val ArrayType: ArrayType with scala.Double = js.native
  /* 198 */ val ArrowFunction: ArrowFunction with scala.Double = js.native
  /* 213 */ val AsExpression: AsExpression with scala.Double = js.native
  /* 120 */ val AsKeyword: AsKeyword with scala.Double = js.native
  /* 64 */ val AsteriskAsteriskEqualsToken: AsteriskAsteriskEqualsToken with scala.Double = js.native
  /* 41 */ val AsteriskAsteriskToken: AsteriskAsteriskToken with scala.Double = js.native
  /* 63 */ val AsteriskEqualsToken: AsteriskEqualsToken with scala.Double = js.native
  /* 40 */ val AsteriskToken: AsteriskToken with scala.Double = js.native
  /* 122 */ val AsyncKeyword: AsyncKeyword with scala.Double = js.native
  /* 58 */ val AtToken: AtToken with scala.Double = js.native
  /* 202 */ val AwaitExpression: AwaitExpression with scala.Double = js.native
  /* 123 */ val AwaitKeyword: AwaitKeyword with scala.Double = js.native
  /* 59 */ val BacktickToken: BacktickToken with scala.Double = js.native
  /* 55 */ val BarBarToken: BarBarToken with scala.Double = js.native
  /* 71 */ val BarEqualsToken: BarEqualsToken with scala.Double = js.native
  /* 50 */ val BarToken: BarToken with scala.Double = js.native
  /* 147 */ val BigIntKeyword: BigIntKeyword with scala.Double = js.native
  /* 9 */ val BigIntLiteral: BigIntLiteral with scala.Double = js.native
  /* 205 */ val BinaryExpression: BinaryExpression with scala.Double = js.native
  /* 187 */ val BindingElement: BindingElement with scala.Double = js.native
  /* 219 */ val Block: Block with scala.Double = js.native
  /* 124 */ val BooleanKeyword: BooleanKeyword with scala.Double = js.native
  /* 74 */ val BreakKeyword: BreakKeyword with scala.Double = js.native
  /* 230 */ val BreakStatement: BreakStatement with scala.Double = js.native
  /* 286 */ val Bundle: Bundle with scala.Double = js.native
  /* 192 */ val CallExpression: CallExpression with scala.Double = js.native
  /* 161 */ val CallSignature: CallSignature with scala.Double = js.native
  /* 72 */ val CaretEqualsToken: CaretEqualsToken with scala.Double = js.native
  /* 51 */ val CaretToken: CaretToken with scala.Double = js.native
  /* 247 */ val CaseBlock: CaseBlock with scala.Double = js.native
  /* 272 */ val CaseClause: CaseClause with scala.Double = js.native
  /* 75 */ val CaseKeyword: CaseKeyword with scala.Double = js.native
  /* 275 */ val CatchClause: CatchClause with scala.Double = js.native
  /* 76 */ val CatchKeyword: CatchKeyword with scala.Double = js.native
  /* 241 */ val ClassDeclaration: ClassDeclaration with scala.Double = js.native
  /* 210 */ val ClassExpression: ClassExpression with scala.Double = js.native
  /* 77 */ val ClassKeyword: ClassKeyword with scala.Double = js.native
  /* 19 */ val CloseBraceToken: CloseBraceToken with scala.Double = js.native
  /* 23 */ val CloseBracketToken: CloseBracketToken with scala.Double = js.native
  /* 21 */ val CloseParenToken: CloseParenToken with scala.Double = js.native
  /* 57 */ val ColonToken: ColonToken with scala.Double = js.native
  /* 315 */ val CommaListExpression: CommaListExpression with scala.Double = js.native
  /* 27 */ val CommaToken: CommaToken with scala.Double = js.native
  /* 150 */ val ComputedPropertyName: ComputedPropertyName with scala.Double = js.native
  /* 206 */ val ConditionalExpression: ConditionalExpression with scala.Double = js.native
  /* 176 */ val ConditionalType: ConditionalType with scala.Double = js.native
  /* 7 */ val ConflictMarkerTrivia: ConflictMarkerTrivia with scala.Double = js.native
  /* 78 */ val ConstKeyword: ConstKeyword with scala.Double = js.native
  /* 162 */ val ConstructSignature: ConstructSignature with scala.Double = js.native
  /* 158 */ val Constructor: Constructor with scala.Double = js.native
  /* 125 */ val ConstructorKeyword: ConstructorKeyword with scala.Double = js.native
  /* 167 */ val ConstructorType: ConstructorType with scala.Double = js.native
  /* 79 */ val ContinueKeyword: ContinueKeyword with scala.Double = js.native
  /* 229 */ val ContinueStatement: ContinueStatement with scala.Double = js.native
  /* 318 */ val Count: Count with scala.Double = js.native
  /* 80 */ val DebuggerKeyword: DebuggerKeyword with scala.Double = js.native
  /* 237 */ val DebuggerStatement: DebuggerStatement with scala.Double = js.native
  /* 126 */ val DeclareKeyword: DeclareKeyword with scala.Double = js.native
  /* 153 */ val Decorator: Decorator with scala.Double = js.native
  /* 273 */ val DefaultClause: DefaultClause with scala.Double = js.native
  /* 81 */ val DefaultKeyword: DefaultKeyword with scala.Double = js.native
  /* 199 */ val DeleteExpression: DeleteExpression with scala.Double = js.native
  /* 82 */ val DeleteKeyword: DeleteKeyword with scala.Double = js.native
  /* 83 */ val DoKeyword: DoKeyword with scala.Double = js.native
  /* 224 */ val DoStatement: DoStatement with scala.Double = js.native
  /* 25 */ val DotDotDotToken: DotDotDotToken with scala.Double = js.native
  /* 24 */ val DotToken: DotToken with scala.Double = js.native
  /* 191 */ val ElementAccessExpression: ElementAccessExpression with scala.Double = js.native
  /* 84 */ val ElseKeyword: ElseKeyword with scala.Double = js.native
  /* 221 */ val EmptyStatement: EmptyStatement with scala.Double = js.native
  /* 317 */ val EndOfDeclarationMarker: EndOfDeclarationMarker with scala.Double = js.native
  /* 1 */ val EndOfFileToken: EndOfFileToken with scala.Double = js.native
  /* 244 */ val EnumDeclaration: EnumDeclaration with scala.Double = js.native
  /* 85 */ val EnumKeyword: EnumKeyword with scala.Double = js.native
  /* 279 */ val EnumMember: EnumMember with scala.Double = js.native
  /* 35 */ val EqualsEqualsEqualsToken: EqualsEqualsEqualsToken with scala.Double = js.native
  /* 33 */ val EqualsEqualsToken: EqualsEqualsToken with scala.Double = js.native
  /* 37 */ val EqualsGreaterThanToken: EqualsGreaterThanToken with scala.Double = js.native
  /* 60 */ val EqualsToken: EqualsToken with scala.Double = js.native
  /* 36 */ val ExclamationEqualsEqualsToken: ExclamationEqualsEqualsToken with scala.Double = js.native
  /* 34 */ val ExclamationEqualsToken: ExclamationEqualsToken with scala.Double = js.native
  /* 52 */ val ExclamationToken: ExclamationToken with scala.Double = js.native
  /* 255 */ val ExportAssignment: ExportAssignment with scala.Double = js.native
  /* 256 */ val ExportDeclaration: ExportDeclaration with scala.Double = js.native
  /* 86 */ val ExportKeyword: ExportKeyword with scala.Double = js.native
  /* 258 */ val ExportSpecifier: ExportSpecifier with scala.Double = js.native
  /* 222 */ val ExpressionStatement: ExpressionStatement with scala.Double = js.native
  /* 212 */ val ExpressionWithTypeArguments: ExpressionWithTypeArguments with scala.Double = js.native
  /* 87 */ val ExtendsKeyword: ExtendsKeyword with scala.Double = js.native
  /* 260 */ val ExternalModuleReference: ExternalModuleReference with scala.Double = js.native
  /* 88 */ val FalseKeyword: FalseKeyword with scala.Double = js.native
  /* 89 */ val FinallyKeyword: FinallyKeyword with scala.Double = js.native
  /* 60 */ val FirstAssignment: FirstAssignment with scala.Double = js.native
  /* 28 */ val FirstBinaryOperator: FirstBinaryOperator with scala.Double = js.native
  /* 61 */ val FirstCompoundAssignment: FirstCompoundAssignment with scala.Double = js.native
  /* 110 */ val FirstFutureReservedWord: FirstFutureReservedWord with scala.Double = js.native
  /* 289 */ val FirstJSDocNode: FirstJSDocNode with scala.Double = js.native
  /* 300 */ val FirstJSDocTagNode: FirstJSDocTagNode with scala.Double = js.native
  /* 74 */ val FirstKeyword: FirstKeyword with scala.Double = js.native
  /* 8 */ val FirstLiteralToken: FirstLiteralToken with scala.Double = js.native
  /* 149 */ val FirstNode: FirstNode with scala.Double = js.native
  /* 18 */ val FirstPunctuation: FirstPunctuation with scala.Double = js.native
  /* 74 */ val FirstReservedWord: FirstReservedWord with scala.Double = js.native
  /* 14 */ val FirstTemplateToken: FirstTemplateToken with scala.Double = js.native
  /* 0 */ val FirstToken: FirstToken with scala.Double = js.native
  /* 2 */ val FirstTriviaToken: FirstTriviaToken with scala.Double = js.native
  /* 164 */ val FirstTypeNode: FirstTypeNode with scala.Double = js.native
  /* 227 */ val ForInStatement: ForInStatement with scala.Double = js.native
  /* 90 */ val ForKeyword: ForKeyword with scala.Double = js.native
  /* 228 */ val ForOfStatement: ForOfStatement with scala.Double = js.native
  /* 226 */ val ForStatement: ForStatement with scala.Double = js.native
  /* 145 */ val FromKeyword: FromKeyword with scala.Double = js.native
  /* 240 */ val FunctionDeclaration: FunctionDeclaration with scala.Double = js.native
  /* 197 */ val FunctionExpression: FunctionExpression with scala.Double = js.native
  /* 91 */ val FunctionKeyword: FunctionKeyword with scala.Double = js.native
  /* 166 */ val FunctionType: FunctionType with scala.Double = js.native
  /* 159 */ val GetAccessor: GetAccessor with scala.Double = js.native
  /* 127 */ val GetKeyword: GetKeyword with scala.Double = js.native
  /* 146 */ val GlobalKeyword: GlobalKeyword with scala.Double = js.native
  /* 32 */ val GreaterThanEqualsToken: GreaterThanEqualsToken with scala.Double = js.native
  /* 68 */ val GreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanEqualsToken with scala.Double = js.native
  /* 69 */ val GreaterThanGreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanGreaterThanEqualsToken with scala.Double = js.native
  /* 48 */ val GreaterThanGreaterThanGreaterThanToken: GreaterThanGreaterThanGreaterThanToken with scala.Double = js.native
  /* 47 */ val GreaterThanGreaterThanToken: GreaterThanGreaterThanToken with scala.Double = js.native
  /* 30 */ val GreaterThanToken: GreaterThanToken with scala.Double = js.native
  /* 274 */ val HeritageClause: HeritageClause with scala.Double = js.native
  /* 73 */ val Identifier: Identifier with scala.Double = js.native
  /* 92 */ val IfKeyword: IfKeyword with scala.Double = js.native
  /* 223 */ val IfStatement: IfStatement with scala.Double = js.native
  /* 110 */ val ImplementsKeyword: ImplementsKeyword with scala.Double = js.native
  /* 251 */ val ImportClause: ImportClause with scala.Double = js.native
  /* 250 */ val ImportDeclaration: ImportDeclaration with scala.Double = js.native
  /* 249 */ val ImportEqualsDeclaration: ImportEqualsDeclaration with scala.Double = js.native
  /* 93 */ val ImportKeyword: ImportKeyword with scala.Double = js.native
  /* 254 */ val ImportSpecifier: ImportSpecifier with scala.Double = js.native
  /* 184 */ val ImportType: ImportType with scala.Double = js.native
  /* 94 */ val InKeyword: InKeyword with scala.Double = js.native
  /* 163 */ val IndexSignature: IndexSignature with scala.Double = js.native
  /* 181 */ val IndexedAccessType: IndexedAccessType with scala.Double = js.native
  /* 128 */ val InferKeyword: InferKeyword with scala.Double = js.native
  /* 177 */ val InferType: InferType with scala.Double = js.native
  /* 288 */ val InputFiles: InputFiles with scala.Double = js.native
  /* 95 */ val InstanceOfKeyword: InstanceOfKeyword with scala.Double = js.native
  /* 242 */ val InterfaceDeclaration: InterfaceDeclaration with scala.Double = js.native
  /* 111 */ val InterfaceKeyword: InterfaceKeyword with scala.Double = js.native
  /* 175 */ val IntersectionType: IntersectionType with scala.Double = js.native
  /* 129 */ val IsKeyword: IsKeyword with scala.Double = js.native
  /* 290 */ val JSDocAllType: JSDocAllType with scala.Double = js.native
  /* 301 */ val JSDocAugmentsTag: JSDocAugmentsTag with scala.Double = js.native
  /* 303 */ val JSDocCallbackTag: JSDocCallbackTag with scala.Double = js.native
  /* 302 */ val JSDocClassTag: JSDocClassTag with scala.Double = js.native
  /* 297 */ val JSDocComment: JSDocComment with scala.Double = js.native
  /* 304 */ val JSDocEnumTag: JSDocEnumTag with scala.Double = js.native
  /* 295 */ val JSDocFunctionType: JSDocFunctionType with scala.Double = js.native
  /* 293 */ val JSDocNonNullableType: JSDocNonNullableType with scala.Double = js.native
  /* 292 */ val JSDocNullableType: JSDocNullableType with scala.Double = js.native
  /* 294 */ val JSDocOptionalType: JSDocOptionalType with scala.Double = js.native
  /* 305 */ val JSDocParameterTag: JSDocParameterTag with scala.Double = js.native
  /* 311 */ val JSDocPropertyTag: JSDocPropertyTag with scala.Double = js.native
  /* 306 */ val JSDocReturnTag: JSDocReturnTag with scala.Double = js.native
  /* 299 */ val JSDocSignature: JSDocSignature with scala.Double = js.native
  /* 300 */ val JSDocTag: JSDocTag with scala.Double = js.native
  /* 309 */ val JSDocTemplateTag: JSDocTemplateTag with scala.Double = js.native
  /* 307 */ val JSDocThisTag: JSDocThisTag with scala.Double = js.native
  /* 289 */ val JSDocTypeExpression: JSDocTypeExpression with scala.Double = js.native
  /* 298 */ val JSDocTypeLiteral: JSDocTypeLiteral with scala.Double = js.native
  /* 308 */ val JSDocTypeTag: JSDocTypeTag with scala.Double = js.native
  /* 310 */ val JSDocTypedefTag: JSDocTypedefTag with scala.Double = js.native
  /* 291 */ val JSDocUnknownType: JSDocUnknownType with scala.Double = js.native
  /* 296 */ val JSDocVariadicType: JSDocVariadicType with scala.Double = js.native
  /* 268 */ val JsxAttribute: JsxAttribute with scala.Double = js.native
  /* 269 */ val JsxAttributes: JsxAttributes with scala.Double = js.native
  /* 264 */ val JsxClosingElement: JsxClosingElement with scala.Double = js.native
  /* 267 */ val JsxClosingFragment: JsxClosingFragment with scala.Double = js.native
  /* 261 */ val JsxElement: JsxElement with scala.Double = js.native
  /* 271 */ val JsxExpression: JsxExpression with scala.Double = js.native
  /* 265 */ val JsxFragment: JsxFragment with scala.Double = js.native
  /* 263 */ val JsxOpeningElement: JsxOpeningElement with scala.Double = js.native
  /* 266 */ val JsxOpeningFragment: JsxOpeningFragment with scala.Double = js.native
  /* 262 */ val JsxSelfClosingElement: JsxSelfClosingElement with scala.Double = js.native
  /* 270 */ val JsxSpreadAttribute: JsxSpreadAttribute with scala.Double = js.native
  /* 11 */ val JsxText: JsxText with scala.Double = js.native
  /* 12 */ val JsxTextAllWhiteSpaces: JsxTextAllWhiteSpaces with scala.Double = js.native
  /* 130 */ val KeyOfKeyword: KeyOfKeyword with scala.Double = js.native
  /* 234 */ val LabeledStatement: LabeledStatement with scala.Double = js.native
  /* 72 */ val LastAssignment: LastAssignment with scala.Double = js.native
  /* 72 */ val LastBinaryOperator: LastBinaryOperator with scala.Double = js.native
  /* 72 */ val LastCompoundAssignment: LastCompoundAssignment with scala.Double = js.native
  /* 118 */ val LastFutureReservedWord: LastFutureReservedWord with scala.Double = js.native
  /* 311 */ val LastJSDocNode: LastJSDocNode with scala.Double = js.native
  /* 311 */ val LastJSDocTagNode: LastJSDocTagNode with scala.Double = js.native
  /* 148 */ val LastKeyword: LastKeyword with scala.Double = js.native
  /* 14 */ val LastLiteralToken: LastLiteralToken with scala.Double = js.native
  /* 72 */ val LastPunctuation: LastPunctuation with scala.Double = js.native
  /* 109 */ val LastReservedWord: LastReservedWord with scala.Double = js.native
  /* 17 */ val LastTemplateToken: LastTemplateToken with scala.Double = js.native
  /* 148 */ val LastToken: LastToken with scala.Double = js.native
  /* 7 */ val LastTriviaToken: LastTriviaToken with scala.Double = js.native
  /* 184 */ val LastTypeNode: LastTypeNode with scala.Double = js.native
  /* 31 */ val LessThanEqualsToken: LessThanEqualsToken with scala.Double = js.native
  /* 67 */ val LessThanLessThanEqualsToken: LessThanLessThanEqualsToken with scala.Double = js.native
  /* 46 */ val LessThanLessThanToken: LessThanLessThanToken with scala.Double = js.native
  /* 29 */ val LessThanSlashToken: LessThanSlashToken with scala.Double = js.native
  /* 28 */ val LessThanToken: LessThanToken with scala.Double = js.native
  /* 112 */ val LetKeyword: LetKeyword with scala.Double = js.native
  /* 183 */ val LiteralType: LiteralType with scala.Double = js.native
  /* 182 */ val MappedType: MappedType with scala.Double = js.native
  /* 316 */ val MergeDeclarationMarker: MergeDeclarationMarker with scala.Double = js.native
  /* 215 */ val MetaProperty: MetaProperty with scala.Double = js.native
  /* 157 */ val MethodDeclaration: MethodDeclaration with scala.Double = js.native
  /* 156 */ val MethodSignature: MethodSignature with scala.Double = js.native
  /* 62 */ val MinusEqualsToken: MinusEqualsToken with scala.Double = js.native
  /* 45 */ val MinusMinusToken: MinusMinusToken with scala.Double = js.native
  /* 39 */ val MinusToken: MinusToken with scala.Double = js.native
  /* 259 */ val MissingDeclaration: MissingDeclaration with scala.Double = js.native
  /* 246 */ val ModuleBlock: ModuleBlock with scala.Double = js.native
  /* 245 */ val ModuleDeclaration: ModuleDeclaration with scala.Double = js.native
  /* 131 */ val ModuleKeyword: ModuleKeyword with scala.Double = js.native
  /* 3 */ val MultiLineCommentTrivia: MultiLineCommentTrivia with scala.Double = js.native
  /* 257 */ val NamedExports: NamedExports with scala.Double = js.native
  /* 253 */ val NamedImports: NamedImports with scala.Double = js.native
  /* 248 */ val NamespaceExportDeclaration: NamespaceExportDeclaration with scala.Double = js.native
  /* 252 */ val NamespaceImport: NamespaceImport with scala.Double = js.native
  /* 132 */ val NamespaceKeyword: NamespaceKeyword with scala.Double = js.native
  /* 133 */ val NeverKeyword: NeverKeyword with scala.Double = js.native
  /* 193 */ val NewExpression: NewExpression with scala.Double = js.native
  /* 96 */ val NewKeyword: NewKeyword with scala.Double = js.native
  /* 4 */ val NewLineTrivia: NewLineTrivia with scala.Double = js.native
  /* 14 */ val NoSubstitutionTemplateLiteral: NoSubstitutionTemplateLiteral with scala.Double = js.native
  /* 214 */ val NonNullExpression: NonNullExpression with scala.Double = js.native
  /* 313 */ val NotEmittedStatement: NotEmittedStatement with scala.Double = js.native
  /* 97 */ val NullKeyword: NullKeyword with scala.Double = js.native
  /* 136 */ val NumberKeyword: NumberKeyword with scala.Double = js.native
  /* 8 */ val NumericLiteral: NumericLiteral with scala.Double = js.native
  /* 185 */ val ObjectBindingPattern: ObjectBindingPattern with scala.Double = js.native
  /* 137 */ val ObjectKeyword: ObjectKeyword with scala.Double = js.native
  /* 189 */ val ObjectLiteralExpression: ObjectLiteralExpression with scala.Double = js.native
  /* 148 */ val OfKeyword: OfKeyword with scala.Double = js.native
  /* 211 */ val OmittedExpression: OmittedExpression with scala.Double = js.native
  /* 18 */ val OpenBraceToken: OpenBraceToken with scala.Double = js.native
  /* 22 */ val OpenBracketToken: OpenBracketToken with scala.Double = js.native
  /* 20 */ val OpenParenToken: OpenParenToken with scala.Double = js.native
  /* 172 */ val OptionalType: OptionalType with scala.Double = js.native
  /* 113 */ val PackageKeyword: PackageKeyword with scala.Double = js.native
  /* 152 */ val Parameter: Parameter with scala.Double = js.native
  /* 196 */ val ParenthesizedExpression: ParenthesizedExpression with scala.Double = js.native
  /* 178 */ val ParenthesizedType: ParenthesizedType with scala.Double = js.native
  /* 314 */ val PartiallyEmittedExpression: PartiallyEmittedExpression with scala.Double = js.native
  /* 66 */ val PercentEqualsToken: PercentEqualsToken with scala.Double = js.native
  /* 43 */ val PercentToken: PercentToken with scala.Double = js.native
  /* 61 */ val PlusEqualsToken: PlusEqualsToken with scala.Double = js.native
  /* 44 */ val PlusPlusToken: PlusPlusToken with scala.Double = js.native
  /* 38 */ val PlusToken: PlusToken with scala.Double = js.native
  /* 204 */ val PostfixUnaryExpression: PostfixUnaryExpression with scala.Double = js.native
  /* 203 */ val PrefixUnaryExpression: PrefixUnaryExpression with scala.Double = js.native
  /* 114 */ val PrivateKeyword: PrivateKeyword with scala.Double = js.native
  /* 190 */ val PropertyAccessExpression: PropertyAccessExpression with scala.Double = js.native
  /* 276 */ val PropertyAssignment: PropertyAssignment with scala.Double = js.native
  /* 155 */ val PropertyDeclaration: PropertyDeclaration with scala.Double = js.native
  /* 154 */ val PropertySignature: PropertySignature with scala.Double = js.native
  /* 115 */ val ProtectedKeyword: ProtectedKeyword with scala.Double = js.native
  /* 116 */ val PublicKeyword: PublicKeyword with scala.Double = js.native
  /* 149 */ val QualifiedName: QualifiedName with scala.Double = js.native
  /* 56 */ val QuestionToken: QuestionToken with scala.Double = js.native
  /* 134 */ val ReadonlyKeyword: ReadonlyKeyword with scala.Double = js.native
  /* 13 */ val RegularExpressionLiteral: RegularExpressionLiteral with scala.Double = js.native
  /* 135 */ val RequireKeyword: RequireKeyword with scala.Double = js.native
  /* 173 */ val RestType: RestType with scala.Double = js.native
  /* 98 */ val ReturnKeyword: ReturnKeyword with scala.Double = js.native
  /* 231 */ val ReturnStatement: ReturnStatement with scala.Double = js.native
  /* 218 */ val SemicolonClassElement: SemicolonClassElement with scala.Double = js.native
  /* 26 */ val SemicolonToken: SemicolonToken with scala.Double = js.native
  /* 160 */ val SetAccessor: SetAccessor with scala.Double = js.native
  /* 138 */ val SetKeyword: SetKeyword with scala.Double = js.native
  /* 6 */ val ShebangTrivia: ShebangTrivia with scala.Double = js.native
  /* 277 */ val ShorthandPropertyAssignment: ShorthandPropertyAssignment with scala.Double = js.native
  /* 2 */ val SingleLineCommentTrivia: SingleLineCommentTrivia with scala.Double = js.native
  /* 65 */ val SlashEqualsToken: SlashEqualsToken with scala.Double = js.native
  /* 42 */ val SlashToken: SlashToken with scala.Double = js.native
  /* 285 */ val SourceFile: SourceFile with scala.Double = js.native
  /* 278 */ val SpreadAssignment: SpreadAssignment with scala.Double = js.native
  /* 209 */ val SpreadElement: SpreadElement with scala.Double = js.native
  /* 117 */ val StaticKeyword: StaticKeyword with scala.Double = js.native
  /* 139 */ val StringKeyword: StringKeyword with scala.Double = js.native
  /* 10 */ val StringLiteral: StringLiteral with scala.Double = js.native
  /* 99 */ val SuperKeyword: SuperKeyword with scala.Double = js.native
  /* 100 */ val SwitchKeyword: SwitchKeyword with scala.Double = js.native
  /* 233 */ val SwitchStatement: SwitchStatement with scala.Double = js.native
  /* 140 */ val SymbolKeyword: SymbolKeyword with scala.Double = js.native
  /* 312 */ val SyntaxList: SyntaxList with scala.Double = js.native
  /* 216 */ val SyntheticExpression: SyntheticExpression with scala.Double = js.native
  /* 194 */ val TaggedTemplateExpression: TaggedTemplateExpression with scala.Double = js.native
  /* 207 */ val TemplateExpression: TemplateExpression with scala.Double = js.native
  /* 15 */ val TemplateHead: TemplateHead with scala.Double = js.native
  /* 16 */ val TemplateMiddle: TemplateMiddle with scala.Double = js.native
  /* 217 */ val TemplateSpan: TemplateSpan with scala.Double = js.native
  /* 17 */ val TemplateTail: TemplateTail with scala.Double = js.native
  /* 101 */ val ThisKeyword: ThisKeyword with scala.Double = js.native
  /* 179 */ val ThisType: ThisType with scala.Double = js.native
  /* 102 */ val ThrowKeyword: ThrowKeyword with scala.Double = js.native
  /* 235 */ val ThrowStatement: ThrowStatement with scala.Double = js.native
  /* 53 */ val TildeToken: TildeToken with scala.Double = js.native
  /* 103 */ val TrueKeyword: TrueKeyword with scala.Double = js.native
  /* 104 */ val TryKeyword: TryKeyword with scala.Double = js.native
  /* 236 */ val TryStatement: TryStatement with scala.Double = js.native
  /* 171 */ val TupleType: TupleType with scala.Double = js.native
  /* 243 */ val TypeAliasDeclaration: TypeAliasDeclaration with scala.Double = js.native
  /* 195 */ val TypeAssertionExpression: TypeAssertionExpression with scala.Double = js.native
  /* 141 */ val TypeKeyword: TypeKeyword with scala.Double = js.native
  /* 169 */ val TypeLiteral: TypeLiteral with scala.Double = js.native
  /* 200 */ val TypeOfExpression: TypeOfExpression with scala.Double = js.native
  /* 105 */ val TypeOfKeyword: TypeOfKeyword with scala.Double = js.native
  /* 180 */ val TypeOperator: TypeOperator with scala.Double = js.native
  /* 151 */ val TypeParameter: TypeParameter with scala.Double = js.native
  /* 164 */ val TypePredicate: TypePredicate with scala.Double = js.native
  /* 168 */ val TypeQuery: TypeQuery with scala.Double = js.native
  /* 165 */ val TypeReference: TypeReference with scala.Double = js.native
  /* 142 */ val UndefinedKeyword: UndefinedKeyword with scala.Double = js.native
  /* 174 */ val UnionType: UnionType with scala.Double = js.native
  /* 143 */ val UniqueKeyword: UniqueKeyword with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 144 */ val UnknownKeyword: UnknownKeyword with scala.Double = js.native
  /* 283 */ val UnparsedInternalText: UnparsedInternalText with scala.Double = js.native
  /* 281 */ val UnparsedPrepend: UnparsedPrepend with scala.Double = js.native
  /* 280 */ val UnparsedPrologue: UnparsedPrologue with scala.Double = js.native
  /* 287 */ val UnparsedSource: UnparsedSource with scala.Double = js.native
  /* 284 */ val UnparsedSyntheticReference: UnparsedSyntheticReference with scala.Double = js.native
  /* 282 */ val UnparsedText: UnparsedText with scala.Double = js.native
  /* 106 */ val VarKeyword: VarKeyword with scala.Double = js.native
  /* 238 */ val VariableDeclaration: VariableDeclaration with scala.Double = js.native
  /* 239 */ val VariableDeclarationList: VariableDeclarationList with scala.Double = js.native
  /* 220 */ val VariableStatement: VariableStatement with scala.Double = js.native
  /* 201 */ val VoidExpression: VoidExpression with scala.Double = js.native
  /* 107 */ val VoidKeyword: VoidKeyword with scala.Double = js.native
  /* 108 */ val WhileKeyword: WhileKeyword with scala.Double = js.native
  /* 225 */ val WhileStatement: WhileStatement with scala.Double = js.native
  /* 5 */ val WhitespaceTrivia: WhitespaceTrivia with scala.Double = js.native
  /* 109 */ val WithKeyword: WithKeyword with scala.Double = js.native
  /* 232 */ val WithStatement: WithStatement with scala.Double = js.native
  /* 208 */ val YieldExpression: YieldExpression with scala.Double = js.native
  /* 118 */ val YieldKeyword: YieldKeyword with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.SyntaxKind with scala.Double] = js.native
}

