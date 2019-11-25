package typings.tern

import typings.tern.libTernMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndFile extends js.Object {
  var end: Double | Position
  var file: String
  var start: Double | Position
  var text: String
}

object Anon_EndFile {
  @scala.inline
  def apply(end: Double | Position, file: String, start: Double | Position, text: String): Anon_EndFile = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndFile]
  }
}

