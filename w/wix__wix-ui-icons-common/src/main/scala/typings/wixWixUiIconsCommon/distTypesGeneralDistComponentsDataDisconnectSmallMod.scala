package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDataDisconnectSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DataDisconnectSmall", JSImport.Default)
  @js.native
  val default: FC[DataDisconnectSmallProps] = js.native
  
  trait DataDisconnectSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataDisconnectSmallProps {
    
    inline def apply(): DataDisconnectSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataDisconnectSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataDisconnectSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataDisconnectSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDataDisconnectSmallMod.foo` */
  override def _to: FC[DataDisconnectSmallProps] = default
}
