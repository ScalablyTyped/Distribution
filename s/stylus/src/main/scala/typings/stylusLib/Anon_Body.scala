package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var __type: java.lang.String
  var body: stylusLib.stylusMod.StylusNs.NodesNs.Block
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var name: java.lang.String
  var params: stylusLib.stylusMod.StylusNs.NodesNs.Params
}

object Anon_Body {
  @scala.inline
  def apply(
    __type: java.lang.String,
    body: stylusLib.stylusMod.StylusNs.NodesNs.Block,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    name: java.lang.String,
    params: stylusLib.stylusMod.StylusNs.NodesNs.Params
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(__type = __type, body = body, column = column, filename = filename, lineno = lineno, name = name, params = params)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

