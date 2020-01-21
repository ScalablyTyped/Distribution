package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTLambda extends ASTScope {
  var argnames: js.Array[ArgType] = js.native
  var async: Boolean = js.native
  var is_generator: Boolean = js.native
  var name: ASTSymbolDeclaration | Null = js.native
  var uses_arguments: Boolean = js.native
}

