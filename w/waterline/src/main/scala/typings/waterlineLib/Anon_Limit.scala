package typings
package waterlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: scala.Double
  var page: scala.Double
}

object Anon_Limit {
  @scala.inline
  def apply(limit: scala.Double, page: scala.Double): Anon_Limit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[Anon_Limit]
  }
}

