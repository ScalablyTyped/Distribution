package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoMixin extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var mixin: Boolean
  var name: String
  var `val`: Node
}

object Anon_ColumnFilenameLinenoMixin {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    mixin: Boolean,
    name: String,
    `val`: Node
  ): Anon_ColumnFilenameLinenoMixin = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, mixin = mixin, name = name)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoMixin]
  }
}

