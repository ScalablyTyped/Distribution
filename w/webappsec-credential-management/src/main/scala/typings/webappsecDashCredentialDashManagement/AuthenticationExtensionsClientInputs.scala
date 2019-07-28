package typings.webappsecDashCredentialDashManagement

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationExtensionsClientInputs extends js.Object {
  var appid: js.UndefOr[String] = js.undefined
  var authnSel: js.UndefOr[js.Array[ArrayBufferView | ArrayBuffer]] = js.undefined
  var exts: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[Boolean] = js.undefined
  var txAuthGeneric: js.UndefOr[txAuthGenericArg] = js.undefined
  var txAuthSimple: js.UndefOr[String] = js.undefined
  var uvi: js.UndefOr[Boolean] = js.undefined
  var uvm: js.UndefOr[Boolean] = js.undefined
}

object AuthenticationExtensionsClientInputs {
  @scala.inline
  def apply(
    appid: String = null,
    authnSel: js.Array[ArrayBufferView | ArrayBuffer] = null,
    exts: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Boolean] = js.undefined,
    txAuthGeneric: txAuthGenericArg = null,
    txAuthSimple: String = null,
    uvi: js.UndefOr[Boolean] = js.undefined,
    uvm: js.UndefOr[Boolean] = js.undefined
  ): AuthenticationExtensionsClientInputs = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid)
    if (authnSel != null) __obj.updateDynamic("authnSel")(authnSel)
    if (!js.isUndefined(exts)) __obj.updateDynamic("exts")(exts)
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (txAuthGeneric != null) __obj.updateDynamic("txAuthGeneric")(txAuthGeneric)
    if (txAuthSimple != null) __obj.updateDynamic("txAuthSimple")(txAuthSimple)
    if (!js.isUndefined(uvi)) __obj.updateDynamic("uvi")(uvi)
    if (!js.isUndefined(uvm)) __obj.updateDynamic("uvm")(uvm)
    __obj.asInstanceOf[AuthenticationExtensionsClientInputs]
  }
}

