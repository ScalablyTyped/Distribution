package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneOptions extends StObject {
  
  /**
    * If set to true requirements will be cloned
    */
  var cloneRequirements: Boolean = js.native
  
  /**
    * copy all suites from a source plan
    */
  var copyAllSuites: Boolean = js.native
  
  /**
    * copy ancestor hieracrchy
    */
  var copyAncestorHierarchy: Boolean = js.native
  
  /**
    * Name of the workitem type of the clone
    */
  var destinationWorkItemType: String = js.native
  
  /**
    * Key value pairs where the key value is overridden by the value.
    */
  var overrideParameters: StringDictionary[String] = js.native
  
  /**
    * Comment on the link that will link the new clone  test case to the original Set null for no comment
    */
  var relatedLinkComment: String = js.native
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
  
  @scala.inline
  implicit class CloneOptionsMutableBuilder[Self <: CloneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneRequirements(value: Boolean): Self = StObject.set(x, "cloneRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyAllSuites(value: Boolean): Self = StObject.set(x, "copyAllSuites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyAncestorHierarchy(value: Boolean): Self = StObject.set(x, "copyAncestorHierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationWorkItemType(value: String): Self = StObject.set(x, "destinationWorkItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideParameters(value: StringDictionary[String]): Self = StObject.set(x, "overrideParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedLinkComment(value: String): Self = StObject.set(x, "relatedLinkComment", value.asInstanceOf[js.Any])
  }
}
