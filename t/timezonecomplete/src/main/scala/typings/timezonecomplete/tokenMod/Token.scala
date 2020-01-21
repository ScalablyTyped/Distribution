package typings.timezonecomplete.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * The total length of the token
    */
  var length: Double
  /**
    * The original string that produced this token
    */
  var raw: String
  /**
    * The symbol from which the token was parsed
    */
  var symbol: String
  /**
    * The type of token
    */
  var `type`: TokenType
}

object Token {
  @scala.inline
  def apply(length: Double, raw: String, symbol: String, `type`: TokenType): Token = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

