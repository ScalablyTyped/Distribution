package typings.winrt.Windows.Graphics.Printing

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
  
}

