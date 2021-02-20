package typings.typescript.mod

import typings.typescript.typescriptStrings.CreatePackageJsonAutoImportProvider
import typings.typescript.typescriptStrings.UpdateGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceEvent extends StObject {
  
  var durationMs: Double = js.native
  
  var kind: UpdateGraph | CreatePackageJsonAutoImportProvider = js.native
}
object PerformanceEvent {
  
  @scala.inline
  def apply(durationMs: Double, kind: UpdateGraph | CreatePackageJsonAutoImportProvider): PerformanceEvent = {
    val __obj = js.Dynamic.literal(durationMs = durationMs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEvent]
  }
  
  @scala.inline
  implicit class PerformanceEventMutableBuilder[Self <: PerformanceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: UpdateGraph | CreatePackageJsonAutoImportProvider): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
