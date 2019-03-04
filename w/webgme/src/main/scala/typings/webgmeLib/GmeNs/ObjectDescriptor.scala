package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectDescriptor extends js.Object {
  var childrenIds: js.Array[java.lang.String]
  var childrenNum: scala.Double
  var control: js.UndefOr[VisualizerControl] = js.undefined
  var dstObjId: java.lang.String
  var dstPos: Pos2D
  var dstSubCompId: js.UndefOr[java.lang.String] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var isConnection: scala.Boolean
  var metaInfo: js.UndefOr[webgmeLib.GmeCommonNs.Dictionary[java.lang.String]] = js.undefined
  var name: java.lang.String
  var parentId: java.lang.String
  var pointers: webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeCommonNs.Pointer]
  var position: scala.Double
  var preferencesHelper: js.UndefOr[PreferenceHelper] = js.undefined
  var reconnectable: js.UndefOr[scala.Boolean] = js.undefined
  var source: java.lang.String
  var srcObjId: java.lang.String
  var srcPos: Pos2D
  var srcSubCompId: js.UndefOr[java.lang.String] = js.undefined
  var target: java.lang.String
}

object ObjectDescriptor {
  @scala.inline
  def apply(
    childrenIds: js.Array[java.lang.String],
    childrenNum: scala.Double,
    dstObjId: java.lang.String,
    dstPos: Pos2D,
    id: java.lang.String,
    isConnection: scala.Boolean,
    name: java.lang.String,
    parentId: java.lang.String,
    pointers: webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeCommonNs.Pointer],
    position: scala.Double,
    source: java.lang.String,
    srcObjId: java.lang.String,
    srcPos: Pos2D,
    target: java.lang.String,
    control: VisualizerControl = null,
    dstSubCompId: java.lang.String = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    metaInfo: webgmeLib.GmeCommonNs.Dictionary[java.lang.String] = null,
    preferencesHelper: PreferenceHelper = null,
    reconnectable: js.UndefOr[scala.Boolean] = js.undefined,
    srcSubCompId: java.lang.String = null
  ): ObjectDescriptor = {
    val __obj = js.Dynamic.literal(childrenIds = childrenIds, childrenNum = childrenNum, dstObjId = dstObjId, dstPos = dstPos, id = id, isConnection = isConnection, name = name, parentId = parentId, pointers = pointers, position = position, source = source, srcObjId = srcObjId, srcPos = srcPos, target = target)
    if (control != null) __obj.updateDynamic("control")(control)
    if (dstSubCompId != null) __obj.updateDynamic("dstSubCompId")(dstSubCompId)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (metaInfo != null) __obj.updateDynamic("metaInfo")(metaInfo)
    if (preferencesHelper != null) __obj.updateDynamic("preferencesHelper")(preferencesHelper)
    if (!js.isUndefined(reconnectable)) __obj.updateDynamic("reconnectable")(reconnectable)
    if (srcSubCompId != null) __obj.updateDynamic("srcSubCompId")(srcSubCompId)
    __obj.asInstanceOf[ObjectDescriptor]
  }
}

