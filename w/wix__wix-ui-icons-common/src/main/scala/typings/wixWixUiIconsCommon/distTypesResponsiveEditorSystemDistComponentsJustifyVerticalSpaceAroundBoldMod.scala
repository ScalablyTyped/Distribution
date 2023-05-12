package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsJustifyVerticalSpaceAroundBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/JustifyVerticalSpaceAroundBold", JSImport.Default)
  @js.native
  val default: FC[JustifyVerticalSpaceAroundBoldProps] = js.native
  
  trait JustifyVerticalSpaceAroundBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object JustifyVerticalSpaceAroundBoldProps {
    
    inline def apply(): JustifyVerticalSpaceAroundBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JustifyVerticalSpaceAroundBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JustifyVerticalSpaceAroundBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[JustifyVerticalSpaceAroundBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsJustifyVerticalSpaceAroundBoldMod.foo` */
  override def _to: FC[JustifyVerticalSpaceAroundBoldProps] = default
}
