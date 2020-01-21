package typings.tinymce.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory extends js.Object {
  def create(settings: js.Any): Control
}

object Factory {
  @scala.inline
  def apply(create: js.Any => Control): Factory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[Factory]
  }
}

