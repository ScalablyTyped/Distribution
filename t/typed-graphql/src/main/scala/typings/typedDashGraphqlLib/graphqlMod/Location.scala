package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/ast.js
trait Location extends js.Object {
  var end: scala.Double
  var source: js.UndefOr[Source] = js.undefined
  var start: scala.Double
}

object Location {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double, source: Source = null): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Location]
  }
}

