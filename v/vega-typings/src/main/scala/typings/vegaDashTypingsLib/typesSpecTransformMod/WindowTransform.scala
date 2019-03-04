package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowTransform extends _Transforms {
  var as: js.UndefOr[
    (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var fields: js.UndefOr[
    (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var frame: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var groupby: js.UndefOr[
    (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var ignorePeers: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var ops: js.UndefOr[
    js.Array[AggregateOp | WindowOnlyOp | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]
  ] = js.undefined
  var params: js.UndefOr[
    (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var sort: js.UndefOr[vegaDashTypingsLib.typesSpecMarkMod.Compare] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.window
}

object WindowTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.window,
    as: (js.Array[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    fields: (js.Array[java.lang.String | TransformField | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    frame: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    groupby: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    ignorePeers: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    ops: js.Array[AggregateOp | WindowOnlyOp | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = null,
    params: (js.Array[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | scala.Null]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    sort: vegaDashTypingsLib.typesSpecMarkMod.Compare = null
  ): WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (ignorePeers != null) __obj.updateDynamic("ignorePeers")(ignorePeers.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[WindowTransform]
  }
}

