package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgExtentTransform extends VgTransform {
  var field: java.lang.String
  var signal: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.extent
}

object VgExtentTransform {
  @scala.inline
  def apply(
    field: java.lang.String,
    signal: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.extent
  ): VgExtentTransform = {
    val __obj = js.Dynamic.literal(field = field, signal = signal)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgExtentTransform]
  }
}

