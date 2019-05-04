package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgCollectTransform extends VgTransform {
  var sort: VgSort
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.collect
}

object VgCollectTransform {
  @scala.inline
  def apply(sort: VgSort, `type`: vegaDashLiteLib.vegaDashLiteLibStrings.collect): VgCollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgCollectTransform]
  }
}

