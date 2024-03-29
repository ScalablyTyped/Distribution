package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSiteSearchSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SiteSearchSmall", JSImport.Default)
  @js.native
  val default: FC[SiteSearchSmallProps] = js.native
  
  trait SiteSearchSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SiteSearchSmallProps {
    
    inline def apply(): SiteSearchSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteSearchSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SiteSearchSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SiteSearchSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSiteSearchSmallMod.foo` */
  override def _to: FC[SiteSearchSmallProps] = default
}
