package typings.twitterStreamChannels.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAllListeners extends js.Object {
  var removeAllListeners: Boolean = js.native
}

object RemoveAllListeners {
  @scala.inline
  def apply(removeAllListeners: Boolean): RemoveAllListeners = {
    val __obj = js.Dynamic.literal(removeAllListeners = removeAllListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAllListeners]
  }
  @scala.inline
  implicit class RemoveAllListenersOps[Self <: RemoveAllListeners] (val x: Self) extends AnyVal {
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
    def setRemoveAllListeners(value: Boolean): Self = this.set("removeAllListeners", value.asInstanceOf[js.Any])
  }
  
}

