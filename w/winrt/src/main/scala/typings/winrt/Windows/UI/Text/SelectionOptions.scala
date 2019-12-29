package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionOptions extends js.Object

@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends js.Object {
  @js.native
  sealed trait active extends SelectionOptions
  
  @js.native
  sealed trait atEndOfLine extends SelectionOptions
  
  @js.native
  sealed trait overtype extends SelectionOptions
  
  @js.native
  sealed trait replace extends SelectionOptions
  
  @js.native
  sealed trait startActive extends SelectionOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionOptions with Double] = js.native
  /* 3 */ @js.native
  object active extends TopLevel[active with Double]
  
  /* 1 */ @js.native
  object atEndOfLine extends TopLevel[atEndOfLine with Double]
  
  /* 2 */ @js.native
  object overtype extends TopLevel[overtype with Double]
  
  /* 4 */ @js.native
  object replace extends TopLevel[replace with Double]
  
  /* 0 */ @js.native
  object startActive extends TopLevel[startActive with Double]
  
}

