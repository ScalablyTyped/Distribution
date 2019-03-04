package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardChartReference extends js.Object {
  /**
    * Name of the resource
    */
  var name: java.lang.String
  /**
    * Full http link to the resource
    */
  var url: java.lang.String
}

object BoardChartReference {
  @scala.inline
  def apply(name: java.lang.String, url: java.lang.String): BoardChartReference = {
    val __obj = js.Dynamic.literal(name = name, url = url)
  
    __obj.asInstanceOf[BoardChartReference]
  }
}

