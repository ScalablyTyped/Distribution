package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildSummary extends js.Object {
  
  var build: XamlBuildReference = js.native
  
  var finishTime: Date = js.native
  
  var keepForever: Boolean = js.native
  
  var quality: String = js.native
  
  var reason: BuildReason = js.native
  
  var requestedFor: IdentityRef = js.native
  
  var startTime: Date = js.native
  
  var status: BuildStatus = js.native
}
object BuildSummary {
  
  @scala.inline
  def apply(
    build: XamlBuildReference,
    finishTime: Date,
    keepForever: Boolean,
    quality: String,
    reason: BuildReason,
    requestedFor: IdentityRef,
    startTime: Date,
    status: BuildStatus
  ): BuildSummary = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], keepForever = keepForever.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSummary]
  }
  
  @scala.inline
  implicit class BuildSummaryOps[Self <: BuildSummary] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: XamlBuildReference): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepForever(value: Boolean): Self = this.set("keepForever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: BuildReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = this.set("requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BuildStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
