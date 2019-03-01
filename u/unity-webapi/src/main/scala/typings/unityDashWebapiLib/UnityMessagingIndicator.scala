package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityMessagingIndicator extends js.Object {
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: java.lang.String
  def addAction(name: java.lang.String, onActionInvoked: js.Function): js.Any
  def clearIndicator(name: java.lang.String): js.Any
  def clearIndicators(): js.Any
  def onPresenceChanged(onPresenceChanged: js.Function): js.Any
  def removeAction(name: java.lang.String): js.Any
  def removeActions(): js.Any
  def showIndicator(name: java.lang.String, indicatorProperties: UnityIndicatorProperties): js.Any
}

object UnityMessagingIndicator {
  @scala.inline
  def apply(
    addAction: js.Function2[java.lang.String, js.Function, js.Any],
    clearIndicator: js.Function1[java.lang.String, js.Any],
    clearIndicators: js.Function0[js.Any],
    onPresenceChanged: js.Function1[js.Function, js.Any],
    presence: java.lang.String,
    removeAction: js.Function1[java.lang.String, js.Any],
    removeActions: js.Function0[js.Any],
    showIndicator: js.Function2[java.lang.String, UnityIndicatorProperties, js.Any]
  ): UnityMessagingIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAction")(addAction)
    __obj.updateDynamic("clearIndicator")(clearIndicator)
    __obj.updateDynamic("clearIndicators")(clearIndicators)
    __obj.updateDynamic("onPresenceChanged")(onPresenceChanged)
    __obj.updateDynamic("presence")(presence)
    __obj.updateDynamic("removeAction")(removeAction)
    __obj.updateDynamic("removeActions")(removeActions)
    __obj.updateDynamic("showIndicator")(showIndicator)
    __obj.asInstanceOf[UnityMessagingIndicator]
  }
}

