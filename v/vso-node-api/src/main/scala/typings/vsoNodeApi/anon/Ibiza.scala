package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ibiza extends js.Object {
  var ibiza: scala.Double
  var portalExtensionApi: scala.Double
  var restApi: scala.Double
  var undefined: scala.Double
  var userInterface: scala.Double
}

object Ibiza {
  @scala.inline
  def apply(
    ibiza: scala.Double,
    portalExtensionApi: scala.Double,
    restApi: scala.Double,
    undefined: scala.Double,
    userInterface: scala.Double
  ): Ibiza = {
    val __obj = js.Dynamic.literal(ibiza = ibiza.asInstanceOf[js.Any], portalExtensionApi = portalExtensionApi.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], userInterface = userInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ibiza]
  }
}

