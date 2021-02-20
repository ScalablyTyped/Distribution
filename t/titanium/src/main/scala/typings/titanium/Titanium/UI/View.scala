package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.Dictionary
import typings.titanium.Dimension
import typings.titanium.DimensionWithAbsolutes
import typings.titanium.Gradient
import typings.titanium.MinMaxOptions
import typings.titanium.Point
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.iOS.PreviewContext
import typings.titanium.ViewPositionOptions
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
  * An empty drawing surface or container
  */
@js.native
trait View extends Proxy {
  
  /**
    * Whether the view should be "hidden" from (i.e., ignored by) the accessibility service.
    */
  var accessibilityHidden: Boolean = js.native
  
  /**
    * Briefly describes what performing an action (such as a click) on the view will do.
    */
  var accessibilityHint: String = js.native
  
  /**
    * A succint label identifying the view for the device's accessibility service.
    */
  var accessibilityLabel: String = js.native
  
  /**
    * A string describing the value (if any) of the view for the device's accessibility service.
    */
  var accessibilityValue: String = js.native
  
  def add(view: js.Array[View]): Unit = js.native
  /**
    * Adds a child to this view's hierarchy.
    */
  def add(view: View): Unit = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_click(name: click, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewClickEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    name: dblclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewDblclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_doubletap(
    name: doubletap,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewDoubletapEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(name: focus, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewFocusEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypressed(
    name: keypressed,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewKeypressedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_longclick(
    name: longclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewLongclickEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_longpress(
    name: longpress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewLongpressEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pinch(name: pinch, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewPinchEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_postlayout(
    name: postlayout,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewPostlayoutEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_singletap(
    name: singletap,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewSingletapEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_swipe(name: swipe, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewSwipeEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    name: touchcancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchcancelEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    name: touchend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchendEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    name: touchmove,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchmoveEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    name: touchstart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchstartEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_twofingertap(
    name: twofingertap,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTwofingertapEvent, Unit]
  ): Unit = js.native
  
  /**
    * Coordinate of the view about which to pivot an animation.
    */
  var anchorPoint: Point = js.native
  
  def animate(animation: Dictionary[Animation]): Unit = js.native
  def animate(animation: Dictionary[Animation], callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  /**
    * Animates this view.
    */
  def animate(animation: Animation): Unit = js.native
  def animate(animation: Animation, callback: js.Function1[/* param0 */ js.Any, Unit]): Unit = js.native
  
  /**
    * Current position of the view during an animation.
    */
  val animatedCenter: Point = js.native
  
  /**
    * Background color of the view, as a color name or hex triplet.
    */
  var backgroundColor: String | Color = js.native
  
  /**
    * Disabled background color of the view, as a color name or hex triplet.
    */
  var backgroundDisabledColor: String = js.native
  
  /**
    * Disabled background image for the view, specified as a local file path or URL.
    */
  var backgroundDisabledImage: String = js.native
  
  /**
    * Focused background color of the view, as a color name or hex triplet.
    */
  var backgroundFocusedColor: String = js.native
  
  /**
    * Focused background image for the view, specified as a local file path or URL.
    */
  var backgroundFocusedImage: String = js.native
  
  /**
    * A background gradient for the view.
    */
  var backgroundGradient: Gradient = js.native
  
  /**
    * Background image for the view, specified as a local file path or URL.
    */
  var backgroundImage: String = js.native
  
  /**
    * Size of the left end cap.
    */
  var backgroundLeftCap: Double = js.native
  
  /**
    * Determines whether to tile a background across a view.
    */
  var backgroundRepeat: Boolean = js.native
  
  /**
    * Selected background color of the view, as a color name or hex triplet.
    */
  var backgroundSelectedColor: String | Color = js.native
  
  /**
    * Selected background image url for the view, specified as a local file path or URL.
    */
  var backgroundSelectedImage: String = js.native
  
  /**
    * Size of the top end cap.
    */
  var backgroundTopCap: Double = js.native
  
  /**
    * Border color of the view, as a color name or hex triplet.
    */
  var borderColor: String | Color = js.native
  
  /**
    * Radius for the rounded corners of the view's border.
    */
  var borderRadius: Double | String | (js.Array[Double | String]) = js.native
  
  /**
    * Border width of the view.
    */
  var borderWidth: Double = js.native
  
  /**
    * View's bottom position, in platform-specific units.
    */
  var bottom: Double | String = js.native
  
  /**
    * View's center position, in the parent view's coordinates.
    */
  var center: Point = js.native
  
  /**
    * Array of this view's child views.
    */
  val children: js.Array[View] = js.native
  
  /**
    * Removes all previously added motion effects.
    */
  def clearMotionEffects(): Unit = js.native
  
  /**
    * View's clipping behavior.
    */
  var clipMode: Double = js.native
  
  /**
    * Translates a point from this view's coordinate system to another view's coordinate system.
    */
  def convertPointToView(point: Point, destinationView: View): Point = js.native
  
  /**
    * Base elevation of the view relative to its parent in pixels.
    */
  var elevation: Double = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_click(name: click): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ViewClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: ViewDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: ViewDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: ViewFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: ViewKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: ViewLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: ViewLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: ViewPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: ViewPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: ViewSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: ViewSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: ViewTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: ViewTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: ViewTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: ViewTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: ViewTwofingertapEvent): Unit = js.native
  
  /**
    * Whether view should be focusable while navigating with the trackball.
    */
  var focusable: Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.accessibilityHidden> property.
    * @deprecated Access <Titanium.UI.View.accessibilityHidden> instead.
    */
  def getAccessibilityHidden(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.accessibilityHint> property.
    * @deprecated Access <Titanium.UI.View.accessibilityHint> instead.
    */
  def getAccessibilityHint(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.accessibilityLabel> property.
    * @deprecated Access <Titanium.UI.View.accessibilityLabel> instead.
    */
  def getAccessibilityLabel(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.accessibilityValue> property.
    * @deprecated Access <Titanium.UI.View.accessibilityValue> instead.
    */
  def getAccessibilityValue(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.anchorPoint> property.
    * @deprecated Access <Titanium.UI.View.anchorPoint> instead.
    */
  def getAnchorPoint(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.animatedCenter> property.
    * @deprecated Access <Titanium.UI.View.animatedCenter> instead.
    */
  def getAnimatedCenter(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundColor> property.
    * @deprecated Access <Titanium.UI.View.backgroundColor> instead.
    */
  def getBackgroundColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundDisabledColor> property.
    * @deprecated Access <Titanium.UI.View.backgroundDisabledColor> instead.
    */
  def getBackgroundDisabledColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundDisabledImage> property.
    * @deprecated Access <Titanium.UI.View.backgroundDisabledImage> instead.
    */
  def getBackgroundDisabledImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundFocusedColor> property.
    * @deprecated Access <Titanium.UI.View.backgroundFocusedColor> instead.
    */
  def getBackgroundFocusedColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundFocusedImage> property.
    * @deprecated Access <Titanium.UI.View.backgroundFocusedImage> instead.
    */
  def getBackgroundFocusedImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundGradient> property.
    * @deprecated Access <Titanium.UI.View.backgroundGradient> instead.
    */
  def getBackgroundGradient(): Gradient = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundImage> property.
    * @deprecated Access <Titanium.UI.View.backgroundImage> instead.
    */
  def getBackgroundImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundLeftCap> property.
    * @deprecated Access <Titanium.UI.View.backgroundLeftCap> instead.
    */
  def getBackgroundLeftCap(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundRepeat> property.
    * @deprecated Access <Titanium.UI.View.backgroundRepeat> instead.
    */
  def getBackgroundRepeat(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundSelectedColor> property.
    * @deprecated Access <Titanium.UI.View.backgroundSelectedColor> instead.
    */
  def getBackgroundSelectedColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundSelectedImage> property.
    * @deprecated Access <Titanium.UI.View.backgroundSelectedImage> instead.
    */
  def getBackgroundSelectedImage(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.backgroundTopCap> property.
    * @deprecated Access <Titanium.UI.View.backgroundTopCap> instead.
    */
  def getBackgroundTopCap(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.borderColor> property.
    * @deprecated Access <Titanium.UI.View.borderColor> instead.
    */
  def getBorderColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.borderRadius> property.
    * @deprecated Access <Titanium.UI.View.borderRadius> instead.
    */
  def getBorderRadius(): Double | String | (js.Array[Double | String]) = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.borderWidth> property.
    * @deprecated Access <Titanium.UI.View.borderWidth> instead.
    */
  def getBorderWidth(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.bottom> property.
    * @deprecated Access <Titanium.UI.View.bottom> instead.
    */
  def getBottom(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.center> property.
    * @deprecated Access <Titanium.UI.View.center> instead.
    */
  def getCenter(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.children> property.
    * @deprecated Access <Titanium.UI.View.children> instead.
    */
  def getChildren(): js.Array[View] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.clipMode> property.
    * @deprecated Access <Titanium.UI.View.clipMode> instead.
    */
  def getClipMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.elevation> property.
    * @deprecated Access <Titanium.UI.View.elevation> instead.
    */
  def getElevation(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.focusable> property.
    * @deprecated Access <Titanium.UI.View.focusable> instead.
    */
  def getFocusable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.height> property.
    * @deprecated Access <Titanium.UI.View.height> instead.
    */
  def getHeight(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.hiddenBehavior> property.
    * @deprecated Access <Titanium.UI.View.hiddenBehavior> instead.
    */
  def getHiddenBehavior(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.horizontalMotionEffect> property.
    * @deprecated Access <Titanium.UI.View.horizontalMotionEffect> instead.
    */
  def getHorizontalMotionEffect(): MinMaxOptions = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.horizontalWrap> property.
    * @deprecated Access <Titanium.UI.View.horizontalWrap> instead.
    */
  def getHorizontalWrap(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.keepScreenOn> property.
    * @deprecated Access <Titanium.UI.View.keepScreenOn> instead.
    */
  def getKeepScreenOn(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.layout> property.
    * @deprecated Access <Titanium.UI.View.layout> instead.
    */
  def getLayout(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.left> property.
    * @deprecated Access <Titanium.UI.View.left> instead.
    */
  def getLeft(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.opacity> property.
    * @deprecated Access <Titanium.UI.View.opacity> instead.
    */
  def getOpacity(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.overrideCurrentAnimation> property.
    * @deprecated Access <Titanium.UI.View.overrideCurrentAnimation> instead.
    */
  def getOverrideCurrentAnimation(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.previewContext> property.
    * @deprecated Access <Titanium.UI.View.previewContext> instead.
    */
  def getPreviewContext(): PreviewContext = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.pullBackgroundColor> property.
    * @deprecated Access <Titanium.UI.View.pullBackgroundColor> instead.
    */
  def getPullBackgroundColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.rect> property.
    * @deprecated Access <Titanium.UI.View.rect> instead.
    */
  def getRect(): DimensionWithAbsolutes = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.right> property.
    * @deprecated Access <Titanium.UI.View.right> instead.
    */
  def getRight(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.rotation> property.
    * @deprecated Access <Titanium.UI.View.rotation> instead.
    */
  def getRotation(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.rotationX> property.
    * @deprecated Access <Titanium.UI.View.rotationX> instead.
    */
  def getRotationX(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.rotationY> property.
    * @deprecated Access <Titanium.UI.View.rotationY> instead.
    */
  def getRotationY(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.scaleX> property.
    * @deprecated Access <Titanium.UI.View.scaleX> instead.
    */
  def getScaleX(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.scaleY> property.
    * @deprecated Access <Titanium.UI.View.scaleY> instead.
    */
  def getScaleY(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.size> property.
    * @deprecated Access <Titanium.UI.View.size> instead.
    */
  def getSize(): Dimension = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.softKeyboardOnFocus> property.
    * @deprecated Access <Titanium.UI.View.softKeyboardOnFocus> instead.
    */
  def getSoftKeyboardOnFocus(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.tintColor> property.
    * @deprecated Access <Titanium.UI.View.tintColor> instead.
    */
  def getTintColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.top> property.
    * @deprecated Access <Titanium.UI.View.top> instead.
    */
  def getTop(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.touchEnabled> property.
    * @deprecated Access <Titanium.UI.View.touchEnabled> instead.
    */
  def getTouchEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.touchFeedback> property.
    * @deprecated Access <Titanium.UI.View.touchFeedback> instead.
    */
  def getTouchFeedback(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.touchFeedbackColor> property.
    * @deprecated Access <Titanium.UI.View.touchFeedbackColor> instead.
    */
  def getTouchFeedbackColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.transform> property.
    * @deprecated Access <Titanium.UI.View.transform> instead.
    */
  def getTransform(): Matrix2D | Matrix3D = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.transitionName> property.
    * @deprecated Access <Titanium.UI.View.transitionName> instead.
    */
  def getTransitionName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.translationX> property.
    * @deprecated Access <Titanium.UI.View.translationX> instead.
    */
  def getTranslationX(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.translationY> property.
    * @deprecated Access <Titanium.UI.View.translationY> instead.
    */
  def getTranslationY(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.translationZ> property.
    * @deprecated Access <Titanium.UI.View.translationZ> instead.
    */
  def getTranslationZ(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.verticalMotionEffect> property.
    * @deprecated Access <Titanium.UI.View.verticalMotionEffect> instead.
    */
  def getVerticalMotionEffect(): MinMaxOptions = js.native
  
  /**
    * Returns the matching view of a given view ID.
    */
  def getViewById(id: String): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.viewShadowColor> property.
    * @deprecated Access <Titanium.UI.View.viewShadowColor> instead.
    */
  def getViewShadowColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.viewShadowOffset> property.
    * @deprecated Access <Titanium.UI.View.viewShadowOffset> instead.
    */
  def getViewShadowOffset(): Point = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.viewShadowRadius> property.
    * @deprecated Access <Titanium.UI.View.viewShadowRadius> instead.
    */
  def getViewShadowRadius(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.visible> property.
    * @deprecated Access <Titanium.UI.View.visible> instead.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.width> property.
    * @deprecated Access <Titanium.UI.View.width> instead.
    */
  def getWidth(): Double | String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.View.zIndex> property.
    * @deprecated Access <Titanium.UI.View.zIndex> instead.
    */
  def getZIndex(): Double = js.native
  
  /**
    * View height, in platform-specific units.
    */
  var height: Double | String = js.native
  
  /**
    * Sets the behavior when hiding an object to release or keep the free space
    */
  var hiddenBehavior: Double = js.native
  
  /**
    * Hides this view.
    */
  def hide(): Unit = js.native
  def hide(options: AnimatedOptions): Unit = js.native
  
  /**
    * Adds a horizontal parallax effect to the view
    */
  var horizontalMotionEffect: MinMaxOptions = js.native
  
  /**
    * Determines whether the layout has wrapping behavior.
    */
  var horizontalWrap: Boolean = js.native
  
  /**
    * View's identifier.
    */
  @JSName("id")
  var id_View: js.UndefOr[String] = js.native
  
  /**
    * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
    */
  def insertAt(params: ViewPositionOptions): Unit = js.native
  
  /**
    * Determines whether to keep the device screen on.
    */
  var keepScreenOn: Boolean = js.native
  
  /**
    * Specifies how the view positions its children.
    * One of: 'composite', 'vertical', or 'horizontal'.
    */
  var layout: String = js.native
  
  /**
    * View's left position, in platform-specific units.
    */
  var left: Double | String = js.native
  
  /**
    * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque). Defaults to 1.0 (opaque).
    */
  var opacity: Double = js.native
  
  /**
    * When on, animate call overrides current animation if applicable.
    */
  var overrideCurrentAnimation: Boolean = js.native
  
  /**
    * The preview context used in the 3D-Touch feature "Peek and Pop".
    */
  var previewContext: PreviewContext = js.native
  
  /**
    * Background color of the wrapper view when this view is used as either <Titanium.UI.ListView.pullView> or <Titanium.UI.TableView.headerPullView>.
    * Defaults to `undefined`. Results in a light grey background color on the wrapper view.
    */
  var pullBackgroundColor: String | Color = js.native
  
  /**
    * The bounding box of the view relative to its parent, in system units.
    */
  val rect: DimensionWithAbsolutes = js.native
  
  /**
    * Removes a child view from this view's hierarchy.
    */
  def remove(view: View): Unit = js.native
  
  /**
    * Removes all child views from this view's hierarchy.
    */
  def removeAllChildren(): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_click(name: click, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewClickEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    name: dblclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewDblclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_doubletap(
    name: doubletap,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewDoubletapEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(name: focus, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewFocusEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypressed(
    name: keypressed,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewKeypressedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_longclick(
    name: longclick,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewLongclickEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_longpress(
    name: longpress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewLongpressEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pinch(name: pinch, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewPinchEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_postlayout(
    name: postlayout,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewPostlayoutEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_singletap(
    name: singletap,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewSingletapEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_swipe(name: swipe, callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewSwipeEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    name: touchcancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchcancelEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    name: touchend,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchendEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    name: touchmove,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchmoveEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    name: touchstart,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTouchstartEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_twofingertap(
    name: twofingertap,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ViewTwofingertapEvent, Unit]
  ): Unit = js.native
  
  /**
    * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
    */
  def replaceAt(params: ViewPositionOptions): Unit = js.native
  
  /**
    * View's right position, in platform-specific units.
    */
  var right: Double | String = js.native
  
  /**
    * Clockwise 2D rotation of the view in degrees.
    */
  var rotation: Double = js.native
  
  /**
    * Clockwise rotation of the view in degrees (x-axis).
    */
  var rotationX: Double = js.native
  
  /**
    * Clockwise rotation of the view in degrees (y-axis).
    */
  var rotationY: Double = js.native
  
  /**
    * Scaling of the view in x-axis in pixels.
    */
  var scaleX: Double = js.native
  
  /**
    * Scaling of the view in y-axis in pixels.
    */
  var scaleY: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.accessibilityHidden> property.
    * @deprecated Set the value using <Titanium.UI.View.accessibilityHidden> instead.
    */
  def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.accessibilityHint> property.
    * @deprecated Set the value using <Titanium.UI.View.accessibilityHint> instead.
    */
  def setAccessibilityHint(accessibilityHint: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.accessibilityLabel> property.
    * @deprecated Set the value using <Titanium.UI.View.accessibilityLabel> instead.
    */
  def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.accessibilityValue> property.
    * @deprecated Set the value using <Titanium.UI.View.accessibilityValue> instead.
    */
  def setAccessibilityValue(accessibilityValue: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.anchorPoint> property.
    * @deprecated Set the value using <Titanium.UI.View.anchorPoint> instead.
    */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundColor> instead.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  def setBackgroundColor(backgroundColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundDisabledColor> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundDisabledColor> instead.
    */
  def setBackgroundDisabledColor(backgroundDisabledColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundDisabledImage> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundDisabledImage> instead.
    */
  def setBackgroundDisabledImage(backgroundDisabledImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundFocusedColor> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundFocusedColor> instead.
    */
  def setBackgroundFocusedColor(backgroundFocusedColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundFocusedImage> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundFocusedImage> instead.
    */
  def setBackgroundFocusedImage(backgroundFocusedImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundGradient> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundGradient> instead.
    */
  def setBackgroundGradient(backgroundGradient: Gradient): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundImage> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundImage> instead.
    */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundLeftCap> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundLeftCap> instead.
    */
  def setBackgroundLeftCap(backgroundLeftCap: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundRepeat> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundRepeat> instead.
    */
  def setBackgroundRepeat(backgroundRepeat: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundSelectedColor> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundSelectedColor> instead.
    */
  def setBackgroundSelectedColor(backgroundSelectedColor: String): Unit = js.native
  def setBackgroundSelectedColor(backgroundSelectedColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundSelectedImage> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundSelectedImage> instead.
    */
  def setBackgroundSelectedImage(backgroundSelectedImage: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.backgroundTopCap> property.
    * @deprecated Set the value using <Titanium.UI.View.backgroundTopCap> instead.
    */
  def setBackgroundTopCap(backgroundTopCap: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.borderColor> property.
    * @deprecated Set the value using <Titanium.UI.View.borderColor> instead.
    */
  def setBorderColor(borderColor: String): Unit = js.native
  def setBorderColor(borderColor: Color): Unit = js.native
  
  def setBorderRadius(borderRadius: String): Unit = js.native
  def setBorderRadius(borderRadius: js.Array[Double | String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.borderRadius> property.
    * @deprecated Set the value using <Titanium.UI.View.borderRadius> instead.
    */
  def setBorderRadius(borderRadius: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.borderWidth> property.
    * @deprecated Set the value using <Titanium.UI.View.borderWidth> instead.
    */
  def setBorderWidth(borderWidth: Double): Unit = js.native
  
  def setBottom(bottom: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.bottom> property.
    * @deprecated Set the value using <Titanium.UI.View.bottom> instead.
    */
  def setBottom(bottom: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.center> property.
    * @deprecated Set the value using <Titanium.UI.View.center> instead.
    */
  def setCenter(center: Point): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.clipMode> property.
    * @deprecated Set the value using <Titanium.UI.View.clipMode> instead.
    */
  def setClipMode(clipMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.elevation> property.
    * @deprecated Set the value using <Titanium.UI.View.elevation> instead.
    */
  def setElevation(elevation: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.focusable> property.
    * @deprecated Set the value using <Titanium.UI.View.focusable> instead.
    */
  def setFocusable(focusable: Boolean): Unit = js.native
  
  def setHeight(height: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.height> property.
    * @deprecated Set the value using <Titanium.UI.View.height> instead.
    */
  def setHeight(height: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.hiddenBehavior> property.
    * @deprecated Set the value using <Titanium.UI.View.hiddenBehavior> instead.
    */
  def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.horizontalMotionEffect> property.
    * @deprecated Set the value using <Titanium.UI.View.horizontalMotionEffect> instead.
    */
  def setHorizontalMotionEffect(horizontalMotionEffect: MinMaxOptions): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.horizontalWrap> property.
    * @deprecated Set the value using <Titanium.UI.View.horizontalWrap> instead.
    */
  def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.keepScreenOn> property.
    * @deprecated Set the value using <Titanium.UI.View.keepScreenOn> instead.
    */
  def setKeepScreenOn(keepScreenOn: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.layout> property.
    * @deprecated Set the value using <Titanium.UI.View.layout> instead.
    */
  def setLayout(layout: String): Unit = js.native
  
  def setLeft(left: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.left> property.
    * @deprecated Set the value using <Titanium.UI.View.left> instead.
    */
  def setLeft(left: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.opacity> property.
    * @deprecated Set the value using <Titanium.UI.View.opacity> instead.
    */
  def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.overrideCurrentAnimation> property.
    * @deprecated Set the value using <Titanium.UI.View.overrideCurrentAnimation> instead.
    */
  def setOverrideCurrentAnimation(overrideCurrentAnimation: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.previewContext> property.
    * @deprecated Set the value using <Titanium.UI.View.previewContext> instead.
    */
  def setPreviewContext(previewContext: PreviewContext): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.pullBackgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.View.pullBackgroundColor> instead.
    */
  def setPullBackgroundColor(pullBackgroundColor: String): Unit = js.native
  def setPullBackgroundColor(pullBackgroundColor: Color): Unit = js.native
  
  def setRight(right: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.right> property.
    * @deprecated Set the value using <Titanium.UI.View.right> instead.
    */
  def setRight(right: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.rotation> property.
    * @deprecated Set the value using <Titanium.UI.View.rotation> instead.
    */
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.rotationX> property.
    * @deprecated Set the value using <Titanium.UI.View.rotationX> instead.
    */
  def setRotationX(rotationX: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.rotationY> property.
    * @deprecated Set the value using <Titanium.UI.View.rotationY> instead.
    */
  def setRotationY(rotationY: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.scaleX> property.
    * @deprecated Set the value using <Titanium.UI.View.scaleX> instead.
    */
  def setScaleX(scaleX: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.scaleY> property.
    * @deprecated Set the value using <Titanium.UI.View.scaleY> instead.
    */
  def setScaleY(scaleY: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.softKeyboardOnFocus> property.
    * @deprecated Set the value using <Titanium.UI.View.softKeyboardOnFocus> instead.
    */
  def setSoftKeyboardOnFocus(softKeyboardOnFocus: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.tintColor> property.
    * @deprecated Set the value using <Titanium.UI.View.tintColor> instead.
    */
  def setTintColor(tintColor: String): Unit = js.native
  def setTintColor(tintColor: Color): Unit = js.native
  
  def setTop(top: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.top> property.
    * @deprecated Set the value using <Titanium.UI.View.top> instead.
    */
  def setTop(top: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.touchEnabled> property.
    * @deprecated Set the value using <Titanium.UI.View.touchEnabled> instead.
    */
  def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.touchFeedback> property.
    * @deprecated Set the value using <Titanium.UI.View.touchFeedback> instead.
    */
  def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.touchFeedbackColor> property.
    * @deprecated Set the value using <Titanium.UI.View.touchFeedbackColor> instead.
    */
  def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.transform> property.
    * @deprecated Set the value using <Titanium.UI.View.transform> instead.
    */
  def setTransform(transform: Matrix2D): Unit = js.native
  def setTransform(transform: Matrix3D): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.transitionName> property.
    * @deprecated Set the value using <Titanium.UI.View.transitionName> instead.
    */
  def setTransitionName(transitionName: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.translationX> property.
    * @deprecated Set the value using <Titanium.UI.View.translationX> instead.
    */
  def setTranslationX(translationX: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.translationY> property.
    * @deprecated Set the value using <Titanium.UI.View.translationY> instead.
    */
  def setTranslationY(translationY: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.translationZ> property.
    * @deprecated Set the value using <Titanium.UI.View.translationZ> instead.
    */
  def setTranslationZ(translationZ: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.verticalMotionEffect> property.
    * @deprecated Set the value using <Titanium.UI.View.verticalMotionEffect> instead.
    */
  def setVerticalMotionEffect(verticalMotionEffect: MinMaxOptions): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.viewShadowColor> property.
    * @deprecated Set the value using <Titanium.UI.View.viewShadowColor> instead.
    */
  def setViewShadowColor(viewShadowColor: String): Unit = js.native
  def setViewShadowColor(viewShadowColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.viewShadowOffset> property.
    * @deprecated Set the value using <Titanium.UI.View.viewShadowOffset> instead.
    */
  def setViewShadowOffset(viewShadowOffset: Point): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.viewShadowRadius> property.
    * @deprecated Set the value using <Titanium.UI.View.viewShadowRadius> instead.
    */
  def setViewShadowRadius(viewShadowRadius: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.visible> property.
    * @deprecated Set the value using <Titanium.UI.View.visible> instead.
    */
  def setVisible(visible: Boolean): Unit = js.native
  
  def setWidth(width: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.View.width> property.
    * @deprecated Set the value using <Titanium.UI.View.width> instead.
    */
  def setWidth(width: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.View.zIndex> property.
    * @deprecated Set the value using <Titanium.UI.View.zIndex> instead.
    */
  def setZIndex(zIndex: Double): Unit = js.native
  
  /**
    * Makes this view visible.
    */
  def show(): Unit = js.native
  def show(options: AnimatedOptions): Unit = js.native
  
  /**
    * The size of the view in system units.
    */
  val size: Dimension = js.native
  
  /**
    * Determines keyboard behavior when this view is focused. Defaults to <Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS>.
    */
  var softKeyboardOnFocus: Double = js.native
  
  /**
    * The view's tintColor
    */
  var tintColor: String | Color = js.native
  
  /**
    * Returns an image of the rendered view, as a Blob.
    */
  def toImage(): Blob = js.native
  def toImage(callback: js.UndefOr[scala.Nothing], honorScaleFactor: Boolean): Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ Blob, Unit]): Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ Blob, Unit], honorScaleFactor: Boolean): Blob = js.native
  
  /**
    * The view's top position.
    */
  var top: Double | String = js.native
  
  /**
    * Determines whether view should receive touch events.
    */
  var touchEnabled: Boolean = js.native
  
  /**
    * A material design visual construct that provides an instantaneous visual confirmation of touch point.
    */
  var touchFeedback: Boolean = js.native
  
  /**
    * Optional touch feedback ripple color. This has no effect unless `touchFeedback` is true.
    */
  var touchFeedbackColor: String = js.native
  
  /**
    * Transformation matrix to apply to the view.
    */
  var transform: Matrix2D | Matrix3D = js.native
  
  /**
    * A name to identify this view in activity transition.
    */
  var transitionName: String = js.native
  
  /**
    * Horizontal location of the view relative to its left position in pixels.
    */
  var translationX: Double = js.native
  
  /**
    * Vertical location of the view relative to its top position in pixels.
    */
  var translationY: Double = js.native
  
  /**
    * Depth of the view relative to its elevation in pixels.
    */
  var translationZ: Double = js.native
  
  /**
    * Adds a vertical parallax effect to the view
    */
  var verticalMotionEffect: MinMaxOptions = js.native
  
  /**
    * Determines the color of the shadow.
    */
  var viewShadowColor: String | Color = js.native
  
  /**
    * Determines the offset for the shadow of the view.
    */
  var viewShadowOffset: Point = js.native
  
  /**
    * Determines the blur radius used to create the shadow.
    */
  var viewShadowRadius: Double = js.native
  
  /**
    * Determines whether the view is visible.
    */
  var visible: Boolean = js.native
  
  /**
    * View's width, in platform-specific units.
    */
  var width: Double | String = js.native
  
  /**
    * Z-index stack order position, relative to other sibling views.
    */
  var zIndex: Double = js.native
}
