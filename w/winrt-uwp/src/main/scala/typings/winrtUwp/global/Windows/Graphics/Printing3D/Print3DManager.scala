package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates the 3D printing experience. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
@js.native
abstract class Print3DManager ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager
/* static members */
@JSGlobal("Windows.Graphics.Printing3D.Print3DManager")
@js.native
object Print3DManager extends js.Object {
  
  /**
    * Gets a 3D print manager.
    * @return The 3D print manager.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.Graphics.Printing3D.Print3DManager = js.native
  
  /**
    * Programmatically initiates the 3D printing user interface.
    * @return true if the operation completes successfully; otherwise, false.
    */
  def showPrintUIAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}
