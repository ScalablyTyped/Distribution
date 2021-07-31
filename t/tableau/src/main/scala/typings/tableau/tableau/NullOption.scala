package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NullOption extends StObject
/** An enumeration that indicates what to do with null values for a given filter or mark selection call. */
@JSGlobal("tableau.NullOption")
@js.native
object NullOption extends StObject {
  
  /** Include null and non-null values in the filter. */
  @js.native
  sealed trait ALL_VALUES
    extends StObject
       with NullOption
  
  /** Only include non-null values in the filter. */
  @js.native
  sealed trait NON_NULL_VALUES
    extends StObject
       with NullOption
  
  /** Only include null values in the filter. */
  @js.native
  sealed trait NULL_VALUES
    extends StObject
       with NullOption
}
