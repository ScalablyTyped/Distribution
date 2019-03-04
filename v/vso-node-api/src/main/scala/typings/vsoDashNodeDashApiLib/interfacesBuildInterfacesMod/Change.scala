package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * The author of the change.
    */
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The location of a user-friendly representation of the resource.
    */
  var displayUri: java.lang.String
  /**
    * The identifier for the change. For a commit, this would be the SHA1. For a TFVC changeset, this would be the changeset ID.
    */
  var id: java.lang.String
  /**
    * The location of the full representation of the resource.
    */
  var location: java.lang.String
  /**
    * The description of the change. This might be a commit message or changeset description.
    */
  var message: java.lang.String
  /**
    * Indicates whether the message was truncated.
    */
  var messageTruncated: scala.Boolean
  /**
    * The person or process that pushed the change.
    */
  var pusher: java.lang.String
  /**
    * The timestamp for the change.
    */
  var timestamp: stdLib.Date
  /**
    * The type of change. "commit", "changeset", etc.
    */
  var `type`: java.lang.String
}

object Change {
  @scala.inline
  def apply(
    author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    displayUri: java.lang.String,
    id: java.lang.String,
    location: java.lang.String,
    message: java.lang.String,
    messageTruncated: scala.Boolean,
    pusher: java.lang.String,
    timestamp: stdLib.Date,
    `type`: java.lang.String
  ): Change = {
    val __obj = js.Dynamic.literal(author = author, displayUri = displayUri, id = id, location = location, message = message, messageTruncated = messageTruncated, pusher = pusher, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Change]
  }
}

