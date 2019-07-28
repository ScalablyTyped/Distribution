package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecMarkMod.Compare
import typings.vegaDashTypings.vegaDashTypingsStrings.collect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectTransform extends _Transforms {
  var sort: Compare
  var `type`: collect
}

object CollectTransform {
  @scala.inline
  def apply(sort: Compare, `type`: collect): CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CollectTransform]
  }
}

