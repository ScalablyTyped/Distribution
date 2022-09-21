package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checklistMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Checklist", JSImport.Default)
  @js.native
  val default: FC[ChecklistProps] = js.native
  
  trait ChecklistProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChecklistProps {
    
    inline def apply(): ChecklistProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChecklistProps]
    }
    
    extension [Self <: ChecklistProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChecklistProps]
  
  /* This means you don't have to write `default`, but can instead just say `checklistMod.foo` */
  override def _to: FC[ChecklistProps] = default
}
