package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityMessagingIndicator extends StObject {
  
  def addAction(name: String, onActionInvoked: js.Function): Any
  
  def clearIndicator(name: String): Any
  
  def clearIndicators(): Any
  
  def onPresenceChanged(onPresenceChanged: js.Function): Any
  
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: String
  
  def removeAction(name: String): Any
  
  def removeActions(): Any
  
  def showIndicator(name: String, indicatorProperties: UnityIndicatorProperties): Any
}
object UnityMessagingIndicator {
  
  inline def apply(
    addAction: (String, js.Function) => Any,
    clearIndicator: String => Any,
    clearIndicators: () => Any,
    onPresenceChanged: js.Function => Any,
    presence: String,
    removeAction: String => Any,
    removeActions: () => Any,
    showIndicator: (String, UnityIndicatorProperties) => Any
  ): UnityMessagingIndicator = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearIndicator = js.Any.fromFunction1(clearIndicator), clearIndicators = js.Any.fromFunction0(clearIndicators), onPresenceChanged = js.Any.fromFunction1(onPresenceChanged), presence = presence.asInstanceOf[js.Any], removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), showIndicator = js.Any.fromFunction2(showIndicator))
    __obj.asInstanceOf[UnityMessagingIndicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnityMessagingIndicator] (val x: Self) extends AnyVal {
    
    inline def setAddAction(value: (String, js.Function) => Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    inline def setClearIndicator(value: String => Any): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction1(value))
    
    inline def setClearIndicators(value: () => Any): Self = StObject.set(x, "clearIndicators", js.Any.fromFunction0(value))
    
    inline def setOnPresenceChanged(value: js.Function => Any): Self = StObject.set(x, "onPresenceChanged", js.Any.fromFunction1(value))
    
    inline def setPresence(value: String): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setRemoveAction(value: String => Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    inline def setRemoveActions(value: () => Any): Self = StObject.set(x, "removeActions", js.Any.fromFunction0(value))
    
    inline def setShowIndicator(value: (String, UnityIndicatorProperties) => Any): Self = StObject.set(x, "showIndicator", js.Any.fromFunction2(value))
  }
}
