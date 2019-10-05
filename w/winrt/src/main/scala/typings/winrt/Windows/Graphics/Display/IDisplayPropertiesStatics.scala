package typings.winrt.Windows.Graphics.Display

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayPropertiesStatics extends js.Object {
  var autoRotationPreferences: DisplayOrientations
  var currentOrientation: DisplayOrientations
  var logicalDpi: Double
  var nativeOrientation: DisplayOrientations
  var oncolorprofilechanged: js.Any
  var ondisplaycontentsinvalidated: js.Any
  var onlogicaldpichanged: js.Any
  var onorientationchanged: js.Any
  var onstereoenabledchanged: js.Any
  var resolutionScale: ResolutionScale
  var stereoEnabled: Boolean
  def getColorProfileAsync(): IAsyncOperation[IRandomAccessStream]
}

object IDisplayPropertiesStatics {
  @scala.inline
  def apply(
    autoRotationPreferences: DisplayOrientations,
    currentOrientation: DisplayOrientations,
    getColorProfileAsync: () => IAsyncOperation[IRandomAccessStream],
    logicalDpi: Double,
    nativeOrientation: DisplayOrientations,
    oncolorprofilechanged: js.Any,
    ondisplaycontentsinvalidated: js.Any,
    onlogicaldpichanged: js.Any,
    onorientationchanged: js.Any,
    onstereoenabledchanged: js.Any,
    resolutionScale: ResolutionScale,
    stereoEnabled: Boolean
  ): IDisplayPropertiesStatics = {
    val __obj = js.Dynamic.literal(autoRotationPreferences = autoRotationPreferences, currentOrientation = currentOrientation, getColorProfileAsync = js.Any.fromFunction0(getColorProfileAsync), logicalDpi = logicalDpi, nativeOrientation = nativeOrientation, oncolorprofilechanged = oncolorprofilechanged, ondisplaycontentsinvalidated = ondisplaycontentsinvalidated, onlogicaldpichanged = onlogicaldpichanged, onorientationchanged = onorientationchanged, onstereoenabledchanged = onstereoenabledchanged, resolutionScale = resolutionScale, stereoEnabled = stereoEnabled)
  
    __obj.asInstanceOf[IDisplayPropertiesStatics]
  }
}

