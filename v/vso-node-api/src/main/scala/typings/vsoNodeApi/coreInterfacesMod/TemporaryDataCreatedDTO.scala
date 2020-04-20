package typings.vsoNodeApi.coreInterfacesMod

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
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
}

