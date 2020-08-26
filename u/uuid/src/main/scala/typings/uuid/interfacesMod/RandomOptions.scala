package typings.uuid.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomOptions extends V4Options {
  var random: js.UndefOr[InputBuffer] = js.native
}

object RandomOptions {
  @scala.inline
  def apply(): RandomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomOptions]
  }
  @scala.inline
  implicit class RandomOptionsOps[Self <: RandomOptions] (val x: Self) extends AnyVal {
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
    def setRandom(value: InputBuffer): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
  }
  
}

