package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFlagFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FlagFilledSmall", JSImport.Default)
  @js.native
  val default: FC[FlagFilledSmallProps] = js.native
  
  trait FlagFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagFilledSmallProps {
    
    inline def apply(): FlagFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagFilledSmallProps]
    }
    
    extension [Self <: FlagFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFlagFilledSmallMod.foo` */
  override def _to: FC[FlagFilledSmallProps] = default
}
