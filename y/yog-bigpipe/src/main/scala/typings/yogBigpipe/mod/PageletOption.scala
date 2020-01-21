package typings.yogBigpipe.mod

import typings.yogBigpipe.mod.Pagelet.mode
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
  var mode: js.UndefOr[typings.yogBigpipe.mod.Pagelet.mode] = js.undefined
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reqID = reqID.asInstanceOf[js.Any], skipAnalysis = skipAnalysis.asInstanceOf[js.Any])
    if (!js.isUndefined(compiled)) __obj.updateDynamic("compiled")(compiled.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageletOption]
  }
}

