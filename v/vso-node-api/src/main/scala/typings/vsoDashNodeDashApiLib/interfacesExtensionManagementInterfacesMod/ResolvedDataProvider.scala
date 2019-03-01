package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedDataProvider extends js.Object {
  /**
    * The total time the data provider took to resolve its data (in milliseconds)
    */
  var duration: scala.Double
  var error: java.lang.String
  var id: java.lang.String
}

object ResolvedDataProvider {
  @scala.inline
  def apply(duration: scala.Double, error: java.lang.String, id: java.lang.String): ResolvedDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ResolvedDataProvider]
  }
}

