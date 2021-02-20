package typings.uiBox

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitPropsMod {
  
  @JSImport("ui-box/dist/src/utils/split-props", JSImport.Default)
  @js.native
  def default[P /* <: Dictionary[_] */, K /* <: /* keyof P */ String */](props: P, keys: js.Array[K]): SplitProps[P, K] = js.native
  
  type Dictionary[T] = StringDictionary[T]
  
  type Omit[T /* <: Dictionary[_] */, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait SplitProps[P, K /* <: /* keyof P */ String */] extends StObject {
    
    var matchedProps: Pick[P, K] = js.native
    
    var remainingProps: Omit[P, K] = js.native
  }
  object SplitProps {
    
    @scala.inline
    def apply[P, K /* <: /* keyof P */ String */](matchedProps: Pick[P, K], remainingProps: Omit[P, K]): SplitProps[P, K] = {
      val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitProps[P, K]]
    }
    
    @scala.inline
    implicit class SplitPropsMutableBuilder[Self <: SplitProps[_, _], P, K /* <: /* keyof P */ String */] (val x: Self with (SplitProps[P, K])) extends AnyVal {
      
      @scala.inline
      def setMatchedProps(value: Pick[P, K]): Self = StObject.set(x, "matchedProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingProps(value: Omit[P, K]): Self = StObject.set(x, "remainingProps", value.asInstanceOf[js.Any])
    }
  }
}
