package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactFilter extends StObject {
  
  var sourceBranch: String
  
  var tags: js.Array[String]
  
  var useBuildDefinitionBranch: Boolean
}
object ArtifactFilter {
  
  inline def apply(sourceBranch: String, tags: js.Array[String], useBuildDefinitionBranch: Boolean): ArtifactFilter = {
    val __obj = js.Dynamic.literal(sourceBranch = sourceBranch.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], useBuildDefinitionBranch = useBuildDefinitionBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
  
  extension [Self <: ArtifactFilter](x: Self) {
    
    inline def setSourceBranch(value: String): Self = StObject.set(x, "sourceBranch", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUseBuildDefinitionBranch(value: Boolean): Self = StObject.set(x, "useBuildDefinitionBranch", value.asInstanceOf[js.Any])
  }
}
