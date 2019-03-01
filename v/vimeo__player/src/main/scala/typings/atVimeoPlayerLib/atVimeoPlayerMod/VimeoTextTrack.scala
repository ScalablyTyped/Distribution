package typings
package atVimeoPlayerLib.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VimeoTextTrack extends js.Object {
  var kind: java.lang.String
  var label: java.lang.String
  var language: java.lang.String
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object VimeoTextTrack {
  @scala.inline
  def apply(
    kind: java.lang.String,
    label: java.lang.String,
    language: java.lang.String,
    mode: java.lang.String = null
  ): VimeoTextTrack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("language")(language)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[VimeoTextTrack]
  }
}

