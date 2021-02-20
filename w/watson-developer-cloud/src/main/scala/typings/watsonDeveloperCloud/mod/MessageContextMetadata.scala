package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Metadata related to the message. */
@js.native
trait MessageContextMetadata extends StObject {
  
  /** A label identifying the deployment environment, used for filtering log data. This string cannot contain carriage return, newline, or tab characters. */
  var deployment: js.UndefOr[String] = js.native
  
  /** A string value that identifies the user who is interacting with the workspace. The client must provide a unique identifier for each individual end user who accesses the application. For Plus and Premium plans, this user ID is used to identify unique users for billing purposes. This string cannot contain carriage return, newline, or tab characters. */
  var user_id: js.UndefOr[String] = js.native
}
object MessageContextMetadata {
  
  @scala.inline
  def apply(): MessageContextMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextMetadata]
  }
  
  @scala.inline
  implicit class MessageContextMetadataMutableBuilder[Self <: MessageContextMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
