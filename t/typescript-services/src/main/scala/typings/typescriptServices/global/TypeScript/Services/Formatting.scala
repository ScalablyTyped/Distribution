package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ArgumentListSyntax
import typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax
import typings.typescriptServices.TypeScript.ArrayTypeSyntax
import typings.typescriptServices.TypeScript.BinaryExpressionSyntax
import typings.typescriptServices.TypeScript.BlockSyntax
import typings.typescriptServices.TypeScript.BreakStatementSyntax
import typings.typescriptServices.TypeScript.CallSignatureSyntax
import typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax
import typings.typescriptServices.TypeScript.CastExpressionSyntax
import typings.typescriptServices.TypeScript.CatchClauseSyntax
import typings.typescriptServices.TypeScript.ClassDeclarationSyntax
import typings.typescriptServices.TypeScript.ConditionalExpressionSyntax
import typings.typescriptServices.TypeScript.ConstraintSyntax
import typings.typescriptServices.TypeScript.ConstructSignatureSyntax
import typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax
import typings.typescriptServices.TypeScript.ConstructorTypeSyntax
import typings.typescriptServices.TypeScript.ContinueStatementSyntax
import typings.typescriptServices.TypeScript.DebuggerStatementSyntax
import typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax
import typings.typescriptServices.TypeScript.DeleteExpressionSyntax
import typings.typescriptServices.TypeScript.DoStatementSyntax
import typings.typescriptServices.TypeScript.ElementAccessExpressionSyntax
import typings.typescriptServices.TypeScript.ElseClauseSyntax
import typings.typescriptServices.TypeScript.EmptyStatementSyntax
import typings.typescriptServices.TypeScript.EnumDeclarationSyntax
import typings.typescriptServices.TypeScript.EnumElementSyntax
import typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
import typings.typescriptServices.TypeScript.ExportAssignmentSyntax
import typings.typescriptServices.TypeScript.ExpressionStatementSyntax
import typings.typescriptServices.TypeScript.ExternalModuleReferenceSyntax
import typings.typescriptServices.TypeScript.FinallyClauseSyntax
import typings.typescriptServices.TypeScript.ForInStatementSyntax
import typings.typescriptServices.TypeScript.ForStatementSyntax
import typings.typescriptServices.TypeScript.FunctionDeclarationSyntax
import typings.typescriptServices.TypeScript.FunctionExpressionSyntax
import typings.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax
import typings.typescriptServices.TypeScript.FunctionTypeSyntax
import typings.typescriptServices.TypeScript.GenericTypeSyntax
import typings.typescriptServices.TypeScript.GetAccessorSyntax
import typings.typescriptServices.TypeScript.HeritageClauseSyntax
import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.IfStatementSyntax
import typings.typescriptServices.TypeScript.ImportDeclarationSyntax
import typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax
import typings.typescriptServices.TypeScript.IndexSignatureSyntax
import typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax
import typings.typescriptServices.TypeScript.InvocationExpressionSyntax
import typings.typescriptServices.TypeScript.LabeledStatementSyntax
import typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax
import typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax
import typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax
import typings.typescriptServices.TypeScript.MethodSignatureSyntax
import typings.typescriptServices.TypeScript.ModuleDeclarationSyntax
import typings.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax
import typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax
import typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax
import typings.typescriptServices.TypeScript.ObjectTypeSyntax
import typings.typescriptServices.TypeScript.OmittedExpressionSyntax
import typings.typescriptServices.TypeScript.ParameterListSyntax
import typings.typescriptServices.TypeScript.ParameterSyntax
import typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax
import typings.typescriptServices.TypeScript.ParenthesizedExpressionSyntax
import typings.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax
import typings.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax
import typings.typescriptServices.TypeScript.PropertySignatureSyntax
import typings.typescriptServices.TypeScript.QualifiedNameSyntax
import typings.typescriptServices.TypeScript.ReturnStatementSyntax
import typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshotLine
import typings.typescriptServices.TypeScript.Services.Formatting.RuleAction
import typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags
import typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition
import typings.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typings.typescriptServices.TypeScript.SetAccessorSyntax
import typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.SwitchStatementSyntax
import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import typings.typescriptServices.TypeScript.ThrowStatementSyntax
import typings.typescriptServices.TypeScript.TryStatementSyntax
import typings.typescriptServices.TypeScript.TypeAnnotationSyntax
import typings.typescriptServices.TypeScript.TypeArgumentListSyntax
import typings.typescriptServices.TypeScript.TypeOfExpressionSyntax
import typings.typescriptServices.TypeScript.TypeParameterListSyntax
import typings.typescriptServices.TypeScript.TypeParameterSyntax
import typings.typescriptServices.TypeScript.TypeQuerySyntax
import typings.typescriptServices.TypeScript.VariableDeclarationSyntax
import typings.typescriptServices.TypeScript.VariableDeclaratorSyntax
import typings.typescriptServices.TypeScript.VariableStatementSyntax
import typings.typescriptServices.TypeScript.VoidExpressionSyntax
import typings.typescriptServices.TypeScript.WhileStatementSyntax
import typings.typescriptServices.TypeScript.WithStatementSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Formatting {
  
  @JSGlobal("TypeScript.Services.Formatting.Formatter")
  @js.native
  class Formatter protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.Formatter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      indentFirstToken: Boolean,
      options: FormattingOptions,
      snapshot: ITextSnapshot,
      rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ) = this()
    
    /* private */ /* CompleteClass */
    override def RecordRuleEdits(rule: js.Any, t1: js.Any, t2: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _edits: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: js.Any = js.native
    
    /* CompleteClass */
    override def edits(): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
    
    /* private */ /* CompleteClass */
    override def findCommonParents(parent1: js.Any, parent2: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def formatPair(t1: js.Any, t1Parent: js.Any, t2: js.Any, t2Parent: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var formattingContext: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var formattingRequestKind: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getLineNumber(span: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* private */ /* CompleteClass */
    var previousTokenParent: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var previousTokenSpan: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def processToken(token: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def processTrivia(triviaList: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def recordEdit(position: Double, length: Double, replaceWith: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForMultiLineComment(
      trivia: js.Any,
      fullStart: js.Any,
      indentationString: js.Any,
      leadingWhiteSpace: js.Any,
      firstLineAlreadyIndented: js.Any
    ): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSegment(
      segment: js.Any,
      fullStart: js.Any,
      indentationColumns: js.Any,
      whiteSpaceColumnsInFirstSegment: js.Any
    ): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSingleLineOrSkippedText(trivia: js.Any, fullStart: js.Any, indentationString: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForToken(token: js.Any, indentationString: js.Any, commentIndentationString: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForWhitespace(trivia: js.Any, fullStart: js.Any, indentationString: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesProvider: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var scriptHasErrors: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* private */ /* CompleteClass */
    override def trimWhitespace(line: js.Any, token: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def trimWhitespaceInLineRange(startLine: js.Any, endLine: js.Any, token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): js.Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): js.Any = js.native
  }
  object Formatter {
    
    @JSGlobal("TypeScript.Services.Formatting.Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getEdits(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      options: FormattingOptions,
      indentFirstToken: Boolean,
      snapshot: ITextSnapshot,
      rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdits")(textSpan.asInstanceOf[js.Any], sourceUnit.asInstanceOf[js.Any], options.asInstanceOf[js.Any], indentFirstToken.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], rulesProvider.asInstanceOf[js.Any], formattingRequestKind.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo]]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingContext")
  @js.native
  class FormattingContext protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext {
    def this(snapshot: ITextSnapshot, formattingRequestKind: FormattingRequestKind) = this()
    
    /* CompleteClass */
    override def BlockIsOnOneLine(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
    
    /* CompleteClass */
    override def ContextNodeAllOnSameLine(): Boolean = js.native
    
    /* CompleteClass */
    override def ContextNodeBlockIsOnOneLine(): Boolean = js.native
    
    /* CompleteClass */
    override def NextNodeAllOnSameLine(): Boolean = js.native
    
    /* CompleteClass */
    override def NextNodeBlockIsOnOneLine(): Boolean = js.native
    
    /* CompleteClass */
    override def NodeIsOnOneLine(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
    
    /* CompleteClass */
    override def TokensAreOnSameLine(): Boolean = js.native
    
    /* CompleteClass */
    var contextNode: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* private */ /* CompleteClass */
    var contextNodeAllOnSameLine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var contextNodeBlockIsOnOneLine: js.Any = js.native
    
    /* CompleteClass */
    var currentTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    var currentTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
    
    /* CompleteClass */
    var formattingRequestKind: FormattingRequestKind = js.native
    
    /* private */ /* CompleteClass */
    var nextNodeAllOnSameLine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var nextNodeBlockIsOnOneLine: js.Any = js.native
    
    /* CompleteClass */
    var nextTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    var nextTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan = js.native
    
    /* private */ /* CompleteClass */
    var snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var tokensAreOnSameLine: js.Any = js.native
    
    /* CompleteClass */
    override def updateContext(
      currentTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
      currentTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      nextTokenSpan: typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan,
      nextTokenParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      commonParent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext
    ): Unit = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingManager")
  @js.native
  class FormattingManager protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
    def this(
      syntaxTree: SyntaxTree,
      snapshot: ITextSnapshot,
      rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      editorOptions: typings.typescriptServices.TypeScript.Services.EditorOptions
    ) = this()
    
    /* CompleteClass */
    override def formatDocument(minChar: Double, limChar: Double): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnClosingCurlyBrace(caretPosition: Double): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnEnter(caretPosition: Double): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnPaste(minChar: Double, limChar: Double): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatOnSemicolon(caretPosition: Double): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* CompleteClass */
    override def formatSelection(minChar: Double, limChar: Double): js.Array[typings.typescriptServices.TypeScript.Services.TextEdit] = js.native
    
    /* private */ /* CompleteClass */
    override def formatSpan(span: js.Any, formattingRequestKind: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var options: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesProvider: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var syntaxTree: js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
  @js.native
  object FormattingRequestKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind & Double
      ] = js.native
    
    /* 0 */ val FormatDocument: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatDocument & Double = js.native
    
    /* 4 */ val FormatOnClosingCurlyBrace: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnClosingCurlyBrace & Double = js.native
    
    /* 2 */ val FormatOnEnter: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnEnter & Double = js.native
    
    /* 5 */ val FormatOnPaste: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnPaste & Double = js.native
    
    /* 3 */ val FormatOnSemicolon: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnSemicolon & Double = js.native
    
    /* 1 */ val FormatSelection: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatSelection & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationNodeContext")
  @js.native
  class IndentationNodeContext protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext {
    def this(
      parent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      node: SyntaxNode,
      fullStart: Double,
      indentationAmount: Double,
      childIndentationAmountDelta: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _childIndentationAmountDelta: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _depth: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _fullStart: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _hasSkippedOrMissingTokenChild: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _indentationAmount: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _node: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: js.Any = js.native
    
    /* CompleteClass */
    override def childIndentationAmountDelta(): Double = js.native
    
    /* CompleteClass */
    override def clone(pool: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def depth(): Double = js.native
    
    /* CompleteClass */
    override def end(): Double = js.native
    
    /* CompleteClass */
    override def fullStart(): Double = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasSkippedOrMissingTokenChild(): Boolean = js.native
    
    /* CompleteClass */
    override def indentationAmount(): Double = js.native
    
    /* CompleteClass */
    override def kind(): SyntaxKind = js.native
    
    /* CompleteClass */
    override def node(): SyntaxNode = js.native
    
    /* CompleteClass */
    override def parent(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def start(): Double = js.native
    
    /* CompleteClass */
    override def update(
      parent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      node: SyntaxNode,
      fullStart: Double,
      indentationAmount: Double,
      childIndentationAmountDelta: Double
    ): Unit = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationNodeContextPool")
  @js.native
  class IndentationNodeContextPool ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationTrackingWalker")
  @js.native
  class IndentationTrackingWalker protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: js.Any = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): js.Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.MultipleTokenIndenter")
  @js.native
  class MultipleTokenIndenter protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _edits: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: js.Any = js.native
    
    /* CompleteClass */
    override def edits(): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* CompleteClass */
    override def recordEdit(position: Double, length: Double, replaceWith: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForMultiLineComment(
      trivia: js.Any,
      fullStart: js.Any,
      indentationString: js.Any,
      leadingWhiteSpace: js.Any,
      firstLineAlreadyIndented: js.Any
    ): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSegment(
      segment: js.Any,
      fullStart: js.Any,
      indentationColumns: js.Any,
      whiteSpaceColumnsInFirstSegment: js.Any
    ): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForSingleLineOrSkippedText(trivia: js.Any, fullStart: js.Any, indentationString: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForToken(token: js.Any, indentationString: js.Any, commentIndentationString: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def recordIndentationEditsForWhitespace(trivia: js.Any, fullStart: js.Any, indentationString: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): js.Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.Rule")
  @js.native
  class Rule protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.Rule {
    def this(
      Descriptor: typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation
    ) = this()
    def this(
      Descriptor: typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation,
      Flag: RuleFlags
    ) = this()
    
    /* CompleteClass */
    var Descriptor: typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* CompleteClass */
    var Flag: RuleFlags = js.native
    
    /* CompleteClass */
    var Operation: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleAction")
  @js.native
  object RuleAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typescriptServices.TypeScript.Services.Formatting.RuleAction & Double] = js.native
    
    /* 3 */ val Delete: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.Delete & Double = js.native
    
    /* 0 */ val Ignore: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.Ignore & Double = js.native
    
    /* 2 */ val NewLine: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.NewLine & Double = js.native
    
    /* 1 */ val Space: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.Space & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
  @js.native
  class RuleDescriptor protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
    def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
    
    /* CompleteClass */
    var LeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    var RightTokenRange: TokenRange = js.native
  }
  object RuleDescriptor {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create1(left: SyntaxKind, right: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create1")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
    
    /* static member */
    inline def create2(left: TokenRange, right: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create2")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
    
    /* static member */
    inline def create3(left: SyntaxKind, right: TokenRange): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create3")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
    
    /* static member */
    inline def create4(left: TokenRange, right: TokenRange): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("create4")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleFlags")
  @js.native
  object RuleFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags & Double] = js.native
    
    /* 1 */ val CanDeleteNewLines: typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags.CanDeleteNewLines & Double = js.native
    
    /* 0 */ val None: typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags.None & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleOperation")
  @js.native
  class RuleOperation ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation {
    
    /* CompleteClass */
    var Action: RuleAction = js.native
    
    /* CompleteClass */
    var Context: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
  }
  object RuleOperation {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create1(action: RuleAction): typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create1")(action.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation]
    
    /* static member */
    inline def create2(
      context: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext,
      action: RuleAction
    ): typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("create2")(context.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
  @js.native
  class RuleOperationContext protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext {
    def this(funcs: (js.Function1[
            /* context */ typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext, 
            Boolean
          ])*) = this()
    
    /* CompleteClass */
    override def InContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* CompleteClass */
    override def IsAny(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var customContextChecks: js.Any = js.native
  }
  object RuleOperationContext {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext.Any")
    @js.native
    def Any: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
    inline def Any_=(x: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("TypeScript.Services.Formatting.Rules")
  @js.native
  class Rules ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.Rules {
    
    /* CompleteClass */
    var ControlOpenBraceLeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    var FunctionOpenBraceLeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    var HighPriorityCommonRules: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
    
    /* CompleteClass */
    var IgnoreAfterLineComment: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var IgnoreBeforeComment: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var LowPriorityCommonRules: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
    
    /* CompleteClass */
    var NewLineAfterOpenBraceInBlockContext: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeCloseBraceInBlockContext: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeOpenBraceInControl: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeOpenBraceInFunction: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterAnonymousFunctionKeyword: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterBinaryOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterCloseAngularBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterCloseBrace: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterCloseBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterComma: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterConstructor: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterDot: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterEllipsis: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterKeywordInControl: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterModuleImport: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOpenAngularBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOpenBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOpenParen: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterOptionalParameters: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterSemicolonInFor: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterUnaryPredecrementOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterUnaryPrefixOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceAfterUnaryPreincrementOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeBinaryOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeCloseAngularBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeCloseBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeCloseParen: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeColon: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeComma: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeDot: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenAngularBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenParenInFuncCall: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeOpenParenInFuncDecl: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeQMark: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeSemicolon: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeUnaryPostdecrementOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBeforeUnaryPostincrementOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenCloseParenAndAngularBracket: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenEmptyBraceBrackets: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenEmptyInterfaceBraceBrackets: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenParens: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var NoSpaceBetweenReturnAndSemicolon: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterAddWhenFollowedByPreincrement: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterAddWhenFollowedByUnaryPlus: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterAnonymousFunctionKeyword: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterArrow: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterBinaryKeywordOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterBinaryOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterCertainKeywords: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterCertainTypeScriptKeywords: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterCloseBrace: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterColon: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterComma: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterFunctionInFuncDecl: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterGetSetInMember: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterKeywordInControl: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterModuleName: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterOpenBrace: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterOpenParen: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterPostdecrementWhenFollowedBySubtract: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterPostincrementWhenFollowedByAdd: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterQMark: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSemicolon: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSemicolonInFor: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSubtractWhenFollowedByPredecrement: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterSubtractWhenFollowedByUnaryMinus: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterTryFinally: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceAfterVoidOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeBinaryKeywordOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeBinaryOperator: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeCertainTypeScriptKeywords: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeCloseBrace: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeCloseParen: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeOpenBraceInControl: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeOpenBraceInFunction: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBetweenCloseBraceAndElse: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBetweenCloseBraceAndWhile: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var SpaceBetweenStatements: typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    var TypeScriptOpenBraceLeftTokenRange: TokenRange = js.native
    
    /* CompleteClass */
    override def getRuleName(rule: typings.typescriptServices.TypeScript.Services.Formatting.Rule): js.Any = js.native
  }
  object Rules {
    
    @JSGlobal("TypeScript.Services.Formatting.Rules")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def IsAfterCodeBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAfterCodeBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBeforeBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBeforeBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBeforeMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBeforeMultilineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBinaryOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBinaryOpContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsControlDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsControlDeclContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsForContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsForContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsFunctionCallContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunctionCallContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsFunctionCallOrNewContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunctionCallOrNewContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsFunctionDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFunctionDeclContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsModuleDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsModuleDeclContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMultilineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNewContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNewContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNotBinaryOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotBinaryOpContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNotForContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotForContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsNotFormatOnEnter(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotFormatOnEnter")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsObjectContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObjectContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsObjectTypeContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObjectTypeContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsSameLineTokenContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSameLineTokenContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsSameLineTokenOrBeforeMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSameLineTokenOrBeforeMultilineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsSingleLineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSingleLineBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsTypeArgumentOrParameter")(tokenKind.asInstanceOf[js.Any], parentKind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsTypeArgumentOrParameterContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTypeArgumentOrParameterContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsTypeScriptDeclWithBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTypeScriptDeclWithBlockContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def IsVoidOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVoidOpContext")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def NodeIsBlockContext(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("NodeIsBlockContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def NodeIsTypeScriptDeclWithBlockContext(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("NodeIsTypeScriptDeclWithBlockContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesBucket")
  @js.native
  class RulesBucket ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RulesBucket {
    
    /* CompleteClass */
    override def AddRule(
      rule: typings.typescriptServices.TypeScript.Services.Formatting.Rule,
      specificTokens: Boolean,
      constructionState: js.Array[
          typings.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
        ],
      rulesBucketIndex: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override def Rules(): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
    
    /* private */ /* CompleteClass */
    var rules: js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesBucketConstructionState")
  @js.native
  class RulesBucketConstructionState ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState {
    
    /* CompleteClass */
    override def GetInsertionIndex(maskPosition: RulesPosition): Double = js.native
    
    /* CompleteClass */
    override def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit = js.native
    
    /* private */ /* CompleteClass */
    var rulesInsertionIndexBitmap: js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesMap")
  @js.native
  class RulesMap ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RulesMap {
    
    /* private */ /* CompleteClass */
    override def FillRule(rule: js.Any, rulesBucketConstructionStateList: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def FillRules(
      rules: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule],
      rulesBucketConstructionStateList: js.Array[
          typings.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
        ]
    ): Unit = js.native
    
    /* CompleteClass */
    override def GetRule(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* private */ /* CompleteClass */
    override def GetRuleBucketIndex(row: js.Any, column: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def Initialize(rules: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule]): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.RulesBucket] = js.native
    
    /* CompleteClass */
    var map: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.RulesBucket] = js.native
    
    /* CompleteClass */
    var mapRowLength: Double = js.native
  }
  object RulesMap {
    
    @JSGlobal("TypeScript.Services.Formatting.RulesMap")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(rules: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule]): typings.typescriptServices.TypeScript.Services.Formatting.RulesMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rules.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.RulesMap]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesPosition")
  @js.native
  object RulesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition & Double] = js.native
    
    /* 2 */ val ContextRulesAny: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesAny & Double = js.native
    
    /* 1 */ val ContextRulesSpecific: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesSpecific & Double = js.native
    
    /* 0 */ val IgnoreRulesAny: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesAny & Double = js.native
    
    /* 0 */ val IgnoreRulesSpecific: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesSpecific & Double = js.native
    
    /* 4 */ val NoContextRulesAny: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesAny & Double = js.native
    
    /* 3 */ val NoContextRulesSpecific: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesSpecific & Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesProvider")
  @js.native
  class RulesProvider protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider {
    def this(logger: ILogger) = this()
    
    /* private */ /* CompleteClass */
    var activeRules: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def createActiveRules(options: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def ensureUpToDate(options: typings.typescriptServices.TypeScript.Services.FormatCodeOptions): Unit = js.native
    
    /* CompleteClass */
    override def getRuleByName(name: String): typings.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
    
    /* CompleteClass */
    override def getRuleName(rule: typings.typescriptServices.TypeScript.Services.Formatting.Rule): String = js.native
    
    /* CompleteClass */
    override def getRulesMap(): typings.typescriptServices.TypeScript.Services.Formatting.RulesMap = js.native
    
    /* private */ /* CompleteClass */
    var globalRules: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var logger: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var options: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var rulesMap: js.Any = js.native
  }
  
  object Shared {
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenAllAccess")
    @js.native
    class TokenAllAccess ()
      extends StObject
         with typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess {
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
    @js.native
    class TokenRange protected ()
      extends StObject
         with typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
      def this(tokenAccess: ITokenAccess) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* CompleteClass */
      var tokenAccess: ITokenAccess = js.native
    }
    object TokenRange {
      
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def AllTokens(): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = ^.asInstanceOf[js.Dynamic].applyDynamic("AllTokens")().asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Any")
      @js.native
      def Any: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.AnyIncludingMultilineComments")
      @js.native
      def AnyIncludingMultilineComments: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def AnyIncludingMultilineComments_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyIncludingMultilineComments")(x.asInstanceOf[js.Any])
      
      inline def Any_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.BinaryKeywordOperators")
      @js.native
      def BinaryKeywordOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def BinaryKeywordOperators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryKeywordOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.BinaryOperators")
      @js.native
      def BinaryOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def BinaryOperators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Comments")
      @js.native
      def Comments: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def Comments_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Comments")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def FromRange(f: SyntaxKind, to: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRange")(f.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      inline def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = (^.asInstanceOf[js.Dynamic].applyDynamic("FromRange")(f.asInstanceOf[js.Any], to.asInstanceOf[js.Any], except.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      inline def FromToken(token: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = ^.asInstanceOf[js.Dynamic].applyDynamic("FromToken")(token.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      inline def FromTokens(tokens: js.Array[SyntaxKind]): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = ^.asInstanceOf[js.Dynamic].applyDynamic("FromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange]
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Keywords")
      @js.native
      def Keywords: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def Keywords_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Operators")
      @js.native
      def Operators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def Operators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.ReservedKeywords")
      @js.native
      def ReservedKeywords: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def ReservedKeywords_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReservedKeywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.TypeNames")
      @js.native
      def TypeNames: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def TypeNames_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeNames")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPostdecrementExpressions")
      @js.native
      def UnaryPostdecrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPostdecrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostdecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPostincrementExpressions")
      @js.native
      def UnaryPostincrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPostincrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostincrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPredecrementExpressions")
      @js.native
      def UnaryPredecrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPredecrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPredecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPrefixExpressions")
      @js.native
      def UnaryPrefixExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPrefixExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPrefixOperators")
      @js.native
      def UnaryPrefixOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPrefixOperators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPreincrementExpressions")
      @js.native
      def UnaryPreincrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      inline def UnaryPreincrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPreincrementExpressions")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRangeAccess")
    @js.native
    class TokenRangeAccess protected ()
      extends StObject
         with typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
      def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* private */ /* CompleteClass */
      var tokens: js.Any = js.native
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenSingleValueAccess")
    @js.native
    class TokenSingleValueAccess protected ()
      extends StObject
         with typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
      def this(token: SyntaxKind) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* CompleteClass */
      var token: SyntaxKind = js.native
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenValuesAccess")
    @js.native
    class TokenValuesAccess protected ()
      extends StObject
         with typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
      def this(tks: js.Array[SyntaxKind]) = this()
      
      /* CompleteClass */
      override def Contains(token: SyntaxKind): Boolean = js.native
      
      /* CompleteClass */
      override def GetTokens(): js.Array[SyntaxKind] = js.native
      
      /* private */ /* CompleteClass */
      var tokens: js.Any = js.native
    }
  }
  
  @JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
  @js.native
  class SingleTokenIndenter protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.SingleTokenIndenter {
    def this(
      indentationPosition: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
    
    /* private */ /* CompleteClass */
    var _indentationNodeContextPool: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _lastTriviaWasNewLine: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _parent: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _position: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _textSpan: js.Any = js.native
    
    /* CompleteClass */
    override def forceIndentNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def forceSkipIndentingNextToken(tokenStart: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def getCommentIndentationAmount(token: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def getTokenIndentationAmount(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var indentationAmount: js.Any = js.native
    
    /* CompleteClass */
    override def indentationNodeContextPool(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool = js.native
    
    /* private */ /* CompleteClass */
    var indentationPosition: js.Any = js.native
    
    /* CompleteClass */
    var options: FormattingOptions = js.native
    
    /* CompleteClass */
    override def parent(): typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext = js.native
    
    /* CompleteClass */
    override def position(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def shouldIndentBlockInParent(parent: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def textSpan(): TextSpan = js.native
    
    /* CompleteClass */
    override def visitArgumentList(node: ArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(node: ArrayTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBlock(node: BlockSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitBreakStatement(node: BreakStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCallSignature(node: CallSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCastExpression(node: CastExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitCatchClause(node: CatchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstraint(node: ConstraintSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructSignature(node: ConstructSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitConstructorType(node: ConstructorTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitContinueStatement(node: ContinueStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitDoStatement(node: DoStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitElseClause(node: ElseClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEmptyStatement(node: EmptyStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEnumElement(node: EnumElementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExportAssignment(node: ExportAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFinallyClause(node: FinallyClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForInStatement(node: ForInStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitForStatement(node: ForStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitFunctionType(node: FunctionTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGenericType(node: GenericTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitGetAccessor(node: GetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitHeritageClause(node: HeritageClauseSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIfStatement(node: IfStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitIndexSignature(node: IndexSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitLabeledStatement(node: LabeledStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitList(list: ISyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitMethodSignature(node: MethodSignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* CompleteClass */
    override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitObjectType(node: ObjectTypeSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitOptionalNode(node: SyntaxNode): Unit = js.native
    
    /* CompleteClass */
    override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def visitOptionalToken(token: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameter(node: ParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParameterList(node: ParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitPropertySignature(node: PropertySignatureSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitQualifiedName(node: QualifiedNameSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitReturnStatement(node: ReturnStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
    
    /* CompleteClass */
    override def visitSetAccessor(node: SetAccessorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSourceUnit(node: SourceUnitSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitSwitchStatement(node: SwitchStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitThrowStatement(node: ThrowStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitToken(token: ISyntaxToken): js.Any = js.native
    
    /* CompleteClass */
    override def visitTokenInSpan(token: ISyntaxToken): Unit = js.native
    
    /* CompleteClass */
    override def visitTryStatement(node: TryStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameter(node: TypeParameterSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeParameterList(node: TypeParameterListSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitTypeQuery(node: TypeQuerySyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVariableStatement(node: VariableStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitVoidExpression(node: VoidExpressionSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWhileStatement(node: WhileStatementSyntax): js.Any = js.native
    
    /* CompleteClass */
    override def visitWithStatement(node: WithStatementSyntax): js.Any = js.native
  }
  object SingleTokenIndenter {
    
    @JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getIndentationAmount(
      position: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      options: FormattingOptions
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentationAmount")(position.asInstanceOf[js.Any], sourceUnit.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("TypeScript.Services.Formatting.SnapshotPoint")
  @js.native
  class SnapshotPoint protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint {
    def this(snapshot: ITextSnapshot, position: Double) = this()
    
    /* CompleteClass */
    override def add(offset: Double): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def getContainingLine(): ITextSnapshotLine = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    var snapshot: ITextSnapshot = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextEditInfo")
  @js.native
  class TextEditInfo protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo {
    def this(position: Double, length: Double, replaceWith: String) = this()
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    var replaceWith: String = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextSnapshot")
  @js.native
  class TextSnapshot protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.TextSnapshot {
    def this(snapshot: ISimpleText) = this()
    
    /* CompleteClass */
    override def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine = js.native
    
    /* private */ /* CompleteClass */
    override def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def getLineFromPosition(position: Double): ITextSnapshotLine = js.native
    
    /* CompleteClass */
    override def getLineNumberFromPosition(position: Double): Double = js.native
    
    /* CompleteClass */
    override def getText(span: TextSpan): String = js.native
    
    /* private */ /* CompleteClass */
    var lines: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var snapshot: js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextSnapshotLine")
  @js.native
  class TextSnapshotLine protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.TextSnapshotLine {
    def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
    
    /* private */ /* CompleteClass */
    var _end: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _lineBreak: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _lineNumber: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _snapshot: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _start: js.Any = js.native
    
    /* CompleteClass */
    override def end(): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def endIncludingLineBreak(): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def endIncludingLineBreakPosition(): Double = js.native
    
    /* CompleteClass */
    override def endPosition(): Double = js.native
    
    /* CompleteClass */
    override def getText(): String = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def lineNumber(): Double = js.native
    
    /* CompleteClass */
    override def snapshot(): ITextSnapshot = js.native
    
    /* CompleteClass */
    override def start(): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
    
    /* CompleteClass */
    override def startPosition(): Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TokenSpan")
  @js.native
  class TokenSpan protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan {
    def this(kind: SyntaxKind, start: Double, length: Double) = this()
    
    /* private */ /* CompleteClass */
    var _kind: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _length: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _start: js.Any = js.native
    
    /* CompleteClass */
    override def containsPosition(position: Double): Boolean = js.native
    
    /* CompleteClass */
    override def containsTextSpan(span: TextSpan): Boolean = js.native
    
    /* CompleteClass */
    override def end(): Double = js.native
    
    /* CompleteClass */
    override def intersection(span: TextSpan): TextSpan = js.native
    
    /* CompleteClass */
    override def intersectsWith(start: Double, length: Double): Boolean = js.native
    
    /* CompleteClass */
    override def intersectsWithPosition(position: Double): Boolean = js.native
    
    /* CompleteClass */
    override def intersectsWithTextSpan(span: TextSpan): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): SyntaxKind = js.native
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    override def overlap(span: TextSpan): TextSpan = js.native
    
    /* CompleteClass */
    override def overlapsWith(span: TextSpan): Boolean = js.native
    
    /* CompleteClass */
    override def start(): Double = js.native
  }
}
