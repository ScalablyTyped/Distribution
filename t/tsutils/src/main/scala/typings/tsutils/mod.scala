package typings.tsutils

import typings.std.Map
import typings.tsutils.anon.BindingElementnameIdentif
import typings.tsutils.anon.VariableDeclarationnameId
import typings.tsutils.controlFlowMod.ControlFlowEnd
import typings.tsutils.controlFlowMod.SignatureEffect
import typings.tsutils.convertAstMod.ConvertedAst
import typings.tsutils.convertAstMod.NodeWrap
import typings.tsutils.tsutilsStrings.$LeftcurlybracketstringRightcurlybracketn
import typings.tsutils.tsutilsStrings.CarriagereturnLinefeed
import typings.tsutils.tsutilsStrings.Linefeed
import typings.tsutils.tsutilsStrings.`-$LeftcurlybracketstringRightcurlybracketn`
import typings.tsutils.tsutilsStrings.stripInternal
import typings.tsutils.usageMod.DeclarationDomain
import typings.tsutils.usageMod.UsageDomain
import typings.tsutils.usageMod.VariableInfo
import typings.tsutils.utilUtilMod.AccessKind
import typings.tsutils.utilUtilMod.BooleanCompilerOptions
import typings.tsutils.utilUtilMod.ForEachCommentCallback
import typings.tsutils.utilUtilMod.ForEachTokenCallback
import typings.tsutils.utilUtilMod.ImportKind
import typings.tsutils.utilUtilMod.ImportLike
import typings.tsutils.utilUtilMod.LateBoundPropertyNames
import typings.tsutils.utilUtilMod.LineRange
import typings.tsutils.utilUtilMod.ScopeBoundary
import typings.tsutils.utilUtilMod.SideEffectOptions
import typings.tsutils.utilUtilMod.StrictCompilerOption
import typings.tsutils.utilUtilMod.VariableDeclarationKind
import typings.tsutils.utilUtilMod.WellKnownSymbolLiteral
import typings.typescript.mod.AccessorDeclaration
import typings.typescript.mod.ArrowFunction
import typings.typescript.mod.AssertionExpression
import typings.typescript.mod.BindingElement
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.BlockLike
import typings.typescript.mod.CallExpression
import typings.typescript.mod.CheckJsDirective
import typings.typescript.mod.ClassElement
import typings.typescript.mod.ClassLikeDeclaration
import typings.typescript.mod.CommentRange
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Expression
import typings.typescript.mod.ExpressionWithTypeArguments
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDoc
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModifierFlags
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.NoSubstitutionTemplateLiteral
import typings.typescript.mod.Node
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.ObjectFlags
import typings.typescript.mod.ObjectType
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.PseudoBigInt
import typings.typescript.mod.ScriptTarget
import typings.typescript.mod.Signature
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Statement
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.SwitchStatement
import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolFlags
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.SyntaxKind.AbstractKeyword
import typings.typescript.mod.SyntaxKind.AsyncKeyword
import typings.typescript.mod.SyntaxKind.ConstKeyword
import typings.typescript.mod.SyntaxKind.DeclareKeyword
import typings.typescript.mod.SyntaxKind.DefaultKeyword
import typings.typescript.mod.SyntaxKind.ExportKeyword
import typings.typescript.mod.SyntaxKind.InKeyword
import typings.typescript.mod.SyntaxKind.OutKeyword
import typings.typescript.mod.SyntaxKind.OverrideKeyword
import typings.typescript.mod.SyntaxKind.PrivateKeyword
import typings.typescript.mod.SyntaxKind.ProtectedKeyword
import typings.typescript.mod.SyntaxKind.PublicKeyword
import typings.typescript.mod.SyntaxKind.ReadonlyKeyword
import typings.typescript.mod.SyntaxKind.StaticKeyword
import typings.typescript.mod.Token
import typings.typescript.mod.Type
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tsutils", "AccessKind")
  @js.native
  object AccessKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.AccessKind & Double] = js.native
    
    /* 4 */ val Delete: typings.tsutils.utilUtilMod.AccessKind.Delete & Double = js.native
    
    /* 6 */ val Modification: typings.tsutils.utilUtilMod.AccessKind.Modification & Double = js.native
    
    /* 0 */ val None: typings.tsutils.utilUtilMod.AccessKind.None & Double = js.native
    
    /* 1 */ val Read: typings.tsutils.utilUtilMod.AccessKind.Read & Double = js.native
    
    /* 3 */ val ReadWrite: typings.tsutils.utilUtilMod.AccessKind.ReadWrite & Double = js.native
    
    /* 2 */ val Write: typings.tsutils.utilUtilMod.AccessKind.Write & Double = js.native
  }
  
  @JSImport("tsutils", "DeclarationDomain")
  @js.native
  object DeclarationDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.usageMod.DeclarationDomain & Double] = js.native
    
    /* 7 */ val Any: typings.tsutils.usageMod.DeclarationDomain.Any & Double = js.native
    
    /* 8 */ val Import: typings.tsutils.usageMod.DeclarationDomain.Import & Double = js.native
    
    /* 1 */ val Namespace: typings.tsutils.usageMod.DeclarationDomain.Namespace & Double = js.native
    
    /* 2 */ val Type: typings.tsutils.usageMod.DeclarationDomain.Type & Double = js.native
    
    /* 4 */ val Value: typings.tsutils.usageMod.DeclarationDomain.Value & Double = js.native
  }
  
  @JSImport("tsutils", "ImportKind")
  @js.native
  object ImportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.ImportKind & Double] = js.native
    
    /* 63 */ val All: typings.tsutils.utilUtilMod.ImportKind.All & Double = js.native
    
    /* 24 */ val AllImportExpressions: typings.tsutils.utilUtilMod.ImportKind.AllImportExpressions & Double = js.native
    
    /* 59 */ val AllImports: typings.tsutils.utilUtilMod.ImportKind.AllImports & Double = js.native
    
    /* 18 */ val AllRequireLike: typings.tsutils.utilUtilMod.ImportKind.AllRequireLike & Double = js.native
    
    /* 3 */ val AllStaticImports: typings.tsutils.utilUtilMod.ImportKind.AllStaticImports & Double = js.native
    
    /* 8 */ val DynamicImport: typings.tsutils.utilUtilMod.ImportKind.DynamicImport & Double = js.native
    
    /* 4 */ val ExportFrom: typings.tsutils.utilUtilMod.ImportKind.ExportFrom & Double = js.native
    
    /* 1 */ val ImportDeclaration: typings.tsutils.utilUtilMod.ImportKind.ImportDeclaration & Double = js.native
    
    /* 2 */ val ImportEquals: typings.tsutils.utilUtilMod.ImportKind.ImportEquals & Double = js.native
    
    /* 32 */ val ImportType: typings.tsutils.utilUtilMod.ImportKind.ImportType & Double = js.native
    
    /* 16 */ val Require: typings.tsutils.utilUtilMod.ImportKind.Require & Double = js.native
  }
  
  @JSImport("tsutils", "ScopeBoundary")
  @js.native
  object ScopeBoundary extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.ScopeBoundary & Double] = js.native
    
    /* 2 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundary.Block & Double = js.native
    
    /* 8 */ val ConditionalType: typings.tsutils.utilUtilMod.ScopeBoundary.ConditionalType & Double = js.native
    
    /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundary.Function & Double = js.native
    
    /* 0 */ val None: typings.tsutils.utilUtilMod.ScopeBoundary.None & Double = js.native
    
    /* 4 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundary.Type & Double = js.native
  }
  
  @JSImport("tsutils", "ScopeBoundarySelector")
  @js.native
  object ScopeBoundarySelector extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.ScopeBoundarySelector & Double] = js.native
    
    /* 3 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Block & Double = js.native
    
    /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Function & Double = js.native
    
    /* 8 */ val InferType: typings.tsutils.utilUtilMod.ScopeBoundarySelector.InferType & Double = js.native
    
    /* 7 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Type & Double = js.native
  }
  
  @JSImport("tsutils", "SideEffectOptions")
  @js.native
  object SideEffectOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.SideEffectOptions & Double] = js.native
    
    /* 2 */ val Constructor: typings.tsutils.utilUtilMod.SideEffectOptions.Constructor & Double = js.native
    
    /* 4 */ val JsxElement: typings.tsutils.utilUtilMod.SideEffectOptions.JsxElement & Double = js.native
    
    /* 0 */ val None: typings.tsutils.utilUtilMod.SideEffectOptions.None & Double = js.native
    
    /* 1 */ val TaggedTemplate: typings.tsutils.utilUtilMod.SideEffectOptions.TaggedTemplate & Double = js.native
  }
  
  @JSImport("tsutils", "SignatureEffect")
  @js.native
  object SignatureEffect extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.controlFlowMod.SignatureEffect & Double] = js.native
    
    /* 2 */ val Asserts: typings.tsutils.controlFlowMod.SignatureEffect.Asserts & Double = js.native
    
    /* 1 */ val Never: typings.tsutils.controlFlowMod.SignatureEffect.Never & Double = js.native
  }
  
  @JSImport("tsutils", "UsageDomain")
  @js.native
  object UsageDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.usageMod.UsageDomain & Double] = js.native
    
    /* 7 */ val Any: typings.tsutils.usageMod.UsageDomain.Any & Double = js.native
    
    /* 1 */ val Namespace: typings.tsutils.usageMod.UsageDomain.Namespace & Double = js.native
    
    /* 2 */ val Type: typings.tsutils.usageMod.UsageDomain.Type & Double = js.native
    
    /* 8 */ val TypeQuery: typings.tsutils.usageMod.UsageDomain.TypeQuery & Double = js.native
    
    /* 4 */ val Value: typings.tsutils.usageMod.UsageDomain.Value & Double = js.native
    
    /* 5 */ val ValueOrNamespace: typings.tsutils.usageMod.UsageDomain.ValueOrNamespace & Double = js.native
  }
  
  @JSImport("tsutils", "VariableDeclarationKind")
  @js.native
  object VariableDeclarationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tsutils.utilUtilMod.VariableDeclarationKind & Double] = js.native
    
    /* 2 */ val Const: typings.tsutils.utilUtilMod.VariableDeclarationKind.Const & Double = js.native
    
    /* 1 */ val Let: typings.tsutils.utilUtilMod.VariableDeclarationKind.Let & Double = js.native
    
    /* 0 */ val Var: typings.tsutils.utilUtilMod.VariableDeclarationKind.Var & Double = js.native
  }
  
  inline def callExpressionAffectsControlFlow(node: CallExpression, checker: TypeChecker): js.UndefOr[SignatureEffect] = (^.asInstanceOf[js.Dynamic].applyDynamic("callExpressionAffectsControlFlow")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SignatureEffect]]
  
  inline def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canHaveJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasJSDoc */ Boolean]
  
  inline def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectVariableUsage")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[Map[Identifier, VariableInfo]]
  
  inline def commentText(sourceText: String, comment: CommentRange): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commentText")(sourceText.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertAst(sourceFile: SourceFile): ConvertedAst = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAst")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[ConvertedAst]
  
  inline def endsControlFlow(statement: BlockLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: BlockLike, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def endsControlFlow(statement: Statement, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsControlFlow")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind): js.Array[ImportLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImportLikeNodes")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportLike]]
  inline def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind, ignoreFileName: Boolean): js.Array[ImportLike] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImportLikeNodes")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any], ignoreFileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[ImportLike]]
  
  inline def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImports")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringLiteral | NoSubstitutionTemplateLiteral]]
  inline def findImports(sourceFile: SourceFile, kinds: ImportKind, ignoreFileName: Boolean): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = (^.asInstanceOf[js.Dynamic].applyDynamic("findImports")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any], ignoreFileName.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringLiteral | NoSubstitutionTemplateLiteral]]
  
  inline def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachComment(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachDeclaredVariable[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ VariableDeclarationnameId | BindingElementnameIdentif, T]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachDeclaredVariable")(declarationList.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def forEachDestructuringIdentifier[T](pattern: BindingPattern, fn: js.Function1[/* element */ BindingElementnameIdentif, T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachDestructuringIdentifier")(pattern.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def formatPseudoBigInt(v: PseudoBigInt): $LeftcurlybracketstringRightcurlybracketn | `-$LeftcurlybracketstringRightcurlybracketn` = ^.asInstanceOf[js.Dynamic].applyDynamic("formatPseudoBigInt")(v.asInstanceOf[js.Any]).asInstanceOf[$LeftcurlybracketstringRightcurlybracketn | `-$LeftcurlybracketstringRightcurlybracketn`]
  
  inline def getAccessKind(node: Node): AccessKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessKind")(node.asInstanceOf[js.Any]).asInstanceOf[AccessKind]
  
  inline def getAstNodeAtPosition(node: Node, pos: Double): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstNodeAtPosition")(node.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getBaseClassMemberOfClassElement(node: AccessorDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  inline def getBaseClassMemberOfClassElement(node: MethodDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  inline def getBaseClassMemberOfClassElement(node: PropertyDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getBaseOfClassLikeExpression(node: ClassLikeDeclaration): js.UndefOr[ExpressionWithTypeArguments] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseOfClassLikeExpression")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ExpressionWithTypeArguments]]
  
  inline def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCallSignaturesOfType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Signature]]
  
  inline def getCheckJsDirective(source: String): js.UndefOr[CheckJsDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckJsDirective")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CheckJsDirective]]
  
  inline def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Token[T]]]
  inline def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Token[T]]]
  
  inline def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CommentRange]]
  inline def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CommentRange]]
  
  inline def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorTypeOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: BlockLike, checker: TypeChecker): ControlFlowEnd = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement): ControlFlowEnd = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any]).asInstanceOf[ControlFlowEnd]
  inline def getControlFlowEnd(statement: Statement, checker: TypeChecker): ControlFlowEnd = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlFlowEnd")(statement.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[ControlFlowEnd]
  
  inline def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationDomain")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DeclarationDomain]]
  
  inline def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationOfBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[VariableDeclaration | ParameterDeclaration]
  
  inline def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CallExpression]]
  inline def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CallExpression]]
  
  inline def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorYieldResultFromIteratorResult")(`type`.asInstanceOf[js.Any], node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getJsDoc(node: Node): js.Array[JSDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDoc]]
  inline def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  
  inline def getLateBoundPropertyNames(node: Expression, checker: TypeChecker): LateBoundPropertyNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNames")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[LateBoundPropertyNames]
  
  inline def getLateBoundPropertyNamesOfPropertyName(node: PropertyName, checker: TypeChecker): LateBoundPropertyNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNamesOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[LateBoundPropertyNames]
  
  inline def getLineBreakStyle(sourceFile: SourceFile): Linefeed | CarriagereturnLinefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineBreakStyle")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[Linefeed | CarriagereturnLinefeed]
  
  inline def getLineRanges(sourceFile: SourceFile): js.Array[LineRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineRanges")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[LineRange]]
  
  inline def getModifier(node: Node, kind: AbstractKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: AsyncKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ConstKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: DeclareKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: DefaultKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ExportKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: InKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: OutKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: OverrideKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: PrivateKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ProtectedKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: PublicKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: ReadonlyKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  inline def getModifier(node: Node, kind: StaticKeyword): js.UndefOr[Modifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Modifier]]
  
  inline def getNextStatement(statement: Statement): js.UndefOr[Statement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Statement]]
  
  inline def getNextToken(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def getNextToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getPreviousStatement(statement: Statement): js.UndefOr[Statement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Statement]]
  
  inline def getPreviousToken(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def getPreviousToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getPropertyName(propertyName: PropertyName): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyName")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getPropertyNameFromType(`type`: Type): js.UndefOr[typings.tsutils.utilUtilMod.PropertyName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameFromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.tsutils.utilUtilMod.PropertyName]]
  
  inline def getPropertyNameOfWellKnownSymbol(node: WellKnownSymbolLiteral): typings.tsutils.utilUtilMod.PropertyName = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameOfWellKnownSymbol")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.PropertyName]
  
  inline def getPropertyOfType(`type`: Type, name: typings.typescript.mod.String): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyOfType")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getSingleLateBoundPropertyNameOfPropertyName(node: PropertyName, checker: TypeChecker): js.UndefOr[typings.tsutils.utilUtilMod.PropertyName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingleLateBoundPropertyNameOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tsutils.utilUtilMod.PropertyName]]
  
  inline def getSymbolOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Symbol]
  
  inline def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getTokenAtPosition(parent: Node, pos: Double, sourceFile: Unit, allowJsDoc: Boolean): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def getTsCheckDirective(source: String): js.UndefOr[CheckJsDirective] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsCheckDirective")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CheckJsDirective]]
  
  inline def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsageDomain")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UsageDomain]]
  
  inline def getVariableDeclarationKind(declarationList: VariableDeclarationList): VariableDeclarationKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableDeclarationKind")(declarationList.asInstanceOf[js.Any]).asInstanceOf[VariableDeclarationKind]
  
  inline def getWellKnownSymbolPropertyOfType(`type`: Type, wellKnownSymbolName: String, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWellKnownSymbolPropertyOfType")(`type`.asInstanceOf[js.Any], wellKnownSymbolName.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getWrappedNodeAtPosition(wrap: NodeWrap, pos: Double): js.UndefOr[NodeWrap] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWrappedNodeAtPosition")(wrap.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeWrap]]
  
  inline def hasAccessModifier(node: ClassElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasAccessModifier(node: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasExhaustiveCaseClauses(node: SwitchStatement, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasExhaustiveCaseClauses")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasModifier(
    modifiers: Unit,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | InKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | OutKeyword | OverrideKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(List(modifiers.asInstanceOf[js.Any]).`++`(kinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  inline def hasModifier(
    modifiers: ModifiersArray,
    kinds: (AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | InKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | OutKeyword | OverrideKeyword | ReadonlyKeyword | StaticKeyword)*
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(List(modifiers.asInstanceOf[js.Any]).`++`(kinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def hasOwnThisReference(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnThisReference")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasSideEffects(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasSideEffects(node: Expression, options: SideEffectOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectionTypeParts(`type`: Type): js.Array[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionTypeParts")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type]]
  
  inline def isAccessorDeclaration(node: Node): /* is typescript.typescript.AccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AccessorDeclaration */ Boolean]
  
  inline def isAmbientModule(node: ModuleDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModule")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBlock */ Boolean]
  
  inline def isArrayBindingPattern(node: Node): /* is typescript.typescript.ArrayBindingPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBindingPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayBindingPattern */ Boolean]
  
  inline def isArrayLiteralExpression(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLiteralExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayLiteralExpression */ Boolean]
  
  inline def isArrayTypeNode(node: Node): /* is typescript.typescript.ArrayTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayTypeNode */ Boolean]
  
  inline def isArrowFunction(node: Node): /* is typescript.typescript.ArrowFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunction")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrowFunction */ Boolean]
  
  inline def isAsExpression(node: Node): /* is typescript.typescript.AsExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AsExpression */ Boolean]
  
  inline def isAssertionExpression(node: Node): /* is typescript.typescript.AssertionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssertionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssertionExpression */ Boolean]
  
  inline def isAssignmentKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAwaitExpression(node: Node): /* is typescript.typescript.AwaitExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AwaitExpression */ Boolean]
  
  inline def isBigIntLiteral(node: Node): /* is typescript.typescript.BigIntLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BigIntLiteral */ Boolean]
  
  inline def isBinaryExpression(node: Node): /* is typescript.typescript.BinaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BinaryExpression */ Boolean]
  
  inline def isBindableObjectDefinePropertyCall(node: CallExpression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindableObjectDefinePropertyCall")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBindingElement(node: Node): /* is typescript.typescript.BindingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BindingElement */ Boolean]
  
  inline def isBindingPattern(node: Node): /* is typescript.typescript.BindingPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindingPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BindingPattern */ Boolean]
  
  inline def isBlock(node: Node): /* is typescript.typescript.Block */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Block */ Boolean]
  
  inline def isBlockLike(node: Node): /* is typescript.typescript.BlockLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BlockLike */ Boolean]
  
  inline def isBlockScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isBlockScopedDeclarationStatement(statement: Statement): /* is typescript.typescript.DeclarationStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedDeclarationStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DeclarationStatement */ Boolean]
  
  inline def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclarationList")(declarationList.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBooleanLiteral(node: Node): /* is typescript.typescript.BooleanLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BooleanLiteral */ Boolean]
  
  inline def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralType")(`type`.asInstanceOf[js.Any], literal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBreakOrContinueStatement(node: Node): /* is typescript.typescript.BreakOrContinueStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakOrContinueStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BreakOrContinueStatement */ Boolean]
  
  inline def isBreakStatement(node: Node): /* is typescript.typescript.BreakStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BreakStatement */ Boolean]
  
  inline def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallExpression */ Boolean]
  
  inline def isCallLikeExpression(node: Node): /* is typescript.typescript.CallLikeExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallLikeExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallLikeExpression */ Boolean]
  
  inline def isCallSignatureDeclaration(node: Node): /* is typescript.typescript.CallSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallSignatureDeclaration */ Boolean]
  
  inline def isCaseBlock(node: Node): /* is typescript.typescript.CaseBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaseBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CaseBlock */ Boolean]
  
  inline def isCaseClause(node: Node): /* is typescript.typescript.CaseClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaseClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CaseClause */ Boolean]
  
  inline def isCaseOrDefaultClause(node: Node): /* is typescript.typescript.CaseOrDefaultClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaseOrDefaultClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CaseOrDefaultClause */ Boolean]
  
  inline def isCatchClause(node: Node): /* is typescript.typescript.CatchClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CatchClause */ Boolean]
  
  inline def isClassDeclaration(node: Node): /* is typescript.typescript.ClassDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassDeclaration */ Boolean]
  
  inline def isClassExpression(node: Node): /* is typescript.typescript.ClassExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassExpression */ Boolean]
  
  inline def isClassLikeDeclaration(node: Node): /* is typescript.typescript.ClassLikeDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassLikeDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassLikeDeclaration */ Boolean]
  
  inline def isCommaListExpression(node: Node): /* is typescript.typescript.CommaListExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommaListExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CommaListExpression */ Boolean]
  
  inline def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isComputedPropertyName(node: Node): /* is typescript.typescript.ComputedPropertyName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputedPropertyName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ComputedPropertyName */ Boolean]
  
  inline def isConditionalExpression(node: Node): /* is typescript.typescript.ConditionalExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConditionalExpression */ Boolean]
  
  inline def isConditionalType(`type`: Type): /* is typescript.typescript.ConditionalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConditionalType */ Boolean]
  
  inline def isConditionalTypeNode(node: Node): /* is typescript.typescript.ConditionalTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConditionalTypeNode */ Boolean]
  
  inline def isConstAssertion(node: AssertionExpression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConstructSignatureDeclaration(node: Node): /* is typescript.typescript.ConstructSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConstructSignatureDeclaration */ Boolean]
  
  inline def isConstructorDeclaration(node: Node): /* is typescript.typescript.ConstructorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConstructorDeclaration */ Boolean]
  
  inline def isConstructorTypeNode(node: Node): /* is typescript.typescript.ConstructorTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConstructorTypeNode */ Boolean]
  
  inline def isContinueStatement(node: Node): /* is typescript.typescript.ContinueStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ContinueStatement */ Boolean]
  
  inline def isDebuggerStatement(node: Node): /* is typescript.typescript.DebuggerStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DebuggerStatement */ Boolean]
  
  inline def isDecorator(node: Node): /* is typescript.typescript.Decorator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Decorator */ Boolean]
  
  inline def isDefaultClause(node: Node): /* is typescript.typescript.DefaultClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DefaultClause */ Boolean]
  
  inline def isDeleteExpression(node: Node): /* is typescript.typescript.DeleteExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeleteExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DeleteExpression */ Boolean]
  
  inline def isDoStatement(node: Node): /* is typescript.typescript.DoStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DoStatement */ Boolean]
  
  inline def isElementAccessExpression(node: Node): /* is typescript.typescript.ElementAccessExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ElementAccessExpression */ Boolean]
  
  inline def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObjectType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectType */ Boolean]
  
  inline def isEmptyStatement(node: Node): /* is typescript.typescript.EmptyStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EmptyStatement */ Boolean]
  
  inline def isEntityName(node: Node): /* is typescript.typescript.EntityName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EntityName */ Boolean]
  
  inline def isEntityNameExpression(node: Node): /* is typescript.typescript.EntityNameExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityNameExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EntityNameExpression */ Boolean]
  
  inline def isEnumDeclaration(node: Node): /* is typescript.typescript.EnumDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EnumDeclaration */ Boolean]
  
  inline def isEnumMember(node: Node): /* is typescript.typescript.EnumMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EnumMember */ Boolean]
  
  inline def isEnumType(`type`: Type): /* is typescript.typescript.EnumType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EnumType */ Boolean]
  
  inline def isExportAssignment(node: Node): /* is typescript.typescript.ExportAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExportAssignment */ Boolean]
  
  inline def isExportDeclaration(node: Node): /* is typescript.typescript.ExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExportDeclaration */ Boolean]
  
  inline def isExportSpecifier(node: Node): /* is typescript.typescript.ExportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExportSpecifier */ Boolean]
  
  inline def isExpression(node: Node): /* is typescript.typescript.Expression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Expression */ Boolean]
  
  inline def isExpressionStatement(node: Node): /* is typescript.typescript.ExpressionStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExpressionStatement */ Boolean]
  
  inline def isExpressionValueUsed(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionValueUsed")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExpressionWithTypeArguments(node: Node): /* is typescript.typescript.ExpressionWithTypeArguments */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWithTypeArguments")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExpressionWithTypeArguments */ Boolean]
  
  inline def isExternalModuleReference(node: Node): /* is typescript.typescript.ExternalModuleReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalModuleReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExternalModuleReference */ Boolean]
  
  inline def isFalsyType(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsyType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isForInOrOfStatement(node: Node): /* is typescript.typescript.ForInOrOfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForInOrOfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForInOrOfStatement */ Boolean]
  
  inline def isForInStatement(node: Node): /* is typescript.typescript.ForInStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForInStatement */ Boolean]
  
  inline def isForOfStatement(node: Node): /* is typescript.typescript.ForOfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForOfStatement */ Boolean]
  
  inline def isForStatement(node: Node): /* is typescript.typescript.ForStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForStatement */ Boolean]
  
  inline def isFunctionDeclaration(node: Node): /* is typescript.typescript.FunctionDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionDeclaration */ Boolean]
  
  inline def isFunctionExpression(node: Node): /* is typescript.typescript.FunctionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionExpression */ Boolean]
  
  inline def isFunctionScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isFunctionTypeNode(node: Node): /* is typescript.typescript.FunctionTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionTypeNode */ Boolean]
  
  inline def isFunctionWithBody(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionWithBody")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isGenericType(`type`: Type): /* is typescript.typescript.GenericType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenericType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.GenericType */ Boolean]
  
  inline def isGetAccessorDeclaration(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGetAccessorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.GetAccessorDeclaration */ Boolean]
  
  inline def isIdentifier(node: Node): /* is typescript.typescript.Identifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Identifier */ Boolean]
  
  inline def isIfStatement(node: Node): /* is typescript.typescript.IfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IfStatement */ Boolean]
  
  inline def isImportClause(node: Node): /* is typescript.typescript.ImportClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportClause */ Boolean]
  
  inline def isImportDeclaration(node: Node): /* is typescript.typescript.ImportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportDeclaration */ Boolean]
  
  inline def isImportEqualsDeclaration(node: Node): /* is typescript.typescript.ImportEqualsDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportEqualsDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportEqualsDeclaration */ Boolean]
  
  inline def isImportSpecifier(node: Node): /* is typescript.typescript.ImportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportSpecifier */ Boolean]
  
  inline def isImportTypeNode(node: Node): /* is typescript.typescript.ImportTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportTypeNode */ Boolean]
  
  inline def isInConstContext(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInConstContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInSingleStatementContext(statement: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInSingleStatementContext")(statement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIndexSignatureDeclaration(node: Node): /* is typescript.typescript.IndexSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IndexSignatureDeclaration */ Boolean]
  
  inline def isIndexedAccessType(`type`: Type): /* is typescript.typescript.IndexedAccessType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IndexedAccessType */ Boolean]
  
  inline def isIndexedAccessTypeNode(node: Node): /* is typescript.typescript.IndexedAccessTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IndexedAccessTypeNode */ Boolean]
  
  inline def isIndexedAccessype(`type`: Type): /* is typescript.typescript.IndexType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessype")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IndexType */ Boolean]
  
  inline def isInferTypeNode(node: Node): /* is typescript.typescript.InferTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInferTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.InferTypeNode */ Boolean]
  
  inline def isInstantiableType(`type`: Type): /* is typescript.typescript.InstantiableType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstantiableType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.InstantiableType */ Boolean]
  
  inline def isInterfaceDeclaration(node: Node): /* is typescript.typescript.InterfaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.InterfaceDeclaration */ Boolean]
  
  inline def isInterfaceType(`type`: Type): /* is typescript.typescript.InterfaceType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.InterfaceType */ Boolean]
  
  inline def isIntersectionType(`type`: Type): /* is typescript.typescript.IntersectionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IntersectionType */ Boolean]
  
  inline def isIntersectionTypeNode(node: Node): /* is typescript.typescript.IntersectionTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IntersectionTypeNode */ Boolean]
  
  inline def isIterationStatement(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterationStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IterationStatement */ Boolean]
  
  inline def isJsDoc(node: Node): /* is typescript.typescript.JSDoc */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDoc */ Boolean]
  
  inline def isJsDocKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsDocKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJsxAttribute(node: Node): /* is typescript.typescript.JsxAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxAttribute */ Boolean]
  
  inline def isJsxAttributeLike(node: Node): /* is typescript.typescript.JsxAttributeLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxAttributeLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxAttributeLike */ Boolean]
  
  inline def isJsxAttributes(node: Node): /* is typescript.typescript.JsxAttributes */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxAttributes")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxAttributes */ Boolean]
  
  inline def isJsxClosingElement(node: Node): /* is typescript.typescript.JsxClosingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxClosingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxClosingElement */ Boolean]
  
  inline def isJsxClosingFragment(node: Node): /* is typescript.typescript.JsxClosingFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxClosingFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxClosingFragment */ Boolean]
  
  inline def isJsxElement(node: Node): /* is typescript.typescript.JsxElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxElement */ Boolean]
  
  inline def isJsxExpression(node: Node): /* is typescript.typescript.JsxExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxExpression */ Boolean]
  
  inline def isJsxFragment(node: Node): /* is typescript.typescript.JsxFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxFragment */ Boolean]
  
  inline def isJsxOpeningElement(node: Node): /* is typescript.typescript.JsxOpeningElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxOpeningElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxOpeningElement */ Boolean]
  
  inline def isJsxOpeningFragment(node: Node): /* is typescript.typescript.JsxOpeningFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxOpeningFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxOpeningFragment */ Boolean]
  
  inline def isJsxOpeningLikeElement(node: Node): /* is typescript.typescript.JsxOpeningLikeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxOpeningLikeElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxOpeningLikeElement */ Boolean]
  
  inline def isJsxSelfClosingElement(node: Node): /* is typescript.typescript.JsxSelfClosingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxSelfClosingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxSelfClosingElement */ Boolean]
  
  inline def isJsxSpreadAttribute(node: Node): /* is typescript.typescript.JsxSpreadAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxSpreadAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxSpreadAttribute */ Boolean]
  
  inline def isJsxText(node: Node): /* is typescript.typescript.JsxText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxText */ Boolean]
  
  inline def isKeywordKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLabeledStatement(node: Node): /* is typescript.typescript.LabeledStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LabeledStatement */ Boolean]
  
  inline def isLiteralExpression(node: Node): /* is typescript.typescript.LiteralExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LiteralExpression */ Boolean]
  
  inline def isLiteralType(`type`: Type): /* is typescript.typescript.LiteralType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LiteralType */ Boolean]
  
  inline def isLiteralTypeNode(node: Node): /* is typescript.typescript.LiteralTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LiteralTypeNode */ Boolean]
  
  inline def isMappedTypeNode(node: Node): /* is typescript.typescript.MappedTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMappedTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MappedTypeNode */ Boolean]
  
  inline def isMetaProperty(node: Node): /* is typescript.typescript.MetaProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MetaProperty */ Boolean]
  
  inline def isMethodDeclaration(node: Node): /* is typescript.typescript.MethodDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MethodDeclaration */ Boolean]
  
  inline def isMethodSignature(node: Node): /* is typescript.typescript.MethodSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodSignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MethodSignature */ Boolean]
  
  inline def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModifierFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBlock */ Boolean]
  
  inline def isModuleDeclaration(node: Node): /* is typescript.typescript.ModuleDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleDeclaration */ Boolean]
  
  inline def isNamedExports(node: Node): /* is typescript.typescript.NamedExports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedExports")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedExports */ Boolean]
  
  inline def isNamedImports(node: Node): /* is typescript.typescript.NamedImports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedImports")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedImports */ Boolean]
  
  inline def isNamespaceDeclaration(node: Node): /* is typescript.typescript.NamespaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamespaceDeclaration */ Boolean]
  
  inline def isNamespaceExportDeclaration(node: Node): /* is typescript.typescript.NamespaceExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespaceExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamespaceExportDeclaration */ Boolean]
  
  inline def isNamespaceImport(node: Node): /* is typescript.typescript.NamespaceImport */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespaceImport")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamespaceImport */ Boolean]
  
  inline def isNewExpression(node: Node): /* is typescript.typescript.NewExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NewExpression */ Boolean]
  
  inline def isNoSubstitutionTemplateLiteral(node: Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoSubstitutionTemplateLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean]
  
  inline def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNodeKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNonNullExpression(node: Node): /* is typescript.typescript.NonNullExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NonNullExpression */ Boolean]
  
  inline def isNullLiteral(node: Node): /* is typescript.typescript.NullLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NullLiteral */ Boolean]
  
  inline def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NumericLiteral */ Boolean]
  
  inline def isNumericOrStringLikeLiteral(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericOrStringLikeLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumericPropertyName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumericPropertyName(name: typings.typescript.mod.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObjectBindingPattern(node: Node): /* is typescript.typescript.ObjectBindingPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectBindingPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectBindingPattern */ Boolean]
  
  inline def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObjectLiteralExpression(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLiteralExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectLiteralExpression */ Boolean]
  
  inline def isObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectType */ Boolean]
  
  inline def isOmittedExpression(node: Node): /* is typescript.typescript.OmittedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOmittedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.OmittedExpression */ Boolean]
  
  inline def isOptionalChainingUndefinedMarkerType(checker: TypeChecker, t: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalChainingUndefinedMarkerType")(checker.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isOptionalTypeNode(node: Node): /* is typescript.typescript.OptionalTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.OptionalTypeNode */ Boolean]
  
  inline def isParameterDeclaration(node: Node): /* is typescript.typescript.ParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ParameterDeclaration */ Boolean]
  
  inline def isParameterProperty(node: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParameterProperty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isParenthesizedExpression(node: Node): /* is typescript.typescript.ParenthesizedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ParenthesizedExpression */ Boolean]
  
  inline def isParenthesizedTypeNode(node: Node): /* is typescript.typescript.ParenthesizedTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ParenthesizedTypeNode */ Boolean]
  
  inline def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPostfixUnaryExpression(node: Node): /* is typescript.typescript.PostfixUnaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPostfixUnaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PostfixUnaryExpression */ Boolean]
  
  inline def isPrefixUnaryExpression(node: Node): /* is typescript.typescript.PrefixUnaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixUnaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PrefixUnaryExpression */ Boolean]
  
  inline def isPropertyAccessExpression(node: Node): /* is typescript.typescript.PropertyAccessExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyAccessExpression */ Boolean]
  
  inline def isPropertyAssignment(node: Node): /* is typescript.typescript.PropertyAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyAssignment */ Boolean]
  
  inline def isPropertyDeclaration(node: Node): /* is typescript.typescript.PropertyDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyDeclaration */ Boolean]
  
  inline def isPropertyReadonlyInType(`type`: Type, name: typings.typescript.mod.String, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyReadonlyInType")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPropertySignature(node: Node): /* is typescript.typescript.PropertySignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertySignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertySignature */ Boolean]
  
  inline def isQualifiedName(node: Node): /* is typescript.typescript.QualifiedName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.QualifiedName */ Boolean]
  
  inline def isReadonlyAssignmentDeclaration(node: CallExpression, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyAssignmentDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isReassignmentTarget(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReassignmentTarget")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegularExpressionLiteral(node: Node): /* is typescript.typescript.RegularExpressionLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegularExpressionLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.RegularExpressionLiteral */ Boolean]
  
  inline def isRestTypeNode(node: Node): /* is typescript.typescript.RestTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.RestTypeNode */ Boolean]
  
  inline def isReturnStatement(node: Node): /* is typescript.typescript.ReturnStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ReturnStatement */ Boolean]
  
  inline def isSameLine(sourceFile: SourceFile, pos1: Double, pos2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameLine")(sourceFile.asInstanceOf[js.Any], pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isSetAccessorDeclaration(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetAccessorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SetAccessorDeclaration */ Boolean]
  
  inline def isShorthandPropertyAssignment(node: Node): /* is typescript.typescript.ShorthandPropertyAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShorthandPropertyAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ShorthandPropertyAssignment */ Boolean]
  
  inline def isSignatureDeclaration(node: Node): /* is typescript.typescript.SignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SignatureDeclaration */ Boolean]
  
  inline def isSourceFile(node: Node): /* is typescript.typescript.SourceFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSourceFile")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SourceFile */ Boolean]
  
  inline def isSpreadAssignment(node: Node): /* is typescript.typescript.SpreadAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SpreadAssignment */ Boolean]
  
  inline def isSpreadElement(node: Node): /* is typescript.typescript.SpreadElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SpreadElement */ Boolean]
  
  inline def isStatementInAmbientContext(node: Statement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatementInAmbientContext")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStrictCompilerOptionEnabled(options: CompilerOptions, option: StrictCompilerOption): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStrictCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.StringLiteral */ Boolean]
  
  inline def isSubstitutionType(`type`: Type): /* is typescript.typescript.SubstitutionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubstitutionType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SubstitutionType */ Boolean]
  
  inline def isSwitchStatement(node: Node): /* is typescript.typescript.SwitchStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SwitchStatement */ Boolean]
  
  inline def isSymbolFlagSet(symbol: Symbol, flag: SymbolFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSyntaxList(node: Node): /* is typescript.typescript.SyntaxList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntaxList")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SyntaxList */ Boolean]
  
  inline def isSyntheticExpression(node: Node): /* is typescript.typescript.SyntheticExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SyntheticExpression */ Boolean]
  
  inline def isTaggedTemplateExpression(node: Node): /* is typescript.typescript.TaggedTemplateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TaggedTemplateExpression */ Boolean]
  
  inline def isTemplateExpression(node: Node): /* is typescript.typescript.TemplateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateExpression */ Boolean]
  
  inline def isTemplateLiteral(node: Node): /* is typescript.typescript.TemplateLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateLiteral */ Boolean]
  
  inline def isTextualLiteral(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextualLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThenableType(checker: TypeChecker, node: Expression): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isThisParameter(parameter: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThrowStatement(node: Node): /* is typescript.typescript.ThrowStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ThrowStatement */ Boolean]
  
  inline def isTokenKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTryStatement(node: Node): /* is typescript.typescript.TryStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TryStatement */ Boolean]
  
  inline def isTupleType(`type`: Type): /* is typescript.typescript.TupleType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TupleType */ Boolean]
  
  inline def isTupleTypeNode(node: Node): /* is typescript.typescript.TupleTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TupleTypeNode */ Boolean]
  
  inline def isTupleTypeReference(`type`: Type): /* is tsutils.anon.TypeReferencetargetTupleT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeReference")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is tsutils.anon.TypeReferencetargetTupleT */ Boolean]
  
  inline def isTypeAliasDeclaration(node: Node): /* is typescript.typescript.TypeAliasDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAliasDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeAliasDeclaration */ Boolean]
  
  inline def isTypeAssertion(node: Node): /* is typescript.typescript.TypeAssertion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeAssertion */ Boolean]
  
  inline def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssignableToNumber")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssignableToString")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeFlagSet(`type`: Type, flag: TypeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeLiteralNode(node: Node): /* is typescript.typescript.TypeLiteralNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeLiteralNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeLiteralNode */ Boolean]
  
  inline def isTypeNodeKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTypeOfExpression(node: Node): /* is typescript.typescript.TypeOfExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOfExpression */ Boolean]
  
  inline def isTypeOperatorNode(node: Node): /* is typescript.typescript.TypeOperatorNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOperatorNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOperatorNode */ Boolean]
  
  inline def isTypeParameter(`type`: Type): /* is typescript.typescript.TypeParameter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameter")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeParameter */ Boolean]
  
  inline def isTypeParameterDeclaration(node: Node): /* is typescript.typescript.TypeParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeParameterDeclaration */ Boolean]
  
  inline def isTypePredicateNode(node: Node): /* is typescript.typescript.TypePredicateNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypePredicateNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypePredicateNode */ Boolean]
  
  inline def isTypeQueryNode(node: Node): /* is typescript.typescript.TypeQueryNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeQueryNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeQueryNode */ Boolean]
  
  inline def isTypeReference(`type`: Type): /* is typescript.typescript.TypeReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeReference")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeReference */ Boolean]
  
  inline def isTypeReferenceNode(node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeReferenceNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeReferenceNode */ Boolean]
  
  inline def isTypeScopeBoundary(node: Node): ScopeBoundary = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[ScopeBoundary]
  
  inline def isTypeVariable(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeVariable")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnionOrIntersectionType(`type`: Type): /* is typescript.typescript.UnionOrIntersectionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionOrIntersectionType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnionOrIntersectionType */ Boolean]
  
  inline def isUnionType(`type`: Type): /* is typescript.typescript.UnionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnionType */ Boolean]
  
  inline def isUnionTypeNode(node: Node): /* is typescript.typescript.UnionTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnionTypeNode */ Boolean]
  
  inline def isUniqueESSymbolType(`type`: Type): /* is typescript.typescript.UniqueESSymbolType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUniqueESSymbolType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UniqueESSymbolType */ Boolean]
  
  inline def isValidIdentifier(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidIdentifier(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidJsxIdentifier(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidJsxIdentifier(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidNumericLiteral(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidNumericLiteral(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPropertyAccess(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPropertyAccess(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPropertyName(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPropertyName(text: String, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isVariableDeclaration(node: Node): /* is typescript.typescript.VariableDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VariableDeclaration */ Boolean]
  
  inline def isVariableDeclarationList(node: Node): /* is typescript.typescript.VariableDeclarationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarationList")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VariableDeclarationList */ Boolean]
  
  inline def isVariableStatement(node: Node): /* is typescript.typescript.VariableStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VariableStatement */ Boolean]
  
  inline def isVoidExpression(node: Node): /* is typescript.typescript.VoidExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoidExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VoidExpression */ Boolean]
  
  inline def isWellKnownSymbolLiterally(node: Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWellKnownSymbolLiterally")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean]
  
  inline def isWhileStatement(node: Node): /* is typescript.typescript.WhileStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.WhileStatement */ Boolean]
  
  inline def isWithStatement(node: Node): /* is typescript.typescript.WithStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.WithStatement */ Boolean]
  
  inline def parseJsDocOfNode(node: Node): js.Array[JSDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDoc]]
  inline def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  inline def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  inline def parseJsDocOfNode(node: Node, considerTrailingComments: Unit, sourceFile: SourceFile): js.Array[JSDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDoc]]
  
  inline def removeOptionalChainingUndefinedMarkerType(checker: TypeChecker, `type`: Type): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionalChainingUndefinedMarkerType")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionalityFromType")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someTypePart")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolHasReadonlyDeclaration")(symbol.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unionTypeParts(`type`: Type): js.Array[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("unionTypeParts")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type]]
  
  inline def unwrapParentheses(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
}
