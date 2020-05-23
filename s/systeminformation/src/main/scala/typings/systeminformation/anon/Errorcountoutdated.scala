package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errorcountoutdated extends js.Object {
  var count: Double
  var error_count_outdated: Double
  var error_count_total: Double
  var revision: Double
  var table: js.Array[Lifetimehours]
}

object Errorcountoutdated {
  @scala.inline
  def apply(
    count: Double,
    error_count_outdated: Double,
    error_count_total: Double,
    revision: Double,
    table: js.Array[Lifetimehours]
  ): Errorcountoutdated = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error_count_outdated = error_count_outdated.asInstanceOf[js.Any], error_count_total = error_count_total.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcountoutdated]
  }
}

