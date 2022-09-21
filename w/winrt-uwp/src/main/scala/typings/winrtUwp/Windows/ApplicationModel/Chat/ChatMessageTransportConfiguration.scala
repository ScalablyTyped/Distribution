package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data about the chat message transport. */
trait ChatMessageTransportConfiguration extends StObject {
  
  /** Gets the extended properties of the transport. */
  var extendedProperties: IMapView[String, Any]
  
  /** Gets the maximum attachment limit for a message on the transport. */
  var maxAttachmentCount: Double
  
  /** Gets the maximum size of an attachment for the transport. */
  var maxMessageSizeInKilobytes: Double
  
  /** Gets the maximum number of recipients for the transport. */
  var maxRecipientCount: Double
  
  /** Gets the supported video encoding format for the transport. */
  var supportedVideoFormat: MediaEncodingProfile
}
object ChatMessageTransportConfiguration {
  
  inline def apply(
    extendedProperties: IMapView[String, Any],
    maxAttachmentCount: Double,
    maxMessageSizeInKilobytes: Double,
    maxRecipientCount: Double,
    supportedVideoFormat: MediaEncodingProfile
  ): ChatMessageTransportConfiguration = {
    val __obj = js.Dynamic.literal(extendedProperties = extendedProperties.asInstanceOf[js.Any], maxAttachmentCount = maxAttachmentCount.asInstanceOf[js.Any], maxMessageSizeInKilobytes = maxMessageSizeInKilobytes.asInstanceOf[js.Any], maxRecipientCount = maxRecipientCount.asInstanceOf[js.Any], supportedVideoFormat = supportedVideoFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageTransportConfiguration]
  }
  
  extension [Self <: ChatMessageTransportConfiguration](x: Self) {
    
    inline def setExtendedProperties(value: IMapView[String, Any]): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxAttachmentCount(value: Double): Self = StObject.set(x, "maxAttachmentCount", value.asInstanceOf[js.Any])
    
    inline def setMaxMessageSizeInKilobytes(value: Double): Self = StObject.set(x, "maxMessageSizeInKilobytes", value.asInstanceOf[js.Any])
    
    inline def setMaxRecipientCount(value: Double): Self = StObject.set(x, "maxRecipientCount", value.asInstanceOf[js.Any])
    
    inline def setSupportedVideoFormat(value: MediaEncodingProfile): Self = StObject.set(x, "supportedVideoFormat", value.asInstanceOf[js.Any])
  }
}
