package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalRatioMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HorizontalRatio", JSImport.Default)
  @js.native
  val default: FC[HorizontalRatioProps] = js.native
  
  trait HorizontalRatioProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalRatioProps {
    
    inline def apply(): HorizontalRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioProps]
    }
    
    extension [Self <: HorizontalRatioProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalRatioProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalRatioMod.foo` */
  override def _to: FC[HorizontalRatioProps] = default
}
