package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEvents extends js.Object {
  /**
    * Generic container for events data. The dictionary key denotes the type of event and the list contains properties related to that event
    */
  var events: StringDictionary[js.Array[ExtensionEvent]]
  /**
    * Id of the extension, this will never be sent back to the client. This field will mainly be used when EMS calls into Gallery REST API to update install/uninstall events for various extensions in one go.
    */
  var extensionId: String
  /**
    * Name of the extension
    */
  var extensionName: String
  /**
    * Name of the publisher
    */
  var publisherName: String
}

object ExtensionEvents {
  @scala.inline
  def apply(
    events: StringDictionary[js.Array[ExtensionEvent]],
    extensionId: String,
    extensionName: String,
    publisherName: String
  ): ExtensionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvents]
  }
}

