package typings
package svgDashSpriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Pseudo extends js.Object {
  /**
               * SVG shape ID generator callback
               */
  var generator: js.UndefOr[java.lang.String | (js.Function1[/* svg */ java.lang.String, java.lang.String])] = js.undefined
  /**
               * File name separator for shape states (e.g. ':hover')
               */
  var pseudo: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Separator for directory name traversal
               */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whitespace replacement for shape IDs
               */
  var whitespace: js.UndefOr[java.lang.String] = js.undefined
}

