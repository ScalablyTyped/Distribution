package typings
package xmlLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Option extends js.Object {
  /**
     * Add default xml declaration (default false)
     */
  var declaration: js.UndefOr[scala.Boolean | xmlLib.Anon_Standalone] = js.undefined
  /**
     * String used for tab, defaults to no tabs (compressed)
     */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Return the result as a `stream` (default false)
     */
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

