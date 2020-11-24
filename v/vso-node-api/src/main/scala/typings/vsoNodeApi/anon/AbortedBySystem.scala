package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortedBySystem extends js.Object {
  
  var abortedBySystem: scala.Double = js.native
  
  var analyzed: scala.Double = js.native
  
  var canceledByUser: scala.Double = js.native
  
  var cancellationInProgress: scala.Double = js.native
  
  var creatingEnvironment: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var pendingAnalysis: scala.Double = js.native
  
  var runningTests: scala.Double = js.native
  
  var timedOut: scala.Double = js.native
}
object AbortedBySystem {
  
  @scala.inline
  def apply(
    abortedBySystem: scala.Double,
    analyzed: scala.Double,
    canceledByUser: scala.Double,
    cancellationInProgress: scala.Double,
    creatingEnvironment: scala.Double,
    none: scala.Double,
    pendingAnalysis: scala.Double,
    runningTests: scala.Double,
    timedOut: scala.Double
  ): AbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem.asInstanceOf[js.Any], analyzed = analyzed.asInstanceOf[js.Any], canceledByUser = canceledByUser.asInstanceOf[js.Any], cancellationInProgress = cancellationInProgress.asInstanceOf[js.Any], creatingEnvironment = creatingEnvironment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pendingAnalysis = pendingAnalysis.asInstanceOf[js.Any], runningTests = runningTests.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortedBySystem]
  }
  
  @scala.inline
  implicit class AbortedBySystemOps[Self <: AbortedBySystem] (val x: Self) extends AnyVal {
    
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
    def setAbortedBySystem(value: scala.Double): Self = this.set("abortedBySystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzed(value: scala.Double): Self = this.set("analyzed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanceledByUser(value: scala.Double): Self = this.set("canceledByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellationInProgress(value: scala.Double): Self = this.set("cancellationInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatingEnvironment(value: scala.Double): Self = this.set("creatingEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingAnalysis(value: scala.Double): Self = this.set("pendingAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningTests(value: scala.Double): Self = this.set("runningTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOut(value: scala.Double): Self = this.set("timedOut", value.asInstanceOf[js.Any])
  }
}
