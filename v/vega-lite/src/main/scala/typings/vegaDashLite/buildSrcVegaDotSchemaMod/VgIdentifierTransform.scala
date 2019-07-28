package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgIdentifierTransform extends VgTransform {
  var as: String
  var `type`: identifier
}

object VgIdentifierTransform {
  @scala.inline
  def apply(as: String, `type`: identifier): VgIdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgIdentifierTransform]
  }
}

