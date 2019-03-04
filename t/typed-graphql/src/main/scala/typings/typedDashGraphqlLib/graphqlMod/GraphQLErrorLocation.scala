package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLErrorLocation extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object GraphQLErrorLocation {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): GraphQLErrorLocation = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[GraphQLErrorLocation]
  }
}

