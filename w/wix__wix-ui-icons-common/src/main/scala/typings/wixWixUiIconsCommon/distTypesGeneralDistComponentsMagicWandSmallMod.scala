package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMagicWandSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MagicWandSmall", JSImport.Default)
  @js.native
  val default: FC[MagicWandSmallProps] = js.native
  
  trait MagicWandSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MagicWandSmallProps {
    
    inline def apply(): MagicWandSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagicWandSmallProps]
    }
    
    extension [Self <: MagicWandSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MagicWandSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMagicWandSmallMod.foo` */
  override def _to: FC[MagicWandSmallProps] = default
}
