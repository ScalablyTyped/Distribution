package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ibiza extends js.Object {
  var ibiza: scala.Double
  var portalExtensionApi: scala.Double
  var restApi: scala.Double
  var undefined: scala.Double
  var userInterface: scala.Double
}

object Anon_Ibiza {
  @scala.inline
  def apply(
    ibiza: scala.Double,
    portalExtensionApi: scala.Double,
    restApi: scala.Double,
    undefined: scala.Double,
    userInterface: scala.Double
  ): Anon_Ibiza = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ibiza")(ibiza)
    __obj.updateDynamic("portalExtensionApi")(portalExtensionApi)
    __obj.updateDynamic("restApi")(restApi)
    __obj.updateDynamic("undefined")(undefined)
    __obj.updateDynamic("userInterface")(userInterface)
    __obj.asInstanceOf[Anon_Ibiza]
  }
}

