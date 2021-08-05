package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Publisher extends StObject {
  
  var displayName: String
  
  var emailAddress: js.Array[String]
  
  var extensions: js.Array[PublishedExtension]
  
  var flags: PublisherFlags
  
  var lastUpdated: Date
  
  var links: PublisherLinks
  
  var longDescription: String
  
  var publisherId: String
  
  var publisherName: String
  
  var shortDescription: String
}
object Publisher {
  
  inline def apply(
    displayName: String,
    emailAddress: js.Array[String],
    extensions: js.Array[PublishedExtension],
    flags: PublisherFlags,
    lastUpdated: Date,
    links: PublisherLinks,
    longDescription: String,
    publisherId: String,
    publisherName: String,
    shortDescription: String
  ): Publisher = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publisher]
  }
  
  extension [Self <: Publisher](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: js.Array[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressVarargs(value: String*): Self = StObject.set(x, "emailAddress", js.Array(value :_*))
    
    inline def setExtensions(value: js.Array[PublishedExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsVarargs(value: PublishedExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setFlags(value: PublisherFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: PublisherLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    inline def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
  }
}
