package typings.winrtUwp.global.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SourceChanged event. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs")
@js.native
abstract class Print3DTaskSourceChangedEventArgs ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs {
  /** Gets the updated 3D print package from the workflow. */
  /* CompleteClass */
  override var source: typings.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage = js.native
}

