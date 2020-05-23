package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inline extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var `inline`: Boolean
  var lineno: Double
  var str: String
  var suppress: Boolean
}

object Inline {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    `inline`: Boolean,
    lineno: Double,
    str: String,
    suppress: Boolean
  ): Inline = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], suppress = suppress.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
}

