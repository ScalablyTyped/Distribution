package typings.tern.anon

import typings.tern.ternMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Double | Position
  var file: String
  var start: Double | Position
}

object End {
  @scala.inline
  def apply(end: Double | Position, file: String, start: Double | Position): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

