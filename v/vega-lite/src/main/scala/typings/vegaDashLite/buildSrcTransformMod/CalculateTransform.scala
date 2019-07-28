package typings.vegaDashLite.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculateTransform extends Transform {
  /**
    * The field for storing the computed formula value.
    */
  var as: String
  /**
    * A [expression](https://vega.github.io/vega-lite/docs/types.html#expression) string. Use the variable `datum` to refer to the current data object.
    */
  var calculate: String
}

object CalculateTransform {
  @scala.inline
  def apply(as: String, calculate: String): CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as, calculate = calculate)
  
    __obj.asInstanceOf[CalculateTransform]
  }
}

