package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcChangesetSearchCriteria extends StObject {
  
  /**
    * Alias or display name of user who made the changes
    */
  var author: String = js.native
  
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean = js.native
  
  /**
    * If provided, only include changesets created after this date (string) Think of a better name for this.
    */
  var fromDate: String = js.native
  
  /**
    * If provided, only include changesets after this changesetID
    */
  var fromId: Double = js.native
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  
  /**
    * Path of item to search under
    */
  var itemPath: String = js.native
  
  /**
    * If provided, only include changesets created before this date (string) Think of a better name for this.
    */
  var toDate: String = js.native
  
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toId: Double = js.native
}
object TfvcChangesetSearchCriteria {
  
  @scala.inline
  def apply(
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
  implicit class TfvcChangesetSearchCriteriaMutableBuilder[Self <: TfvcChangesetSearchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRenames(value: Boolean): Self = StObject.set(x, "followRenames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDate(value: String): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromId(value: Double): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDate(value: String): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToId(value: Double): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
  }
}
