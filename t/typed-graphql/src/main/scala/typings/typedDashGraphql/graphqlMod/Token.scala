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
    val __obj = js.Dynamic.literal(end = end, kind = kind, start = start, value = value)
  
    __obj.asInstanceOf[Token]
  }
}

