package typings.titanium.Titanium.UI

import typings.titanium.AnimationOption
import typings.titanium.Dimension
import typings.titanium.Gradient
import typings.titanium.Point
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.Android.CardView
import typings.titanium.Titanium.UI.Android.DrawerLayout
import typings.titanium.Titanium.UI.Android.ProgressIndicator
import typings.titanium.Titanium.UI.Android.SearchView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Android-specific UI capabilities. All properties, methods and events in this namespace will
		 * only work on Android systems.
		 */
@JSGlobal("Titanium.UI.Android")
@js.native
object Android extends js.Object {
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
  
  /**
  			 * A panel that displays the app's main navigation options on the left edge of the screen.
  			 */
  @js.native
  trait DrawerLayout extends Proxy {
    /**
    				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is locked closed.
    				 */
    val LOCK_MODE_LOCKED_CLOSED: Double = js.native
    /**
    				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is locked opened.
    				 */
    val LOCK_MODE_LOCKED_OPEN: Double = js.native
    /**
    				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is reset to default lock state.
    				 */
    val LOCK_MODE_UNDEFINED: Double = js.native
    /**
    				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is unlocked.
    				 */
    val LOCK_MODE_UNLOCKED: Double = js.native
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
    				 * Get or set the center view
    				 */
    var centerView: View = js.native
    /**
    				 * Array of this view's child views.
    				 */
    val children: js.Array[View] = js.native
    /**
    				 * Determine the drawer indicator status
    				 */
    var drawerIndicatorEnabled: Boolean = js.native
    /**
    				 * Get or set the drawerLockMode
    				 */
    var drawerLockMode: Double = js.native
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
    				 * Determines whether the layout has wrapping behavior.
    				 */
    var horizontalWrap: Boolean = js.native
    /**
    				 * Determine whether the left drawer is open
    				 */
    var isLeftOpen: Boolean = js.native
    /**
    				 * Determine whether the left drawer is visible
    				 */
    var isLeftVisible: Boolean = js.native
    /**
    				 * Determine whether the right drawer is open
    				 */
    var isRightOpen: Boolean = js.native
    /**
    				 * Determine whether the right drawer is visible
    				 */
    var isRightVisible: Boolean = js.native
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
    				 * Get or set the view of the left drawer
    				 */
    var leftView: View = js.native
    /**
    				 * Get or set the width of the left drawer
    				 */
    var leftWidth: Double = js.native
    /**
    				 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque). Defaults to 1.0 (opaque).
    				 */
    var opacity: Double = js.native
    /**
    				 * When on, animate call overrides current animation if applicable.
    				 */
    var overrideCurrentAnimation: Boolean = js.native
    /**
    				 * The bounding box of the view relative to its parent, in system units.
    				 */
    val rect: Dimension = js.native
    /**
    				 * View's right position, in platform-specific units.
    				 */
    var right: Double | String = js.native
    /**
    				 * Get or set the view of the right drawer
    				 */
    var rightView: View = js.native
    /**
    				 * Get or set the width of the right drawer
    				 */
    var rightWidth: Double = js.native
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
    				 * A Toolbar instance to use as a toolbar.
    				 */
    var toolbar: Toolbar = js.native
    /**
    				 * Determine whether to enable the toolbar.
    				 */
    var toolbarEnabled: Boolean = js.native
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
    				 * Close the left view.
    				 */
    def closeLeft(): Unit = js.native
    /**
    				 * Close the right view.
    				 */
    def closeRight(): Unit = js.native
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
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHidden> property.
    				 */
    def getAccessibilityHidden(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHint> property.
    				 */
    def getAccessibilityHint(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityLabel> property.
    				 */
    def getAccessibilityLabel(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityValue> property.
    				 */
    def getAccessibilityValue(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.anchorPoint> property.
    				 */
    def getAnchorPoint(): Point = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundColor> property.
    				 */
    def getBackgroundColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledColor> property.
    				 */
    def getBackgroundDisabledColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledImage> property.
    				 */
    def getBackgroundDisabledImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedColor> property.
    				 */
    def getBackgroundFocusedColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedImage> property.
    				 */
    def getBackgroundFocusedImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundGradient> property.
    				 */
    def getBackgroundGradient(): Gradient = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundImage> property.
    				 */
    def getBackgroundImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundRepeat> property.
    				 */
    def getBackgroundRepeat(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedColor> property.
    				 */
    def getBackgroundSelectedColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedImage> property.
    				 */
    def getBackgroundSelectedImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.borderColor> property.
    				 */
    def getBorderColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.borderRadius> property.
    				 */
    def getBorderRadius(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.borderWidth> property.
    				 */
    def getBorderWidth(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.bottom> property.
    				 */
    def getBottom(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.center> property.
    				 */
    def getCenter(): Point = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.centerView> property.
    				 */
    def getCenterView(): View = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.children> property.
    				 */
    def getChildren(): js.Array[View] = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> property.
    				 */
    def getDrawerIndicatorEnabled(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.drawerLockMode> property.
    				 */
    def getDrawerLockMode(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.elevation> property.
    				 */
    def getElevation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.focusable> property.
    				 */
    def getFocusable(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.height> property.
    				 */
    def getHeight(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.hiddenBehavior> property.
    				 */
    def getHiddenBehavior(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.horizontalWrap> property.
    				 */
    def getHorizontalWrap(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isLeftOpen> property.
    				 */
    def getIsLeftOpen(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isLeftVisible> property.
    				 */
    def getIsLeftVisible(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isRightOpen> property.
    				 */
    def getIsRightOpen(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isRightVisible> property.
    				 */
    def getIsRightVisible(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.keepScreenOn> property.
    				 */
    def getKeepScreenOn(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.layout> property.
    				 */
    def getLayout(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.left> property.
    				 */
    def getLeft(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.leftView> property.
    				 */
    def getLeftView(): View = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.leftWidth> property.
    				 */
    def getLeftWidth(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.opacity> property.
    				 */
    def getOpacity(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.overrideCurrentAnimation> property.
    				 */
    def getOverrideCurrentAnimation(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rect> property.
    				 */
    def getRect(): Dimension = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.right> property.
    				 */
    def getRight(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rightView> property.
    				 */
    def getRightView(): View = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rightWidth> property.
    				 */
    def getRightWidth(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rotation> property.
    				 */
    def getRotation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rotationX> property.
    				 */
    def getRotationX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rotationY> property.
    				 */
    def getRotationY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.scaleX> property.
    				 */
    def getScaleX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.scaleY> property.
    				 */
    def getScaleY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.size> property.
    				 */
    def getSize(): Dimension = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.softKeyboardOnFocus> property.
    				 */
    def getSoftKeyboardOnFocus(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.toolbar> property.
    				 */
    def getToolbar(): Toolbar = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.toolbarEnabled> property.
    				 */
    def getToolbarEnabled(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.top> property.
    				 */
    def getTop(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.touchEnabled> property.
    				 */
    def getTouchEnabled(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedback> property.
    				 */
    def getTouchFeedback(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedbackColor> property.
    				 */
    def getTouchFeedbackColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.transform> property.
    				 */
    def getTransform(): Matrix2D | Matrix3D = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.transitionName> property.
    				 */
    def getTransitionName(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.translationX> property.
    				 */
    def getTranslationX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.translationY> property.
    				 */
    def getTranslationY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.translationZ> property.
    				 */
    def getTranslationZ(): Double = js.native
    /**
    				 * Returns the matching view of a given view ID.
    				 */
    def getViewById(id: String): View = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.visible> property.
    				 */
    def getVisible(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.width> property.
    				 */
    def getWidth(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.zIndex> property.
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
    				 * Disallow touch events on a specific view.
    				 */
    def interceptTouchEvent(view: js.Any, disallowIntercept: Boolean): Unit = js.native
    /**
    				 * Open the left view.
    				 */
    def openLeft(): Unit = js.native
    /**
    				 * Open the right view.
    				 */
    def openRight(): Unit = js.native
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
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHidden> property.
    				 */
    def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHint> property.
    				 */
    def setAccessibilityHint(accessibilityHint: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityLabel> property.
    				 */
    def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityValue> property.
    				 */
    def setAccessibilityValue(accessibilityValue: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.anchorPoint> property.
    				 */
    def setAnchorPoint(anchorPoint: Point): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundColor> property.
    				 */
    def setBackgroundColor(backgroundColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledColor> property.
    				 */
    def setBackgroundDisabledColor(backgroundDisabledColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledImage> property.
    				 */
    def setBackgroundDisabledImage(backgroundDisabledImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedColor> property.
    				 */
    def setBackgroundFocusedColor(backgroundFocusedColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedImage> property.
    				 */
    def setBackgroundFocusedImage(backgroundFocusedImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundGradient> property.
    				 */
    def setBackgroundGradient(backgroundGradient: Gradient): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundImage> property.
    				 */
    def setBackgroundImage(backgroundImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundRepeat> property.
    				 */
    def setBackgroundRepeat(backgroundRepeat: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedColor> property.
    				 */
    def setBackgroundSelectedColor(backgroundSelectedColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedImage> property.
    				 */
    def setBackgroundSelectedImage(backgroundSelectedImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.borderColor> property.
    				 */
    def setBorderColor(borderColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.borderRadius> property.
    				 */
    def setBorderRadius(borderRadius: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.borderWidth> property.
    				 */
    def setBorderWidth(borderWidth: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.bottom> property.
    				 */
    def setBottom(bottom: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.bottom> property.
    				 */
    def setBottom(bottom: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.center> property.
    				 */
    def setCenter(center: Point): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.centerView> property.
    				 */
    def setCenterView(centerView: js.Any): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> property.
    				 */
    def setDrawerIndicatorEnabled(drawerIndicatorEnabled: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.drawerLockMode> property.
    				 */
    def setDrawerLockMode(drawerLockMode: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.elevation> property.
    				 */
    def setElevation(elevation: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.focusable> property.
    				 */
    def setFocusable(focusable: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.height> property.
    				 */
    def setHeight(height: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.height> property.
    				 */
    def setHeight(height: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.hiddenBehavior> property.
    				 */
    def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.horizontalWrap> property.
    				 */
    def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isLeftOpen> property.
    				 */
    def setIsLeftOpen(isLeftOpen: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isLeftVisible> property.
    				 */
    def setIsLeftVisible(isLeftVisible: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isRightOpen> property.
    				 */
    def setIsRightOpen(isRightOpen: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isRightVisible> property.
    				 */
    def setIsRightVisible(isRightVisible: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.keepScreenOn> property.
    				 */
    def setKeepScreenOn(keepScreenOn: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.layout> property.
    				 */
    def setLayout(layout: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.left> property.
    				 */
    def setLeft(left: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.left> property.
    				 */
    def setLeft(left: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.leftView> property.
    				 */
    def setLeftView(leftView: js.Any): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.leftWidth> property.
    				 */
    def setLeftWidth(leftWidth: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.opacity> property.
    				 */
    def setOpacity(opacity: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.overrideCurrentAnimation> property.
    				 */
    def setOverrideCurrentAnimation(overrideCurrentAnimation: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.right> property.
    				 */
    def setRight(right: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.right> property.
    				 */
    def setRight(right: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rightView> property.
    				 */
    def setRightView(rightView: js.Any): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rightWidth> property.
    				 */
    def setRightWidth(rightWidth: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rotation> property.
    				 */
    def setRotation(rotation: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rotationX> property.
    				 */
    def setRotationX(rotationX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rotationY> property.
    				 */
    def setRotationY(rotationY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.scaleX> property.
    				 */
    def setScaleX(scaleX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.scaleY> property.
    				 */
    def setScaleY(scaleY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.softKeyboardOnFocus> property.
    				 */
    def setSoftKeyboardOnFocus(softKeyboardOnFocus: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.toolbar> property.
    				 */
    def setToolbar(toolbar: Toolbar): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.toolbarEnabled> property.
    				 */
    def setToolbarEnabled(toolbarEnabled: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.top> property.
    				 */
    def setTop(top: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.top> property.
    				 */
    def setTop(top: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.touchEnabled> property.
    				 */
    def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedback> property.
    				 */
    def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedbackColor> property.
    				 */
    def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.transform> property.
    				 */
    def setTransform(transform: Matrix2D): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.transform> property.
    				 */
    def setTransform(transform: Matrix3D): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.transitionName> property.
    				 */
    def setTransitionName(transitionName: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.translationX> property.
    				 */
    def setTranslationX(translationX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.translationY> property.
    				 */
    def setTranslationY(translationY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.translationZ> property.
    				 */
    def setTranslationZ(translationZ: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.visible> property.
    				 */
    def setVisible(visible: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.width> property.
    				 */
    def setWidth(width: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.width> property.
    				 */
    def setWidth(width: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.zIndex> property.
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
    				 * Toggle the visibility of the left view.
    				 */
    def toggleLeft(): Unit = js.native
    /**
    				 * Toggle the visibility of the right view.
    				 */
    def toggleRight(): Unit = js.native
    /**
    				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
    				 * they have been updated.
    				 */
    def updateLayout(params: js.Any): Unit = js.native
  }
  
  /**
  			 * A progress dialog or a horizontal progress bar in the title of the window.
  			 */
  @js.native
  trait ProgressIndicator extends Proxy {
    /**
    				 * When `true` allows the user to cancel the progress dialog by pressing the BACK button.
    				 */
    var cancelable: Boolean = js.native
    /**
    				 * When `cancelable` is set to `true` and this is set to `true`, the dialog is canceled when touched outside the window's bounds.
    				 */
    var canceledOnTouchOutside: Boolean = js.native
    /**
    				 * Base elevation of the view relative to its parent in pixels.
    				 */
    var elevation: Double = js.native
    /**
    				 * Sets the behavior when hiding an object to release or keep the free space
    				 */
    var hiddenBehavior: Double = js.native
    /**
    				 * Location for the progress indicator.
    				 */
    var location: Double = js.native
    /**
    				 * Maximum value of the progress bar.
    				 */
    var max: Double = js.native
    /**
    				 * Message text.
    				 */
    var message: String = js.native
    /**
    				 * Key identifying a string in the locale file to use for the message text.
    				 */
    var messageid: String = js.native
    /**
    				 * Minimum value of the progress bar.
    				 */
    var min: Double = js.native
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
    				 * A material design visual construct that provides an instantaneous visual confirmation of touch point.
    				 */
    var touchFeedback: Boolean = js.native
    /**
    				 * Optional touch feedback ripple color. This has no effect unless `touchFeedback` is true.
    				 */
    var touchFeedbackColor: String = js.native
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
    				 * Type for the progress indicator.
    				 */
    var `type`: Double = js.native
    /**
    				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
    				 * view tree.
    				 */
    def finishLayout(): Unit = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
    				 */
    def getCancelable(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
    				 */
    def getCanceledOnTouchOutside(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.elevation> property.
    				 */
    def getElevation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.hiddenBehavior> property.
    				 */
    def getHiddenBehavior(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
    				 */
    def getLocation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
    				 */
    def getMax(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
    				 */
    def getMessage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
    				 */
    def getMessageid(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
    				 */
    def getMin(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotation> property.
    				 */
    def getRotation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotationX> property.
    				 */
    def getRotationX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.rotationY> property.
    				 */
    def getRotationY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.scaleX> property.
    				 */
    def getScaleX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.scaleY> property.
    				 */
    def getScaleY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedback> property.
    				 */
    def getTouchFeedback(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedbackColor> property.
    				 */
    def getTouchFeedbackColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.transitionName> property.
    				 */
    def getTransitionName(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationX> property.
    				 */
    def getTranslationX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationY> property.
    				 */
    def getTranslationY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.translationZ> property.
    				 */
    def getTranslationZ(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
    				 */
    def getType(): Double = js.native
    /**
    				 * Returns the matching view of a given view ID.
    				 */
    def getViewById(id: String): View = js.native
    /**
    				 * Hides the progress indicator and stops the animation.
    				 */
    def hide(): Unit = js.native
    def hide(options: AnimationOption): Unit = js.native
    /**
    				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
    				 */
    def insertAt(params: js.Any): Unit = js.native
    /**
    				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
    				 */
    def replaceAt(params: js.Any): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.cancelable> property.
    				 */
    def setCancelable(cancelable: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.canceledOnTouchOutside> property.
    				 */
    def setCanceledOnTouchOutside(canceledOnTouchOutside: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.elevation> property.
    				 */
    def setElevation(elevation: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.hiddenBehavior> property.
    				 */
    def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.location> property.
    				 */
    def setLocation(location: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.max> property.
    				 */
    def setMax(max: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.message> property.
    				 */
    def setMessage(message: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.messageid> property.
    				 */
    def setMessageid(messageid: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.min> property.
    				 */
    def setMin(min: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotation> property.
    				 */
    def setRotation(rotation: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotationX> property.
    				 */
    def setRotationX(rotationX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.rotationY> property.
    				 */
    def setRotationY(rotationY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.scaleX> property.
    				 */
    def setScaleX(scaleX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.scaleY> property.
    				 */
    def setScaleY(scaleY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedback> property.
    				 */
    def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.touchFeedbackColor> property.
    				 */
    def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.transitionName> property.
    				 */
    def setTransitionName(transitionName: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationX> property.
    				 */
    def setTranslationX(translationX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationY> property.
    				 */
    def setTranslationY(translationY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.translationZ> property.
    				 */
    def setTranslationZ(translationZ: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.ProgressIndicator.type> property.
    				 */
    def setType(`type`: Double): Unit = js.native
    /**
    				 * Shows the progress indicator and starts the animation.
    				 */
    def show(): Unit = js.native
    def show(options: AnimationOption): Unit = js.native
    /**
    				 * Starts a batch update of this view's layout properties.
    				 */
    def startLayout(): Unit = js.native
    /**
    				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
    				 * they have been updated.
    				 */
    def updateLayout(params: js.Any): Unit = js.native
  }
  
  /**
  			 * A specialized text field for entering search text.
  			 */
  @js.native
  trait SearchView extends Proxy {
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
    				 * Color of the text in this SearchView, as a color name or hex triplet.
    				 */
    var color: String = js.native
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
    				 * Text to show when the search view field is not focused.
    				 */
    var hintText: String = js.native
    /**
    				 * Color of hint text that displays when field is empty.
    				 */
    var hintTextColor: String = js.native
    /**
    				 * Determines whether the layout has wrapping behavior.
    				 */
    var horizontalWrap: Boolean = js.native
    /**
    				 * Iconifies or expands the search view
    				 */
    var iconified: Boolean = js.native
    /**
    				 * Sets the default or resting state of the search view
    				 */
    var iconifiedByDefault: Boolean = js.native
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
    				 * Whether to display the submit button when necessary or never display.
    				 */
    var submitEnabled: Boolean = js.native
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
    				 * Value of the search view.
    				 */
    var value: String = js.native
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
    				 * Animates this view.
    				 */
    def animate(animation: js.Any): Unit = js.native
    def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
    /**
    				 * Causes the search view to lose focus.
    				 */
    def blur(): Unit = js.native
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
    				 * Causes the search view to gain focus.
    				 */
    def focus(): Unit = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityHidden> property.
    				 */
    def getAccessibilityHidden(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityHint> property.
    				 */
    def getAccessibilityHint(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityLabel> property.
    				 */
    def getAccessibilityLabel(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityValue> property.
    				 */
    def getAccessibilityValue(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.anchorPoint> property.
    				 */
    def getAnchorPoint(): Point = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundColor> property.
    				 */
    def getBackgroundColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledColor> property.
    				 */
    def getBackgroundDisabledColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledImage> property.
    				 */
    def getBackgroundDisabledImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedColor> property.
    				 */
    def getBackgroundFocusedColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedImage> property.
    				 */
    def getBackgroundFocusedImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundGradient> property.
    				 */
    def getBackgroundGradient(): Gradient = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundImage> property.
    				 */
    def getBackgroundImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundRepeat> property.
    				 */
    def getBackgroundRepeat(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedColor> property.
    				 */
    def getBackgroundSelectedColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedImage> property.
    				 */
    def getBackgroundSelectedImage(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.borderColor> property.
    				 */
    def getBorderColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.borderRadius> property.
    				 */
    def getBorderRadius(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.borderWidth> property.
    				 */
    def getBorderWidth(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.bottom> property.
    				 */
    def getBottom(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.center> property.
    				 */
    def getCenter(): Point = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.children> property.
    				 */
    def getChildren(): js.Array[View] = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.color> property.
    				 */
    def getColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.elevation> property.
    				 */
    def getElevation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.focusable> property.
    				 */
    def getFocusable(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.height> property.
    				 */
    def getHeight(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.hiddenBehavior> property.
    				 */
    def getHiddenBehavior(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.hintText> property.
    				 */
    def getHintText(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.hintTextColor> property.
    				 */
    def getHintTextColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.horizontalWrap> property.
    				 */
    def getHorizontalWrap(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.iconified> property.
    				 */
    def getIconified(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.iconifiedByDefault> property.
    				 */
    def getIconifiedByDefault(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.keepScreenOn> property.
    				 */
    def getKeepScreenOn(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.layout> property.
    				 */
    def getLayout(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.left> property.
    				 */
    def getLeft(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.opacity> property.
    				 */
    def getOpacity(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.overrideCurrentAnimation> property.
    				 */
    def getOverrideCurrentAnimation(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.rect> property.
    				 */
    def getRect(): Dimension = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.right> property.
    				 */
    def getRight(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.rotation> property.
    				 */
    def getRotation(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.rotationX> property.
    				 */
    def getRotationX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.rotationY> property.
    				 */
    def getRotationY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.scaleX> property.
    				 */
    def getScaleX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.scaleY> property.
    				 */
    def getScaleY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.size> property.
    				 */
    def getSize(): Dimension = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.softKeyboardOnFocus> property.
    				 */
    def getSoftKeyboardOnFocus(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.submitEnabled> property.
    				 */
    def getSubmitEnabled(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.top> property.
    				 */
    def getTop(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.touchEnabled> property.
    				 */
    def getTouchEnabled(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.touchFeedback> property.
    				 */
    def getTouchFeedback(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.touchFeedbackColor> property.
    				 */
    def getTouchFeedbackColor(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.transform> property.
    				 */
    def getTransform(): Matrix2D | Matrix3D = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.transitionName> property.
    				 */
    def getTransitionName(): String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.translationX> property.
    				 */
    def getTranslationX(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.translationY> property.
    				 */
    def getTranslationY(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.translationZ> property.
    				 */
    def getTranslationZ(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.value> property.
    				 */
    def getValue(): String = js.native
    /**
    				 * Returns the matching view of a given view ID.
    				 */
    def getViewById(id: String): View = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.visible> property.
    				 */
    def getVisible(): Boolean = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.width> property.
    				 */
    def getWidth(): Double | String = js.native
    /**
    				 * Gets the value of the <Titanium.UI.Android.SearchView.zIndex> property.
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
    				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityHidden> property.
    				 */
    def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityHint> property.
    				 */
    def setAccessibilityHint(accessibilityHint: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityLabel> property.
    				 */
    def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityValue> property.
    				 */
    def setAccessibilityValue(accessibilityValue: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.anchorPoint> property.
    				 */
    def setAnchorPoint(anchorPoint: Point): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundColor> property.
    				 */
    def setBackgroundColor(backgroundColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledColor> property.
    				 */
    def setBackgroundDisabledColor(backgroundDisabledColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledImage> property.
    				 */
    def setBackgroundDisabledImage(backgroundDisabledImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedColor> property.
    				 */
    def setBackgroundFocusedColor(backgroundFocusedColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedImage> property.
    				 */
    def setBackgroundFocusedImage(backgroundFocusedImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundGradient> property.
    				 */
    def setBackgroundGradient(backgroundGradient: Gradient): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundImage> property.
    				 */
    def setBackgroundImage(backgroundImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundRepeat> property.
    				 */
    def setBackgroundRepeat(backgroundRepeat: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedColor> property.
    				 */
    def setBackgroundSelectedColor(backgroundSelectedColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedImage> property.
    				 */
    def setBackgroundSelectedImage(backgroundSelectedImage: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.borderColor> property.
    				 */
    def setBorderColor(borderColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.borderRadius> property.
    				 */
    def setBorderRadius(borderRadius: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.borderWidth> property.
    				 */
    def setBorderWidth(borderWidth: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.bottom> property.
    				 */
    def setBottom(bottom: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.bottom> property.
    				 */
    def setBottom(bottom: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.center> property.
    				 */
    def setCenter(center: Point): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.color> property.
    				 */
    def setColor(color: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.elevation> property.
    				 */
    def setElevation(elevation: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.focusable> property.
    				 */
    def setFocusable(focusable: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.height> property.
    				 */
    def setHeight(height: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.height> property.
    				 */
    def setHeight(height: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.hiddenBehavior> property.
    				 */
    def setHiddenBehavior(hiddenBehavior: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.hintText> property.
    				 */
    def setHintText(hintText: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.hintTextColor> property.
    				 */
    def setHintTextColor(hintTextColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.horizontalWrap> property.
    				 */
    def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.iconified> property.
    				 */
    def setIconified(iconified: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.iconifiedByDefault> property.
    				 */
    def setIconifiedByDefault(iconifiedByDefault: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.keepScreenOn> property.
    				 */
    def setKeepScreenOn(keepScreenOn: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.layout> property.
    				 */
    def setLayout(layout: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.left> property.
    				 */
    def setLeft(left: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.left> property.
    				 */
    def setLeft(left: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.opacity> property.
    				 */
    def setOpacity(opacity: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.overrideCurrentAnimation> property.
    				 */
    def setOverrideCurrentAnimation(overrideCurrentAnimation: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.right> property.
    				 */
    def setRight(right: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.right> property.
    				 */
    def setRight(right: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.rotation> property.
    				 */
    def setRotation(rotation: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.rotationX> property.
    				 */
    def setRotationX(rotationX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.rotationY> property.
    				 */
    def setRotationY(rotationY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.scaleX> property.
    				 */
    def setScaleX(scaleX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.scaleY> property.
    				 */
    def setScaleY(scaleY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.softKeyboardOnFocus> property.
    				 */
    def setSoftKeyboardOnFocus(softKeyboardOnFocus: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.submitEnabled> property.
    				 */
    def setSubmitEnabled(submitEnabled: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.top> property.
    				 */
    def setTop(top: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.top> property.
    				 */
    def setTop(top: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.touchEnabled> property.
    				 */
    def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.touchFeedback> property.
    				 */
    def setTouchFeedback(touchFeedback: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.touchFeedbackColor> property.
    				 */
    def setTouchFeedbackColor(touchFeedbackColor: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.transform> property.
    				 */
    def setTransform(transform: Matrix2D): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.transform> property.
    				 */
    def setTransform(transform: Matrix3D): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.transitionName> property.
    				 */
    def setTransitionName(transitionName: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.translationX> property.
    				 */
    def setTranslationX(translationX: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.translationY> property.
    				 */
    def setTranslationY(translationY: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.translationZ> property.
    				 */
    def setTranslationZ(translationZ: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.value> property.
    				 */
    def setValue(value: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.visible> property.
    				 */
    def setVisible(visible: Boolean): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.width> property.
    				 */
    def setWidth(width: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.width> property.
    				 */
    def setWidth(width: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.UI.Android.SearchView.zIndex> property.
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
  
  /**
  			 * Window flag which makes the Android system's navigation bar semi-transparent.
  			 */
  val FLAG_TRANSLUCENT_NAVIGATION: Double = js.native
  /**
  			 * Window flag which makes the Android system's top status bar semi-transparent.
  			 */
  val FLAG_TRANSLUCENT_STATUS: Double = js.native
  /**
  			 * Raw bit controlling whether the right/bottom edge is clipped to its container, based on the gravity direction being applied.
  			 */
  val GRAVITY_AXIS_CLIP: Double = js.native
  /**
  			 * Raw bit controlling how the right/bottom edge is placed.
  			 */
  val GRAVITY_AXIS_PULL_AFTER: Double = js.native
  /**
  			 * Raw bit controlling how the left/top edge is placed.
  			 */
  val GRAVITY_AXIS_PULL_BEFORE: Double = js.native
  /**
  			 * Raw bit indicating the gravity for an axis has been specified.
  			 */
  val GRAVITY_AXIS_SPECIFIED: Double = js.native
  /**
  			 * Bits defining the horizontal axis.
  			 */
  val GRAVITY_AXIS_X_SHIFT: Double = js.native
  /**
  			 * Bits defining the vertical axis.
  			 */
  val GRAVITY_AXIS_Y_SHIFT: Double = js.native
  /**
  			 * Push object to the bottom of its container, not changing its size.
  			 */
  val GRAVITY_BOTTOM: Double = js.native
  /**
  			 * Place the object in the center of its container in both the vertical and horizontal axis, not changing its size.
  			 */
  val GRAVITY_CENTER: Double = js.native
  /**
  			 * Place object in the horizontal center of its container, not changing its size.
  			 */
  val GRAVITY_CENTER_HORIZONTAL: Double = js.native
  /**
  			 * Place object in the vertical center of its container, not changing its size.
  			 */
  val GRAVITY_CENTER_VERTICAL: Double = js.native
  /**
  			 * Flag to clip the edges of the object to its container along the horizontal axis.
  			 */
  val GRAVITY_CLIP_HORIZONTAL: Double = js.native
  /**
  			 * Flag to clip the edges of the object to its container along the vertical axis.
  			 */
  val GRAVITY_CLIP_VERTICAL: Double = js.native
  /**
  			 * Special constant to enable clipping to an overall display along the horizontal dimension.
  			 */
  val GRAVITY_DISPLAY_CLIP_HORIZONTAL: Double = js.native
  /**
  			 * Special constant to enable clipping to an overall display along the vertical dimension.
  			 */
  val GRAVITY_DISPLAY_CLIP_VERTICAL: Double = js.native
  /**
  			 * Push object to x-axis position at the end of its container, not changing its size.
  			 */
  val GRAVITY_END: Double = js.native
  /**
  			 * Grow the horizontal and vertical size of the object if needed so it completely fills its container.
  			 */
  val GRAVITY_FILL: Double = js.native
  /**
  			 * Grow the horizontal size of the object if needed so it completely fills its container.
  			 */
  val GRAVITY_FILL_HORIZONTAL: Double = js.native
  /**
  			 * Grow the vertical size of the object if needed so it completely fills its container.
  			 */
  val GRAVITY_FILL_VERTICAL: Double = js.native
  /**
  			 * Binary mask to get the absolute horizontal gravity of a gravity.
  			 */
  val GRAVITY_HORIZONTAL_GRAVITY_MASK: Double = js.native
  /**
  			 * Push object to the left of its container, not changing its size.
  			 */
  val GRAVITY_LEFT: Double = js.native
  /**
  			 * Constant indicating that no gravity has been set
  			 */
  val GRAVITY_NO_GRAVITY: Double = js.native
  /**
  			 * Binary mask for the horizontal gravity and script specific direction bit.
  			 */
  val GRAVITY_RELATIVE_HORIZONTAL_GRAVITY_MASK: Double = js.native
  /**
  			 * Raw bit controlling whether the layout direction is relative or not (GRAVITY_START/GRAVITY_END instead of absolute GRAVITY_LEFT/GRAVITY_RIGHT).
  			 */
  val GRAVITY_RELATIVE_LAYOUT_DIRECTION: Double = js.native
  /**
  			 * Push object to the right of its container, not changing its size.
  			 */
  val GRAVITY_RIGHT: Double = js.native
  /**
  			 * Push object to x-axis position at the start of its container, not changing its size.
  			 */
  val GRAVITY_START: Double = js.native
  /**
  			 * Push object to the top of its container, not changing its size.
  			 */
  val GRAVITY_TOP: Double = js.native
  /**
  			 * Binary mask to get the vertical gravity of a gravity.
  			 */
  val GRAVITY_VERTICAL_GRAVITY_MASK: Double = js.native
  /**
  			 * Converts all detectable types of data into clickable links.
  			 */
  val LINKIFY_ALL: Double = js.native
  /**
  			 * Converts strings formatted as email addresses into clickable links.
  			 */
  val LINKIFY_EMAIL_ADDRESSES: Double = js.native
  /**
  			 * Converts strings formatted as addresses into clickable links.
  			 */
  val LINKIFY_MAP_ADDRESSES: Double = js.native
  /**
  			 * Converts strings formatted as phone numbers into clickable links.
  			 */
  val LINKIFY_PHONE_NUMBERS: Double = js.native
  /**
  			 * Converts strings formatted as URLs into clickable links.
  			 */
  val LINKIFY_WEB_URLS: Double = js.native
  /**
  			 * Always allow a user to over-scroll this view, provided it is a view that can scroll.
  			 */
  val OVER_SCROLL_ALWAYS: Double = js.native
  /**
  			 * Allow a user to over-scroll this view only if the content is large enough to meaningfully scroll, provided it is a view that can scroll.
  			 */
  val OVER_SCROLL_IF_CONTENT_SCROLLS: Double = js.native
  /**
  			 * Never allow a user to over-scroll this view.
  			 */
  val OVER_SCROLL_NEVER: Double = js.native
  /**
  			 * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_A_8: Double = js.native
  /**
  			 * Android LA_88 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_LA_88: Double = js.native
  /**
  			 * Android L_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_L_8: Double = js.native
  /**
  			 * Android OPAQUE pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_OPAQUE: Double = js.native
  /**
  			 * Android RGBA_4444 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBA_4444: Double = js.native
  /**
  			 * Android RGBA_5551 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBA_5551: Double = js.native
  /**
  			 * Android RGBA_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBA_8888: Double = js.native
  /**
  			 * Android RGBX_8888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGBX_8888: Double = js.native
  /**
  			 * Android RGB_332 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGB_332: Double = js.native
  /**
  			 * Android RGB_565 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGB_565: Double = js.native
  /**
  			 * Android RGB_888 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_RGB_888: Double = js.native
  /**
  			 * Android TRANSLUCENT pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_TRANSLUCENT: Double = js.native
  /**
  			 * Android A_8 pixel format for <Titanium.UI.Window>. Selecting the correct pixel format can
  			 * improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_TRANSPARENT: Double = js.native
  /**
  			 * Android UNKNOWN pixel format for <Titanium.UI.Window>. Selecting the correct pixel format
  			 * can improve image clarity and performance.
  			 */
  val PIXEL_FORMAT_UNKNOWN: Double = js.native
  /**
  			 * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
  			 * activity of determinate length.
  			 */
  val PROGRESS_INDICATOR_DETERMINANT: Double = js.native
  /**
  			 * Display <Titanium.UI.Android.ProgressIndicator> as a modal dialog. (default)
  			 */
  val PROGRESS_INDICATOR_DIALOG: Double = js.native
  /**
  			 * Used with the <Titanium.UI.Android.ProgressIndicator.type> property to indicate an ongoing
  			 * activity of indeterminate length. (default)
  			 */
  val PROGRESS_INDICATOR_INDETERMINANT: Double = js.native
  /**
  			 * Display <Titanium.UI.Android.ProgressIndicator> as a horizontal progress bar in the title of
  			 * the window.
  			 */
  val PROGRESS_INDICATOR_STATUS_BAR: Double = js.native
  /**
  			 * Pan the current heavyweight window when the input method (ie software keyboard) is shown, to
  			 * ensure that its contents are not obscured.
  			 */
  val SOFT_INPUT_ADJUST_PAN: Double = js.native
  /**
  			 * Resize the current heavyweight window when the input method (ie software keyboard) is shown,
  			 * to ensure that its contents are not obscured.
  			 */
  val SOFT_INPUT_ADJUST_RESIZE: Double = js.native
  /**
  			 * Use the system-default behavior to determine how the soft input area (ie software keyboard)
  			 * is accomodated by the current heavyweight window when it receives focus (default.)
  			 */
  val SOFT_INPUT_ADJUST_UNSPECIFIED: Double = js.native
  /**
  			 * Always hide the soft input area (ie software keyboard) when the current heavyweight window
  			 * receives focus.
  			 */
  val SOFT_INPUT_STATE_ALWAYS_HIDDEN: Double = js.native
  /**
  			 * Always show the soft input area (ie software keyboard) when the current heavyweight window
  			 * receives focus.
  			 */
  val SOFT_INPUT_STATE_ALWAYS_VISIBLE: Double = js.native
  /**
  			 * Attempt to hide the soft input area (ie software keyboard) when the current heavyweight
  			 * window receives focus.
  			 */
  val SOFT_INPUT_STATE_HIDDEN: Double = js.native
  /**
  			 * Use the system-default behavior to determine whether to show the soft input area
  			 * (ie software keyboard) when the current heavyweight window receives focus.
  			 */
  val SOFT_INPUT_STATE_UNSPECIFIED: Double = js.native
  /**
  			 * Attempt to show the soft input area (ie software keyboard) when the current heavyweight
  			 * window receives focus.
  			 */
  val SOFT_INPUT_STATE_VISIBLE: Double = js.native
  /**
  			 * Use Android default behavior to handle keyboard visibility when a view receives focus.
  			 * (default)
  			 */
  val SOFT_KEYBOARD_DEFAULT_ON_FOCUS: Double = js.native
  /**
  			 * Attempt to hide the soft keyboard when a view receives focus. Note: system can override
  			 * request.
  			 */
  val SOFT_KEYBOARD_HIDE_ON_FOCUS: Double = js.native
  /**
  			 * Attempt to show the soft keyboard when a view receives focus. Note: system can override
  			 * request.
  			 */
  val SOFT_KEYBOARD_SHOW_ON_FOCUS: Double = js.native
  /**
  			 * Display a checkbox.
  			 */
  val SWITCH_STYLE_CHECKBOX: Double = js.native
  /**
  			 * Display a switch.
  			 */
  val SWITCH_STYLE_SWITCH: Double = js.native
  /**
  			 * Display a toggle button.
  			 */
  val SWITCH_STYLE_TOGGLEBUTTON: Double = js.native
  /**
  			 * TabGroup style taking advantage of a bottom navigation controller for switching between tabs.
  			 */
  val TABS_STYLE_BOTTOM_NAVIGATION: Double = js.native
  /**
  			 * The default TabGroup style that places the Tabs bellow the ActionBar and above the Window content.
  			 */
  val TABS_STYLE_DEFAULT: Double = js.native
  /**
  			 * Captures layout bounds of target views before and after the scene change and animates those changes during the transition.
  			 */
  val TRANSITION_CHANGE_BOUNDS: Double = js.native
  /**
  			 * Captures the clip bounds before and after the scene change and animates those changes during the transition.
  			 */
  val TRANSITION_CHANGE_CLIP_BOUNDS: Double = js.native
  /**
  			 * Captures an ImageView's matrix before and after the scene change and animates it during the transition.
  			 */
  val TRANSITION_CHANGE_IMAGE_TRANSFORM: Double = js.native
  /**
  			 * Captures scale and rotation for Views before and after the scene change and animates those changes during the transition.
  			 */
  val TRANSITION_CHANGE_TRANSFORM: Double = js.native
  /**
  			 * Moves views in or out from the edges of the scene.
  			 */
  val TRANSITION_EXPLODE: Double = js.native
  /**
  			 * Fades in the views.
  			 */
  val TRANSITION_FADE_IN: Double = js.native
  /**
  			 * Fades out the views.
  			 */
  val TRANSITION_FADE_OUT: Double = js.native
  /**
  			 * Resets transition to platform default.
  			 */
  val TRANSITION_NONE: Double = js.native
  /**
  			 * Moves views to bottom.
  			 */
  val TRANSITION_SLIDE_BOTTOM: Double = js.native
  /**
  			 * Moves views to left.
  			 */
  val TRANSITION_SLIDE_LEFT: Double = js.native
  /**
  			 * Moves views to right.
  			 */
  val TRANSITION_SLIDE_RIGHT: Double = js.native
  /**
  			 * Moves views to top.
  			 */
  val TRANSITION_SLIDE_TOP: Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_CACHE_ELSE_NETWORK: Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_CACHE_ONLY: Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_DEFAULT: Double = js.native
  /**
  			 * Use with [WebView.cacheMode](Titanium.UI.WebView.cacheMode) to override how the cache is used in a web view.
  			 */
  val WEBVIEW_LOAD_NO_CACHE: Double = js.native
  /**
  			 * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to disable plugins in a web view.
  			 */
  val WEBVIEW_PLUGINS_OFF: Double = js.native
  /**
  			 * Use with [WebView.pluginState](Titanium.UI.WebView.pluginState) to enable plugins in a web view.
  			 */
  val WEBVIEW_PLUGINS_ON: Double = js.native
  /**
  			 * Display a placeholder and only load plugins when user selects it.
  			 */
  val WEBVIEW_PLUGINS_ON_DEMAND: Double = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.CardView>.
  			 */
  def createCardView(): CardView = js.native
  def createCardView(parameters: js.Any): CardView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.DrawerLayout>.
  			 */
  def createDrawerLayout(): DrawerLayout = js.native
  def createDrawerLayout(parameters: js.Any): DrawerLayout = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.ProgressIndicator>.
  			 */
  def createProgressIndicator(): ProgressIndicator = js.native
  def createProgressIndicator(parameters: js.Any): ProgressIndicator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.Android.SearchView>.
  			 */
  def createSearchView(): SearchView = js.native
  def createSearchView(parameters: js.Any): SearchView = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Hides the soft keyboard.
  			 */
  def hideSoftKeyboard(): Unit = js.native
  /**
  			 * Opens an application preferences dialog, using the native Android system settings interface,
  			 * defined by the platform-specific `preferences.xml` and `array.xml` files.
  			 */
  def openPreferences(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Android.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

