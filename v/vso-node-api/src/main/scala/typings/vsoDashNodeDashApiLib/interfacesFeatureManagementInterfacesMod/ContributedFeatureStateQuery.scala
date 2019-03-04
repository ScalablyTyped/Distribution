package typings
package vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeatureStateQuery extends js.Object {
  /**
    * The list of feature ids to query
    */
  var featureIds: js.Array[java.lang.String]
  /**
    * The query result containing the current feature states for each of the queried feature ids
    */
  var featureStates: org.scalablytyped.runtime.StringDictionary[ContributedFeatureState]
  /**
    * A dictionary of scope values (project name, etc.) to use in the query (if querying across scopes)
    */
  var scopeValues: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object ContributedFeatureStateQuery {
  @scala.inline
  def apply(
    featureIds: js.Array[java.lang.String],
    featureStates: org.scalablytyped.runtime.StringDictionary[ContributedFeatureState],
    scopeValues: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): ContributedFeatureStateQuery = {
    val __obj = js.Dynamic.literal(featureIds = featureIds, featureStates = featureStates, scopeValues = scopeValues)
  
    __obj.asInstanceOf[ContributedFeatureStateQuery]
  }
}

