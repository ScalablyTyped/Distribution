package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullWidthSliderMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/FullWidthSlider", JSImport.Default)
  @js.native
  val default: FC[FullWidthSliderProps] = js.native
  
  trait FullWidthSliderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullWidthSliderProps {
    
    inline def apply(): FullWidthSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullWidthSliderProps]
    }
    
    extension [Self <: FullWidthSliderProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullWidthSliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `fullWidthSliderMod.foo` */
  override def _to: FC[FullWidthSliderProps] = default
}
