package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ASTHelpers")
@js.native
object ASTHelpersNs extends js.Object {
  def docComments(ast: typescriptDashServicesLib.TypeScriptNs.AST): js.Array[typescriptDashServicesLib.TypeScriptNs.Comment] = js.native
  def enumIsElided(declaration: typescriptDashServicesLib.TypeScriptNs.EnumDeclaration): scala.Boolean = js.native
  def getAstAtPosition(script: typescriptDashServicesLib.TypeScriptNs.AST, pos: scala.Double): typescriptDashServicesLib.TypeScriptNs.AST = js.native
  def getAstAtPosition(
    script: typescriptDashServicesLib.TypeScriptNs.AST,
    pos: scala.Double,
    useTrailingTriviaAsLimChar: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.AST = js.native
  def getAstAtPosition(
    script: typescriptDashServicesLib.TypeScriptNs.AST,
    pos: scala.Double,
    useTrailingTriviaAsLimChar: scala.Boolean,
    forceInclusive: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.Parameter = js.native
  def getExtendsHeritageClause(clauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList2): typescriptDashServicesLib.TypeScriptNs.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList2): typescriptDashServicesLib.TypeScriptNs.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.ModuleDeclaration = js.native
  def getModuleNames(name: typescriptDashServicesLib.TypeScriptNs.AST): js.Array[typescriptDashServicesLib.TypeScriptNs.Identifier] = js.native
  def getModuleNames(
    name: typescriptDashServicesLib.TypeScriptNs.AST,
    result: js.Array[typescriptDashServicesLib.TypeScriptNs.Identifier]
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typescriptDashServicesLib.TypeScriptNs.AST): java.lang.String = js.native
  def getParameterList(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.ParameterList = js.native
  def getType(ast: typescriptDashServicesLib.TypeScriptNs.AST): typescriptDashServicesLib.TypeScriptNs.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typescriptDashServicesLib.TypeScriptNs.VariableDeclarator): js.Array[typescriptDashServicesLib.TypeScriptNs.PullElementFlags] = js.native
  def isCallExpression(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isCallExpressionTarget(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isDeclarationAST(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isIntegerLiteralAST(expression: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isLastNameOfModule(
    ast: typescriptDashServicesLib.TypeScriptNs.ModuleDeclaration,
    astName: typescriptDashServicesLib.TypeScriptNs.AST
  ): scala.Boolean = js.native
  def isNameOfFunction(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isNameOfMemberFunction(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isRightSideOfQualifiedName(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def isValidAstNode(ast: typescriptDashServicesLib.TypeScriptNs.IASTSpan): scala.Boolean = js.native
  def moduleIsElided(declaration: typescriptDashServicesLib.TypeScriptNs.ModuleDeclaration): scala.Boolean = js.native
  def parametersFromIdentifier(id: typescriptDashServicesLib.TypeScriptNs.Identifier): typescriptDashServicesLib.TypeScriptNs.IParameters = js.native
  def parametersFromParameter(parameter: typescriptDashServicesLib.TypeScriptNs.Parameter): typescriptDashServicesLib.TypeScriptNs.IParameters = js.native
  def parametersFromParameterList(list: typescriptDashServicesLib.TypeScriptNs.ParameterList): typescriptDashServicesLib.TypeScriptNs.IParameters = js.native
  def parentIsModuleDeclaration(ast: typescriptDashServicesLib.TypeScriptNs.AST): scala.Boolean = js.native
  def scriptIsElided(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnit): scala.Boolean = js.native
}

