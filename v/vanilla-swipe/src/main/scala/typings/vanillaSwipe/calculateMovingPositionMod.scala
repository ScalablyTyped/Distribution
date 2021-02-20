package typings.vanillaSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaSwipe.anon.ClientX
import typings.vanillaSwipe.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateMovingPositionMod {
  
  @JSImport("vanilla-swipe/lib/utils/calculateMovingPosition", "calculateMovingPosition")
  @js.native
  def calculateMovingPosition[T /* <: E */](e: T): X = js.native
  @JSImport("vanilla-swipe/lib/utils/calculateMovingPosition", "calculateMovingPosition")
  @js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = js.native
  @JSImport("vanilla-swipe/lib/utils/calculateMovingPosition", "calculateMovingPosition")
  @js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = js.native
  
  @js.native
  trait E extends StObject {
    
    var changedTouches: js.UndefOr[js.Array[ClientX]] = js.native
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var preventDefault: js.UndefOr[js.Function] = js.native
  }
  object E {
    
    @scala.inline
    def apply(clientX: Double, clientY: Double): E = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    @scala.inline
    implicit class EMutableBuilder[Self <: E] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedTouches(value: js.Array[ClientX]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
      
      @scala.inline
      def setChangedTouchesVarargs(value: ClientX*): Self = StObject.set(x, "changedTouches", js.Array(value :_*))
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    }
  }
}
