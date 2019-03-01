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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoRotationPreferences")(autoRotationPreferences)
    __obj.updateDynamic("currentOrientation")(currentOrientation)
    __obj.updateDynamic("getColorProfileAsync")(getColorProfileAsync)
    __obj.updateDynamic("logicalDpi")(logicalDpi)
    __obj.updateDynamic("nativeOrientation")(nativeOrientation)
    __obj.updateDynamic("oncolorprofilechanged")(oncolorprofilechanged)
    __obj.updateDynamic("ondisplaycontentsinvalidated")(ondisplaycontentsinvalidated)
    __obj.updateDynamic("onlogicaldpichanged")(onlogicaldpichanged)
    __obj.updateDynamic("onorientationchanged")(onorientationchanged)
    __obj.updateDynamic("onstereoenabledchanged")(onstereoenabledchanged)
    __obj.updateDynamic("resolutionScale")(resolutionScale)
    __obj.updateDynamic("stereoEnabled")(stereoEnabled)
    __obj.asInstanceOf[IDisplayPropertiesStatics]
  }
}

