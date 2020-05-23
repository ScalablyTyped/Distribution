package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Parameter Classes
trait Parameter extends js.Object {
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
}

