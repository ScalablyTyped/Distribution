package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhaseTarget extends StObject {
  
  /**
    * The type of the target.
    */
  var `type`: Double
}
object PhaseTarget {
  
  inline def apply(`type`: Double): PhaseTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhaseTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhaseTarget] (val x: Self) extends AnyVal {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
