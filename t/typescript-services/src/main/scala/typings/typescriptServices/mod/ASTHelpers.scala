package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IASTSpan
import typings.typescriptServices.TypeScript.IParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ASTHelpers {
  
  @JSImport("typescript-services", "ASTHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def docComments(ast: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Comment] = ^.asInstanceOf[js.Dynamic].applyDynamic("docComments")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Comment]]
  
  inline def enumIsElided(declaration: typings.typescriptServices.TypeScript.EnumDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enumIsElided")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAstAtPosition(script: typings.typescriptServices.TypeScript.AST, pos: Double): typings.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.AST]
  inline def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typings.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], useTrailingTriviaAsLimChar.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.AST]
  inline def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], useTrailingTriviaAsLimChar.asInstanceOf[js.Any], forceInclusive.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.AST]
  inline def getAstAtPosition(
    script: typings.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Unit,
    forceInclusive: Boolean
  ): typings.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], useTrailingTriviaAsLimChar.asInstanceOf[js.Any], forceInclusive.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.AST]
  
  inline def getEnclosingMemberVariableDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.MemberVariableDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingMemberVariableDeclaration")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.MemberVariableDeclaration]
  
  inline def getEnclosingModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingModuleDeclaration")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ModuleDeclaration]
  
  inline def getEnclosingParameterForInitializer(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingParameterForInitializer")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Parameter]
  
  inline def getExtendsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtendsHeritageClause")(clauses.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.HeritageClause]
  
  inline def getImplementsHeritageClause(clauses: typings.typescriptServices.TypeScript.ISyntaxList2): typings.typescriptServices.TypeScript.HeritageClause = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplementsHeritageClause")(clauses.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.HeritageClause]
  
  inline def getModuleDeclarationFromNameAST(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ModuleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleDeclarationFromNameAST")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ModuleDeclaration]
  
  inline def getModuleNames(name: typings.typescriptServices.TypeScript.AST): js.Array[typings.typescriptServices.TypeScript.Identifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleNames")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Identifier]]
  inline def getModuleNames(
    name: typings.typescriptServices.TypeScript.AST,
    result: js.Array[typings.typescriptServices.TypeScript.Identifier]
  ): js.Array[typings.typescriptServices.TypeScript.Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleNames")(name.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.Identifier]]
  
  inline def getNameOfIdenfierOrQualifiedName(name: typings.typescriptServices.TypeScript.AST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfIdenfierOrQualifiedName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParameterList(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.ParameterList = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterList")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.ParameterList]
  
  inline def getType(ast: typings.typescriptServices.TypeScript.AST): typings.typescriptServices.TypeScript.AST = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.AST]
  
  inline def getVariableDeclaratorModifiers(variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclarator): js.Array[typings.typescriptServices.TypeScript.PullElementFlags] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableDeclaratorModifiers")(variableDeclarator.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.typescriptServices.TypeScript.PullElementFlags]]
  
  inline def isCallExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCallExpressionTarget(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpressionTarget")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDeclarationAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclarationAST")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDeclarationASTOrDeclarationNameAST(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclarationASTOrDeclarationNameAST")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegerLiteralAST(expression: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerLiteralAST")(expression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLastNameOfModule(
    ast: typings.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typings.typescriptServices.TypeScript.AST
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLastNameOfModule")(ast.asInstanceOf[js.Any], astName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNameOfFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameOfFunction")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameOfMemberAccessExpression(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameOfMemberAccessExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameOfMemberFunction(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameOfMemberFunction")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRightSideOfQualifiedName(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightSideOfQualifiedName")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidAstNode(ast: IASTSpan): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAstNode")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def moduleIsElided(declaration: typings.typescriptServices.TypeScript.ModuleDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("moduleIsElided")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parametersFromIdentifier(id: typings.typescriptServices.TypeScript.Identifier): IParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parametersFromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[IParameters]
  
  inline def parametersFromParameter(parameter: typings.typescriptServices.TypeScript.Parameter): IParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parametersFromParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[IParameters]
  
  inline def parametersFromParameterList(list: typings.typescriptServices.TypeScript.ParameterList): IParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parametersFromParameterList")(list.asInstanceOf[js.Any]).asInstanceOf[IParameters]
  
  inline def parentIsModuleDeclaration(ast: typings.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parentIsModuleDeclaration")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def scriptIsElided(sourceUnit: typings.typescriptServices.TypeScript.SourceUnit): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("scriptIsElided")(sourceUnit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
