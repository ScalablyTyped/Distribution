package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculateTransform extends Transform {
  /**
    * The field for storing the computed formula value.
    */
  var as: java.lang.String
  /**
    * A [expression](https://vega.github.io/vega-lite/docs/types.html#expression) string. Use the variable `datum` to refer to the current data object.
    */
  var calculate: java.lang.String
}

object CalculateTransform {
  @scala.inline
  def apply(as: java.lang.String, calculate: java.lang.String): CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as, calculate = calculate)
  
    __obj.asInstanceOf[CalculateTransform]
  }
}

