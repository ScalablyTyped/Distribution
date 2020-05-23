package typings.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expire extends js.Object {
  var expire: js.UndefOr[Double] = js.undefined
  var forceAccount: js.UndefOr[Boolean] = js.undefined
  var immutable: js.UndefOr[Boolean] = js.undefined
  var multisign: js.UndefOr[Boolean] = js.undefined
  var return_url: js.UndefOr[App] = js.undefined
  var submit: js.UndefOr[Boolean] = js.undefined
}

object Expire {
  @scala.inline
  def apply(
    expire: js.UndefOr[Double] = js.undefined,
    forceAccount: js.UndefOr[Boolean] = js.undefined,
    immutable: js.UndefOr[Boolean] = js.undefined,
    multisign: js.UndefOr[Boolean] = js.undefined,
    return_url: App = null,
    submit: js.UndefOr[Boolean] = js.undefined
  ): Expire = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAccount)) __obj.updateDynamic("forceAccount")(forceAccount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multisign)) __obj.updateDynamic("multisign")(multisign.get.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (!js.isUndefined(submit)) __obj.updateDynamic("submit")(submit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
}

