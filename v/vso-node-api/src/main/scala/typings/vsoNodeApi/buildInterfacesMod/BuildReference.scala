package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildReference extends js.Object {
  
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
  implicit class BuildReferenceOps[Self <: BuildReference] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumber(value: String): Self = this.set("buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = this.set("queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = this.set("requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: BuildResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BuildStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
