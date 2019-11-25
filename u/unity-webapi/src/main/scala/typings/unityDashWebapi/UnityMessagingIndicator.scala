package typings.unityDashWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityMessagingIndicator extends js.Object {
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: String
  def addAction(name: String, onActionInvoked: js.Function): js.Any
  def clearIndicator(name: String): js.Any
  def clearIndicators(): js.Any
  def onPresenceChanged(onPresenceChanged: js.Function): js.Any
  def removeAction(name: String): js.Any
  def removeActions(): js.Any
  def showIndicator(name: String, indicatorProperties: UnityIndicatorProperties): js.Any
}

object UnityMessagingIndicator {
  @scala.inline
  def apply(
    addAction: (String, js.Function) => js.Any,
    clearIndicator: String => js.Any,
    clearIndicators: () => js.Any,
    onPresenceChanged: js.Function => js.Any,
    presence: String,
    removeAction: String => js.Any,
    removeActions: () => js.Any,
    showIndicator: (String, UnityIndicatorProperties) => js.Any
  ): UnityMessagingIndicator = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearIndicator = js.Any.fromFunction1(clearIndicator), clearIndicators = js.Any.fromFunction0(clearIndicators), onPresenceChanged = js.Any.fromFunction1(onPresenceChanged), presence = presence.asInstanceOf[js.Any], removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), showIndicator = js.Any.fromFunction2(showIndicator))
  
    __obj.asInstanceOf[UnityMessagingIndicator]
  }
}

