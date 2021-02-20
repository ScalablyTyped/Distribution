package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an output report. */
@js.native
trait HidOutputReport extends StObject {
  
  /** Retrieves, or sets, the data associated with a given output report. */
  var data: IBuffer = js.native
  
  var getBooleanControl: js.Any = js.native
  
  /* unmapped type */
  /**
    * Retrieves the boolean control associated with the given controlDescription.
    * @param controlDescription Describes the Boolean control.
    * @return A HidBooleanControl object.
    */
  def getBooleanControlByDescription(controlDescription: HidBooleanControlDescription): HidBooleanControl = js.native
  
  var getNumericControl: js.Any = js.native
  
  /* unmapped type */
  /**
    * Retrieves the numeric control associated with the given controlDescription.
    * @param controlDescription Describes the numeric control.
    * @return A HidNumericControl object.
    */
  def getNumericControlByDescription(controlDescription: HidNumericControlDescription): HidNumericControl = js.native
  
  /** Retrieves the identifier associated with a given output report. */
  var id: Double = js.native
}
object HidOutputReport {
  
  @scala.inline
  def apply(
    data: IBuffer,
    getBooleanControl: js.Any,
    getBooleanControlByDescription: HidBooleanControlDescription => HidBooleanControl,
    getNumericControl: js.Any,
    getNumericControlByDescription: HidNumericControlDescription => HidNumericControl,
    id: Double
  ): HidOutputReport = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBooleanControl = getBooleanControl.asInstanceOf[js.Any], getBooleanControlByDescription = js.Any.fromFunction1(getBooleanControlByDescription), getNumericControl = getNumericControl.asInstanceOf[js.Any], getNumericControlByDescription = js.Any.fromFunction1(getNumericControlByDescription), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidOutputReport]
  }
  
  @scala.inline
  implicit class HidOutputReportMutableBuilder[Self <: HidOutputReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBooleanControl(value: js.Any): Self = StObject.set(x, "getBooleanControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBooleanControlByDescription(value: HidBooleanControlDescription => HidBooleanControl): Self = StObject.set(x, "getBooleanControlByDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumericControl(value: js.Any): Self = StObject.set(x, "getNumericControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNumericControlByDescription(value: HidNumericControlDescription => HidNumericControl): Self = StObject.set(x, "getNumericControlByDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
