package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var __type: String
  var args: Expression
  var column: Double
  var filename: String
  var lineno: Double
  var name: String
}

object Anon_Args {
  @scala.inline
  def apply(__type: String, args: Expression, column: Double, filename: String, lineno: Double, name: String): Anon_Args = {
    val __obj = js.Dynamic.literal(__type = __type, args = args, column = column, filename = filename, lineno = lineno, name = name)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

