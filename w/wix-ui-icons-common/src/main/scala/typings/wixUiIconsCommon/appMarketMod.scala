package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMarketMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AppMarket", JSImport.Default)
  @js.native
  val default: SFC[AppMarketProps] = js.native
  
  trait AppMarketProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AppMarketProps {
    
    @scala.inline
    def apply(): AppMarketProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppMarketProps]
    }
    
    @scala.inline
    implicit class AppMarketPropsMutableBuilder[Self <: AppMarketProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AppMarketProps]
  
  /* This means you don't have to write `default`, but can instead just say `appMarketMod.foo` */
  override def _to: SFC[AppMarketProps] = default
}
