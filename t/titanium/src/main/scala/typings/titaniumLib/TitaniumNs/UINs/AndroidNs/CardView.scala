package typings
package titaniumLib.TitaniumNs.UINs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * CardView provides a layout container with rounded corners and a shadow indicating the view is elevated.
			 */
@js.native
trait CardView
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Whether the view should be "hidden" from (i.e., ignored by) the accessibility service.
  				 */
  var accessibilityHidden: scala.Boolean = js.native
  /**
  				 * Briefly describes what performing an action (such as a click) on the view will do.
  				 */
  var accessibilityHint: java.lang.String = js.native
  /**
  				 * A succint label identifying the view for the device's accessibility service.
  				 */
  var accessibilityLabel: java.lang.String = js.native
  /**
  				 * A string describing the value (if any) of the view for the device's accessibility service.
  				 */
  var accessibilityValue: java.lang.String = js.native
  /**
  				 * Background color for CardView as a color name or hex triplet.
  				 */
  var backgroundColor: java.lang.String = js.native
  /**
  				 * Disabled background color of the view, as a color name or hex triplet.
  				 */
  var backgroundDisabledColor: java.lang.String = js.native
  /**
  				 * Disabled background image for the view, specified as a local file path or URL.
  				 */
  var backgroundDisabledImage: java.lang.String = js.native
  /**
  				 * Focused background color of the view, as a color name or hex triplet.
  				 */
  var backgroundFocusedColor: java.lang.String = js.native
  /**
  				 * Focused background image for the view, specified as a local file path or URL.
  				 */
  var backgroundFocusedImage: java.lang.String = js.native
  /**
  				 * Selected background color of the view, as a color name or hex triplet.
  				 */
  var backgroundSelectedColor: java.lang.String = js.native
  /**
  				 * Selected background image url for the view, specified as a local file path or URL.
  				 */
  var backgroundSelectedImage: java.lang.String = js.native
  /**
  				 * Corner radius for CardView.
  				 */
  var borderRadius: scala.Double = js.native
  /**
  				 * Border width of the view.
  				 */
  var borderWidth: scala.Double = js.native
  /**
  				 * View's bottom position, in platform-specific units.
  				 */
  var bottom: scala.Double | java.lang.String = js.native
  /**
  				 * Background color for CardView as a color name or hex triplet.
  				 */
  var cardBackgroundColor: java.lang.String = js.native
  /**
  				 * Corner radius for CardView.
  				 */
  var cardCornerRadius: scala.Double = js.native
  /**
  				 * Elevation for CardView.
  				 */
  var cardElevation: scala.Double = js.native
  /**
  				 * Maximum Elevation for CardView.
  				 */
  var cardMaxElevation: scala.Double = js.native
  /**
  				 * Add padding to CardView on API level 20 and before to prevent intersections between
  				 * the Card content and rounded corners.
  				 */
  var cardPreventCornerOverlap: scala.Boolean = js.native
  /**
  				 * Add padding on API level 21 and above to have the same measurements with previous versions.
  				 */
  var cardUseCompatPadding: scala.Boolean = js.native
  /**
  				 * View's center position, in the parent view's coordinates.
  				 */
  var center: titaniumLib.Point = js.native
  /**
  				 * Array of this view's child views.
  				 */
  val children: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Inner padding between the edges of the Card and children of the CardView.
  				 */
  var contentPadding: scala.Double = js.native
  /**
  				 * Inner padding between the bottom edge of the Card and children of the CardView.
  				 */
  var contentPaddingBottom: scala.Double = js.native
  /**
  				 * Inner padding between the left edge of the Card and children of the CardView.
  				 */
  var contentPaddingLeft: scala.Double = js.native
  /**
  				 * Inner padding between the right edge of the Card and children of the CardView.
  				 */
  var contentPaddingRight: scala.Double = js.native
  /**
  				 * Inner padding between the top edge of the Card and children of the CardView.
  				 */
  var contentPaddingTop: scala.Double = js.native
  /**
  				 * Elevation for CardView.
  				 */
  var elevation: scala.Double = js.native
  /**
  				 * Whether view should be focusable while navigating with the trackball.
  				 */
  var focusable: scala.Boolean = js.native
  /**
  				 * View height, in platform-specific units.
  				 */
  var height: scala.Double | java.lang.String = js.native
  /**
  				 * Sets the behavior when hiding an object to release or keep the free space
  				 */
  var hiddenBehavior: scala.Double = js.native
  /**
  				 * Determines whether the layout has wrapping behavior.
  				 */
  var horizontalWrap: scala.Boolean = js.native
  /**
  				 * Determines whether to keep the device screen on.
  				 */
  var keepScreenOn: scala.Boolean = js.native
  /**
  				 * Specifies how the view positions its children.
  				 * One of: 'composite', 'vertical', or 'horizontal'.
  				 */
  var layout: java.lang.String = js.native
  /**
  				 * View's left position, in platform-specific units.
  				 */
  var left: scala.Double | java.lang.String = js.native
  /**
  				 * Maximum Elevation for CardView.
  				 */
  var maxElevation: scala.Double = js.native
  /**
  				 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque).
  				 */
  var opacity: scala.Double = js.native
  /**
  				 * When on, animate call overrides current animation if applicable.
  				 */
  var overrideCurrentAnimation: scala.Boolean = js.native
  /**
  				 * Inner padding between the edges of the Card and children of the CardView.
  				 */
  var padding: scala.Double = js.native
  /**
  				 * Inner padding between the bottom edge of the Card and children of the CardView.
  				 */
  var paddingBottom: scala.Double = js.native
  /**
  				 * Inner padding between the left edge of the Card and children of the CardView.
  				 */
  var paddingLeft: scala.Double = js.native
  /**
  				 * Inner padding between the right edge of the Card and children of the CardView.
  				 */
  var paddingRight: scala.Double = js.native
  /**
  				 * Inner padding between the top edge of the Card and children of the CardView.
  				 */
  var paddingTop: scala.Double = js.native
  /**
  				 * Add padding to CardView on API level 20 and before to prevent intersections between
  				 * the Card content and rounded corners.
  				 */
  var preventCornerOverlap: scala.Boolean = js.native
  /**
  				 * The bounding box of the view relative to its parent, in system units.
  				 */
  val rect: titaniumLib.Dimension = js.native
  /**
  				 * View's right position, in platform-specific units.
  				 */
  var right: scala.Double | java.lang.String = js.native
  /**
  				 * Clockwise 2D rotation of the view in degrees.
  				 */
  var rotation: scala.Double = js.native
  /**
  				 * Clockwise rotation of the view in degrees (x-axis).
  				 */
  var rotationX: scala.Double = js.native
  /**
  				 * Clockwise rotation of the view in degrees (y-axis).
  				 */
  var rotationY: scala.Double = js.native
  /**
  				 * Scaling of the view in x-axis in pixels.
  				 */
  var scaleX: scala.Double = js.native
  /**
  				 * Scaling of the view in y-axis in pixels.
  				 */
  var scaleY: scala.Double = js.native
  /**
  				 * The size of the view in system units.
  				 */
  val size: titaniumLib.Dimension = js.native
  /**
  				 * Determines keyboard behavior when this view is focused.
  				 */
  var softKeyboardOnFocus: scala.Double = js.native
  /**
  				 * The view's top position.
  				 */
  var top: scala.Double | java.lang.String = js.native
  /**
  				 * Determines whether view should receive touch events.
  				 */
  var touchEnabled: scala.Boolean = js.native
  /**
  				 * A material design visual construct that provides an instantaneous visual confirmation of touch point.
  				 */
  var touchFeedback: scala.Boolean = js.native
  /**
  				 * Optional touch feedback ripple color. This has no effect unless `touchFeedback` is true.
  				 */
  var touchFeedbackColor: java.lang.String = js.native
  /**
  				 * Transformation matrix to apply to the view.
  				 */
  var transform: titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * A name to identify this view in activity transition.
  				 */
  var transitionName: java.lang.String = js.native
  /**
  				 * Horizontal location of the view relative to its left position in pixels.
  				 */
  var translationX: scala.Double = js.native
  /**
  				 * Vertical location of the view relative to its top position in pixels.
  				 */
  var translationY: scala.Double = js.native
  /**
  				 * Depth of the view relative to its elevation in pixels.
  				 */
  var translationZ: scala.Double = js.native
  /**
  				 * Add padding on API level 21 and above to have the same measurements with previous versions.
  				 */
  var useCompatPadding: scala.Boolean = js.native
  /**
  				 * Determines whether the view is visible.
  				 */
  var visible: scala.Boolean = js.native
  /**
  				 * View's width, in platform-specific units.
  				 */
  var width: scala.Double | java.lang.String = js.native
  /**
  				 * Z-index stack order position, relative to other sibling views.
  				 */
  var zIndex: scala.Double = js.native
  /**
  				 * Adds a child to this view's hierarchy.
  				 */
  def add(view: js.Any): scala.Unit = js.native
  /**
  				 * Adds a child to this view's hierarchy.
  				 */
  def add(view: js.Array[_]): scala.Unit = js.native
  /**
  				 * Animates this view.
  				 */
  def animate(animation: js.Any): scala.Unit = js.native
  /**
  				 * Animates this view.
  				 */
  def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Translates a point from this view's coordinate system to another view's coordinate system.
  				 */
  def convertPointToView(point: titaniumLib.Point, destinationView: js.Any): titaniumLib.Point = js.native
  /**
  				 * Finishes a batch update of the View's layout properties and schedules a layout pass of the
  				 * view tree.
  				 */
  def finishLayout(): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundDisabledColor> property.
  				 */
  def getBackgroundDisabledColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundDisabledImage> property.
  				 */
  def getBackgroundDisabledImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundFocusedColor> property.
  				 */
  def getBackgroundFocusedColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundFocusedImage> property.
  				 */
  def getBackgroundFocusedImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundSelectedColor> property.
  				 */
  def getBackgroundSelectedColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.backgroundSelectedImage> property.
  				 */
  def getBackgroundSelectedImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.borderRadius> property.
  				 */
  def getBorderRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.borderWidth> property.
  				 */
  def getBorderWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.bottom> property.
  				 */
  def getBottom(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardBackgroundColor> property.
  				 */
  def getCardBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardCornerRadius> property.
  				 */
  def getCardCornerRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardElevation> property.
  				 */
  def getCardElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardMaxElevation> property.
  				 */
  def getCardMaxElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardPreventCornerOverlap> property.
  				 */
  def getCardPreventCornerOverlap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.cardUseCompatPadding> property.
  				 */
  def getCardUseCompatPadding(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.center> property.
  				 */
  def getCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.children> property.
  				 */
  def getChildren(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPadding> property.
  				 */
  def getContentPadding(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingBottom> property.
  				 */
  def getContentPaddingBottom(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingLeft> property.
  				 */
  def getContentPaddingLeft(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingRight> property.
  				 */
  def getContentPaddingRight(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.contentPaddingTop> property.
  				 */
  def getContentPaddingTop(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.elevation> property.
  				 */
  def getElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.focusable> property.
  				 */
  def getFocusable(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.hiddenBehavior> property.
  				 */
  def getHiddenBehavior(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.keepScreenOn> property.
  				 */
  def getKeepScreenOn(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.layout> property.
  				 */
  def getLayout(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.left> property.
  				 */
  def getLeft(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.maxElevation> property.
  				 */
  def getMaxElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.opacity> property.
  				 */
  def getOpacity(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.overrideCurrentAnimation> property.
  				 */
  def getOverrideCurrentAnimation(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.padding> property.
  				 */
  def getPadding(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingBottom> property.
  				 */
  def getPaddingBottom(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingLeft> property.
  				 */
  def getPaddingLeft(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingRight> property.
  				 */
  def getPaddingRight(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.paddingTop> property.
  				 */
  def getPaddingTop(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.preventCornerOverlap> property.
  				 */
  def getPreventCornerOverlap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rect> property.
  				 */
  def getRect(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.right> property.
  				 */
  def getRight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rotation> property.
  				 */
  def getRotation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rotationX> property.
  				 */
  def getRotationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.rotationY> property.
  				 */
  def getRotationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.scaleX> property.
  				 */
  def getScaleX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.scaleY> property.
  				 */
  def getScaleY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.size> property.
  				 */
  def getSize(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.softKeyboardOnFocus> property.
  				 */
  def getSoftKeyboardOnFocus(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.top> property.
  				 */
  def getTop(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.touchEnabled> property.
  				 */
  def getTouchEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.touchFeedback> property.
  				 */
  def getTouchFeedback(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.touchFeedbackColor> property.
  				 */
  def getTouchFeedbackColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.transform> property.
  				 */
  def getTransform(): titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.transitionName> property.
  				 */
  def getTransitionName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.translationX> property.
  				 */
  def getTranslationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.translationY> property.
  				 */
  def getTranslationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.translationZ> property.
  				 */
  def getTranslationZ(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.useCompatPadding> property.
  				 */
  def getUseCompatPadding(): scala.Boolean = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.visible> property.
  				 */
  def getVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.CardView.zIndex> property.
  				 */
  def getZIndex(): scala.Double = js.native
  /**
  				 * Hides this view.
  				 */
  def hide(): scala.Unit = js.native
  /**
  				 * Hides this view.
  				 */
  def hide(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Removes a child view from this view's hierarchy.
  				 */
  def remove(view: js.Any): scala.Unit = js.native
  /**
  				 * Removes all child views from this view's hierarchy.
  				 */
  def removeAllChildren(): scala.Unit = js.native
  /**
  				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def replaceAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundDisabledColor> property.
  				 */
  def setBackgroundDisabledColor(backgroundDisabledColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundDisabledImage> property.
  				 */
  def setBackgroundDisabledImage(backgroundDisabledImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundFocusedColor> property.
  				 */
  def setBackgroundFocusedColor(backgroundFocusedColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundFocusedImage> property.
  				 */
  def setBackgroundFocusedImage(backgroundFocusedImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundSelectedColor> property.
  				 */
  def setBackgroundSelectedColor(backgroundSelectedColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.backgroundSelectedImage> property.
  				 */
  def setBackgroundSelectedImage(backgroundSelectedImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.bottom> property.
  				 */
  def setBottom(bottom: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.bottom> property.
  				 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardBackgroundColor> property.
  				 */
  def setCardBackgroundColor(cardBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardCornerRadius> property.
  				 */
  def setCardCornerRadius(cardCornerRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardElevation> property.
  				 */
  def setCardElevation(cardElevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardMaxElevation> property.
  				 */
  def setCardMaxElevation(cardMaxElevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardPreventCornerOverlap> property.
  				 */
  def setCardPreventCornerOverlap(cardPreventCornerOverlap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.cardUseCompatPadding> property.
  				 */
  def setCardUseCompatPadding(cardUseCompatPadding: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.center> property.
  				 */
  def setCenter(center: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPadding> property.
  				 */
  def setContentPadding(contentPadding: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingBottom> property.
  				 */
  def setContentPaddingBottom(contentPaddingBottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingLeft> property.
  				 */
  def setContentPaddingLeft(contentPaddingLeft: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingRight> property.
  				 */
  def setContentPaddingRight(contentPaddingRight: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.contentPaddingTop> property.
  				 */
  def setContentPaddingTop(contentPaddingTop: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.elevation> property.
  				 */
  def setElevation(elevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.focusable> property.
  				 */
  def setFocusable(focusable: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.hiddenBehavior> property.
  				 */
  def setHiddenBehavior(hiddenBehavior: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.keepScreenOn> property.
  				 */
  def setKeepScreenOn(keepScreenOn: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.layout> property.
  				 */
  def setLayout(layout: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.left> property.
  				 */
  def setLeft(left: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.left> property.
  				 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.maxElevation> property.
  				 */
  def setMaxElevation(maxElevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.opacity> property.
  				 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.overrideCurrentAnimation> property.
  				 */
  def setOverrideCurrentAnimation(overrideCurrentAnimation: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.padding> property.
  				 */
  def setPadding(padding: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingBottom> property.
  				 */
  def setPaddingBottom(paddingBottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingLeft> property.
  				 */
  def setPaddingLeft(paddingLeft: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingRight> property.
  				 */
  def setPaddingRight(paddingRight: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.paddingTop> property.
  				 */
  def setPaddingTop(paddingTop: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.preventCornerOverlap> property.
  				 */
  def setPreventCornerOverlap(preventCornerOverlap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.right> property.
  				 */
  def setRight(right: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.right> property.
  				 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.rotation> property.
  				 */
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.rotationX> property.
  				 */
  def setRotationX(rotationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.rotationY> property.
  				 */
  def setRotationY(rotationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.scaleX> property.
  				 */
  def setScaleX(scaleX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.scaleY> property.
  				 */
  def setScaleY(scaleY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.softKeyboardOnFocus> property.
  				 */
  def setSoftKeyboardOnFocus(softKeyboardOnFocus: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.top> property.
  				 */
  def setTop(top: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.top> property.
  				 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.touchFeedback> property.
  				 */
  def setTouchFeedback(touchFeedback: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.touchFeedbackColor> property.
  				 */
  def setTouchFeedbackColor(touchFeedbackColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix2D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix3D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.transitionName> property.
  				 */
  def setTransitionName(transitionName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.translationX> property.
  				 */
  def setTranslationX(translationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.translationY> property.
  				 */
  def setTranslationY(translationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.translationZ> property.
  				 */
  def setTranslationZ(translationZ: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.useCompatPadding> property.
  				 */
  def setUseCompatPadding(useCompatPadding: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.visible> property.
  				 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.CardView.zIndex> property.
  				 */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  /**
  				 * Makes this view visible.
  				 */
  def show(): scala.Unit = js.native
  /**
  				 * Makes this view visible.
  				 */
  def show(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): scala.Unit = js.native
  /**
  				 * Returns an image of the rendered view, as a Blob.
  				 */
  def toImage(): titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * Returns an image of the rendered view, as a Blob.
  				 */
  def toImage(callback: js.Function1[/* param0 */ titaniumLib.TitaniumNs.Blob, _]): titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * Returns an image of the rendered view, as a Blob.
  				 */
  def toImage(
    callback: js.Function1[/* param0 */ titaniumLib.TitaniumNs.Blob, _],
    honorScaleFactor: scala.Boolean
  ): titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): scala.Unit = js.native
}

