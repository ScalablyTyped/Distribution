package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.decodeNumber>.
  */
trait DecodeNumberDict extends js.Object {
  /**
    * byte order to decode with.
    */
  var byteOrder: js.UndefOr[Double] = js.undefined
  /**
    * Index in the `source` buffer of the first byte of data to decode.
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * Buffer to decode.
    */
  var source: Buffer
  /**
    * The encoding type to use.
    */
  var `type`: java.lang.String
}

object DecodeNumberDict {
  @scala.inline
  def apply(
    source: Buffer,
    `type`: java.lang.String,
    byteOrder: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined
  ): DecodeNumberDict = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(byteOrder)) __obj.updateDynamic("byteOrder")(byteOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeNumberDict]
  }
}

