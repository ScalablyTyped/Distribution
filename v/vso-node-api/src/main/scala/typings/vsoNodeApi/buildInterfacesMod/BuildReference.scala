package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildReference extends StObject {
  
  var _links: Any
  
  /**
    * The build number.
    */
  var buildNumber: String
  
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean
  
  /**
    * The time that the build was completed.
    */
  var finishTime: js.Date
  
  /**
    * The ID of the build.
    */
  var id: Double
  
  /**
    * The time that the build was queued.
    */
  var queueTime: js.Date
  
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef
  
  /**
    * The build result.
    */
  var result: BuildResult
  
  /**
    * The time that the build was started.
    */
  var startTime: js.Date
  
  /**
    * The build status.
    */
  var status: BuildStatus
}
object BuildReference {
  
  inline def apply(
    _links: Any,
    buildNumber: String,
    deleted: Boolean,
    finishTime: js.Date,
    id: Double,
    queueTime: js.Date,
    requestedFor: IdentityRef,
    result: BuildResult,
    startTime: js.Date,
    status: BuildStatus
  ): BuildReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], buildNumber = buildNumber.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReference]
  }
  
  extension [Self <: BuildReference](x: Self) {
    
    inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setFinishTime(value: js.Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setQueueTime(value: js.Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    inline def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    inline def setResult(value: BuildResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BuildStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
