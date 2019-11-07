package typings.theming

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Theme[Theme] extends js.Object {
  var theme: NonNullable[Theme]
}

object Anon_Theme {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme]): Anon_Theme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Theme[Theme]]
  }
}

