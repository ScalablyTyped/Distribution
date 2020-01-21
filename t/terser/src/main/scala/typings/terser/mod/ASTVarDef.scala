package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTVarDef extends ASTNode {
  var name: ASTDestructuring | ASTSymbolConst | ASTSymbolLet | ASTSymbolVar = js.native
  var value: ASTNode | Null = js.native
}

