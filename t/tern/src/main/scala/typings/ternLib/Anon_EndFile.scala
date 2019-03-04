package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndFile extends js.Object {
  var end: scala.Double | ternLib.libTernMod.Position
  var file: java.lang.String
  var start: scala.Double | ternLib.libTernMod.Position
  var text: java.lang.String
}

object Anon_EndFile {
  @scala.inline
  def apply(
    end: scala.Double | ternLib.libTernMod.Position,
    file: java.lang.String,
    start: scala.Double | ternLib.libTernMod.Position,
    text: java.lang.String
  ): Anon_EndFile = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file, start = start.asInstanceOf[js.Any], text = text)
  
    __obj.asInstanceOf[Anon_EndFile]
  }
}

