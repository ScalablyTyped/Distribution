package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aborted extends StObject {
  
  var aborted: scala.Double = js.native
  
  var blocked: scala.Double = js.native
  
  var error: scala.Double = js.native
  
  var failed: scala.Double = js.native
  
  var inProgress: scala.Double = js.native
  
  var inconclusive: scala.Double = js.native
  
  var maxValue: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var notApplicable: scala.Double = js.native
  
  var notExecuted: scala.Double = js.native
  
  var notImpacted: scala.Double = js.native
  
  var passed: scala.Double = js.native
  
  var paused: scala.Double = js.native
  
  var timeout: scala.Double = js.native
  
  var unspecified: scala.Double = js.native
  
  var warning: scala.Double = js.native
}
object Aborted {
  
  @scala.inline
  def apply(
    aborted: scala.Double,
    blocked: scala.Double,
    error: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    inconclusive: scala.Double,
    maxValue: scala.Double,
    none: scala.Double,
    notApplicable: scala.Double,
    notExecuted: scala.Double,
    notImpacted: scala.Double,
    passed: scala.Double,
    paused: scala.Double,
    timeout: scala.Double,
    unspecified: scala.Double,
    warning: scala.Double
  ): Aborted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], inconclusive = inconclusive.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notExecuted = notExecuted.asInstanceOf[js.Any], notImpacted = notImpacted.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted]
  }
  
  @scala.inline
  implicit class AbortedMutableBuilder[Self <: Aborted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAborted(value: scala.Double): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked(value: scala.Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInconclusive(value: scala.Double): Self = StObject.set(x, "inconclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: scala.Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotApplicable(value: scala.Double): Self = StObject.set(x, "notApplicable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotExecuted(value: scala.Double): Self = StObject.set(x, "notExecuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotImpacted(value: scala.Double): Self = StObject.set(x, "notImpacted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassed(value: scala.Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: scala.Double): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: scala.Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnspecified(value: scala.Double): Self = StObject.set(x, "unspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: scala.Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
