package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsStarFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/StarFilled", JSImport.Default)
  @js.native
  val default: FC[StarFilledProps] = js.native
  
  trait StarFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StarFilledProps {
    
    inline def apply(): StarFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarFilledProps]
    }
    
    extension [Self <: StarFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StarFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsStarFilledMod.foo` */
  override def _to: FC[StarFilledProps] = default
}
