package typings.webgme.Gme

import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectDescriptor extends js.Object {
  var childrenIds: js.Array[String] = js.native
  var childrenNum: Double = js.native
  var control: js.UndefOr[VisualizerControl] = js.native
  var dstObjId: String = js.native
  var dstPos: Pos2D = js.native
  var dstSubCompId: js.UndefOr[String] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var isConnection: Boolean = js.native
  var metaInfo: js.UndefOr[Dictionary[String]] = js.native
  var name: String = js.native
  var parentId: String = js.native
  var pointers: Dictionary[Pointer] = js.native
  var position: Double = js.native
  var preferencesHelper: js.UndefOr[PreferenceHelper] = js.native
  var reconnectable: js.UndefOr[Boolean] = js.native
  var source: String = js.native
  var srcObjId: String = js.native
  var srcPos: Pos2D = js.native
  var srcSubCompId: js.UndefOr[String] = js.native
  var target: String = js.native
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
    target: String
  ): ObjectDescriptor = {
    val __obj = js.Dynamic.literal(childrenIds = childrenIds.asInstanceOf[js.Any], childrenNum = childrenNum.asInstanceOf[js.Any], dstObjId = dstObjId.asInstanceOf[js.Any], dstPos = dstPos.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConnection = isConnection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], srcObjId = srcObjId.asInstanceOf[js.Any], srcPos = srcPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDescriptor]
  }
  @scala.inline
  implicit class ObjectDescriptorOps[Self <: ObjectDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenIdsVarargs(value: String*): Self = this.set("childrenIds", js.Array(value :_*))
    @scala.inline
    def setChildrenIds(value: js.Array[String]): Self = this.set("childrenIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenNum(value: Double): Self = this.set("childrenNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setDstObjId(value: String): Self = this.set("dstObjId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDstPos(value: Pos2D): Self = this.set("dstPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConnection(value: Boolean): Self = this.set("isConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointers(value: Dictionary[Pointer]): Self = this.set("pointers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcObjId(value: String): Self = this.set("srcObjId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcPos(value: Pos2D): Self = this.set("srcPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setControl(value: VisualizerControl): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setDstSubCompId(value: String): Self = this.set("dstSubCompId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDstSubCompId: Self = this.set("dstSubCompId", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setMetaInfo(value: Dictionary[String]): Self = this.set("metaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaInfo: Self = this.set("metaInfo", js.undefined)
    @scala.inline
    def setPreferencesHelper(value: PreferenceHelper): Self = this.set("preferencesHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferencesHelper: Self = this.set("preferencesHelper", js.undefined)
    @scala.inline
    def setReconnectable(value: Boolean): Self = this.set("reconnectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectable: Self = this.set("reconnectable", js.undefined)
    @scala.inline
    def setSrcSubCompId(value: String): Self = this.set("srcSubCompId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSubCompId: Self = this.set("srcSubCompId", js.undefined)
  }
  
}

