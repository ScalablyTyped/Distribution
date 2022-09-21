package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcItemRequestData extends StObject {
  
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  
  var itemDescriptors: js.Array[TfvcItemDescriptor]
}
object TfvcItemRequestData {
  
  inline def apply(
    includeContentMetadata: Boolean,
    includeLinks: Boolean,
    itemDescriptors: js.Array[TfvcItemDescriptor]
  ): TfvcItemRequestData = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemDescriptors = itemDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItemRequestData]
  }
  
  extension [Self <: TfvcItemRequestData](x: Self) {
    
    inline def setIncludeContentMetadata(value: Boolean): Self = StObject.set(x, "includeContentMetadata", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setItemDescriptors(value: js.Array[TfvcItemDescriptor]): Self = StObject.set(x, "itemDescriptors", value.asInstanceOf[js.Any])
    
    inline def setItemDescriptorsVarargs(value: TfvcItemDescriptor*): Self = StObject.set(x, "itemDescriptors", js.Array(value*))
  }
}
