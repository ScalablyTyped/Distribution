package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.AnimationOption
import typings.titanium.Dimension
import typings.titanium.Gradient
import typings.titanium.Point
import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.Matrix2D
import typings.titanium.TitaniumNs.UINs.Matrix3D
import typings.titanium.TitaniumNs.UINs.View
import typings.titanium.TitaniumNs.UINs.Window
import typings.titanium.openWindowParams
import typings.titanium.titleAttributesParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A `NavigationWindow` implements a specialized view that manages the navigation of hierarchical
			 * content.
			 */
@js.native
trait NavigationWindow extends Proxy {
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
  				 * Specifies whether or not the view controller should automatically adjust its scroll view insets.
  				 */
  var autoAdjustScrollViewInsets: Boolean = js.native
  /**
  				 * Background color of the window, as a color name or hex triplet.
  				 */
  var backgroundColor: String = js.native
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
  				 * Window's bottom position, in platform-specific units.
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
  				 * An array of supported values specified using the EXTEND_EDGE constants in <Titanium.UI>.
  				 */
  var extendEdges: js.Array[Double] = js.native
  /**
  				 * Specifies whether the screen insets/notches are allowed to overlap the window's content or not.
  				 */
  var extendSafeArea: Boolean = js.native
  /**
  				 * Boolean value indicating if the window is fullscreen.
  				 */
  var fullscreen: Boolean = js.native
  /**
  				 * View height, in platform-specific units.
  				 */
  var height: Double | String = js.native
  /**
  				 * Set this to true to hide the back button of navigation bar.
  				 */
  var hidesBackButton: Boolean = js.native
  /**
  				 * Set this to true to hide the navigation bar on swipe.
  				 */
  var hidesBarsOnSwipe: Boolean = js.native
  /**
  				 * Set this to true to hide the navigation bar on tap.
  				 */
  var hidesBarsOnTap: Boolean = js.native
  /**
  				 * Set this to true to hide the navigation bar when the keyboard appears.
  				 */
  var hidesBarsWhenKeyboardAppears: Boolean = js.native
  /**
  				 * Boolean value indicating whether the system is allowed to hide the visual indicator for returning to the Home screen.
  				 */
  var homeIndicatorAutoHidden: Boolean = js.native
  /**
  				 * Adds a horizontal parallax effect to the view
  				 */
  var horizontalMotionEffect: js.Any = js.native
  /**
  				 * Determines whether the layout has wrapping behavior.
  				 */
  var horizontalWrap: Boolean = js.native
  /**
  				 * Specifies if the edges should extend beyond opaque bars (navigation bar, tab bar, toolbar).
  				 */
  var includeOpaqueBars: Boolean = js.native
  /**
  				 * The mode to use when displaying the title of the navigation bar.
  				 */
  var largeTitleDisplayMode: Double = js.native
  /**
  				 * A Boolean value indicating whether the title should be displayed in a large format.
  				 */
  var largeTitleEnabled: String = js.native
  /**
  				 * Specifies how the view positions its children.
  				 * One of: 'composite', 'vertical', or 'horizontal'.
  				 */
  var layout: String = js.native
  /**
  				 * Window's left position, in platform-specific units.
  				 */
  var left: Double | String = js.native
  /**
  				 * An Array of views to show in the left nav bar area.
  				 */
  var leftNavButtons: js.Array[View] = js.native
  /**
  				 * Indicates to open a modal window or not.
  				 */
  var modal: Boolean = js.native
  /**
  				 * The <Titanium.UI.NavigationWindow> instance hosting this window.
  				 */
  val navigationWindow: typings.titanium.TitaniumNs.UINs.NavigationWindow = js.native
  /**
  				 * The opacity from 0.0-1.0.
  				 */
  var opacity: Double = js.native
  /**
  				 * Current orientation of the window.
  				 */
  val orientation: Double = js.native
  /**
  				 * Array of supported orientation modes, specified using the orientation
  				 * constants defined in <Titanium.UI>.
  				 */
  var orientationModes: js.Array[Double] = js.native
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
  				 * Window's right position, in platform-specific units.
  				 */
  var right: Double | String = js.native
  /**
  				 * An Array of views to show in the right nav bar area.
  				 */
  var rightNavButtons: js.Array[View] = js.native
  /**
  				 * The padding needed to safely display content without it being overlapped by the screen insets and notches.
  				 */
  val safeAreaPadding: Dimension = js.native
  /**
  				 * The size of the view in system units.
  				 */
  val size: Dimension = js.native
  /**
  				 * The status bar style associated with this window.
  				 */
  var statusBarStyle: Double = js.native
  /**
  				 * The view's tintColor
  				 */
  var tintColor: String = js.native
  /**
  				 * Title text attributes of the window.
  				 */
  var titleAttributes: titleAttributesParams = js.native
  /**
  				 * Window's top position, in platform-specific units.
  				 */
  var top: Double | String = js.native
  /**
  				 * Determines whether view should receive touch events.
  				 */
  var touchEnabled: Boolean = js.native
  /**
  				 * Transformation matrix to apply to the view.
  				 */
  var transform: Matrix2D | Matrix3D = js.native
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
  				 * Window to add to this navigation window.
  				 */
  var window: Window = js.native
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
  				 * Closes the window.
  				 */
  def close(): Unit = js.native
  def close(params: js.Any): Unit = js.native
  /**
  				 * Closes a window and removes it from the navigation window.
  				 */
  def closeWindow(window: Window, options: js.Any): Unit = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.anchorPoint> property.
  				 */
  def getAnchorPoint(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.animatedCenter> property.
  				 */
  def getAnimatedCenter(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.autoAdjustScrollViewInsets> property.
  				 */
  def getAutoAdjustScrollViewInsets(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundColor> property.
  				 */
  def getBackgroundColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundGradient> property.
  				 */
  def getBackgroundGradient(): Gradient = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundImage> property.
  				 */
  def getBackgroundImage(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundLeftCap> property.
  				 */
  def getBackgroundLeftCap(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundRepeat> property.
  				 */
  def getBackgroundRepeat(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundTopCap> property.
  				 */
  def getBackgroundTopCap(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.borderColor> property.
  				 */
  def getBorderColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.borderRadius> property.
  				 */
  def getBorderRadius(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.borderWidth> property.
  				 */
  def getBorderWidth(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.bottom> property.
  				 */
  def getBottom(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.center> property.
  				 */
  def getCenter(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.children> property.
  				 */
  def getChildren(): js.Array[View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.clipMode> property.
  				 */
  def getClipMode(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.extendEdges> property.
  				 */
  def getExtendEdges(): js.Array[Double] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.extendSafeArea> property.
  				 */
  def getExtendSafeArea(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.fullscreen> property.
  				 */
  def getFullscreen(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.height> property.
  				 */
  def getHeight(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBackButton> property.
  				 */
  def getHidesBackButton(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnSwipe> property.
  				 */
  def getHidesBarsOnSwipe(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnTap> property.
  				 */
  def getHidesBarsOnTap(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  				 */
  def getHidesBarsWhenKeyboardAppears(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.homeIndicatorAutoHidden> property.
  				 */
  def getHomeIndicatorAutoHidden(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalMotionEffect> property.
  				 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.includeOpaqueBars> property.
  				 */
  def getIncludeOpaqueBars(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleDisplayMode> property.
  				 */
  def getLargeTitleDisplayMode(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleEnabled> property.
  				 */
  def getLargeTitleEnabled(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.layout> property.
  				 */
  def getLayout(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.left> property.
  				 */
  def getLeft(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.leftNavButtons> property.
  				 */
  def getLeftNavButtons(): js.Array[View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.modal> property.
  				 */
  def getModal(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.navigationWindow> property.
  				 */
  def getNavigationWindow(): typings.titanium.TitaniumNs.UINs.NavigationWindow = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.opacity> property.
  				 */
  def getOpacity(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.orientation> property.
  				 */
  def getOrientation(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.orientationModes> property.
  				 */
  def getOrientationModes(): js.Array[Double] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.previewContext> property.
  				 */
  def getPreviewContext(): PreviewContext = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.pullBackgroundColor> property.
  				 */
  def getPullBackgroundColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.rect> property.
  				 */
  def getRect(): Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.right> property.
  				 */
  def getRight(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.rightNavButtons> property.
  				 */
  def getRightNavButtons(): js.Array[View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.safeAreaPadding> property.
  				 */
  def getSafeAreaPadding(): Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.size> property.
  				 */
  def getSize(): Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.statusBarStyle> property.
  				 */
  def getStatusBarStyle(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.tintColor> property.
  				 */
  def getTintColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.titleAttributes> property.
  				 */
  def getTitleAttributes(): titleAttributesParams = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.top> property.
  				 */
  def getTop(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.touchEnabled> property.
  				 */
  def getTouchEnabled(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.transform> property.
  				 */
  def getTransform(): Matrix2D | Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.verticalMotionEffect> property.
  				 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: String): View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowColor> property.
  				 */
  def getViewShadowColor(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowOffset> property.
  				 */
  def getViewShadowOffset(): Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowRadius> property.
  				 */
  def getViewShadowRadius(): Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.visible> property.
  				 */
  def getVisible(): Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.width> property.
  				 */
  def getWidth(): Double | String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
  				 */
  def getWindow(): Window = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.NavigationWindow.zIndex> property.
  				 */
  def getZIndex(): Double = js.native
  /**
  				 * Hides this view.
  				 */
  def hide(): Unit = js.native
  def hide(options: AnimationOption): Unit = js.native
  /**
  				 * Hides the navigation bar.
  				 */
  def hideNavBar(): Unit = js.native
  def hideNavBar(options: js.Any): Unit = js.native
  /**
  				 * Makes the bottom toolbar invisible.
  				 */
  def hideToolbar(): Unit = js.native
  def hideToolbar(options: js.Any): Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): Unit = js.native
  /**
  				 * Opens the window.
  				 */
  def open(): Unit = js.native
  def open(params: openWindowParams): Unit = js.native
  /**
  				 * Opens a window within the navigation window.
  				 */
  def openWindow(window: Window, options: js.Any): Unit = js.native
  /**
  				 * Closes all windows that are currently opened inside the navigation window.
  				 */
  def popToRootWindow(options: js.Any): Unit = js.native
  /**
  				 * Removes a child view from this view's hierarchy.
  				 */
  def remove(view: js.Any): Unit = js.native
  /**
  				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def replaceAt(params: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.anchorPoint> property.
  				 */
  def setAnchorPoint(anchorPoint: Point): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.autoAdjustScrollViewInsets> property.
  				 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundGradient> property.
  				 */
  def setBackgroundGradient(backgroundGradient: Gradient): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundImage> property.
  				 */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundLeftCap> property.
  				 */
  def setBackgroundLeftCap(backgroundLeftCap: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundRepeat> property.
  				 */
  def setBackgroundRepeat(backgroundRepeat: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.backgroundTopCap> property.
  				 */
  def setBackgroundTopCap(backgroundTopCap: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.borderColor> property.
  				 */
  def setBorderColor(borderColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.bottom> property.
  				 */
  def setBottom(bottom: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.bottom> property.
  				 */
  def setBottom(bottom: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.center> property.
  				 */
  def setCenter(center: Point): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.clipMode> property.
  				 */
  def setClipMode(clipMode: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.extendEdges> property.
  				 */
  def setExtendEdges(extendEdges: js.Array[Double]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.extendSafeArea> property.
  				 */
  def setExtendSafeArea(extendSafeArea: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.fullscreen> property.
  				 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.height> property.
  				 */
  def setHeight(height: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.height> property.
  				 */
  def setHeight(height: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBackButton> property.
  				 */
  def setHidesBackButton(hidesBackButton: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnSwipe> property.
  				 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsOnTap> property.
  				 */
  def setHidesBarsOnTap(hidesBarsOnTap: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.hidesBarsWhenKeyboardAppears> property.
  				 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.homeIndicatorAutoHidden> property.
  				 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalMotionEffect> property.
  				 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.includeOpaqueBars> property.
  				 */
  def setIncludeOpaqueBars(includeOpaqueBars: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleDisplayMode> property.
  				 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.largeTitleEnabled> property.
  				 */
  def setLargeTitleEnabled(largeTitleEnabled: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.layout> property.
  				 */
  def setLayout(layout: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.left> property.
  				 */
  def setLeft(left: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.left> property.
  				 */
  def setLeft(left: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.leftNavButtons> property.
  				 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.modal> property.
  				 */
  def setModal(modal: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.opacity> property.
  				 */
  def setOpacity(opacity: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.orientationModes> property.
  				 */
  def setOrientationModes(orientationModes: js.Array[Double]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.previewContext> property.
  				 */
  def setPreviewContext(previewContext: PreviewContext): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.pullBackgroundColor> property.
  				 */
  def setPullBackgroundColor(pullBackgroundColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.right> property.
  				 */
  def setRight(right: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.right> property.
  				 */
  def setRight(right: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.rightNavButtons> property.
  				 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.statusBarStyle> property.
  				 */
  def setStatusBarStyle(statusBarStyle: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.tintColor> property.
  				 */
  def setTintColor(tintColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.titleAttributes> property.
  				 */
  def setTitleAttributes(titleAttributes: titleAttributesParams): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.top> property.
  				 */
  def setTop(top: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.top> property.
  				 */
  def setTop(top: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.transform> property.
  				 */
  def setTransform(transform: Matrix2D): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.transform> property.
  				 */
  def setTransform(transform: Matrix3D): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.verticalMotionEffect> property.
  				 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowColor> property.
  				 */
  def setViewShadowColor(viewShadowColor: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowOffset> property.
  				 */
  def setViewShadowOffset(viewShadowOffset: Point): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.viewShadowRadius> property.
  				 */
  def setViewShadowRadius(viewShadowRadius: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.visible> property.
  				 */
  def setVisible(visible: Boolean): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.width> property.
  				 */
  def setWidth(width: String): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.width> property.
  				 */
  def setWidth(width: Double): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.window> property.
  				 */
  def setWindow(window: Window): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.NavigationWindow.zIndex> property.
  				 */
  def setZIndex(zIndex: Double): Unit = js.native
  /**
  				 * Makes this view visible.
  				 */
  def show(): Unit = js.native
  def show(options: AnimationOption): Unit = js.native
  /**
  				 * Makes the navigation bar visible.
  				 */
  def showNavBar(): Unit = js.native
  def showNavBar(options: js.Any): Unit = js.native
  /**
  				 * Makes the bottom toolbar visible.
  				 */
  def showToolbar(): Unit = js.native
  def showToolbar(options: js.Any): Unit = js.native
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

