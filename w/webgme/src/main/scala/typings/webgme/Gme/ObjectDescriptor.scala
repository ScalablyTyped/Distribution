package typings.webgme.Gme

import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.Pointer
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
    val __obj = js.Dynamic.literal(childrenIds = childrenIds.asInstanceOf[js.Any], childrenNum = childrenNum.asInstanceOf[js.Any], dstObjId = dstObjId.asInstanceOf[js.Any], dstPos = dstPos.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConnection = isConnection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], srcObjId = srcObjId.asInstanceOf[js.Any], srcPos = srcPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (dstSubCompId != null) __obj.updateDynamic("dstSubCompId")(dstSubCompId.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (metaInfo != null) __obj.updateDynamic("metaInfo")(metaInfo.asInstanceOf[js.Any])
    if (preferencesHelper != null) __obj.updateDynamic("preferencesHelper")(preferencesHelper.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectable)) __obj.updateDynamic("reconnectable")(reconnectable.get.asInstanceOf[js.Any])
    if (srcSubCompId != null) __obj.updateDynamic("srcSubCompId")(srcSubCompId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDescriptor]
  }
}

