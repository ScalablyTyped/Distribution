package typings.wordpressNux

import typings.wordpressNux.selectorsMod.GuideInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def disableTips(): Unit = js.native
    
    def dismissTip(id: String): Unit = js.native
    
    def enableTips(): Unit = js.native
    
    def triggerGuide(tipIds: js.Array[String]): Unit = js.native
  }
  object TypeofimportedActions {
    
    @scala.inline
    def apply(
      disableTips: () => Unit,
      dismissTip: String => Unit,
      enableTips: () => Unit,
      triggerGuide: js.Array[String] => Unit
    ): TypeofimportedActions = {
      val __obj = js.Dynamic.literal(disableTips = js.Any.fromFunction0(disableTips), dismissTip = js.Any.fromFunction1(dismissTip), enableTips = js.Any.fromFunction0(enableTips), triggerGuide = js.Any.fromFunction1(triggerGuide))
      __obj.asInstanceOf[TypeofimportedActions]
    }
    
    @scala.inline
    implicit class TypeofimportedActionsMutableBuilder[Self <: TypeofimportedActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableTips(value: () => Unit): Self = StObject.set(x, "disableTips", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDismissTip(value: String => Unit): Self = StObject.set(x, "dismissTip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableTips(value: () => Unit): Self = StObject.set(x, "enableTips", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTriggerGuide(value: js.Array[String] => Unit): Self = StObject.set(x, "triggerGuide", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def areTipsEnabled(): Boolean = js.native
    
    def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo] = js.native
    
    def isTipVisible(tipId: String): Boolean = js.native
  }
  object TypeofimportedSelectors {
    
    @scala.inline
    def apply(
      areTipsEnabled: () => Boolean,
      getAssociatedGuide: String => js.UndefOr[GuideInfo],
      isTipVisible: String => Boolean
    ): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(areTipsEnabled = js.Any.fromFunction0(areTipsEnabled), getAssociatedGuide = js.Any.fromFunction1(getAssociatedGuide), isTipVisible = js.Any.fromFunction1(isTipVisible))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    @scala.inline
    implicit class TypeofimportedSelectorsMutableBuilder[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAreTipsEnabled(value: () => Boolean): Self = StObject.set(x, "areTipsEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAssociatedGuide(value: String => js.UndefOr[GuideInfo]): Self = StObject.set(x, "getAssociatedGuide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsTipVisible(value: String => Boolean): Self = StObject.set(x, "isTipVisible", js.Any.fromFunction1(value))
    }
  }
}
