package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/location.js
trait SourceLocation extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object SourceLocation {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): SourceLocation = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

