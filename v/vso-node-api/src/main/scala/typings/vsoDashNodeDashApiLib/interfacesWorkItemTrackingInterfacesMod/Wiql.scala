package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wiql extends js.Object {
  /**
    * The text of the WIQL query
    */
  var query: java.lang.String
}

object Wiql {
  @scala.inline
  def apply(query: java.lang.String): Wiql = {
    val __obj = js.Dynamic.literal(query = query)
  
    __obj.asInstanceOf[Wiql]
  }
}

