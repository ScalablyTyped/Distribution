package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporaryDataDTO extends js.Object {
  var expirationSeconds: scala.Double
  var origin: java.lang.String
  var value: js.Any
}

object TemporaryDataDTO {
  @scala.inline
  def apply(expirationSeconds: scala.Double, origin: java.lang.String, value: js.Any): TemporaryDataDTO = {
    val __obj = js.Dynamic.literal(expirationSeconds = expirationSeconds, origin = origin, value = value)
  
    __obj.asInstanceOf[TemporaryDataDTO]
  }
}

