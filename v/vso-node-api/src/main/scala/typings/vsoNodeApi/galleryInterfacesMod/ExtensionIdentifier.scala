package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionIdentifier extends StObject {
  
  /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
  var extensionName: String
  
  /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
  var publisherName: String
}
object ExtensionIdentifier {
  
  @scala.inline
  def apply(extensionName: String, publisherName: String): ExtensionIdentifier = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionIdentifier]
  }
  
  @scala.inline
  implicit class ExtensionIdentifierMutableBuilder[Self <: ExtensionIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
