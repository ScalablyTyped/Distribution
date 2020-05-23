package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAny extends js.Object {
  var `type`: js.Any
}

object TypeAny {
  @scala.inline
  def apply(`type`: js.Any): TypeAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAny]
  }
}

