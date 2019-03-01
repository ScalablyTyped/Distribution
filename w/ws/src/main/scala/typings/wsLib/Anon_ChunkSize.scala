package typings
package wsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkSize extends js.Object {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var dictionary: js.UndefOr[nodeLib.Buffer | js.Array[nodeLib.Buffer] | stdLib.DataView] = js.undefined
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  var flush: js.UndefOr[scala.Double] = js.undefined
  var info: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  var strategy: js.UndefOr[scala.Double] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChunkSize {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    dictionary: nodeLib.Buffer | js.Array[nodeLib.Buffer] | stdLib.DataView = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): Anon_ChunkSize = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChunkSize]
  }
}

