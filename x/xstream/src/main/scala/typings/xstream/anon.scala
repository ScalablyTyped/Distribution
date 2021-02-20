package typings.xstream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ease extends StObject {
    
    def ease(x: Double, from: Double, to: Double): Double = js.native
    @JSName("ease")
    var ease_Original: typings.xstream.tweenMod.Ease = js.native
  }
  
  @js.native
  trait Subscribe extends StObject {
    
    var subscribe: js.Any = js.native
  }
  object Subscribe {
    
    @scala.inline
    def apply(subscribe: js.Any): Subscribe = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribe]
    }
    
    @scala.inline
    implicit class SubscribeMutableBuilder[Self <: Subscribe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: js.Any): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
