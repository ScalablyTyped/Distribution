package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsRadioButtonMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/RadioButton", JSImport.Default)
  @js.native
  val default: FC[RadioButtonProps] = js.native
  
  trait RadioButtonProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonProps {
    
    inline def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RadioButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsRadioButtonMod.foo` */
  override def _to: FC[RadioButtonProps] = default
}
