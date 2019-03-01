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
    escapeComponent: js.Function1[java.lang.String, java.lang.String],
    unescapeComponent: js.Function1[java.lang.String, java.lang.String]
  ): IUriEscapeStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escapeComponent")(escapeComponent)
    __obj.updateDynamic("unescapeComponent")(unescapeComponent)
    __obj.asInstanceOf[IUriEscapeStatics]
  }
}

