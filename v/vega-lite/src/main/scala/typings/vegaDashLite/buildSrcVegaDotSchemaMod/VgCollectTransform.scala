package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.collect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgCollectTransform extends VgTransform {
  var sort: VgSort
  var `type`: collect
}

object VgCollectTransform {
  @scala.inline
  def apply(sort: VgSort, `type`: collect): VgCollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VgCollectTransform]
  }
}

