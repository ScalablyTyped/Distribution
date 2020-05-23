package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyAdd extends js.Object {
  var cldbid: js.UndefOr[Double] = js.undefined
  var lifetime: js.UndefOr[Double] = js.undefined
  var scope: ApiKeyScope
}

object ApiKeyAdd {
  @scala.inline
  def apply(
    scope: ApiKeyScope,
    cldbid: js.UndefOr[Double] = js.undefined,
    lifetime: js.UndefOr[Double] = js.undefined
  ): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (!js.isUndefined(cldbid)) __obj.updateDynamic("cldbid")(cldbid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lifetime)) __obj.updateDynamic("lifetime")(lifetime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
}

