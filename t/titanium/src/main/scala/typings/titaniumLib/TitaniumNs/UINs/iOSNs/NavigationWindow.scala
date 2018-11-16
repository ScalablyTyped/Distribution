package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
			 * content.
			 */
@js.native
trait NavigationWindow
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
  				 * Current position of the view during an animation.
  				 */
  val animatedCenter: titaniumLib.Point = js.native
  /**
  				 * Specifies whether or not the view controller should automatically adjust its scroll view insets.
  				 */
  var autoAdjustScrollViewInsets: scala.Boolean = js.native
  /**
  				 * Background color of the window, as a color name or hex triplet.
  				 */
  var backgroundColor: java.lang.String = js.native
  /**
  				 * A background gradient for the view.
  				 */
  var backgroundGradient: titaniumLib.Gradient = js.native
  /**
  				 * Background image for the view, specified as a local file path or URL.
  				 */
  var backgroundImage: java.lang.String = js.native
  /**
  				 * Size of the left end cap.
  				 */
  var backgroundLeftCap: scala.Double = js.native
  /**
  				 * Determines whether to tile a background across a view.
  				 */
  var backgroundRepeat: scala.Boolean = js.native
  /**
  				 * Size of the top end cap.
  				 */
  var backgroundTopCap: scala.Double = js.native
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
  				 * Window's bottom position, in platform-specific units.
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
  				 * View's clipping behavior.
  				 */
  var clipMode: scala.Double = js.native
  /**
  				 * An array of supported values specified using the EXTEND_EDGE constants in <Titanium.UI>.
  				 */
  var extendEdges: js.Array[scala.Double] = js.native
  /**
  				 * Specifies whether the content (subviews) of the window  will render inside the safe-area or not.
  				 * Only used in iOS 11.0 and later.
  				 */
  var extendSafeArea: scala.Boolean = js.native
  /**
  				 * Boolean value indicating if the window is fullscreen.
  				 */
  var fullscreen: scala.Boolean = js.native
  /**
  				 * View height, in platform-specific units.
  				 */
  var height: scala.Double | java.lang.String = js.native
  /**
  				 * Set this to true to hide the back button of navigation bar.
  				 */
  var hidesBackButton: scala.Boolean = js.native
  /**
  				 * Set this to true to hide the navigation bar on swipe.
  				 */
  var hidesBarsOnSwipe: scala.Boolean = js.native
  /**
  				 * Set this to true to hide the navigation bar on tap.
  				 */
  var hidesBarsOnTap: scala.Boolean = js.native
  /**
  				 * Set this to true to hide the navigation bar when the keyboard appears.
  				 */
  var hidesBarsWhenKeyboardAppears: scala.Boolean = js.native
  /**
  				 * Boolean value indicating whether the system is allowed to hide the visual indicator for returning to the Home screen.
  				 */
  var homeIndicatorAutoHidden: scala.Boolean = js.native
  /**
  				 * Adds a horizontal parallax effect to the view
  				 */
  var horizontalMotionEffect: js.Any = js.native
  /**
  				 * Determines whether the layout has wrapping behavior.
  				 */
  var horizontalWrap: scala.Boolean = js.native
  /**
  				 * Specifies if the edges should extend beyond opaque bars (navigation bar, tab bar, toolbar).
  				 */
  var includeOpaqueBars: scala.Boolean = js.native
  /**
  				 * The mode to use when displaying the title of the navigation bar.
  				 */
  var largeTitleDisplayMode: scala.Double = js.native
  /**
  				 * A Boolean value indicating whether the title should be displayed in a large format.
  				 */
  var largeTitleEnabled: java.lang.String = js.native
  /**
  				 * Specifies how the view positions its children.
  				 * One of: 'composite', 'vertical', or 'horizontal'.
  				 */
  var layout: java.lang.String = js.native
  /**
  				 * Window's left position, in platform-specific units.
  				 */
  var left: scala.Double | java.lang.String = js.native
  /**
  				 * An Array of views to show in the left nav bar area.
  				 */
  var leftNavButtons: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Indicates to open a modal window or not.
  				 */
  var modal: scala.Boolean = js.native
  /**
  				 * The <Titanium.UI.iOS.NavigationWindow> instance hosting this window.
  				 */
  val navigationWindow: NavigationWindow = js.native
  /**
  				 * The opacity from 0.0-1.0.
  				 */
  var opacity: scala.Double = js.native
  /**
  				 * Current orientation of the window.
  				 */
  val orientation: scala.Double = js.native
  /**
  				 * Array of supported orientation modes, specified using the orientation
  				 * constants defined in <Titanium.UI>.
  				 */
  var orientationModes: js.Array[scala.Double] = js.native
  /**
  				 * The preview context used in the 3D-Touch feature "Peek and Pop".
  				 */
  var previewContext: PreviewContext = js.native
  /**
  				 * Background color of the wrapper view when this view is used as either <Titanium.UI.ListView.pullView> or <Titanium.UI.TableView.headerPullView>.
  				 */
  var pullBackgroundColor: java.lang.String = js.native
  /**
  				 * The bounding box of the view relative to its parent, in system units.
  				 */
  val rect: titaniumLib.Dimension = js.native
  /**
  				 * Window's right position, in platform-specific units.
  				 */
  var right: scala.Double | java.lang.String = js.native
  /**
  				 * An Array of views to show in the right nav bar area.
  				 */
  var rightNavButtons: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * The size of the view in system units.
  				 */
  val size: titaniumLib.Dimension = js.native
  /**
  				 * The status bar style associated with this window.
  				 */
  var statusBarStyle: scala.Double = js.native
  /**
  				 * The view's tintColor
  				 */
  var tintColor: java.lang.String = js.native
  /**
  				 * Title text attributes of the window.
  				 */
  var titleAttributes: titaniumLib.titleAttributesParams = js.native
  /**
  				 * Window's top position, in platform-specific units.
  				 */
  var top: scala.Double | java.lang.String = js.native
  /**
  				 * Determines whether view should receive touch events.
  				 */
  var touchEnabled: scala.Boolean = js.native
  /**
  				 * Transformation matrix to apply to the view.
  				 */
  var transform: titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Adds a vertical parallax effect to the view
  				 */
  var verticalMotionEffect: js.Any = js.native
  /**
  				 * Determines the color of the shadow.
  				 */
  var viewShadowColor: java.lang.String = js.native
  /**
  				 * Determines the offset for the shadow of the view.
  				 */
  var viewShadowOffset: titaniumLib.Point = js.native
  /**
  				 * Determines the blur radius used to create the shadow.
  				 */
  var viewShadowRadius: scala.Double = js.native
  /**
  				 * Determines whether the view is visible.
  				 */
  var visible: scala.Boolean = js.native
  /**
  				 * View's width, in platform-specific units.
  				 */
  var width: scala.Double | java.lang.String = js.native
  /**
  				 * Window to add to this navigation window.
  				 */
  var window: titaniumLib.TitaniumNs.UINs.Window = js.native
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
  				 * Closes the window.
  				 */
  def close(): scala.Unit = js.native
  /**
  				 * Closes the window.
  				 */
  def close(params: js.Any): scala.Unit = js.native
  /**
  				 * Closes a window and removes it from the navigation window.
  				 */
  def closeWindow(window: titaniumLib.TitaniumNs.UINs.Window, options: js.Any): scala.Unit = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.anchorPoint> property.
  				 */
  def getAnchorPoint(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.animatedCenter> property.
  				 */
  def getAnimatedCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.autoAdjustScrollViewInsets> property.
  				 */
  def getAutoAdjustScrollViewInsets(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundGradient> property.
  				 */
  def getBackgroundGradient(): titaniumLib.Gradient = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundImage> property.
  				 */
  def getBackgroundImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundLeftCap> property.
  				 */
  def getBackgroundLeftCap(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundRepeat> property.
  				 */
  def getBackgroundRepeat(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundTopCap> property.
  				 */
  def getBackgroundTopCap(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.borderColor> property.
  				 */
  def getBorderColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.borderRadius> property.
  				 */
  def getBorderRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.borderWidth> property.
  				 */
  def getBorderWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.bottom> property.
  				 */
  def getBottom(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.center> property.
  				 */
  def getCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.children> property.
  				 */
  def getChildren(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.clipMode> property.
  				 */
  def getClipMode(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.extendEdges> property.
  				 */
  def getExtendEdges(): js.Array[scala.Double] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.extendSafeArea> property.
  				 */
  def getExtendSafeArea(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.fullscreen> property.
  				 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBackButton> property.
  				 */
  def getHidesBackButton(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnSwipe> property.
  				 */
  def getHidesBarsOnSwipe(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnTap> property.
  				 */
  def getHidesBarsOnTap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  				 */
  def getHidesBarsWhenKeyboardAppears(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.homeIndicatorAutoHidden> property.
  				 */
  def getHomeIndicatorAutoHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalMotionEffect> property.
  				 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.includeOpaqueBars> property.
  				 */
  def getIncludeOpaqueBars(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleDisplayMode> property.
  				 */
  def getLargeTitleDisplayMode(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleEnabled> property.
  				 */
  def getLargeTitleEnabled(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.layout> property.
  				 */
  def getLayout(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.left> property.
  				 */
  def getLeft(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.leftNavButtons> property.
  				 */
  def getLeftNavButtons(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.modal> property.
  				 */
  def getModal(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.navigationWindow> property.
  				 */
  def getNavigationWindow(): NavigationWindow = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.opacity> property.
  				 */
  def getOpacity(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.orientation> property.
  				 */
  def getOrientation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.orientationModes> property.
  				 */
  def getOrientationModes(): js.Array[scala.Double] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.previewContext> property.
  				 */
  def getPreviewContext(): PreviewContext = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.pullBackgroundColor> property.
  				 */
  def getPullBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.rect> property.
  				 */
  def getRect(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.right> property.
  				 */
  def getRight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.rightNavButtons> property.
  				 */
  def getRightNavButtons(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.size> property.
  				 */
  def getSize(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.statusBarStyle> property.
  				 */
  def getStatusBarStyle(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.tintColor> property.
  				 */
  def getTintColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.titleAttributes> property.
  				 */
  def getTitleAttributes(): titaniumLib.titleAttributesParams = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.top> property.
  				 */
  def getTop(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.touchEnabled> property.
  				 */
  def getTouchEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.transform> property.
  				 */
  def getTransform(): titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.verticalMotionEffect> property.
  				 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowColor> property.
  				 */
  def getViewShadowColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowOffset> property.
  				 */
  def getViewShadowOffset(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowRadius> property.
  				 */
  def getViewShadowRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.visible> property.
  				 */
  def getVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
  				 */
  def getWindow(): titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.zIndex> property.
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
  				 * Hides the navigation bar.
  				 */
  def hideNavBar(): scala.Unit = js.native
  /**
  				 * Hides the navigation bar.
  				 */
  def hideNavBar(options: js.Any): scala.Unit = js.native
  /**
  				 * Makes the bottom toolbar invisible.
  				 */
  def hideToolbar(): scala.Unit = js.native
  /**
  				 * Makes the bottom toolbar invisible.
  				 */
  def hideToolbar(options: js.Any): scala.Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Opens the window.
  				 */
  def open(): scala.Unit = js.native
  /**
  				 * Opens the window.
  				 */
  def open(params: titaniumLib.openWindowParams): scala.Unit = js.native
  /**
  				 * Opens a window within the navigation window.
  				 */
  def openWindow(window: titaniumLib.TitaniumNs.UINs.Window, options: js.Any): scala.Unit = js.native
  /**
  				 * Closes all windows that are currently opened inside the navigation window.
  				 */
  def popToRootWindow(options: js.Any): scala.Unit = js.native
  /**
  				 * Removes a child view from this view's hierarchy.
  				 */
  def remove(view: js.Any): scala.Unit = js.native
  /**
  				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def replaceAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.anchorPoint> property.
  				 */
  def setAnchorPoint(anchorPoint: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.autoAdjustScrollViewInsets> property.
  				 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundGradient> property.
  				 */
  def setBackgroundGradient(backgroundGradient: titaniumLib.Gradient): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundImage> property.
  				 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundLeftCap> property.
  				 */
  def setBackgroundLeftCap(backgroundLeftCap: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundRepeat> property.
  				 */
  def setBackgroundRepeat(backgroundRepeat: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundTopCap> property.
  				 */
  def setBackgroundTopCap(backgroundTopCap: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.borderColor> property.
  				 */
  def setBorderColor(borderColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.bottom> property.
  				 */
  def setBottom(bottom: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.bottom> property.
  				 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.center> property.
  				 */
  def setCenter(center: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.clipMode> property.
  				 */
  def setClipMode(clipMode: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.extendEdges> property.
  				 */
  def setExtendEdges(extendEdges: js.Array[scala.Double]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.extendSafeArea> property.
  				 */
  def setExtendSafeArea(extendSafeArea: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.fullscreen> property.
  				 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBackButton> property.
  				 */
  def setHidesBackButton(hidesBackButton: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnSwipe> property.
  				 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnTap> property.
  				 */
  def setHidesBarsOnTap(hidesBarsOnTap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  				 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.homeIndicatorAutoHidden> property.
  				 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalMotionEffect> property.
  				 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.includeOpaqueBars> property.
  				 */
  def setIncludeOpaqueBars(includeOpaqueBars: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleDisplayMode> property.
  				 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleEnabled> property.
  				 */
  def setLargeTitleEnabled(largeTitleEnabled: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.layout> property.
  				 */
  def setLayout(layout: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.left> property.
  				 */
  def setLeft(left: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.left> property.
  				 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.leftNavButtons> property.
  				 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.modal> property.
  				 */
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.opacity> property.
  				 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.orientationModes> property.
  				 */
  def setOrientationModes(orientationModes: js.Array[scala.Double]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.previewContext> property.
  				 */
  def setPreviewContext(previewContext: PreviewContext): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.pullBackgroundColor> property.
  				 */
  def setPullBackgroundColor(pullBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.right> property.
  				 */
  def setRight(right: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.right> property.
  				 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.rightNavButtons> property.
  				 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.statusBarStyle> property.
  				 */
  def setStatusBarStyle(statusBarStyle: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.tintColor> property.
  				 */
  def setTintColor(tintColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.titleAttributes> property.
  				 */
  def setTitleAttributes(titleAttributes: titaniumLib.titleAttributesParams): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.top> property.
  				 */
  def setTop(top: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.top> property.
  				 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix2D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix3D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.verticalMotionEffect> property.
  				 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowColor> property.
  				 */
  def setViewShadowColor(viewShadowColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowOffset> property.
  				 */
  def setViewShadowOffset(viewShadowOffset: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowRadius> property.
  				 */
  def setViewShadowRadius(viewShadowRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.visible> property.
  				 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
  				 */
  def setWindow(window: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.zIndex> property.
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
  				 * Makes the navigation bar visible.
  				 */
  def showNavBar(): scala.Unit = js.native
  /**
  				 * Makes the navigation bar visible.
  				 */
  def showNavBar(options: js.Any): scala.Unit = js.native
  /**
  				 * Makes the bottom toolbar visible.
  				 */
  def showToolbar(): scala.Unit = js.native
  /**
  				 * Makes the bottom toolbar visible.
  				 */
  def showToolbar(options: js.Any): scala.Unit = js.native
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

