package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def canHaveJsDoc(node: typings.typescript.mod.Node): /* is typescript.typescript.HasJSDoc */ scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("canHaveJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasJSDoc */ scala.Boolean]

inline def commentText(sourceText: java.lang.String, comment: typings.typescript.mod.CommentRange): java.lang.String = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("commentText")(sourceText.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def findImportLikeNodes(sourceFile: typings.typescript.mod.SourceFile, kinds: typings.tsutils.utilUtilMod.ImportKind): js.Array[typings.tsutils.utilUtilMod.ImportLike] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("findImportLikeNodes")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tsutils.utilUtilMod.ImportLike]]

inline def findImports(sourceFile: typings.typescript.mod.SourceFile, kinds: typings.tsutils.utilUtilMod.ImportKind): js.Array[
typings.typescript.mod.StringLiteral | typings.typescript.mod.NoSubstitutionTemplateLiteral] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("findImports")(sourceFile.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[js.Array[
typings.typescript.mod.StringLiteral | typings.typescript.mod.NoSubstitutionTemplateLiteral]]

inline def forEachComment(node: typings.typescript.mod.Node, cb: typings.tsutils.utilUtilMod.ForEachCommentCallback): scala.Unit = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def forEachComment(
  node: typings.typescript.mod.Node,
  cb: typings.tsutils.utilUtilMod.ForEachCommentCallback,
  sourceFile: typings.typescript.mod.SourceFile
): scala.Unit = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def forEachDeclaredVariable[T](
  declarationList: typings.typescript.mod.VariableDeclarationList,
  cb: js.Function1[
  /* element */ (typings.typescript.mod.VariableDeclaration | typings.typescript.mod.BindingElement) & typings.tsutils.anon.Name, 
  T
]
): js.UndefOr[T] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachDeclaredVariable")(declarationList.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def forEachDestructuringIdentifier[T](
  pattern: typings.typescript.mod.BindingPattern,
  fn: js.Function1[/* element */ typings.tsutils.anon.BindingElementnameIdentif, T]
): js.UndefOr[T] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachDestructuringIdentifier")(pattern.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def forEachToken(
  node: typings.typescript.mod.Node,
  cb: js.Function1[/* node */ typings.typescript.mod.Node, scala.Unit]
): scala.Unit = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def forEachToken(
  node: typings.typescript.mod.Node,
  cb: js.Function1[/* node */ typings.typescript.mod.Node, scala.Unit],
  sourceFile: typings.typescript.mod.SourceFile
): scala.Unit = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def forEachTokenWithTrivia(node: typings.typescript.mod.Node, cb: typings.tsutils.utilUtilMod.ForEachTokenCallback): scala.Unit = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def forEachTokenWithTrivia(
  node: typings.typescript.mod.Node,
  cb: typings.tsutils.utilUtilMod.ForEachTokenCallback,
  sourceFile: typings.typescript.mod.SourceFile
): scala.Unit = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachTokenWithTrivia")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def getAccessKind(node: typings.typescript.mod.Node): typings.tsutils.utilUtilMod.AccessKind = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getAccessKind")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.AccessKind]

inline def getCheckJsDirective(source: java.lang.String): js.UndefOr[typings.typescript.mod.CheckJsDirective] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCheckJsDirective")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.CheckJsDirective]]

inline def getChildOfKind[T /* <: typings.typescript.mod.SyntaxKind */](node: typings.typescript.mod.Node, kind: T): js.UndefOr[typings.typescript.mod.Token[T]] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Token[T]]]
inline def getChildOfKind[T /* <: typings.typescript.mod.SyntaxKind */](node: typings.typescript.mod.Node, kind: T, sourceFile: typings.typescript.mod.SourceFile): js.UndefOr[typings.typescript.mod.Token[T]] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getChildOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Token[T]]]

inline def getCommentAtPosition(sourceFile: typings.typescript.mod.SourceFile, pos: scala.Double): js.UndefOr[typings.typescript.mod.CommentRange] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.CommentRange]]
inline def getCommentAtPosition(
  sourceFile: typings.typescript.mod.SourceFile,
  pos: scala.Double,
  parent: typings.typescript.mod.Node
): js.UndefOr[typings.typescript.mod.CommentRange] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCommentAtPosition")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.CommentRange]]

