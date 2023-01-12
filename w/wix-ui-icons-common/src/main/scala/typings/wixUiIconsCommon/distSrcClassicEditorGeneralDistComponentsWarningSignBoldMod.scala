package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsWarningSignBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/WarningSignBold", JSImport.Default)
  @js.native
  val default: FC[WarningSignBoldProps] = js.native
  
  trait WarningSignBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WarningSignBoldProps {
    
    inline def apply(): WarningSignBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningSignBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WarningSignBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WarningSignBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsWarningSignBoldMod.foo` */
  override def _to: FC[WarningSignBoldProps] = default
}
