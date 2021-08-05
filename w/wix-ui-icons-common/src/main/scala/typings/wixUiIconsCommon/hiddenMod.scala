package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Hidden", JSImport.Default)
  @js.native
  val default: SFC[HiddenProps] = js.native
  
  trait HiddenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HiddenProps {
    
    inline def apply(): HiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HiddenProps]
    }
    
    extension [Self <: HiddenProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenMod.foo` */
  override def _to: SFC[HiddenProps] = default
}
