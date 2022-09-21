package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAlignRightSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/AlignRightSmall", JSImport.Default)
  @js.native
  val default: FC[AlignRightSmallProps] = js.native
  
  trait AlignRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignRightSmallProps {
    
    inline def apply(): AlignRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignRightSmallProps]
    }
    
    extension [Self <: AlignRightSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsAlignRightSmallMod.foo` */
  override def _to: FC[AlignRightSmallProps] = default
}
