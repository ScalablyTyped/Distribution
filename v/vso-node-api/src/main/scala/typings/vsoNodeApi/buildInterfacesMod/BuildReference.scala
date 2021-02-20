package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildReference extends StObject {
  
  var _links: js.Any = js.native
  
  /**
    * The build number.
    */
  var buildNumber: String = js.native
  
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean = js.native
  
  /**
    * The time that the build was completed.
    */
  var finishTime: Date = js.native
  
  /**
    * The ID of the build.
    */
  var id: Double = js.native
  
  /**
    * The time that the build was queued.
    */
  var queueTime: Date = js.native
  
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef = js.native
  
  /**
    * The build result.
    */
  var result: BuildResult = js.native
  
  /**
    * The time that the build was started.
    */
  var startTime: Date = js.native
  
  /**
    * The build status.
    */
  var status: BuildStatus = js.native
}
object BuildReference {
  
  @scala.inline
  def apply(
    _links: js.Any,
    buildNumber: String,
    deleted: Boolean,
    finishTime: Date,
    id: Double,
    queueTime: Date,
    requestedFor: IdentityRef,
    result: BuildResult,
    startTime: Date,
    status: BuildStatus
  ): BuildReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], buildNumber = buildNumber.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReference]
  }
  
  @scala.inline
  implicit class BuildReferenceMutableBuilder[Self <: BuildReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: BuildResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BuildStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
