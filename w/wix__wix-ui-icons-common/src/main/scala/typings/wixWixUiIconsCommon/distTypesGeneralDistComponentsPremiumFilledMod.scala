package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPremiumFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PremiumFilled", JSImport.Default)
  @js.native
  val default: FC[PremiumFilledProps] = js.native
  
  trait PremiumFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PremiumFilledProps {
    
    inline def apply(): PremiumFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PremiumFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PremiumFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PremiumFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPremiumFilledMod.foo` */
  override def _to: FC[PremiumFilledProps] = default
}
