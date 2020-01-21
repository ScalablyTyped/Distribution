package typings.stylis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var keyframe: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[
    Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean])
  ] = js.undefined
  var preserve: js.UndefOr[Boolean] = js.undefined
  var semicolon: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    keyframe: js.UndefOr[Boolean] = js.undefined,
    prefix: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ Double, Boolean]) = null,
    preserve: js.UndefOr[Boolean] = js.undefined,
    semicolon: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (!js.isUndefined(keyframe)) __obj.updateDynamic("keyframe")(keyframe.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

