package typings.typescript.mod

import typings.typescript.typescriptStrings.CreatePackageJsonAutoImportProvider
import typings.typescript.typescriptStrings.UpdateGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceEvent extends js.Object {
  
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
  implicit class PerformanceEventOps[Self <: PerformanceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDurationMs(value: Double): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: UpdateGraph | CreatePackageJsonAutoImportProvider): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
