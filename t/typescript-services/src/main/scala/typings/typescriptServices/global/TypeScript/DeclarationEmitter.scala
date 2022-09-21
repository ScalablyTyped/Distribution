package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.DeclarationEmitter")
@js.native
open class DeclarationEmitter protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.DeclarationEmitter {
  def this(
    emittingFileName: String,
    document: typings.typescriptServices.TypeScript.Document,
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
  
  /* private */ /* CompleteClass */
  override def canEmitDeclarations(declAST: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var compiler: Any = js.native
  
  /* private */ /* CompleteClass */
  var declFile: Any = js.native
  
  /* CompleteClass */
  var document: typings.typescriptServices.TypeScript.Document = js.native
  
  /* private */ /* CompleteClass */
  override def emitAccessorDeclarationComments(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitArgDecl(argDecl: Any, id: Any, isOptional: Any, isPrivate: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitBaseList(bases: Any, useExtendsList: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitCallSignature(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitClassElementModifiers(modifiers: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitClassMembersFromConstructorDefinition(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitComment(comment: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitConstructSignature(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclFlags(declarationAST: Any, typeString: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationComments(ast: Any, endLine: Any): Any = js.native
  
  /* CompleteClass */
  override def emitDeclarations(sourceUnit: typings.typescriptServices.TypeScript.SourceUnit): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForAST(ast: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForClassDeclaration(classDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForConstructorDeclaration(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForEnumDeclaration(moduleDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForExportAssignment(ast: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForFunctionDeclaration(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForGetAccessor(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForImportDeclaration(importDeclAST: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForInterfaceDeclaration(interfaceDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForList(list: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForMemberVariableDeclaration(varDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForModuleDeclaration(moduleDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForSetAccessor(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForSourceUnit(sourceUnit: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForVariableDeclaration(variableDeclaration: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitDeclarationsForVariableStatement(variableStatement: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitHeritageClause(clause: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitHeritageClauses(clauses: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitIndent(): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitIndexMemberDeclaration(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitIndexSignature(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitMemberAccessorDeclaration(funcDecl: Any, modifiers: Any, name: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitMemberFunctionDeclaration(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitMethodSignature(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var emitOptions: Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitParameterList(isPrivate: Any, parameterList: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitParameters(isPrivate: Any, parameterList: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitPropertySignature(varDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitReferencePaths(sourceUnit: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitSeparatedList(list: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitTypeNamesMember(memberName: Any, emitIndent: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitTypeOfVariableDeclaratorOrParameter(boundDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitTypeParameters(typeParams: Any, funcSignature: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitTypeSignature(ast: Any, `type`: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def emitVariableDeclarator(varDecl: Any, isFirstVarInList: Any, isLastVarInList: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var emittedReferencePaths: Any = js.native
  
  /* private */ /* CompleteClass */
  var emittingFileName: Any = js.native
  
  /* private */ /* CompleteClass */
  override def getDeclFlagsString(pullDecl: Any, typeString: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getIndentString(declIndent: Any): Any = js.native
  
  /* CompleteClass */
  override def getOutputFile(): typings.typescriptServices.TypeScript.OutputFile = js.native
  
  /* private */ /* CompleteClass */
  var indenter: Any = js.native
  
  /* private */ /* CompleteClass */
  override def isOverloadedCallSignature(funcDecl: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def resolveScriptReference(document: Any, reference: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var semanticInfoChain: Any = js.native
  
  /* private */ /* CompleteClass */
  override def writeDeclarationComments(declComments: Any, endLine: Any): Any = js.native
}
object DeclarationEmitter {
  
  @JSGlobal("TypeScript.DeclarationEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getEnclosingContainer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingContainer")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.AST]
}
