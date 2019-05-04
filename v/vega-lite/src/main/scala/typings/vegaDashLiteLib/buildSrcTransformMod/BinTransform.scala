package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinTransform extends Transform {
  /**
    * The output fields at which to write the start and end bin values.
    */
  var as: java.lang.String | js.Array[java.lang.String]
  /**
    * An object indicating bin properties, or simply `true` for using default bin parameters.
    */
  var bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams
  /**
    * The data field to bin.
    */
  var field: java.lang.String
}

object BinTransform {
  @scala.inline
  def apply(
    as: java.lang.String | js.Array[java.lang.String],
    bin: scala.Boolean | vegaDashLiteLib.buildSrcBinMod.BinParams,
    field: java.lang.String
  ): BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field)
  
    __obj.asInstanceOf[BinTransform]
  }
}

