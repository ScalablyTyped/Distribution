package typings.theming.mod

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.theming.anon.ThemeNonNullable
import typings.theming.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theming[Theme] extends js.Object {
  var ThemeProvider: ThemeProviderFactory[Theme]
  var context: Context[Theme]
  var useTheme: UseThemeFactory[Theme]
  var withTheme: WithThemeFactory[Theme]
}

object Theming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderFactory[Theme],
    context: Context[Theme],
    useTheme: () => Theme,
    withTheme: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] with `0`[Theme]]
  ): Theming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[Theming[Theme]]
  }
}

