package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/GiftSmall", JSImport.Default)
  @js.native
  val default: FC[GiftSmallProps] = js.native
  
  trait GiftSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GiftSmallProps {
    
    inline def apply(): GiftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GiftSmallProps]
    }
    
    extension [Self <: GiftSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GiftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `giftSmallMod.foo` */
  override def _to: FC[GiftSmallProps] = default
}
