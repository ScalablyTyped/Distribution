package typings.vegaDashLite.buildSrcTransformMod

import typings.vegaDashLite.buildSrcBinMod.BinParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinTransform extends Transform {
  /**
    * The output fields at which to write the start and end bin values.
    */
  var as: String | js.Array[String]
  /**
    * An object indicating bin properties, or simply `true` for using default bin parameters.
    */
  var bin: Boolean | BinParams
  /**
    * The data field to bin.
    */
  var field: String
}

object BinTransform {
  @scala.inline
  def apply(as: String | js.Array[String], bin: Boolean | BinParams, field: String): BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field)
  
    __obj.asInstanceOf[BinTransform]
  }
}

