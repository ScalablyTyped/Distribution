package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.linkpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkPathTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var orient: js.UndefOr[LinkPathOrient | SignalRef] = js.undefined
  var require: js.UndefOr[SignalRef] = js.undefined
  var shape: js.UndefOr[LinkPathShape | SignalRef] = js.undefined
  var sourceX: js.UndefOr[FieldRef] = js.undefined
  var sourceY: js.UndefOr[FieldRef] = js.undefined
  var targetX: js.UndefOr[FieldRef] = js.undefined
  var targetY: js.UndefOr[FieldRef] = js.undefined
  var `type`: linkpath
}

object LinkPathTransform {
  @scala.inline
  def apply(
    `type`: linkpath,
    as: String | SignalRef = null,
    orient: LinkPathOrient | SignalRef = null,
    require: SignalRef = null,
    shape: LinkPathShape | SignalRef = null,
    sourceX: FieldRef = null,
    sourceY: FieldRef = null,
    targetX: FieldRef = null,
    targetY: FieldRef = null
  ): LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (sourceX != null) __obj.updateDynamic("sourceX")(sourceX.asInstanceOf[js.Any])
    if (sourceY != null) __obj.updateDynamic("sourceY")(sourceY.asInstanceOf[js.Any])
    if (targetX != null) __obj.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
    if (targetY != null) __obj.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkPathTransform]
  }
}

