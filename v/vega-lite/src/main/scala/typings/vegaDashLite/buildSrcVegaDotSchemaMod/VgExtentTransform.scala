package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgExtentTransform extends VgTransform {
  var field: String
  var signal: String
  var `type`: extent
}

object VgExtentTransform {
  @scala.inline
  def apply(field: String, signal: String, `type`: extent): VgExtentTransform = {
    val __obj = js.Dynamic.literal(field = field, signal = signal)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgExtentTransform]
  }
}

