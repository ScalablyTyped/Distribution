package typings.yogDashBigpipe.yogDashBigpipeMod

import typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageletOption extends js.Object {
  var compiled: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var `for`: js.UndefOr[String] = js.undefined
  var id: String
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var locals: js.UndefOr[js.Object] = js.undefined
  var mode: js.UndefOr[typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.mode] = js.undefined
  var reqID: String
  var skipAnalysis: Boolean
}

object PageletOption {
  @scala.inline
  def apply(
    id: String,
    reqID: String,
    skipAnalysis: Boolean,
    compiled: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    `for`: String = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    locals: js.Object = null,
    mode: mode = null
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

