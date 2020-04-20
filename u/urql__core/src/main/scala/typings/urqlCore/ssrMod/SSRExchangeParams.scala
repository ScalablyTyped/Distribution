package typings.urqlCore.ssrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSRExchangeParams extends js.Object {
  var initialState: js.UndefOr[SSRData] = js.undefined
  var isClient: js.UndefOr[Boolean] = js.undefined
}

object SSRExchangeParams {
  @scala.inline
  def apply(initialState: SSRData = null, isClient: js.UndefOr[Boolean] = js.undefined): SSRExchangeParams = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (!js.isUndefined(isClient)) __obj.updateDynamic("isClient")(isClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRExchangeParams]
  }
}

