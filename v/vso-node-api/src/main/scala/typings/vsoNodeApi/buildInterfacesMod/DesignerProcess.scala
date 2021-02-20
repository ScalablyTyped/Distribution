package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesignerProcess extends BuildProcess {
  
  var phases: js.Array[Phase] = js.native
}
object DesignerProcess {
  
  @scala.inline
  def apply(phases: js.Array[Phase], `type`: Double): DesignerProcess = {
    val __obj = js.Dynamic.literal(phases = phases.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignerProcess]
  }
  
  @scala.inline
  implicit class DesignerProcessMutableBuilder[Self <: DesignerProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhases(value: js.Array[Phase]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhasesVarargs(value: Phase*): Self = StObject.set(x, "phases", js.Array(value :_*))
  }
}
