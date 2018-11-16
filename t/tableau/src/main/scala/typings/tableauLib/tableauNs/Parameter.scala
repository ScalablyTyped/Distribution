package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Parameter Classes
@JSGlobal("tableau.Parameter")
@js.native
class Parameter () extends js.Object {
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
  def getName(): java.lang.String = js.native
  /** If getAllowableValuesType is RANGE, this defines the step size used in the parameter UI control slider. Otherwise it’s undefined/null. */
  def getStepSize(): scala.Double = js.native
}

