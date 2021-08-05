package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FilterSmall", JSImport.Default)
  @js.native
  val default: SFC[FilterSmallProps] = js.native
  
  trait FilterSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FilterSmallProps {
    
    inline def apply(): FilterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSmallProps]
    }
    
    extension [Self <: FilterSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FilterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `filterSmallMod.foo` */
  override def _to: SFC[FilterSmallProps] = default
}
