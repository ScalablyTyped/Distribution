package typings.vsoNodeApi.coreInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemporaryDataCreatedDTO extends TemporaryDataDTO {
  var expirationDate: Date = js.native
  var id: String = js.native
  var url: String = js.native
}

object TemporaryDataCreatedDTO {
  @scala.inline
  def apply(
    expirationDate: Date,
    expirationSeconds: Double,
    id: String,
    origin: String,
    url: String,
    value: js.Any
  ): TemporaryDataCreatedDTO = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
  @scala.inline
  implicit class TemporaryDataCreatedDTOOps[Self <: TemporaryDataCreatedDTO] (val x: Self) extends AnyVal {
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
    def setExpirationDate(value: Date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

