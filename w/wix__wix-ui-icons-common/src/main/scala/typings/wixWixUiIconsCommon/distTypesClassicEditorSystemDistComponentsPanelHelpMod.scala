package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsPanelHelpMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/PanelHelp", JSImport.Default)
  @js.native
  val default: FC[PanelHelpProps] = js.native
  
  trait PanelHelpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PanelHelpProps {
    
    inline def apply(): PanelHelpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelHelpProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelHelpProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PanelHelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsPanelHelpMod.foo` */
  override def _to: FC[PanelHelpProps] = default
}
