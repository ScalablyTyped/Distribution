package typings.wordpressComponents.radioControlMod.RadioControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option[T] extends js.Object {
  /**
    * The label to be shown to the user.
    */
  var label: String
  /**
    * The internal value compared against select and passed to `onChange`.
    */
  var value: T
}

object Option {
  @scala.inline
  def apply[T](label: String, value: T): Option[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
}

