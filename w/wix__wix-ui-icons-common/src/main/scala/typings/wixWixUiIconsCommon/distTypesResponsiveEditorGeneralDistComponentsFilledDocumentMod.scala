package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsFilledDocumentMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/FilledDocument", JSImport.Default)
  @js.native
  val default: FC[FilledDocumentProps] = js.native
  
  trait FilledDocumentProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FilledDocumentProps {
    
    inline def apply(): FilledDocumentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilledDocumentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilledDocumentProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FilledDocumentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsFilledDocumentMod.foo` */
  override def _to: FC[FilledDocumentProps] = default
}
