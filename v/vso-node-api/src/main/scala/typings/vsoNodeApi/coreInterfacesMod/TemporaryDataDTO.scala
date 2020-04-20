package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporaryDataDTO extends js.Object {
  var expirationSeconds: Double
  var origin: String
  var value: js.Any
}

object TemporaryDataDTO {
  @scala.inline
  def apply(expirationSeconds: Double, origin: String, value: js.Any): TemporaryDataDTO = {
    val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporaryDataDTO]
  }
}

