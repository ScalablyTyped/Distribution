package typings.wicgNativeFileSystem.anon

import typings.wicgNativeFileSystem.WriteParams
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.seek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends WriteParams {
  var position: Double = js.native
  var `type`: seek = js.native
}

object Position {
  @scala.inline
  def apply(position: Double, `type`: seek): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: seek): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

