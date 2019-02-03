package typings
package winrtLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Display.DisplayProperties")
@js.native
class DisplayProperties () extends js.Object

/* static members */
@JSGlobal("Windows.Graphics.Display.DisplayProperties")
@js.native
object DisplayProperties extends js.Object {
  var autoRotationPreferences: winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  var currentOrientation: winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  var logicalDpi: scala.Double = js.native
  var nativeOrientation: winrtLib.WindowsNs.GraphicsNs.DisplayNs.DisplayOrientations = js.native
  var oncolorprofilechanged: js.Any = js.native
  var ondisplaycontentsinvalidated: js.Any = js.native
  var onlogicaldpichanged: js.Any = js.native
  var onorientationchanged: js.Any = js.native
  var onstereoenabledchanged: js.Any = js.native
  var resolutionScale: winrtLib.WindowsNs.GraphicsNs.DisplayNs.ResolutionScale = js.native
  var stereoEnabled: scala.Boolean = js.native
  def getColorProfileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
}

