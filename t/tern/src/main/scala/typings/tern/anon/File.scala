package typings.tern.anon

import typings.tern.ternMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var end: Double | Position
  var file: String
  var start: Double | Position
  var text: String
}

object File {
  @scala.inline
  def apply(end: Double | Position, file: String, start: Double | Position, text: String): File = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

