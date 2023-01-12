package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignerProcess
  extends StObject
     with BuildProcess {
  
  var phases: js.Array[Phase]
}
object DesignerProcess {
  
  inline def apply(phases: js.Array[Phase], `type`: Double): DesignerProcess = {
    val __obj = js.Dynamic.literal(phases = phases.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignerProcess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DesignerProcess] (val x: Self) extends AnyVal {
    
    inline def setPhases(value: js.Array[Phase]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesVarargs(value: Phase*): Self = StObject.set(x, "phases", js.Array(value*))
  }
}
