package typings.xml2js.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait convertableToString extends js.Object

object convertableToString {
  @scala.inline
  def apply(toString: () => String): convertableToString = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[convertableToString]
  }
}

