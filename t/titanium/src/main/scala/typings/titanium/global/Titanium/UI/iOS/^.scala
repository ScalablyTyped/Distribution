package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Dictionary
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Titanium.UI.iOS")
@js.native
object ^ extends js.Object {
  
  /**
    * View presented with the same style as its parent window.
    */
  var MODAL_PRESENTATION_CURRENT_CONTEXT: Double = js.native
  
  /**
    * View presented over its parent window.
    */
  var MODAL_PRESENTATION_OVER_CURRENT_CONTEXT: Double = js.native
  
  /**
    * Presented view covers the screen.
    */
  var MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * Value of the badge for the application's springboard icon.
    */
  var appBadge: Double = js.native
  
  /**
    * Determines whether the shake to edit system-wide capability is enabled.
    */
  var appSupportsShakeToEdit: Boolean = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.AnchorAttachmentBehavior>.
    */
  def createAnchorAttachmentBehavior(): typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior = js.native
  def createAnchorAttachmentBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior]): typings.titanium.Titanium.UI.iOS.AnchorAttachmentBehavior = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.Animator>.
    */
  def createAnimator(): typings.titanium.Titanium.UI.iOS.Animator = js.native
  def createAnimator(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.Animator]): typings.titanium.Titanium.UI.iOS.Animator = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.ApplicationShortcuts>.
    * @deprecated Use [Titanium.UI.Shortcut](Titanium.UI.Shortcut) instead.
    */
  def createApplicationShortcuts(): typings.titanium.Titanium.UI.iOS.ApplicationShortcuts = js.native
  def createApplicationShortcuts(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.ApplicationShortcuts]): typings.titanium.Titanium.UI.iOS.ApplicationShortcuts = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.BlurView>.
    */
  def createBlurView(): typings.titanium.Titanium.UI.iOS.BlurView = js.native
  def createBlurView(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.BlurView]): typings.titanium.Titanium.UI.iOS.BlurView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.CollisionBehavior>.
    */
  def createCollisionBehavior(): typings.titanium.Titanium.UI.iOS.CollisionBehavior = js.native
  def createCollisionBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.CollisionBehavior]): typings.titanium.Titanium.UI.iOS.CollisionBehavior = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.CoverFlowView>.
    */
  def createCoverFlowView(): typings.titanium.Titanium.UI.iOS.CoverFlowView = js.native
  def createCoverFlowView(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.CoverFlowView]): typings.titanium.Titanium.UI.iOS.CoverFlowView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.DocumentViewer>.
    */
  def createDocumentViewer(): typings.titanium.Titanium.UI.iOS.DocumentViewer = js.native
  def createDocumentViewer(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.DocumentViewer]): typings.titanium.Titanium.UI.iOS.DocumentViewer = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.DynamicItemBehavior>.
    */
  def createDynamicItemBehavior(): typings.titanium.Titanium.UI.iOS.DynamicItemBehavior = js.native
  def createDynamicItemBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.DynamicItemBehavior]): typings.titanium.Titanium.UI.iOS.DynamicItemBehavior = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.FeedbackGenerator>.
    */
  def createFeedbackGenerator(): typings.titanium.Titanium.UI.iOS.FeedbackGenerator = js.native
  def createFeedbackGenerator(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.FeedbackGenerator]): typings.titanium.Titanium.UI.iOS.FeedbackGenerator = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.GravityBehavior>.
    */
  def createGravityBehavior(): typings.titanium.Titanium.UI.iOS.GravityBehavior = js.native
  def createGravityBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.GravityBehavior]): typings.titanium.Titanium.UI.iOS.GravityBehavior = js.native
  
  /**
    * Creates a live photo badge to be used together with the
    * <Titanium.UI.iOS.LivePhotoView> API.
    */
  def createLivePhotoBadge(`type`: Double): Blob = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.LivePhotoView>.
    */
  def createLivePhotoView(): typings.titanium.Titanium.UI.iOS.LivePhotoView = js.native
  def createLivePhotoView(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.LivePhotoView]): typings.titanium.Titanium.UI.iOS.LivePhotoView = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.MenuPopup>.
    */
  def createMenuPopup(): typings.titanium.Titanium.UI.iOS.MenuPopup = js.native
  def createMenuPopup(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.MenuPopup]): typings.titanium.Titanium.UI.iOS.MenuPopup = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.NavigationWindow>.
    * @deprecated Use [Titanium.UI.NavigationWindow](Titanium.UI.NavigationWindow) instead.
    */
  def createNavigationWindow(): typings.titanium.Titanium.UI.iOS.NavigationWindow = js.native
  def createNavigationWindow(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.NavigationWindow]): typings.titanium.Titanium.UI.iOS.NavigationWindow = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.PreviewAction>.
    */
  def createPreviewAction(): typings.titanium.Titanium.UI.iOS.PreviewAction = js.native
  def createPreviewAction(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PreviewAction]): typings.titanium.Titanium.UI.iOS.PreviewAction = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.PreviewActionGroup>.
    */
  def createPreviewActionGroup(): typings.titanium.Titanium.UI.iOS.PreviewActionGroup = js.native
  def createPreviewActionGroup(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PreviewActionGroup]): typings.titanium.Titanium.UI.iOS.PreviewActionGroup = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.PreviewContext>.
    */
  def createPreviewContext(): typings.titanium.Titanium.UI.iOS.PreviewContext = js.native
  def createPreviewContext(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PreviewContext]): typings.titanium.Titanium.UI.iOS.PreviewContext = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.PushBehavior>.
    */
  def createPushBehavior(): typings.titanium.Titanium.UI.iOS.PushBehavior = js.native
  def createPushBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.PushBehavior]): typings.titanium.Titanium.UI.iOS.PushBehavior = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.SnapBehavior>.
    */
  def createSnapBehavior(): typings.titanium.Titanium.UI.iOS.SnapBehavior = js.native
  def createSnapBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.SnapBehavior]): typings.titanium.Titanium.UI.iOS.SnapBehavior = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.SplitWindow>.
    */
  def createSplitWindow(): typings.titanium.Titanium.UI.iOS.SplitWindow = js.native
  def createSplitWindow(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.SplitWindow]): typings.titanium.Titanium.UI.iOS.SplitWindow = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.Stepper>.
    */
  def createStepper(): typings.titanium.Titanium.UI.iOS.Stepper = js.native
  def createStepper(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.Stepper]): typings.titanium.Titanium.UI.iOS.Stepper = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.SystemButton>.
    */
  def createSystemButton(): typings.titanium.Titanium.UI.iOS.SystemButton = js.native
  def createSystemButton(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.SystemButton]): typings.titanium.Titanium.UI.iOS.SystemButton = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.TabbedBar>.
    * @deprecated Use [Titanium.UI.TabbedBar](Titanium.UI.TabbedBar) instead.
    */
  def createTabbedBar(): typings.titanium.Titanium.UI.iOS.TabbedBar = js.native
  def createTabbedBar(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.TabbedBar]): typings.titanium.Titanium.UI.iOS.TabbedBar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.Toolbar>.
    * @deprecated Use the cross-platform [Titanium.UI.Toolbar](Titanium.UI.Toolbar) instead.
    */
  def createToolbar(): typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  def createToolbar(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.Toolbar]): typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.TransitionAnimation>.
    */
  def createTransitionAnimation(): typings.titanium.Titanium.UI.iOS.TransitionAnimation = js.native
  def createTransitionAnimation(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.TransitionAnimation]): typings.titanium.Titanium.UI.iOS.TransitionAnimation = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.ViewAttachmentBehavior>.
    */
  def createViewAttachmentBehavior(): typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior = js.native
  def createViewAttachmentBehavior(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior]): typings.titanium.Titanium.UI.iOS.ViewAttachmentBehavior = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.WebViewConfiguration>.
    */
  def createWebViewConfiguration(): typings.titanium.Titanium.UI.iOS.WebViewConfiguration = js.native
  def createWebViewConfiguration(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.WebViewConfiguration]): typings.titanium.Titanium.UI.iOS.WebViewConfiguration = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.WebViewDecisionHandler>.
    */
  def createWebViewDecisionHandler(): typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler = js.native
  def createWebViewDecisionHandler(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler]): typings.titanium.Titanium.UI.iOS.WebViewDecisionHandler = js.native
  
  /**
    * Creates and returns an instance of <Titanium.UI.iOS.WebViewProcessPool>.
    */
  def createWebViewProcessPool(): typings.titanium.Titanium.UI.iOS.WebViewProcessPool = js.native
  def createWebViewProcessPool(parameters: Dictionary[typings.titanium.Titanium.UI.iOS.WebViewProcessPool]): typings.titanium.Titanium.UI.iOS.WebViewProcessPool = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Determines if the 3D-Touch capability "Force Touch" is supported (`true`) or not (`false`) by the device.
    */
  val forceTouchSupported: Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.apiName> property.
    * @deprecated Access <Titanium.UI.iOS.apiName> instead.
    */
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.appBadge> property.
    * @deprecated Access <Titanium.UI.iOS.appBadge> instead.
    */
  def getAppBadge(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.appSupportsShakeToEdit> property.
    * @deprecated Access <Titanium.UI.iOS.appSupportsShakeToEdit> instead.
    */
  def getAppSupportsShakeToEdit(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.bubbleParent> property.
    * @deprecated Access <Titanium.UI.iOS.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.forceTouchSupported> property.
    * @deprecated Access <Titanium.UI.iOS.forceTouchSupported> instead.
    */
  def getForceTouchSupported(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.statusBarBackgroundColor> property.
    * @deprecated Access <Titanium.UI.iOS.statusBarBackgroundColor> instead.
    */
  def getStatusBarBackgroundColor(): String | Color = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.appBadge> property.
    * @deprecated Set the value using <Titanium.UI.iOS.appBadge> instead.
    */
  def setAppBadge(appBadge: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.appSupportsShakeToEdit> property.
    * @deprecated Set the value using <Titanium.UI.iOS.appSupportsShakeToEdit> instead.
    */
  def setAppSupportsShakeToEdit(appSupportsShakeToEdit: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.bubbleParent> property.
    * @deprecated Set the value using <Titanium.UI.iOS.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_CURRENT_CONTEXT> property.
    * @deprecated Set the value using <Titanium.UI.iOS.MODAL_PRESENTATION_CURRENT_CONTEXT> instead.
    */
  def setMODAL_PRESENTATION_CURRENT_CONTEXT(MODAL_PRESENTATION_CURRENT_CONTEXT: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_CONTEXT> property.
    * @deprecated Set the value using <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_CONTEXT> instead.
    */
  def setMODAL_PRESENTATION_OVER_CURRENT_CONTEXT(MODAL_PRESENTATION_OVER_CURRENT_CONTEXT: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN> property.
    * @deprecated Set the value using <Titanium.UI.iOS.MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN> instead.
    */
  def setMODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN(MODAL_PRESENTATION_OVER_CURRENT_FULL_SCREEN: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.statusBarBackgroundColor> property.
    * @deprecated Set the value using <Titanium.UI.iOS.statusBarBackgroundColor> instead.
    */
  def setStatusBarBackgroundColor(statusBarBackgroundColor: String): Unit = js.native
  def setStatusBarBackgroundColor(statusBarBackgroundColor: Color): Unit = js.native
  
  /**
    * Sets the global status bar background color for the application. Android does not support setting instances of <Titanium.UI.Color>
    */
  var statusBarBackgroundColor: String | Color = js.native
  
  /**
    * Get image from SF Symbols provided by Apple.
    */
  def systemImage(name: String): Blob = js.native
}
