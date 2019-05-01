package typings
package terserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terserMod {
  type AST_Accessor = AST_Lambda
  type AST_Assign = AST_Binary
  type AST_Atom = AST_Constant
  type AST_BlockStatement = AST_Block
  type AST_Boolean = AST_Atom
  type AST_Break = AST_LoopControl
  type AST_ClassExpression = AST_Class
  type AST_Const = AST_Definitions
  type AST_Constant = AST_Node
  type AST_Continue = AST_LoopControl
  type AST_Debugger = AST_Statement
  type AST_DefClass = AST_Class
  type AST_Default = AST_SwitchBranch
  type AST_DefaultAssign = AST_Binary
  type AST_Do = AST_DWLoop
  type AST_Dot = AST_PropAccess
  type AST_EmptyStatement = AST_Statement
  type AST_False = AST_Boolean
  type AST_Finally = AST_Block
  type AST_Hole = AST_Atom
  type AST_Infinity = AST_Atom
  type AST_Jump = AST_Statement
  type AST_LabelRef = AST_Symbol
  type AST_Let = AST_Definitions
  type AST_NaN = AST_Atom
  type AST_New = AST_Call
  type AST_NewTarget = AST_Node
  type AST_Null = AST_Atom
  type AST_Return = AST_Exit
  type AST_Statement = AST_Node
  type AST_Sub = AST_PropAccess
  type AST_Super = AST_This
  type AST_SwitchBranch = AST_Block
  type AST_SymbolBlockDeclaration = AST_SymbolDeclaration
  type AST_SymbolCatch = AST_SymbolBlockDeclaration
  type AST_SymbolClass = AST_SymbolDeclaration
  type AST_SymbolConst = AST_SymbolBlockDeclaration
  type AST_SymbolDefClass = AST_SymbolBlockDeclaration
  type AST_SymbolDefun = AST_SymbolDeclaration
  type AST_SymbolExport = AST_SymbolRef
  type AST_SymbolExportForeign = AST_Symbol
  type AST_SymbolFunarg = AST_SymbolVar
  type AST_SymbolImport = AST_SymbolBlockDeclaration
  type AST_SymbolImportForeign = AST_Symbol
  type AST_SymbolLambda = AST_SymbolDeclaration
  type AST_SymbolLet = AST_SymbolBlockDeclaration
  type AST_SymbolMethod = AST_Symbol
  type AST_SymbolRef = AST_Symbol
  type AST_SymbolVar = AST_SymbolDeclaration
  type AST_This = AST_Symbol
  type AST_Throw = AST_Exit
  type AST_True = AST_Boolean
  type AST_UnaryPostfix = AST_Unary
  type AST_UnaryPrefix = AST_Unary
  type AST_Undefined = AST_Atom
  type AST_Var = AST_Definitions
  type AST_While = AST_DWLoop
  /* Rewritten from type alias, can be one of: 
    - AST_SymbolFunarg
    - AST_DefaultAssign
    - AST_Destructuring
    - AST_Expansion
  */
  type ArgType = _ArgType | AST_SymbolFunarg | AST_DefaultAssign
  type DictEachCallback = js.Function2[/* val */ js.Any, /* key */ java.lang.String, js.Any]
}
