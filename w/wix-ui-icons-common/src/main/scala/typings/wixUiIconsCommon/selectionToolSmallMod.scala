package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionToolSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SelectionToolSmall", JSImport.Default)
  @js.native
  val default: FC[SelectionToolSmallProps] = js.native
  
  trait SelectionToolSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SelectionToolSmallProps {
    
    inline def apply(): SelectionToolSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionToolSmallProps]
    }
    
    extension [Self <: SelectionToolSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SelectionToolSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectionToolSmallMod.foo` */
  override def _to: FC[SelectionToolSmallProps] = default
}
