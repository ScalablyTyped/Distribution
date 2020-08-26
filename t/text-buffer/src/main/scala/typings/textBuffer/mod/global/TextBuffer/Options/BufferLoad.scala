package typings.textBuffer.mod.global.TextBuffer.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferLoad extends js.Object {
  /** The file's encoding. */
  var encoding: js.UndefOr[String] = js.native
  /**
    *  A function that returns a boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.native
}

object BufferLoad {
  @scala.inline
  def apply(): BufferLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferLoad]
  }
  @scala.inline
  implicit class BufferLoadOps[Self <: BufferLoad] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setShouldDestroyOnFileDelete(value: () => Boolean): Self = this.set("shouldDestroyOnFileDelete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShouldDestroyOnFileDelete: Self = this.set("shouldDestroyOnFileDelete", js.undefined)
  }
  
}

