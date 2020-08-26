package typings.yazl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOptions extends js.Object {
  var forceZip64Format: Boolean = js.native
}

object EndOptions {
  @scala.inline
  def apply(forceZip64Format: Boolean): EndOptions = {
    val __obj = js.Dynamic.literal(forceZip64Format = forceZip64Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndOptions]
  }
  @scala.inline
  implicit class EndOptionsOps[Self <: EndOptions] (val x: Self) extends AnyVal {
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
    def setForceZip64Format(value: Boolean): Self = this.set("forceZip64Format", value.asInstanceOf[js.Any])
  }
  
}

