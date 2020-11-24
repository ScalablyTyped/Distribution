package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetType extends js.Object
@JSGlobal("tableau.SheetType")
@js.native
object SheetType extends js.Object {
  
  @js.native
  sealed trait DASHBOARD extends SheetType
  
  @js.native
  sealed trait STORY extends SheetType
  
  @js.native
  sealed trait WORKSHEET extends SheetType
}
