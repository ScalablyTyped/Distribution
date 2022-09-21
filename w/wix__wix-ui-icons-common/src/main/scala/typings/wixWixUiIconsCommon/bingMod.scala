package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Bing", JSImport.Default)
  @js.native
  val default: FC[BingProps] = js.native
  
  trait BingProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BingProps {
    
    inline def apply(): BingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BingProps]
    }
    
    extension [Self <: BingProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BingProps]
  
  /* This means you don't have to write `default`, but can instead just say `bingMod.foo` */
  override def _to: FC[BingProps] = default
}
