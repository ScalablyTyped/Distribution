package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Infoname extends js.Object {
  var info_name: java.lang.String = js.native
  var name: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var `type`: java.lang.String = js.native
}

object Infoname {
  @scala.inline
  def apply(
    info_name: java.lang.String,
    name: java.lang.String,
    protocol: java.lang.String,
    `type`: java.lang.String
  ): Infoname = {
    val __obj = js.Dynamic.literal(info_name = info_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infoname]
  }
  @scala.inline
  implicit class InfonameOps[Self <: Infoname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfo_name(value: java.lang.String): Self = this.set("info_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: java.lang.String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