inline def getDeclarationOfBindingElement(node: typings.typescript.mod.BindingElement): typings.typescript.mod.VariableDeclaration | typings.typescript.mod.ParameterDeclaration = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationOfBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[typings.typescript.mod.VariableDeclaration | typings.typescript.mod.ParameterDeclaration]

inline def getIIFE(func: typings.typescript.mod.ArrowFunction): js.UndefOr[typings.typescript.mod.CallExpression] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.CallExpression]]
inline def getIIFE(func: typings.typescript.mod.FunctionExpression): js.UndefOr[typings.typescript.mod.CallExpression] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getIIFE")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.CallExpression]]

inline def getJsDoc(node: typings.typescript.mod.Node): js.Array[typings.typescript.mod.JSDoc] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.typescript.mod.JSDoc]]
inline def getJsDoc(node: typings.typescript.mod.Node, sourceFile: typings.typescript.mod.SourceFile): js.Array[typings.typescript.mod.JSDoc] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getJsDoc")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescript.mod.JSDoc]]

inline def getLateBoundPropertyNames(node: typings.typescript.mod.Expression, checker: typings.typescript.mod.TypeChecker): typings.tsutils.utilUtilMod.LateBoundPropertyNames = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNames")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[typings.tsutils.utilUtilMod.LateBoundPropertyNames]

inline def getLateBoundPropertyNamesOfPropertyName(node: typings.typescript.mod.PropertyName, checker: typings.typescript.mod.TypeChecker): typings.tsutils.utilUtilMod.LateBoundPropertyNames = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLateBoundPropertyNamesOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[typings.tsutils.utilUtilMod.LateBoundPropertyNames]

inline def getLineBreakStyle(sourceFile: typings.typescript.mod.SourceFile): typings.tsutils.tsutilsStrings.Linefeed | typings.tsutils.tsutilsStrings.CarriagereturnLinefeed = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLineBreakStyle")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.tsutilsStrings.Linefeed | typings.tsutils.tsutilsStrings.CarriagereturnLinefeed]

inline def getLineRanges(sourceFile: typings.typescript.mod.SourceFile): js.Array[typings.tsutils.utilUtilMod.LineRange] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getLineRanges")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.tsutils.utilUtilMod.LineRange]]

inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.AbstractKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.AsyncKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.ConstKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.DeclareKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.DefaultKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.ExportKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.PrivateKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.ProtectedKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.PublicKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.ReadonlyKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]
inline def getModifier(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind.StaticKeyword): js.UndefOr[typings.typescript.mod.Modifier] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getModifier")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Modifier]]

inline def getNextStatement(statement: typings.typescript.mod.Statement): js.UndefOr[typings.typescript.mod.Statement] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNextStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.Statement]]

inline def getNextToken(node: typings.typescript.mod.Node): js.UndefOr[typings.typescript.mod.Node] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]
inline def getNextToken(node: typings.typescript.mod.Node, sourceFile: typings.typescript.mod.SourceFile): js.UndefOr[typings.typescript.mod.Node] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getNextToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]

inline def getPreviousStatement(statement: typings.typescript.mod.Statement): js.UndefOr[typings.typescript.mod.Statement] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.Statement]]

inline def getPreviousToken(node: typings.typescript.mod.Node): js.UndefOr[typings.typescript.mod.Node] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]
inline def getPreviousToken(node: typings.typescript.mod.Node, sourceFile: typings.typescript.mod.SourceFile): js.UndefOr[typings.typescript.mod.Node] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousToken")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]

inline def getPropertyName(propertyName: typings.typescript.mod.PropertyName): js.UndefOr[java.lang.String] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyName")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]

inline def getPropertyNameOfWellKnownSymbol(node: typings.tsutils.utilUtilMod.WellKnownSymbolLiteral): typings.tsutils.utilUtilMod.PropertyName = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameOfWellKnownSymbol")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.PropertyName]

