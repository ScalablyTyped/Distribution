package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PenNibSmall", JSImport.Default)
  @js.native
  val default: FC[PenNibSmallProps] = js.native
  
  trait PenNibSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PenNibSmallProps {
    
    inline def apply(): PenNibSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibSmallProps]
    }
    
    extension [Self <: PenNibSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PenNibSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibSmallMod.foo` */
  override def _to: FC[PenNibSmallProps] = default
}
