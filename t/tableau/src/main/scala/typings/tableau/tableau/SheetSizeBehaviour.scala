package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetSizeBehaviour extends StObject
@JSGlobal("tableau.SheetSizeBehaviour")
@js.native
object SheetSizeBehaviour extends StObject {
  
  @js.native
  sealed trait ATLEAST
    extends StObject
       with SheetSizeBehaviour
  
  @js.native
  sealed trait ATMOST
    extends StObject
       with SheetSizeBehaviour
  
  @js.native
  sealed trait AUTOMATIC
    extends StObject
       with SheetSizeBehaviour
  
  @js.native
  sealed trait EXACTLY
    extends StObject
       with SheetSizeBehaviour
  
  @js.native
  sealed trait RANGE
    extends StObject
       with SheetSizeBehaviour
}
