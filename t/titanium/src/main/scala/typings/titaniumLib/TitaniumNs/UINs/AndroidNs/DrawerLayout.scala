package typings
package titaniumLib.TitaniumNs.UINs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A panel that displays the app's main navigation options on the left edge of the screen.
			 */
@js.native
trait DrawerLayout
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is locked closed.
  				 */
  val LOCK_MODE_LOCKED_CLOSED: scala.Double = js.native
  /**
  				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is locked opened.
  				 */
  val LOCK_MODE_LOCKED_OPEN: scala.Double = js.native
  /**
  				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is reset to default lock state.
  				 */
  val LOCK_MODE_UNDEFINED: scala.Double = js.native
  /**
  				 * Use with [DrawerLayout.drawerLockMode](Titanium.UI.Android.DrawerLayout.drawerLockMode) to specify the drawer is unlocked.
  				 */
  val LOCK_MODE_UNLOCKED: scala.Double = js.native
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
  				 * Get or set the center view
  				 */
  var centerView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Array of this view's child views.
  				 */
  val children: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Determine the drawer indicator status
  				 */
  var drawerIndicatorEnabled: scala.Boolean = js.native
  /**
  				 * Get or set the drawerLockMode
  				 */
  var drawerLockMode: scala.Double = js.native
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
  				 * Determines whether the layout has wrapping behavior.
  				 */
  var horizontalWrap: scala.Boolean = js.native
  /**
  				 * Determine whether the left drawer is open
  				 */
  var isLeftOpen: scala.Boolean = js.native
  /**
  				 * Determine whether the left drawer is visible
  				 */
  var isLeftVisible: scala.Boolean = js.native
  /**
  				 * Determine whether the right drawer is open
  				 */
  var isRightOpen: scala.Boolean = js.native
  /**
  				 * Determine whether the right drawer is visible
  				 */
  var isRightVisible: scala.Boolean = js.native
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
  				 * Get or set the view of the left drawer
  				 */
  var leftView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Get or set the width of the left drawer
  				 */
  var leftWidth: scala.Double = js.native
  /**
  				 * Opacity of this view, from 0.0 (transparent) to 1.0 (opaque).
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
  				 * Get or set the view of the right drawer
  				 */
  var rightView: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Get or set the width of the right drawer
  				 */
  var rightWidth: scala.Double = js.native
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
  				 * A Toolbar instance to use as a toolbar.
  				 */
  var toolbar: titaniumLib.TitaniumNs.UINs.Toolbar = js.native
  /**
  				 * Determine whether to enable the toolbar.
  				 */
  var toolbarEnabled: scala.Boolean = js.native
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
  def animate(animation: js.Any, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Close the left view.
  				 */
  def closeLeft(): scala.Unit = js.native
  /**
  				 * Close the right view.
  				 */
  def closeRight(): scala.Unit = js.native
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
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledColor> property.
  				 */
  def getBackgroundDisabledColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledImage> property.
  				 */
  def getBackgroundDisabledImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedColor> property.
  				 */
  def getBackgroundFocusedColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedImage> property.
  				 */
  def getBackgroundFocusedImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundGradient> property.
  				 */
  def getBackgroundGradient(): titaniumLib.Gradient = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundImage> property.
  				 */
  def getBackgroundImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundRepeat> property.
  				 */
  def getBackgroundRepeat(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedColor> property.
  				 */
  def getBackgroundSelectedColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedImage> property.
  				 */
  def getBackgroundSelectedImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.borderColor> property.
  				 */
  def getBorderColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.borderRadius> property.
  				 */
  def getBorderRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.borderWidth> property.
  				 */
  def getBorderWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.bottom> property.
  				 */
  def getBottom(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.center> property.
  				 */
  def getCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.centerView> property.
  				 */
  def getCenterView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.children> property.
  				 */
  def getChildren(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> property.
  				 */
  def getDrawerIndicatorEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.drawerLockMode> property.
  				 */
  def getDrawerLockMode(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.elevation> property.
  				 */
  def getElevation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.focusable> property.
  				 */
  def getFocusable(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.hiddenBehavior> property.
  				 */
  def getHiddenBehavior(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isLeftOpen> property.
  				 */
  def getIsLeftOpen(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isLeftVisible> property.
  				 */
  def getIsLeftVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isRightOpen> property.
  				 */
  def getIsRightOpen(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.isRightVisible> property.
  				 */
  def getIsRightVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.keepScreenOn> property.
  				 */
  def getKeepScreenOn(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.layout> property.
  				 */
  def getLayout(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.left> property.
  				 */
  def getLeft(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.leftView> property.
  				 */
  def getLeftView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.leftWidth> property.
  				 */
  def getLeftWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.opacity> property.
  				 */
  def getOpacity(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.overrideCurrentAnimation> property.
  				 */
  def getOverrideCurrentAnimation(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rect> property.
  				 */
  def getRect(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.right> property.
  				 */
  def getRight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rightView> property.
  				 */
  def getRightView(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rightWidth> property.
  				 */
  def getRightWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rotation> property.
  				 */
  def getRotation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rotationX> property.
  				 */
  def getRotationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.rotationY> property.
  				 */
  def getRotationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.scaleX> property.
  				 */
  def getScaleX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.scaleY> property.
  				 */
  def getScaleY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.size> property.
  				 */
  def getSize(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.softKeyboardOnFocus> property.
  				 */
  def getSoftKeyboardOnFocus(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.toolbar> property.
  				 */
  def getToolbar(): titaniumLib.TitaniumNs.UINs.Toolbar = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.toolbarEnabled> property.
  				 */
  def getToolbarEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.top> property.
  				 */
  def getTop(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.touchEnabled> property.
  				 */
  def getTouchEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedback> property.
  				 */
  def getTouchFeedback(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedbackColor> property.
  				 */
  def getTouchFeedbackColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.transform> property.
  				 */
  def getTransform(): titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.transitionName> property.
  				 */
  def getTransitionName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.translationX> property.
  				 */
  def getTranslationX(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.translationY> property.
  				 */
  def getTranslationY(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.translationZ> property.
  				 */
  def getTranslationZ(): scala.Double = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.visible> property.
  				 */
  def getVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.Android.DrawerLayout.zIndex> property.
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
  				 * Disallow touch events on a specific view.
  				 */
  def interceptTouchEvent(view: js.Any, disallowIntercept: scala.Boolean): scala.Unit = js.native
  /**
  				 * Open the left view.
  				 */
  def openLeft(): scala.Unit = js.native
  /**
  				 * Open the right view.
  				 */
  def openRight(): scala.Unit = js.native
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
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledColor> property.
  				 */
  def setBackgroundDisabledColor(backgroundDisabledColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundDisabledImage> property.
  				 */
  def setBackgroundDisabledImage(backgroundDisabledImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedColor> property.
  				 */
  def setBackgroundFocusedColor(backgroundFocusedColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundFocusedImage> property.
  				 */
  def setBackgroundFocusedImage(backgroundFocusedImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundGradient> property.
  				 */
  def setBackgroundGradient(backgroundGradient: titaniumLib.Gradient): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundImage> property.
  				 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundRepeat> property.
  				 */
  def setBackgroundRepeat(backgroundRepeat: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedColor> property.
  				 */
  def setBackgroundSelectedColor(backgroundSelectedColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.backgroundSelectedImage> property.
  				 */
  def setBackgroundSelectedImage(backgroundSelectedImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.borderColor> property.
  				 */
  def setBorderColor(borderColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.bottom> property.
  				 */
  def setBottom(bottom: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.bottom> property.
  				 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.center> property.
  				 */
  def setCenter(center: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.centerView> property.
  				 */
  def setCenterView(centerView: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.drawerIndicatorEnabled> property.
  				 */
  def setDrawerIndicatorEnabled(drawerIndicatorEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.drawerLockMode> property.
  				 */
  def setDrawerLockMode(drawerLockMode: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.elevation> property.
  				 */
  def setElevation(elevation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.focusable> property.
  				 */
  def setFocusable(focusable: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.hiddenBehavior> property.
  				 */
  def setHiddenBehavior(hiddenBehavior: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isLeftOpen> property.
  				 */
  def setIsLeftOpen(isLeftOpen: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isLeftVisible> property.
  				 */
  def setIsLeftVisible(isLeftVisible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isRightOpen> property.
  				 */
  def setIsRightOpen(isRightOpen: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.isRightVisible> property.
  				 */
  def setIsRightVisible(isRightVisible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.keepScreenOn> property.
  				 */
  def setKeepScreenOn(keepScreenOn: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.layout> property.
  				 */
  def setLayout(layout: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.left> property.
  				 */
  def setLeft(left: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.left> property.
  				 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.leftView> property.
  				 */
  def setLeftView(leftView: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.leftWidth> property.
  				 */
  def setLeftWidth(leftWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.opacity> property.
  				 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.overrideCurrentAnimation> property.
  				 */
  def setOverrideCurrentAnimation(overrideCurrentAnimation: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.right> property.
  				 */
  def setRight(right: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.right> property.
  				 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rightView> property.
  				 */
  def setRightView(rightView: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rightWidth> property.
  				 */
  def setRightWidth(rightWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rotation> property.
  				 */
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rotationX> property.
  				 */
  def setRotationX(rotationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.rotationY> property.
  				 */
  def setRotationY(rotationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.scaleX> property.
  				 */
  def setScaleX(scaleX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.scaleY> property.
  				 */
  def setScaleY(scaleY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.softKeyboardOnFocus> property.
  				 */
  def setSoftKeyboardOnFocus(softKeyboardOnFocus: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.toolbar> property.
  				 */
  def setToolbar(toolbar: titaniumLib.TitaniumNs.UINs.Toolbar): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.toolbarEnabled> property.
  				 */
  def setToolbarEnabled(toolbarEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.top> property.
  				 */
  def setTop(top: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.top> property.
  				 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedback> property.
  				 */
  def setTouchFeedback(touchFeedback: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.touchFeedbackColor> property.
  				 */
  def setTouchFeedbackColor(touchFeedbackColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix2D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix3D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.transitionName> property.
  				 */
  def setTransitionName(transitionName: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.translationX> property.
  				 */
  def setTranslationX(translationX: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.translationY> property.
  				 */
  def setTranslationY(translationY: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.translationZ> property.
  				 */
  def setTranslationZ(translationZ: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.visible> property.
  				 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.Android.DrawerLayout.zIndex> property.
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
  				 * Toggle the visibility of the left view.
  				 */
  def toggleLeft(): scala.Unit = js.native
  /**
  				 * Toggle the visibility of the right view.
  				 */
  def toggleRight(): scala.Unit = js.native
  /**
  				 * Performs a batch update of all supplied layout properties and schedules a layout pass after
  				 * they have been updated.
  				 */
  def updateLayout(params: js.Any): scala.Unit = js.native
}

