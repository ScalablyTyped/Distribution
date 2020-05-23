package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.UI.View
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A <Titanium.UI.iOS.BlurView> object gives you an easy way implement some complex visual effects.
  * The blur effect is applied to every view the blur view is added to by default. You can also place the
  * blur view above other views and all visible views layered under the blur view are blurred as well.
  * For more information on BlurView, please refer to the official [Apple documentation](https://developer.apple.com/documentation/uikit/uivisualeffectview).
  * Note: Apple introduced two new constants <Titanium.UI.iOS.BLUR_EFFECT_STYLE_REGULAR> and <Titanium.UI.iOS.BLUR_EFFECT_STYLE_PROMINENT> in
  * iOS 10. These are internally mapped to <Titanium.UI.iOS.BLUR_EFFECT_STYLE_LIGHT> and <Titanium.UI.iOS.BLUR_EFFECT_STYLE_EXTRA_LIGHT>.
  */
@js.native
trait BlurView extends View {
  /**
    * The effect you provide for the view.
    */
  var effect: Double = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: BlurViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: BlurViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: BlurViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: BlurViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: BlurViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: BlurViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: BlurViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: BlurViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: BlurViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: BlurViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: BlurViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: BlurViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: BlurViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: BlurViewTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.iOS.BlurView.effect> property.
    * @deprecated Access <Titanium.UI.iOS.BlurView.effect> instead.
    */
  def getEffect(): Double = js.native
  /**
    * Sets the value of the <Titanium.UI.iOS.BlurView.effect> property.
    * @deprecated Set the value using <Titanium.UI.iOS.BlurView.effect> instead.
    */
  def setEffect(effect: Double): Unit = js.native
}

