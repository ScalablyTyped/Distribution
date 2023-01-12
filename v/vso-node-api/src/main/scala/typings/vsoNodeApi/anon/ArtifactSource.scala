package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSource extends StObject {
  
  @JSName("package")
  var _package: scala.Double
  
  var artifactSource: scala.Double
  
  var containerImage: scala.Double
  
  var pullRequest: scala.Double
  
  var schedule: scala.Double
  
  var sourceRepo: scala.Double
  
  var undefined: scala.Double
}
object ArtifactSource {
  
  inline def apply(
    _package: scala.Double,
    artifactSource: scala.Double,
    containerImage: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    sourceRepo: scala.Double,
    undefined: scala.Double
  ): ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactSource] (val x: Self) extends AnyVal {
    
    inline def setArtifactSource(value: scala.Double): Self = StObject.set(x, "artifactSource", value.asInstanceOf[js.Any])
    
    inline def setContainerImage(value: scala.Double): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setPullRequest(value: scala.Double): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: scala.Double): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setSourceRepo(value: scala.Double): Self = StObject.set(x, "sourceRepo", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def set_package(value: scala.Double): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
