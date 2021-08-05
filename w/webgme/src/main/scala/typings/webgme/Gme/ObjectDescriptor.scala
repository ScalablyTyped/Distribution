package typings.webgme.Gme

import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.Pointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDescriptor extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ObjectDescriptor](x: Self) {
    
    inline def setChildrenIds(value: js.Array[String]): Self = StObject.set(x, "childrenIds", value.asInstanceOf[js.Any])
    
    inline def setChildrenIdsVarargs(value: String*): Self = StObject.set(x, "childrenIds", js.Array(value :_*))
    
    inline def setChildrenNum(value: Double): Self = StObject.set(x, "childrenNum", value.asInstanceOf[js.Any])
    
    inline def setControl(value: VisualizerControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDstObjId(value: String): Self = StObject.set(x, "dstObjId", value.asInstanceOf[js.Any])
    
    inline def setDstPos(value: Pos2D): Self = StObject.set(x, "dstPos", value.asInstanceOf[js.Any])
    
    inline def setDstSubCompId(value: String): Self = StObject.set(x, "dstSubCompId", value.asInstanceOf[js.Any])
    
    inline def setDstSubCompIdUndefined: Self = StObject.set(x, "dstSubCompId", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsConnection(value: Boolean): Self = StObject.set(x, "isConnection", value.asInstanceOf[js.Any])
    
    inline def setMetaInfo(value: Dictionary[String]): Self = StObject.set(x, "metaInfo", value.asInstanceOf[js.Any])
    
    inline def setMetaInfoUndefined: Self = StObject.set(x, "metaInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: Dictionary[Pointer]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPreferencesHelper(value: PreferenceHelper): Self = StObject.set(x, "preferencesHelper", value.asInstanceOf[js.Any])
    
    inline def setPreferencesHelperUndefined: Self = StObject.set(x, "preferencesHelper", js.undefined)
    
    inline def setReconnectable(value: Boolean): Self = StObject.set(x, "reconnectable", value.asInstanceOf[js.Any])
    
    inline def setReconnectableUndefined: Self = StObject.set(x, "reconnectable", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSrcObjId(value: String): Self = StObject.set(x, "srcObjId", value.asInstanceOf[js.Any])
    
    inline def setSrcPos(value: Pos2D): Self = StObject.set(x, "srcPos", value.asInstanceOf[js.Any])
    
    inline def setSrcSubCompId(value: String): Self = StObject.set(x, "srcSubCompId", value.asInstanceOf[js.Any])
    
    inline def setSrcSubCompIdUndefined: Self = StObject.set(x, "srcSubCompId", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
