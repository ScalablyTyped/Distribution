package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * The author of the change.
    */
  var author: IdentityRef
  /**
    * The type of change. "commit", "changeset", etc.
    */
  var changeType: String
  /**
    * The location of a user-friendly representation of the resource.
    */
  var displayUri: String
  /**
    * Something that identifies the change. For a commit, this would be the SHA1. For a TFVC changeset, this would be the changeset id.
    */
  var id: String
  /**
    * The location of the full representation of the resource.
    */
  var location: String
  /**
    * A description of the change. This might be a commit message or changeset description.
    */
  var message: String
  /**
    * The person or process that pushed the change.
    */
  var pusher: String
  /**
    * A timestamp for the change.
    */
  var timestamp: Date
}

object Change {
  @scala.inline
  def apply(
    author: IdentityRef,
    changeType: String,
    displayUri: String,
    id: String,
    location: String,
    message: String,
    pusher: String,
    timestamp: Date
  ): Change = {
    val __obj = js.Dynamic.literal(author = author, changeType = changeType, displayUri = displayUri, id = id, location = location, message = message, pusher = pusher, timestamp = timestamp)
  
    __obj.asInstanceOf[Change]
  }
}

