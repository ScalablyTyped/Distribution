package typings.terser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASTAccessor = typings.terser.mod.ASTLambda
  type ASTArrow = typings.terser.mod.ASTLambda
  type ASTAssign = typings.terser.mod.ASTBinary
  type ASTAtom = typings.terser.mod.ASTConstant
  type ASTBlockStatement = typings.terser.mod.ASTBlock
  type ASTBoolean = typings.terser.mod.ASTAtom
  type ASTBreak = typings.terser.mod.ASTLoopControl
  type ASTClassExpression = typings.terser.mod.ASTClass
  type ASTConst = typings.terser.mod.ASTDefinitions
  type ASTConstant = typings.terser.mod.ASTNode
  type ASTContinue = typings.terser.mod.ASTLoopControl
  type ASTDebugger = typings.terser.mod.ASTStatement
  type ASTDefClass = typings.terser.mod.ASTClass
  type ASTDefault = typings.terser.mod.ASTSwitchBranch
  type ASTDefaultAssign = typings.terser.mod.ASTBinary
  type ASTDefun = typings.terser.mod.ASTLambda
  type ASTDo = typings.terser.mod.ASTDWLoop
  type ASTDot = typings.terser.mod.ASTPropAccess
  type ASTEmptyStatement = typings.terser.mod.ASTStatement
  type ASTFalse = typings.terser.mod.ASTBoolean
  type ASTFinally = typings.terser.mod.ASTBlock
  type ASTFunction = typings.terser.mod.ASTLambda
  type ASTHole = typings.terser.mod.ASTAtom
  type ASTInfinity = typings.terser.mod.ASTAtom
  type ASTJump = typings.terser.mod.ASTStatement
  type ASTLabelRef = typings.terser.mod.ASTSymbol
  type ASTLet = typings.terser.mod.ASTDefinitions
  type ASTNaN = typings.terser.mod.ASTAtom
  type ASTNew = typings.terser.mod.ASTCall
  type ASTNewTarget = typings.terser.mod.ASTNode
  type ASTNull = typings.terser.mod.ASTAtom
  type ASTReturn = typings.terser.mod.ASTExit
  type ASTStatement = typings.terser.mod.ASTNode
  type ASTSub = typings.terser.mod.ASTPropAccess
  type ASTSuper = typings.terser.mod.ASTThis
  type ASTSwitchBranch = typings.terser.mod.ASTBlock
  type ASTSymbolBlockDeclaration = typings.terser.mod.ASTSymbolDeclaration
  type ASTSymbolCatch = typings.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolClass = typings.terser.mod.ASTSymbolDeclaration
  type ASTSymbolConst = typings.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolDefClass = typings.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolDefun = typings.terser.mod.ASTSymbolDeclaration
  type ASTSymbolExport = typings.terser.mod.ASTSymbolRef
  type ASTSymbolExportForeign = typings.terser.mod.ASTSymbol
  type ASTSymbolFunarg = typings.terser.mod.ASTSymbolVar
  type ASTSymbolImport = typings.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolImportForeign = typings.terser.mod.ASTSymbol
  type ASTSymbolLambda = typings.terser.mod.ASTSymbolDeclaration
  type ASTSymbolLet = typings.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolMethod = typings.terser.mod.ASTSymbol
  type ASTSymbolRef = typings.terser.mod.ASTSymbol
  type ASTSymbolVar = typings.terser.mod.ASTSymbolDeclaration
  type ASTThis = typings.terser.mod.ASTSymbol
  type ASTThrow = typings.terser.mod.ASTExit
  type ASTTrue = typings.terser.mod.ASTBoolean
  type ASTUnaryPostfix = typings.terser.mod.ASTUnary
  type ASTUnaryPrefix = typings.terser.mod.ASTUnary
  type ASTUndefined = typings.terser.mod.ASTAtom
  type ASTVar = typings.terser.mod.ASTDefinitions
  type ASTWhile = typings.terser.mod.ASTDWLoop
  /* Rewritten from type alias, can be one of: 
    - typings.terser.mod.ASTSymbolFunarg
    - typings.terser.mod.ASTDefaultAssign
    - typings.terser.mod.ASTDestructuring
    - typings.terser.mod.ASTExpansion
  */
  type ArgType = typings.terser.mod._ArgType | typings.terser.mod.ASTSymbolFunarg | typings.terser.mod.ASTDefaultAssign
}
