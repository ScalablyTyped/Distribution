package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSiteMoveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteMove", JSImport.Default)
  @js.native
  val default: FC[SiteMoveProps] = js.native
  
  trait SiteMoveProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SiteMoveProps {
    
    inline def apply(): SiteMoveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteMoveProps]
    }
    
    extension [Self <: SiteMoveProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SiteMoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSiteMoveMod.foo` */
  override def _to: FC[SiteMoveProps] = default
}
