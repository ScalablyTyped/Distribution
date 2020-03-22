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
  def apply(scope: ApiKeyScope, cldbid: Int | Double = null, lifetime: Int | Double = null): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (cldbid != null) __obj.updateDynamic("cldbid")(cldbid.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
}

