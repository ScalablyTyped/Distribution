package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Line extends js.Object {
  var line: scala.Double
  var `type`: java.lang.String
}

object Anon_Line {
  @scala.inline
  def apply(line: scala.Double, `type`: java.lang.String): Anon_Line = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[Anon_Line]
  }
}

