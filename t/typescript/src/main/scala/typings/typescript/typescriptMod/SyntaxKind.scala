package typings.typescript.typescriptMod

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
    extends SyntaxKind
       with AssignmentOperator
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
  sealed trait JSDocPropertyTag extends SyntaxKind
  
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
  
  /* 119 */ val AbstractKeyword: typings.typescript.typescriptMod.SyntaxKind.AbstractKeyword with Double = js.native
  /* 54 */ val AmpersandAmpersandToken: typings.typescript.typescriptMod.SyntaxKind.AmpersandAmpersandToken with Double = js.native
  /* 70 */ val AmpersandEqualsToken: typings.typescript.typescriptMod.SyntaxKind.AmpersandEqualsToken with Double = js.native
  /* 49 */ val AmpersandToken: typings.typescript.typescriptMod.SyntaxKind.AmpersandToken with Double = js.native
  /* 121 */ val AnyKeyword: typings.typescript.typescriptMod.SyntaxKind.AnyKeyword with Double = js.native
  /* 186 */ val ArrayBindingPattern: typings.typescript.typescriptMod.SyntaxKind.ArrayBindingPattern with Double = js.native
  /* 188 */ val ArrayLiteralExpression: typings.typescript.typescriptMod.SyntaxKind.ArrayLiteralExpression with Double = js.native
  /* 170 */ val ArrayType: typings.typescript.typescriptMod.SyntaxKind.ArrayType with Double = js.native
  /* 198 */ val ArrowFunction: typings.typescript.typescriptMod.SyntaxKind.ArrowFunction with Double = js.native
  /* 213 */ val AsExpression: typings.typescript.typescriptMod.SyntaxKind.AsExpression with Double = js.native
  /* 120 */ val AsKeyword: typings.typescript.typescriptMod.SyntaxKind.AsKeyword with Double = js.native
  /* 64 */ val AsteriskAsteriskEqualsToken: typings.typescript.typescriptMod.SyntaxKind.AsteriskAsteriskEqualsToken with Double = js.native
  /* 41 */ val AsteriskAsteriskToken: typings.typescript.typescriptMod.SyntaxKind.AsteriskAsteriskToken with Double = js.native
  /* 63 */ val AsteriskEqualsToken: typings.typescript.typescriptMod.SyntaxKind.AsteriskEqualsToken with Double = js.native
  /* 40 */ val AsteriskToken: typings.typescript.typescriptMod.SyntaxKind.AsteriskToken with Double = js.native
  /* 122 */ val AsyncKeyword: typings.typescript.typescriptMod.SyntaxKind.AsyncKeyword with Double = js.native
  /* 58 */ val AtToken: typings.typescript.typescriptMod.SyntaxKind.AtToken with Double = js.native
  /* 202 */ val AwaitExpression: typings.typescript.typescriptMod.SyntaxKind.AwaitExpression with Double = js.native
  /* 123 */ val AwaitKeyword: typings.typescript.typescriptMod.SyntaxKind.AwaitKeyword with Double = js.native
  /* 59 */ val BacktickToken: typings.typescript.typescriptMod.SyntaxKind.BacktickToken with Double = js.native
  /* 55 */ val BarBarToken: typings.typescript.typescriptMod.SyntaxKind.BarBarToken with Double = js.native
  /* 71 */ val BarEqualsToken: typings.typescript.typescriptMod.SyntaxKind.BarEqualsToken with Double = js.native
  /* 50 */ val BarToken: typings.typescript.typescriptMod.SyntaxKind.BarToken with Double = js.native
  /* 147 */ val BigIntKeyword: typings.typescript.typescriptMod.SyntaxKind.BigIntKeyword with Double = js.native
  /* 9 */ val BigIntLiteral: typings.typescript.typescriptMod.SyntaxKind.BigIntLiteral with Double = js.native
  /* 205 */ val BinaryExpression: typings.typescript.typescriptMod.SyntaxKind.BinaryExpression with Double = js.native
  /* 187 */ val BindingElement: typings.typescript.typescriptMod.SyntaxKind.BindingElement with Double = js.native
  /* 219 */ val Block: typings.typescript.typescriptMod.SyntaxKind.Block with Double = js.native
  /* 124 */ val BooleanKeyword: typings.typescript.typescriptMod.SyntaxKind.BooleanKeyword with Double = js.native
  /* 74 */ val BreakKeyword: typings.typescript.typescriptMod.SyntaxKind.BreakKeyword with Double = js.native
  /* 230 */ val BreakStatement: typings.typescript.typescriptMod.SyntaxKind.BreakStatement with Double = js.native
  /* 286 */ val Bundle: typings.typescript.typescriptMod.SyntaxKind.Bundle with Double = js.native
  /* 192 */ val CallExpression: typings.typescript.typescriptMod.SyntaxKind.CallExpression with Double = js.native
  /* 161 */ val CallSignature: typings.typescript.typescriptMod.SyntaxKind.CallSignature with Double = js.native
  /* 72 */ val CaretEqualsToken: typings.typescript.typescriptMod.SyntaxKind.CaretEqualsToken with Double = js.native
  /* 51 */ val CaretToken: typings.typescript.typescriptMod.SyntaxKind.CaretToken with Double = js.native
  /* 247 */ val CaseBlock: typings.typescript.typescriptMod.SyntaxKind.CaseBlock with Double = js.native
  /* 272 */ val CaseClause: typings.typescript.typescriptMod.SyntaxKind.CaseClause with Double = js.native
  /* 75 */ val CaseKeyword: typings.typescript.typescriptMod.SyntaxKind.CaseKeyword with Double = js.native
  /* 275 */ val CatchClause: typings.typescript.typescriptMod.SyntaxKind.CatchClause with Double = js.native
  /* 76 */ val CatchKeyword: typings.typescript.typescriptMod.SyntaxKind.CatchKeyword with Double = js.native
  /* 241 */ val ClassDeclaration: typings.typescript.typescriptMod.SyntaxKind.ClassDeclaration with Double = js.native
  /* 210 */ val ClassExpression: typings.typescript.typescriptMod.SyntaxKind.ClassExpression with Double = js.native
  /* 77 */ val ClassKeyword: typings.typescript.typescriptMod.SyntaxKind.ClassKeyword with Double = js.native
  /* 19 */ val CloseBraceToken: typings.typescript.typescriptMod.SyntaxKind.CloseBraceToken with Double = js.native
  /* 23 */ val CloseBracketToken: typings.typescript.typescriptMod.SyntaxKind.CloseBracketToken with Double = js.native
  /* 21 */ val CloseParenToken: typings.typescript.typescriptMod.SyntaxKind.CloseParenToken with Double = js.native
  /* 57 */ val ColonToken: typings.typescript.typescriptMod.SyntaxKind.ColonToken with Double = js.native
  /* 317 */ val CommaListExpression: typings.typescript.typescriptMod.SyntaxKind.CommaListExpression with Double = js.native
  /* 27 */ val CommaToken: typings.typescript.typescriptMod.SyntaxKind.CommaToken with Double = js.native
  /* 150 */ val ComputedPropertyName: typings.typescript.typescriptMod.SyntaxKind.ComputedPropertyName with Double = js.native
  /* 206 */ val ConditionalExpression: typings.typescript.typescriptMod.SyntaxKind.ConditionalExpression with Double = js.native
  /* 176 */ val ConditionalType: typings.typescript.typescriptMod.SyntaxKind.ConditionalType with Double = js.native
  /* 7 */ val ConflictMarkerTrivia: typings.typescript.typescriptMod.SyntaxKind.ConflictMarkerTrivia with Double = js.native
  /* 78 */ val ConstKeyword: typings.typescript.typescriptMod.SyntaxKind.ConstKeyword with Double = js.native
  /* 162 */ val ConstructSignature: typings.typescript.typescriptMod.SyntaxKind.ConstructSignature with Double = js.native
  /* 158 */ val Constructor: typings.typescript.typescriptMod.SyntaxKind.Constructor with Double = js.native
  /* 125 */ val ConstructorKeyword: typings.typescript.typescriptMod.SyntaxKind.ConstructorKeyword with Double = js.native
  /* 167 */ val ConstructorType: typings.typescript.typescriptMod.SyntaxKind.ConstructorType with Double = js.native
  /* 79 */ val ContinueKeyword: typings.typescript.typescriptMod.SyntaxKind.ContinueKeyword with Double = js.native
  /* 229 */ val ContinueStatement: typings.typescript.typescriptMod.SyntaxKind.ContinueStatement with Double = js.native
  /* 320 */ val Count: typings.typescript.typescriptMod.SyntaxKind.Count with Double = js.native
  /* 80 */ val DebuggerKeyword: typings.typescript.typescriptMod.SyntaxKind.DebuggerKeyword with Double = js.native
  /* 237 */ val DebuggerStatement: typings.typescript.typescriptMod.SyntaxKind.DebuggerStatement with Double = js.native
  /* 126 */ val DeclareKeyword: typings.typescript.typescriptMod.SyntaxKind.DeclareKeyword with Double = js.native
  /* 153 */ val Decorator: typings.typescript.typescriptMod.SyntaxKind.Decorator with Double = js.native
  /* 273 */ val DefaultClause: typings.typescript.typescriptMod.SyntaxKind.DefaultClause with Double = js.native
  /* 81 */ val DefaultKeyword: typings.typescript.typescriptMod.SyntaxKind.DefaultKeyword with Double = js.native
  /* 199 */ val DeleteExpression: typings.typescript.typescriptMod.SyntaxKind.DeleteExpression with Double = js.native
  /* 82 */ val DeleteKeyword: typings.typescript.typescriptMod.SyntaxKind.DeleteKeyword with Double = js.native
  /* 83 */ val DoKeyword: typings.typescript.typescriptMod.SyntaxKind.DoKeyword with Double = js.native
  /* 224 */ val DoStatement: typings.typescript.typescriptMod.SyntaxKind.DoStatement with Double = js.native
  /* 25 */ val DotDotDotToken: typings.typescript.typescriptMod.SyntaxKind.DotDotDotToken with Double = js.native
  /* 24 */ val DotToken: typings.typescript.typescriptMod.SyntaxKind.DotToken with Double = js.native
  /* 191 */ val ElementAccessExpression: typings.typescript.typescriptMod.SyntaxKind.ElementAccessExpression with Double = js.native
  /* 84 */ val ElseKeyword: typings.typescript.typescriptMod.SyntaxKind.ElseKeyword with Double = js.native
  /* 221 */ val EmptyStatement: typings.typescript.typescriptMod.SyntaxKind.EmptyStatement with Double = js.native
  /* 319 */ val EndOfDeclarationMarker: typings.typescript.typescriptMod.SyntaxKind.EndOfDeclarationMarker with Double = js.native
  /* 1 */ val EndOfFileToken: typings.typescript.typescriptMod.SyntaxKind.EndOfFileToken with Double = js.native
  /* 244 */ val EnumDeclaration: typings.typescript.typescriptMod.SyntaxKind.EnumDeclaration with Double = js.native
  /* 85 */ val EnumKeyword: typings.typescript.typescriptMod.SyntaxKind.EnumKeyword with Double = js.native
  /* 279 */ val EnumMember: typings.typescript.typescriptMod.SyntaxKind.EnumMember with Double = js.native
  /* 35 */ val EqualsEqualsEqualsToken: typings.typescript.typescriptMod.SyntaxKind.EqualsEqualsEqualsToken with Double = js.native
  /* 33 */ val EqualsEqualsToken: typings.typescript.typescriptMod.SyntaxKind.EqualsEqualsToken with Double = js.native
  /* 37 */ val EqualsGreaterThanToken: typings.typescript.typescriptMod.SyntaxKind.EqualsGreaterThanToken with Double = js.native
  /* 60 */ val EqualsToken: typings.typescript.typescriptMod.SyntaxKind.EqualsToken with Double = js.native
  /* 36 */ val ExclamationEqualsEqualsToken: typings.typescript.typescriptMod.SyntaxKind.ExclamationEqualsEqualsToken with Double = js.native
  /* 34 */ val ExclamationEqualsToken: typings.typescript.typescriptMod.SyntaxKind.ExclamationEqualsToken with Double = js.native
  /* 52 */ val ExclamationToken: typings.typescript.typescriptMod.SyntaxKind.ExclamationToken with Double = js.native
  /* 255 */ val ExportAssignment: typings.typescript.typescriptMod.SyntaxKind.ExportAssignment with Double = js.native
  /* 256 */ val ExportDeclaration: typings.typescript.typescriptMod.SyntaxKind.ExportDeclaration with Double = js.native
  /* 86 */ val ExportKeyword: typings.typescript.typescriptMod.SyntaxKind.ExportKeyword with Double = js.native
  /* 258 */ val ExportSpecifier: typings.typescript.typescriptMod.SyntaxKind.ExportSpecifier with Double = js.native
  /* 222 */ val ExpressionStatement: typings.typescript.typescriptMod.SyntaxKind.ExpressionStatement with Double = js.native
  /* 212 */ val ExpressionWithTypeArguments: typings.typescript.typescriptMod.SyntaxKind.ExpressionWithTypeArguments with Double = js.native
  /* 87 */ val ExtendsKeyword: typings.typescript.typescriptMod.SyntaxKind.ExtendsKeyword with Double = js.native
  /* 260 */ val ExternalModuleReference: typings.typescript.typescriptMod.SyntaxKind.ExternalModuleReference with Double = js.native
  /* 88 */ val FalseKeyword: typings.typescript.typescriptMod.SyntaxKind.FalseKeyword with Double = js.native
  /* 89 */ val FinallyKeyword: typings.typescript.typescriptMod.SyntaxKind.FinallyKeyword with Double = js.native
  /* 60 */ val FirstAssignment: typings.typescript.typescriptMod.SyntaxKind.FirstAssignment with Double = js.native
  /* 28 */ val FirstBinaryOperator: typings.typescript.typescriptMod.SyntaxKind.FirstBinaryOperator with Double = js.native
  /* 61 */ val FirstCompoundAssignment: typings.typescript.typescriptMod.SyntaxKind.FirstCompoundAssignment with Double = js.native
  /* 110 */ val FirstFutureReservedWord: typings.typescript.typescriptMod.SyntaxKind.FirstFutureReservedWord with Double = js.native
  /* 289 */ val FirstJSDocNode: typings.typescript.typescriptMod.SyntaxKind.FirstJSDocNode with Double = js.native
  /* 301 */ val FirstJSDocTagNode: typings.typescript.typescriptMod.SyntaxKind.FirstJSDocTagNode with Double = js.native
  /* 74 */ val FirstKeyword: typings.typescript.typescriptMod.SyntaxKind.FirstKeyword with Double = js.native
  /* 8 */ val FirstLiteralToken: typings.typescript.typescriptMod.SyntaxKind.FirstLiteralToken with Double = js.native
  /* 149 */ val FirstNode: typings.typescript.typescriptMod.SyntaxKind.FirstNode with Double = js.native
  /* 18 */ val FirstPunctuation: typings.typescript.typescriptMod.SyntaxKind.FirstPunctuation with Double = js.native
  /* 74 */ val FirstReservedWord: typings.typescript.typescriptMod.SyntaxKind.FirstReservedWord with Double = js.native
  /* 14 */ val FirstTemplateToken: typings.typescript.typescriptMod.SyntaxKind.FirstTemplateToken with Double = js.native
  /* 0 */ val FirstToken: typings.typescript.typescriptMod.SyntaxKind.FirstToken with Double = js.native
  /* 2 */ val FirstTriviaToken: typings.typescript.typescriptMod.SyntaxKind.FirstTriviaToken with Double = js.native
  /* 164 */ val FirstTypeNode: typings.typescript.typescriptMod.SyntaxKind.FirstTypeNode with Double = js.native
  /* 227 */ val ForInStatement: typings.typescript.typescriptMod.SyntaxKind.ForInStatement with Double = js.native
  /* 90 */ val ForKeyword: typings.typescript.typescriptMod.SyntaxKind.ForKeyword with Double = js.native
  /* 228 */ val ForOfStatement: typings.typescript.typescriptMod.SyntaxKind.ForOfStatement with Double = js.native
  /* 226 */ val ForStatement: typings.typescript.typescriptMod.SyntaxKind.ForStatement with Double = js.native
  /* 145 */ val FromKeyword: typings.typescript.typescriptMod.SyntaxKind.FromKeyword with Double = js.native
  /* 240 */ val FunctionDeclaration: typings.typescript.typescriptMod.SyntaxKind.FunctionDeclaration with Double = js.native
  /* 197 */ val FunctionExpression: typings.typescript.typescriptMod.SyntaxKind.FunctionExpression with Double = js.native
  /* 91 */ val FunctionKeyword: typings.typescript.typescriptMod.SyntaxKind.FunctionKeyword with Double = js.native
  /* 166 */ val FunctionType: typings.typescript.typescriptMod.SyntaxKind.FunctionType with Double = js.native
  /* 159 */ val GetAccessor: typings.typescript.typescriptMod.SyntaxKind.GetAccessor with Double = js.native
  /* 127 */ val GetKeyword: typings.typescript.typescriptMod.SyntaxKind.GetKeyword with Double = js.native
  /* 146 */ val GlobalKeyword: typings.typescript.typescriptMod.SyntaxKind.GlobalKeyword with Double = js.native
  /* 32 */ val GreaterThanEqualsToken: typings.typescript.typescriptMod.SyntaxKind.GreaterThanEqualsToken with Double = js.native
  /* 68 */ val GreaterThanGreaterThanEqualsToken: typings.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanEqualsToken with Double = js.native
  /* 69 */ val GreaterThanGreaterThanGreaterThanEqualsToken: typings.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken with Double = js.native
  /* 48 */ val GreaterThanGreaterThanGreaterThanToken: typings.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanGreaterThanToken with Double = js.native
  /* 47 */ val GreaterThanGreaterThanToken: typings.typescript.typescriptMod.SyntaxKind.GreaterThanGreaterThanToken with Double = js.native
  /* 30 */ val GreaterThanToken: typings.typescript.typescriptMod.SyntaxKind.GreaterThanToken with Double = js.native
  /* 274 */ val HeritageClause: typings.typescript.typescriptMod.SyntaxKind.HeritageClause with Double = js.native
  /* 73 */ val Identifier: typings.typescript.typescriptMod.SyntaxKind.Identifier with Double = js.native
  /* 92 */ val IfKeyword: typings.typescript.typescriptMod.SyntaxKind.IfKeyword with Double = js.native
  /* 223 */ val IfStatement: typings.typescript.typescriptMod.SyntaxKind.IfStatement with Double = js.native
  /* 110 */ val ImplementsKeyword: typings.typescript.typescriptMod.SyntaxKind.ImplementsKeyword with Double = js.native
  /* 251 */ val ImportClause: typings.typescript.typescriptMod.SyntaxKind.ImportClause with Double = js.native
  /* 250 */ val ImportDeclaration: typings.typescript.typescriptMod.SyntaxKind.ImportDeclaration with Double = js.native
  /* 249 */ val ImportEqualsDeclaration: typings.typescript.typescriptMod.SyntaxKind.ImportEqualsDeclaration with Double = js.native
  /* 93 */ val ImportKeyword: typings.typescript.typescriptMod.SyntaxKind.ImportKeyword with Double = js.native
  /* 254 */ val ImportSpecifier: typings.typescript.typescriptMod.SyntaxKind.ImportSpecifier with Double = js.native
  /* 184 */ val ImportType: typings.typescript.typescriptMod.SyntaxKind.ImportType with Double = js.native
  /* 94 */ val InKeyword: typings.typescript.typescriptMod.SyntaxKind.InKeyword with Double = js.native
  /* 163 */ val IndexSignature: typings.typescript.typescriptMod.SyntaxKind.IndexSignature with Double = js.native
  /* 181 */ val IndexedAccessType: typings.typescript.typescriptMod.SyntaxKind.IndexedAccessType with Double = js.native
  /* 128 */ val InferKeyword: typings.typescript.typescriptMod.SyntaxKind.InferKeyword with Double = js.native
  /* 177 */ val InferType: typings.typescript.typescriptMod.SyntaxKind.InferType with Double = js.native
  /* 288 */ val InputFiles: typings.typescript.typescriptMod.SyntaxKind.InputFiles with Double = js.native
  /* 95 */ val InstanceOfKeyword: typings.typescript.typescriptMod.SyntaxKind.InstanceOfKeyword with Double = js.native
  /* 242 */ val InterfaceDeclaration: typings.typescript.typescriptMod.SyntaxKind.InterfaceDeclaration with Double = js.native
  /* 111 */ val InterfaceKeyword: typings.typescript.typescriptMod.SyntaxKind.InterfaceKeyword with Double = js.native
  /* 175 */ val IntersectionType: typings.typescript.typescriptMod.SyntaxKind.IntersectionType with Double = js.native
  /* 129 */ val IsKeyword: typings.typescript.typescriptMod.SyntaxKind.IsKeyword with Double = js.native
  /* 290 */ val JSDocAllType: typings.typescript.typescriptMod.SyntaxKind.JSDocAllType with Double = js.native
  /* 302 */ val JSDocAugmentsTag: typings.typescript.typescriptMod.SyntaxKind.JSDocAugmentsTag with Double = js.native
  /* 303 */ val JSDocAuthorTag: typings.typescript.typescriptMod.SyntaxKind.JSDocAuthorTag with Double = js.native
  /* 305 */ val JSDocCallbackTag: typings.typescript.typescriptMod.SyntaxKind.JSDocCallbackTag with Double = js.native
  /* 304 */ val JSDocClassTag: typings.typescript.typescriptMod.SyntaxKind.JSDocClassTag with Double = js.native
  /* 298 */ val JSDocComment: typings.typescript.typescriptMod.SyntaxKind.JSDocComment with Double = js.native
  /* 306 */ val JSDocEnumTag: typings.typescript.typescriptMod.SyntaxKind.JSDocEnumTag with Double = js.native
  /* 295 */ val JSDocFunctionType: typings.typescript.typescriptMod.SyntaxKind.JSDocFunctionType with Double = js.native
  /* 297 */ val JSDocNamepathType: typings.typescript.typescriptMod.SyntaxKind.JSDocNamepathType with Double = js.native
  /* 293 */ val JSDocNonNullableType: typings.typescript.typescriptMod.SyntaxKind.JSDocNonNullableType with Double = js.native
  /* 292 */ val JSDocNullableType: typings.typescript.typescriptMod.SyntaxKind.JSDocNullableType with Double = js.native
  /* 294 */ val JSDocOptionalType: typings.typescript.typescriptMod.SyntaxKind.JSDocOptionalType with Double = js.native
  /* 307 */ val JSDocParameterTag: typings.typescript.typescriptMod.SyntaxKind.JSDocParameterTag with Double = js.native
  /* 313 */ val JSDocPropertyTag: typings.typescript.typescriptMod.SyntaxKind.JSDocPropertyTag with Double = js.native
  /* 308 */ val JSDocReturnTag: typings.typescript.typescriptMod.SyntaxKind.JSDocReturnTag with Double = js.native
  /* 300 */ val JSDocSignature: typings.typescript.typescriptMod.SyntaxKind.JSDocSignature with Double = js.native
  /* 301 */ val JSDocTag: typings.typescript.typescriptMod.SyntaxKind.JSDocTag with Double = js.native
  /* 311 */ val JSDocTemplateTag: typings.typescript.typescriptMod.SyntaxKind.JSDocTemplateTag with Double = js.native
  /* 309 */ val JSDocThisTag: typings.typescript.typescriptMod.SyntaxKind.JSDocThisTag with Double = js.native
  /* 289 */ val JSDocTypeExpression: typings.typescript.typescriptMod.SyntaxKind.JSDocTypeExpression with Double = js.native
  /* 299 */ val JSDocTypeLiteral: typings.typescript.typescriptMod.SyntaxKind.JSDocTypeLiteral with Double = js.native
  /* 310 */ val JSDocTypeTag: typings.typescript.typescriptMod.SyntaxKind.JSDocTypeTag with Double = js.native
  /* 312 */ val JSDocTypedefTag: typings.typescript.typescriptMod.SyntaxKind.JSDocTypedefTag with Double = js.native
  /* 291 */ val JSDocUnknownType: typings.typescript.typescriptMod.SyntaxKind.JSDocUnknownType with Double = js.native
  /* 296 */ val JSDocVariadicType: typings.typescript.typescriptMod.SyntaxKind.JSDocVariadicType with Double = js.native
  /* 268 */ val JsxAttribute: typings.typescript.typescriptMod.SyntaxKind.JsxAttribute with Double = js.native
  /* 269 */ val JsxAttributes: typings.typescript.typescriptMod.SyntaxKind.JsxAttributes with Double = js.native
  /* 264 */ val JsxClosingElement: typings.typescript.typescriptMod.SyntaxKind.JsxClosingElement with Double = js.native
  /* 267 */ val JsxClosingFragment: typings.typescript.typescriptMod.SyntaxKind.JsxClosingFragment with Double = js.native
  /* 261 */ val JsxElement: typings.typescript.typescriptMod.SyntaxKind.JsxElement with Double = js.native
  /* 271 */ val JsxExpression: typings.typescript.typescriptMod.SyntaxKind.JsxExpression with Double = js.native
  /* 265 */ val JsxFragment: typings.typescript.typescriptMod.SyntaxKind.JsxFragment with Double = js.native
  /* 263 */ val JsxOpeningElement: typings.typescript.typescriptMod.SyntaxKind.JsxOpeningElement with Double = js.native
  /* 266 */ val JsxOpeningFragment: typings.typescript.typescriptMod.SyntaxKind.JsxOpeningFragment with Double = js.native
  /* 262 */ val JsxSelfClosingElement: typings.typescript.typescriptMod.SyntaxKind.JsxSelfClosingElement with Double = js.native
  /* 270 */ val JsxSpreadAttribute: typings.typescript.typescriptMod.SyntaxKind.JsxSpreadAttribute with Double = js.native
  /* 11 */ val JsxText: typings.typescript.typescriptMod.SyntaxKind.JsxText with Double = js.native
  /* 12 */ val JsxTextAllWhiteSpaces: typings.typescript.typescriptMod.SyntaxKind.JsxTextAllWhiteSpaces with Double = js.native
  /* 130 */ val KeyOfKeyword: typings.typescript.typescriptMod.SyntaxKind.KeyOfKeyword with Double = js.native
  /* 234 */ val LabeledStatement: typings.typescript.typescriptMod.SyntaxKind.LabeledStatement with Double = js.native
  /* 72 */ val LastAssignment: typings.typescript.typescriptMod.SyntaxKind.LastAssignment with Double = js.native
  /* 72 */ val LastBinaryOperator: typings.typescript.typescriptMod.SyntaxKind.LastBinaryOperator with Double = js.native
  /* 72 */ val LastCompoundAssignment: typings.typescript.typescriptMod.SyntaxKind.LastCompoundAssignment with Double = js.native
  /* 118 */ val LastFutureReservedWord: typings.typescript.typescriptMod.SyntaxKind.LastFutureReservedWord with Double = js.native
  /* 313 */ val LastJSDocNode: typings.typescript.typescriptMod.SyntaxKind.LastJSDocNode with Double = js.native
  /* 313 */ val LastJSDocTagNode: typings.typescript.typescriptMod.SyntaxKind.LastJSDocTagNode with Double = js.native
  /* 148 */ val LastKeyword: typings.typescript.typescriptMod.SyntaxKind.LastKeyword with Double = js.native
  /* 14 */ val LastLiteralToken: typings.typescript.typescriptMod.SyntaxKind.LastLiteralToken with Double = js.native
  /* 72 */ val LastPunctuation: typings.typescript.typescriptMod.SyntaxKind.LastPunctuation with Double = js.native
  /* 109 */ val LastReservedWord: typings.typescript.typescriptMod.SyntaxKind.LastReservedWord with Double = js.native
  /* 17 */ val LastTemplateToken: typings.typescript.typescriptMod.SyntaxKind.LastTemplateToken with Double = js.native
  /* 148 */ val LastToken: typings.typescript.typescriptMod.SyntaxKind.LastToken with Double = js.native
  /* 7 */ val LastTriviaToken: typings.typescript.typescriptMod.SyntaxKind.LastTriviaToken with Double = js.native
  /* 184 */ val LastTypeNode: typings.typescript.typescriptMod.SyntaxKind.LastTypeNode with Double = js.native
  /* 31 */ val LessThanEqualsToken: typings.typescript.typescriptMod.SyntaxKind.LessThanEqualsToken with Double = js.native
  /* 67 */ val LessThanLessThanEqualsToken: typings.typescript.typescriptMod.SyntaxKind.LessThanLessThanEqualsToken with Double = js.native
  /* 46 */ val LessThanLessThanToken: typings.typescript.typescriptMod.SyntaxKind.LessThanLessThanToken with Double = js.native
  /* 29 */ val LessThanSlashToken: typings.typescript.typescriptMod.SyntaxKind.LessThanSlashToken with Double = js.native
  /* 28 */ val LessThanToken: typings.typescript.typescriptMod.SyntaxKind.LessThanToken with Double = js.native
  /* 112 */ val LetKeyword: typings.typescript.typescriptMod.SyntaxKind.LetKeyword with Double = js.native
  /* 183 */ val LiteralType: typings.typescript.typescriptMod.SyntaxKind.LiteralType with Double = js.native
  /* 182 */ val MappedType: typings.typescript.typescriptMod.SyntaxKind.MappedType with Double = js.native
  /* 318 */ val MergeDeclarationMarker: typings.typescript.typescriptMod.SyntaxKind.MergeDeclarationMarker with Double = js.native
  /* 215 */ val MetaProperty: typings.typescript.typescriptMod.SyntaxKind.MetaProperty with Double = js.native
  /* 157 */ val MethodDeclaration: typings.typescript.typescriptMod.SyntaxKind.MethodDeclaration with Double = js.native
  /* 156 */ val MethodSignature: typings.typescript.typescriptMod.SyntaxKind.MethodSignature with Double = js.native
  /* 62 */ val MinusEqualsToken: typings.typescript.typescriptMod.SyntaxKind.MinusEqualsToken with Double = js.native
  /* 45 */ val MinusMinusToken: typings.typescript.typescriptMod.SyntaxKind.MinusMinusToken with Double = js.native
  /* 39 */ val MinusToken: typings.typescript.typescriptMod.SyntaxKind.MinusToken with Double = js.native
  /* 259 */ val MissingDeclaration: typings.typescript.typescriptMod.SyntaxKind.MissingDeclaration with Double = js.native
  /* 246 */ val ModuleBlock: typings.typescript.typescriptMod.SyntaxKind.ModuleBlock with Double = js.native
  /* 245 */ val ModuleDeclaration: typings.typescript.typescriptMod.SyntaxKind.ModuleDeclaration with Double = js.native
  /* 131 */ val ModuleKeyword: typings.typescript.typescriptMod.SyntaxKind.ModuleKeyword with Double = js.native
  /* 3 */ val MultiLineCommentTrivia: typings.typescript.typescriptMod.SyntaxKind.MultiLineCommentTrivia with Double = js.native
  /* 257 */ val NamedExports: typings.typescript.typescriptMod.SyntaxKind.NamedExports with Double = js.native
  /* 253 */ val NamedImports: typings.typescript.typescriptMod.SyntaxKind.NamedImports with Double = js.native
  /* 248 */ val NamespaceExportDeclaration: typings.typescript.typescriptMod.SyntaxKind.NamespaceExportDeclaration with Double = js.native
  /* 252 */ val NamespaceImport: typings.typescript.typescriptMod.SyntaxKind.NamespaceImport with Double = js.native
  /* 132 */ val NamespaceKeyword: typings.typescript.typescriptMod.SyntaxKind.NamespaceKeyword with Double = js.native
  /* 133 */ val NeverKeyword: typings.typescript.typescriptMod.SyntaxKind.NeverKeyword with Double = js.native
  /* 193 */ val NewExpression: typings.typescript.typescriptMod.SyntaxKind.NewExpression with Double = js.native
  /* 96 */ val NewKeyword: typings.typescript.typescriptMod.SyntaxKind.NewKeyword with Double = js.native
  /* 4 */ val NewLineTrivia: typings.typescript.typescriptMod.SyntaxKind.NewLineTrivia with Double = js.native
  /* 14 */ val NoSubstitutionTemplateLiteral: typings.typescript.typescriptMod.SyntaxKind.NoSubstitutionTemplateLiteral with Double = js.native
  /* 214 */ val NonNullExpression: typings.typescript.typescriptMod.SyntaxKind.NonNullExpression with Double = js.native
  /* 315 */ val NotEmittedStatement: typings.typescript.typescriptMod.SyntaxKind.NotEmittedStatement with Double = js.native
  /* 97 */ val NullKeyword: typings.typescript.typescriptMod.SyntaxKind.NullKeyword with Double = js.native
  /* 136 */ val NumberKeyword: typings.typescript.typescriptMod.SyntaxKind.NumberKeyword with Double = js.native
  /* 8 */ val NumericLiteral: typings.typescript.typescriptMod.SyntaxKind.NumericLiteral with Double = js.native
  /* 185 */ val ObjectBindingPattern: typings.typescript.typescriptMod.SyntaxKind.ObjectBindingPattern with Double = js.native
  /* 137 */ val ObjectKeyword: typings.typescript.typescriptMod.SyntaxKind.ObjectKeyword with Double = js.native
  /* 189 */ val ObjectLiteralExpression: typings.typescript.typescriptMod.SyntaxKind.ObjectLiteralExpression with Double = js.native
  /* 148 */ val OfKeyword: typings.typescript.typescriptMod.SyntaxKind.OfKeyword with Double = js.native
  /* 211 */ val OmittedExpression: typings.typescript.typescriptMod.SyntaxKind.OmittedExpression with Double = js.native
  /* 18 */ val OpenBraceToken: typings.typescript.typescriptMod.SyntaxKind.OpenBraceToken with Double = js.native
  /* 22 */ val OpenBracketToken: typings.typescript.typescriptMod.SyntaxKind.OpenBracketToken with Double = js.native
  /* 20 */ val OpenParenToken: typings.typescript.typescriptMod.SyntaxKind.OpenParenToken with Double = js.native
  /* 172 */ val OptionalType: typings.typescript.typescriptMod.SyntaxKind.OptionalType with Double = js.native
  /* 113 */ val PackageKeyword: typings.typescript.typescriptMod.SyntaxKind.PackageKeyword with Double = js.native
  /* 152 */ val Parameter: typings.typescript.typescriptMod.SyntaxKind.Parameter with Double = js.native
  /* 196 */ val ParenthesizedExpression: typings.typescript.typescriptMod.SyntaxKind.ParenthesizedExpression with Double = js.native
  /* 178 */ val ParenthesizedType: typings.typescript.typescriptMod.SyntaxKind.ParenthesizedType with Double = js.native
  /* 316 */ val PartiallyEmittedExpression: typings.typescript.typescriptMod.SyntaxKind.PartiallyEmittedExpression with Double = js.native
  /* 66 */ val PercentEqualsToken: typings.typescript.typescriptMod.SyntaxKind.PercentEqualsToken with Double = js.native
  /* 43 */ val PercentToken: typings.typescript.typescriptMod.SyntaxKind.PercentToken with Double = js.native
  /* 61 */ val PlusEqualsToken: typings.typescript.typescriptMod.SyntaxKind.PlusEqualsToken with Double = js.native
  /* 44 */ val PlusPlusToken: typings.typescript.typescriptMod.SyntaxKind.PlusPlusToken with Double = js.native
  /* 38 */ val PlusToken: typings.typescript.typescriptMod.SyntaxKind.PlusToken with Double = js.native
  /* 204 */ val PostfixUnaryExpression: typings.typescript.typescriptMod.SyntaxKind.PostfixUnaryExpression with Double = js.native
  /* 203 */ val PrefixUnaryExpression: typings.typescript.typescriptMod.SyntaxKind.PrefixUnaryExpression with Double = js.native
  /* 114 */ val PrivateKeyword: typings.typescript.typescriptMod.SyntaxKind.PrivateKeyword with Double = js.native
  /* 190 */ val PropertyAccessExpression: typings.typescript.typescriptMod.SyntaxKind.PropertyAccessExpression with Double = js.native
  /* 276 */ val PropertyAssignment: typings.typescript.typescriptMod.SyntaxKind.PropertyAssignment with Double = js.native
  /* 155 */ val PropertyDeclaration: typings.typescript.typescriptMod.SyntaxKind.PropertyDeclaration with Double = js.native
  /* 154 */ val PropertySignature: typings.typescript.typescriptMod.SyntaxKind.PropertySignature with Double = js.native
  /* 115 */ val ProtectedKeyword: typings.typescript.typescriptMod.SyntaxKind.ProtectedKeyword with Double = js.native
  /* 116 */ val PublicKeyword: typings.typescript.typescriptMod.SyntaxKind.PublicKeyword with Double = js.native
  /* 149 */ val QualifiedName: typings.typescript.typescriptMod.SyntaxKind.QualifiedName with Double = js.native
  /* 56 */ val QuestionToken: typings.typescript.typescriptMod.SyntaxKind.QuestionToken with Double = js.native
  /* 134 */ val ReadonlyKeyword: typings.typescript.typescriptMod.SyntaxKind.ReadonlyKeyword with Double = js.native
  /* 13 */ val RegularExpressionLiteral: typings.typescript.typescriptMod.SyntaxKind.RegularExpressionLiteral with Double = js.native
  /* 135 */ val RequireKeyword: typings.typescript.typescriptMod.SyntaxKind.RequireKeyword with Double = js.native
  /* 173 */ val RestType: typings.typescript.typescriptMod.SyntaxKind.RestType with Double = js.native
  /* 98 */ val ReturnKeyword: typings.typescript.typescriptMod.SyntaxKind.ReturnKeyword with Double = js.native
  /* 231 */ val ReturnStatement: typings.typescript.typescriptMod.SyntaxKind.ReturnStatement with Double = js.native
  /* 218 */ val SemicolonClassElement: typings.typescript.typescriptMod.SyntaxKind.SemicolonClassElement with Double = js.native
  /* 26 */ val SemicolonToken: typings.typescript.typescriptMod.SyntaxKind.SemicolonToken with Double = js.native
  /* 160 */ val SetAccessor: typings.typescript.typescriptMod.SyntaxKind.SetAccessor with Double = js.native
  /* 138 */ val SetKeyword: typings.typescript.typescriptMod.SyntaxKind.SetKeyword with Double = js.native
  /* 6 */ val ShebangTrivia: typings.typescript.typescriptMod.SyntaxKind.ShebangTrivia with Double = js.native
  /* 277 */ val ShorthandPropertyAssignment: typings.typescript.typescriptMod.SyntaxKind.ShorthandPropertyAssignment with Double = js.native
  /* 2 */ val SingleLineCommentTrivia: typings.typescript.typescriptMod.SyntaxKind.SingleLineCommentTrivia with Double = js.native
  /* 65 */ val SlashEqualsToken: typings.typescript.typescriptMod.SyntaxKind.SlashEqualsToken with Double = js.native
  /* 42 */ val SlashToken: typings.typescript.typescriptMod.SyntaxKind.SlashToken with Double = js.native
  /* 285 */ val SourceFile: typings.typescript.typescriptMod.SyntaxKind.SourceFile with Double = js.native
  /* 278 */ val SpreadAssignment: typings.typescript.typescriptMod.SyntaxKind.SpreadAssignment with Double = js.native
  /* 209 */ val SpreadElement: typings.typescript.typescriptMod.SyntaxKind.SpreadElement with Double = js.native
  /* 117 */ val StaticKeyword: typings.typescript.typescriptMod.SyntaxKind.StaticKeyword with Double = js.native
  /* 139 */ val StringKeyword: typings.typescript.typescriptMod.SyntaxKind.StringKeyword with Double = js.native
  /* 10 */ val StringLiteral: typings.typescript.typescriptMod.SyntaxKind.StringLiteral with Double = js.native
  /* 99 */ val SuperKeyword: typings.typescript.typescriptMod.SyntaxKind.SuperKeyword with Double = js.native
  /* 100 */ val SwitchKeyword: typings.typescript.typescriptMod.SyntaxKind.SwitchKeyword with Double = js.native
  /* 233 */ val SwitchStatement: typings.typescript.typescriptMod.SyntaxKind.SwitchStatement with Double = js.native
  /* 140 */ val SymbolKeyword: typings.typescript.typescriptMod.SyntaxKind.SymbolKeyword with Double = js.native
  /* 314 */ val SyntaxList: typings.typescript.typescriptMod.SyntaxKind.SyntaxList with Double = js.native
  /* 216 */ val SyntheticExpression: typings.typescript.typescriptMod.SyntaxKind.SyntheticExpression with Double = js.native
  /* 194 */ val TaggedTemplateExpression: typings.typescript.typescriptMod.SyntaxKind.TaggedTemplateExpression with Double = js.native
  /* 207 */ val TemplateExpression: typings.typescript.typescriptMod.SyntaxKind.TemplateExpression with Double = js.native
  /* 15 */ val TemplateHead: typings.typescript.typescriptMod.SyntaxKind.TemplateHead with Double = js.native
  /* 16 */ val TemplateMiddle: typings.typescript.typescriptMod.SyntaxKind.TemplateMiddle with Double = js.native
  /* 217 */ val TemplateSpan: typings.typescript.typescriptMod.SyntaxKind.TemplateSpan with Double = js.native
  /* 17 */ val TemplateTail: typings.typescript.typescriptMod.SyntaxKind.TemplateTail with Double = js.native
  /* 101 */ val ThisKeyword: typings.typescript.typescriptMod.SyntaxKind.ThisKeyword with Double = js.native
  /* 179 */ val ThisType: typings.typescript.typescriptMod.SyntaxKind.ThisType with Double = js.native
  /* 102 */ val ThrowKeyword: typings.typescript.typescriptMod.SyntaxKind.ThrowKeyword with Double = js.native
  /* 235 */ val ThrowStatement: typings.typescript.typescriptMod.SyntaxKind.ThrowStatement with Double = js.native
  /* 53 */ val TildeToken: typings.typescript.typescriptMod.SyntaxKind.TildeToken with Double = js.native
  /* 103 */ val TrueKeyword: typings.typescript.typescriptMod.SyntaxKind.TrueKeyword with Double = js.native
  /* 104 */ val TryKeyword: typings.typescript.typescriptMod.SyntaxKind.TryKeyword with Double = js.native
  /* 236 */ val TryStatement: typings.typescript.typescriptMod.SyntaxKind.TryStatement with Double = js.native
  /* 171 */ val TupleType: typings.typescript.typescriptMod.SyntaxKind.TupleType with Double = js.native
  /* 243 */ val TypeAliasDeclaration: typings.typescript.typescriptMod.SyntaxKind.TypeAliasDeclaration with Double = js.native
  /* 195 */ val TypeAssertionExpression: typings.typescript.typescriptMod.SyntaxKind.TypeAssertionExpression with Double = js.native
  /* 141 */ val TypeKeyword: typings.typescript.typescriptMod.SyntaxKind.TypeKeyword with Double = js.native
  /* 169 */ val TypeLiteral: typings.typescript.typescriptMod.SyntaxKind.TypeLiteral with Double = js.native
  /* 200 */ val TypeOfExpression: typings.typescript.typescriptMod.SyntaxKind.TypeOfExpression with Double = js.native
  /* 105 */ val TypeOfKeyword: typings.typescript.typescriptMod.SyntaxKind.TypeOfKeyword with Double = js.native
  /* 180 */ val TypeOperator: typings.typescript.typescriptMod.SyntaxKind.TypeOperator with Double = js.native
  /* 151 */ val TypeParameter: typings.typescript.typescriptMod.SyntaxKind.TypeParameter with Double = js.native
  /* 164 */ val TypePredicate: typings.typescript.typescriptMod.SyntaxKind.TypePredicate with Double = js.native
  /* 168 */ val TypeQuery: typings.typescript.typescriptMod.SyntaxKind.TypeQuery with Double = js.native
  /* 165 */ val TypeReference: typings.typescript.typescriptMod.SyntaxKind.TypeReference with Double = js.native
  /* 142 */ val UndefinedKeyword: typings.typescript.typescriptMod.SyntaxKind.UndefinedKeyword with Double = js.native
  /* 174 */ val UnionType: typings.typescript.typescriptMod.SyntaxKind.UnionType with Double = js.native
  /* 143 */ val UniqueKeyword: typings.typescript.typescriptMod.SyntaxKind.UniqueKeyword with Double = js.native
  /* 0 */ val Unknown: typings.typescript.typescriptMod.SyntaxKind.Unknown with Double = js.native
  /* 144 */ val UnknownKeyword: typings.typescript.typescriptMod.SyntaxKind.UnknownKeyword with Double = js.native
  /* 283 */ val UnparsedInternalText: typings.typescript.typescriptMod.SyntaxKind.UnparsedInternalText with Double = js.native
  /* 281 */ val UnparsedPrepend: typings.typescript.typescriptMod.SyntaxKind.UnparsedPrepend with Double = js.native
  /* 280 */ val UnparsedPrologue: typings.typescript.typescriptMod.SyntaxKind.UnparsedPrologue with Double = js.native
  /* 287 */ val UnparsedSource: typings.typescript.typescriptMod.SyntaxKind.UnparsedSource with Double = js.native
  /* 284 */ val UnparsedSyntheticReference: typings.typescript.typescriptMod.SyntaxKind.UnparsedSyntheticReference with Double = js.native
  /* 282 */ val UnparsedText: typings.typescript.typescriptMod.SyntaxKind.UnparsedText with Double = js.native
  /* 106 */ val VarKeyword: typings.typescript.typescriptMod.SyntaxKind.VarKeyword with Double = js.native
  /* 238 */ val VariableDeclaration: typings.typescript.typescriptMod.SyntaxKind.VariableDeclaration with Double = js.native
  /* 239 */ val VariableDeclarationList: typings.typescript.typescriptMod.SyntaxKind.VariableDeclarationList with Double = js.native
  /* 220 */ val VariableStatement: typings.typescript.typescriptMod.SyntaxKind.VariableStatement with Double = js.native
  /* 201 */ val VoidExpression: typings.typescript.typescriptMod.SyntaxKind.VoidExpression with Double = js.native
  /* 107 */ val VoidKeyword: typings.typescript.typescriptMod.SyntaxKind.VoidKeyword with Double = js.native
  /* 108 */ val WhileKeyword: typings.typescript.typescriptMod.SyntaxKind.WhileKeyword with Double = js.native
  /* 225 */ val WhileStatement: typings.typescript.typescriptMod.SyntaxKind.WhileStatement with Double = js.native
  /* 5 */ val WhitespaceTrivia: typings.typescript.typescriptMod.SyntaxKind.WhitespaceTrivia with Double = js.native
  /* 109 */ val WithKeyword: typings.typescript.typescriptMod.SyntaxKind.WithKeyword with Double = js.native
  /* 232 */ val WithStatement: typings.typescript.typescriptMod.SyntaxKind.WithStatement with Double = js.native
  /* 208 */ val YieldExpression: typings.typescript.typescriptMod.SyntaxKind.YieldExpression with Double = js.native
  /* 118 */ val YieldKeyword: typings.typescript.typescriptMod.SyntaxKind.YieldKeyword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyntaxKind with Double] = js.native
}

