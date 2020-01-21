package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTNameMapping extends ASTNode {
  var foreign_name: ASTSymbol = js.native
  var name: ASTSymbolExport | ASTSymbolImport = js.native
}

