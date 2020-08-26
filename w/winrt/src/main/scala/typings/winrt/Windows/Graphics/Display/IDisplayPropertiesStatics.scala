package typings.winrt.Windows.Graphics.Display

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayPropertiesStatics extends js.Object {
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
  @scala.inline
  implicit class IDisplayPropertiesStaticsOps[Self <: IDisplayPropertiesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoRotationPreferences(value: DisplayOrientations): Self = this.set("autoRotationPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentOrientation(value: DisplayOrientations): Self = this.set("currentOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetColorProfileAsync(value: () => IAsyncOperation[IRandomAccessStream]): Self = this.set("getColorProfileAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setLogicalDpi(value: Double): Self = this.set("logicalDpi", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeOrientation(value: DisplayOrientations): Self = this.set("nativeOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncolorprofilechanged(value: js.Any): Self = this.set("oncolorprofilechanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndisplaycontentsinvalidated(value: js.Any): Self = this.set("ondisplaycontentsinvalidated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnlogicaldpichanged(value: js.Any): Self = this.set("onlogicaldpichanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnorientationchanged(value: js.Any): Self = this.set("onorientationchanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnstereoenabledchanged(value: js.Any): Self = this.set("onstereoenabledchanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionScale(value: ResolutionScale): Self = this.set("resolutionScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setStereoEnabled(value: Boolean): Self = this.set("stereoEnabled", value.asInstanceOf[js.Any])
  }
  
}

