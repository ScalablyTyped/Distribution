package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTImport extends ASTNode {
  var imported_name: Null | ASTSymbolImport = js.native
  var imported_names: js.Array[ASTNameMapping] = js.native
  var module_name: ASTString = js.native
}

