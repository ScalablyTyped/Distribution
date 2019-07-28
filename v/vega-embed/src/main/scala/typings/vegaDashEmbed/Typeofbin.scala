package typings.vegaDashEmbed

import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcChannelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbin extends js.Object {
  def autoMaxBins(channel: Channel): Double = js.native
  def binToString(bin: Boolean): String = js.native
  def binToString(bin: BinParams): String = js.native
  def isBinParams(bin: Boolean): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
  def isBinParams(bin: BinParams): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
}

