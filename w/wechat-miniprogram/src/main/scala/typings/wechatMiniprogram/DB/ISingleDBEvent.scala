package typings.wechatMiniprogram.DB

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISingleDBEvent extends StObject {
  
  var dataType: DataType
  
  var doc: Record[String, js.Any]
  
  var docId: String
  
  var id: Double
  
  var queueType: QueueType
  
  var removedFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var updatedFields: js.UndefOr[Record[String, js.Any]] = js.undefined
}
object ISingleDBEvent {
  
  @scala.inline
  def apply(dataType: DataType, doc: Record[String, js.Any], docId: String, id: Double, queueType: QueueType): ISingleDBEvent = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], docId = docId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueType = queueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleDBEvent]
  }
  
  @scala.inline
  implicit class ISingleDBEventMutableBuilder[Self <: ISingleDBEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc(value: Record[String, js.Any]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocId(value: String): Self = StObject.set(x, "docId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueType(value: QueueType): Self = StObject.set(x, "queueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedFields(value: js.Array[String]): Self = StObject.set(x, "removedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedFieldsUndefined: Self = StObject.set(x, "removedFields", js.undefined)
    
    @scala.inline
    def setRemovedFieldsVarargs(value: String*): Self = StObject.set(x, "removedFields", js.Array(value :_*))
    
    @scala.inline
    def setUpdatedFields(value: Record[String, js.Any]): Self = StObject.set(x, "updatedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedFieldsUndefined: Self = StObject.set(x, "updatedFields", js.undefined)
  }
}
