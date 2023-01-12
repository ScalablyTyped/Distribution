package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionEvents extends StObject {
  
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
  
  inline def apply(
    events: StringDictionary[js.Array[ExtensionEvent]],
    extensionId: String,
    extensionName: String,
    publisherName: String
  ): ExtensionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionEvents] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: StringDictionary[js.Array[ExtensionEvent]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
