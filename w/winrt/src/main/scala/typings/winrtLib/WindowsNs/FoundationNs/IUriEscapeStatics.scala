package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUriEscapeStatics extends js.Object {
  def escapeComponent(toEscape: java.lang.String): java.lang.String
  def unescapeComponent(toUnescape: java.lang.String): java.lang.String
}

object IUriEscapeStatics {
  @scala.inline
  def apply(
    escapeComponent: java.lang.String => java.lang.String,
    unescapeComponent: java.lang.String => java.lang.String
  ): IUriEscapeStatics = {
    val __obj = js.Dynamic.literal(escapeComponent = js.Any.fromFunction1(escapeComponent), unescapeComponent = js.Any.fromFunction1(unescapeComponent))
  
    __obj.asInstanceOf[IUriEscapeStatics]
  }
}

