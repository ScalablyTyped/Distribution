package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsIntersectSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/IntersectSmall", JSImport.Default)
  @js.native
  val default: FC[IntersectSmallProps] = js.native
  
  trait IntersectSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IntersectSmallProps {
    
    inline def apply(): IntersectSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntersectSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntersectSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IntersectSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsIntersectSmallMod.foo` */
  override def _to: FC[IntersectSmallProps] = default
}
