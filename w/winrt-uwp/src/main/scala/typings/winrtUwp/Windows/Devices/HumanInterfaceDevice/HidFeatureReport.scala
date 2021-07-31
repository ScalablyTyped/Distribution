package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a feature report. */
trait HidFeatureReport extends StObject {
  
  /** Retrieves, or sets, the data associated with a given feature report. */
  var data: IBuffer
  
  /**
    * Retrieves the Boolean control associated with the usagePage and usageIdparameter and found in the given feature report.
    * @param usagePage The usage page of the top-level collection for the given HID device.
    * @param usageId The usage identifier of the top-level collection for the given HID device.
    * @return A HidBooleanControl object.
    */
  def getBooleanControl(usagePage: Double, usageId: Double): HidBooleanControl
  
  /**
    * Retrieves the Boolean control described by the controlDescription parameter and found in the given feature report.
    * @param controlDescription A HidBooleanControlDescription object.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl
  
  /**
    * Retrieves the numeric control associated with the usagePage and usageId parameters and found in the given feature report.
    * @param usagePage The usage page of the top-level collection for the given HID device.
    * @param usageId The usage identifier of the top-level collection for the given HID device.
    * @return A HidNumericControl object.
    */
  def getNumericControl(usagePage: Double, usageId: Double): HidNumericControl
  
  /**
    * Retrieves the numeric control described by the controlDescription parameter and found in the given feature report.
    * @param controlDescription A HidNumericControlDescription object.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl
  
  /** Retrieves the identifier associated with a given feature report. */
  var id: Double
}
object HidFeatureReport {
  
  @scala.inline
  def apply(
    data: IBuffer,
    getBooleanControl: (Double, Double) => HidBooleanControl,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: (Double, Double) => HidNumericControl,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double
  ): HidFeatureReport = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBooleanControl = js.Any.fromFunction2(getBooleanControl), getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = js.Any.fromFunction2(getNumericControl), getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidFeatureReport]
  }
  
  @scala.inline
  implicit class HidFeatureReportMutableBuilder[Self <: HidFeatureReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBooleanControl(value: (Double, Double) => HidBooleanControl): Self = StObject.set(x, "getBooleanControl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = StObject.set(x, "getBooleanControlByDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumericControl(value: (Double, Double) => HidNumericControl): Self = StObject.set(x, "getNumericControl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = StObject.set(x, "getNumericControlByDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
