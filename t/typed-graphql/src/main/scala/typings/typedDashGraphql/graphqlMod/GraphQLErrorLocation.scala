package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLErrorLocation extends js.Object {
  var column: Double
  var line: Double
}

object GraphQLErrorLocation {
  @scala.inline
  def apply(column: Double, line: Double): GraphQLErrorLocation = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[GraphQLErrorLocation]
  }
}

