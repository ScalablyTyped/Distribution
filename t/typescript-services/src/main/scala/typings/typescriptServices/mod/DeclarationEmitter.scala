package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "DeclarationEmitter")
@js.native
class DeclarationEmitter protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.DeclarationEmitter {
  def this(
    emittingFileName: String,
    document: typings.typescriptServices.TypeScript.Document,
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
  
  /* CompleteClass */
  /* private */ override def canEmitDeclarations(declAST: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var compiler: js.Any = js.native
  
  /* CompleteClass */
  var declFile: js.Any = js.native
  
  /* CompleteClass */
  var document: typings.typescriptServices.TypeScript.Document = js.native
  
  /* CompleteClass */
  /* private */ override def emitAccessorDeclarationComments(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitArgDecl(argDecl: js.Any, id: js.Any, isOptional: js.Any, isPrivate: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitBaseList(bases: js.Any, useExtendsList: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitCallSignature(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitClassElementModifiers(modifiers: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitClassMembersFromConstructorDefinition(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitComment(comment: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitConstructSignature(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclFlags(declarationAST: js.Any, typeString: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationComments(ast: js.Any, endLine: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def emitDeclarations(sourceUnit: typings.typescriptServices.TypeScript.SourceUnit): Unit = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForAST(ast: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForClassDeclaration(classDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForConstructorDeclaration(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForEnumDeclaration(moduleDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForExportAssignment(ast: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForFunctionDeclaration(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForGetAccessor(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForImportDeclaration(importDeclAST: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForInterfaceDeclaration(interfaceDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForList(list: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForMemberVariableDeclaration(varDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForModuleDeclaration(moduleDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForSetAccessor(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForSourceUnit(sourceUnit: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForVariableDeclaration(variableDeclaration: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitDeclarationsForVariableStatement(variableStatement: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitHeritageClause(clause: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitHeritageClauses(clauses: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitIndent(): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitIndexMemberDeclaration(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitIndexSignature(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitMemberAccessorDeclaration(funcDecl: js.Any, modifiers: js.Any, name: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitMemberFunctionDeclaration(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitMethodSignature(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var emitOptions: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitParameterList(isPrivate: js.Any, parameterList: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitParameters(isPrivate: js.Any, parameterList: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitPropertySignature(varDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitReferencePaths(sourceUnit: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitSeparatedList(list: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitTypeNamesMember(memberName: js.Any, emitIndent: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitTypeOfVariableDeclaratorOrParameter(boundDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitTypeParameters(typeParams: js.Any, funcSignature: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitTypeSignature(ast: js.Any, `type`: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def emitVariableDeclarator(varDecl: js.Any, isFirstVarInList: js.Any, isLastVarInList: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var emittedReferencePaths: js.Any = js.native
  
  /* CompleteClass */
  var emittingFileName: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getDeclFlagsString(pullDecl: js.Any, typeString: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def getIndentString(declIndent: js.Any): js.Any = js.native
  
  /* CompleteClass */
  override def getOutputFile(): typings.typescriptServices.TypeScript.OutputFile = js.native
  
  /* CompleteClass */
  var indenter: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def isOverloadedCallSignature(funcDecl: js.Any): js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def resolveScriptReference(document: js.Any, reference: js.Any): js.Any = js.native
  
  /* CompleteClass */
  var semanticInfoChain: js.Any = js.native
  
  /* CompleteClass */
  /* private */ override def writeDeclarationComments(declComments: js.Any, endLine: js.Any): js.Any = js.native
}
object DeclarationEmitter {
  
  @JSImport("typescript-services", "DeclarationEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getEnclosingContainer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingContainer")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.AST]
}
