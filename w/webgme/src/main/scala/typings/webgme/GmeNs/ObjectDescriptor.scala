package typings.webgme.GmeNs

import typings.webgme.GmeCommonNs.Dictionary
import typings.webgme.GmeCommonNs.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectDescriptor extends js.Object {
  var childrenIds: js.Array[String]
  var childrenNum: Double
  var control: js.UndefOr[VisualizerControl] = js.undefined
  var dstObjId: String
  var dstPos: Pos2D
  var dstSubCompId: js.UndefOr[String] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var id: String
  var isConnection: Boolean
  var metaInfo: js.UndefOr[Dictionary[String]] = js.undefined
  var name: String
  var parentId: String
  var pointers: Dictionary[Pointer]
  var position: Double
  var preferencesHelper: js.UndefOr[PreferenceHelper] = js.undefined
  var reconnectable: js.UndefOr[Boolean] = js.undefined
  var source: String
  var srcObjId: String
  var srcPos: Pos2D
  var srcSubCompId: js.UndefOr[String] = js.undefined
  var target: String
}

object ObjectDescriptor {
  @scala.inline
  def apply(
    childrenIds: js.Array[String],
    childrenNum: Double,
    dstObjId: String,
    dstPos: Pos2D,
    id: String,
    isConnection: Boolean,
    name: String,
    parentId: String,
    pointers: Dictionary[Pointer],
    position: Double,
    source: String,
    srcObjId: String,
    srcPos: Pos2D,
    target: String,
    control: VisualizerControl = null,
    dstSubCompId: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    metaInfo: Dictionary[String] = null,
    preferencesHelper: PreferenceHelper = null,
    reconnectable: js.UndefOr[Boolean] = js.undefined,
    srcSubCompId: String = null
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

