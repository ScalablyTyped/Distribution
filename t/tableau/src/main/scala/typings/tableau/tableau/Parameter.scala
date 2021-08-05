package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Parameter Classes
trait Parameter extends StObject {
  
  /**
    * If the parameter is restricted to a list of allowable values, this property contains the array of those values.
    * Note that this is not a standard collection, but a JavaScript array.
    */
  def getAllowableValues(): js.Array[DataValue]
  
  /** The type of allowable values that the parameter can accept. It can be one of the following enumeration items: ALL, LIST, RANGE. */
  def getAllowableValuesType(): ParameterAllowableValuesType
  
  /** The current value of the parameter. */
  def getCurrentValue(): DataValue
  
  /** The data type of the parameter can be one of the following: FLOAT, INTEGER, STRING, BOOLEAN, DATE, DATETIME. */
  def getDataType(): ParameterDataType
  
  /**
    * If getAllowableValuesType is RANGE and getDataType is DATE or DATETIME,
    * this defines the step date period used in the Parameter UI control slider.
    * Otherwise it’s undefined/null.
    */
  def getDateStepPeriod(): PeriodType
  
  /** If getAllowableValuesType is RANGE, this defines the maximum allowable value, inclusive. Otherwise it’s undefined/null. */
  def getMaxValue(): DataValue
  
  /** If getAllowableValuesType is RANGE, this defines the minimum allowable value, inclusive. Otherwise it’s undefined/null. */
  def getMinValue(): DataValue
  
  /** A unique identifier for the parameter, as specified by the user. */
  def getName(): String
  
  /** If getAllowableValuesType is RANGE, this defines the step size used in the parameter UI control slider. Otherwise it’s undefined/null. */
  def getStepSize(): Double
}
object Parameter {
  
  inline def apply(
    getAllowableValues: () => js.Array[DataValue],
    getAllowableValuesType: () => ParameterAllowableValuesType,
    getCurrentValue: () => DataValue,
    getDataType: () => ParameterDataType,
    getDateStepPeriod: () => PeriodType,
    getMaxValue: () => DataValue,
    getMinValue: () => DataValue,
    getName: () => String,
    getStepSize: () => Double
  ): Parameter = {
    val __obj = js.Dynamic.literal(getAllowableValues = js.Any.fromFunction0(getAllowableValues), getAllowableValuesType = js.Any.fromFunction0(getAllowableValuesType), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getDataType = js.Any.fromFunction0(getDataType), getDateStepPeriod = js.Any.fromFunction0(getDateStepPeriod), getMaxValue = js.Any.fromFunction0(getMaxValue), getMinValue = js.Any.fromFunction0(getMinValue), getName = js.Any.fromFunction0(getName), getStepSize = js.Any.fromFunction0(getStepSize))
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setGetAllowableValues(value: () => js.Array[DataValue]): Self = StObject.set(x, "getAllowableValues", js.Any.fromFunction0(value))
    
    inline def setGetAllowableValuesType(value: () => ParameterAllowableValuesType): Self = StObject.set(x, "getAllowableValuesType", js.Any.fromFunction0(value))
    
    inline def setGetCurrentValue(value: () => DataValue): Self = StObject.set(x, "getCurrentValue", js.Any.fromFunction0(value))
    
    inline def setGetDataType(value: () => ParameterDataType): Self = StObject.set(x, "getDataType", js.Any.fromFunction0(value))
    
    inline def setGetDateStepPeriod(value: () => PeriodType): Self = StObject.set(x, "getDateStepPeriod", js.Any.fromFunction0(value))
    
    inline def setGetMaxValue(value: () => DataValue): Self = StObject.set(x, "getMaxValue", js.Any.fromFunction0(value))
    
    inline def setGetMinValue(value: () => DataValue): Self = StObject.set(x, "getMinValue", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetStepSize(value: () => Double): Self = StObject.set(x, "getStepSize", js.Any.fromFunction0(value))
  }
}
