package typings.wordpressNux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/nux/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def areTipsEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTipsEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssociatedGuide")(tipId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[GuideInfo]]
  
  @scala.inline
  def isTipVisible(tipId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTipVisible")(tipId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait GuideInfo extends StObject {
    
    /**
      * The guide's currently showing tip.
      */
    var currentTipId: js.UndefOr[String] = js.undefined
    
    /**
      * The guide's next tip to show.
      */
    var nextTipId: js.UndefOr[String] = js.undefined
    
    /**
      * Which tips the guide contains.
      */
    var tipIds: js.Array[String]
  }
  object GuideInfo {
    
    @scala.inline
    def apply(tipIds: js.Array[String]): GuideInfo = {
      val __obj = js.Dynamic.literal(tipIds = tipIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GuideInfo]
    }
    
    @scala.inline
    implicit class GuideInfoMutableBuilder[Self <: GuideInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTipId(value: String): Self = StObject.set(x, "currentTipId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTipIdUndefined: Self = StObject.set(x, "currentTipId", js.undefined)
      
      @scala.inline
      def setNextTipId(value: String): Self = StObject.set(x, "nextTipId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTipIdUndefined: Self = StObject.set(x, "nextTipId", js.undefined)
      
      @scala.inline
      def setTipIds(value: js.Array[String]): Self = StObject.set(x, "tipIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipIdsVarargs(value: String*): Self = StObject.set(x, "tipIds", js.Array(value :_*))
    }
  }
}
