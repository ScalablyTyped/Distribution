package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInstance
  extends StObject
     with InstanceResource {
  
  var feedback: CallFeedbackResource
  
  var notifications: CallNotificationResource
  
  var recordings: CallRecordingResource
}
object CallInstance {
  
  @scala.inline
  def apply(
    delete: RestMethod,
    feedback: CallFeedbackResource,
    get: RestMethod,
    notifications: CallNotificationResource,
    post: RestMethod,
    recordings: CallRecordingResource,
    update: RestMethod
  ): CallInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], recordings = recordings.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInstance]
  }
  
  @scala.inline
  implicit class CallInstanceMutableBuilder[Self <: CallInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedback(value: CallFeedbackResource): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: CallNotificationResource): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordings(value: CallRecordingResource): Self = StObject.set(x, "recordings", value.asInstanceOf[js.Any])
  }
}
