package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Print3DTaskSourceRequestedHandler delegate. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs")
@js.native
abstract class Print3DTaskSourceRequestedArgs ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceRequestedArgs {
  /**
    * Specifies the 3D Manufacturing Format (3MF) package to use in the print job.
    * @param source The 3D Manufacturing Format (3MF) package to use in the print job.
    */
  /* CompleteClass */
  override def setSource(source: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage): Unit = js.native
}

