package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnityMessagingIndicator extends js.Object {
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: String = js.native
  def addAction(name: String, onActionInvoked: js.Function): js.Any = js.native
  def clearIndicator(name: String): js.Any = js.native
  def clearIndicators(): js.Any = js.native
  def onPresenceChanged(onPresenceChanged: js.Function): js.Any = js.native
  def removeAction(name: String): js.Any = js.native
  def removeActions(): js.Any = js.native
  def showIndicator(name: String, indicatorProperties: UnityIndicatorProperties): js.Any = js.native
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
  @scala.inline
  implicit class UnityMessagingIndicatorOps[Self <: UnityMessagingIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddAction(value: (String, js.Function) => js.Any): Self = this.set("addAction", js.Any.fromFunction2(value))
    @scala.inline
    def setClearIndicator(value: String => js.Any): Self = this.set("clearIndicator", js.Any.fromFunction1(value))
    @scala.inline
    def setClearIndicators(value: () => js.Any): Self = this.set("clearIndicators", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPresenceChanged(value: js.Function => js.Any): Self = this.set("onPresenceChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setPresence(value: String): Self = this.set("presence", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAction(value: String => js.Any): Self = this.set("removeAction", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveActions(value: () => js.Any): Self = this.set("removeActions", js.Any.fromFunction0(value))
    @scala.inline
    def setShowIndicator(value: (String, UnityIndicatorProperties) => js.Any): Self = this.set("showIndicator", js.Any.fromFunction2(value))
  }
  
}

