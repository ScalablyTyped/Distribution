package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /**
    * Delay time after stop typing
    * @default 300
    * <h2>Possible value</h2>
    * integer
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Min. input length before triggering autocomplete
    * @default 3
    * <h2>Possible value</h2>
    * integer
    */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query name when sending ajax request
    * @default search
    * <h2>Possible value</h2>
    * string
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data source url
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

