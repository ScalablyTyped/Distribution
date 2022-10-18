package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsUnarchiveSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/UnarchiveSmall", JSImport.Default)
  @js.native
  val default: FC[UnarchiveSmallProps] = js.native
  
  trait UnarchiveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UnarchiveSmallProps {
    
    inline def apply(): UnarchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnarchiveSmallProps]
    }
    
    extension [Self <: UnarchiveSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UnarchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsUnarchiveSmallMod.foo` */
  override def _to: FC[UnarchiveSmallProps] = default
}
