package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgFilterTransform extends VgTransform {
  var expr: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.filter
}

object VgFilterTransform {
  @scala.inline
  def apply(expr: java.lang.String, `type`: vegaDashLiteLib.vegaDashLiteLibStrings.filter): VgFilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgFilterTransform]
  }
}

