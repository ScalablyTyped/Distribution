package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTaskCompleteMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/TaskComplete", JSImport.Default)
  @js.native
  val default: FC[TaskCompleteProps] = js.native
  
  trait TaskCompleteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TaskCompleteProps {
    
    inline def apply(): TaskCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskCompleteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskCompleteProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TaskCompleteProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTaskCompleteMod.foo` */
  override def _to: FC[TaskCompleteProps] = default
}
