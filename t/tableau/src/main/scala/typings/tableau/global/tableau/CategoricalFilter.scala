package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.CategoricalFilter")
@js.native
open class CategoricalFilter ()
  extends StObject
     with typings.tableau.tableau.CategoricalFilter {
  
  /**
    * Gets the collection of values that are currently set on the filter.
    * This is a native JavaScript array and not a keyed collection.
    * Note that only the first 200 values are returned.
    */
  /* CompleteClass */
  override def getAppliedValues(): js.Array[typings.tableau.tableau.DataValue] = js.native
  
  /** Gets the field that is currently being filtered. */
  /* CompleteClass */
  override def getFieldAsync(): js.Promise[typings.tableau.tableau.Field] = js.native
  
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  /* CompleteClass */
  override def getFilterType(): typings.tableau.tableau.FilterType = js.native
  
  /** Gets a value indicating whether the filter is exclude or include (default). */
  /* CompleteClass */
  override def getIsExcludeMode(): Boolean = js.native
  
  /** Gets the parent worksheet */
  /* CompleteClass */
  override def getWorksheet(): typings.tableau.tableau.Worksheet = js.native
}
