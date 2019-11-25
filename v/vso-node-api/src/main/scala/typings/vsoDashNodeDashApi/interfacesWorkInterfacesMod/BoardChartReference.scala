package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardChartReference extends js.Object {
  /**
    * Name of the resource
    */
  var name: String
  /**
    * Full http link to the resource
    */
  var url: String
}

object BoardChartReference {
  @scala.inline
  def apply(name: String, url: String): BoardChartReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoardChartReference]
  }
}

