package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonusGiftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BonusGift", JSImport.Default)
  @js.native
  val default: SFC[BonusGiftProps] = js.native
  
  trait BonusGiftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BonusGiftProps {
    
    inline def apply(): BonusGiftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BonusGiftProps]
    }
    
    extension [Self <: BonusGiftProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BonusGiftProps]
  
  /* This means you don't have to write `default`, but can instead just say `bonusGiftMod.foo` */
  override def _to: SFC[BonusGiftProps] = default
}
