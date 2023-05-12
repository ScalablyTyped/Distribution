package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFreezeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FreezeSmall", JSImport.Default)
  @js.native
  val default: FC[FreezeSmallProps] = js.native
  
  trait FreezeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FreezeSmallProps {
    
    inline def apply(): FreezeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FreezeSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FreezeSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FreezeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFreezeSmallMod.foo` */
  override def _to: FC[FreezeSmallProps] = default
}
