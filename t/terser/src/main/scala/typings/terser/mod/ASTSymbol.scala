package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTSymbol extends ASTNode {
  var name: String = js.native
  var scope: ASTScope = js.native
  var thedef: SymbolDef = js.native
}

