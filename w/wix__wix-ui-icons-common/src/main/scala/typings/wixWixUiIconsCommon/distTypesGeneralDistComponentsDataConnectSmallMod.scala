package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDataConnectSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DataConnectSmall", JSImport.Default)
  @js.native
  val default: FC[DataConnectSmallProps] = js.native
  
  trait DataConnectSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataConnectSmallProps {
    
    inline def apply(): DataConnectSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataConnectSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataConnectSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataConnectSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDataConnectSmallMod.foo` */
  override def _to: FC[DataConnectSmallProps] = default
}
