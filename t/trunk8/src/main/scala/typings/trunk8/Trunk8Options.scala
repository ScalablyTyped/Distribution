package typings.trunk8

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trunk8Options extends js.Object {
  /**
    (Default: '&hellip;') The string to insert in place of the omitted text. This value may include HTML.
    @param {string} fill
    */
  var fill: js.UndefOr[String] = js.native
  /**
    (Default: 1) The number of lines of text-wrap to tolerate before truncating. This value must be an integer greater than or equal to 1.
    @param {number} lines
    */
  var lines: js.UndefOr[Double] = js.native
  /**
    (Default: 'right') The side of the text from which to truncate. Valid values include 'center', 'left', and 'right'.
    @param {string} side
    */
  var side: js.UndefOr[String] = js.native
  /**
    (Default: true) When true, the title attribute of the targeted HTML element will be set to the original, untruncated string. Valid values include true and false.
    @param {bool} tooltip
    */
  var tooltip: js.UndefOr[Boolean] = js.native
  /**
    (Default: 'auto') The width, in characters, of the desired text. When set to 'auto', trunk8 will maximize the amount of text without spilling over.
    @param {string} width
    */
  var width: js.UndefOr[String] = js.native
}

object Trunk8Options {
  @scala.inline
  def apply(): Trunk8Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trunk8Options]
  }
  @scala.inline
  implicit class Trunk8OptionsOps[Self <: Trunk8Options] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

