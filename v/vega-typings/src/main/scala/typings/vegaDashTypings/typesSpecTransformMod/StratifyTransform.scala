package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.vegaDashTypingsStrings.stratify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StratifyTransform extends _Transforms {
  var key: FieldRef
  var parentKey: FieldRef
  var `type`: stratify
}

object StratifyTransform {
  @scala.inline
  def apply(key: FieldRef, parentKey: FieldRef, `type`: stratify): StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StratifyTransform]
  }
}

