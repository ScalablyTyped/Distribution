package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithRange extends js.Object {
  var end: Double
  var msg: String
  var start: Double
}

object ErrorWithRange {
  @scala.inline
  def apply(end: Double, msg: String, start: Double): ErrorWithRange = {
    val __obj = js.Dynamic.literal(end = end, msg = msg, start = start)
  
    __obj.asInstanceOf[ErrorWithRange]
  }
}

