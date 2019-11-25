package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofiPhone extends js.Object {
  /**
  			 * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
  			 */
  val ActivityIndicatorStyle: TypeofActivityIndicatorStyleAddEventListener
  /**
  			 * A set of constants for the style that can be used for the `style` property of
  			 * <Titanium.UI.AlertDialog>.
  			 */
  val AlertDialogStyle: TypeofAlertDialogStyle
  /**
  			 * A set of constants for the animation styles used for view transitions.
  			 */
  val AnimationStyle: TypeofAnimationStyleAddEventListener
  /**
  			 * A set of constants for the style that can be used for the `separatorStyle` property of
  			 * <Titanium.UI.ListView>.
  			 */
  val ListViewSeparatorStyle: TypeofListViewSeparatorStyle
  /**
  			 * View presented with the same style as its parent window.
  			 */
  val MODAL_PRESENTATION_CURRENT_CONTEXT: Double
  /**
  			 * Window width and height are smaller than those of the screen and the view is centered on
  			 * the screen.
  			 */
  val MODAL_PRESENTATION_FORMSHEET: Double
  /**
  			 * Window covers the screen.
  			 */
  val MODAL_PRESENTATION_FULLSCREEN: Double
  /**
  			 * Window height is the height of the screen and width is equal to screen width in a portrait
  			 * orientation.
  			 */
  val MODAL_PRESENTATION_PAGESHEET: Double
  /**
  			 * When the window is presented, its view slides up from the bottom of the screen. On dismissal,
  			 * the view slides back down (default.)
  			 */
  val MODAL_TRANSITION_STYLE_COVER_VERTICAL: Double
  /**
  			 * When the window is presented, the current view fades out while the new view fades in at the
  			 * same time. On dismissal, a similar type of cross-fade is used to return to the original view.
  			 */
  val MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: Double
  /**
  			 * When the window is presented, the current view initiates a horizontal 3D flip from
  			 * right-to-left, resulting in the revealing of the new view as if it were on the back of the
  			 * previous view. On dismissal, the flip occurs from left-to-right, returning to the original
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: Double
  /**
  			 * When the window is presented, one corner of the current view curls up to reveal the modal
  			 * view underneath. On dismissal, the curled up page unfurls itself back on top of the modal
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_PARTIAL_CURL: Double
  /**
  			 * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
  			 */
  val ProgressBarStyle: TypeofProgressBarStyle
  /**
  			 * A set of constants for the Animation Styles used for transition on table view rows.
  			 */
  val RowAnimationStyle: TypeofRowAnimationStyle
  /**
  			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
  			 */
  val ScrollIndicatorStyle: TypeofScrollIndicatorStyle
  /**
  			 * A set of constants for creating standard iOS system buttons.
  			 */
  val SystemButton: TypeofSystemButton
  /**
  			 * A set of constants for the system button styles that can be used for the button `style` property.
  			 */
  val SystemButtonStyle: TypeofSystemButtonStyleAddEventListener
  /**
  			 * A set of constants for the system icon styles that can be used on a tab group tab.
  			 */
  val SystemIcon: TypeofSystemIcon
  /**
  			 * A set of constants for the style that can be used for the `selectionStyle` property of
  			 * <Titanium.UI.TableViewRow>.
  			 */
  val TableViewCellSelectionStyle: TypeofTableViewCellSelectionStyle
  /**
  			 * A set of constants for the position value that can be used for the `position` property of
  			 * <Titanium.UI.TableView> when invoking `scrollToIndex`.
  			 */
  val TableViewScrollPosition: TypeofTableViewScrollPosition
  /**
  			 * A set of constants for the style that can be used for the `separatorStyle` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewSeparatorStyle: TypeofTableViewSeparatorStyle
  /**
  			 * A set of constants for the style that can be used for the button `style` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewStyle: TypeofTableViewStyle
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String
  /**
  			 * Value of the badge for the application's springboard icon.
  			 */
  var appBadge: Double
  /**
  			 * Determines whether the shake to edit system-wide capability is enabled.
  			 */
  var appSupportsShakeToEdit: Boolean
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.apiName> property.
  			 */
  def getApiName(): String
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def getAppBadge(): Double
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def getAppSupportsShakeToEdit(): Boolean
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def setAppBadge(appBadge: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def setAppSupportsShakeToEdit(appSupportsShakeToEdit: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofiPhone {
  @scala.inline
  def apply(
    ActivityIndicatorStyle: TypeofActivityIndicatorStyleAddEventListener,
    AlertDialogStyle: TypeofAlertDialogStyle,
    AnimationStyle: TypeofAnimationStyleAddEventListener,
    ListViewSeparatorStyle: TypeofListViewSeparatorStyle,
    MODAL_PRESENTATION_CURRENT_CONTEXT: Double,
    MODAL_PRESENTATION_FORMSHEET: Double,
    MODAL_PRESENTATION_FULLSCREEN: Double,
    MODAL_PRESENTATION_PAGESHEET: Double,
    MODAL_TRANSITION_STYLE_COVER_VERTICAL: Double,
    MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: Double,
    MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: Double,
    MODAL_TRANSITION_STYLE_PARTIAL_CURL: Double,
    ProgressBarStyle: TypeofProgressBarStyle,
    RowAnimationStyle: TypeofRowAnimationStyle,
    ScrollIndicatorStyle: TypeofScrollIndicatorStyle,
    SystemButton: TypeofSystemButton,
    SystemButtonStyle: TypeofSystemButtonStyleAddEventListener,
    SystemIcon: TypeofSystemIcon,
    TableViewCellSelectionStyle: TypeofTableViewCellSelectionStyle,
    TableViewScrollPosition: TypeofTableViewScrollPosition,
    TableViewSeparatorStyle: TypeofTableViewSeparatorStyle,
    TableViewStyle: TypeofTableViewStyle,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    appBadge: Double,
    appSupportsShakeToEdit: Boolean,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getAppBadge: () => Double,
    getAppSupportsShakeToEdit: () => Boolean,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setAppBadge: Double => Unit,
    setAppSupportsShakeToEdit: Boolean => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofiPhone = {
    val __obj = js.Dynamic.literal(ActivityIndicatorStyle = ActivityIndicatorStyle.asInstanceOf[js.Any], AlertDialogStyle = AlertDialogStyle.asInstanceOf[js.Any], AnimationStyle = AnimationStyle.asInstanceOf[js.Any], ListViewSeparatorStyle = ListViewSeparatorStyle.asInstanceOf[js.Any], MODAL_PRESENTATION_CURRENT_CONTEXT = MODAL_PRESENTATION_CURRENT_CONTEXT.asInstanceOf[js.Any], MODAL_PRESENTATION_FORMSHEET = MODAL_PRESENTATION_FORMSHEET.asInstanceOf[js.Any], MODAL_PRESENTATION_FULLSCREEN = MODAL_PRESENTATION_FULLSCREEN.asInstanceOf[js.Any], MODAL_PRESENTATION_PAGESHEET = MODAL_PRESENTATION_PAGESHEET.asInstanceOf[js.Any], MODAL_TRANSITION_STYLE_COVER_VERTICAL = MODAL_TRANSITION_STYLE_COVER_VERTICAL.asInstanceOf[js.Any], MODAL_TRANSITION_STYLE_CROSS_DISSOLVE = MODAL_TRANSITION_STYLE_CROSS_DISSOLVE.asInstanceOf[js.Any], MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL = MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL.asInstanceOf[js.Any], MODAL_TRANSITION_STYLE_PARTIAL_CURL = MODAL_TRANSITION_STYLE_PARTIAL_CURL.asInstanceOf[js.Any], ProgressBarStyle = ProgressBarStyle.asInstanceOf[js.Any], RowAnimationStyle = RowAnimationStyle.asInstanceOf[js.Any], ScrollIndicatorStyle = ScrollIndicatorStyle.asInstanceOf[js.Any], SystemButton = SystemButton.asInstanceOf[js.Any], SystemButtonStyle = SystemButtonStyle.asInstanceOf[js.Any], SystemIcon = SystemIcon.asInstanceOf[js.Any], TableViewCellSelectionStyle = TableViewCellSelectionStyle.asInstanceOf[js.Any], TableViewScrollPosition = TableViewScrollPosition.asInstanceOf[js.Any], TableViewSeparatorStyle = TableViewSeparatorStyle.asInstanceOf[js.Any], TableViewStyle = TableViewStyle.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], appBadge = appBadge.asInstanceOf[js.Any], appSupportsShakeToEdit = appSupportsShakeToEdit.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getAppBadge = js.Any.fromFunction0(getAppBadge), getAppSupportsShakeToEdit = js.Any.fromFunction0(getAppSupportsShakeToEdit), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setAppBadge = js.Any.fromFunction1(setAppBadge), setAppSupportsShakeToEdit = js.Any.fromFunction1(setAppSupportsShakeToEdit), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofiPhone]
  }
}

