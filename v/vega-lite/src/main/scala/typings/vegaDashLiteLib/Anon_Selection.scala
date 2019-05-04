package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selection extends js.Object {
  /**
    * A [selection name](https://vega.github.io/vega-lite/docs/selection.html), or a series of [composed selections](https://vega.github.io/vega-lite/docs/selection.html#compose).
    */
  var selection: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[java.lang.String]
}

object Anon_Selection {
  @scala.inline
  def apply(selection: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[java.lang.String]): Anon_Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Selection]
  }
}

