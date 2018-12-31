package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  /**
    * Delay time after stop typing
    * @default 300
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Min. input length before triggering autocomplete
    * @default 3
    */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query name when sending ajax request
    * @default search
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Data source
    * @default []
    */
  var source: js.UndefOr[java.lang.String | js.Array[java.lang.String] | CallbackAutoComplete] = js.undefined
}

