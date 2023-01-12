package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeListSearchCriteria extends StObject {
  
  /**
    * If provided, a version descriptor to compare against base
    */
  var compareVersion: String
  
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean
  
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean
  
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String
  
  /**
    * If provided, a version descriptor for the earliest change list to include
    */
  var fromVersion: String
  
  /**
    * Path of item to search under. If the itemPaths memebr is used then it will take precedence over this.
    */
  var itemPath: String
  
  /**
    * List of item paths to search under. If this member is used then itemPath will be ignored.
    */
  var itemPaths: js.Array[String]
  
  /**
    * Version of the items to search
    */
  var itemVersion: String
  
  /**
    * Number of results to skip (used when clicking more...)
    */
  var skip: Double
  
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String
  
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toVersion: String
  
  /**
    * If provided, the maximum number of history entries to return
    */
  var top: Double
  
  /**
    * Alias or display name of user who made the changes
    */
  var user: String
}
object ChangeListSearchCriteria {
  
  inline def apply(
    compareVersion: String,
    excludeDeletes: Boolean,
    followRenames: Boolean,
    fromDate: String,
    fromVersion: String,
    itemPath: String,
    itemPaths: js.Array[String],
    itemVersion: String,
    skip: Double,
    toDate: String,
    toVersion: String,
    top: Double,
    user: String
  ): ChangeListSearchCriteria = {
    val __obj = js.Dynamic.literal(compareVersion = compareVersion.asInstanceOf[js.Any], excludeDeletes = excludeDeletes.asInstanceOf[js.Any], followRenames = followRenames.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], fromVersion = fromVersion.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], itemPaths = itemPaths.asInstanceOf[js.Any], itemVersion = itemVersion.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toVersion = toVersion.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeListSearchCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeListSearchCriteria] (val x: Self) extends AnyVal {
    
    inline def setCompareVersion(value: String): Self = StObject.set(x, "compareVersion", value.asInstanceOf[js.Any])
    
    inline def setExcludeDeletes(value: Boolean): Self = StObject.set(x, "excludeDeletes", value.asInstanceOf[js.Any])
    
    inline def setFollowRenames(value: Boolean): Self = StObject.set(x, "followRenames", value.asInstanceOf[js.Any])
    
    inline def setFromDate(value: String): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    inline def setFromVersion(value: String): Self = StObject.set(x, "fromVersion", value.asInstanceOf[js.Any])
    
    inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
    
    inline def setItemPaths(value: js.Array[String]): Self = StObject.set(x, "itemPaths", value.asInstanceOf[js.Any])
    
    inline def setItemPathsVarargs(value: String*): Self = StObject.set(x, "itemPaths", js.Array(value*))
    
    inline def setItemVersion(value: String): Self = StObject.set(x, "itemVersion", value.asInstanceOf[js.Any])
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: String): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    inline def setToVersion(value: String): Self = StObject.set(x, "toVersion", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
