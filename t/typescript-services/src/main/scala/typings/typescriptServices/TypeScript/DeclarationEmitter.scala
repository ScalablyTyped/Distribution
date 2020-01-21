package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DeclarationEmitter")
@js.native
class DeclarationEmitter protected () extends js.Object {
  def this(
    emittingFileName: String,
    document: Document,
    compiler: TypeScriptCompiler,
    emitOptions: EmitOptions,
    semanticInfoChain: SemanticInfoChain
  ) = this()
  var compiler: js.Any = js.native
  var declFile: js.Any = js.native
  var document: Document = js.native
  var emitOptions: js.Any = js.native
  var emittedReferencePaths: js.Any = js.native
  var emittingFileName: js.Any = js.native
  var indenter: js.Any = js.native
  var semanticInfoChain: js.Any = js.native
  /* private */ def canEmitDeclarations(declAST: js.Any): js.Any = js.native
  /* private */ def emitAccessorDeclarationComments(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitArgDecl(argDecl: js.Any, id: js.Any, isOptional: js.Any, isPrivate: js.Any): js.Any = js.native
  /* private */ def emitBaseList(bases: js.Any, useExtendsList: js.Any): js.Any = js.native
  /* private */ def emitCallSignature(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitClassElementModifiers(modifiers: js.Any): js.Any = js.native
  /* private */ def emitClassMembersFromConstructorDefinition(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitComment(comment: js.Any): js.Any = js.native
  /* private */ def emitConstructSignature(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclFlags(declarationAST: js.Any, typeString: js.Any): js.Any = js.native
  /* private */ def emitDeclarationComments(ast: js.Any): js.Any = js.native
  /* private */ def emitDeclarationComments(ast: js.Any, endLine: js.Any): js.Any = js.native
  def emitDeclarations(sourceUnit: SourceUnit): Unit = js.native
  /* private */ def emitDeclarationsForAST(ast: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForClassDeclaration(classDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForConstructorDeclaration(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForEnumDeclaration(moduleDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForExportAssignment(ast: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForFunctionDeclaration(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForGetAccessor(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForImportDeclaration(importDeclAST: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForInterfaceDeclaration(interfaceDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForList(list: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForMemberVariableDeclaration(varDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForModuleDeclaration(moduleDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForSetAccessor(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForSourceUnit(sourceUnit: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForVariableDeclaration(variableDeclaration: js.Any): js.Any = js.native
  /* private */ def emitDeclarationsForVariableStatement(variableStatement: js.Any): js.Any = js.native
  /* private */ def emitHeritageClause(clause: js.Any): js.Any = js.native
  /* private */ def emitHeritageClauses(clauses: js.Any): js.Any = js.native
  /* private */ def emitIndent(): js.Any = js.native
  /* private */ def emitIndexMemberDeclaration(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitIndexSignature(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitMemberAccessorDeclaration(funcDecl: js.Any, modifiers: js.Any, name: js.Any): js.Any = js.native
  /* private */ def emitMemberFunctionDeclaration(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitMethodSignature(funcDecl: js.Any): js.Any = js.native
  /* private */ def emitParameterList(isPrivate: js.Any, parameterList: js.Any): js.Any = js.native
  /* private */ def emitParameters(isPrivate: js.Any, parameterList: js.Any): js.Any = js.native
  /* private */ def emitPropertySignature(varDecl: js.Any): js.Any = js.native
  /* private */ def emitReferencePaths(sourceUnit: js.Any): js.Any = js.native
  /* private */ def emitSeparatedList(list: js.Any): js.Any = js.native
  /* private */ def emitTypeNamesMember(memberName: js.Any): js.Any = js.native
  /* private */ def emitTypeNamesMember(memberName: js.Any, emitIndent: js.Any): js.Any = js.native
  /* private */ def emitTypeOfVariableDeclaratorOrParameter(boundDecl: js.Any): js.Any = js.native
  /* private */ def emitTypeParameters(typeParams: js.Any): js.Any = js.native
  /* private */ def emitTypeParameters(typeParams: js.Any, funcSignature: js.Any): js.Any = js.native
  /* private */ def emitTypeSignature(ast: js.Any, `type`: js.Any): js.Any = js.native
  /* private */ def emitVariableDeclarator(varDecl: js.Any, isFirstVarInList: js.Any, isLastVarInList: js.Any): js.Any = js.native
  /* private */ def getDeclFlagsString(pullDecl: js.Any, typeString: js.Any): js.Any = js.native
  /* private */ def getIndentString(): js.Any = js.native
  /* private */ def getIndentString(declIndent: js.Any): js.Any = js.native
  def getOutputFile(): OutputFile = js.native
  /* private */ def isOverloadedCallSignature(funcDecl: js.Any): js.Any = js.native
  /* private */ def resolveScriptReference(document: js.Any, reference: js.Any): js.Any = js.native
  /* private */ def writeDeclarationComments(declComments: js.Any): js.Any = js.native
  /* private */ def writeDeclarationComments(declComments: js.Any, endLine: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.DeclarationEmitter")
@js.native
object DeclarationEmitter extends js.Object {
  def getEnclosingContainer(ast: AST): AST = js.native
}

