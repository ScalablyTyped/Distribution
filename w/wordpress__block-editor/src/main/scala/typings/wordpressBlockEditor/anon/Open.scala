package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Open extends js.Object {
  /**
    * A function opening the media modal when called.
    */
  def open(): Unit = js.native
}

object Open {
  @scala.inline
  def apply(open: () => Unit): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Open]
  }
  @scala.inline
  implicit class OpenOps[Self <: Open] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
  
}

