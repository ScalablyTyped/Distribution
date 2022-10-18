package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFaxMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Fax", JSImport.Default)
  @js.native
  val default: FC[FaxProps] = js.native
  
  trait FaxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FaxProps {
    
    inline def apply(): FaxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaxProps]
    }
    
    extension [Self <: FaxProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FaxProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFaxMod.foo` */
  override def _to: FC[FaxProps] = default
}
