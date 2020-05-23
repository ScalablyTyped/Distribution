package typings.vueCropperjs.anon

import typings.vueCropperjs.vueCropperjsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: _empty
  var `type`: String
}

object Default {
  @scala.inline
  def apply(default: _empty, `type`: String): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

