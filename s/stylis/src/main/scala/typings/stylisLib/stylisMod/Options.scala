package typings
package stylisLib.stylisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var keyframe: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[
    scala.Boolean | (js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* context */ scala.Double, 
      scala.Boolean
    ])
  ] = js.undefined
  var preserve: js.UndefOr[scala.Boolean] = js.undefined
  var semicolon: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    keyframe: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: scala.Boolean | (js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* context */ scala.Double, 
      scala.Boolean
    ]) = null,
    preserve: js.UndefOr[scala.Boolean] = js.undefined,
    semicolon: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (!js.isUndefined(keyframe)) __obj.updateDynamic("keyframe")(keyframe)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve)
    if (!js.isUndefined(semicolon)) __obj.updateDynamic("semicolon")(semicolon)
    __obj.asInstanceOf[Options]
  }
}

