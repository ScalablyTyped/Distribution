package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporaryDataCreatedDTO extends TemporaryDataDTO {
  var expirationDate: stdLib.Date
  var id: java.lang.String
  var url: java.lang.String
}

object TemporaryDataCreatedDTO {
  @scala.inline
  def apply(
    expirationDate: stdLib.Date,
    expirationSeconds: scala.Double,
    id: java.lang.String,
    origin: java.lang.String,
    url: java.lang.String,
    value: js.Any
  ): TemporaryDataCreatedDTO = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate, expirationSeconds = expirationSeconds, id = id, origin = origin, url = url, value = value)
  
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
}

