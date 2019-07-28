package typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SourceChanged event. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskSourceChangedEventArgs")
@js.native
abstract class Print3DTaskSourceChangedEventArgs () extends js.Object {
  /** Gets the updated 3D print package from the workflow. */
  var source: Printing3D3MFPackage = js.native
}

