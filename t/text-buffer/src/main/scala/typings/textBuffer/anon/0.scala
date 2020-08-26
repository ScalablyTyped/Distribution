package typings.textBuffer.anon

import typings.textBuffer.textBufferStrings.backward
import typings.textBuffer.textBufferStrings.closest
import typings.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var clipDirection: backward | forward | closest = js.native
}

object `0` {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): `0` = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setClipDirection(value: backward | forward | closest): Self = this.set("clipDirection", value.asInstanceOf[js.Any])
  }
  
}

