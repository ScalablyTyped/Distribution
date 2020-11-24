package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the completion status of a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskCompletion")
@js.native
object Print3DTaskCompletion extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion with Double] = js.native
  
  /* 0 */ val abandoned: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.abandoned with Double = js.native
  
  /* 1 */ val canceled: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.canceled with Double = js.native
  
  /* 2 */ val failed: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.failed with Double = js.native
  
  /* 3 */ val slicing: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.slicing with Double = js.native
  
  /* 4 */ val submitted: typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskCompletion.submitted with Double = js.native
}
