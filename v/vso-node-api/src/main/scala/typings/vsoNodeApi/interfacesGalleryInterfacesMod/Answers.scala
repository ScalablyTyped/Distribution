package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Answers extends StObject {
  
  /**
    * Gets or sets the vs marketplace extension name
    */
  var vSMarketplaceExtensionName: String
  
  /**
    * Gets or sets the vs marketplace publsiher name
    */
  var vSMarketplacePublisherName: String
}
object Answers {
  
  inline def apply(vSMarketplaceExtensionName: String, vSMarketplacePublisherName: String): Answers = {
    val __obj = js.Dynamic.literal(vSMarketplaceExtensionName = vSMarketplaceExtensionName.asInstanceOf[js.Any], vSMarketplacePublisherName = vSMarketplacePublisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Answers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Answers] (val x: Self) extends AnyVal {
    
    inline def setVSMarketplaceExtensionName(value: String): Self = StObject.set(x, "vSMarketplaceExtensionName", value.asInstanceOf[js.Any])
    
    inline def setVSMarketplacePublisherName(value: String): Self = StObject.set(x, "vSMarketplacePublisherName", value.asInstanceOf[js.Any])
  }
}
