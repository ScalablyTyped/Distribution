package typings.ws.anon

import typings.node.Buffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkSize extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var dictionary: js.UndefOr[Buffer | js.Array[Buffer] | DataView] = js.undefined
  var finishFlush: js.UndefOr[Double] = js.undefined
  var flush: js.UndefOr[Double] = js.undefined
  var info: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var memLevel: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[Double] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object ChunkSize {
  @scala.inline
  def apply(
    chunkSize: js.UndefOr[Double] = js.undefined,
    dictionary: Buffer | js.Array[Buffer] | DataView = null,
    finishFlush: js.UndefOr[Double] = js.undefined,
    flush: js.UndefOr[Double] = js.undefined,
    info: js.UndefOr[Boolean] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    memLevel: js.UndefOr[Double] = js.undefined,
    strategy: js.UndefOr[Double] = js.undefined,
    windowBits: js.UndefOr[Double] = js.undefined
  ): ChunkSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (!js.isUndefined(finishFlush)) __obj.updateDynamic("finishFlush")(finishFlush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flush)) __obj.updateDynamic("flush")(flush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memLevel)) __obj.updateDynamic("memLevel")(memLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strategy)) __obj.updateDynamic("strategy")(strategy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowBits)) __obj.updateDynamic("windowBits")(windowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkSize]
  }
}

