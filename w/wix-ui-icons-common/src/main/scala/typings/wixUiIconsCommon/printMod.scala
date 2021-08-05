package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Print", JSImport.Default)
  @js.native
  val default: SFC[PrintProps] = js.native
  
  trait PrintProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PrintProps {
    
    inline def apply(): PrintProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintProps]
    }
    
    extension [Self <: PrintProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PrintProps]
  
  /* This means you don't have to write `default`, but can instead just say `printMod.foo` */
  override def _to: SFC[PrintProps] = default
}
