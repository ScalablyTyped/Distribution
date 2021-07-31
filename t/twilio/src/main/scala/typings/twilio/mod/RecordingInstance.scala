package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ trait RecordingInstance
  extends StObject
     with ListableResource {
  
  def delete(args: js.Any): Promise[js.Any]
  def delete(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def delete(callback: RequestCallback): Promise[js.Any]
  @JSName("delete")
  var delete_Original: RestMethod
  
  var transcriptions: RecordingTranscriptionResource
}
object RecordingInstance {
  
  @scala.inline
  def apply(
    delete: RestMethod,
    get: RestMethod,
    list: RestMethod,
    transcriptions: RecordingTranscriptionResource
  ): RecordingInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], transcriptions = transcriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingInstance]
  }
  
  @scala.inline
  implicit class RecordingInstanceMutableBuilder[Self <: RecordingInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: RestMethod): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptions(value: RecordingTranscriptionResource): Self = StObject.set(x, "transcriptions", value.asInstanceOf[js.Any])
  }
}
