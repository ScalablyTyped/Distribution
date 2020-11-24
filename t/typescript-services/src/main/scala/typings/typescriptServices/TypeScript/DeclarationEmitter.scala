package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationEmitter extends js.Object {
  
  /* private */ def canEmitDeclarations(declAST: js.Any): js.Any = js.native
  
  var compiler: js.Any = js.native
  
  var declFile: js.Any = js.native
  
  var document: Document = js.native
  
  /* private */ def emitAccessorDeclarationComments(funcDecl: js.Any): js.Any = js.native
  
  /* private */ def emitArgDecl(argDecl: js.Any, id: js.Any, isOptional: js.Any, isPrivate: js.Any): js.Any = js.native
  
  /* private */ def emitBaseList(bases: js.Any, useExtendsList: js.Any): js.Any = js.native
  
  /* private */ def emitCallSignature(funcDecl: js.Any): js.Any = js.native
  
  /* private */ def emitClassElementModifiers(modifiers: js.Any): js.Any = js.native
  
  /* private */ def emitClassMembersFromConstructorDefinition(funcDecl: js.Any): js.Any = js.native
  
  /* private */ def emitComment(comment: js.Any): js.Any = js.native
  
  /* private */ def emitConstructSignature(funcDecl: js.Any): js.Any = js.native
  
  /* private */ def emitDeclFlags(declarationAST: js.Any, typeString: js.Any): js.Any = js.native
  
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
  
  var emitOptions: js.Any = js.native
  
  /* private */ def emitParameterList(isPrivate: js.Any, parameterList: js.Any): js.Any = js.native
  
  /* private */ def emitParameters(isPrivate: js.Any, parameterList: js.Any): js.Any = js.native
  
  /* private */ def emitPropertySignature(varDecl: js.Any): js.Any = js.native
  
  /* private */ def emitReferencePaths(sourceUnit: js.Any): js.Any = js.native
  
  /* private */ def emitSeparatedList(list: js.Any): js.Any = js.native
  
  /* private */ def emitTypeNamesMember(memberName: js.Any, emitIndent: js.Any): js.Any = js.native
  
  /* private */ def emitTypeOfVariableDeclaratorOrParameter(boundDecl: js.Any): js.Any = js.native
  
  /* private */ def emitTypeParameters(typeParams: js.Any, funcSignature: js.Any): js.Any = js.native
  
  /* private */ def emitTypeSignature(ast: js.Any, `type`: js.Any): js.Any = js.native
  
  /* private */ def emitVariableDeclarator(varDecl: js.Any, isFirstVarInList: js.Any, isLastVarInList: js.Any): js.Any = js.native
  
  var emittedReferencePaths: js.Any = js.native
  
  var emittingFileName: js.Any = js.native
  
  /* private */ def getDeclFlagsString(pullDecl: js.Any, typeString: js.Any): js.Any = js.native
  
  /* private */ def getIndentString(declIndent: js.Any): js.Any = js.native
  
  def getOutputFile(): OutputFile = js.native
  
  var indenter: js.Any = js.native
  
  /* private */ def isOverloadedCallSignature(funcDecl: js.Any): js.Any = js.native
  
  /* private */ def resolveScriptReference(document: js.Any, reference: js.Any): js.Any = js.native
  
  var semanticInfoChain: js.Any = js.native
  
  /* private */ def writeDeclarationComments(declComments: js.Any, endLine: js.Any): js.Any = js.native
}
object DeclarationEmitter {
  
