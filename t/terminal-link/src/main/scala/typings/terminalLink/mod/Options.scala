package typings.terminalLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Override the default fallback. If false, the fallback will be disabled.
  		@default `${text} (${url})`
  		*/
  var fallback: js.UndefOr[(js.Function2[/* text */ String, /* url */ String, String]) | Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFallbackFunction2(value: (/* text */ String, /* url */ String) => String): Self = this.set("fallback", js.Any.fromFunction2(value))
    @scala.inline
    def setFallback(value: (js.Function2[/* text */ String, /* url */ String, String]) | Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
  }
  
}

