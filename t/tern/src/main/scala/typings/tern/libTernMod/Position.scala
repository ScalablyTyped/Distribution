package typings.tern.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var ch: Double
  var line: Double
}

object Position {
  @scala.inline
  def apply(ch: Double, line: Double): Position = {
    val __obj = js.Dynamic.literal(ch = ch, line = line)
  
    __obj.asInstanceOf[Position]
  }
}

