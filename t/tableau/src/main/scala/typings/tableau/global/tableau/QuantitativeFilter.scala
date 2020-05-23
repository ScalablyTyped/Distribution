package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.QuantitativeFilter")
@js.native
class QuantitativeFilter ()
  extends typings.tableau.tableau.QuantitativeFilter {
  /** Gets the maximum value as specified in the domain. */
  /* CompleteClass */
  override def getDomainMax(): typings.tableau.tableau.DataValue = js.native
  /** Gets the minimum value as specified in the domain. */
  /* CompleteClass */
  override def getDomainMin(): typings.tableau.tableau.DataValue = js.native
  /** Gets the field that is currently being filtered. */
  /* CompleteClass */
  override def getFieldAsync(): js.Promise[typings.tableau.tableau.Field] = js.native
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  /* CompleteClass */
  override def getFilterType(): typings.tableau.tableau.FilterType = js.native
  /** Indicates whether null values are included in the filter. */
  /* CompleteClass */
  override def getIncludeNullValues(): Boolean = js.native
  /** Gets the maximum value, inclusive, applied to the filter. */
  /* CompleteClass */
  override def getMax(): typings.tableau.tableau.DataValue = js.native
  /** Gets the minimum value, inclusive, applied to the filter. */
  /* CompleteClass */
  override def getMin(): typings.tableau.tableau.DataValue = js.native
  /** Gets the parent worksheet */
  /* CompleteClass */
  override def getWorksheet(): typings.tableau.tableau.Worksheet = js.native
}

