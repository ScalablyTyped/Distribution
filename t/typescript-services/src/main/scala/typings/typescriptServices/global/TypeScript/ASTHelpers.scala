package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IASTSpan
import typings.typescriptServices.TypeScript.IParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ASTHelpers {
  
  @JSGlobal("TypeScript.ASTHelpers.docComments")
  @js.native
  def docComments(ast: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.enumIsElided")
  @js.native
  def enumIsElided(declaration: typings.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(script: typings.typescriptServices.TypeScript.AST, pos: Double): typings.typescriptServices.TypeScript.AST = js.native
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: js.UndefOr[scala.Nothing],
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  @JSGlobal("TypeScript.ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getEnclosingMemberVariableDeclaration")
  @js.native
  def getEnclosingMemberVariableDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getEnclosingModuleDeclaration")
  @js.native
  def getEnclosingModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getEnclosingParameterForInitializer")
  @js.native
  def getEnclosingParameterForInitializer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.Parameter = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getExtendsHeritageClause")
  @js.native
  def getExtendsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getImplementsHeritageClause")
  @js.native
  def getImplementsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getModuleDeclarationFromNameAST")
  @js.native
  def getModuleDeclarationFromNameAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(name: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Identifier] = js.native
  @JSGlobal("TypeScript.ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(
    name: typings.typescriptServices.TypeScript.AST,
    result: js.Array[typings.typescriptServices.TypeScript.Identifier]
  ): js.Array[typings.typescriptServices.TypeScript.Identifier] = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getNameOfIdenfierOrQualifiedName")
  @js.native
  def getNameOfIdenfierOrQualifiedName(name: typings.typescriptServices.TypeScript.AST): String = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getParameterList")
  @js.native
  def getParameterList(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ParameterList = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getType")
  @js.native
  def getType(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.getVariableDeclaratorModifiers")
  @js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclarator): js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isCallExpression")
  @js.native
  def isCallExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isCallExpressionTarget")
  @js.native
  def isCallExpressionTarget(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isDeclarationAST")
  @js.native
  def isDeclarationAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isDeclarationASTOrDeclarationNameAST")
  @js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isIntegerLiteralAST")
  @js.native
  def isIntegerLiteralAST(expression: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isLastNameOfModule")
  @js.native
  def isLastNameOfModule(
    ast: typings.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typings.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isNameOfFunction")
  @js.native
  def isNameOfFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isNameOfMemberAccessExpression")
  @js.native
  def isNameOfMemberAccessExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isNameOfMemberFunction")
  @js.native
  def isNameOfMemberFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isRightSideOfQualifiedName")
  @js.native
  def isRightSideOfQualifiedName(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.isValidAstNode")
  @js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.moduleIsElided")
  @js.native
  def moduleIsElided(declaration: typings.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parametersFromIdentifier")
  @js.native
  def parametersFromIdentifier(id: typings.typescriptServices.TypeScript.Identifier): IParameters = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parametersFromParameter")
  @js.native
  def parametersFromParameter(parameter: typings.typescriptServices.TypeScript.Parameter): IParameters = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parametersFromParameterList")
  @js.native
  def parametersFromParameterList(list: typings.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.parentIsModuleDeclaration")
  @js.native
  def parentIsModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSGlobal("TypeScript.ASTHelpers.scriptIsElided")
  @js.native
  def scriptIsElided(sourceUnit: typings.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}
