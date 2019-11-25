package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/ast.js
trait Location extends js.Object {
  var end: Double
  var source: js.UndefOr[Source] = js.undefined
  var start: Double
}

object Location {
  @scala.inline
  def apply(end: Double, start: Double, source: Source = null): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

