package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionFilterResultMetadata extends StObject {
  
  /**
    * The metadata items for the category
    */
  var metadataItems: js.Array[MetadataItem]
  
  /**
    * Defines the category of metadata items
    */
  var metadataType: String
}
object ExtensionFilterResultMetadata {
  
  inline def apply(metadataItems: js.Array[MetadataItem], metadataType: String): ExtensionFilterResultMetadata = {
    val __obj = js.Dynamic.literal(metadataItems = metadataItems.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFilterResultMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionFilterResultMetadata] (val x: Self) extends AnyVal {
    
    inline def setMetadataItems(value: js.Array[MetadataItem]): Self = StObject.set(x, "metadataItems", value.asInstanceOf[js.Any])
    
    inline def setMetadataItemsVarargs(value: MetadataItem*): Self = StObject.set(x, "metadataItems", js.Array(value*))
    
    inline def setMetadataType(value: String): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
  }
}
