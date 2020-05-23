package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SourceChanged event. */
trait Print3DTaskSourceChangedEventArgs extends js.Object {
  /** Gets the updated 3D print package from the workflow. */
  var source: Printing3D3MFPackage
}

object Print3DTaskSourceChangedEventArgs {
  @scala.inline
  def apply(source: Printing3D3MFPackage): Print3DTaskSourceChangedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskSourceChangedEventArgs]
  }
}

