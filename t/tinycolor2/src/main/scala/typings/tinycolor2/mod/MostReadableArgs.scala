package typings.tinycolor2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MostReadableArgs extends WCAG2Options {
  var includeFallbackColors: js.UndefOr[Boolean] = js.native
}

object MostReadableArgs {
  @scala.inline
  def apply(): MostReadableArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MostReadableArgs]
  }
  @scala.inline
  implicit class MostReadableArgsOps[Self <: MostReadableArgs] (val x: Self) extends AnyVal {
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
    def setIncludeFallbackColors(value: Boolean): Self = this.set("includeFallbackColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFallbackColors: Self = this.set("includeFallbackColors", js.undefined)
  }
  
}

