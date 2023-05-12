package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsJustifyVerticalBottomBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/JustifyVerticalBottomBold", JSImport.Default)
  @js.native
  val default: FC[JustifyVerticalBottomBoldProps] = js.native
  
  trait JustifyVerticalBottomBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object JustifyVerticalBottomBoldProps {
    
    inline def apply(): JustifyVerticalBottomBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JustifyVerticalBottomBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JustifyVerticalBottomBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[JustifyVerticalBottomBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsJustifyVerticalBottomBoldMod.foo` */
  override def _to: FC[JustifyVerticalBottomBoldProps] = default
}
