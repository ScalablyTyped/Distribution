package typings
package winrtLib.WindowsNs.GraphicsNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayPropertiesStatics extends js.Object {
  var autoRotationPreferences: DisplayOrientations
  var currentOrientation: DisplayOrientations
  var logicalDpi: scala.Double
  var nativeOrientation: DisplayOrientations
  var oncolorprofilechanged: js.Any
  var ondisplaycontentsinvalidated: js.Any
  var onlogicaldpichanged: js.Any
  var onorientationchanged: js.Any
  var onstereoenabledchanged: js.Any
  var resolutionScale: ResolutionScale
  var stereoEnabled: scala.Boolean
  def getColorProfileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream]
}

