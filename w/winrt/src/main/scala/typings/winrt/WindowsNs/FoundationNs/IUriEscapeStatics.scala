package typings.winrt.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUriEscapeStatics extends js.Object {
  def escapeComponent(toEscape: String): String
  def unescapeComponent(toUnescape: String): String
}

object IUriEscapeStatics {
  @scala.inline
  def apply(escapeComponent: String => String, unescapeComponent: String => String): IUriEscapeStatics = {
    val __obj = js.Dynamic.literal(escapeComponent = js.Any.fromFunction1(escapeComponent), unescapeComponent = js.Any.fromFunction1(unescapeComponent))
  
    __obj.asInstanceOf[IUriEscapeStatics]
  }
}

