package typings.winrt.WindowsNs.GraphicsNs.DisplayNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
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
  var autoRotationPreferences: DisplayOrientations = js.native
  var currentOrientation: DisplayOrientations = js.native
  var logicalDpi: Double = js.native
  var nativeOrientation: DisplayOrientations = js.native
  var oncolorprofilechanged: js.Any = js.native
  var ondisplaycontentsinvalidated: js.Any = js.native
  var onlogicaldpichanged: js.Any = js.native
  var onorientationchanged: js.Any = js.native
  var onstereoenabledchanged: js.Any = js.native
  var resolutionScale: ResolutionScale = js.native
  var stereoEnabled: Boolean = js.native
  def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream] = js.native
}

