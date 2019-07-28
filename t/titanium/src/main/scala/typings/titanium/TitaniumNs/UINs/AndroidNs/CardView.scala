package typings.titanium.TitaniumNs.UINs.AndroidNs

import typings.titanium.AnimationOption
import typings.titanium.Dimension
import typings.titanium.Point
import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.Matrix2D
import typings.titanium.TitaniumNs.UINs.Matrix3D
import typings.titanium.TitaniumNs.UINs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * CardView provides a layout container with rounded corners and a shadow indicating the view is elevated.
			 */
@js.native
trait CardView extends Proxy {
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
  				 * Background color for CardView as a color name or hex triplet.
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
  				 * Selected background color of the view, as a color name or hex triplet.
  				 */
  var backgroundSelectedColor: String = js.native
  /**
  				 * Selected background image url for the view, specified as a local file path or URL.
  				 */
  var backgroundSelectedImage: String = js.native
  /**
  				 * Corner radius for CardView.
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
  				 * Background color for CardView as a color name or hex triplet.
  				 */
  var cardBackgroundColor: String = js.native
  /**
  				 * Corner radius for CardView.
  				 */
  var cardCornerRadius: Double = js.native
  /**
  				 * Elevation for CardView.
  				 */
  var cardElevation: Double = js.native
  /**
  				 * Maximum Elevation for CardView.
  				 */
  var cardMaxElevation: Double = js.native
  /**
  				 * Add padding to CardView on API level 20 and before to prevent intersections between
  				 * the Card content and rounded corners.
  				 */
  var cardPreventCornerOverlap: Boolean = js.native
  /**
  				 * Add padding on API level 21 and above to have the same measurements with previous versions.
  				 */
  var cardUseCompatPadding: Boolean = js.native
  /**
  				 * View's center position, in the parent view's coordinates.
  				 */
  var center: Point = js.native
  /**
  				 * Array of this view's child views.
  				 */
  val children: js.Array[View] = js.native
  /**
  				 * Inner padding between the edges of the Card and children of the CardView.
  				 */
  var contentPadding: Double = js.native
  /**
  				 * Inner padding between the bottom edge of the Card and children of the CardView.
  				 */
  var contentPaddingBottom: Double = js.native
  /**
  				 * Inner padding between the left edge of the Card and children of the CardView.
  				 */
  var contentPaddingLeft: Double = js.native
  /**
  				 * Inner padding between the right edge of the Card and children of the CardView.
  				 */
  var contentPaddingRight: Double = js.native
  /**
  				 * Inner padding between the top edge of the Card and children of the CardView.
  				 */
  var contentPaddingTop: Double = js.native
  /**
  				 * Elevation for CardView.
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
  				 * Maximum Elevation for CardView.
  				 */
  var maxElevation: Double = js.native
  /**
  				 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque). Defaults to 1.0 (opaque).
  				 */
  var opacity: Double = js.native
  /**
  				 * When on, animate call overrides current animation if applicable.
  				 */
  var overrideCurrentAnimation: Boolean = js.native
  /**
  				 * Inner padding between the edges of the Card and children of the CardView.
  				 */
  var padding: Double = js.native
  /**
  				 * Inner padding between the bottom edge of the Card and children of the CardView.
  				 */
  var paddingBottom: Double = js.native
  /**
  				 * Inner padding between the left edge of the Card and children of the CardView.
  				 */
  var paddingLeft: Double = js.native
  /**
  				 * Inner padding between the right edge of the Card and children of the CardView.
  				 */
  var paddingRight: Double = js.native
  /**
  				 * Inner padding between the top edge of the Card and children of the CardView.
  				 */
  var paddingTop: Double = js.native
  /**
  				 * Add padding to CardView on API level 20 and before to prevent intersections between
  				 * the Card content and rounded corners.
  				 */
  var preventCornerOverlap: Boolean = js.native
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
  				 * Add padding on API level 21 and above to have the same measurements with previous versions.
  				 */
  var useCompatPadding: Boolean = js.native
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
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.anchorPoint> property.
  				 */
  def getAnchorPoint(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundColor> property.
  				 */
  def getBackgroundColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundDisabledColor> property.
  				 */
  def getBackgroundDisabledColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundDisabledImage> property.
  				 */
  def getBackgroundDisabledImage(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundFocusedColor> property.
  				 */
  def getBackgroundFocusedColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundFocusedImage> property.
  				 */
  def getBackgroundFocusedImage(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundSelectedColor> property.
  				 */
  def getBackgroundSelectedColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundSelectedImage> property.
  				 */
  def getBackgroundSelectedImage(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.borderRadius> property.
  				 */
  def getBorderRadius(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.borderWidth> property.
  				 */
  def getBorderWidth(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.bottom> property.
  				 */
  def getBottom(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardBackgroundColor> property.
  				 */
  def getCardBackgroundColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardCornerRadius> property.
  				 */
  def getCardCornerRadius(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardElevation> property.
  				 */
  def getCardElevation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardMaxElevation> property.
  				 */
  def getCardMaxElevation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardPreventCornerOverlap> property.
  				 */
  def getCardPreventCornerOverlap(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardUseCompatPadding> property.
  				 */
  def getCardUseCompatPadding(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.center> property.
  				 */
  def getCenter(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.children> property.
  				 */
  def getChildren(): js.Array[View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPadding> property.
  				 */
  def getContentPadding(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingBottom> property.
  				 */
  def getContentPaddingBottom(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingLeft> property.
  				 */
  def getContentPaddingLeft(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingRight> property.
  				 */
  def getContentPaddingRight(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingTop> property.
  				 */
  def getContentPaddingTop(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.elevation> property.
  				 */
  def getElevation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.focusable> property.
  				 */
  def getFocusable(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.height> property.
  				 */
  def getHeight(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.hiddenBehavior> property.
  				 */
  def getHiddenBehavior(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.keepScreenOn> property.
  				 */
  def getKeepScreenOn(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.layout> property.
  				 */
  def getLayout(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.left> property.
  				 */
  def getLeft(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.maxElevation> property.
  				 */
  def getMaxElevation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.opacity> property.
  				 */
  def getOpacity(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.overrideCurrentAnimation> property.
  				 */
  def getOverrideCurrentAnimation(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.padding> property.
  				 */
  def getPadding(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingBottom> property.
  				 */
  def getPaddingBottom(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingLeft> property.
  				 */
  def getPaddingLeft(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingRight> property.
  				 */
  def getPaddingRight(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingTop> property.
  				 */
  def getPaddingTop(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.preventCornerOverlap> property.
  				 */
  def getPreventCornerOverlap(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rect> property.
  				 */
  def getRect(): Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.right> property.
  				 */
  def getRight(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rotation> property.
  				 */
  def getRotation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rotationX> property.
  				 */
  def getRotationX(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rotationY> property.
  				 */
  def getRotationY(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.scaleX> property.
  				 */
  def getScaleX(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.scaleY> property.
  				 */
  def getScaleY(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.size> property.
  				 */
  def getSize(): Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.softKeyboardOnFocus> property.
  				 */
  def getSoftKeyboardOnFocus(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.top> property.
  				 */
  def getTop(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.touchEnabled> property.
  				 */
  def getTouchEnabled(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.touchFeedback> property.
  				 */
  def getTouchFeedback(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.touchFeedbackColor> property.
  				 */
  def getTouchFeedbackColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.transform> property.
  				 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.transitionName> property.
  				 */
  def getTransitionName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.translationX> property.
  				 */
  def getTranslationX(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.translationY> property.
  				 */
  def getTranslationY(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.translationZ> property.
  				 */
  def getTranslationZ(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.useCompatPadding> property.
  				 */
  def getUseCompatPadding(): Boolean = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: String): View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.visible> property.
  				 */
  def getVisible(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.width> property.
  				 */
  def getWidth(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.zIndex> property.
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
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.anchorPoint> property.
  				 */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundDisabledColor> property.
  				 */
  def setBackgroundDisabledColor(backgroundDisabledColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundDisabledImage> property.
  				 */
  def setBackgroundDisabledImage(backgroundDisabledImage: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundFocusedColor> property.
  				 */
  def setBackgroundFocusedColor(backgroundFocusedColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundFocusedImage> property.
  				 */
  def setBackgroundFocusedImage(backgroundFocusedImage: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundSelectedColor> property.
  				 */
  def setBackgroundSelectedColor(backgroundSelectedColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundSelectedImage> property.
  				 */
  def setBackgroundSelectedImage(backgroundSelectedImage: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.bottom> property.
  				 */
  def setBottom(bottom: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.bottom> property.
  				 */
  def setBottom(bottom: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardBackgroundColor> property.
  				 */
  def setCardBackgroundColor(cardBackgroundColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardCornerRadius> property.
  				 */
  def setCardCornerRadius(cardCornerRadius: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardElevation> property.
  				 */
  def setCardElevation(cardElevation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardMaxElevation> property.
  				 */
  def setCardMaxElevation(cardMaxElevation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardPreventCornerOverlap> property.
  				 */
  def setCardPreventCornerOverlap(cardPreventCornerOverlap: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardUseCompatPadding> property.
  				 */
  def setCardUseCompatPadding(cardUseCompatPadding: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.center> property.
  				 */
  def setCenter(center: Point): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPadding> property.
  				 */
  def setContentPadding(contentPadding: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingBottom> property.
  				 */
  def setContentPaddingBottom(contentPaddingBottom: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingLeft> property.
  				 */
  def setContentPaddingLeft(contentPaddingLeft: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingRight> property.
  				 */
  def setContentPaddingRight(contentPaddingRight: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingTop> property.
  				 */
  def setContentPaddingTop(contentPaddingTop: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.elevation> property.
  				 */
  def setElevation(elevation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.focusable> property.
  				 */
  def setFocusable(focusable: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.height> property.
  				 */
  def setHeight(height: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.height> property.
  				 */
  def setHeight(height: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.hiddenBehavior> property.
  				 */
  def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.keepScreenOn> property.
  				 */
  def setKeepScreenOn(keepScreenOn: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.layout> property.
  				 */
  def setLayout(layout: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.left> property.
  				 */
  def setLeft(left: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.left> property.
  				 */
  def setLeft(left: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.maxElevation> property.
  				 */
  def setMaxElevation(maxElevation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.opacity> property.
  				 */
  def setOpacity(opacity: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.overrideCurrentAnimation> property.
  				 */
  def setOverrideCurrentAnimation(overrideCurrentAnimation: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.padding> property.
  				 */
  def setPadding(padding: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingBottom> property.
  				 */
  def setPaddingBottom(paddingBottom: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingLeft> property.
  				 */
  def setPaddingLeft(paddingLeft: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingRight> property.
  				 */
  def setPaddingRight(paddingRight: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingTop> property.
  				 */
  def setPaddingTop(paddingTop: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.preventCornerOverlap> property.
  				 */
  def setPreventCornerOverlap(preventCornerOverlap: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.right> property.
  				 */
  def setRight(right: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.right> property.
  				 */
  def setRight(right: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.rotation> property.
  				 */
  def setRotation(rotation: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.rotationX> property.
  				 */
  def setRotationX(rotationX: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.rotationY> property.
  				 */
  def setRotationY(rotationY: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.scaleX> property.
  				 */
  def setScaleX(scaleX: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.scaleY> property.
  				 */
  def setScaleY(scaleY: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.softKeyboardOnFocus> property.
  				 */
  def setSoftKeyboardOnFocus(softKeyboardOnFocus: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.top> property.
  				 */
  def setTop(top: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.top> property.
  				 */
  def setTop(top: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.touchFeedback> property.
  				 */
  def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.touchFeedbackColor> property.
  				 */
  def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.transform> property.
  				 */
  def setTransform(transform: Matrix2D): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.transform> property.
  				 */
  def setTransform(transform: Matrix3D): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.transitionName> property.
  				 */
  def setTransitionName(transitionName: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.translationX> property.
  				 */
  def setTranslationX(translationX: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.translationY> property.
  				 */
  def setTranslationY(translationY: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.translationZ> property.
  				 */
  def setTranslationZ(translationZ: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.useCompatPadding> property.
  				 */
  def setUseCompatPadding(useCompatPadding: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.visible> property.
  				 */
  def setVisible(visible: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.width> property.
  				 */
  def setWidth(width: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.width> property.
  				 */
  def setWidth(width: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.zIndex> property.
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

