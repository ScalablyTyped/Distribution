package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActivityIndicatorStyle extends js.Object {
  /**
  			 * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
  			 */
  val ActivityIndicatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBIG
  /**
  			 * A set of constants for the style that can be used for the `style` property of
  			 * <Titanium.UI.AlertDialog>.
  			 */
  val AlertDialogStyleNs: Anon_AddEventListenerApiNameApplyProperties
  /**
  			 * A set of constants for the animation styles used for view transitions.
  			 */
  val AnimationStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCURLDOWN
  /**
  			 * A set of constants for the style that can be used for the `separatorStyle` property of
  			 * <Titanium.UI.ListView>.
  			 */
  val ListViewSeparatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEvent
  /**
  			 * View presented with the same style as its parent window.
  			 */
  val MODAL_PRESENTATION_CURRENT_CONTEXT: scala.Double
  /**
  			 * Window width and height are smaller than those of the screen and the view is centered on
  			 * the screen.
  			 */
  val MODAL_PRESENTATION_FORMSHEET: scala.Double
  /**
  			 * Window covers the screen.
  			 */
  val MODAL_PRESENTATION_FULLSCREEN: scala.Double
  /**
  			 * Window height is the height of the screen and width is equal to screen width in a portrait
  			 * orientation.
  			 */
  val MODAL_PRESENTATION_PAGESHEET: scala.Double
  /**
  			 * When the window is presented, its view slides up from the bottom of the screen. On dismissal,
  			 * the view slides back down (default.)
  			 */
  val MODAL_TRANSITION_STYLE_COVER_VERTICAL: scala.Double
  /**
  			 * When the window is presented, the current view fades out while the new view fades in at the
  			 * same time. On dismissal, a similar type of cross-fade is used to return to the original view.
  			 */
  val MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: scala.Double
  /**
  			 * When the window is presented, the current view initiates a horizontal 3D flip from
  			 * right-to-left, resulting in the revealing of the new view as if it were on the back of the
  			 * previous view. On dismissal, the flip occurs from left-to-right, returning to the original
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: scala.Double
  /**
  			 * When the window is presented, one corner of the current view curls up to reveal the modal
  			 * view underneath. On dismissal, the curled up page unfurls itself back on top of the modal
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_PARTIAL_CURL: scala.Double
  /**
  			 * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
  			 */
  val ProgressBarStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBAR
  /**
  			 * A set of constants for the Animation Styles used for transition on table view rows.
  			 */
  val RowAnimationStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBOTTOM
  /**
  			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
  			 */
  val ScrollIndicatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBLACK
  /**
  			 * A set of constants for creating standard iOS system buttons.
  			 */
  val SystemButtonNs: Anon_ACTION
  /**
  			 * A set of constants for the system button styles that can be used for the button `style` property.
  			 */
  val SystemButtonStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBARBORDERED
  /**
  			 * A set of constants for the system icon styles that can be used on a tab group tab.
  			 */
  val SystemIconNs: Anon_AddEventListenerApiNameApplyPropertiesBOOKMARKS
  /**
  			 * A set of constants for the style that can be used for the `selectionStyle` property of
  			 * <Titanium.UI.TableViewRow>.
  			 */
  val TableViewCellSelectionStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBLUE
  /**
  			 * A set of constants for the position value that can be used for the `position` property of
  			 * <Titanium.UI.TableView> when invoking `scrollToIndex`.
  			 */
  val TableViewScrollPositionNs: Anon_AddEventListenerApiNameApplyPropertiesBOTTOMBubbleParent
  /**
  			 * A set of constants for the style that can be used for the `separatorStyle` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewSeparatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEvent
  /**
  			 * A set of constants for the style that can be used for the button `style` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallback
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String
  /**
  			 * Value of the badge for the application's springboard icon.
  			 */
  var appBadge: scala.Double
  /**
  			 * Determines whether the shake to edit system-wide capability is enabled.
  			 */
  var appSupportsShakeToEdit: scala.Boolean
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.apiName> property.
  			 */
  def getApiName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def getAppBadge(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def getAppSupportsShakeToEdit(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def setAppBadge(appBadge: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def setAppSupportsShakeToEdit(appSupportsShakeToEdit: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_ActivityIndicatorStyle {
  @scala.inline
  def apply(
    ActivityIndicatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBIG,
    AlertDialogStyleNs: Anon_AddEventListenerApiNameApplyProperties,
    AnimationStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCURLDOWN,
    ListViewSeparatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEvent,
    MODAL_PRESENTATION_CURRENT_CONTEXT: scala.Double,
    MODAL_PRESENTATION_FORMSHEET: scala.Double,
    MODAL_PRESENTATION_FULLSCREEN: scala.Double,
    MODAL_PRESENTATION_PAGESHEET: scala.Double,
    MODAL_TRANSITION_STYLE_COVER_VERTICAL: scala.Double,
    MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: scala.Double,
    MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: scala.Double,
    MODAL_TRANSITION_STYLE_PARTIAL_CURL: scala.Double,
    ProgressBarStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBAR,
    RowAnimationStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBOTTOM,
    ScrollIndicatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBLACK,
    SystemButtonNs: Anon_ACTION,
    SystemButtonStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBARBORDERED,
    SystemIconNs: Anon_AddEventListenerApiNameApplyPropertiesBOOKMARKS,
    TableViewCellSelectionStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBLUE,
    TableViewScrollPositionNs: Anon_AddEventListenerApiNameApplyPropertiesBOTTOMBubbleParent,
    TableViewSeparatorStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallbackEvent,
    TableViewStyleNs: Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCallback,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    appBadge: scala.Double,
    appSupportsShakeToEdit: scala.Boolean,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getAppBadge: js.Function0[scala.Double],
    getAppSupportsShakeToEdit: js.Function0[scala.Boolean],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setAppBadge: js.Function1[scala.Double, scala.Unit],
    setAppSupportsShakeToEdit: js.Function1[scala.Boolean, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_ActivityIndicatorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActivityIndicatorStyleNs")(ActivityIndicatorStyleNs)
    __obj.updateDynamic("AlertDialogStyleNs")(AlertDialogStyleNs)
    __obj.updateDynamic("AnimationStyleNs")(AnimationStyleNs)
    __obj.updateDynamic("ListViewSeparatorStyleNs")(ListViewSeparatorStyleNs)
    __obj.updateDynamic("MODAL_PRESENTATION_CURRENT_CONTEXT")(MODAL_PRESENTATION_CURRENT_CONTEXT)
    __obj.updateDynamic("MODAL_PRESENTATION_FORMSHEET")(MODAL_PRESENTATION_FORMSHEET)
    __obj.updateDynamic("MODAL_PRESENTATION_FULLSCREEN")(MODAL_PRESENTATION_FULLSCREEN)
    __obj.updateDynamic("MODAL_PRESENTATION_PAGESHEET")(MODAL_PRESENTATION_PAGESHEET)
    __obj.updateDynamic("MODAL_TRANSITION_STYLE_COVER_VERTICAL")(MODAL_TRANSITION_STYLE_COVER_VERTICAL)
    __obj.updateDynamic("MODAL_TRANSITION_STYLE_CROSS_DISSOLVE")(MODAL_TRANSITION_STYLE_CROSS_DISSOLVE)
    __obj.updateDynamic("MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL")(MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL)
    __obj.updateDynamic("MODAL_TRANSITION_STYLE_PARTIAL_CURL")(MODAL_TRANSITION_STYLE_PARTIAL_CURL)
    __obj.updateDynamic("ProgressBarStyleNs")(ProgressBarStyleNs)
    __obj.updateDynamic("RowAnimationStyleNs")(RowAnimationStyleNs)
    __obj.updateDynamic("ScrollIndicatorStyleNs")(ScrollIndicatorStyleNs)
    __obj.updateDynamic("SystemButtonNs")(SystemButtonNs)
    __obj.updateDynamic("SystemButtonStyleNs")(SystemButtonStyleNs)
    __obj.updateDynamic("SystemIconNs")(SystemIconNs)
    __obj.updateDynamic("TableViewCellSelectionStyleNs")(TableViewCellSelectionStyleNs)
    __obj.updateDynamic("TableViewScrollPositionNs")(TableViewScrollPositionNs)
    __obj.updateDynamic("TableViewSeparatorStyleNs")(TableViewSeparatorStyleNs)
    __obj.updateDynamic("TableViewStyleNs")(TableViewStyleNs)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("appBadge")(appBadge)
    __obj.updateDynamic("appSupportsShakeToEdit")(appSupportsShakeToEdit)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getAppBadge")(getAppBadge)
    __obj.updateDynamic("getAppSupportsShakeToEdit")(getAppSupportsShakeToEdit)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setAppBadge")(setAppBadge)
    __obj.updateDynamic("setAppSupportsShakeToEdit")(setAppSupportsShakeToEdit)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.asInstanceOf[Anon_ActivityIndicatorStyle]
  }
}

