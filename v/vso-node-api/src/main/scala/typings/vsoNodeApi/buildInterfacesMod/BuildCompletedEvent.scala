package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildCompletedEvent extends BuildUpdatedEvent {
  
  /**
    * errors associated with a build used for build notifications
    */
  var buildErrors: js.Array[BuildRequestValidationResult] = js.native
  
  /**
    * warnings associated with a build used for build notifications
    */
  var buildWarnings: js.Array[BuildRequestValidationResult] = js.native
  
  /**
    * Changes associated with a build used for build notifications
    */
  var changes: js.Array[Change] = js.native
}
object BuildCompletedEvent {
  
  @scala.inline
  def apply(
    build: Build,
    buildErrors: js.Array[BuildRequestValidationResult],
    buildId: Double,
    buildWarnings: js.Array[BuildRequestValidationResult],
    changes: js.Array[Change]
  ): BuildCompletedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildErrors = buildErrors.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildWarnings = buildWarnings.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildCompletedEvent]
  }
  
  @scala.inline
  implicit class BuildCompletedEventOps[Self <: BuildCompletedEvent] (val x: Self) extends AnyVal {
    
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
    def setBuildErrorsVarargs(value: BuildRequestValidationResult*): Self = this.set("buildErrors", js.Array(value :_*))
    
    @scala.inline
    def setBuildErrors(value: js.Array[BuildRequestValidationResult]): Self = this.set("buildErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildWarningsVarargs(value: BuildRequestValidationResult*): Self = this.set("buildWarnings", js.Array(value :_*))
    
    @scala.inline
    def setBuildWarnings(value: js.Array[BuildRequestValidationResult]): Self = this.set("buildWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: Change*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[Change]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
}
