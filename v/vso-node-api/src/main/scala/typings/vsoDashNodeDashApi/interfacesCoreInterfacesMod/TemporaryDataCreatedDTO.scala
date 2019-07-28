package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporaryDataCreatedDTO extends TemporaryDataDTO {
  var expirationDate: Date
  var id: String
  var url: String
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
    val __obj = js.Dynamic.literal(expirationDate = expirationDate, expirationSeconds = expirationSeconds, id = id, origin = origin, url = url, value = value)
  
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
}

