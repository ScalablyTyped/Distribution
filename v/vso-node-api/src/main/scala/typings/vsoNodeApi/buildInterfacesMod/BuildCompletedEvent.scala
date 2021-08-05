package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildCompletedEvent
  extends StObject
     with BuildUpdatedEvent {
  
  /**
    * errors associated with a build used for build notifications
    */
  var buildErrors: js.Array[BuildRequestValidationResult]
  
  /**
    * warnings associated with a build used for build notifications
    */
  var buildWarnings: js.Array[BuildRequestValidationResult]
  
  /**
    * Changes associated with a build used for build notifications
    */
  var changes: js.Array[Change]
}
object BuildCompletedEvent {
  
  inline def apply(
    build: Build,
    buildErrors: js.Array[BuildRequestValidationResult],
    buildId: Double,
    buildWarnings: js.Array[BuildRequestValidationResult],
    changes: js.Array[Change]
  ): BuildCompletedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildErrors = buildErrors.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildWarnings = buildWarnings.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildCompletedEvent]
  }
  
  extension [Self <: BuildCompletedEvent](x: Self) {
    
    inline def setBuildErrors(value: js.Array[BuildRequestValidationResult]): Self = StObject.set(x, "buildErrors", value.asInstanceOf[js.Any])
    
    inline def setBuildErrorsVarargs(value: BuildRequestValidationResult*): Self = StObject.set(x, "buildErrors", js.Array(value :_*))
    
    inline def setBuildWarnings(value: js.Array[BuildRequestValidationResult]): Self = StObject.set(x, "buildWarnings", value.asInstanceOf[js.Any])
    
    inline def setBuildWarningsVarargs(value: BuildRequestValidationResult*): Self = StObject.set(x, "buildWarnings", js.Array(value :_*))
    
    inline def setChanges(value: js.Array[Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
