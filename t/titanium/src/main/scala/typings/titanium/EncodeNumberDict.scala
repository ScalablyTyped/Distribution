package typings.titanium

import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeNumber>.
  */
trait EncodeNumberDict extends js.Object {
  /**
    * Byte order to encode with.
    */
  var byteOrder: js.UndefOr[Double] = js.undefined
  /**
    * Destination buffer.
    */
  var dest: Buffer
  /**
    * Index in the `dest` buffer of the first byte of encoded data.
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * Number to encode.
    */
  var source: Double
  /**
    * Encoding type to use.
    */
  var `type`: java.lang.String
}

object EncodeNumberDict {
  @scala.inline
  def apply(
    dest: Buffer,
    source: Double,
    `type`: java.lang.String,
    byteOrder: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined
  ): EncodeNumberDict = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(byteOrder)) __obj.updateDynamic("byteOrder")(byteOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeNumberDict]
  }
}

