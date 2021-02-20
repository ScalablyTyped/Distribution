package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetType extends StObject
@JSGlobal("tableau.SheetType")
@js.native
object SheetType extends StObject {
  
  @js.native
  sealed trait DASHBOARD extends SheetType
  
  @js.native
  sealed trait STORY extends SheetType
  
  @js.native
  sealed trait WORKSHEET extends SheetType
}
