package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storesSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/StoresSmall", JSImport.Default)
  @js.native
  val default: FC[StoresSmallProps] = js.native
  
  trait StoresSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StoresSmallProps {
    
    inline def apply(): StoresSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoresSmallProps]
    }
    
    extension [Self <: StoresSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StoresSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `storesSmallMod.foo` */
  override def _to: FC[StoresSmallProps] = default
}
