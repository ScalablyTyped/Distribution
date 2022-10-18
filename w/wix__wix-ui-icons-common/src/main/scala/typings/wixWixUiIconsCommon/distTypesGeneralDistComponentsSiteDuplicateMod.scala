package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSiteDuplicateMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SiteDuplicate", JSImport.Default)
  @js.native
  val default: FC[SiteDuplicateProps] = js.native
  
  trait SiteDuplicateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SiteDuplicateProps {
    
    inline def apply(): SiteDuplicateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteDuplicateProps]
    }
    
    extension [Self <: SiteDuplicateProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SiteDuplicateProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSiteDuplicateMod.foo` */
  override def _to: FC[SiteDuplicateProps] = default
}
