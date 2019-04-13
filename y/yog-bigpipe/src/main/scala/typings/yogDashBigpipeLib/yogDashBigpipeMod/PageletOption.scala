package typings
package yogDashBigpipeLib.yogDashBigpipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageletOption extends js.Object {
  var compiled: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String] = js.undefined
  var `for`: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var locals: js.UndefOr[js.Object] = js.undefined
  var mode: js.UndefOr[yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode] = js.undefined
  var reqID: java.lang.String
  var skipAnalysis: scala.Boolean
}

object PageletOption {
  @scala.inline
  def apply(
    id: java.lang.String,
    reqID: java.lang.String,
    skipAnalysis: scala.Boolean,
    compiled: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String = null,
    `for`: java.lang.String = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    locals: js.Object = null,
    mode: yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode = null
  ): PageletOption = {
    val __obj = js.Dynamic.literal(id = id, reqID = reqID, skipAnalysis = skipAnalysis)
    if (!js.isUndefined(compiled)) __obj.updateDynamic("compiled")(compiled)
    if (container != null) __obj.updateDynamic("container")(container)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[PageletOption]
  }
}

