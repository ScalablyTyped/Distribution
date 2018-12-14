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

