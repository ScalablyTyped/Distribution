package typings.vsoNodeApi.interfacesTfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcShelvesetRequestData extends StObject {
  
  /**
    * Whether to include policyOverride and notes Only applies when requesting a single deep shelveset
    */
  var includeDetails: Boolean
  
  /**
    * Whether to include the _links field on the shallow references. Does not apply when requesting a single deep shelveset object. Links will always be included in the deep shelveset.
    */
  var includeLinks: Boolean
  
  /**
    * Whether to include workItems
    */
  var includeWorkItems: Boolean
  
  /**
    * Max number of changes to include
    */
  var maxChangeCount: Double
  
  /**
    * Max length of comment
    */
  var maxCommentLength: Double
  
  /**
    * Shelveset's name
    */
  var name: String
  
  /**
    * Owner's ID. Could be a name or a guid.
    */
  var owner: String
}
object TfvcShelvesetRequestData {
  
  inline def apply(
    includeDetails: Boolean,
    includeLinks: Boolean,
    includeWorkItems: Boolean,
    maxChangeCount: Double,
    maxCommentLength: Double,
    name: String,
    owner: String
  ): TfvcShelvesetRequestData = {
    val __obj = js.Dynamic.literal(includeDetails = includeDetails.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], includeWorkItems = includeWorkItems.asInstanceOf[js.Any], maxChangeCount = maxChangeCount.asInstanceOf[js.Any], maxCommentLength = maxCommentLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelvesetRequestData]
  }
  
  extension [Self <: TfvcShelvesetRequestData](x: Self) {
    
    inline def setIncludeDetails(value: Boolean): Self = StObject.set(x, "includeDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setIncludeWorkItems(value: Boolean): Self = StObject.set(x, "includeWorkItems", value.asInstanceOf[js.Any])
    
    inline def setMaxChangeCount(value: Double): Self = StObject.set(x, "maxChangeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCommentLength(value: Double): Self = StObject.set(x, "maxCommentLength", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
  }
}
