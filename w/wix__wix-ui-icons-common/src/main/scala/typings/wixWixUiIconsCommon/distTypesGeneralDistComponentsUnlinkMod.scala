package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUnlinkMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Unlink", JSImport.Default)
  @js.native
  val default: FC[UnlinkProps] = js.native
  
  trait UnlinkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnlinkProps {
    
    inline def apply(): UnlinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlinkProps]
    }
    
    extension [Self <: UnlinkProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnlinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUnlinkMod.foo` */
  override def _to: FC[UnlinkProps] = default
}
