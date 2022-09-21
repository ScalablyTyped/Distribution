package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an input report. */
trait HidInputReport extends StObject {
  
  /** Retrieves the currently activated Boolean controls for the given HID device. */
  var activatedBooleanControls: IVectorView[HidBooleanControl]
  
  /** Retrieves the data associated with a given input report. */
  var data: IBuffer
  
  var getBooleanControl: Any
  
  /* unmapped type */
  /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl
  
  var getNumericControl: Any
  
  /* unmapped type */
  /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given input report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl
  
  /** Retrieves the identifier associated with a given input report. */
  var id: Double
  
  /** Retrieves the recently transitioned Boolean controls for the given HID device. */
  var transitionedBooleanControls: IVectorView[HidBooleanControl]
}
object HidInputReport {
  
  inline def apply(
    activatedBooleanControls: IVectorView[HidBooleanControl],
    data: IBuffer,
    getBooleanControl: Any,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: Any,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double,
    transitionedBooleanControls: IVectorView[HidBooleanControl]
  ): HidInputReport = {
    val __obj = js.Dynamic.literal(activatedBooleanControls = activatedBooleanControls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBooleanControl = getBooleanControl.asInstanceOf[js.Any], getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = getNumericControl.asInstanceOf[js.Any], getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any], transitionedBooleanControls = transitionedBooleanControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidInputReport]
  }
  
  extension [Self <: HidInputReport](x: Self) {
    
    inline def setActivatedBooleanControls(value: IVectorView[HidBooleanControl]): Self = StObject.set(x, "activatedBooleanControls", value.asInstanceOf[js.Any])
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetBooleanControl(value: Any): Self = StObject.set(x, "getBooleanControl", value.asInstanceOf[js.Any])
    
    inline def setGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = StObject.set(x, "getBooleanControlByDescription", js.Any.fromFunction1(value))
    
    inline def setGetNumericControl(value: Any): Self = StObject.set(x, "getNumericControl", value.asInstanceOf[js.Any])
    
    inline def setGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = StObject.set(x, "getNumericControlByDescription", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTransitionedBooleanControls(value: IVectorView[HidBooleanControl]): Self = StObject.set(x, "transitionedBooleanControls", value.asInstanceOf[js.Any])
  }
}
