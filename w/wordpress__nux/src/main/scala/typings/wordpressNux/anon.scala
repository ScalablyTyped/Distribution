package typings.wordpressNux

import typings.wordpressNux.storeSelectorsMod.GuideInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofimportedActions extends StObject {
    
    def disableTips(): Unit
    
    def dismissTip(id: String): Unit
    
    def enableTips(): Unit
    
    def triggerGuide(tipIds: js.Array[String]): Unit
  }
  object TypeofimportedActions {
    
    inline def apply(
      disableTips: () => Unit,
      dismissTip: String => Unit,
      enableTips: () => Unit,
      triggerGuide: js.Array[String] => Unit
    ): TypeofimportedActions = {
      val __obj = js.Dynamic.literal(disableTips = js.Any.fromFunction0(disableTips), dismissTip = js.Any.fromFunction1(dismissTip), enableTips = js.Any.fromFunction0(enableTips), triggerGuide = js.Any.fromFunction1(triggerGuide))
      __obj.asInstanceOf[TypeofimportedActions]
    }
    
    extension [Self <: TypeofimportedActions](x: Self) {
      
      inline def setDisableTips(value: () => Unit): Self = StObject.set(x, "disableTips", js.Any.fromFunction0(value))
      
      inline def setDismissTip(value: String => Unit): Self = StObject.set(x, "dismissTip", js.Any.fromFunction1(value))
      
      inline def setEnableTips(value: () => Unit): Self = StObject.set(x, "enableTips", js.Any.fromFunction0(value))
      
      inline def setTriggerGuide(value: js.Array[String] => Unit): Self = StObject.set(x, "triggerGuide", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofimportedSelectors extends StObject {
    
    def areTipsEnabled(): Boolean
    
    def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo]
    
    def isTipVisible(tipId: String): Boolean
  }
  object TypeofimportedSelectors {
    
    inline def apply(
      areTipsEnabled: () => Boolean,
      getAssociatedGuide: String => js.UndefOr[GuideInfo],
      isTipVisible: String => Boolean
    ): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(areTipsEnabled = js.Any.fromFunction0(areTipsEnabled), getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    extension [Self <: TypeofimportedSelectors](x: Self) {
      
      inline def setAreTipsEnabled(value: () => Boolean): Self = StObject.set(x, "areTipsEnabled", js.Any.fromFunction0(value))
      
      inline def setGetAssociatedGuide(value: String => js.UndefOr[GuideInfo]): Self = StObject.set(x, "getAssociatedGuide", js.Any.fromFunction1(value))
      
      inline def setIsTipVisible(value: String => Boolean): Self = StObject.set(x, "isTipVisible", js.Any.fromFunction1(value))
    }
  }
}
