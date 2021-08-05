package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Bing", JSImport.Default)
  @js.native
  val default: SFC[BingProps] = js.native
  
  trait BingProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BingProps {
    
    inline def apply(): BingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BingProps]
    }
    
    extension [Self <: BingProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BingProps]
  
  /* This means you don't have to write `default`, but can instead just say `bingMod.foo` */
  override def _to: SFC[BingProps] = default
}
