package typings.textBuffer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldDestroyOnFileDelete extends js.Object {
  /**
    *  A function that returns a Boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** The initial string text of the buffer. */
  var text: js.UndefOr[String] = js.native
}

object ShouldDestroyOnFileDelete {
  @scala.inline
  def apply(): ShouldDestroyOnFileDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShouldDestroyOnFileDelete]
  }
  @scala.inline
  implicit class ShouldDestroyOnFileDeleteOps[Self <: ShouldDestroyOnFileDelete] (val x: Self) extends AnyVal {
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
    def setShouldDestroyOnFileDelete(value: () => Boolean): Self = this.set("shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShouldDestroyOnFileDelete: Self = this.set("shouldDestroyOnFileDelete", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

