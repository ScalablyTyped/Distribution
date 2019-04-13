package typings
package titaniumLib.TitaniumNs.UINs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A specialized text field for entering search text.
			 */
@js.native
trait SearchView
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
  				 * Coordinate of the view about which to pivot an animation.
  				 */
  var anchorPoint: titaniumLib.Point = js.native
  /**
  				 * Background color of the view, as a color name or hex triplet.
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
  				 * A background gradient for the view.
  				 */
  var backgroundGradient: titaniumLib.Gradient = js.native
  /**
  				 * Background image for the view, specified as a local file path or URL.
  				 */
  var backgroundImage: java.lang.String = js.native
  /**
  				 * Determines whether to tile a background across a view.
  				 */
  var backgroundRepeat: scala.Boolean = js.native
  /**
  				 * Selected background color of the view, as a color name or hex triplet.
  				 */
  var backgroundSelectedColor: java.lang.String = js.native
  /**
  				 * Selected background image url for the view, specified as a local file path or URL.
  				 */
  var backgroundSelectedImage: java.lang.String = js.native
  /**
  				 * Border color of the view, as a color name or hex triplet.
  				 */
  var borderColor: java.lang.String = js.native
  /**
  				 * Radius for the rounded corners of the view's border.
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
  				 * View's center position, in the parent view's coordinates.
  				 */
  var center: titaniumLib.Point = js.native
  /**
  				 * Array of this view's child views.
  				 */
  val children: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Color of the text in this SearchView, as a color name or hex triplet.
  				 */
  var color: java.lang.String = js.native
  /**
  				 * Base elevation of the view relative to its parent in pixels.
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
  				 * Text to show when the search view field is not focused.
  				 */
  var hintText: java.lang.String = js.native
  /**
  				 * Color of hint text that displays when field is empty.
  				 */
  var hintTextColor: java.lang.String = js.native
  /**
  				 * Determines whether the layout has wrapping behavior.
  				 */
  var horizontalWrap: scala.Boolean = js.native
  /**
  				 * Iconifies or expands the search view
  				 */
  var iconified: scala.Boolean = js.native
  /**
  				 * Sets the default or resting state of the search view
  				 */
  var iconifiedByDefault: scala.Boolean = js.native
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
  				 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque). Defaults to 1.0 (opaque).
  				 */
  var opacity: scala.Double = js.native
  /**
  				 * When on, animate call overrides current animation if applicable.
  				 */
  var overrideCurrentAnimation: scala.Boolean = js.native
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
  				 * Determines keyboard behavior when this view is focused. Defaults to <Titanium.UI.Android.SOFT_KEYBOARD_DEFAULT_ON_FOCUS>.
  				 */
  var softKeyboardOnFocus: scala.Double = js.native
  /**
  				 * Whether to display the submit button when necessary or never display.
  				 */
  var submitEnabled: scala.Boolean = js.native
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
  				 * Value of the search view.
  				 */
  var value: java.lang.String = js.native
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
  				 * Animates this view.
  				 */
  def animate(animation: js.Any): scala.Unit = js.native
  def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Causes the search view to lose focus.
  				 */
  def blur(): scala.Unit = js.native
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
  				 * Causes the search view to gain focus.
  				 */
  def focus(): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.anchorPoint> property.
  				 */
  def getAnchorPoint(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledColor> property.
  				 */
  def getBackgroundDisabledColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledImage> property.
  				 */
  def getBackgroundDisabledImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedColor> property.
  				 */
  def getBackgroundFocusedColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedImage> property.
  				 */
  def getBackgroundFocusedImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundGradient> property.
  				 */
  def getBackgroundGradient(): titaniumLib.Gradient = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundImage> property.
  				 */
  def getBackgroundImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundRepeat> property.
  				 */
  def getBackgroundRepeat(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedColor> property.
  				 */
  def getBackgroundSelectedColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedImage> property.
  				 */
  def getBackgroundSelectedImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.borderColor> property.
  				 */
  def getBorderColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.borderRadius> property.
  				 */
  def getBorderRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.borderWidth> property.
  				 */
  def getBorderWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.bottom> property.
  				 */
  def getBottom(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.center> property.
  				 */
  def getCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.children> property.
  				 */
  def getChildren(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.color> property.
  				 */
  def getColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.elevation> property.
  				 */
  def getElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.focusable> property.
  				 */
  def getFocusable(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.hiddenBehavior> property.
  				 */
  def getHiddenBehavior(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.hintText> property.
  				 */
  def getHintText(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.hintTextColor> property.
  				 */
  def getHintTextColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.iconified> property.
  				 */
  def getIconified(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.iconifiedByDefault> property.
  				 */
  def getIconifiedByDefault(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.keepScreenOn> property.
  				 */
  def getKeepScreenOn(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.layout> property.
  				 */
  def getLayout(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.left> property.
  				 */
  def getLeft(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.opacity> property.
  				 */
  def getOpacity(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.overrideCurrentAnimation> property.
  				 */
  def getOverrideCurrentAnimation(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.rect> property.
  				 */
  def getRect(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.right> property.
  				 */
  def getRight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.rotation> property.
  				 */
  def getRotation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.rotationX> property.
  				 */
  def getRotationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.rotationY> property.
  				 */
  def getRotationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.scaleX> property.
  				 */
  def getScaleX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.scaleY> property.
  				 */
  def getScaleY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.size> property.
  				 */
  def getSize(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.softKeyboardOnFocus> property.
  				 */
  def getSoftKeyboardOnFocus(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.submitEnabled> property.
  				 */
  def getSubmitEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.top> property.
  				 */
  def getTop(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.touchEnabled> property.
  				 */
  def getTouchEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.touchFeedback> property.
  				 */
  def getTouchFeedback(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.touchFeedbackColor> property.
  				 */
  def getTouchFeedbackColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.transform> property.
  				 */
  def getTransform(): titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.transitionName> property.
  				 */
  def getTransitionName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.translationX> property.
  				 */
  def getTranslationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.translationY> property.
  				 */
  def getTranslationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.translationZ> property.
  				 */
  def getTranslationZ(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.value> property.
  				 */
  def getValue(): java.lang.String = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.visible> property.
  				 */
  def getVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.SearchView.zIndex> property.
  				 */
  def getZIndex(): scala.Double = js.native
  /**
  				 * Hides this view.
  				 */
  def hide(): scala.Unit = js.native
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
  				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.anchorPoint> property.
  				 */
  def setAnchorPoint(anchorPoint: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledColor> property.
  				 */
  def setBackgroundDisabledColor(backgroundDisabledColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundDisabledImage> property.
  				 */
  def setBackgroundDisabledImage(backgroundDisabledImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedColor> property.
  				 */
  def setBackgroundFocusedColor(backgroundFocusedColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundFocusedImage> property.
  				 */
  def setBackgroundFocusedImage(backgroundFocusedImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundGradient> property.
  				 */
  def setBackgroundGradient(backgroundGradient: titaniumLib.Gradient): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundImage> property.
  				 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundRepeat> property.
  				 */
  def setBackgroundRepeat(backgroundRepeat: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedColor> property.
  				 */
  def setBackgroundSelectedColor(backgroundSelectedColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.backgroundSelectedImage> property.
  				 */
  def setBackgroundSelectedImage(backgroundSelectedImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.borderColor> property.
  				 */
  def setBorderColor(borderColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.bottom> property.
  				 */
  def setBottom(bottom: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.bottom> property.
  				 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.center> property.
  				 */
  def setCenter(center: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.color> property.
  				 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.elevation> property.
  				 */
  def setElevation(elevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.focusable> property.
  				 */
  def setFocusable(focusable: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.hiddenBehavior> property.
  				 */
  def setHiddenBehavior(hiddenBehavior: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.hintText> property.
  				 */
  def setHintText(hintText: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.hintTextColor> property.
  				 */
  def setHintTextColor(hintTextColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.iconified> property.
  				 */
  def setIconified(iconified: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.iconifiedByDefault> property.
  				 */
  def setIconifiedByDefault(iconifiedByDefault: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.keepScreenOn> property.
  				 */
  def setKeepScreenOn(keepScreenOn: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.layout> property.
  				 */
  def setLayout(layout: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.left> property.
  				 */
  def setLeft(left: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.left> property.
  				 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.opacity> property.
  				 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.overrideCurrentAnimation> property.
  				 */
  def setOverrideCurrentAnimation(overrideCurrentAnimation: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.right> property.
  				 */
  def setRight(right: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.right> property.
  				 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.rotation> property.
  				 */
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.rotationX> property.
  				 */
  def setRotationX(rotationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.rotationY> property.
  				 */
  def setRotationY(rotationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.scaleX> property.
  				 */
  def setScaleX(scaleX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.scaleY> property.
  				 */
  def setScaleY(scaleY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.softKeyboardOnFocus> property.
  				 */
  def setSoftKeyboardOnFocus(softKeyboardOnFocus: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.submitEnabled> property.
  				 */
  def setSubmitEnabled(submitEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.top> property.
  				 */
  def setTop(top: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.top> property.
  				 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.touchFeedback> property.
  				 */
  def setTouchFeedback(touchFeedback: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.touchFeedbackColor> property.
  				 */
  def setTouchFeedbackColor(touchFeedbackColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix2D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix3D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.transitionName> property.
  				 */
  def setTransitionName(transitionName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.translationX> property.
  				 */
  def setTranslationX(translationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.translationY> property.
  				 */
  def setTranslationY(translationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.translationZ> property.
  				 */
  def setTranslationZ(translationZ: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.value> property.
  				 */
  def setValue(value: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.visible> property.
  				 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.SearchView.zIndex> property.
  				 */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  /**
  				 * Makes this view visible.
  				 */
  def show(): scala.Unit = js.native
  def show(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Starts a batch update of this view's layout properties.
  				 */
  def startLayout(): scala.Unit = js.native
  /**
  				 * Returns an image of the rendered view, as a Blob.
  				 */
  def toImage(): titaniumLib.TitaniumNs.Blob = js.native
  def toImage(callback: js.Function1[/* param0 */ titaniumLib.TitaniumNs.Blob, _]): titaniumLib.TitaniumNs.Blob = js.native
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

