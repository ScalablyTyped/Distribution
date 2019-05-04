package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgIdentifierTransform extends VgTransform {
  var as: java.lang.String
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.identifier
}

object VgIdentifierTransform {
  @scala.inline
  def apply(as: java.lang.String, `type`: vegaDashLiteLib.vegaDashLiteLibStrings.identifier): VgIdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgIdentifierTransform]
  }
}

