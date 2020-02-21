package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpire extends js.Object {
  var expire: js.UndefOr[Double] = js.undefined
  var multisign: js.UndefOr[Boolean] = js.undefined
  var return_url: js.UndefOr[AnonApp] = js.undefined
  var submit: js.UndefOr[Boolean] = js.undefined
}

object AnonExpire {
  @scala.inline
  def apply(
    expire: Int | Double = null,
    multisign: js.UndefOr[Boolean] = js.undefined,
    return_url: AnonApp = null,
    submit: js.UndefOr[Boolean] = js.undefined
  ): AnonExpire = {
    val __obj = js.Dynamic.literal()
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (!js.isUndefined(multisign)) __obj.updateDynamic("multisign")(multisign.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (!js.isUndefined(submit)) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpire]
  }
}

