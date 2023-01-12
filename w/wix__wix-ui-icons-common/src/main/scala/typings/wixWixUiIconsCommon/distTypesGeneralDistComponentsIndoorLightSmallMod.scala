package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsIndoorLightSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/IndoorLightSmall", JSImport.Default)
  @js.native
  val default: FC[IndoorLightSmallProps] = js.native
  
  trait IndoorLightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IndoorLightSmallProps {
    
    inline def apply(): IndoorLightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndoorLightSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndoorLightSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IndoorLightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsIndoorLightSmallMod.foo` */
  override def _to: FC[IndoorLightSmallProps] = default
}
