package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Add", JSImport.Default)
  @js.native
  val default: SFC[AddProps] = js.native
  
  trait AddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AddProps {
    
    inline def apply(): AddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddProps]
    }
    
    extension [Self <: AddProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AddProps]
  
  /* This means you don't have to write `default`, but can instead just say `addMod.foo` */
  override def _to: SFC[AddProps] = default
}
