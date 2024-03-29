package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSelectionToolMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SelectionTool", JSImport.Default)
  @js.native
  val default: FC[SelectionToolProps] = js.native
  
  trait SelectionToolProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SelectionToolProps {
    
    inline def apply(): SelectionToolProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionToolProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionToolProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SelectionToolProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSelectionToolMod.foo` */
  override def _to: FC[SelectionToolProps] = default
}
