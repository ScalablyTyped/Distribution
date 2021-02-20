package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedExtension extends StObject {
  
  /**
    * Unique Identifier for this extension
    */
  var extension: String = js.native
  
  /**
    * Unique Identifier for this publisher
    */
  var publisher: String = js.native
  
  /**
    * Supported version for this extension
    */
  var version: String = js.native
}
object SupportedExtension {
  
  @scala.inline
  def apply(extension: String, publisher: String, version: String): SupportedExtension = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedExtension]
  }
  
  @scala.inline
  implicit class SupportedExtensionMutableBuilder[Self <: SupportedExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
