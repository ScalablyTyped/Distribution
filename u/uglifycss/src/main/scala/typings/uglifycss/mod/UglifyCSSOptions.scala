package typings.uglifycss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UglifyCSSOptions extends js.Object {
  /**
    * Preserves newlines within and around preserved comments
    */
  var cuteComments: js.UndefOr[Boolean] = js.native
  /**
    * eEpands variables; by default, @variables blocks are preserved and var(x)s are not expanded
    */
  var expandVars: js.UndefOr[Boolean] = js.native
  /**
    * Adds a newline (approx.) every n characters; 0 means no newline and is the default value
    */
  var maxLineLen: js.UndefOr[Double] = js.native
  /**
    * Removes newlines within preserved comments; by default, newlines are preserved
    */
  var uglyComments: js.UndefOr[Boolean] = js.native
}

object UglifyCSSOptions {
  @scala.inline
  def apply(): UglifyCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UglifyCSSOptions]
  }
  @scala.inline
  implicit class UglifyCSSOptionsOps[Self <: UglifyCSSOptions] (val x: Self) extends AnyVal {
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
    def setCuteComments(value: Boolean): Self = this.set("cuteComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCuteComments: Self = this.set("cuteComments", js.undefined)
    @scala.inline
    def setExpandVars(value: Boolean): Self = this.set("expandVars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandVars: Self = this.set("expandVars", js.undefined)
    @scala.inline
    def setMaxLineLen(value: Double): Self = this.set("maxLineLen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLineLen: Self = this.set("maxLineLen", js.undefined)
    @scala.inline
    def setUglyComments(value: Boolean): Self = this.set("uglyComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUglyComments: Self = this.set("uglyComments", js.undefined)
  }
  
}

