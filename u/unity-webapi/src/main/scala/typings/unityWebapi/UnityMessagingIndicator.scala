package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityMessagingIndicator extends StObject {
  
  def addAction(name: String, onActionInvoked: js.Function): js.Any
  
  def clearIndicator(name: String): js.Any
  
  def clearIndicators(): js.Any
  
  def onPresenceChanged(onPresenceChanged: js.Function): js.Any
  
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: String
  
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
  
  @scala.inline
  implicit class UnityMessagingIndicatorMutableBuilder[Self <: UnityMessagingIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAction(value: (String, js.Function) => js.Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClearIndicator(value: String => js.Any): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearIndicators(value: () => js.Any): Self = StObject.set(x, "clearIndicators", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPresenceChanged(value: js.Function => js.Any): Self = StObject.set(x, "onPresenceChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPresence(value: String): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAction(value: String => js.Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActions(value: () => js.Any): Self = StObject.set(x, "removeActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowIndicator(value: (String, UnityIndicatorProperties) => js.Any): Self = StObject.set(x, "showIndicator", js.Any.fromFunction2(value))
  }
}
