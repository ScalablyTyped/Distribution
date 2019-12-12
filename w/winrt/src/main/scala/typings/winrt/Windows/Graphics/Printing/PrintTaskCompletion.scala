package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.abandoned
import typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.canceled
import typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.failed
import typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintTaskCompletion extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends js.Object {
  @js.native
  sealed trait abandoned extends PrintTaskCompletion
  
  @js.native
  sealed trait canceled extends PrintTaskCompletion
  
  @js.native
  sealed trait failed extends PrintTaskCompletion
  
  @js.native
  sealed trait submitted extends PrintTaskCompletion
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintTaskCompletion with Double] = js.native
  /* 0 */ @js.native
  object abandoned extends TopLevel[abandoned with Double]
  
  /* 1 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 2 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 3 */ @js.native
  object submitted extends TopLevel[submitted with Double]
  
}

