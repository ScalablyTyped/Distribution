package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFocusReturnMod {
  
  // prettier-ignore
  @JSImport("@wordpress/components/higher-order/with-focus-return", JSImport.Default)
  @js.native
  def default(options: WFROptions): js.Function1[/* wrapped */ ComponentType[_], ComponentType[_]] = js.native
  // prettier-ignore
  @JSImport("@wordpress/components/higher-order/with-focus-return", JSImport.Default)
  @js.native
  def default[T /* <: ComponentType[_] */](wrapped: T): ComponentType[_] = js.native
  
  @JSImport("@wordpress/components/higher-order/with-focus-return", "Provider")
  @js.native
  val Provider: ComponentType[js.Object] = js.native
  
  @js.native
  trait WFROptions extends StObject {
    
    var onFocusReturn: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  }
  object WFROptions {
    
    @scala.inline
    def apply(): WFROptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WFROptions]
    }
    
    @scala.inline
    implicit class WFROptionsMutableBuilder[Self <: WFROptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFocusReturn(value: () => Boolean | Unit): Self = StObject.set(x, "onFocusReturn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusReturnUndefined: Self = StObject.set(x, "onFocusReturn", js.undefined)
    }
  }
}
