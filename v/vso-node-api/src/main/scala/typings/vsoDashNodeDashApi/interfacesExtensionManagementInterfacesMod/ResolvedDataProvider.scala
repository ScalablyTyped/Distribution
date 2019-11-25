package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedDataProvider extends js.Object {
  /**
    * The total time the data provider took to resolve its data (in milliseconds)
    */
  var duration: Double
  var error: String
  var id: String
}

object ResolvedDataProvider {
  @scala.inline
  def apply(duration: Double, error: String, id: String): ResolvedDataProvider = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolvedDataProvider]
  }
}

