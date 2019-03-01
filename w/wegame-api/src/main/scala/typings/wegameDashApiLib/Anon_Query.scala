package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: js.Any
  var scene: java.lang.String
  var shareTicket: java.lang.String
}

object Anon_Query {
  @scala.inline
  def apply(query: js.Any, scene: java.lang.String, shareTicket: java.lang.String): Anon_Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("shareTicket")(shareTicket)
    __obj.asInstanceOf[Anon_Query]
  }
}

