package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsReferenceSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ReferenceSmall", JSImport.Default)
  @js.native
  val default: FC[ReferenceSmallProps] = js.native
  
  trait ReferenceSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ReferenceSmallProps {
    
    inline def apply(): ReferenceSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferenceSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ReferenceSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsReferenceSmallMod.foo` */
  override def _to: FC[ReferenceSmallProps] = default
}
