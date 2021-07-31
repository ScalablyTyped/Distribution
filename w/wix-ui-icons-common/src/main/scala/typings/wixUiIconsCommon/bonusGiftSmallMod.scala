package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonusGiftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BonusGiftSmall", JSImport.Default)
  @js.native
  val default: SFC[BonusGiftSmallProps] = js.native
  
  trait BonusGiftSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BonusGiftSmallProps {
    
    @scala.inline
    def apply(): BonusGiftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BonusGiftSmallProps]
    }
    
    @scala.inline
    implicit class BonusGiftSmallPropsMutableBuilder[Self <: BonusGiftSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BonusGiftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `bonusGiftSmallMod.foo` */
  override def _to: SFC[BonusGiftSmallProps] = default
}
