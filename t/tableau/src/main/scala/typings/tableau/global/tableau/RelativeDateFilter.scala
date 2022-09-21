package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.RelativeDateFilter")
@js.native
open class RelativeDateFilter ()
  extends StObject
     with typings.tableau.tableau.RelativeDateFilter {
  
  /** Gets the field that is currently being filtered. */
  /* CompleteClass */
  override def getFieldAsync(): js.Promise[typings.tableau.tableau.Field] = js.native
  
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  /* CompleteClass */
  override def getFilterType(): typings.tableau.tableau.FilterType = js.native
  
  /** The date period of the filter. See PeriodType Enum for the values in the enum. */
  /* CompleteClass */
  override def getPeriod(): typings.tableau.tableau.PeriodType = js.native
  
  /** The range of the date filter (years, months, etc.). See DateRangeType Enum for the values in the enum. */
  /* CompleteClass */
  override def getRange(): typings.tableau.tableau.DateRangeType = js.native
  
  /** When getRange returns LASTN or NEXTN, this is the N value (how many years, months, etc.). */
  /* CompleteClass */
  override def getRangeN(): Double = js.native
  
  /** Gets the parent worksheet */
  /* CompleteClass */
  override def getWorksheet(): typings.tableau.tableau.Worksheet = js.native
}
