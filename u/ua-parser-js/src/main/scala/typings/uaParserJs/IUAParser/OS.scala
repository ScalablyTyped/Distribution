package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OS extends js.Object {
  var NAME: String = js.native
  var VERSION: String = js.native
}

object OS {
  @scala.inline
  def apply(NAME: String, VERSION: String): OS = {
    val __obj = js.Dynamic.literal(NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[OS]
  }
  @scala.inline
  implicit class OSOps[Self <: OS] (val x: Self) extends AnyVal {
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
    def setNAME(value: String): Self = this.set("NAME", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
  }
  
}

