package typings.uiBox

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSplitPropsMod {
  
  @JSImport("ui-box/dist/src/utils/split-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: Dictionary[Any] */, K /* <: /* keyof P */ String */](props: P, keys: js.Array[K]): SplitProps[P, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[SplitProps[P, K]]
  
  type Dictionary[T] = StringDictionary[T]
  
  type Omit[T /* <: Dictionary[Any] */, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait SplitProps[P, K /* <: /* keyof P */ String */] extends StObject {
    
    var matchedProps: Pick[P, K]
    
    var remainingProps: Omit[P, K]
  }
  object SplitProps {
    
    inline def apply[P, K /* <: /* keyof P */ String */](matchedProps: Pick[P, K], remainingProps: Omit[P, K]): SplitProps[P, K] = {
      val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitProps[P, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitProps[?, ?], P, K /* <: /* keyof P */ String */] (val x: Self & (SplitProps[P, K])) extends AnyVal {
      
      inline def setMatchedProps(value: Pick[P, K]): Self = StObject.set(x, "matchedProps", value.asInstanceOf[js.Any])
      
      inline def setRemainingProps(value: Omit[P, K]): Self = StObject.set(x, "remainingProps", value.asInstanceOf[js.Any])
    }
  }
}
