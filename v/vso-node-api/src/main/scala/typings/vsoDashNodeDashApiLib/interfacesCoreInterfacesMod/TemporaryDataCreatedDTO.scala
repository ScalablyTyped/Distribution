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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expirationDate")(expirationDate)
    __obj.updateDynamic("expirationSeconds")(expirationSeconds)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TemporaryDataCreatedDTO]
  }
}

