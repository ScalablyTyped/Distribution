package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/lexer.js
trait Token extends js.Object {
  var end: scala.Double
  var kind: scala.Double
  var start: scala.Double
  var value: java.lang.String
}

object Token {
  @scala.inline
  def apply(end: scala.Double, kind: scala.Double, start: scala.Double, value: java.lang.String): Token = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, start = start, value = value)
  
    __obj.asInstanceOf[Token]
  }
}

