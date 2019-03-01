package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  /**
    * The author of the change.
    */
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The type of change. "commit", "changeset", etc.
    */
  var changeType: java.lang.String
  /**
    * The location of a user-friendly representation of the resource.
    */
  var displayUri: java.lang.String
  /**
    * Something that identifies the change. For a commit, this would be the SHA1. For a TFVC changeset, this would be the changeset id.
    */
  var id: java.lang.String
  /**
    * The location of the full representation of the resource.
    */
  var location: java.lang.String
  /**
    * A description of the change. This might be a commit message or changeset description.
    */
  var message: java.lang.String
  /**
    * The person or process that pushed the change.
    */
  var pusher: java.lang.String
  /**
    * A timestamp for the change.
    */
  var timestamp: stdLib.Date
}

object Change {
  @scala.inline
  def apply(
    author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changeType: java.lang.String,
    displayUri: java.lang.String,
    id: java.lang.String,
    location: java.lang.String,
    message: java.lang.String,
    pusher: java.lang.String,
    timestamp: stdLib.Date
  ): Change = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("displayUri")(displayUri)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("pusher")(pusher)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Change]
  }
}

