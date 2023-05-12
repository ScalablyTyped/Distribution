package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMultilingualSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MultilingualSmall", JSImport.Default)
  @js.native
  val default: FC[MultilingualSmallProps] = js.native
  
  trait MultilingualSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MultilingualSmallProps {
    
    inline def apply(): MultilingualSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultilingualSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultilingualSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MultilingualSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMultilingualSmallMod.foo` */
  override def _to: FC[MultilingualSmallProps] = default
}
