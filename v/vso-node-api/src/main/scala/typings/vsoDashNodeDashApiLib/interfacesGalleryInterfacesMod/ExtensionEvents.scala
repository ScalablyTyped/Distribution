package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEvents extends js.Object {
  /**
    * Generic container for events data. The dictionary key denotes the type of event and the list contains properties related to that event
    */
  var events: org.scalablytyped.runtime.StringDictionary[js.Array[ExtensionEvent]]
  /**
    * Id of the extension, this will never be sent back to the client. This field will mainly be used when EMS calls into Gallery REST API to update install/uninstall events for various extensions in one go.
    */
  var extensionId: java.lang.String
  /**
    * Name of the extension
    */
  var extensionName: java.lang.String
  /**
    * Name of the publisher
    */
  var publisherName: java.lang.String
}

object ExtensionEvents {
  @scala.inline
  def apply(
    events: org.scalablytyped.runtime.StringDictionary[js.Array[ExtensionEvent]],
    extensionId: java.lang.String,
    extensionName: java.lang.String,
    publisherName: java.lang.String
  ): ExtensionEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("extensionId")(extensionId)
    __obj.updateDynamic("extensionName")(extensionName)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.asInstanceOf[ExtensionEvents]
  }
}

