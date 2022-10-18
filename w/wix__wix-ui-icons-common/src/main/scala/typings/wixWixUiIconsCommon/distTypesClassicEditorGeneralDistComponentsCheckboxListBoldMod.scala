package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsCheckboxListBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/CheckboxListBold", JSImport.Default)
  @js.native
  val default: FC[CheckboxListBoldProps] = js.native
  
  trait CheckboxListBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CheckboxListBoldProps {
    
    inline def apply(): CheckboxListBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxListBoldProps]
    }
    
    extension [Self <: CheckboxListBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CheckboxListBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsCheckboxListBoldMod.foo` */
  override def _to: FC[CheckboxListBoldProps] = default
}
