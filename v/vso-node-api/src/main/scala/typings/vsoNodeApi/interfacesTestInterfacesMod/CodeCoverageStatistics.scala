package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverageStatistics extends StObject {
  
  /**
    * Covered units
    */
  var covered: Double
  
  /**
    * Delta of coverage
    */
  var delta: Double
  
  /**
    * Is delta valid
    */
  var isDeltaAvailable: Boolean
  
  /**
    * Label of coverage data ("Blocks", "Statements", "Modules", etc.)
    */
  var label: String
  
  /**
    * Position of label
    */
  var position: Double
  
  /**
    * Total units
    */
  var total: Double
}
object CodeCoverageStatistics {
  
  inline def apply(
    covered: Double,
    delta: Double,
    isDeltaAvailable: Boolean,
    label: String,
    position: Double,
    total: Double
  ): CodeCoverageStatistics = {
    val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], isDeltaAvailable = isDeltaAvailable.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCoverageStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeCoverageStatistics] (val x: Self) extends AnyVal {
    
    inline def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setIsDeltaAvailable(value: Boolean): Self = StObject.set(x, "isDeltaAvailable", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
