package typings.titanium.Titanium.UI

import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A control that displays an image composited with a background image or color.
  */
@js.native
trait MaskedImage extends View {
  
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: MaskedImageClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: MaskedImageDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: MaskedImageDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: MaskedImageFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: MaskedImageKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: MaskedImageLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: MaskedImageLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: MaskedImagePinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: MaskedImagePostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: MaskedImageSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: MaskedImageSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: MaskedImageTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: MaskedImageTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: MaskedImageTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: MaskedImageTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: MaskedImageTwofingertapEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.image> property.
    * @deprecated Access <Titanium.UI.MaskedImage.image> instead.
    */
  def getImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.mask> property.
    * @deprecated Access <Titanium.UI.MaskedImage.mask> instead.
    */
  def getMask(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.mode> property.
    * @deprecated Access <Titanium.UI.MaskedImage.mode> instead.
    */
  def getMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.MaskedImage.tint> property.
    * @deprecated Access <Titanium.UI.MaskedImage.tint> instead.
    */
  def getTint(): String | Color = js.native
  
  /**
    * Image drawn as the Foreground image.
    */
  var image: String = js.native
  
  /**
    * Image drawn as the background image.
    */
  var mask: String = js.native
  
  /**
    * Blend mode to use to combine layers.
    */
  var mode: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.image> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.image> instead.
    */
  def setImage(image: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.mask> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.mask> instead.
    */
  def setMask(mask: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.mode> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.mode> instead.
    */
  def setMode(mode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.MaskedImage.tint> property.
    * @deprecated Set the value using <Titanium.UI.MaskedImage.tint> instead.
    */
  def setTint(tint: String): Unit = js.native
  def setTint(tint: Color): Unit = js.native
  
  /**
    * Color to combine with the image, as a color name or hex triplet.
    */
  var tint: String | Color = js.native
}
