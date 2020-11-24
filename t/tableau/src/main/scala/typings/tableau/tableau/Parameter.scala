package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Parameter Classes
@js.native
trait Parameter extends js.Object {
  
  /**
    * If the parameter is restricted to a list of allowable values, this property contains the array of those values.
    * Note that this is not a standard collection, but a JavaScript array.
    */
  def getAllowableValues(): js.Array[DataValue] = js.native
  
  /** The type of allowable values that the parameter can accept. It can be one of the following enumeration items: ALL, LIST, RANGE. */
  def getAllowableValuesType(): ParameterAllowableValuesType = js.native
  
  /** The current value of the parameter. */
  def getCurrentValue(): DataValue = js.native
  
  /** The data type of the parameter can be one of the following: FLOAT, INTEGER, STRING, BOOLEAN, DATE, DATETIME. */
  def getDataType(): ParameterDataType = js.native
  
  /**
    * If getAllowableValuesType is RANGE and getDataType is DATE or DATETIME,
    * this defines the step date period used in the Parameter UI control slider.
    * Otherwise it’s undefined/null.
    */
  def getDateStepPeriod(): PeriodType = js.native
  
  /** If getAllowableValuesType is RANGE, this defines the maximum allowable value, inclusive. Otherwise it’s undefined/null. */
  def getMaxValue(): DataValue = js.native
  
  /** If getAllowableValuesType is RANGE, this defines the minimum allowable value, inclusive. Otherwise it’s undefined/null. */
  def getMinValue(): DataValue = js.native
  
  /** A unique identifier for the parameter, as specified by the user. */
  def getName(): String = js.native
  
  /** If getAllowableValuesType is RANGE, this defines the step size used in the parameter UI control slider. Otherwise it’s undefined/null. */
  def getStepSize(): Double = js.native
}
object Parameter {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAllowableValues(value: () => js.Array[DataValue]): Self = this.set("getAllowableValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowableValuesType(value: () => ParameterAllowableValuesType): Self = this.set("getAllowableValuesType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentValue(value: () => DataValue): Self = this.set("getCurrentValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataType(value: () => ParameterDataType): Self = this.set("getDataType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateStepPeriod(value: () => PeriodType): Self = this.set("getDateStepPeriod", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxValue(value: () => DataValue): Self = this.set("getMaxValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinValue(value: () => DataValue): Self = this.set("getMinValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStepSize(value: () => Double): Self = this.set("getStepSize", js.Any.fromFunction0(value))
  }
}
