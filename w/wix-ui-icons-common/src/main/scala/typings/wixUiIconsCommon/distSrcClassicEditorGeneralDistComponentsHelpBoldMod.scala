package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsHelpBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/HelpBold", JSImport.Default)
  @js.native
  val default: FC[HelpBoldProps] = js.native
  
  trait HelpBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HelpBoldProps {
    
    inline def apply(): HelpBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HelpBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsHelpBoldMod.foo` */
  override def _to: FC[HelpBoldProps] = default
}
