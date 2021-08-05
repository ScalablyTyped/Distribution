package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Globe", JSImport.Default)
  @js.native
  val default: SFC[GlobeProps] = js.native
  
  trait GlobeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object GlobeProps {
    
    inline def apply(): GlobeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobeProps]
    }
    
    extension [Self <: GlobeProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[GlobeProps]
  
  /* This means you don't have to write `default`, but can instead just say `globeMod.foo` */
  override def _to: SFC[GlobeProps] = default
}
