package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsHeartMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Heart", JSImport.Default)
  @js.native
  val default: FC[HeartProps] = js.native
  
  trait HeartProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HeartProps {
    
    inline def apply(): HeartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeartProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HeartProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsHeartMod.foo` */
  override def _to: FC[HeartProps] = default
}
