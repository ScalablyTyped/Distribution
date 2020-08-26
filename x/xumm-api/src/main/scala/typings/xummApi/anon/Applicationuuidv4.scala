package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Applicationuuidv4 extends js.Object {
  var application_uuidv4: String = js.native
  var payload_uuidv4: String = js.native
  var url: String = js.native
}

object Applicationuuidv4 {
  @scala.inline
  def apply(application_uuidv4: String, payload_uuidv4: String, url: String): Applicationuuidv4 = {
    val __obj = js.Dynamic.literal(application_uuidv4 = application_uuidv4.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationuuidv4]
  }
  @scala.inline
  implicit class Applicationuuidv4Ops[Self <: Applicationuuidv4] (val x: Self) extends AnyVal {
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
    def setApplication_uuidv4(value: String): Self = this.set("application_uuidv4", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload_uuidv4(value: String): Self = this.set("payload_uuidv4", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

