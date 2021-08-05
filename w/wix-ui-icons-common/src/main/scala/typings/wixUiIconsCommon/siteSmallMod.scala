package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteSmall", JSImport.Default)
  @js.native
  val default: SFC[SiteSmallProps] = js.native
  
  trait SiteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SiteSmallProps {
    
    inline def apply(): SiteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteSmallProps]
    }
    
    extension [Self <: SiteSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SiteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteSmallMod.foo` */
  override def _to: SFC[SiteSmallProps] = default
}
