package typings.textBuffer.anon

import typings.textBuffer.textBufferStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeLineEndings extends js.Object {
  var normalizeLineEndings: js.UndefOr[Boolean] = js.native
  var undo: js.UndefOr[skip] = js.native
}

object NormalizeLineEndings {
  @scala.inline
  def apply(): NormalizeLineEndings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeLineEndings]
  }
  @scala.inline
  implicit class NormalizeLineEndingsOps[Self <: NormalizeLineEndings] (val x: Self) extends AnyVal {
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
    def setNormalizeLineEndings(value: Boolean): Self = this.set("normalizeLineEndings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeLineEndings: Self = this.set("normalizeLineEndings", js.undefined)
    @scala.inline
    def setUndo(value: skip): Self = this.set("undo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
  }
  
}

