package typings.terminalDashKit

import typings.terminalDashKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrChar extends js.Object {
  var attr: Attributes
  var char: String
}

object Anon_AttrChar {
  @scala.inline
  def apply(attr: Attributes, char: String): Anon_AttrChar = {
    val __obj = js.Dynamic.literal(attr = attr, char = char)
  
    __obj.asInstanceOf[Anon_AttrChar]
  }
}

