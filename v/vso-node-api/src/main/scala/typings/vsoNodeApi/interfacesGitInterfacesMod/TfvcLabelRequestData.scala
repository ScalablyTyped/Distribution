package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcLabelRequestData extends StObject {
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  
  var itemLabelFilter: String
  
  var labelScope: String
  
  var maxItemCount: Double
  
  var name: String
  
  var owner: String
}
object TfvcLabelRequestData {
  
  inline def apply(
    includeLinks: Boolean,
    itemLabelFilter: String,
    labelScope: String,
    maxItemCount: Double,
    name: String,
    owner: String
  ): TfvcLabelRequestData = {
    val __obj = js.Dynamic.literal(includeLinks = includeLinks.asInstanceOf[js.Any], itemLabelFilter = itemLabelFilter.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], maxItemCount = maxItemCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcLabelRequestData]
  }
  
  extension [Self <: TfvcLabelRequestData](x: Self) {
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setItemLabelFilter(value: String): Self = StObject.set(x, "itemLabelFilter", value.asInstanceOf[js.Any])
    
    inline def setLabelScope(value: String): Self = StObject.set(x, "labelScope", value.asInstanceOf[js.Any])
    
    inline def setMaxItemCount(value: Double): Self = StObject.set(x, "maxItemCount", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
