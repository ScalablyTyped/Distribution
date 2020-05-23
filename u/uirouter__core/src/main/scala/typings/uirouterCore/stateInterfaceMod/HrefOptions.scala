package typings.uirouterCore.stateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HrefOptions extends js.Object {
  /**
    * If true will generate an absolute url, e.g. `http://www.example.com/fullurl`.
    */
  var absolute: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` will inherit parameters from the current parameter values.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, and if there is no url associated with the state provided in the
    *    first parameter, then the constructed href url will be built from the first
    *    ancestor which has a url.
    */
  var lossy: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines what state to be "relative from"
    *
    * When a relative path is found (e.g `^` or `.bar`), defines which state to be relative from.
    */
  var relative: js.UndefOr[StateOrName] = js.undefined
}

object HrefOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    lossy: js.UndefOr[Boolean] = js.undefined,
    relative: StateOrName = null
  ): HrefOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lossy)) __obj.updateDynamic("lossy")(lossy.get.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefOptions]
  }
}

