package typings
package xml2jsLib.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait convertableToString extends js.Object

object convertableToString {
  @scala.inline
  def apply(toString: () => java.lang.String): convertableToString = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[convertableToString]
  }
}

