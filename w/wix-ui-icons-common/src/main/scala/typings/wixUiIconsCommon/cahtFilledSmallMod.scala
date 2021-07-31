package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cahtFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CahtFilledSmall", JSImport.Default)
  @js.native
  val default: SFC[CahtFilledSmallProps] = js.native
  
  trait CahtFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CahtFilledSmallProps {
    
    @scala.inline
    def apply(): CahtFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CahtFilledSmallProps]
    }
    
    @scala.inline
    implicit class CahtFilledSmallPropsMutableBuilder[Self <: CahtFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CahtFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cahtFilledSmallMod.foo` */
  override def _to: SFC[CahtFilledSmallProps] = default
}
