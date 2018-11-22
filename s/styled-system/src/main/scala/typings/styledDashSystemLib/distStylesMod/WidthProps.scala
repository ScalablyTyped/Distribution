package typings
package styledDashSystemLib.distStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WidthProps[TLength] extends js.Object {
  /**
       *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
       *
       *   - Numbers from 0-1 are converted to percentage widths.
       *   - Numbers greater than 1 are converted to pixel values.
       *   - String values are passed as raw CSS values.
       *   - And arrays are converted to responsive width styles.
       */
  var width: js.UndefOr[
    styledDashSystemLib.distSpaceMod.ResponsiveValue[csstypeLib.csstypeMod.WidthProperty[TLength]]
  ] = js.undefined
}

