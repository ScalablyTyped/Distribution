package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IASTSpan
import typings.typescriptServices.TypeScript.IParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ASTHelpers {
  
  @JSImport("typescript-services", "ASTHelpers.docComments")
  @js.native
  def docComments(ast: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  
  @JSImport("typescript-services", "ASTHelpers.enumIsElided")
  @js.native
  def enumIsElided(declaration: typings.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(script: typings.typescriptServices.TypeScript.AST, pos: Double): typings.typescriptServices.TypeScript.AST = js.native
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: js.UndefOr[scala.Nothing],
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  @JSImport("typescript-services", "ASTHelpers.getAstAtPosition")
  @js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getEnclosingMemberVariableDeclaration")
  @js.native
  def getEnclosingMemberVariableDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getEnclosingModuleDeclaration")
  @js.native
  def getEnclosingModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getEnclosingParameterForInitializer")
  @js.native
  def getEnclosingParameterForInitializer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.Parameter = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getExtendsHeritageClause")
  @js.native
  def getExtendsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getImplementsHeritageClause")
  @js.native
  def getImplementsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getModuleDeclarationFromNameAST")
  @js.native
  def getModuleDeclarationFromNameAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(name: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Identifier] = js.native
  @JSImport("typescript-services", "ASTHelpers.getModuleNames")
  @js.native
  def getModuleNames(
    name: typings.typescriptServices.TypeScript.AST,
    result: js.Array[typings.typescriptServices.TypeScript.Identifier]
  ): js.Array[typings.typescriptServices.TypeScript.Identifier] = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getNameOfIdenfierOrQualifiedName")
  @js.native
  def getNameOfIdenfierOrQualifiedName(name: typings.typescriptServices.TypeScript.AST): String = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getParameterList")
  @js.native
  def getParameterList(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ParameterList = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getType")
  @js.native
  def getType(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = js.native
  
  @JSImport("typescript-services", "ASTHelpers.getVariableDeclaratorModifiers")
  @js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclarator): js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isCallExpression")
  @js.native
  def isCallExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isCallExpressionTarget")
  @js.native
  def isCallExpressionTarget(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isDeclarationAST")
  @js.native
  def isDeclarationAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isDeclarationASTOrDeclarationNameAST")
  @js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isIntegerLiteralAST")
  @js.native
  def isIntegerLiteralAST(expression: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isLastNameOfModule")
  @js.native
  def isLastNameOfModule(
    ast: typings.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typings.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isNameOfFunction")
  @js.native
  def isNameOfFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isNameOfMemberAccessExpression")
  @js.native
  def isNameOfMemberAccessExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isNameOfMemberFunction")
  @js.native
  def isNameOfMemberFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isRightSideOfQualifiedName")
  @js.native
  def isRightSideOfQualifiedName(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.isValidAstNode")
  @js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.moduleIsElided")
  @js.native
  def moduleIsElided(declaration: typings.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parametersFromIdentifier")
  @js.native
  def parametersFromIdentifier(id: typings.typescriptServices.TypeScript.Identifier): IParameters = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parametersFromParameter")
  @js.native
  def parametersFromParameter(parameter: typings.typescriptServices.TypeScript.Parameter): IParameters = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parametersFromParameterList")
  @js.native
  def parametersFromParameterList(list: typings.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  
  @JSImport("typescript-services", "ASTHelpers.parentIsModuleDeclaration")
  @js.native
  def parentIsModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  
  @JSImport("typescript-services", "ASTHelpers.scriptIsElided")
  @js.native
  def scriptIsElided(sourceUnit: typings.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}
