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

object IDisplayPropertiesStatics {
  @scala.inline
  def apply(
    autoRotationPreferences: DisplayOrientations,
    currentOrientation: DisplayOrientations,
    getColorProfileAsync: js.Function0[
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream]
    ],
    logicalDpi: scala.Double,
    nativeOrientation: DisplayOrientations,
    oncolorprofilechanged: js.Any,
    ondisplaycontentsinvalidated: js.Any,
    onlogicaldpichanged: js.Any,
    onorientationchanged: js.Any,
    onstereoenabledchanged: js.Any,
    resolutionScale: ResolutionScale,
    stereoEnabled: scala.Boolean
  ): IDisplayPropertiesStatics = {
    val __obj = js.Dynamic.literal(autoRotationPreferences = autoRotationPreferences, currentOrientation = currentOrientation, getColorProfileAsync = getColorProfileAsync, logicalDpi = logicalDpi, nativeOrientation = nativeOrientation, oncolorprofilechanged = oncolorprofilechanged, ondisplaycontentsinvalidated = ondisplaycontentsinvalidated, onlogicaldpichanged = onlogicaldpichanged, onorientationchanged = onorientationchanged, onstereoenabledchanged = onstereoenabledchanged, resolutionScale = resolutionScale, stereoEnabled = stereoEnabled)
  
    __obj.asInstanceOf[IDisplayPropertiesStatics]
  }
}

