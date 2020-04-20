package typings.titanium.Titanium.UI.iOS

import typings.titanium.Dictionary
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * Determines if the 3D-Touch capability "Force Touch" is supported (`true`) or not (`false`) by the device.
  			 */
  val forceTouchSupported: Boolean = js.native
  /**
  			 * Sets the global status bar background color for the application.
  			 */
  var statusBarBackgroundColor: String = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.AnchorAttachmentBehavior>.
  			 */
  def createAnchorAttachmentBehavior(): AnchorAttachmentBehavior = js.native
  def createAnchorAttachmentBehavior(parameters: Dictionary[AnchorAttachmentBehavior]): AnchorAttachmentBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Animator>.
  			 */
  def createAnimator(): Animator = js.native
  def createAnimator(parameters: Dictionary[Animator]): Animator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.ApplicationShortcuts>.
  			 */
  def createApplicationShortcuts(): ApplicationShortcuts = js.native
  def createApplicationShortcuts(parameters: Dictionary[ApplicationShortcuts]): ApplicationShortcuts = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.BlurView>.
  			 */
  def createBlurView(): BlurView = js.native
  def createBlurView(parameters: Dictionary[BlurView]): BlurView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.CollisionBehavior>.
  			 */
  def createCollisionBehavior(): CollisionBehavior = js.native
  def createCollisionBehavior(parameters: Dictionary[CollisionBehavior]): CollisionBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.CoverFlowView>.
  			 */
  def createCoverFlowView(): CoverFlowView = js.native
  def createCoverFlowView(parameters: Dictionary[CoverFlowView]): CoverFlowView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.DocumentViewer>.
  			 */
  def createDocumentViewer(): DocumentViewer = js.native
  def createDocumentViewer(parameters: Dictionary[DocumentViewer]): DocumentViewer = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.DynamicItemBehavior>.
  			 */
  def createDynamicItemBehavior(): DynamicItemBehavior = js.native
  def createDynamicItemBehavior(parameters: Dictionary[DynamicItemBehavior]): DynamicItemBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.FeedbackGenerator>.
  			 */
  def createFeedbackGenerator(): FeedbackGenerator = js.native
  def createFeedbackGenerator(parameters: Dictionary[FeedbackGenerator]): FeedbackGenerator = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.GravityBehavior>.
  			 */
  def createGravityBehavior(): GravityBehavior = js.native
  def createGravityBehavior(parameters: Dictionary[GravityBehavior]): GravityBehavior = js.native
  /**
  			 * Creates a live photo badge to be used together with the
  			 * <Titanium.UI.iOS.LivePhotoView> API.
  			 */
  def createLivePhotoBadge(`type`: Double): Blob = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.LivePhotoView>.
  			 */
  def createLivePhotoView(): LivePhotoView = js.native
  def createLivePhotoView(parameters: Dictionary[LivePhotoView]): LivePhotoView = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.MenuPopup>.
  			 */
  def createMenuPopup(): MenuPopup = js.native
  def createMenuPopup(parameters: Dictionary[MenuPopup]): MenuPopup = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.NavigationWindow>.
  			 * @deprecated Use [Titanium.UI.NavigationWindow](Titanium.UI.NavigationWindow) instead.
  			 */
  def createNavigationWindow(): NavigationWindow = js.native
  def createNavigationWindow(parameters: Dictionary[NavigationWindow]): NavigationWindow = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PreviewAction>.
  			 */
  def createPreviewAction(): PreviewAction = js.native
  def createPreviewAction(parameters: Dictionary[PreviewAction]): PreviewAction = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PreviewActionGroup>.
  			 */
  def createPreviewActionGroup(): PreviewActionGroup = js.native
  def createPreviewActionGroup(parameters: Dictionary[PreviewActionGroup]): PreviewActionGroup = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PreviewContext>.
  			 */
  def createPreviewContext(): PreviewContext = js.native
  def createPreviewContext(parameters: Dictionary[PreviewContext]): PreviewContext = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.PushBehavior>.
  			 */
  def createPushBehavior(): PushBehavior = js.native
  def createPushBehavior(parameters: Dictionary[PushBehavior]): PushBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.SnapBehavior>.
  			 */
  def createSnapBehavior(): SnapBehavior = js.native
  def createSnapBehavior(parameters: Dictionary[SnapBehavior]): SnapBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.SplitWindow>.
  			 */
  def createSplitWindow(): SplitWindow = js.native
  def createSplitWindow(parameters: Dictionary[SplitWindow]): SplitWindow = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Stepper>.
  			 */
  def createStepper(): Stepper = js.native
  def createStepper(parameters: Dictionary[Stepper]): Stepper = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.SystemButton>.
  			 */
  def createSystemButton(): SystemButton = js.native
  def createSystemButton(parameters: Dictionary[SystemButton]): SystemButton = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.TabbedBar>.
  			 * @deprecated Use [Titanium.UI.TabbedBar](Titanium.UI.TabbedBar) instead.
  			 */
  def createTabbedBar(): TabbedBar = js.native
  def createTabbedBar(parameters: Dictionary[TabbedBar]): TabbedBar = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.Toolbar>.
  			 * @deprecated Use the cross-platform [Titanium.UI.Toolbar](Titanium.UI.Toolbar) instead.
  			 */
  def createToolbar(): Toolbar = js.native
  def createToolbar(parameters: Dictionary[Toolbar]): Toolbar = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.TransitionAnimation>.
  			 */
  def createTransitionAnimation(): TransitionAnimation = js.native
  def createTransitionAnimation(parameters: Dictionary[TransitionAnimation]): TransitionAnimation = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.ViewAttachmentBehavior>.
  			 */
  def createViewAttachmentBehavior(): ViewAttachmentBehavior = js.native
  def createViewAttachmentBehavior(parameters: Dictionary[ViewAttachmentBehavior]): ViewAttachmentBehavior = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.WebViewConfiguration>.
  			 */
  def createWebViewConfiguration(): WebViewConfiguration = js.native
  def createWebViewConfiguration(parameters: Dictionary[WebViewConfiguration]): WebViewConfiguration = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.WebViewDecisionHandler>.
  			 */
  def createWebViewDecisionHandler(): WebViewDecisionHandler = js.native
  def createWebViewDecisionHandler(parameters: Dictionary[WebViewDecisionHandler]): WebViewDecisionHandler = js.native
  /**
  			 * Creates and returns an instance of <Titanium.UI.iOS.WebViewProcessPool>.
  			 */
  def createWebViewProcessPool(): WebViewProcessPool = js.native
  def createWebViewProcessPool(parameters: Dictionary[WebViewProcessPool]): WebViewProcessPool = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
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
  def getStatusBarBackgroundColor(): String = js.native
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
  /**
  			 * Get image from SF Symbols provided by Apple.
  			 */
  def systemImage(name: String): Blob = js.native
}