inline def getSingleLateBoundPropertyNameOfPropertyName(node: typings.typescript.mod.PropertyName, checker: typings.typescript.mod.TypeChecker): js.UndefOr[typings.tsutils.utilUtilMod.PropertyName] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getSingleLateBoundPropertyNameOfPropertyName")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tsutils.utilUtilMod.PropertyName]]

inline def getTokenAtPosition(parent: typings.typescript.mod.Node, pos: scala.Double): js.UndefOr[typings.typescript.mod.Node] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]
inline def getTokenAtPosition(
  parent: typings.typescript.mod.Node,
  pos: scala.Double,
  sourceFile: scala.Unit,
  allowJsDoc: scala.Boolean
): js.UndefOr[typings.typescript.mod.Node] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]
inline def getTokenAtPosition(
  parent: typings.typescript.mod.Node,
  pos: scala.Double,
  sourceFile: typings.typescript.mod.SourceFile
): js.UndefOr[typings.typescript.mod.Node] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]
inline def getTokenAtPosition(
  parent: typings.typescript.mod.Node,
  pos: scala.Double,
  sourceFile: typings.typescript.mod.SourceFile,
  allowJsDoc: scala.Boolean
): js.UndefOr[typings.typescript.mod.Node] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAtPosition")(parent.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], allowJsDoc.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]

inline def getVariableDeclarationKind(declarationList: typings.typescript.mod.VariableDeclarationList): typings.tsutils.utilUtilMod.VariableDeclarationKind = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getVariableDeclarationKind")(declarationList.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.VariableDeclarationKind]

inline def getWrappedNodeAtPosition(wrap: typings.tsutils.convertAstMod.NodeWrap, pos: scala.Double): js.UndefOr[typings.tsutils.convertAstMod.NodeWrap] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("getWrappedNodeAtPosition")(wrap.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tsutils.convertAstMod.NodeWrap]]

inline def hasAccessModifier(node: typings.typescript.mod.ClassElement): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def hasAccessModifier(node: typings.typescript.mod.ParameterDeclaration): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasAccessModifier")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def hasModifier(
  modifiers: scala.Unit,
  kinds: (typings.typescript.mod.SyntaxKind.AbstractKeyword | typings.typescript.mod.SyntaxKind.AsyncKeyword | typings.typescript.mod.SyntaxKind.ConstKeyword | typings.typescript.mod.SyntaxKind.DeclareKeyword | typings.typescript.mod.SyntaxKind.DefaultKeyword | typings.typescript.mod.SyntaxKind.ExportKeyword | typings.typescript.mod.SyntaxKind.PrivateKeyword | typings.typescript.mod.SyntaxKind.ProtectedKeyword | typings.typescript.mod.SyntaxKind.PublicKeyword | typings.typescript.mod.SyntaxKind.ReadonlyKeyword | typings.typescript.mod.SyntaxKind.StaticKeyword)*
): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def hasModifier(
  modifiers: typings.typescript.mod.ModifiersArray,
  kinds: (typings.typescript.mod.SyntaxKind.AbstractKeyword | typings.typescript.mod.SyntaxKind.AsyncKeyword | typings.typescript.mod.SyntaxKind.ConstKeyword | typings.typescript.mod.SyntaxKind.DeclareKeyword | typings.typescript.mod.SyntaxKind.DefaultKeyword | typings.typescript.mod.SyntaxKind.ExportKeyword | typings.typescript.mod.SyntaxKind.PrivateKeyword | typings.typescript.mod.SyntaxKind.ProtectedKeyword | typings.typescript.mod.SyntaxKind.PublicKeyword | typings.typescript.mod.SyntaxKind.ReadonlyKeyword | typings.typescript.mod.SyntaxKind.StaticKeyword)*
): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], kinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def hasOwnThisReference(node: typings.typescript.mod.Node): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnThisReference")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def hasSideEffects(node: typings.typescript.mod.Expression): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def hasSideEffects(node: typings.typescript.mod.Expression, options: typings.tsutils.utilUtilMod.SideEffectOptions): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("hasSideEffects")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isAmbientModule(node: typings.typescript.mod.ModuleDeclaration): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModule")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isAmbientModuleBlock(node: typings.typescript.mod.Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAmbientModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBlock */ scala.Boolean]

