package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BgColorProps[TLength] extends js.Object {
  /**
       * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
       * By default the raw value of the prop is returned.
       *
       * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
       * Array values are converted into responsive values.
       *
       * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
       */
  var bg: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BackgroundProperty[TLength]]] = js.undefined
}

