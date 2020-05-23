package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mixin extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var mixin: Boolean
  var name: String
  var `val`: Node
}

object Mixin {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    mixin: Boolean,
    name: String,
    `val`: Node
  ): Mixin = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], mixin = mixin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixin]
  }
}

