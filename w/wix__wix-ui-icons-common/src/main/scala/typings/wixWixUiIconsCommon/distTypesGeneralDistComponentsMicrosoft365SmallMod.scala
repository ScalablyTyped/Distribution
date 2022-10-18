package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMicrosoft365SmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Microsoft365Small", JSImport.Default)
  @js.native
  val default: FC[Microsoft365SmallProps] = js.native
  
  trait Microsoft365SmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object Microsoft365SmallProps {
    
    inline def apply(): Microsoft365SmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Microsoft365SmallProps]
    }
    
    extension [Self <: Microsoft365SmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[Microsoft365SmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMicrosoft365SmallMod.foo` */
  override def _to: FC[Microsoft365SmallProps] = default
}
