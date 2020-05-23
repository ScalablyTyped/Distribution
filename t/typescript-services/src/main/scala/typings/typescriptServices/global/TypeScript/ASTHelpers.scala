package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IASTSpan
import typings.typescriptServices.TypeScript.IParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ASTHelpers")
@js.native
object ASTHelpers extends js.Object {
  def docComments(ast: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Comment] = js.native
  def enumIsElided(declaration: typings.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: typings.typescriptServices.TypeScript.AST, pos: Double): typings.typescriptServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.Parameter = js.native
  def getExtendsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = js.native
  def getModuleNames(name: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Identifier] = js.native
  def getModuleNames(
    name: typings.typescriptServices.TypeScript.AST,
    result: js.Array[typings.typescriptServices.TypeScript.Identifier]
  ): js.Array[typings.typescriptServices.TypeScript.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typings.typescriptServices.TypeScript.AST): String = js.native
  def getParameterList(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ParameterList = js.native
  def getType(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclarator): js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = js.native
  def isCallExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isCallExpressionTarget(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isDeclarationAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isIntegerLiteralAST(expression: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isLastNameOfModule(
    ast: typings.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typings.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  def isNameOfFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: typings.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: typings.typescriptServices.TypeScript.Identifier): IParameters = js.native
  def parametersFromParameter(parameter: typings.typescriptServices.TypeScript.Parameter): IParameters = js.native
  def parametersFromParameterList(list: typings.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): Boolean = js.native
  def scriptIsElided(sourceUnit: typings.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}

