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
    val __obj = js.Dynamic.literal(autoRotationPreferences = autoRotationPreferences.asInstanceOf[js.Any], currentOrientation = currentOrientation.asInstanceOf[js.Any], getColorProfileAsync = js.Any.fromFunction0(getColorProfileAsync), logicalDpi = logicalDpi.asInstanceOf[js.Any], nativeOrientation = nativeOrientation.asInstanceOf[js.Any], oncolorprofilechanged = oncolorprofilechanged.asInstanceOf[js.Any], ondisplaycontentsinvalidated = ondisplaycontentsinvalidated.asInstanceOf[js.Any], onlogicaldpichanged = onlogicaldpichanged.asInstanceOf[js.Any], onorientationchanged = onorientationchanged.asInstanceOf[js.Any], onstereoenabledchanged = onstereoenabledchanged.asInstanceOf[js.Any], resolutionScale = resolutionScale.asInstanceOf[js.Any], stereoEnabled = stereoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayPropertiesStatics]
  }
}

