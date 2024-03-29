package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsBonusGiftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BonusGift", JSImport.Default)
  @js.native
  val default: FC[BonusGiftProps] = js.native
  
  trait BonusGiftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BonusGiftProps {
    
    inline def apply(): BonusGiftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BonusGiftProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BonusGiftProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BonusGiftProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsBonusGiftMod.foo` */
  override def _to: FC[BonusGiftProps] = default
}
