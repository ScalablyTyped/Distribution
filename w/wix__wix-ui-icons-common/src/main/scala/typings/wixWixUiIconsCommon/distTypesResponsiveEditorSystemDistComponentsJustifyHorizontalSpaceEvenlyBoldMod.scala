package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorSystemDistComponentsJustifyHorizontalSpaceEvenlyBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/system/dist/components/JustifyHorizontalSpaceEvenlyBold", JSImport.Default)
  @js.native
  val default: FC[JustifyHorizontalSpaceEvenlyBoldProps] = js.native
  
  trait JustifyHorizontalSpaceEvenlyBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object JustifyHorizontalSpaceEvenlyBoldProps {
    
    inline def apply(): JustifyHorizontalSpaceEvenlyBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JustifyHorizontalSpaceEvenlyBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JustifyHorizontalSpaceEvenlyBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[JustifyHorizontalSpaceEvenlyBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorSystemDistComponentsJustifyHorizontalSpaceEvenlyBoldMod.foo` */
  override def _to: FC[JustifyHorizontalSpaceEvenlyBoldProps] = default
}
