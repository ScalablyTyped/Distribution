package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A SplitWindow is a window that manages the presentation of two side-by-side view
			 * controllers.
			 */
@js.native
trait SplitWindow
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
  				 * Title for the back button. This is only valid when the window is a child of a tab.
  				 */
  var backButtonTitle: java.lang.String = js.native
  /**
  				 * The image to show as the back button. This is only valid when the window is a child of a tab.
  				 */
  var backButtonTitleImage: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
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
  				 * Background color for the nav bar, as a color name or hex triplet.
  				 */
  var barColor: java.lang.String = js.native
  /**
  				 * Background image for the nav bar, specified as a URL to a local image.
  				 */
  var barImage: java.lang.String = js.native
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
  				 * Window for the detail view section of the SplitWindow.
  				 */
  var detailView: titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  				 * An array of supported values specified using the EXTEND_EDGE constants in <Titanium.UI>.
  				 */
  var extendEdges: js.Array[scala.Double] = js.native
  /**
  				 * Specifies whether the screen insets/notches are allowed to overlap the window's content or not.
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
  				 * Set this to true to hide the shadow image of the navigation bar.
  				 */
  var hideShadow: scala.Boolean = js.native
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
  				 * Determines the width of the `masterView` in landscape mode.
  				 */
  var landscapeSplit: scala.Double = js.native
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
  				 * View to show in the left nav bar area.
  				 */
  var leftNavButton: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * An Array of views to show in the left nav bar area.
  				 */
  var leftNavButtons: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Determines whether to show the master view is overlayed in portrait orientation.
  				 */
  var masterIsOverlayed: scala.Boolean = js.native
  /**
  				 * Window for the master view section of the SplitWindow.
  				 */
  var masterView: titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  				 * Determines whether to show the master view or hide.
  				 */
  var masterViewVisible: scala.Boolean = js.native
  /**
  				 * Indicates to open a modal window or not.
  				 */
  var modal: scala.Boolean = js.native
  /**
  				 * Hides the navigation bar (`true`) or shows the navigation bar (`false`).
  				 */
  var navBarHidden: scala.Boolean = js.native
  /**
  				 * The tintColor to apply to the navigation bar.
  				 */
  var navTintColor: java.lang.String = js.native
  /**
  				 * The <Titanium.UI.NavigationWindow> instance hosting this window.
  				 */
  val navigationWindow: titaniumLib.TitaniumNs.UINs.NavigationWindow = js.native
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
  				 * Determines the width of the `masterView` in portrait mode.
  				 */
  var portraitSplit: scala.Double = js.native
  /**
  				 * The preview context used in the 3D-Touch feature "Peek and Pop".
  				 */
  var previewContext: PreviewContext = js.native
  /**
  				 * Background color of the wrapper view when this view is used as either <Titanium.UI.ListView.pullView> or <Titanium.UI.TableView.headerPullView>.
  				 * Defaults to `undefined`. Results in a light grey background color on the wrapper view.
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
  				 * View to show in the right nav bar area.
  				 */
  var rightNavButton: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * An Array of views to show in the right nav bar area.
  				 */
  var rightNavButtons: js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * The padding needed to safely display content without it being overlapped by the screen insets and notches.
  				 */
  val safeAreaPadding: titaniumLib.Dimension = js.native
  /**
  				 * Shadow image for the navigation bar, specified as a URL to a local image..
  				 */
  var shadowImage: java.lang.String = js.native
  /**
  				 * Determines whether to show the master view in portrait orientation.
  				 */
  var showMasterInPortrait: scala.Boolean = js.native
  /**
  				 * The size of the view in system units.
  				 */
  val size: titaniumLib.Dimension = js.native
  /**
  				 * The status bar style associated with this window.
  				 */
  var statusBarStyle: scala.Double = js.native
  /**
  				 * Boolean value indicating if the tab bar should be hidden.
  				 */
  var tabBarHidden: scala.Boolean = js.native
  /**
  				 * The view's tintColor
  				 */
  var tintColor: java.lang.String = js.native
  /**
  				 * Title of the window.
  				 */
  var title: java.lang.String = js.native
  /**
  				 * Title text attributes of the window.
  				 */
  var titleAttributes: titaniumLib.titleAttributesParams = js.native
  /**
  				 * View to show in the title area of the nav bar.
  				 */
  var titleControl: titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Image to show in the title area of the nav bar, specified as a local file path or URL.
  				 */
  var titleImage: java.lang.String = js.native
  /**
  				 * Title prompt for the window.
  				 */
  var titlePrompt: java.lang.String = js.native
  /**
  				 * Key identifying a string from the locale file to use for the window title.
  				 */
  var titleid: java.lang.String = js.native
  /**
  				 * Key identifying a string from the locale file to use for the window title prompt.
  				 */
  var titlepromptid: java.lang.String = js.native
  /**
  				 * Array of button objects to show in the window's toolbar.
  				 */
  var toolbar: js.Array[_] = js.native
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
  				 * Boolean value indicating if the nav bar is translucent.
  				 */
  var translucent: scala.Boolean = js.native
  /**
  				 * Loads a JavaScript file from a local URL.
  				 */
  var url: java.lang.String = js.native
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
  				 * Closes the window.
  				 */
  def close(): scala.Unit = js.native
  def close(params: js.Any): scala.Unit = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityHidden> property.
  				 */
  def getAccessibilityHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityHint> property.
  				 */
  def getAccessibilityHint(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityLabel> property.
  				 */
  def getAccessibilityLabel(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityValue> property.
  				 */
  def getAccessibilityValue(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.anchorPoint> property.
  				 */
  def getAnchorPoint(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.animatedCenter> property.
  				 */
  def getAnimatedCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.autoAdjustScrollViewInsets> property.
  				 */
  def getAutoAdjustScrollViewInsets(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backButtonTitle> property.
  				 */
  def getBackButtonTitle(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backButtonTitleImage> property.
  				 */
  def getBackButtonTitleImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backgroundColor> property.
  				 */
  def getBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backgroundGradient> property.
  				 */
  def getBackgroundGradient(): titaniumLib.Gradient = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backgroundImage> property.
  				 */
  def getBackgroundImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backgroundLeftCap> property.
  				 */
  def getBackgroundLeftCap(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backgroundRepeat> property.
  				 */
  def getBackgroundRepeat(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.backgroundTopCap> property.
  				 */
  def getBackgroundTopCap(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.barColor> property.
  				 */
  def getBarColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.barImage> property.
  				 */
  def getBarImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.borderColor> property.
  				 */
  def getBorderColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.borderRadius> property.
  				 */
  def getBorderRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.borderWidth> property.
  				 */
  def getBorderWidth(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.bottom> property.
  				 */
  def getBottom(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.center> property.
  				 */
  def getCenter(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.children> property.
  				 */
  def getChildren(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.clipMode> property.
  				 */
  def getClipMode(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.detailView> property.
  				 */
  def getDetailView(): titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.extendEdges> property.
  				 */
  def getExtendEdges(): js.Array[scala.Double] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.extendSafeArea> property.
  				 */
  def getExtendSafeArea(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.fullscreen> property.
  				 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.height> property.
  				 */
  def getHeight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.hideShadow> property.
  				 */
  def getHideShadow(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.hidesBackButton> property.
  				 */
  def getHidesBackButton(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.hidesBarsOnSwipe> property.
  				 */
  def getHidesBarsOnSwipe(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.hidesBarsOnTap> property.
  				 */
  def getHidesBarsOnTap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.hidesBarsWhenKeyboardAppears> property.
  				 */
  def getHidesBarsWhenKeyboardAppears(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.homeIndicatorAutoHidden> property.
  				 */
  def getHomeIndicatorAutoHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.horizontalMotionEffect> property.
  				 */
  def getHorizontalMotionEffect(): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.horizontalWrap> property.
  				 */
  def getHorizontalWrap(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.includeOpaqueBars> property.
  				 */
  def getIncludeOpaqueBars(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.landscapeSplit> property.
  				 */
  def getLandscapeSplit(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.largeTitleDisplayMode> property.
  				 */
  def getLargeTitleDisplayMode(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.largeTitleEnabled> property.
  				 */
  def getLargeTitleEnabled(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.layout> property.
  				 */
  def getLayout(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.left> property.
  				 */
  def getLeft(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.leftNavButton> property.
  				 */
  def getLeftNavButton(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.leftNavButtons> property.
  				 */
  def getLeftNavButtons(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.masterIsOverlayed> property.
  				 */
  def getMasterIsOverlayed(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.masterView> property.
  				 */
  def getMasterView(): titaniumLib.TitaniumNs.UINs.Window = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.masterViewVisible> property.
  				 */
  def getMasterViewVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.modal> property.
  				 */
  def getModal(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.navBarHidden> property.
  				 */
  def getNavBarHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.navTintColor> property.
  				 */
  def getNavTintColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.navigationWindow> property.
  				 */
  def getNavigationWindow(): titaniumLib.TitaniumNs.UINs.NavigationWindow = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.opacity> property.
  				 */
  def getOpacity(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.orientation> property.
  				 */
  def getOrientation(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.orientationModes> property.
  				 */
  def getOrientationModes(): js.Array[scala.Double] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.portraitSplit> property.
  				 */
  def getPortraitSplit(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.previewContext> property.
  				 */
  def getPreviewContext(): PreviewContext = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.pullBackgroundColor> property.
  				 */
  def getPullBackgroundColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.rect> property.
  				 */
  def getRect(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.right> property.
  				 */
  def getRight(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.rightNavButton> property.
  				 */
  def getRightNavButton(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.rightNavButtons> property.
  				 */
  def getRightNavButtons(): js.Array[titaniumLib.TitaniumNs.UINs.View] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.safeAreaPadding> property.
  				 */
  def getSafeAreaPadding(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.shadowImage> property.
  				 */
  def getShadowImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.showMasterInPortrait> property.
  				 */
  def getShowMasterInPortrait(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.size> property.
  				 */
  def getSize(): titaniumLib.Dimension = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.statusBarStyle> property.
  				 */
  def getStatusBarStyle(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.tabBarHidden> property.
  				 */
  def getTabBarHidden(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.tintColor> property.
  				 */
  def getTintColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.title> property.
  				 */
  def getTitle(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.titleAttributes> property.
  				 */
  def getTitleAttributes(): titaniumLib.titleAttributesParams = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.titleControl> property.
  				 */
  def getTitleControl(): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.titleImage> property.
  				 */
  def getTitleImage(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.titlePrompt> property.
  				 */
  def getTitlePrompt(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.titleid> property.
  				 */
  def getTitleid(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.titlepromptid> property.
  				 */
  def getTitlepromptid(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.toolbar> property.
  				 */
  def getToolbar(): js.Array[_] = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.top> property.
  				 */
  def getTop(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.touchEnabled> property.
  				 */
  def getTouchEnabled(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.transform> property.
  				 */
  def getTransform(): titaniumLib.TitaniumNs.UINs.Matrix2D | titaniumLib.TitaniumNs.UINs.Matrix3D = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.translucent> property.
  				 */
  def getTranslucent(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.url> property.
  				 */
  def getUrl(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.verticalMotionEffect> property.
  				 */
  def getVerticalMotionEffect(): js.Any = js.native
  /**
  				 * Returns the matching view of a given view ID.
  				 */
  def getViewById(id: java.lang.String): titaniumLib.TitaniumNs.UINs.View = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.viewShadowColor> property.
  				 */
  def getViewShadowColor(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.viewShadowOffset> property.
  				 */
  def getViewShadowOffset(): titaniumLib.Point = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.viewShadowRadius> property.
  				 */
  def getViewShadowRadius(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.visible> property.
  				 */
  def getVisible(): scala.Boolean = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.width> property.
  				 */
  def getWidth(): scala.Double | java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SplitWindow.zIndex> property.
  				 */
  def getZIndex(): scala.Double = js.native
  /**
  				 * Hides this view.
  				 */
  def hide(): scala.Unit = js.native
  def hide(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Hides the navigation bar.
  				 */
  def hideNavBar(): scala.Unit = js.native
  def hideNavBar(options: js.Any): scala.Unit = js.native
  /**
  				 * Hides the tab bar. Must be called before opening the window.
  				 */
  def hideTabBar(): scala.Unit = js.native
  /**
  				 * Makes the bottom toolbar invisible.
  				 */
  def hideToolbar(): scala.Unit = js.native
  def hideToolbar(options: js.Any): scala.Unit = js.native
  /**
  				 * Inserts a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def insertAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Opens the window.
  				 */
  def open(): scala.Unit = js.native
  def open(params: titaniumLib.openWindowParams): scala.Unit = js.native
  /**
  				 * Removes a child view from this view's hierarchy.
  				 */
  def remove(view: js.Any): scala.Unit = js.native
  /**
  				 * Replaces a view at the specified position in the [children](Titanium.UI.View.children) array.
  				 */
  def replaceAt(params: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityHidden> property.
  				 */
  def setAccessibilityHidden(accessibilityHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityHint> property.
  				 */
  def setAccessibilityHint(accessibilityHint: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityLabel> property.
  				 */
  def setAccessibilityLabel(accessibilityLabel: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.accessibilityValue> property.
  				 */
  def setAccessibilityValue(accessibilityValue: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.anchorPoint> property.
  				 */
  def setAnchorPoint(anchorPoint: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.autoAdjustScrollViewInsets> property.
  				 */
  def setAutoAdjustScrollViewInsets(autoAdjustScrollViewInsets: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backButtonTitle> property.
  				 */
  def setBackButtonTitle(backButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backButtonTitleImage> property.
  				 */
  def setBackButtonTitleImage(backButtonTitleImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backButtonTitleImage> property.
  				 */
  def setBackButtonTitleImage(backButtonTitleImage: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backgroundColor> property.
  				 */
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backgroundGradient> property.
  				 */
  def setBackgroundGradient(backgroundGradient: titaniumLib.Gradient): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backgroundImage> property.
  				 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backgroundLeftCap> property.
  				 */
  def setBackgroundLeftCap(backgroundLeftCap: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backgroundRepeat> property.
  				 */
  def setBackgroundRepeat(backgroundRepeat: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.backgroundTopCap> property.
  				 */
  def setBackgroundTopCap(backgroundTopCap: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.barColor> property.
  				 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.barImage> property.
  				 */
  def setBarImage(barImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.borderColor> property.
  				 */
  def setBorderColor(borderColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.borderRadius> property.
  				 */
  def setBorderRadius(borderRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.borderWidth> property.
  				 */
  def setBorderWidth(borderWidth: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.bottom> property.
  				 */
  def setBottom(bottom: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.bottom> property.
  				 */
  def setBottom(bottom: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.center> property.
  				 */
  def setCenter(center: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.clipMode> property.
  				 */
  def setClipMode(clipMode: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.detailView> property.
  				 */
  def setDetailView(detailView: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.extendEdges> property.
  				 */
  def setExtendEdges(extendEdges: js.Array[scala.Double]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.extendSafeArea> property.
  				 */
  def setExtendSafeArea(extendSafeArea: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.fullscreen> property.
  				 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.height> property.
  				 */
  def setHeight(height: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.height> property.
  				 */
  def setHeight(height: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.hideShadow> property.
  				 */
  def setHideShadow(hideShadow: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.hidesBackButton> property.
  				 */
  def setHidesBackButton(hidesBackButton: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.hidesBarsOnSwipe> property.
  				 */
  def setHidesBarsOnSwipe(hidesBarsOnSwipe: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.hidesBarsOnTap> property.
  				 */
  def setHidesBarsOnTap(hidesBarsOnTap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.hidesBarsWhenKeyboardAppears> property.
  				 */
  def setHidesBarsWhenKeyboardAppears(hidesBarsWhenKeyboardAppears: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.homeIndicatorAutoHidden> property.
  				 */
  def setHomeIndicatorAutoHidden(homeIndicatorAutoHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.horizontalMotionEffect> property.
  				 */
  def setHorizontalMotionEffect(horizontalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.horizontalWrap> property.
  				 */
  def setHorizontalWrap(horizontalWrap: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.includeOpaqueBars> property.
  				 */
  def setIncludeOpaqueBars(includeOpaqueBars: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.landscapeSplit> property.
  				 */
  def setLandscapeSplit(landscapeSplit: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.largeTitleDisplayMode> property.
  				 */
  def setLargeTitleDisplayMode(largeTitleDisplayMode: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.largeTitleEnabled> property.
  				 */
  def setLargeTitleEnabled(largeTitleEnabled: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.layout> property.
  				 */
  def setLayout(layout: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.left> property.
  				 */
  def setLeft(left: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.left> property.
  				 */
  def setLeft(left: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.leftNavButton> property.
  				 */
  def setLeftNavButton(leftNavButton: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.leftNavButtons> property.
  				 */
  def setLeftNavButtons(leftNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  				 * Sets the value of the [masterIsOverlayed](Titanium.UI.iOS.SplitWindow.masterIsOverlayed) property.
  				 */
  def setMasterIsOverlayed(masterIsOverlayed: scala.Boolean): scala.Unit = js.native
  def setMasterIsOverlayed(masterIsOverlayed: scala.Boolean, animated: titaniumLib.animationOption): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.masterView> property.
  				 */
  def setMasterView(masterView: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.masterViewVisible> property.
  				 */
  def setMasterViewVisible(masterViewVisible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.modal> property.
  				 */
  def setModal(modal: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.navBarHidden> property.
  				 */
  def setNavBarHidden(navBarHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.navTintColor> property.
  				 */
  def setNavTintColor(navTintColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.opacity> property.
  				 */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.orientationModes> property.
  				 */
  def setOrientationModes(orientationModes: js.Array[scala.Double]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.portraitSplit> property.
  				 */
  def setPortraitSplit(portraitSplit: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.previewContext> property.
  				 */
  def setPreviewContext(previewContext: PreviewContext): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.pullBackgroundColor> property.
  				 */
  def setPullBackgroundColor(pullBackgroundColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.right> property.
  				 */
  def setRight(right: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.right> property.
  				 */
  def setRight(right: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.rightNavButton> property.
  				 */
  def setRightNavButton(rightNavButton: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.rightNavButtons> property.
  				 */
  def setRightNavButtons(rightNavButtons: js.Array[_]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.shadowImage> property.
  				 */
  def setShadowImage(shadowImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the [showMasterInPortrait](Titanium.UI.iOS.SplitWindow.showMasterInPortrait) property.
  				 */
  def setShowMasterInPortrait(showMasterInPortrait: scala.Boolean): scala.Unit = js.native
  def setShowMasterInPortrait(showMasterInPortrait: scala.Boolean, animated: titaniumLib.animationOption): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.statusBarStyle> property.
  				 */
  def setStatusBarStyle(statusBarStyle: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.tabBarHidden> property.
  				 */
  def setTabBarHidden(tabBarHidden: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.tintColor> property.
  				 */
  def setTintColor(tintColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.titleAttributes> property.
  				 */
  def setTitleAttributes(titleAttributes: titaniumLib.titleAttributesParams): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.titleControl> property.
  				 */
  def setTitleControl(titleControl: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.titleImage> property.
  				 */
  def setTitleImage(titleImage: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.titlePrompt> property.
  				 */
  def setTitlePrompt(titlePrompt: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.titleid> property.
  				 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.titlepromptid> property.
  				 */
  def setTitlepromptid(titlepromptid: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the array of items to show in the window's toolbar.
  				 */
  def setToolbar(items: js.Array[_]): scala.Unit = js.native
  def setToolbar(items: js.Array[_], params: titaniumLib.windowToolbarParam): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.top> property.
  				 */
  def setTop(top: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.top> property.
  				 */
  def setTop(top: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.touchEnabled> property.
  				 */
  def setTouchEnabled(touchEnabled: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix2D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.transform> property.
  				 */
  def setTransform(transform: titaniumLib.TitaniumNs.UINs.Matrix3D): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.translucent> property.
  				 */
  def setTranslucent(translucent: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.url> property.
  				 */
  def setUrl(url: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.verticalMotionEffect> property.
  				 */
  def setVerticalMotionEffect(verticalMotionEffect: js.Any): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.viewShadowColor> property.
  				 */
  def setViewShadowColor(viewShadowColor: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.viewShadowOffset> property.
  				 */
  def setViewShadowOffset(viewShadowOffset: titaniumLib.Point): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.viewShadowRadius> property.
  				 */
  def setViewShadowRadius(viewShadowRadius: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.visible> property.
  				 */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.width> property.
  				 */
  def setWidth(width: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.width> property.
  				 */
  def setWidth(width: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SplitWindow.zIndex> property.
  				 */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  /**
  				 * Makes this view visible.
  				 */
  def show(): scala.Unit = js.native
  def show(options: titaniumLib.AnimationOption): scala.Unit = js.native
  /**
  				 * Makes the navigation bar visible.
  				 */
  def showNavBar(): scala.Unit = js.native
  def showNavBar(options: js.Any): scala.Unit = js.native
  /**
  				 * Makes the bottom toolbar visible.
  				 */
  def showToolbar(): scala.Unit = js.native
  def showToolbar(options: js.Any): scala.Unit = js.native
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

