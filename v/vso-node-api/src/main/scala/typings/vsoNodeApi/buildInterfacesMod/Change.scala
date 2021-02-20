package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends StObject {
  
  /**
    * The author of the change.
    */
  var author: IdentityRef = js.native
  
  /**
    * The location of a user-friendly representation of the resource.
    */
  var displayUri: String = js.native
  
  /**
    * The identifier for the change. For a commit, this would be the SHA1. For a TFVC changeset, this would be the changeset ID.
    */
  var id: String = js.native
  
  /**
    * The location of the full representation of the resource.
    */
  var location: String = js.native
  
  /**
    * The description of the change. This might be a commit message or changeset description.
    */
  var message: String = js.native
  
  /**
    * Indicates whether the message was truncated.
    */
  var messageTruncated: Boolean = js.native
  
  /**
    * The person or process that pushed the change.
    */
  var pusher: String = js.native
  
  /**
    * The timestamp for the change.
    */
  var timestamp: Date = js.native
  
  /**
    * The type of change. "commit", "changeset", etc.
    */
  var `type`: String = js.native
}
object Change {
  
  @scala.inline
  def apply(
    author: IdentityRef,
    displayUri: String,
    id: String,
    location: String,
    message: String,
    messageTruncated: Boolean,
    pusher: String,
    timestamp: Date,
    `type`: String
  ): Change = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], displayUri = displayUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageTruncated = messageTruncated.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUri(value: String): Self = StObject.set(x, "displayUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTruncated(value: Boolean): Self = StObject.set(x, "messageTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
