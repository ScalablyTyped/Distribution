package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTaskAddMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TaskAdd", JSImport.Default)
  @js.native
  val default: FC[TaskAddProps] = js.native
  
  trait TaskAddProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TaskAddProps {
    
    inline def apply(): TaskAddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskAddProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskAddProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TaskAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTaskAddMod.foo` */
  override def _to: FC[TaskAddProps] = default
}
