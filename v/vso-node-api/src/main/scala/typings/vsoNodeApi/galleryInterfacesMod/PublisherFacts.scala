package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherFacts extends StObject {
  
  var displayName: String
  
  var flags: PublisherFlags
  
  var publisherId: String
  
  var publisherName: String
}
object PublisherFacts {
  
  @scala.inline
  def apply(displayName: String, flags: PublisherFlags, publisherId: String, publisherName: String): PublisherFacts = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherFacts]
  }
  
  @scala.inline
  implicit class PublisherFactsMutableBuilder[Self <: PublisherFacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: PublisherFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
