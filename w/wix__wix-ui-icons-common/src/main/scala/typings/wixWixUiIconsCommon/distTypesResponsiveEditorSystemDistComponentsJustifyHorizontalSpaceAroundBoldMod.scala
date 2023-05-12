package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsJustifyHorizontalSpaceAroundBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/JustifyHorizontalSpaceAroundBold", JSImport.Default)
  @js.native
  val default: FC[JustifyHorizontalSpaceAroundBoldProps] = js.native
  
  trait JustifyHorizontalSpaceAroundBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object JustifyHorizontalSpaceAroundBoldProps {
    
    inline def apply(): JustifyHorizontalSpaceAroundBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JustifyHorizontalSpaceAroundBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JustifyHorizontalSpaceAroundBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[JustifyHorizontalSpaceAroundBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsJustifyHorizontalSpaceAroundBoldMod.foo` */
  override def _to: FC[JustifyHorizontalSpaceAroundBoldProps] = default
}
