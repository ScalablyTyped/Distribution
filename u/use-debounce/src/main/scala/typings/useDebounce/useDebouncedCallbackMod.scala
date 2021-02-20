package typings.useDebounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDebouncedCallbackMod {
  
  @JSImport("use-debounce/lib/useDebouncedCallback", JSImport.Default)
  @js.native
  def default[T /* <: js.Array[_] */](func: js.Function1[/* args */ T, _], wait: Double): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
  @JSImport("use-debounce/lib/useDebouncedCallback", JSImport.Default)
  @js.native
  def default[T /* <: js.Array[_] */](func: js.Function1[/* args */ T, _], wait: Double, options: Options): js.Tuple3[js.Function1[/* args */ T, Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var maxWait: js.UndefOr[Double] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
