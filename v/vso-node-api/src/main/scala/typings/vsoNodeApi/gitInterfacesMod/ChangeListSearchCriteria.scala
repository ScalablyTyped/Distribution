package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeListSearchCriteria extends js.Object {
  
  /**
    * If provided, a version descriptor to compare against base
    */
  var compareVersion: String = js.native
  
  /**
    * If true, don't include delete history entries
    */
  var excludeDeletes: Boolean = js.native
  
  /**
    * Whether or not to follow renames for the given item being queried
    */
  var followRenames: Boolean = js.native
  
  /**
    * If provided, only include history entries created after this date (string)
    */
  var fromDate: String = js.native
  
  /**
    * If provided, a version descriptor for the earliest change list to include
    */
  var fromVersion: String = js.native
  
  /**
    * Path of item to search under. If the itemPaths memebr is used then it will take precedence over this.
    */
  var itemPath: String = js.native
  
  /**
    * List of item paths to search under. If this member is used then itemPath will be ignored.
    */
  var itemPaths: js.Array[String] = js.native
  
  /**
    * Version of the items to search
    */
  var itemVersion: String = js.native
  
  /**
    * Number of results to skip (used when clicking more...)
    */
  var skip: Double = js.native
  
  /**
    * If provided, only include history entries created before this date (string)
    */
  var toDate: String = js.native
  
  /**
    * If provided, a version descriptor for the latest change list to include
    */
  var toVersion: String = js.native
  
  /**
    * If provided, the maximum number of history entries to return
    */
  var top: Double = js.native
  
  /**
    * Alias or display name of user who made the changes
    */
  var user: String = js.native
}
object ChangeListSearchCriteria {
  
  @scala.inline
  def apply(
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
  implicit class ChangeListSearchCriteriaOps[Self <: ChangeListSearchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompareVersion(value: String): Self = this.set("compareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDeletes(value: Boolean): Self = this.set("excludeDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRenames(value: Boolean): Self = this.set("followRenames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDate(value: String): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromVersion(value: String): Self = this.set("fromVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPath(value: String): Self = this.set("itemPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemPathsVarargs(value: String*): Self = this.set("itemPaths", js.Array(value :_*))
    
    @scala.inline
    def setItemPaths(value: js.Array[String]): Self = this.set("itemPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVersion(value: String): Self = this.set("itemVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDate(value: String): Self = this.set("toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVersion(value: String): Self = this.set("toVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
