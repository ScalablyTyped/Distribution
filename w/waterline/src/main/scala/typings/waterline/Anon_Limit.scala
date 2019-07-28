package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: Double
  var page: Double
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Double, page: Double): Anon_Limit = {
    val __obj = js.Dynamic.literal(limit = limit, page = page)
  
    __obj.asInstanceOf[Anon_Limit]
  }
}