inline def isAssignmentKind(kind: typings.typescript.mod.SyntaxKind): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssignmentKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isBindableObjectDefinePropertyCall(node: typings.typescript.mod.CallExpression): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBindableObjectDefinePropertyCall")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isBlockScopeBoundary(node: typings.typescript.mod.Node): typings.tsutils.utilUtilMod.ScopeBoundary = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.ScopeBoundary]

inline def isBlockScopedDeclarationStatement(statement: typings.typescript.mod.Statement): /* is typescript.typescript.DeclarationStatement */ scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedDeclarationStatement")(statement.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DeclarationStatement */ scala.Boolean]

inline def isBlockScopedVariableDeclaration(declaration: typings.typescript.mod.VariableDeclaration): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isBlockScopedVariableDeclarationList(declarationList: typings.typescript.mod.VariableDeclarationList): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariableDeclarationList")(declarationList.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isCompilerOptionEnabled(
  options: typings.typescript.mod.CompilerOptions,
  option: typings.tsutils.utilUtilMod.BooleanCompilerOptions
): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isCompilerOptionEnabled_stripInternal(
  options: typings.typescript.mod.CompilerOptions,
  option: typings.tsutils.tsutilsStrings.stripInternal
): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isConstAssertion(node: typings.typescript.mod.AssertionExpression): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isConstAssertion")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isExpressionValueUsed(node: typings.typescript.mod.Expression): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionValueUsed")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isFunctionScopeBoundary(node: typings.typescript.mod.Node): typings.tsutils.utilUtilMod.ScopeBoundary = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.ScopeBoundary]

inline def isFunctionWithBody(node: typings.typescript.mod.Node): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionWithBody")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isInConstContext(node: typings.typescript.mod.Expression): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInConstContext")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isInSingleStatementContext(statement: typings.typescript.mod.Statement): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isInSingleStatementContext")(statement.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isJsDocKind(kind: typings.typescript.mod.SyntaxKind): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isJsDocKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isKeywordKind(kind: typings.typescript.mod.SyntaxKind): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isModifierFlagSet(node: typings.typescript.mod.Node, flag: typings.typescript.mod.ModifierFlags): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isModifierFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isNodeFlagSet(node: typings.typescript.mod.Node, flag: typings.typescript.mod.NodeFlags): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isNodeKind(kind: typings.typescript.mod.SyntaxKind): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isNumericPropertyName(name: java.lang.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isNumericPropertyName(name: typings.typescript.mod.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumericPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isObjectFlagSet(objectType: typings.typescript.mod.ObjectType, flag: typings.typescript.mod.ObjectFlags): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isParameterProperty(node: typings.typescript.mod.ParameterDeclaration): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isParameterProperty")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isPositionInComment(sourceFile: typings.typescript.mod.SourceFile, pos: scala.Double): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def isPositionInComment(
  sourceFile: typings.typescript.mod.SourceFile,
  pos: scala.Double,
  parent: typings.typescript.mod.Node
): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPositionInComment")(sourceFile.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isReadonlyAssignmentDeclaration(node: typings.typescript.mod.CallExpression, checker: typings.typescript.mod.TypeChecker): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyAssignmentDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isReassignmentTarget(node: typings.typescript.mod.Expression): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isReassignmentTarget")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isSameLine(sourceFile: typings.typescript.mod.SourceFile, pos1: scala.Double, pos2: scala.Double): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSameLine")(sourceFile.asInstanceOf[js.Any], pos1.asInstanceOf[js.Any], pos2.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isScopeBoundary(node: typings.typescript.mod.Node): typings.tsutils.utilUtilMod.ScopeBoundary = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.ScopeBoundary]

