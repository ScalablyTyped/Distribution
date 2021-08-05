package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneOptions extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: CloneOptions](x: Self) {
    
    inline def setCloneRequirements(value: Boolean): Self = StObject.set(x, "cloneRequirements", value.asInstanceOf[js.Any])
    
    inline def setCopyAllSuites(value: Boolean): Self = StObject.set(x, "copyAllSuites", value.asInstanceOf[js.Any])
    
    inline def setCopyAncestorHierarchy(value: Boolean): Self = StObject.set(x, "copyAncestorHierarchy", value.asInstanceOf[js.Any])
    
    inline def setDestinationWorkItemType(value: String): Self = StObject.set(x, "destinationWorkItemType", value.asInstanceOf[js.Any])
    
    inline def setOverrideParameters(value: StringDictionary[String]): Self = StObject.set(x, "overrideParameters", value.asInstanceOf[js.Any])
    
    inline def setRelatedLinkComment(value: String): Self = StObject.set(x, "relatedLinkComment", value.asInstanceOf[js.Any])
  }
}
