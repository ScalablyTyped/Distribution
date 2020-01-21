package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIbiza extends js.Object {
  var ibiza: Double
  var portalExtensionApi: Double
  var restApi: Double
  var undefined: Double
  var userInterface: Double
}

object AnonIbiza {
  @scala.inline
  def apply(
    ibiza: Double,
    portalExtensionApi: Double,
    restApi: Double,
    undefined: Double,
    userInterface: Double
  ): AnonIbiza = {
    val __obj = js.Dynamic.literal(ibiza = ibiza.asInstanceOf[js.Any], portalExtensionApi = portalExtensionApi.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], userInterface = userInterface.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIbiza]
  }
}

