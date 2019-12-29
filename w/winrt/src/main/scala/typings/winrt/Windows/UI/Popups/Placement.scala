package typings.winrt.Windows.UI.Popups

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

@JSGlobal("Windows.UI.Popups.Placement")
@js.native
object Placement extends js.Object {
  @js.native
  sealed trait above extends Placement
  
  @js.native
  sealed trait below extends Placement
  
  @js.native
  sealed trait default extends Placement
  
  @js.native
  sealed trait left extends Placement
  
  @js.native
  sealed trait right extends Placement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
  /* 1 */ @js.native
  object above extends TopLevel[above with Double]
  
  /* 2 */ @js.native
  object below extends TopLevel[below with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 4 */ @js.native
  object right extends TopLevel[right with Double]
  
}

