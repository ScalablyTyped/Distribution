package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import typings.tableau.tableau.SheetType.DASHBOARD
import typings.tableau.tableau.SheetType.STORY
import typings.tableau.tableau.SheetType.WORKSHEET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetType with String] = js.native
  /* "dashboard" */ @js.native
  object DASHBOARD extends TopLevel[DASHBOARD with String]
  
  /* "story" */ @js.native
  object STORY extends TopLevel[STORY with String]
  
  /* "worksheet" */ @js.native
  object WORKSHEET extends TopLevel[WORKSHEET with String]
  
}

