package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibAddSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PenNibAddSmall", JSImport.Default)
  @js.native
  val default: FC[PenNibAddSmallProps] = js.native
  
  trait PenNibAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PenNibAddSmallProps {
    
    inline def apply(): PenNibAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibAddSmallProps]
    }
    
    extension [Self <: PenNibAddSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PenNibAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibAddSmallMod.foo` */
  override def _to: FC[PenNibAddSmallProps] = default
}
