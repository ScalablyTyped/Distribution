package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/location.js
trait SourceLocation extends js.Object {
  var column: Double
  var line: Double
}

object SourceLocation {
  @scala.inline
  def apply(column: Double, line: Double): SourceLocation = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

