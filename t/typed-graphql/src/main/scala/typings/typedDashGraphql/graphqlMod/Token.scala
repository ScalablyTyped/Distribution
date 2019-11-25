package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/lexer.js
trait Token extends js.Object {
  var end: Double
  var kind: Double
  var start: Double
  var value: String
}

object Token {
  @scala.inline
  def apply(end: Double, kind: Double, start: Double, value: String): Token = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Token]
  }
}

