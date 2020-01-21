package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTClass extends ASTScope {
  var `extends`: ASTNode | Null = js.native
  var name: ASTSymbolClass | ASTSymbolDefClass | Null = js.native
  var properties: js.Array[ASTObjectProperty] = js.native
}

