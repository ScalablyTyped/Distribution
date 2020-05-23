package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
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
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AmpersandAmpersandToken
    extends SyntaxKind
       with LogicalOperator
  
  @js.native
  sealed trait AmpersandEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait AmpersandToken
    extends SyntaxKind
       with BitwiseOperator
  
  @js.native
  sealed trait AnyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ArrayBindingPattern extends SyntaxKind
  
  @js.native
  sealed trait ArrayLiteralExpression extends SyntaxKind
  
  @js.native
  sealed trait ArrayType extends SyntaxKind
  
  @js.native
  sealed trait ArrowFunction extends SyntaxKind
  
  @js.native
  sealed trait AsExpression extends SyntaxKind
  
  @js.native
  sealed trait AsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AssertsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AsteriskAsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait AsteriskAsteriskToken extends SyntaxKind
  
  @js.native
  sealed trait AsteriskEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait AsteriskToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with MultiplicativeOperator
  
  @js.native
  sealed trait AsyncKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait AtToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait AwaitExpression extends SyntaxKind
  
  @js.native
  sealed trait AwaitKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
  @js.native
  sealed trait BacktickToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait BarBarToken
    extends SyntaxKind
       with LogicalOperator
  
  @js.native
  sealed trait BarEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait BarToken
    extends SyntaxKind
       with BitwiseOperator
  
  @js.native
  sealed trait BigIntKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait BigIntLiteral extends SyntaxKind
  
  @js.native
  sealed trait BinaryExpression extends SyntaxKind
  
  @js.native
  sealed trait BindingElement extends SyntaxKind
  
  @js.native
  sealed trait Block extends SyntaxKind
  
  @js.native
  sealed trait BooleanKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait BreakKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait BreakStatement extends SyntaxKind
  
  @js.native
  sealed trait Bundle extends SyntaxKind
  
  @js.native
  sealed trait CallExpression extends SyntaxKind
  
  @js.native
  sealed trait CallSignature extends SyntaxKind
  
  @js.native
  sealed trait CaretEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait CaretToken
    extends SyntaxKind
       with BitwiseOperator
  
  @js.native
  sealed trait CaseBlock extends SyntaxKind
  
  @js.native
  sealed trait CaseClause extends SyntaxKind
  
  @js.native
  sealed trait CaseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait CatchClause extends SyntaxKind
  
  @js.native
  sealed trait CatchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ClassDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ClassExpression extends SyntaxKind
  
  @js.native
  sealed trait ClassKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait CloseBraceToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait CloseBracketToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait CloseParenToken extends SyntaxKind
  
  @js.native
  sealed trait ColonToken extends SyntaxKind
  
  @js.native
  sealed trait CommaListExpression extends SyntaxKind
  
  @js.native
  sealed trait CommaToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with _BinaryOperator
  
  @js.native
  sealed trait ComputedPropertyName extends SyntaxKind
  
  @js.native
  sealed trait ConditionalExpression extends SyntaxKind
  
  @js.native
  sealed trait ConditionalType extends SyntaxKind
  
  @js.native
  sealed trait ConflictMarkerTrivia
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait ConstKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ConstructSignature extends SyntaxKind
  
  @js.native
  sealed trait Constructor extends SyntaxKind
  
  @js.native
  sealed trait ConstructorKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ConstructorType extends SyntaxKind
  
  @js.native
  sealed trait ContinueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ContinueStatement extends SyntaxKind
  
  @js.native
  sealed trait Count extends SyntaxKind
  
  @js.native
  sealed trait DebuggerKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DebuggerStatement extends SyntaxKind
  
  @js.native
  sealed trait DeclareKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait Decorator extends SyntaxKind
  
  @js.native
  sealed trait DefaultClause extends SyntaxKind
  
  @js.native
  sealed trait DefaultKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DeleteExpression extends SyntaxKind
  
  @js.native
  sealed trait DeleteKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DoKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait DoStatement extends SyntaxKind
  
  @js.native
  sealed trait DotDotDotToken extends SyntaxKind
  
  @js.native
  sealed trait DotToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait ElementAccessExpression extends SyntaxKind
  
  @js.native
  sealed trait ElseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait EmptyStatement extends SyntaxKind
  
  @js.native
  sealed trait EndOfDeclarationMarker extends SyntaxKind
  
  @js.native
  sealed trait EndOfFileToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait EnumDeclaration extends SyntaxKind
  
  @js.native
  sealed trait EnumKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait EnumMember extends SyntaxKind
  
  @js.native
  sealed trait EqualsEqualsEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait EqualsEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait EqualsGreaterThanToken extends SyntaxKind
  
  @js.native
  sealed trait EqualsToken
    extends AssignmentOperator
       with SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait ExclamationEqualsEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait ExclamationEqualsToken
    extends SyntaxKind
       with EqualityOperator
  
  @js.native
  sealed trait ExclamationToken
    extends SyntaxKind
       with PrefixUnaryOperator
  
  @js.native
  sealed trait ExportAssignment extends SyntaxKind
  
  @js.native
  sealed trait ExportDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ExportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ExportSpecifier extends SyntaxKind
  
  @js.native
  sealed trait ExpressionStatement extends SyntaxKind
  
  @js.native
  sealed trait ExpressionWithTypeArguments extends SyntaxKind
  
  @js.native
  sealed trait ExtendsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ExternalModuleReference extends SyntaxKind
  
  @js.native
  sealed trait FalseKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FinallyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FirstAssignment extends SyntaxKind
  
  @js.native
  sealed trait FirstBinaryOperator extends SyntaxKind
  
  @js.native
  sealed trait FirstCompoundAssignment extends SyntaxKind
  
  @js.native
  sealed trait FirstFutureReservedWord extends SyntaxKind
  
  @js.native
  sealed trait FirstJSDocNode extends SyntaxKind
  
  @js.native
  sealed trait FirstJSDocTagNode extends SyntaxKind
  
  @js.native
  sealed trait FirstKeyword extends SyntaxKind
  
  @js.native
  sealed trait FirstLiteralToken extends SyntaxKind
  
  @js.native
  sealed trait FirstNode extends SyntaxKind
  
  @js.native
  sealed trait FirstPunctuation extends SyntaxKind
  
  @js.native
  sealed trait FirstReservedWord extends SyntaxKind
  
  @js.native
  sealed trait FirstStatement extends SyntaxKind
  
  @js.native
  sealed trait FirstTemplateToken extends SyntaxKind
  
  @js.native
  sealed trait FirstToken extends SyntaxKind
  
  @js.native
  sealed trait FirstTriviaToken extends SyntaxKind
  
  @js.native
  sealed trait FirstTypeNode extends SyntaxKind
  
  @js.native
  sealed trait ForInStatement extends SyntaxKind
  
  @js.native
  sealed trait ForKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ForOfStatement extends SyntaxKind
  
  @js.native
  sealed trait ForStatement extends SyntaxKind
  
  @js.native
  sealed trait FromKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FunctionDeclaration extends SyntaxKind
  
  @js.native
  sealed trait FunctionExpression extends SyntaxKind
  
  @js.native
  sealed trait FunctionKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait FunctionType extends SyntaxKind
  
  @js.native
  sealed trait GetAccessor extends SyntaxKind
  
  @js.native
  sealed trait GetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait GlobalKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanEqualsToken
    extends SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait GreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait GreaterThanGreaterThanGreaterThanToken
    extends SyntaxKind
       with ShiftOperator
  
  @js.native
  sealed trait GreaterThanGreaterThanToken
    extends SyntaxKind
       with ShiftOperator
  
  @js.native
  sealed trait GreaterThanToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait HeritageClause extends SyntaxKind
  
  @js.native
  sealed trait Identifier
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait IfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait IfStatement extends SyntaxKind
  
  @js.native
  sealed trait ImplementsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ImportClause extends SyntaxKind
  
  @js.native
  sealed trait ImportDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ImportEqualsDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ImportKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ImportSpecifier extends SyntaxKind
  
  @js.native
  sealed trait ImportType extends SyntaxKind
  
  @js.native
  sealed trait InKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait IndexSignature extends SyntaxKind
  
  @js.native
  sealed trait IndexedAccessType extends SyntaxKind
  
  @js.native
  sealed trait InferKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait InferType extends SyntaxKind
  
  @js.native
  sealed trait InputFiles extends SyntaxKind
  
  @js.native
  sealed trait InstanceOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait InterfaceDeclaration extends SyntaxKind
  
  @js.native
  sealed trait InterfaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait IntersectionType extends SyntaxKind
  
  @js.native
  sealed trait IsKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait JSDocAllType extends SyntaxKind
  
  @js.native
  sealed trait JSDocAugmentsTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocAuthorTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocCallbackTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocClassTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocComment extends SyntaxKind
  
  @js.native
  sealed trait JSDocEnumTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocFunctionType extends SyntaxKind
  
  @js.native
  sealed trait JSDocImplementsTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocNamepathType extends SyntaxKind
  
  @js.native
  sealed trait JSDocNonNullableType extends SyntaxKind
  
  @js.native
  sealed trait JSDocNullableType extends SyntaxKind
  
  @js.native
  sealed trait JSDocOptionalType extends SyntaxKind
  
  @js.native
  sealed trait JSDocParameterTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocPrivateTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocPropertyTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocProtectedTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocPublicTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocReadonlyTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocReturnTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocSignature extends SyntaxKind
  
  @js.native
  sealed trait JSDocTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocTemplateTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocThisTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypeExpression extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypeLiteral extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypeTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocTypedefTag extends SyntaxKind
  
  @js.native
  sealed trait JSDocUnknownType extends SyntaxKind
  
  @js.native
  sealed trait JSDocVariadicType extends SyntaxKind
  
  @js.native
  sealed trait JsxAttribute extends SyntaxKind
  
  @js.native
  sealed trait JsxAttributes extends SyntaxKind
  
  @js.native
  sealed trait JsxClosingElement extends SyntaxKind
  
  @js.native
  sealed trait JsxClosingFragment extends SyntaxKind
  
  @js.native
  sealed trait JsxElement extends SyntaxKind
  
  @js.native
  sealed trait JsxExpression extends SyntaxKind
  
  @js.native
  sealed trait JsxFragment extends SyntaxKind
  
  @js.native
  sealed trait JsxOpeningElement extends SyntaxKind
  
  @js.native
  sealed trait JsxOpeningFragment extends SyntaxKind
  
  @js.native
  sealed trait JsxSelfClosingElement extends SyntaxKind
  
  @js.native
  sealed trait JsxSpreadAttribute extends SyntaxKind
  
  @js.native
  sealed trait JsxText
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait JsxTextAllWhiteSpaces
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait KeyOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait LabeledStatement extends SyntaxKind
  
  @js.native
  sealed trait LastAssignment extends SyntaxKind
  
  @js.native
  sealed trait LastBinaryOperator extends SyntaxKind
  
  @js.native
  sealed trait LastCompoundAssignment extends SyntaxKind
  
  @js.native
  sealed trait LastFutureReservedWord extends SyntaxKind
  
  @js.native
  sealed trait LastJSDocNode extends SyntaxKind
  
  @js.native
  sealed trait LastJSDocTagNode extends SyntaxKind
  
  @js.native
  sealed trait LastKeyword extends SyntaxKind
  
  @js.native
  sealed trait LastLiteralToken extends SyntaxKind
  
  @js.native
  sealed trait LastPunctuation extends SyntaxKind
  
  @js.native
  sealed trait LastReservedWord extends SyntaxKind
  
  @js.native
  sealed trait LastStatement extends SyntaxKind
  
  @js.native
  sealed trait LastTemplateToken extends SyntaxKind
  
  @js.native
  sealed trait LastToken extends SyntaxKind
  
  @js.native
  sealed trait LastTriviaToken extends SyntaxKind
  
  @js.native
  sealed trait LastTypeNode extends SyntaxKind
  
  @js.native
  sealed trait LessThanEqualsToken
    extends SyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait LessThanLessThanEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait LessThanLessThanToken
    extends SyntaxKind
       with ShiftOperator
  
  @js.native
  sealed trait LessThanSlashToken
    extends SyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait LessThanToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
       with RelationalOperator
  
  @js.native
  sealed trait LetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait LiteralType extends SyntaxKind
  
  @js.native
  sealed trait MappedType extends SyntaxKind
  
  @js.native
  sealed trait MergeDeclarationMarker extends SyntaxKind
  
  @js.native
  sealed trait MetaProperty extends SyntaxKind
  
  @js.native
  sealed trait MethodDeclaration extends SyntaxKind
  
  @js.native
  sealed trait MethodSignature extends SyntaxKind
  
  @js.native
  sealed trait MinusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait MinusMinusToken
    extends SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait MinusToken
    extends SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait MissingDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ModuleBlock extends SyntaxKind
  
  @js.native
  sealed trait ModuleDeclaration extends SyntaxKind
  
  @js.native
  sealed trait ModuleKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait MultiLineCommentTrivia
    extends SyntaxKind
       with CommentKind
  
  @js.native
  sealed trait NamedExports extends SyntaxKind
  
  @js.native
  sealed trait NamedImports extends SyntaxKind
  
  @js.native
  sealed trait NamespaceExport extends SyntaxKind
  
  @js.native
  sealed trait NamespaceExportDeclaration extends SyntaxKind
  
  @js.native
  sealed trait NamespaceImport extends SyntaxKind
  
  @js.native
  sealed trait NamespaceKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NeverKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NewExpression extends SyntaxKind
  
  @js.native
  sealed trait NewKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NewLineTrivia
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait NoSubstitutionTemplateLiteral extends SyntaxKind
  
  @js.native
  sealed trait NonNullExpression extends SyntaxKind
  
  @js.native
  sealed trait NotEmittedStatement extends SyntaxKind
  
  @js.native
  sealed trait NullKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NumberKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait NumericLiteral extends SyntaxKind
  
  @js.native
  sealed trait ObjectBindingPattern extends SyntaxKind
  
  @js.native
  sealed trait ObjectKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ObjectLiteralExpression extends SyntaxKind
  
  @js.native
  sealed trait OfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait OmittedExpression extends SyntaxKind
  
  @js.native
  sealed trait OpenBraceToken
    extends SyntaxKind
       with JSDocSyntaxKind
       with JsxTokenSyntaxKind
  
  @js.native
  sealed trait OpenBracketToken
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait OpenParenToken extends SyntaxKind
  
  @js.native
  sealed trait OptionalType extends SyntaxKind
  
  @js.native
  sealed trait PackageKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait Parameter extends SyntaxKind
  
  @js.native
  sealed trait ParenthesizedExpression extends SyntaxKind
  
  @js.native
  sealed trait ParenthesizedType extends SyntaxKind
  
  @js.native
  sealed trait PartiallyEmittedExpression extends SyntaxKind
  
  @js.native
  sealed trait PercentEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait PercentToken
    extends SyntaxKind
       with MultiplicativeOperator
  
  @js.native
  sealed trait PlusEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait PlusPlusToken
    extends SyntaxKind
       with PostfixUnaryOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait PlusToken
    extends SyntaxKind
       with AdditiveOperator
       with PrefixUnaryOperator
  
  @js.native
  sealed trait PostfixUnaryExpression extends SyntaxKind
  
  @js.native
  sealed trait PrefixUnaryExpression extends SyntaxKind
  
  @js.native
  sealed trait PrivateIdentifier extends SyntaxKind
  
  @js.native
  sealed trait PrivateKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait PropertyAccessExpression extends SyntaxKind
  
  @js.native
  sealed trait PropertyAssignment extends SyntaxKind
  
  @js.native
  sealed trait PropertyDeclaration extends SyntaxKind
  
  @js.native
  sealed trait PropertySignature extends SyntaxKind
  
  @js.native
  sealed trait ProtectedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait PublicKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait QualifiedName extends SyntaxKind
  
  @js.native
  sealed trait QuestionDotToken extends SyntaxKind
  
  @js.native
  sealed trait QuestionQuestionToken
    extends _AssignmentOperatorOrHigher
       with SyntaxKind
  
  @js.native
  sealed trait QuestionToken extends SyntaxKind
  
  @js.native
  sealed trait ReadonlyKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait RegularExpressionLiteral extends SyntaxKind
  
  @js.native
  sealed trait RequireKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait RestType extends SyntaxKind
  
  @js.native
  sealed trait ReturnKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ReturnStatement extends SyntaxKind
  
  @js.native
  sealed trait SemicolonClassElement extends SyntaxKind
  
  @js.native
  sealed trait SemicolonToken extends SyntaxKind
  
  @js.native
  sealed trait SetAccessor extends SyntaxKind
  
  @js.native
  sealed trait SetKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ShebangTrivia extends SyntaxKind
  
  @js.native
  sealed trait ShorthandPropertyAssignment extends SyntaxKind
  
  @js.native
  sealed trait SingleLineCommentTrivia
    extends SyntaxKind
       with CommentKind
  
  @js.native
  sealed trait SlashEqualsToken
    extends CompoundAssignmentOperator
       with SyntaxKind
  
  @js.native
  sealed trait SlashToken
    extends SyntaxKind
       with MultiplicativeOperator
  
  @js.native
  sealed trait SourceFile extends SyntaxKind
  
  @js.native
  sealed trait SpreadAssignment extends SyntaxKind
  
  @js.native
  sealed trait SpreadElement extends SyntaxKind
  
  @js.native
  sealed trait StaticKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait StringKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait StringLiteral extends SyntaxKind
  
  @js.native
  sealed trait SuperKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait SwitchKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait SwitchStatement extends SyntaxKind
  
  @js.native
  sealed trait SymbolKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait SyntaxList extends SyntaxKind
  
  @js.native
  sealed trait SyntheticExpression extends SyntaxKind
  
  @js.native
  sealed trait SyntheticReferenceExpression extends SyntaxKind
  
  @js.native
  sealed trait TaggedTemplateExpression extends SyntaxKind
  
  @js.native
  sealed trait TemplateExpression extends SyntaxKind
  
  @js.native
  sealed trait TemplateHead extends SyntaxKind
  
  @js.native
  sealed trait TemplateMiddle extends SyntaxKind
  
  @js.native
  sealed trait TemplateSpan extends SyntaxKind
  
  @js.native
  sealed trait TemplateTail extends SyntaxKind
  
  @js.native
  sealed trait ThisKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ThisType extends SyntaxKind
  
  @js.native
  sealed trait ThrowKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait ThrowStatement extends SyntaxKind
  
  @js.native
  sealed trait TildeToken
    extends SyntaxKind
       with PrefixUnaryOperator
  
  @js.native
  sealed trait TrueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TryKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TryStatement extends SyntaxKind
  
  @js.native
  sealed trait TupleType extends SyntaxKind
  
  @js.native
  sealed trait TypeAliasDeclaration extends SyntaxKind
  
  @js.native
  sealed trait TypeAssertionExpression extends SyntaxKind
  
  @js.native
  sealed trait TypeKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TypeLiteral extends SyntaxKind
  
  @js.native
  sealed trait TypeOfExpression extends SyntaxKind
  
  @js.native
  sealed trait TypeOfKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait TypeOperator extends SyntaxKind
  
  @js.native
  sealed trait TypeParameter extends SyntaxKind
  
  @js.native
  sealed trait TypePredicate extends SyntaxKind
  
  @js.native
  sealed trait TypeQuery extends SyntaxKind
  
  @js.native
  sealed trait TypeReference extends SyntaxKind
  
  @js.native
  sealed trait UndefinedKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait UnionType extends SyntaxKind
  
  @js.native
  sealed trait UniqueKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait Unknown
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait UnknownKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait UnparsedInternalText extends SyntaxKind
  
  @js.native
  sealed trait UnparsedPrepend extends SyntaxKind
  
  @js.native
  sealed trait UnparsedPrologue extends SyntaxKind
  
  @js.native
  sealed trait UnparsedSource extends SyntaxKind
  
  @js.native
  sealed trait UnparsedSyntheticReference extends SyntaxKind
  
  @js.native
  sealed trait UnparsedText extends SyntaxKind
  
  @js.native
  sealed trait VarKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait VariableDeclaration extends SyntaxKind
  
  @js.native
  sealed trait VariableDeclarationList extends SyntaxKind
  
  @js.native
  sealed trait VariableStatement extends SyntaxKind
  
  @js.native
  sealed trait VoidExpression extends SyntaxKind
  
  @js.native
  sealed trait VoidKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait WhileKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait WhileStatement extends SyntaxKind
  
  @js.native
  sealed trait WhitespaceTrivia
    extends SyntaxKind
       with JSDocSyntaxKind
  
  @js.native
  sealed trait WithKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @js.native
  sealed trait WithStatement extends SyntaxKind
  
  @js.native
  sealed trait YieldExpression extends SyntaxKind
  
  @js.native
  sealed trait YieldKeyword
    extends KeywordSyntaxKind
       with SyntaxKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
  /* 122 */ @js.native
  object AbstractKeyword extends TopLevel[AbstractKeyword with Double]
  
  /* 55 */ @js.native
  object AmpersandAmpersandToken extends TopLevel[AmpersandAmpersandToken with Double]
  
  /* 72 */ @js.native
  object AmpersandEqualsToken extends TopLevel[AmpersandEqualsToken with Double]
  
  /* 50 */ @js.native
  object AmpersandToken extends TopLevel[AmpersandToken with Double]
  
  /* 125 */ @js.native
  object AnyKeyword extends TopLevel[AnyKeyword with Double]
  
  /* 190 */ @js.native
  object ArrayBindingPattern
    extends TopLevel[typings.typescript.mod.SyntaxKind.ArrayBindingPattern with Double]
  
  /* 192 */ @js.native
  object ArrayLiteralExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ArrayLiteralExpression with Double]
  
  /* 174 */ @js.native
  object ArrayType extends TopLevel[ArrayType with Double]
  
  /* 202 */ @js.native
  object ArrowFunction
    extends TopLevel[typings.typescript.mod.SyntaxKind.ArrowFunction with Double]
  
  /* 217 */ @js.native
  object AsExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.AsExpression with Double]
  
  /* 123 */ @js.native
  object AsKeyword extends TopLevel[AsKeyword with Double]
  
  /* 124 */ @js.native
  object AssertsKeyword extends TopLevel[AssertsKeyword with Double]
  
  /* 66 */ @js.native
  object AsteriskAsteriskEqualsToken extends TopLevel[AsteriskAsteriskEqualsToken with Double]
  
  /* 42 */ @js.native
  object AsteriskAsteriskToken extends TopLevel[AsteriskAsteriskToken with Double]
  
  /* 65 */ @js.native
  object AsteriskEqualsToken extends TopLevel[AsteriskEqualsToken with Double]
  
  /* 41 */ @js.native
  object AsteriskToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.AsteriskToken with Double]
  
  /* 126 */ @js.native
  object AsyncKeyword extends TopLevel[AsyncKeyword with Double]
  
  /* 59 */ @js.native
  object AtToken extends TopLevel[AtToken with Double]
  
  /* 206 */ @js.native
  object AwaitExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.AwaitExpression with Double]
  
  /* 127 */ @js.native
  object AwaitKeyword extends TopLevel[AwaitKeyword with Double]
  
  /* 61 */ @js.native
  object BacktickToken extends TopLevel[BacktickToken with Double]
  
  /* 56 */ @js.native
  object BarBarToken extends TopLevel[BarBarToken with Double]
  
  /* 73 */ @js.native
  object BarEqualsToken extends TopLevel[BarEqualsToken with Double]
  
  /* 51 */ @js.native
  object BarToken extends TopLevel[BarToken with Double]
  
  /* 151 */ @js.native
  object BigIntKeyword extends TopLevel[BigIntKeyword with Double]
  
  /* 9 */ @js.native
  object BigIntLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.BigIntLiteral with Double]
  
  /* 209 */ @js.native
  object BinaryExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.BinaryExpression with Double]
  
  /* 191 */ @js.native
  object BindingElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.BindingElement with Double]
  
  /* 223 */ @js.native
  object Block
    extends TopLevel[typings.typescript.mod.SyntaxKind.Block with Double]
  
  /* 128 */ @js.native
  object BooleanKeyword extends TopLevel[BooleanKeyword with Double]
  
  /* 77 */ @js.native
  object BreakKeyword extends TopLevel[BreakKeyword with Double]
  
  /* 234 */ @js.native
  object BreakStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.BreakStatement with Double]
  
  /* 291 */ @js.native
  object Bundle
    extends TopLevel[typings.typescript.mod.SyntaxKind.Bundle with Double]
  
  /* 196 */ @js.native
  object CallExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.CallExpression with Double]
  
  /* 165 */ @js.native
  object CallSignature extends TopLevel[CallSignature with Double]
  
  /* 74 */ @js.native
  object CaretEqualsToken extends TopLevel[CaretEqualsToken with Double]
  
  /* 52 */ @js.native
  object CaretToken extends TopLevel[CaretToken with Double]
  
  /* 251 */ @js.native
  object CaseBlock
    extends TopLevel[typings.typescript.mod.SyntaxKind.CaseBlock with Double]
  
  /* 277 */ @js.native
  object CaseClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.CaseClause with Double]
  
  /* 78 */ @js.native
  object CaseKeyword extends TopLevel[CaseKeyword with Double]
  
  /* 280 */ @js.native
  object CatchClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.CatchClause with Double]
  
  /* 79 */ @js.native
  object CatchKeyword extends TopLevel[CatchKeyword with Double]
  
  /* 245 */ @js.native
  object ClassDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ClassDeclaration with Double]
  
  /* 214 */ @js.native
  object ClassExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ClassExpression with Double]
  
  /* 80 */ @js.native
  object ClassKeyword extends TopLevel[ClassKeyword with Double]
  
  /* 19 */ @js.native
  object CloseBraceToken extends TopLevel[CloseBraceToken with Double]
  
  /* 23 */ @js.native
  object CloseBracketToken extends TopLevel[CloseBracketToken with Double]
  
  /* 21 */ @js.native
  object CloseParenToken extends TopLevel[CloseParenToken with Double]
  
  /* 58 */ @js.native
  object ColonToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.ColonToken with Double]
  
  /* 327 */ @js.native
  object CommaListExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.CommaListExpression with Double]
  
  /* 27 */ @js.native
  object CommaToken extends TopLevel[CommaToken with Double]
  
  /* 154 */ @js.native
  object ComputedPropertyName
    extends TopLevel[typings.typescript.mod.SyntaxKind.ComputedPropertyName with Double]
  
  /* 210 */ @js.native
  object ConditionalExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ConditionalExpression with Double]
  
  /* 180 */ @js.native
  object ConditionalType
    extends TopLevel[typings.typescript.mod.SyntaxKind.ConditionalType with Double]
  
  /* 7 */ @js.native
  object ConflictMarkerTrivia extends TopLevel[ConflictMarkerTrivia with Double]
  
  /* 81 */ @js.native
  object ConstKeyword extends TopLevel[ConstKeyword with Double]
  
  /* 166 */ @js.native
  object ConstructSignature extends TopLevel[ConstructSignature with Double]
  
  /* 162 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  /* 129 */ @js.native
  object ConstructorKeyword extends TopLevel[ConstructorKeyword with Double]
  
  /* 171 */ @js.native
  object ConstructorType extends TopLevel[ConstructorType with Double]
  
  /* 82 */ @js.native
  object ContinueKeyword extends TopLevel[ContinueKeyword with Double]
  
  /* 233 */ @js.native
  object ContinueStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ContinueStatement with Double]
  
  /* 331 */ @js.native
  object Count extends TopLevel[Count with Double]
  
  /* 83 */ @js.native
  object DebuggerKeyword extends TopLevel[DebuggerKeyword with Double]
  
  /* 241 */ @js.native
  object DebuggerStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.DebuggerStatement with Double]
  
  /* 130 */ @js.native
  object DeclareKeyword extends TopLevel[DeclareKeyword with Double]
  
  /* 157 */ @js.native
  object Decorator
    extends TopLevel[typings.typescript.mod.SyntaxKind.Decorator with Double]
  
  /* 278 */ @js.native
  object DefaultClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.DefaultClause with Double]
  
  /* 84 */ @js.native
  object DefaultKeyword extends TopLevel[DefaultKeyword with Double]
  
  /* 203 */ @js.native
  object DeleteExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.DeleteExpression with Double]
  
  /* 85 */ @js.native
  object DeleteKeyword extends TopLevel[DeleteKeyword with Double]
  
  /* 86 */ @js.native
  object DoKeyword extends TopLevel[DoKeyword with Double]
  
  /* 228 */ @js.native
  object DoStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.DoStatement with Double]
  
  /* 25 */ @js.native
  object DotDotDotToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.DotDotDotToken with Double]
  
  /* 24 */ @js.native
  object DotToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.DotToken with Double]
  
  /* 195 */ @js.native
  object ElementAccessExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ElementAccessExpression with Double]
  
  /* 87 */ @js.native
  object ElseKeyword extends TopLevel[ElseKeyword with Double]
  
  /* 224 */ @js.native
  object EmptyStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.EmptyStatement with Double]
  
  /* 329 */ @js.native
  object EndOfDeclarationMarker extends TopLevel[EndOfDeclarationMarker with Double]
  
  /* 1 */ @js.native
  object EndOfFileToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.EndOfFileToken with Double]
  
  /* 248 */ @js.native
  object EnumDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.EnumDeclaration with Double]
  
  /* 88 */ @js.native
  object EnumKeyword extends TopLevel[EnumKeyword with Double]
  
  /* 284 */ @js.native
  object EnumMember
    extends TopLevel[typings.typescript.mod.SyntaxKind.EnumMember with Double]
  
  /* 36 */ @js.native
  object EqualsEqualsEqualsToken extends TopLevel[EqualsEqualsEqualsToken with Double]
  
  /* 34 */ @js.native
  object EqualsEqualsToken extends TopLevel[EqualsEqualsToken with Double]
  
  /* 38 */ @js.native
  object EqualsGreaterThanToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken with Double]
  
  /* 62 */ @js.native
  object EqualsToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.EqualsToken with Double]
  
  /* 37 */ @js.native
  object ExclamationEqualsEqualsToken extends TopLevel[ExclamationEqualsEqualsToken with Double]
  
  /* 35 */ @js.native
  object ExclamationEqualsToken extends TopLevel[ExclamationEqualsToken with Double]
  
  /* 53 */ @js.native
  object ExclamationToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExclamationToken with Double]
  
  /* 259 */ @js.native
  object ExportAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportAssignment with Double]
  
  /* 260 */ @js.native
  object ExportDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportDeclaration with Double]
  
  /* 89 */ @js.native
  object ExportKeyword extends TopLevel[ExportKeyword with Double]
  
  /* 263 */ @js.native
  object ExportSpecifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExportSpecifier with Double]
  
  /* 226 */ @js.native
  object ExpressionStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExpressionStatement with Double]
  
  /* 216 */ @js.native
  object ExpressionWithTypeArguments
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExpressionWithTypeArguments with Double]
  
  /* 90 */ @js.native
  object ExtendsKeyword extends TopLevel[ExtendsKeyword with Double]
  
  /* 265 */ @js.native
  object ExternalModuleReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.ExternalModuleReference with Double]
  
  /* 91 */ @js.native
  object FalseKeyword extends TopLevel[FalseKeyword with Double]
  
  /* 92 */ @js.native
  object FinallyKeyword extends TopLevel[FinallyKeyword with Double]
  
  /* 62 */ @js.native
  object FirstAssignment extends TopLevel[FirstAssignment with Double]
  
  /* 29 */ @js.native
  object FirstBinaryOperator extends TopLevel[FirstBinaryOperator with Double]
  
  /* 63 */ @js.native
  object FirstCompoundAssignment extends TopLevel[FirstCompoundAssignment with Double]
  
  /* 113 */ @js.native
  object FirstFutureReservedWord extends TopLevel[FirstFutureReservedWord with Double]
  
  /* 294 */ @js.native
  object FirstJSDocNode extends TopLevel[FirstJSDocNode with Double]
  
  /* 306 */ @js.native
  object FirstJSDocTagNode extends TopLevel[FirstJSDocTagNode with Double]
  
  /* 77 */ @js.native
  object FirstKeyword extends TopLevel[FirstKeyword with Double]
  
  /* 8 */ @js.native
  object FirstLiteralToken extends TopLevel[FirstLiteralToken with Double]
  
  /* 153 */ @js.native
  object FirstNode extends TopLevel[FirstNode with Double]
  
  /* 18 */ @js.native
  object FirstPunctuation extends TopLevel[FirstPunctuation with Double]
  
  /* 77 */ @js.native
  object FirstReservedWord extends TopLevel[FirstReservedWord with Double]
  
  /* 225 */ @js.native
  object FirstStatement extends TopLevel[FirstStatement with Double]
  
  /* 14 */ @js.native
  object FirstTemplateToken extends TopLevel[FirstTemplateToken with Double]
  
  /* 0 */ @js.native
  object FirstToken extends TopLevel[FirstToken with Double]
  
  /* 2 */ @js.native
  object FirstTriviaToken extends TopLevel[FirstTriviaToken with Double]
  
  /* 168 */ @js.native
  object FirstTypeNode extends TopLevel[FirstTypeNode with Double]
  
  /* 231 */ @js.native
  object ForInStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ForInStatement with Double]
  
  /* 93 */ @js.native
  object ForKeyword extends TopLevel[ForKeyword with Double]
  
  /* 232 */ @js.native
  object ForOfStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ForOfStatement with Double]
  
  /* 230 */ @js.native
  object ForStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ForStatement with Double]
  
  /* 149 */ @js.native
  object FromKeyword extends TopLevel[FromKeyword with Double]
  
  /* 244 */ @js.native
  object FunctionDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.FunctionDeclaration with Double]
  
  /* 201 */ @js.native
  object FunctionExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.FunctionExpression with Double]
  
  /* 94 */ @js.native
  object FunctionKeyword extends TopLevel[FunctionKeyword with Double]
  
  /* 170 */ @js.native
  object FunctionType extends TopLevel[FunctionType with Double]
  
  /* 163 */ @js.native
  object GetAccessor extends TopLevel[GetAccessor with Double]
  
  /* 131 */ @js.native
  object GetKeyword extends TopLevel[GetKeyword with Double]
  
  /* 150 */ @js.native
  object GlobalKeyword extends TopLevel[GlobalKeyword with Double]
  
  /* 33 */ @js.native
  object GreaterThanEqualsToken extends TopLevel[GreaterThanEqualsToken with Double]
  
  /* 70 */ @js.native
  object GreaterThanGreaterThanEqualsToken extends TopLevel[GreaterThanGreaterThanEqualsToken with Double]
  
  /* 71 */ @js.native
  object GreaterThanGreaterThanGreaterThanEqualsToken extends TopLevel[GreaterThanGreaterThanGreaterThanEqualsToken with Double]
  
  /* 49 */ @js.native
  object GreaterThanGreaterThanGreaterThanToken extends TopLevel[GreaterThanGreaterThanGreaterThanToken with Double]
  
  /* 48 */ @js.native
  object GreaterThanGreaterThanToken extends TopLevel[GreaterThanGreaterThanToken with Double]
  
  /* 31 */ @js.native
  object GreaterThanToken extends TopLevel[GreaterThanToken with Double]
  
  /* 279 */ @js.native
  object HeritageClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.HeritageClause with Double]
  
  /* 75 */ @js.native
  object Identifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.Identifier with Double]
  
  /* 95 */ @js.native
  object IfKeyword extends TopLevel[IfKeyword with Double]
  
  /* 227 */ @js.native
  object IfStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.IfStatement with Double]
  
  /* 113 */ @js.native
  object ImplementsKeyword extends TopLevel[ImplementsKeyword with Double]
  
  /* 255 */ @js.native
  object ImportClause
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportClause with Double]
  
  /* 254 */ @js.native
  object ImportDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportDeclaration with Double]
  
  /* 253 */ @js.native
  object ImportEqualsDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration with Double]
  
  /* 96 */ @js.native
  object ImportKeyword extends TopLevel[ImportKeyword with Double]
  
  /* 258 */ @js.native
  object ImportSpecifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.ImportSpecifier with Double]
  
  /* 188 */ @js.native
  object ImportType extends TopLevel[ImportType with Double]
  
  /* 97 */ @js.native
  object InKeyword extends TopLevel[InKeyword with Double]
  
  /* 167 */ @js.native
  object IndexSignature extends TopLevel[IndexSignature with Double]
  
  /* 185 */ @js.native
  object IndexedAccessType
    extends TopLevel[typings.typescript.mod.SyntaxKind.IndexedAccessType with Double]
  
  /* 132 */ @js.native
  object InferKeyword extends TopLevel[InferKeyword with Double]
  
  /* 181 */ @js.native
  object InferType extends TopLevel[InferType with Double]
  
  /* 293 */ @js.native
  object InputFiles
    extends TopLevel[typings.typescript.mod.SyntaxKind.InputFiles with Double]
  
  /* 98 */ @js.native
  object InstanceOfKeyword extends TopLevel[InstanceOfKeyword with Double]
  
  /* 246 */ @js.native
  object InterfaceDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.InterfaceDeclaration with Double]
  
  /* 114 */ @js.native
  object InterfaceKeyword extends TopLevel[InterfaceKeyword with Double]
  
  /* 179 */ @js.native
  object IntersectionType
    extends TopLevel[typings.typescript.mod.SyntaxKind.IntersectionType with Double]
  
  /* 133 */ @js.native
  object IsKeyword extends TopLevel[IsKeyword with Double]
  
  /* 295 */ @js.native
  object JSDocAllType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocAllType with Double]
  
  /* 307 */ @js.native
  object JSDocAugmentsTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocAugmentsTag with Double]
  
  /* 309 */ @js.native
  object JSDocAuthorTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocAuthorTag with Double]
  
  /* 315 */ @js.native
  object JSDocCallbackTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocCallbackTag with Double]
  
  /* 310 */ @js.native
  object JSDocClassTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocClassTag with Double]
  
  /* 303 */ @js.native
  object JSDocComment extends TopLevel[JSDocComment with Double]
  
  /* 316 */ @js.native
  object JSDocEnumTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocEnumTag with Double]
  
  /* 300 */ @js.native
  object JSDocFunctionType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocFunctionType with Double]
  
  /* 308 */ @js.native
  object JSDocImplementsTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocImplementsTag with Double]
  
  /* 302 */ @js.native
  object JSDocNamepathType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNamepathType with Double]
  
  /* 298 */ @js.native
  object JSDocNonNullableType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNonNullableType with Double]
  
  /* 297 */ @js.native
  object JSDocNullableType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocNullableType with Double]
  
  /* 299 */ @js.native
  object JSDocOptionalType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocOptionalType with Double]
  
  /* 317 */ @js.native
  object JSDocParameterTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocParameterTag with Double]
  
  /* 312 */ @js.native
  object JSDocPrivateTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocPrivateTag with Double]
  
  /* 323 */ @js.native
  object JSDocPropertyTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocPropertyTag with Double]
  
  /* 313 */ @js.native
  object JSDocProtectedTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocProtectedTag with Double]
  
  /* 311 */ @js.native
  object JSDocPublicTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocPublicTag with Double]
  
  /* 314 */ @js.native
  object JSDocReadonlyTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocReadonlyTag with Double]
  
  /* 318 */ @js.native
  object JSDocReturnTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocReturnTag with Double]
  
  /* 305 */ @js.native
  object JSDocSignature
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocSignature with Double]
  
  /* 306 */ @js.native
  object JSDocTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTag with Double]
  
  /* 321 */ @js.native
  object JSDocTemplateTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTemplateTag with Double]
  
  /* 319 */ @js.native
  object JSDocThisTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocThisTag with Double]
  
  /* 294 */ @js.native
  object JSDocTypeExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypeExpression with Double]
  
  /* 304 */ @js.native
  object JSDocTypeLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypeLiteral with Double]
  
  /* 320 */ @js.native
  object JSDocTypeTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypeTag with Double]
  
  /* 322 */ @js.native
  object JSDocTypedefTag
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocTypedefTag with Double]
  
  /* 296 */ @js.native
  object JSDocUnknownType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocUnknownType with Double]
  
  /* 301 */ @js.native
  object JSDocVariadicType
    extends TopLevel[typings.typescript.mod.SyntaxKind.JSDocVariadicType with Double]
  
  /* 273 */ @js.native
  object JsxAttribute
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxAttribute with Double]
  
  /* 274 */ @js.native
  object JsxAttributes
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxAttributes with Double]
  
  /* 269 */ @js.native
  object JsxClosingElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxClosingElement with Double]
  
  /* 272 */ @js.native
  object JsxClosingFragment
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxClosingFragment with Double]
  
  /* 266 */ @js.native
  object JsxElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxElement with Double]
  
  /* 276 */ @js.native
  object JsxExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxExpression with Double]
  
  /* 270 */ @js.native
  object JsxFragment
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxFragment with Double]
  
  /* 268 */ @js.native
  object JsxOpeningElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxOpeningElement with Double]
  
  /* 271 */ @js.native
  object JsxOpeningFragment
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxOpeningFragment with Double]
  
  /* 267 */ @js.native
  object JsxSelfClosingElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxSelfClosingElement with Double]
  
  /* 275 */ @js.native
  object JsxSpreadAttribute
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxSpreadAttribute with Double]
  
  /* 11 */ @js.native
  object JsxText
    extends TopLevel[typings.typescript.mod.SyntaxKind.JsxText with Double]
  
  /* 12 */ @js.native
  object JsxTextAllWhiteSpaces extends TopLevel[JsxTextAllWhiteSpaces with Double]
  
  /* 134 */ @js.native
  object KeyOfKeyword extends TopLevel[KeyOfKeyword with Double]
  
  /* 238 */ @js.native
  object LabeledStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.LabeledStatement with Double]
  
  /* 74 */ @js.native
  object LastAssignment extends TopLevel[LastAssignment with Double]
  
  /* 74 */ @js.native
  object LastBinaryOperator extends TopLevel[LastBinaryOperator with Double]
  
  /* 74 */ @js.native
  object LastCompoundAssignment extends TopLevel[LastCompoundAssignment with Double]
  
  /* 121 */ @js.native
  object LastFutureReservedWord extends TopLevel[LastFutureReservedWord with Double]
  
  /* 323 */ @js.native
  object LastJSDocNode extends TopLevel[LastJSDocNode with Double]
  
  /* 323 */ @js.native
  object LastJSDocTagNode extends TopLevel[LastJSDocTagNode with Double]
  
  /* 152 */ @js.native
  object LastKeyword extends TopLevel[LastKeyword with Double]
  
  /* 14 */ @js.native
  object LastLiteralToken extends TopLevel[LastLiteralToken with Double]
  
  /* 74 */ @js.native
  object LastPunctuation extends TopLevel[LastPunctuation with Double]
  
  /* 112 */ @js.native
  object LastReservedWord extends TopLevel[LastReservedWord with Double]
  
  /* 241 */ @js.native
  object LastStatement extends TopLevel[LastStatement with Double]
  
  /* 17 */ @js.native
  object LastTemplateToken extends TopLevel[LastTemplateToken with Double]
  
  /* 152 */ @js.native
  object LastToken extends TopLevel[LastToken with Double]
  
  /* 7 */ @js.native
  object LastTriviaToken extends TopLevel[LastTriviaToken with Double]
  
  /* 188 */ @js.native
  object LastTypeNode extends TopLevel[LastTypeNode with Double]
  
  /* 32 */ @js.native
  object LessThanEqualsToken extends TopLevel[LessThanEqualsToken with Double]
  
  /* 69 */ @js.native
  object LessThanLessThanEqualsToken extends TopLevel[LessThanLessThanEqualsToken with Double]
  
  /* 47 */ @js.native
  object LessThanLessThanToken extends TopLevel[LessThanLessThanToken with Double]
  
  /* 30 */ @js.native
  object LessThanSlashToken extends TopLevel[LessThanSlashToken with Double]
  
  /* 29 */ @js.native
  object LessThanToken extends TopLevel[LessThanToken with Double]
  
  /* 115 */ @js.native
  object LetKeyword extends TopLevel[LetKeyword with Double]
  
  /* 187 */ @js.native
  object LiteralType
    extends TopLevel[typings.typescript.mod.SyntaxKind.LiteralType with Double]
  
  /* 186 */ @js.native
  object MappedType extends TopLevel[MappedType with Double]
  
  /* 328 */ @js.native
  object MergeDeclarationMarker extends TopLevel[MergeDeclarationMarker with Double]
  
  /* 219 */ @js.native
  object MetaProperty
    extends TopLevel[typings.typescript.mod.SyntaxKind.MetaProperty with Double]
  
  /* 161 */ @js.native
  object MethodDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.MethodDeclaration with Double]
  
  /* 160 */ @js.native
  object MethodSignature
    extends TopLevel[typings.typescript.mod.SyntaxKind.MethodSignature with Double]
  
  /* 64 */ @js.native
  object MinusEqualsToken extends TopLevel[MinusEqualsToken with Double]
  
  /* 46 */ @js.native
  object MinusMinusToken extends TopLevel[MinusMinusToken with Double]
  
  /* 40 */ @js.native
  object MinusToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.MinusToken with Double]
  
  /* 264 */ @js.native
  object MissingDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.MissingDeclaration with Double]
  
  /* 250 */ @js.native
  object ModuleBlock
    extends TopLevel[typings.typescript.mod.SyntaxKind.ModuleBlock with Double]
  
  /* 249 */ @js.native
  object ModuleDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.ModuleDeclaration with Double]
  
  /* 135 */ @js.native
  object ModuleKeyword extends TopLevel[ModuleKeyword with Double]
  
  /* 3 */ @js.native
  object MultiLineCommentTrivia extends TopLevel[MultiLineCommentTrivia with Double]
  
  /* 261 */ @js.native
  object NamedExports
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamedExports with Double]
  
  /* 257 */ @js.native
  object NamedImports
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamedImports with Double]
  
  /* 262 */ @js.native
  object NamespaceExport
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamespaceExport with Double]
  
  /* 252 */ @js.native
  object NamespaceExportDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamespaceExportDeclaration with Double]
  
  /* 256 */ @js.native
  object NamespaceImport
    extends TopLevel[typings.typescript.mod.SyntaxKind.NamespaceImport with Double]
  
  /* 136 */ @js.native
  object NamespaceKeyword extends TopLevel[NamespaceKeyword with Double]
  
  /* 137 */ @js.native
  object NeverKeyword extends TopLevel[NeverKeyword with Double]
  
  /* 197 */ @js.native
  object NewExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.NewExpression with Double]
  
  /* 99 */ @js.native
  object NewKeyword extends TopLevel[NewKeyword with Double]
  
  /* 4 */ @js.native
  object NewLineTrivia extends TopLevel[NewLineTrivia with Double]
  
  /* 14 */ @js.native
  object NoSubstitutionTemplateLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.NoSubstitutionTemplateLiteral with Double]
  
  /* 218 */ @js.native
  object NonNullExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.NonNullExpression with Double]
  
  /* 325 */ @js.native
  object NotEmittedStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.NotEmittedStatement with Double]
  
  /* 100 */ @js.native
  object NullKeyword extends TopLevel[NullKeyword with Double]
  
  /* 140 */ @js.native
  object NumberKeyword extends TopLevel[NumberKeyword with Double]
  
  /* 8 */ @js.native
  object NumericLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.NumericLiteral with Double]
  
  /* 189 */ @js.native
  object ObjectBindingPattern
    extends TopLevel[typings.typescript.mod.SyntaxKind.ObjectBindingPattern with Double]
  
  /* 141 */ @js.native
  object ObjectKeyword extends TopLevel[ObjectKeyword with Double]
  
  /* 193 */ @js.native
  object ObjectLiteralExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ObjectLiteralExpression with Double]
  
  /* 152 */ @js.native
  object OfKeyword extends TopLevel[OfKeyword with Double]
  
  /* 215 */ @js.native
  object OmittedExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.OmittedExpression with Double]
  
  /* 18 */ @js.native
  object OpenBraceToken extends TopLevel[OpenBraceToken with Double]
  
  /* 22 */ @js.native
  object OpenBracketToken extends TopLevel[OpenBracketToken with Double]
  
  /* 20 */ @js.native
  object OpenParenToken extends TopLevel[OpenParenToken with Double]
  
  /* 176 */ @js.native
  object OptionalType extends TopLevel[OptionalType with Double]
  
  /* 116 */ @js.native
  object PackageKeyword extends TopLevel[PackageKeyword with Double]
  
  /* 156 */ @js.native
  object Parameter extends TopLevel[Parameter with Double]
  
  /* 200 */ @js.native
  object ParenthesizedExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.ParenthesizedExpression with Double]
  
  /* 182 */ @js.native
  object ParenthesizedType extends TopLevel[ParenthesizedType with Double]
  
  /* 326 */ @js.native
  object PartiallyEmittedExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PartiallyEmittedExpression with Double]
  
  /* 68 */ @js.native
  object PercentEqualsToken extends TopLevel[PercentEqualsToken with Double]
  
  /* 44 */ @js.native
  object PercentToken extends TopLevel[PercentToken with Double]
  
  /* 63 */ @js.native
  object PlusEqualsToken extends TopLevel[PlusEqualsToken with Double]
  
  /* 45 */ @js.native
  object PlusPlusToken extends TopLevel[PlusPlusToken with Double]
  
  /* 39 */ @js.native
  object PlusToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.PlusToken with Double]
  
  /* 208 */ @js.native
  object PostfixUnaryExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PostfixUnaryExpression with Double]
  
  /* 207 */ @js.native
  object PrefixUnaryExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PrefixUnaryExpression with Double]
  
  /* 76 */ @js.native
  object PrivateIdentifier
    extends TopLevel[typings.typescript.mod.SyntaxKind.PrivateIdentifier with Double]
  
  /* 117 */ @js.native
  object PrivateKeyword extends TopLevel[PrivateKeyword with Double]
  
  /* 194 */ @js.native
  object PropertyAccessExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertyAccessExpression with Double]
  
  /* 281 */ @js.native
  object PropertyAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertyAssignment with Double]
  
  /* 159 */ @js.native
  object PropertyDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertyDeclaration with Double]
  
  /* 158 */ @js.native
  object PropertySignature
    extends TopLevel[typings.typescript.mod.SyntaxKind.PropertySignature with Double]
  
  /* 118 */ @js.native
  object ProtectedKeyword extends TopLevel[ProtectedKeyword with Double]
  
  /* 119 */ @js.native
  object PublicKeyword extends TopLevel[PublicKeyword with Double]
  
  /* 153 */ @js.native
  object QualifiedName
    extends TopLevel[typings.typescript.mod.SyntaxKind.QualifiedName with Double]
  
  /* 28 */ @js.native
  object QuestionDotToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.QuestionDotToken with Double]
  
  /* 60 */ @js.native
  object QuestionQuestionToken extends TopLevel[QuestionQuestionToken with Double]
  
  /* 57 */ @js.native
  object QuestionToken
    extends TopLevel[typings.typescript.mod.SyntaxKind.QuestionToken with Double]
  
  /* 138 */ @js.native
  object ReadonlyKeyword extends TopLevel[ReadonlyKeyword with Double]
  
  /* 13 */ @js.native
  object RegularExpressionLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.RegularExpressionLiteral with Double]
  
  /* 139 */ @js.native
  object RequireKeyword extends TopLevel[RequireKeyword with Double]
  
  /* 177 */ @js.native
  object RestType extends TopLevel[RestType with Double]
  
  /* 101 */ @js.native
  object ReturnKeyword extends TopLevel[ReturnKeyword with Double]
  
  /* 235 */ @js.native
  object ReturnStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ReturnStatement with Double]
  
  /* 222 */ @js.native
  object SemicolonClassElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.SemicolonClassElement with Double]
  
  /* 26 */ @js.native
  object SemicolonToken extends TopLevel[SemicolonToken with Double]
  
  /* 164 */ @js.native
  object SetAccessor extends TopLevel[SetAccessor with Double]
  
  /* 142 */ @js.native
  object SetKeyword extends TopLevel[SetKeyword with Double]
  
  /* 6 */ @js.native
  object ShebangTrivia extends TopLevel[ShebangTrivia with Double]
  
  /* 282 */ @js.native
  object ShorthandPropertyAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.ShorthandPropertyAssignment with Double]
  
  /* 2 */ @js.native
  object SingleLineCommentTrivia extends TopLevel[SingleLineCommentTrivia with Double]
  
  /* 67 */ @js.native
  object SlashEqualsToken extends TopLevel[SlashEqualsToken with Double]
  
  /* 43 */ @js.native
  object SlashToken extends TopLevel[SlashToken with Double]
  
  /* 290 */ @js.native
  object SourceFile
    extends TopLevel[typings.typescript.mod.SyntaxKind.SourceFile with Double]
  
  /* 283 */ @js.native
  object SpreadAssignment
    extends TopLevel[typings.typescript.mod.SyntaxKind.SpreadAssignment with Double]
  
  /* 213 */ @js.native
  object SpreadElement
    extends TopLevel[typings.typescript.mod.SyntaxKind.SpreadElement with Double]
  
  /* 120 */ @js.native
  object StaticKeyword extends TopLevel[StaticKeyword with Double]
  
  /* 143 */ @js.native
  object StringKeyword extends TopLevel[StringKeyword with Double]
  
  /* 10 */ @js.native
  object StringLiteral
    extends TopLevel[typings.typescript.mod.SyntaxKind.StringLiteral with Double]
  
  /* 102 */ @js.native
  object SuperKeyword extends TopLevel[SuperKeyword with Double]
  
  /* 103 */ @js.native
  object SwitchKeyword extends TopLevel[SwitchKeyword with Double]
  
  /* 237 */ @js.native
  object SwitchStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.SwitchStatement with Double]
  
  /* 144 */ @js.native
  object SymbolKeyword extends TopLevel[SymbolKeyword with Double]
  
  /* 324 */ @js.native
  object SyntaxList
    extends TopLevel[typings.typescript.mod.SyntaxKind.SyntaxList with Double]
  
  /* 220 */ @js.native
  object SyntheticExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.SyntheticExpression with Double]
  
  /* 330 */ @js.native
  object SyntheticReferenceExpression extends TopLevel[SyntheticReferenceExpression with Double]
  
  /* 198 */ @js.native
  object TaggedTemplateExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.TaggedTemplateExpression with Double]
  
  /* 211 */ @js.native
  object TemplateExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateExpression with Double]
  
  /* 15 */ @js.native
  object TemplateHead
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateHead with Double]
  
  /* 16 */ @js.native
  object TemplateMiddle
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateMiddle with Double]
  
  /* 221 */ @js.native
  object TemplateSpan
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateSpan with Double]
  
  /* 17 */ @js.native
  object TemplateTail
    extends TopLevel[typings.typescript.mod.SyntaxKind.TemplateTail with Double]
  
  /* 104 */ @js.native
  object ThisKeyword extends TopLevel[ThisKeyword with Double]
  
  /* 183 */ @js.native
  object ThisType extends TopLevel[ThisType with Double]
  
  /* 105 */ @js.native
  object ThrowKeyword extends TopLevel[ThrowKeyword with Double]
  
  /* 239 */ @js.native
  object ThrowStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.ThrowStatement with Double]
  
  /* 54 */ @js.native
  object TildeToken extends TopLevel[TildeToken with Double]
  
  /* 106 */ @js.native
  object TrueKeyword extends TopLevel[TrueKeyword with Double]
  
  /* 107 */ @js.native
  object TryKeyword extends TopLevel[TryKeyword with Double]
  
  /* 240 */ @js.native
  object TryStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.TryStatement with Double]
  
  /* 175 */ @js.native
  object TupleType
    extends TopLevel[typings.typescript.mod.SyntaxKind.TupleType with Double]
  
  /* 247 */ @js.native
  object TypeAliasDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeAliasDeclaration with Double]
  
  /* 199 */ @js.native
  object TypeAssertionExpression extends TopLevel[TypeAssertionExpression with Double]
  
  /* 145 */ @js.native
  object TypeKeyword extends TopLevel[TypeKeyword with Double]
  
  /* 173 */ @js.native
  object TypeLiteral extends TopLevel[TypeLiteral with Double]
  
  /* 204 */ @js.native
  object TypeOfExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeOfExpression with Double]
  
  /* 108 */ @js.native
  object TypeOfKeyword extends TopLevel[TypeOfKeyword with Double]
  
  /* 184 */ @js.native
  object TypeOperator extends TopLevel[TypeOperator with Double]
  
  /* 155 */ @js.native
  object TypeParameter
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeParameter with Double]
  
  /* 168 */ @js.native
  object TypePredicate
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypePredicate with Double]
  
  /* 172 */ @js.native
  object TypeQuery extends TopLevel[TypeQuery with Double]
  
  /* 169 */ @js.native
  object TypeReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.TypeReference with Double]
  
  /* 146 */ @js.native
  object UndefinedKeyword extends TopLevel[UndefinedKeyword with Double]
  
  /* 178 */ @js.native
  object UnionType
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnionType with Double]
  
  /* 147 */ @js.native
  object UniqueKeyword extends TopLevel[UniqueKeyword with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  /* 148 */ @js.native
  object UnknownKeyword extends TopLevel[UnknownKeyword with Double]
  
  /* 288 */ @js.native
  object UnparsedInternalText extends TopLevel[UnparsedInternalText with Double]
  
  /* 286 */ @js.native
  object UnparsedPrepend
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedPrepend with Double]
  
  /* 285 */ @js.native
  object UnparsedPrologue
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedPrologue with Double]
  
  /* 292 */ @js.native
  object UnparsedSource
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedSource with Double]
  
  /* 289 */ @js.native
  object UnparsedSyntheticReference
    extends TopLevel[typings.typescript.mod.SyntaxKind.UnparsedSyntheticReference with Double]
  
  /* 287 */ @js.native
  object UnparsedText extends TopLevel[UnparsedText with Double]
  
  /* 109 */ @js.native
  object VarKeyword extends TopLevel[VarKeyword with Double]
  
  /* 242 */ @js.native
  object VariableDeclaration
    extends TopLevel[typings.typescript.mod.SyntaxKind.VariableDeclaration with Double]
  
  /* 243 */ @js.native
  object VariableDeclarationList
    extends TopLevel[typings.typescript.mod.SyntaxKind.VariableDeclarationList with Double]
  
  /* 225 */ @js.native
  object VariableStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.VariableStatement with Double]
  
  /* 205 */ @js.native
  object VoidExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.VoidExpression with Double]
  
  /* 110 */ @js.native
  object VoidKeyword extends TopLevel[VoidKeyword with Double]
  
  /* 111 */ @js.native
  object WhileKeyword extends TopLevel[WhileKeyword with Double]
  
  /* 229 */ @js.native
  object WhileStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.WhileStatement with Double]
  
  /* 5 */ @js.native
  object WhitespaceTrivia extends TopLevel[WhitespaceTrivia with Double]
  
  /* 112 */ @js.native
  object WithKeyword extends TopLevel[WithKeyword with Double]
  
  /* 236 */ @js.native
  object WithStatement
    extends TopLevel[typings.typescript.mod.SyntaxKind.WithStatement with Double]
  
  /* 212 */ @js.native
  object YieldExpression
    extends TopLevel[typings.typescript.mod.SyntaxKind.YieldExpression with Double]
  
  /* 121 */ @js.native
  object YieldKeyword extends TopLevel[YieldKeyword with Double]
  
}

