package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wiql extends js.Object {
  /**
    * The text of the WIQL query
    */
  var query: String
}

object Wiql {
  @scala.inline
  def apply(query: String): Wiql = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Wiql]
  }
}

