package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clappingXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/ClappingXSmall", JSImport.Default)
  @js.native
  val default: FC[ClappingXSmallProps] = js.native
  
  trait ClappingXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ClappingXSmallProps {
    
    inline def apply(): ClappingXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClappingXSmallProps]
    }
    
    extension [Self <: ClappingXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ClappingXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `clappingXSmallMod.foo` */
  override def _to: FC[ClappingXSmallProps] = default
}
