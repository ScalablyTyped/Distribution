package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.QuantitativeFilter")
@js.native
class QuantitativeFilter () extends Filter {
  /** Gets the maximum value as specified in the domain. */
  def getDomainMax(): DataValue = js.native
  /** Gets the minimum value as specified in the domain. */
  def getDomainMin(): DataValue = js.native
  /** Indicates whether null values are included in the filter. */
  def getIncludeNullValues(): scala.Boolean = js.native
  /** Gets the maximum value, inclusive, applied to the filter. */
  def getMax(): DataValue = js.native
  /** Gets the minimum value, inclusive, applied to the filter. */
  def getMin(): DataValue = js.native
}

