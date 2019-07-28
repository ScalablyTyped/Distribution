package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.`bin-linear`
import typings.vegaDashEmbed.vegaDashEmbedStrings.`bin-ordinal`
import typings.vegaDashEmbed.vegaDashEmbedStrings.band
import typings.vegaDashEmbed.vegaDashEmbedStrings.linear
import typings.vegaDashEmbed.vegaDashEmbedStrings.log
import typings.vegaDashEmbed.vegaDashEmbedStrings.ordinal
import typings.vegaDashEmbed.vegaDashEmbedStrings.point
import typings.vegaDashEmbed.vegaDashEmbedStrings.pow
import typings.vegaDashEmbed.vegaDashEmbedStrings.quantile
import typings.vegaDashEmbed.vegaDashEmbedStrings.quantize
import typings.vegaDashEmbed.vegaDashEmbedStrings.sequential
import typings.vegaDashEmbed.vegaDashEmbedStrings.sqrt
import typings.vegaDashEmbed.vegaDashEmbedStrings.threshold
import typings.vegaDashEmbed.vegaDashEmbedStrings.time
import typings.vegaDashEmbed.vegaDashEmbedStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofScaleType extends js.Object {
  val BAND: band
  val BIN_LINEAR: `bin-linear`
  val BIN_ORDINAL: `bin-ordinal`
  val LINEAR: linear
  val LOG: log
  val ORDINAL: ordinal
  val POINT: point
  val POW: pow
  val QUANTILE: quantile
  val QUANTIZE: quantize
  val SEQUENTIAL: sequential
  val SQRT: sqrt
  val THRESHOLD: threshold
  val TIME: time
  val UTC: utc
}

object TypeofScaleType {
  @scala.inline
  def apply(
    BAND: band,
    BIN_LINEAR: `bin-linear`,
    BIN_ORDINAL: `bin-ordinal`,
    LINEAR: linear,
    LOG: log,
    ORDINAL: ordinal,
    POINT: point,
    POW: pow,
    QUANTILE: quantile,
    QUANTIZE: quantize,
    SEQUENTIAL: sequential,
    SQRT: sqrt,
    THRESHOLD: threshold,
    TIME: time,
    UTC: utc
  ): TypeofScaleType = {
    val __obj = js.Dynamic.literal(BAND = BAND, BIN_LINEAR = BIN_LINEAR, BIN_ORDINAL = BIN_ORDINAL, LINEAR = LINEAR, LOG = LOG, ORDINAL = ORDINAL, POINT = POINT, POW = POW, QUANTILE = QUANTILE, QUANTIZE = QUANTIZE, SEQUENTIAL = SEQUENTIAL, SQRT = SQRT, THRESHOLD = THRESHOLD, TIME = TIME, UTC = UTC)
  
    __obj.asInstanceOf[TypeofScaleType]
  }
}

