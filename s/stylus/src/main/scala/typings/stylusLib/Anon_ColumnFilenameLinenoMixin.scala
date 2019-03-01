package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoMixin extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var mixin: scala.Boolean
  var name: java.lang.String
  var `val`: stylusLib.stylusMod.StylusNs.NodesNs.Node
}

object Anon_ColumnFilenameLinenoMixin {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    mixin: scala.Boolean,
    name: java.lang.String,
    `val`: stylusLib.stylusMod.StylusNs.NodesNs.Node
  ): Anon_ColumnFilenameLinenoMixin = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("mixin")(mixin)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoMixin]
  }
}