  @scala.inline
  def apply(
    canEmitDeclarations: js.Any => js.Any,
    compiler: js.Any,
    declFile: js.Any,
    document: Document,
    emitAccessorDeclarationComments: js.Any => js.Any,
    emitArgDecl: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    emitBaseList: (js.Any, js.Any) => js.Any,
    emitCallSignature: js.Any => js.Any,
    emitClassElementModifiers: js.Any => js.Any,
    emitClassMembersFromConstructorDefinition: js.Any => js.Any,
    emitComment: js.Any => js.Any,
    emitConstructSignature: js.Any => js.Any,
    emitDeclFlags: (js.Any, js.Any) => js.Any,
    emitDeclarationComments: (js.Any, js.Any) => js.Any,
    emitDeclarations: SourceUnit => Unit,
    emitDeclarationsForAST: js.Any => js.Any,
    emitDeclarationsForClassDeclaration: js.Any => js.Any,
    emitDeclarationsForConstructorDeclaration: js.Any => js.Any,
    emitDeclarationsForEnumDeclaration: js.Any => js.Any,
    emitDeclarationsForExportAssignment: js.Any => js.Any,
    emitDeclarationsForFunctionDeclaration: js.Any => js.Any,
    emitDeclarationsForGetAccessor: js.Any => js.Any,
    emitDeclarationsForImportDeclaration: js.Any => js.Any,
    emitDeclarationsForInterfaceDeclaration: js.Any => js.Any,
    emitDeclarationsForList: js.Any => js.Any,
    emitDeclarationsForMemberVariableDeclaration: js.Any => js.Any,
    emitDeclarationsForModuleDeclaration: js.Any => js.Any,
    emitDeclarationsForSetAccessor: js.Any => js.Any,
    emitDeclarationsForSourceUnit: js.Any => js.Any,
    emitDeclarationsForVariableDeclaration: js.Any => js.Any,
    emitDeclarationsForVariableStatement: js.Any => js.Any,
    emitHeritageClause: js.Any => js.Any,
    emitHeritageClauses: js.Any => js.Any,
    emitIndent: () => js.Any,
    emitIndexMemberDeclaration: js.Any => js.Any,
    emitIndexSignature: js.Any => js.Any,
    emitMemberAccessorDeclaration: (js.Any, js.Any, js.Any) => js.Any,
    emitMemberFunctionDeclaration: js.Any => js.Any,
    emitMethodSignature: js.Any => js.Any,
    emitOptions: js.Any,
    emitParameterList: (js.Any, js.Any) => js.Any,
    emitParameters: (js.Any, js.Any) => js.Any,
    emitPropertySignature: js.Any => js.Any,
    emitReferencePaths: js.Any => js.Any,
    emitSeparatedList: js.Any => js.Any,
    emitTypeNamesMember: (js.Any, js.Any) => js.Any,
    emitTypeOfVariableDeclaratorOrParameter: js.Any => js.Any,
    emitTypeParameters: (js.Any, js.Any) => js.Any,
    emitTypeSignature: (js.Any, js.Any) => js.Any,
    emitVariableDeclarator: (js.Any, js.Any, js.Any) => js.Any,
    emittedReferencePaths: js.Any,
    emittingFileName: js.Any,
    getDeclFlagsString: (js.Any, js.Any) => js.Any,
    getIndentString: js.Any => js.Any,
    getOutputFile: () => OutputFile,
    indenter: js.Any,
    isOverloadedCallSignature: js.Any => js.Any,
    resolveScriptReference: (js.Any, js.Any) => js.Any,
    semanticInfoChain: js.Any,
    writeDeclarationComments: (js.Any, js.Any) => js.Any
  ): DeclarationEmitter = {
    val __obj = js.Dynamic.literal(canEmitDeclarations = js.Any.fromFunction1(canEmitDeclarations), compiler = compiler.asInstanceOf[js.Any], declFile = declFile.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], emitAccessorDeclarationComments = js.Any.fromFunction1(emitAccessorDeclarationComments), emitArgDecl = js.Any.fromFunction4(emitArgDecl), emitBaseList = js.Any.fromFunction2(emitBaseList), emitCallSignature = js.Any.fromFunction1(emitCallSignature), emitClassElementModifiers = js.Any.fromFunction1(emitClassElementModifiers), emitClassMembersFromConstructorDefinition = js.Any.fromFunction1(emitClassMembersFromConstructorDefinition), emitComment = js.Any.fromFunction1(emitComment), emitConstructSignature = js.Any.fromFunction1(emitConstructSignature), emitDeclFlags = js.Any.fromFunction2(emitDeclFlags), emitDeclarationComments = js.Any.fromFunction2(emitDeclarationComments), emitDeclarations = js.Any.fromFunction1(emitDeclarations), emitDeclarationsForAST = js.Any.fromFunction1(emitDeclarationsForAST), emitDeclarationsForClassDeclaration = js.Any.fromFunction1(emitDeclarationsForClassDeclaration), emitDeclarationsForConstructorDeclaration = js.Any.fromFunction1(emitDeclarationsForConstructorDeclaration), emitDeclarationsForEnumDeclaration = js.Any.fromFunction1(emitDeclarationsForEnumDeclaration), emitDeclarationsForExportAssignment = js.Any.fromFunction1(emitDeclarationsForExportAssignment), emitDeclarationsForFunctionDeclaration = js.Any.fromFunction1(emitDeclarationsForFunctionDeclaration), emitDeclarationsForGetAccessor = js.Any.fromFunction1(emitDeclarationsForGetAccessor), emitDeclarationsForImportDeclaration = js.Any.fromFunction1(emitDeclarationsForImportDeclaration), emitDeclarationsForInterfaceDeclaration = js.Any.fromFunction1(emitDeclarationsForInterfaceDeclaration), emitDeclarationsForList = js.Any.fromFunction1(emitDeclarationsForList), emitDeclarationsForMemberVariableDeclaration = js.Any.fromFunction1(emitDeclarationsForMemberVariableDeclaration), emitDeclarationsForModuleDeclaration = js.Any.fromFunction1(emitDeclarationsForModuleDeclaration), emitDeclarationsForSetAccessor = js.Any.fromFunction1(emitDeclarationsForSetAccessor), emitDeclarationsForSourceUnit = js.Any.fromFunction1(emitDeclarationsForSourceUnit), emitDeclarationsForVariableDeclaration = js.Any.fromFunction1(emitDeclarationsForVariableDeclaration), emitDeclarationsForVariableStatement = js.Any.fromFunction1(emitDeclarationsForVariableStatement), emitHeritageClause = js.Any.fromFunction1(emitHeritageClause), emitHeritageClauses = js.Any.fromFunction1(emitHeritageClauses), emitIndent = js.Any.fromFunction0(emitIndent), emitIndexMemberDeclaration = js.Any.fromFunction1(emitIndexMemberDeclaration), emitIndexSignature = js.Any.fromFunction1(emitIndexSignature), emitMemberAccessorDeclaration = js.Any.fromFunction3(emitMemberAccessorDeclaration), emitMemberFunctionDeclaration = js.Any.fromFunction1(emitMemberFunctionDeclaration), emitMethodSignature = js.Any.fromFunction1(emitMethodSignature), emitOptions = emitOptions.asInstanceOf[js.Any], emitParameterList = js.Any.fromFunction2(emitParameterList), emitParameters = js.Any.fromFunction2(emitParameters), emitPropertySignature = js.Any.fromFunction1(emitPropertySignature), emitReferencePaths = js.Any.fromFunction1(emitReferencePaths), emitSeparatedList = js.Any.fromFunction1(emitSeparatedList), emitTypeNamesMember = js.Any.fromFunction2(emitTypeNamesMember), emitTypeOfVariableDeclaratorOrParameter = js.Any.fromFunction1(emitTypeOfVariableDeclaratorOrParameter), emitTypeParameters = js.Any.fromFunction2(emitTypeParameters), emitTypeSignature = js.Any.fromFunction2(emitTypeSignature), emitVariableDeclarator = js.Any.fromFunction3(emitVariableDeclarator), emittedReferencePaths = emittedReferencePaths.asInstanceOf[js.Any], emittingFileName = emittingFileName.asInstanceOf[js.Any], getDeclFlagsString = js.Any.fromFunction2(getDeclFlagsString), getIndentString = js.Any.fromFunction1(getIndentString), getOutputFile = js.Any.fromFunction0(getOutputFile), indenter = indenter.asInstanceOf[js.Any], isOverloadedCallSignature = js.Any.fromFunction1(isOverloadedCallSignature), resolveScriptReference = js.Any.fromFunction2(resolveScriptReference), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], writeDeclarationComments = js.Any.fromFunction2(writeDeclarationComments))
    __obj.asInstanceOf[DeclarationEmitter]
  }
  
  @scala.inline
  implicit class DeclarationEmitterOps[Self <: DeclarationEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanEmitDeclarations(value: js.Any => js.Any): Self = this.set("canEmitDeclarations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompiler(value: js.Any): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclFile(value: js.Any): Self = this.set("declFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitAccessorDeclarationComments(value: js.Any => js.Any): Self = this.set("emitAccessorDeclarationComments", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitArgDecl(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("emitArgDecl", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEmitBaseList(value: (js.Any, js.Any) => js.Any): Self = this.set("emitBaseList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitCallSignature(value: js.Any => js.Any): Self = this.set("emitCallSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitClassElementModifiers(value: js.Any => js.Any): Self = this.set("emitClassElementModifiers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitClassMembersFromConstructorDefinition(value: js.Any => js.Any): Self = this.set("emitClassMembersFromConstructorDefinition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitComment(value: js.Any => js.Any): Self = this.set("emitComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitConstructSignature(value: js.Any => js.Any): Self = this.set("emitConstructSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclFlags(value: (js.Any, js.Any) => js.Any): Self = this.set("emitDeclFlags", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitDeclarationComments(value: (js.Any, js.Any) => js.Any): Self = this.set("emitDeclarationComments", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitDeclarations(value: SourceUnit => Unit): Self = this.set("emitDeclarations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForAST(value: js.Any => js.Any): Self = this.set("emitDeclarationsForAST", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForClassDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForClassDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForConstructorDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForConstructorDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForEnumDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForEnumDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForExportAssignment(value: js.Any => js.Any): Self = this.set("emitDeclarationsForExportAssignment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForFunctionDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForFunctionDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForGetAccessor(value: js.Any => js.Any): Self = this.set("emitDeclarationsForGetAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForImportDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForImportDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForInterfaceDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForInterfaceDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForList(value: js.Any => js.Any): Self = this.set("emitDeclarationsForList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForMemberVariableDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForMemberVariableDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForModuleDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForModuleDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForSetAccessor(value: js.Any => js.Any): Self = this.set("emitDeclarationsForSetAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForSourceUnit(value: js.Any => js.Any): Self = this.set("emitDeclarationsForSourceUnit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForVariableDeclaration(value: js.Any => js.Any): Self = this.set("emitDeclarationsForVariableDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitDeclarationsForVariableStatement(value: js.Any => js.Any): Self = this.set("emitDeclarationsForVariableStatement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitHeritageClause(value: js.Any => js.Any): Self = this.set("emitHeritageClause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitHeritageClauses(value: js.Any => js.Any): Self = this.set("emitHeritageClauses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitIndent(value: () => js.Any): Self = this.set("emitIndent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmitIndexMemberDeclaration(value: js.Any => js.Any): Self = this.set("emitIndexMemberDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitIndexSignature(value: js.Any => js.Any): Self = this.set("emitIndexSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitMemberAccessorDeclaration(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("emitMemberAccessorDeclaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEmitMemberFunctionDeclaration(value: js.Any => js.Any): Self = this.set("emitMemberFunctionDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitMethodSignature(value: js.Any => js.Any): Self = this.set("emitMethodSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitOptions(value: js.Any): Self = this.set("emitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitParameterList(value: (js.Any, js.Any) => js.Any): Self = this.set("emitParameterList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitParameters(value: (js.Any, js.Any) => js.Any): Self = this.set("emitParameters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitPropertySignature(value: js.Any => js.Any): Self = this.set("emitPropertySignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitReferencePaths(value: js.Any => js.Any): Self = this.set("emitReferencePaths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitSeparatedList(value: js.Any => js.Any): Self = this.set("emitSeparatedList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitTypeNamesMember(value: (js.Any, js.Any) => js.Any): Self = this.set("emitTypeNamesMember", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitTypeOfVariableDeclaratorOrParameter(value: js.Any => js.Any): Self = this.set("emitTypeOfVariableDeclaratorOrParameter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmitTypeParameters(value: (js.Any, js.Any) => js.Any): Self = this.set("emitTypeParameters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitTypeSignature(value: (js.Any, js.Any) => js.Any): Self = this.set("emitTypeSignature", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmitVariableDeclarator(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("emitVariableDeclarator", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEmittedReferencePaths(value: js.Any): Self = this.set("emittedReferencePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittingFileName(value: js.Any): Self = this.set("emittingFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeclFlagsString(value: (js.Any, js.Any) => js.Any): Self = this.set("getDeclFlagsString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIndentString(value: js.Any => js.Any): Self = this.set("getIndentString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOutputFile(value: () => OutputFile): Self = this.set("getOutputFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndenter(value: js.Any): Self = this.set("indenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOverloadedCallSignature(value: js.Any => js.Any): Self = this.set("isOverloadedCallSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveScriptReference(value: (js.Any, js.Any) => js.Any): Self = this.set("resolveScriptReference", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSemanticInfoChain(value: js.Any): Self = this.set("semanticInfoChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteDeclarationComments(value: (js.Any, js.Any) => js.Any): Self = this.set("writeDeclarationComments", js.Any.fromFunction2(value))
  }
}
