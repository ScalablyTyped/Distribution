package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSiteMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Site", JSImport.Default)
  @js.native
  val default: FC[SiteProps] = js.native
  
  trait SiteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SiteProps {
    
    inline def apply(): SiteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SiteProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SiteProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSiteMod.foo` */
  override def _to: FC[SiteProps] = default
}
