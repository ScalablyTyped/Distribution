package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsCropRotateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CropRotateSmall", JSImport.Default)
  @js.native
  val default: FC[CropRotateSmallProps] = js.native
  
  trait CropRotateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CropRotateSmallProps {
    
    inline def apply(): CropRotateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropRotateSmallProps]
    }
    
    extension [Self <: CropRotateSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CropRotateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsCropRotateSmallMod.foo` */
  override def _to: FC[CropRotateSmallProps] = default
}
