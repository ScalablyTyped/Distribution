package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeriodType extends StObject
@JSGlobal("tableau.PeriodType")
@js.native
object PeriodType extends StObject {
  
  @js.native
  sealed trait DAYS
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait HOURS
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait MINUTES
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait MONTHS
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait QUARTERS
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait SECONDS
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait WEEKS
    extends StObject
       with PeriodType
  
  @js.native
  sealed trait YEARS
    extends StObject
       with PeriodType
}
