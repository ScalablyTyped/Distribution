package typings.theming

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme[Theme] extends js.Object {
  var theme: NonNullable[Theme]
}

object AnonTheme {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme]): AnonTheme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTheme[Theme]]
  }
}

