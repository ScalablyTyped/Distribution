package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsAddRowTopMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/AddRowTop", JSImport.Default)
  @js.native
  val default: FC[AddRowTopProps] = js.native
  
  trait AddRowTopProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddRowTopProps {
    
    inline def apply(): AddRowTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddRowTopProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddRowTopProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddRowTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsAddRowTopMod.foo` */
  override def _to: FC[AddRowTopProps] = default
}
