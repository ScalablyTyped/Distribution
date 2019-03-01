package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: scala.Double | ternLib.libTernMod.Position
  var file: java.lang.String
  var start: scala.Double | ternLib.libTernMod.Position
}

object Anon_End {
  @scala.inline
  def apply(
    end: scala.Double | ternLib.libTernMod.Position,
    file: java.lang.String,
    start: scala.Double | ternLib.libTernMod.Position
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

