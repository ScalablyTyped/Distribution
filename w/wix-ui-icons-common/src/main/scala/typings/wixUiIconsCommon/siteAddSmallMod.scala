package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteAddSmall", JSImport.Default)
  @js.native
  val default: FC[SiteAddSmallProps] = js.native
  
  trait SiteAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SiteAddSmallProps {
    
    inline def apply(): SiteAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteAddSmallProps]
    }
    
    extension [Self <: SiteAddSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SiteAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteAddSmallMod.foo` */
  override def _to: FC[SiteAddSmallProps] = default
}
