package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgFilterTransform extends VgTransform {
  var expr: String
  var `type`: filter
}

object VgFilterTransform {
  @scala.inline
  def apply(expr: String, `type`: filter): VgFilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgFilterTransform]
  }
}

