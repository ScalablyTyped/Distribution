package typings.tern

import typings.tern.ternMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: Double | Position
  var file: String
  var start: Double | Position
}

object AnonEnd {
  @scala.inline
  def apply(end: Double | Position, file: String, start: Double | Position): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

