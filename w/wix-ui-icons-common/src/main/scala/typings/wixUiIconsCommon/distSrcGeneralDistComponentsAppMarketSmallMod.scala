package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsAppMarketSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AppMarketSmall", JSImport.Default)
  @js.native
  val default: FC[AppMarketSmallProps] = js.native
  
  trait AppMarketSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AppMarketSmallProps {
    
    inline def apply(): AppMarketSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppMarketSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppMarketSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AppMarketSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsAppMarketSmallMod.foo` */
  override def _to: FC[AppMarketSmallProps] = default
}
