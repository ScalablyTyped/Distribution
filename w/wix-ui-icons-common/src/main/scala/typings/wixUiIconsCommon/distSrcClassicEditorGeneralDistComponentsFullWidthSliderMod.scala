package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsFullWidthSliderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/FullWidthSlider", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullWidthSliderProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullWidthSliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsFullWidthSliderMod.foo` */
  override def _to: FC[FullWidthSliderProps] = default
}
