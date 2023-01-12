package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcChangesetSearchCriteria extends StObject {
  
  /**
    * Alias or display name of user who made the changes
    */
  var author: String
  
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean
  
  /**
    * If provided, only include changesets created after this date (string) Think of a better name for this.
    */
  var fromDate: String
  
  /**
    * If provided, only include changesets after this changesetID
    */
  var fromId: Double
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  
  /**
    * Path of item to search under
    */
  var itemPath: String
  
  /**
    * If provided, only include changesets created before this date (string) Think of a better name for this.
    */
  var toDate: String
  
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toId: Double
}
object TfvcChangesetSearchCriteria {
  
  inline def apply(
    author: String,
    followRenames: Boolean,
    fromDate: String,
    fromId: Double,
    includeLinks: Boolean,
    itemPath: String,
    toDate: String,
    toId: Double
  ): TfvcChangesetSearchCriteria = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], followRenames = followRenames.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], fromId = fromId.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcChangesetSearchCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TfvcChangesetSearchCriteria] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setFollowRenames(value: Boolean): Self = StObject.set(x, "followRenames", value.asInstanceOf[js.Any])
    
    inline def setFromDate(value: String): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromId(value: Double): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: String): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToId(value: Double): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
  }
}
