package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Char extends js.Object {
  var attr: Attributes
  var char: String
}

object Char {
  @scala.inline
  def apply(attr: Attributes, char: String): Char = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any])
    __obj.asInstanceOf[Char]
  }
}

