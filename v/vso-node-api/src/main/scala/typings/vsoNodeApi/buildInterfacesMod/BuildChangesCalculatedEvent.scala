package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildChangesCalculatedEvent
  extends StObject
     with BuildUpdatedEvent {
  
  var changes: js.Array[Change]
}
object BuildChangesCalculatedEvent {
  
  inline def apply(build: Build, buildId: Double, changes: js.Array[Change]): BuildChangesCalculatedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildChangesCalculatedEvent]
  }
  
  extension [Self <: BuildChangesCalculatedEvent](x: Self) {
    
    inline def setChanges(value: js.Array[Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "changes", js.Array(value*))
  }
}
