package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Open extends js.Object {
  /**
    * A function opening the media modal when called.
    */
  def open(): Unit
}

object Open {
  @scala.inline
  def apply(open: () => Unit): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Open]
  }
}

