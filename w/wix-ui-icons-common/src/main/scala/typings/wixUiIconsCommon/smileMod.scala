package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smileMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Smile", JSImport.Default)
  @js.native
  val default: SFC[SmileProps] = js.native
  
  trait SmileProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SmileProps {
    
    inline def apply(): SmileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmileProps]
    }
    
    extension [Self <: SmileProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SmileProps]
  
  /* This means you don't have to write `default`, but can instead just say `smileMod.foo` */
  override def _to: SFC[SmileProps] = default
}
