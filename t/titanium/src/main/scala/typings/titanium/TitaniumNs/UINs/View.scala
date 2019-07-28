package typings.titanium.TitaniumNs.UINs

import typings.titanium.AnimationOption
import typings.titanium.Dimension
import typings.titanium.Gradient
import typings.titanium.Point
import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.iOSNs.PreviewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
  			 * Coordinate of the view about which to pivot an animation.
  			 */
  var anchorPoint: Point = js.native
  /**
  			 * Current position of the view during an animation.
  			 */
  val animatedCenter: Point = js.native
  /**
  			 * Background color of the view, as a color name or hex triplet.
  			 */
  var backgroundColor: String = js.native
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
  var backgroundSelectedColor: String = js.native
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
  var borderColor: String = js.native
  /**
  			 * Radius for the rounded corners of the view's border.
  			 */
  var borderRadius: Double = js.native
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
  			 * View's clipping behavior.
  			 */
  var clipMode: Double = js.native
  /**
  			 * Base elevation of the view relative to its parent in pixels.
  			 */
  var elevation: Double = js.native
  /**
  			 * Whether view should be focusable while navigating with the trackball.
  			 */
  var focusable: Boolean = js.native
  /**
  			 * View height, in platform-specific units.
  			 */
  var height: Double | String = js.native
  /**
  			 * Sets the behavior when hiding an object to release or keep the free space
  			 */
  var hiddenBehavior: Double = js.native
  /**
  			 * Adds a horizontal parallax effect to the view
  			 */
  var horizontalMotionEffect: js.Any = js.native
  /**
  			 * Determines whether the layout has wrapping behavior.
  			 */
  var horizontalWrap: Boolean = js.native
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
  var pullBackgroundColor: String = js.native
  /**
  			 * The bounding box of the view relative to its parent, in system units.
  			 */
  val rect: Dimension = js.native
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
  var tintColor: String = js.native
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
  var verticalMotionEffect: js.Any = js.native
  /**
  			 * Determines the color of the shadow.
  			 */
  var viewShadowColor: String = js.native
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
  /**
  			 * Adds a child to this view's hierarchy.
  			 */
  def add(view: js.Any): Unit = js.native
  /**
  			 * Adds a child to this view's hierarchy.
  			 */
  def add(view: js.Array[_]): Unit = js.native
  /**
  			 * Animates this view.
  			 */
  def animate(animation: js.Any): Unit = js.native
  def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Translates a point from this view's coordinate system to another view's coordinate system.
  			 */
  def convertPointToView(point: Point, destinationView: js.Any): Point = js.native
  /**
  			 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  			 * view tree.
  			 */
  def finishLayout(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.accessibilityHidden> property.
  			 */
  def getAccessibilityHidden(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.accessibilityHint> property.
  			 */
  def getAccessibilityHint(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.accessibilityLabel> property.
  			 */
  def getAccessibilityLabel(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.accessibilityValue> property.
  			 */
  def getAccessibilityValue(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.anchorPoint> property.
  			 */
  def getAnchorPoint(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.animatedCenter> property.
  			 */
  def getAnimatedCenter(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundColor> property.
  			 */
  def getBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundDisabledColor> property.
  			 */
  def getBackgroundDisabledColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundDisabledImage> property.
  			 */
  def getBackgroundDisabledImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundFocusedColor> property.
  			 */
  def getBackgroundFocusedColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundFocusedImage> property.
  			 */
  def getBackgroundFocusedImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundGradient> property.
  			 */
  def getBackgroundGradient(): Gradient = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundImage> property.
  			 */
  def getBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundLeftCap> property.
  			 */
  def getBackgroundLeftCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundRepeat> property.
  			 */
  def getBackgroundRepeat(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundSelectedColor> property.
  			 */
  def getBackgroundSelectedColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundSelectedImage> property.
  			 */
  def getBackgroundSelectedImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.backgroundTopCap> property.
  			 */
  def getBackgroundTopCap(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.borderColor> property.
  			 */
  def getBorderColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.borderRadius> property.
  			 */
  def getBorderRadius(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.borderWidth> property.
  			 */
  def getBorderWidth(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.bottom> property.
  			 */
  def getBottom(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.center> property.
  			 */
  def getCenter(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.children> property.
  			 */
  def getChildren(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.clipMode> property.
  			 */
  def getClipMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.elevation> property.
  			 */
  def getElevation(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.focusable> property.
  			 */
  def getFocusable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.height> property.
  			 */
  def getHeight(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.hiddenBehavior> property.
  			 */
  def getHiddenBehavior(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.horizontalMotionEffect> property.
  			 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.horizontalWrap> property.
  			 */
  def getHorizontalWrap(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.keepScreenOn> property.
  			 */
  def getKeepScreenOn(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.layout> property.
  			 */
  def getLayout(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.left> property.
  			 */
  def getLeft(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.opacity> property.
  			 */
  def getOpacity(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.overrideCurrentAnimation> property.
  			 */
  def getOverrideCurrentAnimation(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.previewContext> property.
  			 */
  def getPreviewContext(): PreviewContext = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.pullBackgroundColor> property.
  			 */
  def getPullBackgroundColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.rect> property.
  			 */
  def getRect(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.right> property.
  			 */
  def getRight(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.rotation> property.
  			 */
  def getRotation(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.rotationX> property.
  			 */
  def getRotationX(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.rotationY> property.
  			 */
  def getRotationY(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.scaleX> property.
  			 */
  def getScaleX(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.scaleY> property.
  			 */
  def getScaleY(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.size> property.
  			 */
  def getSize(): Dimension = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.softKeyboardOnFocus> property.
  			 */
  def getSoftKeyboardOnFocus(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.tintColor> property.
  			 */
  def getTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.top> property.
  			 */
  def getTop(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.touchEnabled> property.
  			 */
  def getTouchEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.touchFeedback> property.
  			 */
  def getTouchFeedback(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.touchFeedbackColor> property.
  			 */
  def getTouchFeedbackColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.transform> property.
  			 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.transitionName> property.
  			 */
  def getTransitionName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.translationX> property.
  			 */
  def getTranslationX(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.translationY> property.
  			 */
  def getTranslationY(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.translationZ> property.
  			 */
  def getTranslationZ(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.verticalMotionEffect> property.
  			 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  			 * Returns the matching view of a given view ID.
  			 */
  def getViewById(id: String): View = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.viewShadowColor> property.
  			 */
  def getViewShadowColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.viewShadowOffset> property.
  			 */
  def getViewShadowOffset(): Point = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.viewShadowRadius> property.
  			 */
  def getViewShadowRadius(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.visible> property.
  			 */
  def getVisible(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.width> property.
  			 */
  def getWidth(): Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.View.zIndex> property.
  			 */
  def getZIndex(): Double = js.native
  /**
  			 * Hides this view.
  			 */
  def hide(): Unit = js.native
  def hide(options: AnimationOption): Unit = js.native
  /**
  			 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  			 */
  def insertAt(params: js.Any): Unit = js.native
  /**
  			 * Removes a child view from this view's hierarchy.
  			 */
  def remove(view: js.Any): Unit = js.native
  /**
  			 * Removes all child views from this view's hierarchy.
  			 */
  def removeAllChildren(): Unit = js.native
  /**
  			 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  			 */
  def replaceAt(params: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.accessibilityHidden> property.
  			 */
  def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.accessibilityHint> property.
  			 */
  def setAccessibilityHint(accessibilityHint: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.accessibilityLabel> property.
  			 */
  def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.accessibilityValue> property.
  			 */
  def setAccessibilityValue(accessibilityValue: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.anchorPoint> property.
  			 */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundColor> property.
  			 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundDisabledColor> property.
  			 */
  def setBackgroundDisabledColor(backgroundDisabledColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundDisabledImage> property.
  			 */
  def setBackgroundDisabledImage(backgroundDisabledImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundFocusedColor> property.
  			 */
  def setBackgroundFocusedColor(backgroundFocusedColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundFocusedImage> property.
  			 */
  def setBackgroundFocusedImage(backgroundFocusedImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundGradient> property.
  			 */
  def setBackgroundGradient(backgroundGradient: Gradient): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundImage> property.
  			 */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundLeftCap> property.
  			 */
  def setBackgroundLeftCap(backgroundLeftCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundRepeat> property.
  			 */
  def setBackgroundRepeat(backgroundRepeat: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundSelectedColor> property.
  			 */
  def setBackgroundSelectedColor(backgroundSelectedColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundSelectedImage> property.
  			 */
  def setBackgroundSelectedImage(backgroundSelectedImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.backgroundTopCap> property.
  			 */
  def setBackgroundTopCap(backgroundTopCap: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.borderColor> property.
  			 */
  def setBorderColor(borderColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.borderRadius> property.
  			 */
  def setBorderRadius(borderRadius: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.borderWidth> property.
  			 */
  def setBorderWidth(borderWidth: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.bottom> property.
  			 */
  def setBottom(bottom: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.bottom> property.
  			 */
  def setBottom(bottom: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.center> property.
  			 */
  def setCenter(center: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.clipMode> property.
  			 */
  def setClipMode(clipMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.elevation> property.
  			 */
  def setElevation(elevation: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.focusable> property.
  			 */
  def setFocusable(focusable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.height> property.
  			 */
  def setHeight(height: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.height> property.
  			 */
  def setHeight(height: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.hiddenBehavior> property.
  			 */
  def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.horizontalMotionEffect> property.
  			 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.horizontalWrap> property.
  			 */
  def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.keepScreenOn> property.
  			 */
  def setKeepScreenOn(keepScreenOn: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.layout> property.
  			 */
  def setLayout(layout: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.left> property.
  			 */
  def setLeft(left: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.left> property.
  			 */
  def setLeft(left: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.opacity> property.
  			 */
  def setOpacity(opacity: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.overrideCurrentAnimation> property.
  			 */
  def setOverrideCurrentAnimation(overrideCurrentAnimation: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.previewContext> property.
  			 */
  def setPreviewContext(previewContext: PreviewContext): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.pullBackgroundColor> property.
  			 */
  def setPullBackgroundColor(pullBackgroundColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.right> property.
  			 */
  def setRight(right: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.right> property.
  			 */
  def setRight(right: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.rotation> property.
  			 */
  def setRotation(rotation: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.rotationX> property.
  			 */
  def setRotationX(rotationX: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.rotationY> property.
  			 */
  def setRotationY(rotationY: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.scaleX> property.
  			 */
  def setScaleX(scaleX: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.scaleY> property.
  			 */
  def setScaleY(scaleY: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.softKeyboardOnFocus> property.
  			 */
  def setSoftKeyboardOnFocus(softKeyboardOnFocus: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.tintColor> property.
  			 */
  def setTintColor(tintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.top> property.
  			 */
  def setTop(top: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.top> property.
  			 */
  def setTop(top: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.touchEnabled> property.
  			 */
  def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.touchFeedback> property.
  			 */
  def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.touchFeedbackColor> property.
  			 */
  def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.transform> property.
  			 */
  def setTransform(transform: Matrix2D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.transform> property.
  			 */
  def setTransform(transform: Matrix3D): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.transitionName> property.
  			 */
  def setTransitionName(transitionName: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.translationX> property.
  			 */
  def setTranslationX(translationX: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.translationY> property.
  			 */
  def setTranslationY(translationY: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.translationZ> property.
  			 */
  def setTranslationZ(translationZ: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.verticalMotionEffect> property.
  			 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.viewShadowColor> property.
  			 */
  def setViewShadowColor(viewShadowColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.viewShadowOffset> property.
  			 */
  def setViewShadowOffset(viewShadowOffset: Point): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.viewShadowRadius> property.
  			 */
  def setViewShadowRadius(viewShadowRadius: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.visible> property.
  			 */
  def setVisible(visible: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.width> property.
  			 */
  def setWidth(width: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.width> property.
  			 */
  def setWidth(width: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.View.zIndex> property.
  			 */
  def setZIndex(zIndex: Double): Unit = js.native
  /**
  			 * Makes this view visible.
  			 */
  def show(): Unit = js.native
  def show(options: AnimationOption): Unit = js.native
  /**
  			 * Starts a batch update of this view's layout properties.
  			 */
  def startLayout(): Unit = js.native
  /**
  			 * Returns an image of the rendered view, as a Blob.
  			 */
  def toImage(): Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ Blob, _]): Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ Blob, _], honorScaleFactor: Boolean): Blob = js.native
  /**
  			 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  			 * they have been updated.
  			 */
  def updateLayout(params: js.Any): Unit = js.native
}

