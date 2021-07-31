package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object giftSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/GiftSmall", JSImport.Default)
  @js.native
  val default: SFC[GiftSmallProps] = js.native
  
  trait GiftSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object GiftSmallProps {
    
    @scala.inline
    def apply(): GiftSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GiftSmallProps]
    }
    
    @scala.inline
    implicit class GiftSmallPropsMutableBuilder[Self <: GiftSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[GiftSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `giftSmallMod.foo` */
  override def _to: SFC[GiftSmallProps] = default
}
