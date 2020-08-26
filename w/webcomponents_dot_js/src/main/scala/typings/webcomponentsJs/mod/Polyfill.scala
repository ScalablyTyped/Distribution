package typings.webcomponentsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyfill extends js.Object {
  var flags: js.Any = js.native
}

object Polyfill {
  @scala.inline
  def apply(flags: js.Any): Polyfill = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyfill]
  }
  @scala.inline
  implicit class PolyfillOps[Self <: Polyfill] (val x: Self) extends AnyVal {
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
    def setFlags(value: js.Any): Self = this.set("flags", value.asInstanceOf[js.Any])
  }
  
}

