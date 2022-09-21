package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignCenterVerticallySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignCenterVerticallySmall", JSImport.Default)
  @js.native
  val default: FC[AlignCenterVerticallySmallProps] = js.native
  
  trait AlignCenterVerticallySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignCenterVerticallySmallProps {
    
    inline def apply(): AlignCenterVerticallySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterVerticallySmallProps]
    }
    
    extension [Self <: AlignCenterVerticallySmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignCenterVerticallySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignCenterVerticallySmallMod.foo` */
  override def _to: FC[AlignCenterVerticallySmallProps] = default
}
