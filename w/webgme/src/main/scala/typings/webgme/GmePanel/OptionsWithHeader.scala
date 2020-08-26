package typings.webgme.GmePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithHeader extends Options {
  var FLOATING_TITLE: String = js.native
  var HEADER_TITLE: String = js.native
  var NO_SCROLLING: String = js.native
}

object OptionsWithHeader {
  @scala.inline
  def apply(FLOATING_TITLE: String, HEADER_TITLE: String, LOGGER_INSTANCE_NAME: String, NO_SCROLLING: String): OptionsWithHeader = {
    val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE.asInstanceOf[js.Any], HEADER_TITLE = HEADER_TITLE.asInstanceOf[js.Any], LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any], NO_SCROLLING = NO_SCROLLING.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithHeader]
  }
  @scala.inline
  implicit class OptionsWithHeaderOps[Self <: OptionsWithHeader] (val x: Self) extends AnyVal {
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
    def setFLOATING_TITLE(value: String): Self = this.set("FLOATING_TITLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setHEADER_TITLE(value: String): Self = this.set("HEADER_TITLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNO_SCROLLING(value: String): Self = this.set("NO_SCROLLING", value.asInstanceOf[js.Any])
  }
  
}