inline def isStatementInAmbientContext(node: typings.typescript.mod.Statement): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStatementInAmbientContext")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isStrictCompilerOptionEnabled(
  options: typings.typescript.mod.CompilerOptions,
  option: typings.tsutils.utilUtilMod.StrictCompilerOption
): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStrictCompilerOptionEnabled")(options.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isSymbolFlagSet(symbol: typings.typescript.mod.Symbol, flag: typings.typescript.mod.SymbolFlags): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isThisParameter(parameter: typings.typescript.mod.ParameterDeclaration): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isThisParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isTokenKind(kind: typings.typescript.mod.SyntaxKind): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isTypeFlagSet(`type`: typings.typescript.mod.Type, flag: typings.typescript.mod.TypeFlags): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isTypeNodeKind(kind: typings.typescript.mod.SyntaxKind): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeNodeKind")(kind.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def isTypeScopeBoundary(node: typings.typescript.mod.Node): typings.tsutils.utilUtilMod.ScopeBoundary = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[typings.tsutils.utilUtilMod.ScopeBoundary]

inline def isValidIdentifier(text: java.lang.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isValidIdentifier(text: java.lang.String, languageVersion: typings.typescript.mod.ScriptTarget): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isValidJsxIdentifier(text: java.lang.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isValidJsxIdentifier(text: java.lang.String, languageVersion: typings.typescript.mod.ScriptTarget): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidJsxIdentifier")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isValidNumericLiteral(text: java.lang.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isValidNumericLiteral(text: java.lang.String, languageVersion: typings.typescript.mod.ScriptTarget): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumericLiteral")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isValidPropertyAccess(text: java.lang.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isValidPropertyAccess(text: java.lang.String, languageVersion: typings.typescript.mod.ScriptTarget): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyAccess")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isValidPropertyName(text: java.lang.String): scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
inline def isValidPropertyName(text: java.lang.String, languageVersion: typings.typescript.mod.ScriptTarget): scala.Boolean = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidPropertyName")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isWellKnownSymbolLiterally(node: typings.typescript.mod.Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ scala.Boolean = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("isWellKnownSymbolLiterally")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ scala.Boolean]

inline def parseJsDocOfNode(node: typings.typescript.mod.Node): js.Array[typings.typescript.mod.JSDoc] = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.typescript.mod.JSDoc]]
inline def parseJsDocOfNode(node: typings.typescript.mod.Node, considerTrailingComments: scala.Boolean): js.Array[typings.typescript.mod.JSDoc] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescript.mod.JSDoc]]
inline def parseJsDocOfNode(
  node: typings.typescript.mod.Node,
  considerTrailingComments: scala.Boolean,
  sourceFile: typings.typescript.mod.SourceFile
): js.Array[typings.typescript.mod.JSDoc] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescript.mod.JSDoc]]
inline def parseJsDocOfNode(
  node: typings.typescript.mod.Node,
  considerTrailingComments: scala.Unit,
  sourceFile: typings.typescript.mod.SourceFile
): js.Array[typings.typescript.mod.JSDoc] = (typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJsDocOfNode")(node.asInstanceOf[js.Any], considerTrailingComments.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescript.mod.JSDoc]]

inline def unwrapParentheses(node: typings.typescript.mod.Expression): typings.typescript.mod.Expression = typings.tsutils.utilUtilMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[typings.typescript.mod.Expression]

type BooleanCompilerOptions = js.Any

type ForEachCommentCallback = js.Function2[
/* fullText */ java.lang.String, 
/* comment */ typings.typescript.mod.CommentRange, 
scala.Unit]

type ForEachTokenCallback = js.Function4[
/* fullText */ java.lang.String, 
/* kind */ typings.typescript.mod.SyntaxKind, 
/* range */ typings.typescript.mod.TextRange, 
/* parent */ typings.typescript.mod.Node, 
scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.ImportDeclaration
  - typings.tsutils.anon.ImportEqualsDeclarationmo
  - typings.tsutils.anon.ExportDeclarationmoduleSp
  - typings.tsutils.anon.CallExpressionexpressionT
  - typings.typescript.mod.ImportTypeNode
*/
type ImportLike = typings.tsutils.utilUtilMod._ImportLike | typings.typescript.mod.ImportDeclaration | typings.typescript.mod.ImportTypeNode
