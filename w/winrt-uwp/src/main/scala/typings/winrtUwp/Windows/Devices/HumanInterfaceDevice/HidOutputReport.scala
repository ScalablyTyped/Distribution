package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an output report. */
trait HidOutputReport extends StObject {
  
  /** Retrieves, or sets, the data associated with a given output report. */
  var data: IBuffer
  
  var getBooleanControl: Any
  
  /* unmapped type */
  /**
    * Retrieves the boolean control associated with the given controlDescription.
    * @param controlDescription Describes the Boolean control.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl
  
  var getNumericControl: Any
  
  /* unmapped type */
  /**
    * Retrieves the numeric control associated with the given controlDescription.
    * @param controlDescription Describes the numeric control.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl
  
  /** Retrieves the identifier associated with a given output report. */
  var id: Double
}
object HidOutputReport {
  
  inline def apply(
    data: IBuffer,
    getBooleanControl: Any,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: Any,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double
  ): HidOutputReport = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBooleanControl = getBooleanControl.asInstanceOf[js.Any], getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = getNumericControl.asInstanceOf[js.Any], getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidOutputReport]
  }
  
  extension [Self <: HidOutputReport](x: Self) {
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetBooleanControl(value: Any): Self = StObject.set(x, "getBooleanControl", value.asInstanceOf[js.Any])
    
    inline def setGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = StObject.set(x, "getBooleanControlByDescription", js.Any.fromFunction1(value))
    
    inline def setGetNumericControl(value: Any): Self = StObject.set(x, "getNumericControl", value.asInstanceOf[js.Any])
    
    inline def setGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = StObject.set(x, "getNumericControlByDescription", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
