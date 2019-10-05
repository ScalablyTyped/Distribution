package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Block
import typings.stylus.stylusMod.Stylus.Nodes.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var __type: String
  var body: Block
  var column: Double
  var filename: String
  var lineno: Double
  var name: String
  var params: Params
}

object Anon_Body {
  @scala.inline
  def apply(
    __type: String,
    body: Block,
    column: Double,
    filename: String,
    lineno: Double,
    name: String,
    params: Params
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(__type = __type, body = body, column = column, filename = filename, lineno = lineno, name = name, params = params)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

