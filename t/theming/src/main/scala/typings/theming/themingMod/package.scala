package typings.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object themingMod {
  import typings.react.reactMod.ComponentType
  import typings.theming.Anon_Theme
  import typings.theming.Anon_ThemeNonNullable

  type DefaultTheme = js.Object | Null
  type ThemeProviderFactory[Theme] = ComponentType[ThemeProviderProps[Theme]]
  type UseThemeFactory[Theme] = js.Function0[Theme]
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ ComponentType[Anon_Theme[Theme]], 
    ComponentType[Anon_Theme[Theme] with Anon_ThemeNonNullable[Theme]]
  ]
}
