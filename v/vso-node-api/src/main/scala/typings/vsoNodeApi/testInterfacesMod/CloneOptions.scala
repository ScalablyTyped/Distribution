package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  /**
    * If set to true requirements will be cloned
    */
  var cloneRequirements: Boolean
  /**
    * copy all suites from a source plan
    */
  var copyAllSuites: Boolean
  /**
    * copy ancestor hieracrchy
    */
  var copyAncestorHierarchy: Boolean
  /**
    * Name of the workitem type of the clone
    */
  var destinationWorkItemType: String
  /**
    * Key value pairs where the key value is overridden by the value.
    */
  var overrideParameters: StringDictionary[String]
  /**
    * Comment on the link that will link the new clone  test case to the original Set null for no comment
    */
  var relatedLinkComment: String
}

object CloneOptions {
  @scala.inline
  def apply(
    cloneRequirements: Boolean,
    copyAllSuites: Boolean,
    copyAncestorHierarchy: Boolean,
    destinationWorkItemType: String,
    overrideParameters: StringDictionary[String],
    relatedLinkComment: String
  ): CloneOptions = {
    val __obj = js.Dynamic.literal(cloneRequirements = cloneRequirements.asInstanceOf[js.Any], copyAllSuites = copyAllSuites.asInstanceOf[js.Any], copyAncestorHierarchy = copyAncestorHierarchy.asInstanceOf[js.Any], destinationWorkItemType = destinationWorkItemType.asInstanceOf[js.Any], overrideParameters = overrideParameters.asInstanceOf[js.Any], relatedLinkComment = relatedLinkComment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloneOptions]
  }
}

