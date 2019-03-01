package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var __type: java.lang.String
  var args: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var name: java.lang.String
}

object Anon_Args {
  @scala.inline
  def apply(
    __type: java.lang.String,
    args: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    name: java.lang.String
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Args]
  }
}

