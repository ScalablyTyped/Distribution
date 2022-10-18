package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsMicrosoft365Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Microsoft365", JSImport.Default)
  @js.native
  val default: FC[Microsoft365Props] = js.native
  
  trait Microsoft365Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object Microsoft365Props {
    
    inline def apply(): Microsoft365Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Microsoft365Props]
    }
    
    extension [Self <: Microsoft365Props](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[Microsoft365Props]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsMicrosoft365Mod.foo` */
  override def _to: FC[Microsoft365Props] = default
}
