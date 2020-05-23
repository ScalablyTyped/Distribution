package typings.yaml.mod.scalarOptions

import typings.yaml.typesMod.Scalar.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binary extends js.Object {
  /**
    * The type of string literal used to stringify `!!binary` values.
    *
    * Default: `'BLOCK_LITERAL'`
    */
  var defaultType: Type
  /**
    * Maximum line width for `!!binary`.
    *
    * Default: `76`
    */
  var lineWidth: Double
}

object Binary {
  @scala.inline
  def apply(defaultType: Type, lineWidth: Double): Binary = {
    val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

