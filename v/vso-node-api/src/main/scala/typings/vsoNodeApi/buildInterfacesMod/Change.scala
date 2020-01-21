package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * The author of the change.
    */
  var author: IdentityRef
  /**
    * The location of a user-friendly representation of the resource.
    */
  var displayUri: String
  /**
    * The identifier for the change. For a commit, this would be the SHA1. For a TFVC changeset, this would be the changeset ID.
    */
  var id: String
  /**
    * The location of the full representation of the resource.
    */
  var location: String
  /**
    * The description of the change. This might be a commit message or changeset description.
    */
  var message: String
  /**
    * Indicates whether the message was truncated.
    */
  var messageTruncated: Boolean
  /**
    * The person or process that pushed the change.
    */
  var pusher: String
  /**
    * The timestamp for the change.
    */
  var timestamp: Date
  /**
    * The type of change. "commit", "changeset", etc.
    */
  var `type`: String
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
}

