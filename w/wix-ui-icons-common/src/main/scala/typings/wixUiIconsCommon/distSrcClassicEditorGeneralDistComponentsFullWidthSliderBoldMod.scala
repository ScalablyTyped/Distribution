package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsFullWidthSliderBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/FullWidthSliderBold", JSImport.Default)
  @js.native
  val default: FC[FullWidthSliderBoldProps] = js.native
  
  trait FullWidthSliderBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullWidthSliderBoldProps {
    
    inline def apply(): FullWidthSliderBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullWidthSliderBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullWidthSliderBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullWidthSliderBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsFullWidthSliderBoldMod.foo` */
  override def _to: FC[FullWidthSliderBoldProps] = default
}
