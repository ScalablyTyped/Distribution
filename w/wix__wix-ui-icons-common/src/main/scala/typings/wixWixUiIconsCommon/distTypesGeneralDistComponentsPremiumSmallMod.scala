package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPremiumSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PremiumSmall", JSImport.Default)
  @js.native
  val default: FC[PremiumSmallProps] = js.native
  
  trait PremiumSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PremiumSmallProps {
    
    inline def apply(): PremiumSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PremiumSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PremiumSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PremiumSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPremiumSmallMod.foo` */
  override def _to: FC[PremiumSmallProps] = default
}
