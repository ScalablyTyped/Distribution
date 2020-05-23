package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Print3DTaskSourceRequestedHandler delegate. */
trait Print3DTaskSourceRequestedArgs extends js.Object {
  /**
    * Specifies the 3D Manufacturing Format (3MF) package to use in the print job.
    * @param source The 3D Manufacturing Format (3MF) package to use in the print job.
    */
  def setSource(source: Printing3D3MFPackage): Unit
}

object Print3DTaskSourceRequestedArgs {
  @scala.inline
  def apply(setSource: Printing3D3MFPackage => Unit): Print3DTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[Print3DTaskSourceRequestedArgs]
  }
}

