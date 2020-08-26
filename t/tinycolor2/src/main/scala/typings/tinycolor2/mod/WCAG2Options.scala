package typings.tinycolor2.mod

import typings.tinycolor2.tinycolor2Strings.AA
import typings.tinycolor2.tinycolor2Strings.AAA
import typings.tinycolor2.tinycolor2Strings.large
import typings.tinycolor2.tinycolor2Strings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WCAG2Options extends js.Object {
  var level: js.UndefOr[AA | AAA] = js.native
  var size: js.UndefOr[large | small] = js.native
}

object WCAG2Options {
  @scala.inline
  def apply(): WCAG2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCAG2Options]
  }
  @scala.inline
  implicit class WCAG2OptionsOps[Self <: WCAG2Options] (val x: Self) extends AnyVal {
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
    def setLevel(value: AA | AAA): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

