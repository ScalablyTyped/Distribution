package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector4
import typings.vegaTypings.vegaTypingsStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeTransform extends _Transforms {
  var as: js.UndefOr[(Vector4[String | SignalRef]) | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var method: js.UndefOr[TreeMethod | SignalRef] = js.undefined
  var nodeSize: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var separation: js.UndefOr[Boolean | SignalRef] = js.undefined
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: tree
}

object TreeTransform {
  @scala.inline
  def apply(
    `type`: tree,
    as: (Vector4[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    method: TreeMethod | SignalRef = null,
    nodeSize: (Vector2[Double | SignalRef]) | SignalRef = null,
    separation: Boolean | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (separation != null) __obj.updateDynamic("separation")(separation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTransform]
  }
}

