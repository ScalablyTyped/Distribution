package typings.wechatMiniprogram.DB

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISnapshot extends StObject {
  
  var docChanges: js.Array[ISingleDBEvent]
  
  var docs: Record[String, js.Any]
  
  var id: Double
  
  var `type`: js.UndefOr[SnapshotType] = js.undefined
}
object ISnapshot {
  
  @scala.inline
  def apply(docChanges: js.Array[ISingleDBEvent], docs: Record[String, js.Any], id: Double): ISnapshot = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISnapshot]
  }
  
  @scala.inline
  implicit class ISnapshotMutableBuilder[Self <: ISnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocChanges(value: js.Array[ISingleDBEvent]): Self = StObject.set(x, "docChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocChangesVarargs(value: ISingleDBEvent*): Self = StObject.set(x, "docChanges", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: Record[String, js.Any]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SnapshotType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
