package typings.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultTheme = js.Object | scala.Null
  type ThemeProviderFactory[Theme] = typings.react.mod.ComponentType[typings.theming.mod.ThemeProviderProps[Theme]]
  type UseThemeFactory[Theme] = js.Function0[Theme]
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ typings.react.mod.ComponentType[typings.theming.anon.ThemeNonNullable[Theme]], 
    typings.react.mod.ComponentType[
      typings.theming.anon.ThemeNonNullable[Theme] with typings.theming.anon.`0`[Theme]
    ]
  ]
}
