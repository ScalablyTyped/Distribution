package typings.vsoNodeApi.featureManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributedFeatureStateQuery extends js.Object {
  
  /**
    * The list of feature ids to query
    */
  var featureIds: js.Array[String] = js.native
  
  /**
    * The query result containing the current feature states for each of the queried feature ids
    */
  var featureStates: StringDictionary[ContributedFeatureState] = js.native
  
  /**
    * A dictionary of scope values (project name, etc.) to use in the query (if querying across scopes)
    */
  var scopeValues: StringDictionary[String] = js.native
}
object ContributedFeatureStateQuery {
  
  @scala.inline
  def apply(
    featureIds: js.Array[String],
    featureStates: StringDictionary[ContributedFeatureState],
    scopeValues: StringDictionary[String]
  ): ContributedFeatureStateQuery = {
    val __obj = js.Dynamic.literal(featureIds = featureIds.asInstanceOf[js.Any], featureStates = featureStates.asInstanceOf[js.Any], scopeValues = scopeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributedFeatureStateQuery]
  }
  
  @scala.inline
  implicit class ContributedFeatureStateQueryOps[Self <: ContributedFeatureStateQuery] (val x: Self) extends AnyVal {
    
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
    def setFeatureIdsVarargs(value: String*): Self = this.set("featureIds", js.Array(value :_*))
    
    @scala.inline
    def setFeatureIds(value: js.Array[String]): Self = this.set("featureIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureStates(value: StringDictionary[ContributedFeatureState]): Self = this.set("featureStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeValues(value: StringDictionary[String]): Self = this.set("scopeValues", value.asInstanceOf[js.Any])
  }
}
